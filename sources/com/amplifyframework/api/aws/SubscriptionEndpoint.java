package com.amplifyframework.api.aws;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.SubscriptionEndpoint;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.UserAgent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.okinc.requests.ProtocolConstants;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
final class SubscriptionEndpoint {
    private static final int CONNECTION_ACKNOWLEDGEMENT_TIMEOUT = 30;
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.API, "amplify:aws-api");
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final String UNAUTHORIZED_EXCEPTION = "UnauthorizedException";
    private final ApiConfiguration apiConfiguration;
    private String apiName;
    private final SubscriptionAuthorizer authorizer;
    private final OkHttpClient okHttpClient;
    private final Set<String> pendingSubscriptionIds;
    private final GraphQLResponse.Factory responseFactory;
    private final Map<String, Subscription<?>> subscriptions;
    private final TimeoutWatchdog timeoutWatchdog;
    private WebSocket webSocket;
    private AmplifyWebSocketListener webSocketListener;
    private final Object webSocketLock = new Object();

    public SubscriptionEndpoint(@NonNull ApiConfiguration apiConfiguration, @Nullable OkHttpConfigurator okHttpConfigurator, @NonNull GraphQLResponse.Factory factory, @NonNull SubscriptionAuthorizer subscriptionAuthorizer, @Nullable String str) {
        Objects.requireNonNull(apiConfiguration);
        this.apiConfiguration = apiConfiguration;
        this.subscriptions = new ConcurrentHashMap();
        Objects.requireNonNull(factory);
        this.responseFactory = factory;
        Objects.requireNonNull(subscriptionAuthorizer);
        this.authorizer = subscriptionAuthorizer;
        this.timeoutWatchdog = new TimeoutWatchdog();
        this.pendingSubscriptionIds = Collections.synchronizedSet(new HashSet());
        this.apiName = str;
        OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().retryOnConnectionFailure(true);
        if (okHttpConfigurator != null) {
            okHttpConfigurator.applyConfiguration(builderRetryOnConnectionFailure);
        }
        this.okHttpClient = builderRetryOnConnectionFailure.build();
    }

    public <T> void requestSubscription(@NonNull GraphQLRequest<T> graphQLRequest, @NonNull AuthorizationType authorizationType, @NonNull Consumer<String> consumer, @NonNull Consumer<GraphQLResponse<T>> consumer2, @NonNull Consumer<ApiException> consumer3, @NonNull Action action) {
        Objects.requireNonNull(graphQLRequest);
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer2);
        Objects.requireNonNull(consumer3);
        Objects.requireNonNull(action);
        String string = UUID.randomUUID().toString();
        synchronized (this.webSocketLock) {
            AmplifyWebSocketListener amplifyWebSocketListener = this.webSocketListener;
            if (amplifyWebSocketListener == null || amplifyWebSocketListener.isDisconnectedState()) {
                this.webSocketListener = new AmplifyWebSocketListener(this);
                try {
                    this.webSocket = this.okHttpClient.newWebSocket(new Request.Builder().url(buildConnectionRequestUrl(authorizationType)).addHeader(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, "graphql-ws").header("User-Agent", UserAgent.string()).build(), this.webSocketListener);
                } catch (ApiException e) {
                    consumer3.accept(e);
                    return;
                }
            }
            this.pendingSubscriptionIds.add(string);
            AmplifyWebSocketListener amplifyWebSocketListener2 = this.webSocketListener;
            WebSocket webSocket = this.webSocket;
            Connection connectionWaitForConnectionReady = amplifyWebSocketListener2.waitForConnectionReady();
            if (connectionWaitForConnectionReady.hasFailure() && this.pendingSubscriptionIds.remove(string)) {
                consumer3.accept(new ApiException(connectionWaitForConnectionReady.getFailureReason(), "Sorry, we don't have a suggested fix for this error yet."));
                return;
            }
            try {
                webSocket.send(new JSONObject().put("id", string).put("type", TtmlNode.START).put("payload", new JSONObject().put("data", graphQLRequest.getContent()).put("extensions", new JSONObject().put("authorization", this.authorizer.createHeadersForSubscription(graphQLRequest, authorizationType)))).toString());
                Subscription<?> subscription = new Subscription<>(consumer2, consumer3, action, this.responseFactory, graphQLRequest.getResponseType(), graphQLRequest, this.apiName);
                this.subscriptions.put(string, subscription);
                if (subscription.awaitSubscriptionReady()) {
                    this.pendingSubscriptionIds.remove(string);
                    consumer.accept(string);
                }
            } catch (ApiException | JSONException e2) {
                if (this.pendingSubscriptionIds.remove(string)) {
                    if (e2 instanceof ApiException.ApiAuthException) {
                        consumer3.accept((ApiException.ApiAuthException) e2);
                    } else {
                        consumer3.accept(new ApiException("Failed to construct subscription registration message.", e2, "Sorry, we don't have a suggested fix for this error yet."));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionAcknowledged(String str) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription != null && this.pendingSubscriptionIds.remove(str)) {
            subscription.acknowledgeSubscriptionReady();
            return;
        }
        throw new ApiException("Acknowledgement for unknown subscription: " + str, "Sorry, we don't have a suggested fix for this error yet.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionFailure(String str) {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription == null || !this.pendingSubscriptionIds.remove(str)) {
            return;
        }
        subscription.acknowledgeSubscriptionFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAllSubscriptionsCompleted() {
        Iterator it = new HashSet(this.subscriptions.values()).iterator();
        while (it.hasNext()) {
            ((Subscription) it.next()).dispatchCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionCompleted(String str) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription == null) {
            throw new ApiException("Got subscription completion for unknown subscription:" + str, "Sorry, we don't have a suggested fix for this error yet.");
        }
        subscription.dispatchCompleted();
        subscription.acknowledgeSubscriptionCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyError(Throwable th) {
        Iterator it = new HashSet(this.subscriptions.values()).iterator();
        while (it.hasNext()) {
            ((Subscription) it.next()).dispatchError(new ApiException("Subscription failed.", th, "Check your Internet connection. Is your device online?"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionData(String str, String str2) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription == null) {
            throw new ApiException("Got subscription data for unknown subscription ID: " + str, "Sorry, we don't have a suggested fix for this error yet.");
        }
        subscription.dispatchNextMessage(str2);
    }

    public void releaseSubscription(String str) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        boolean zRemove = this.pendingSubscriptionIds.remove(str);
        if (subscription == null && !zRemove) {
            throw new ApiException("No existing subscription with the given id.", "Sorry, we don't have a suggested fix for this error yet.");
        }
        AmplifyWebSocketListener amplifyWebSocketListener = this.webSocketListener;
        if (!zRemove && amplifyWebSocketListener != null && !amplifyWebSocketListener.isDisconnectedState()) {
            try {
                this.webSocket.send(new JSONObject().put("type", "stop").put("id", str).toString());
                subscription.awaitSubscriptionCompleted();
            } catch (JSONException e) {
                throw new ApiException("Failed to construct subscription release message.", e, "Sorry, we don't have a suggested fix for this error yet.");
            }
        }
        synchronized (this.webSocketLock) {
            this.subscriptions.remove(str);
            if (this.subscriptions.isEmpty() && this.pendingSubscriptionIds.isEmpty()) {
                LOG.info("No more active subscriptions. Closing web socket.");
                this.timeoutWatchdog.stop();
                this.webSocket.close(1000, "No active subscriptions");
                this.webSocketListener = null;
            }
        }
    }

    private String buildConnectionRequestUrl(AuthorizationType authorizationType) throws ApiException {
        URL url;
        byte[] bytes = this.authorizer.createHeadersForConnection(authorizationType).toString().getBytes();
        try {
            url = new URL(this.apiConfiguration.getEndpoint());
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            throw new ApiException("Malformed API Url: " + this.apiConfiguration.getEndpoint(), "Verify that GraphQL endpoint is properly formatted.");
        }
        DomainType domainTypeFrom = DomainType.from(this.apiConfiguration.getEndpoint());
        String host = url.getHost();
        if (domainTypeFrom == DomainType.STANDARD) {
            host = host.replace("appsync-api", "appsync-realtime-api");
        }
        String path = url.getPath();
        if (domainTypeFrom == DomainType.CUSTOM) {
            path = path + "/realtime";
        }
        return new Uri.Builder().scheme(ProtocolConstants.WSS).authority(host).path(path).appendQueryParameter("header", Base64.encodeToString(bytes, 0)).appendQueryParameter("payload", "e30=").build().toString();
    }

    public static final class Subscription<T> {
        private static final int ACKNOWLEDGEMENT_TIMEOUT = 10;
        private String apiName;
        private final Consumer<GraphQLResponse<T>> onNextItem;
        private final Action onSubscriptionComplete;
        private final Consumer<ApiException> onSubscriptionError;
        private final GraphQLRequest<T> request;
        private final GraphQLResponse.Factory responseFactory;
        private final Type responseType;
        private final CountDownLatch subscriptionReadyAcknowledgment = new CountDownLatch(1);
        private final CountDownLatch subscriptionCompletionAcknowledgement = new CountDownLatch(1);
        private boolean failed = false;

        public Subscription(Consumer<GraphQLResponse<T>> consumer, Consumer<ApiException> consumer2, Action action, GraphQLResponse.Factory factory, Type type, GraphQLRequest<T> graphQLRequest, String str) {
            this.onNextItem = consumer;
            this.onSubscriptionError = consumer2;
            this.onSubscriptionComplete = action;
            this.responseFactory = factory;
            this.responseType = type;
            this.request = graphQLRequest;
            this.apiName = str;
        }

        public void acknowledgeSubscriptionReady() {
            this.subscriptionReadyAcknowledgment.countDown();
        }

        public void acknowledgeSubscriptionFailure() {
            this.failed = true;
            this.subscriptionReadyAcknowledgment.countDown();
        }

        public boolean awaitSubscriptionReady() {
            try {
                if (this.subscriptionReadyAcknowledgment.await(10L, TimeUnit.SECONDS)) {
                    return !this.failed;
                }
                dispatchError(new ApiException("Timed out waiting for subscription start_ack.", "Check your Internet connection. Is your device online?"));
                return false;
            } catch (InterruptedException e) {
                SubscriptionEndpoint.LOG.warn("Thread interrupted awaiting subscription acknowledgement.", e);
                return false;
            }
        }

        public void acknowledgeSubscriptionCompleted() {
            this.subscriptionCompletionAcknowledgement.countDown();
        }

        public void awaitSubscriptionCompleted() {
            try {
                if (this.subscriptionCompletionAcknowledgement.await(10L, TimeUnit.SECONDS)) {
                    return;
                }
                dispatchError(new ApiException("Subscription completion not acknowledged.", "Sorry, we don't have a suggested fix for this error yet."));
            } catch (InterruptedException e) {
                dispatchError(new ApiException("Thread interrupted awaiting subscription completion.", e, "Sorry, we don't have a suggested fix for this error yet."));
            }
        }

        private GraphQLResponse<T> buildResponse(String str) throws ApiException {
            GraphQLResponse.Factory factory = this.responseFactory;
            if (!(factory instanceof GsonGraphQLResponseFactory)) {
                throw new ApiException("Amplify encountered an error while deserializing an object. GraphQLResponse.Factory was not of type GsonGraphQLResponseFactory", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
            }
            try {
                return ((GsonGraphQLResponseFactory) factory).buildResponse(this.request, str, this.apiName);
            } catch (ClassCastException unused) {
                throw new ApiException("Amplify encountered an error while deserializing an object", "Sorry, we don't have a suggested fix for this error yet.");
            }
        }

        public void dispatchNextMessage(String str) {
            try {
                this.onNextItem.accept(buildResponse(str));
            } catch (ApiException e) {
                dispatchError(e);
            }
        }

        public void dispatchError(ApiException apiException) {
            this.onSubscriptionError.accept(apiException);
        }

        public void dispatchCompleted() {
            this.onSubscriptionComplete.call();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Subscription.class != obj.getClass()) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            if (ObjectsCompat.equals(this.onNextItem, subscription.onNextItem) && ObjectsCompat.equals(this.onSubscriptionError, subscription.onSubscriptionError) && ObjectsCompat.equals(this.onSubscriptionComplete, subscription.onSubscriptionComplete) && ObjectsCompat.equals(this.responseFactory, subscription.responseFactory) && ObjectsCompat.equals(this.responseType, subscription.responseType) && ObjectsCompat.equals(this.subscriptionReadyAcknowledgment, subscription.subscriptionReadyAcknowledgment)) {
                return ObjectsCompat.equals(this.subscriptionCompletionAcknowledgement, subscription.subscriptionCompletionAcknowledgement);
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.onNextItem.hashCode();
            int iHashCode2 = this.onSubscriptionError.hashCode();
            int iHashCode3 = this.onSubscriptionComplete.hashCode();
            int iHashCode4 = this.responseFactory.hashCode();
            int iHashCode5 = this.responseType.hashCode();
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + this.subscriptionReadyAcknowledgment.hashCode()) * 31) + this.subscriptionCompletionAcknowledgement.hashCode();
        }
    }

    public final class AmplifyWebSocketListener extends WebSocketListener {
        private final CountDownLatch connectionResponse;
        private final AtomicReference<EndpointStatus> endpointStatus;

        public AmplifyWebSocketListener(SubscriptionEndpoint subscriptionEndpoint) {
            this(new CountDownLatch(1));
        }

        public AmplifyWebSocketListener(CountDownLatch countDownLatch) {
            this.connectionResponse = countDownLatch;
            this.endpointStatus = new AtomicReference<>(EndpointStatus.DISCONNECTED);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(@NonNull WebSocket webSocket, @NonNull Response response) {
            sendConnectionInit(webSocket);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(@NonNull WebSocket webSocket, @NonNull String str) {
            try {
                processJsonMessage(webSocket, str);
            } catch (ApiException e) {
                SubscriptionEndpoint.this.notifyError(e);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(@NonNull WebSocket webSocket, int i, @NonNull String str) {
            SubscriptionEndpoint.this.notifyAllSubscriptionsCompleted();
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(@NonNull WebSocket webSocket, @NonNull Throwable th, Response response) {
            SubscriptionEndpoint.LOG.warn("Websocket connection failed.", th);
            this.endpointStatus.set(EndpointStatus.CONNECTION_FAILED);
            webSocket.cancel();
            this.connectionResponse.countDown();
            SubscriptionEndpoint.this.notifyError(th);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(@NonNull WebSocket webSocket, int i, @NonNull String str) {
            super.onClosed(webSocket, i, str);
            this.endpointStatus.set(EndpointStatus.DISCONNECTED);
        }

        public boolean isDisconnectedState() {
            return this.endpointStatus.get().isDisconnectedState();
        }

        public Connection waitForConnectionReady() {
            try {
                if (!this.connectionResponse.await(30L, TimeUnit.SECONDS)) {
                    SubscriptionEndpoint.LOG.warn("Timed out waiting for connection acknowledgement.");
                    return new Connection("Timed out waiting for connection acknowledgement.");
                }
                SubscriptionEndpoint.LOG.debug("Current endpoint status: " + this.endpointStatus.get());
                if (EndpointStatus.CONNECTION_FAILED.equals(this.endpointStatus.get())) {
                    return new Connection("Connection failed.");
                }
                return new Connection();
            } catch (InterruptedException unused) {
                SubscriptionEndpoint.LOG.warn("Thread interrupted waiting for connection acknowledgement");
                return new Connection("Thread interrupted waiting for connection acknowledgement");
            }
        }

        private void sendConnectionInit(WebSocket webSocket) {
            try {
                webSocket.send(new JSONObject().put("type", "connection_init").toString());
            } catch (JSONException e) {
                SubscriptionEndpoint.this.notifyError(e);
            }
        }

        private void processJsonMessage(final WebSocket webSocket, String str) throws ApiException {
            try {
                JSONObject jSONObject = new JSONObject(str);
                SubscriptionMessageType subscriptionMessageTypeFrom = SubscriptionMessageType.from(jSONObject.getString("type"));
                switch (AnonymousClass1.$SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[subscriptionMessageTypeFrom.ordinal()]) {
                    case 1:
                        SubscriptionEndpoint.this.timeoutWatchdog.start(new Runnable() { // from class: com.amplifyframework.api.aws.SubscriptionEndpoint$AmplifyWebSocketListener$$ExternalSyntheticLambda0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                SubscriptionEndpoint.AmplifyWebSocketListener.lambda$processJsonMessage$0(webSocket);
                            }
                        }, Integer.parseInt(jSONObject.getJSONObject("payload").getString("connectionTimeoutMs")));
                        this.endpointStatus.set(EndpointStatus.CONNECTED);
                        this.connectionResponse.countDown();
                        return;
                    case 2:
                        this.endpointStatus.set(EndpointStatus.CONNECTION_FAILED);
                        SubscriptionEndpoint.LOG.warn("Websocket listener received a CONNECTION_ERROR event. " + str);
                        this.connectionResponse.countDown();
                        return;
                    case 3:
                        SubscriptionEndpoint.this.notifySubscriptionAcknowledged(jSONObject.getString("id"));
                        return;
                    case 4:
                        SubscriptionEndpoint.this.notifySubscriptionCompleted(jSONObject.getString("id"));
                        return;
                    case 5:
                        SubscriptionEndpoint.this.timeoutWatchdog.reset();
                        return;
                    case 6:
                        SubscriptionEndpoint.this.notifySubscriptionFailure(jSONObject.getString("id"));
                        SubscriptionEndpoint.this.notifySubscriptionData(jSONObject.getString("id"), jSONObject.getString("payload"));
                        return;
                    case 7:
                        SubscriptionEndpoint.this.notifySubscriptionData(jSONObject.getString("id"), jSONObject.getString("payload"));
                        return;
                    default:
                        SubscriptionEndpoint.this.notifyError(new ApiException("Got unknown message type: " + subscriptionMessageTypeFrom, "Sorry, we don't have a suggested fix for this error yet."));
                        return;
                }
            } catch (JSONException e) {
                throw new ApiException("Error processing Json message in subscription endpoint.", e, "Sorry, we don't have a suggested fix for this error yet.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$processJsonMessage$0(WebSocket webSocket) {
            SubscriptionEndpoint.LOG.warn("WebSocket closed due to timeout.");
            webSocket.close(1000, "WebSocket closed due to timeout.");
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.SubscriptionEndpoint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType;

        static {
            int[] iArr = new int[SubscriptionMessageType.values().length];
            $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType = iArr;
            try {
                iArr[SubscriptionMessageType.CONNECTION_ACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.CONNECTION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_ACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.CONNECTION_KEEP_ALIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Connection {
        private final String failureReason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getFailureReason() {
            return this.failureReason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean hasFailure() {
            return this.failureReason != null;
        }

        public Connection() {
            this.failureReason = null;
        }

        public Connection(String str) {
            this.failureReason = str;
        }
    }

    public enum EndpointStatus {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        CONNECTION_FAILED;

        public boolean isDisconnectedState() {
            return equals(DISCONNECTED) || equals(CONNECTION_FAILED);
        }
    }
}
