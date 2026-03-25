package com.amplifyframework.predictions.aws.http;

import android.graphics.RectF;
import android.os.Build;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.exceptions.AccessDeniedException;
import com.amplifyframework.predictions.aws.exceptions.FaceLivenessSessionNotFoundException;
import com.amplifyframework.predictions.aws.http.LivenessWebSocket;
import com.amplifyframework.predictions.aws.models.liveness.BoundingBox;
import com.amplifyframework.predictions.aws.models.liveness.ClientChallenge;
import com.amplifyframework.predictions.aws.models.liveness.ClientSessionInformationEvent;
import com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed;
import com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightClientChallenge;
import com.amplifyframework.predictions.aws.models.liveness.FreshnessColor;
import com.amplifyframework.predictions.aws.models.liveness.InitialFace;
import com.amplifyframework.predictions.aws.models.liveness.InvalidSignatureException;
import com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream;
import com.amplifyframework.predictions.aws.models.liveness.SessionInformation;
import com.amplifyframework.predictions.aws.models.liveness.TargetFace;
import com.amplifyframework.predictions.aws.models.liveness.VideoEvent;
import com.amplifyframework.predictions.models.FaceLivenessSessionInformation;
import com.amplifyframework.util.UserAgent;
import com.google.android.exoplayer2.C;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C58108yv;
import o.C59449zhJ;
import o.C59454zhO;
import o.InterfaceC52697wV;
import o.InterfaceC52805wZ;
import o.InterfaceC56445yFq;
import o.InterfaceC57843yq;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessWebSocket {
    private static final int FOUR_MINUTES = 240000;
    private static final Logger LOG;
    private static final int NORMAL_SOCKET_CLOSURE_STATUS_CODE = 1000;
    private final String challengeId;
    private boolean clientStoppedSession;
    private InterfaceC52697wV credentials;
    private final InterfaceC52805wZ credentialsProvider;
    private final String endpoint;
    private long faceDetectedStart;
    private BoundingBox initialDetectedFace;
    private final Json json;
    private final String livenessVersion;
    private final boolean needProxy;
    private final Consumer<OkHttpClient.Builder> okhttpClientBuilderInvoke;
    private final Action onComplete;
    private final Consumer<PredictionsException> onErrorReceived;
    private final Consumer<SessionInformation> onSessionInformationReceived;
    private final String proxyPath;
    private final String proxyTarget;
    private ConnectionState reconnectState;
    private final String region;
    private final Channel<Job> sendEventQueueChannel;
    private final CoroutineScope sendEventScope;
    private final FaceLivenessSessionInformation sessionInformation;
    private final AWSV4Signer signer;
    private long timeDiffOffsetInMillis;
    private long videoEndTimestamp;
    private long videoStartTimestamp;
    private WebSocket webSocket;
    private PredictionsException webSocketError;
    private WebSocketListener webSocketListener;
    public static final Companion Companion = new Companion(null);
    private static final String datePattern = "EEE, d MMM yyyy HH:mm:ss z";

    public static /* synthetic */ void getWebSocket$aws_predictions_release$annotations() {
    }

    public static /* synthetic */ void getWebSocketError$aws_predictions_release$annotations() {
    }

    public static /* synthetic */ void getWebSocketListener$aws_predictions_release$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long adjustedDate(long j) {
        return j + this.timeDiffOffsetInMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallengeId$aws_predictions_release() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClientStoppedSession$aws_predictions_release() {
        return this.clientStoppedSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC52805wZ getCredentialsProvider() {
        return this.credentialsProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Json getJson() {
        return this.json;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLivenessVersion() {
        return this.livenessVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedProxy() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Consumer<OkHttpClient.Builder> getOkhttpClientBuilderInvoke() {
        return this.okhttpClientBuilderInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Action getOnComplete() {
        return this.onComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Consumer<PredictionsException> getOnErrorReceived() {
        return this.onErrorReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Consumer<SessionInformation> getOnSessionInformationReceived() {
        return this.onSessionInformationReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProxyPath() {
        return this.proxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProxyTarget() {
        return this.proxyTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConnectionState getReconnectState$aws_predictions_release() {
        return this.reconnectState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegion() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceLivenessSessionInformation getSessionInformation() {
        return this.sessionInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimeDiffOffsetInMillis$aws_predictions_release() {
        return this.timeDiffOffsetInMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebSocket getWebSocket$aws_predictions_release() {
        return this.webSocket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PredictionsException getWebSocketError$aws_predictions_release() {
        return this.webSocketError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebSocketListener getWebSocketListener$aws_predictions_release() {
        return this.webSocketListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientStoppedSession$aws_predictions_release(boolean z) {
        this.clientStoppedSession = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReconnectState$aws_predictions_release(@NotNull ConnectionState connectionState) {
        Intrinsics.checkNotNullParameter(connectionState, "");
        this.reconnectState = connectionState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeDiffOffsetInMillis$aws_predictions_release(long j) {
        this.timeDiffOffsetInMillis = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebSocket$aws_predictions_release(WebSocket webSocket) {
        this.webSocket = webSocket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebSocketError$aws_predictions_release(PredictionsException predictionsException) {
        this.webSocketError = predictionsException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebSocketListener$aws_predictions_release(@NotNull WebSocketListener webSocketListener) {
        Intrinsics.checkNotNullParameter(webSocketListener, "");
        this.webSocketListener = webSocketListener;
    }

    public LivenessWebSocket(@NotNull InterfaceC52805wZ interfaceC52805wZ, @NotNull String str, @NotNull String str2, @NotNull FaceLivenessSessionInformation faceLivenessSessionInformation, String str3, @NotNull Consumer<SessionInformation> consumer, @NotNull Consumer<PredictionsException> consumer2, @NotNull Action action, Consumer<OkHttpClient.Builder> consumer3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(faceLivenessSessionInformation, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.credentialsProvider = interfaceC52805wZ;
        this.endpoint = str;
        this.region = str2;
        this.sessionInformation = faceLivenessSessionInformation;
        this.livenessVersion = str3;
        this.onSessionInformationReceived = consumer;
        this.onErrorReceived = consumer2;
        this.onComplete = action;
        this.okhttpClientBuilderInvoke = consumer3;
        this.proxyPath = str4;
        this.proxyTarget = str5;
        this.needProxy = z;
        this.signer = new AWSV4Signer();
        this.reconnectState = ConnectionState.NORMAL;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.challengeId = string;
        this.json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amplifyframework.predictions.aws.http.LivenessWebSocket$json$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
                Intrinsics.checkNotNullParameter(jsonBuilder, "");
                jsonBuilder.setIgnoreUnknownKeys(true);
            }
        }, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.sendEventScope = CoroutineScope;
        Channel<Job> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new LivenessWebSocket$sendEventQueueChannel$1$1(channelChannel$default, null), 3, null);
        this.sendEventQueueChannel = channelChannel$default;
        this.webSocketListener = new WebSocketListener() { // from class: com.amplifyframework.predictions.aws.http.LivenessWebSocket$webSocketListener$1
            @Override // okhttp3.WebSocketListener
            public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(response, "");
                LivenessWebSocket.LOG.debug("WebSocket onOpen");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(LivenessWebSocket.Companion.getDatePattern(), Locale.US);
                String strHeader$default = Response.header$default(response, "Date", null, 2, null);
                Date date = strHeader$default != null ? simpleDateFormat.parse(strHeader$default) : null;
                long time = date != null ? date.getTime() - LivenessWebSocket.adjustedDate$default(this.this$0, 0L, 1, null) : 0L;
                super.onOpen(webSocket, response);
                this.this$0.setWebSocket$aws_predictions_release(webSocket);
                if (this.this$0.isTimeDiffSafe(time)) {
                    return;
                }
                LivenessWebSocket.LOG.info("Server reported a time difference between client and server of > 4 minutes");
                this.this$0.setTimeDiffOffsetInMillis$aws_predictions_release(time);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(@NotNull WebSocket webSocket, @NotNull String str6) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(str6, "");
                LivenessWebSocket.LOG.debug("WebSocket onMessage text");
                super.onMessage(webSocket, str6);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString byteString) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(byteString, "");
                LivenessWebSocket.LOG.debug("WebSocket onMessage bytes");
                try {
                    LivenessResponseStream livenessResponseStreamDecode = LivenessEventStream.INSTANCE.decode(byteString, this.this$0.getJson());
                    if (livenessResponseStreamDecode != null) {
                        LivenessWebSocket livenessWebSocket = this.this$0;
                        if (livenessResponseStreamDecode.getServerSessionInformationEvent() != null) {
                            livenessWebSocket.getOnSessionInformationReceived().accept(livenessResponseStreamDecode.getServerSessionInformationEvent().getSessionInformation());
                        } else if (livenessResponseStreamDecode.getDisconnectionEvent() == null) {
                            livenessWebSocket.handleWebSocketError(livenessResponseStreamDecode);
                        } else {
                            WebSocket webSocket$aws_predictions_release = livenessWebSocket.getWebSocket$aws_predictions_release();
                            if (webSocket$aws_predictions_release != null) {
                                webSocket$aws_predictions_release.close(1000, "Liveness flow completed.");
                            }
                        }
                    }
                } catch (Exception unused) {
                    LivenessWebSocket.LOG.debug("WebSocket unable to decode message from server");
                }
                super.onMessage(webSocket, byteString);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(@NotNull WebSocket webSocket, int i, @NotNull String str6) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(str6, "");
                LivenessWebSocket.LOG.debug("WebSocket onClosing");
                super.onClosing(webSocket, i, str6);
                webSocket.close(i, str6);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(@NotNull WebSocket webSocket, int i, @NotNull String str6) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(str6, "");
                LivenessWebSocket.LOG.debug("WebSocket onClosed");
                super.onClosed(webSocket, i, str6);
                if (i != 1000 && !this.this$0.getClientStoppedSession$aws_predictions_release()) {
                    PredictionsException webSocketError$aws_predictions_release = this.this$0.getWebSocketError$aws_predictions_release();
                    if (this.this$0.getReconnectState$aws_predictions_release() == LivenessWebSocket.ConnectionState.NORMAL) {
                        LivenessWebSocket livenessWebSocket = this.this$0;
                        if (!livenessWebSocket.isTimeDiffSafe(livenessWebSocket.getTimeDiffOffsetInMillis$aws_predictions_release()) && webSocketError$aws_predictions_release != null && (webSocketError$aws_predictions_release.getCause() instanceof InvalidSignatureException)) {
                            LivenessWebSocket.LOG.info("The server rejected the connection due to a likely time difference. Attempting reconnect");
                            this.this$0.setReconnectState$aws_predictions_release(LivenessWebSocket.ConnectionState.ATTEMPT_RECONNECT);
                            this.this$0.setWebSocketError$aws_predictions_release(null);
                            this.this$0.start();
                            return;
                        }
                    }
                    if (webSocketError$aws_predictions_release == null) {
                        webSocketError$aws_predictions_release = new PredictionsException("An error occurred during the face liveness check.", str6);
                    }
                    this.this$0.getOnErrorReceived().accept(webSocketError$aws_predictions_release);
                    return;
                }
                this.this$0.getOnComplete().call();
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable th, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(th, "");
                LivenessWebSocket.LOG.debug("WebSocket onFailure");
                super.onFailure(webSocket, th, response);
                if (this.this$0.getClientStoppedSession$aws_predictions_release()) {
                    return;
                }
                PredictionsException webSocketError$aws_predictions_release = this.this$0.getWebSocketError$aws_predictions_release();
                if (webSocketError$aws_predictions_release == null) {
                    webSocketError$aws_predictions_release = new PredictionsException("An unknown error occurred during the Liveness flow.", th, "See attached exception for more details.");
                }
                this.this$0.getOnErrorReceived().accept(webSocketError$aws_predictions_release);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConnectionState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ConnectionState[] $VALUES;
        public static final ConnectionState NORMAL = new ConnectionState("NORMAL", 0);
        public static final ConnectionState ATTEMPT_RECONNECT = new ConnectionState("ATTEMPT_RECONNECT", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ConnectionState[] $values() {
            return new ConnectionState[]{NORMAL, ATTEMPT_RECONNECT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ConnectionState> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ConnectionState valueOf(String str) {
            return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ConnectionState[] values() {
            return (ConnectionState[]) $VALUES.clone();
        }

        private ConnectionState(String str, int i) {
        }

        static {
            ConnectionState[] connectionStateArr$values = $values();
            $VALUES = connectionStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(connectionStateArr$values);
        }
    }

    public final void start() {
        final String userAgent = getUserAgent();
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().addNetworkInterceptor(new Interceptor() { // from class: com.amplifyframework.predictions.aws.http.LivenessWebSocket$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return LivenessWebSocket.start$lambda$1(userAgent, chain);
            }
        });
        Consumer<OkHttpClient.Builder> consumer = this.okhttpClientBuilderInvoke;
        if (consumer != null) {
            consumer.accept(builderAddNetworkInterceptor);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C16711(userAgent, builderAddNetworkInterceptor.build(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response start$lambda$1(String str, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request().newBuilder().header("x-amz-user-agent", str).build());
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.http.LivenessWebSocket$start$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OkHttpClient $okHttpClient;
        final /* synthetic */ String $userAgent;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16711(String str, OkHttpClient okHttpClient, Continuation<? super C16711> continuation) {
            super(2, continuation);
            this.$userAgent = str;
            this.$okHttpClient = okHttpClient;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return LivenessWebSocket.this.new C16711(this.$userAgent, this.$okHttpClient, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC52805wZ credentialsProvider = LivenessWebSocket.this.getCredentialsProvider();
                    InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
                    this.label = 1;
                    obj = credentialsProvider.resolve(interfaceC57843yqCopydefault, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                InterfaceC52697wV interfaceC52697wV = (InterfaceC52697wV) obj;
                LivenessWebSocket.this.credentials = interfaceC52697wV;
                LivenessWebSocket.this.signer.resetPriorSignature();
                AWSV4Signer aWSV4Signer = LivenessWebSocket.this.signer;
                URI uriCreate = URI.create(LivenessWebSocket.this.getEndpoint());
                Intrinsics.checkNotNullExpressionValue(uriCreate, "");
                URI signedUri = aWSV4Signer.getSignedUri(uriCreate, interfaceC52697wV, LivenessWebSocket.this.getRegion(), this.$userAgent, LivenessWebSocket.adjustedDate$default(LivenessWebSocket.this, 0L, 1, null));
                if (signedUri != null) {
                    String strDecode = URLDecoder.decode(signedUri.toString(), C.UTF8_NAME);
                    Intrinsics.copydefault((Object) strDecode);
                    LivenessWebSocket.this.startWebSocket(this.$okHttpClient, C59449zhJ.replace$default(strDecode, " ", LivenessWebSocket.this.signer.getEncodedSpace(), false, 4, (Object) null));
                } else {
                    LivenessWebSocket.this.getOnErrorReceived().accept(new PredictionsException("Failed to create the face liveness endpoint.", "Sorry, we don't have a suggested fix for this error yet."));
                }
            } catch (Exception e) {
                LivenessWebSocket.this.getOnErrorReceived().accept(new PredictionsException("Failed to start the face liveness session.", e, "Sorry, we don't have a suggested fix for this error yet."));
            }
            return Unit.INSTANCE;
        }
    }

    public final String getUserAgent() {
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "");
        String strReplace$default = C59449zhJ.replace$default(str, " ", "_", false, 4, (Object) null);
        String str2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        String strReplace$default2 = C59449zhJ.replace$default(str2, " ", "_", false, 4, (Object) null);
        String str3 = UserAgent.string() + " os/Android/" + Build.VERSION.SDK_INT + " md/device/" + strReplace$default2 + " md/device-manufacturer/" + strReplace$default + " api/rekognitionstreaming/2.14.12";
        String str4 = this.livenessVersion;
        if (str4 != null && !StringsKt__StringsKt.fARcdN((CharSequence) str4)) {
            str3 = str3 + " api/liveness/" + this.livenessVersion;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        String strReplace$default3 = C59449zhJ.replace$default(str3, str, strReplace$default, false, 4, (Object) null);
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return C59449zhJ.replace$default(C59449zhJ.replace$default(strReplace$default3, str2, strReplace$default2, false, 4, (Object) null), Marker.ANY_NON_NULL_MARKER, "_", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startWebSocket(OkHttpClient okHttpClient, String str) {
        if (this.needProxy) {
            str = C59449zhJ.replace$default(str, this.proxyTarget, this.proxyPath, false, 4, (Object) null);
        }
        okHttpClient.newWebSocket(new Request.Builder().url(str).build(), this.webSocketListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebSocketError(LivenessResponseStream livenessResponseStream) {
        PredictionsException predictionsException;
        if (livenessResponseStream.getValidationException() != null) {
            predictionsException = new PredictionsException("An error occurred during the face liveness flow.", livenessResponseStream.getValidationException(), "See attached exception for more details.");
        } else if (livenessResponseStream.getInternalServerException() != null) {
            predictionsException = new PredictionsException("An error occurred during the face liveness flow.", livenessResponseStream.getInternalServerException(), "Retry the face liveness flow.");
        } else if (livenessResponseStream.getThrottlingException() != null) {
            predictionsException = new PredictionsException("Failed since the user made too many requests for a face liveness check.", livenessResponseStream.getThrottlingException(), "Make sure the face liveness requests are controlled and errors are properly handled.");
        } else if (livenessResponseStream.getServiceQuotaExceededException() != null) {
            predictionsException = new PredictionsException("Failed since the user made too many requests for a face liveness check.", livenessResponseStream.getServiceQuotaExceededException(), "Make sure the face liveness requests are controlled and errors are properly handled.");
        } else if (livenessResponseStream.getServiceUnavailableException() != null) {
            predictionsException = new PredictionsException("Service is currently unavailable.", livenessResponseStream.getServiceUnavailableException(), "Retry the face liveness check.");
        } else if (livenessResponseStream.getSessionNotFoundException() != null) {
            predictionsException = new FaceLivenessSessionNotFoundException(null, livenessResponseStream.getSessionNotFoundException(), null, 5, null);
        } else if (livenessResponseStream.getAccessDeniedException() != null) {
            predictionsException = new AccessDeniedException(null, livenessResponseStream.getAccessDeniedException(), null, 5, null);
        } else if (livenessResponseStream.getUnrecognizedClientException() != null) {
            predictionsException = new PredictionsException("Unrecognized client", livenessResponseStream.getUnrecognizedClientException(), "Please check your credentials");
        } else if (livenessResponseStream.getInvalidSignatureException() != null) {
            predictionsException = new PredictionsException("Invalid signature", livenessResponseStream.getInvalidSignatureException(), "Please check your credentials");
        } else {
            predictionsException = new PredictionsException("An unknown error occurred during the Liveness flow.", "Sorry, we don't have a suggested fix for this error yet.");
        }
        this.webSocketError = predictionsException;
        destroy$default(this, 0, 1, null);
    }

    public final void sendInitialFaceDetectedEvent(@NotNull RectF rectF, long j) {
        Intrinsics.checkNotNullParameter(rectF, "");
        this.videoStartTimestamp = adjustedDate(j);
        float videoWidth = rectF.left / this.sessionInformation.getVideoWidth();
        float videoHeight = rectF.top / this.sessionInformation.getVideoHeight();
        this.initialDetectedFace = new BoundingBox(rectF.width() / this.sessionInformation.getVideoWidth(), rectF.height() / this.sessionInformation.getVideoHeight(), videoWidth, videoHeight);
        this.faceDetectedStart = adjustedDate(j);
        String str = this.challengeId;
        BoundingBox boundingBox = this.initialDetectedFace;
        Intrinsics.copydefault(boundingBox);
        sendClientInfoEvent(new ClientSessionInformationEvent(new ClientChallenge(new FaceMovementAndLightClientChallenge(str, Long.valueOf(this.videoStartTimestamp), (Long) null, new InitialFace(boundingBox, this.faceDetectedStart), (TargetFace) null, (ColorDisplayed) null, 52, (DefaultConstructorMarker) null))));
    }

    public final void sendFinalEvent(@NotNull RectF rectF, long j, long j2) {
        Intrinsics.checkNotNullParameter(rectF, "");
        String str = this.challengeId;
        long j3 = this.videoEndTimestamp;
        BoundingBox boundingBox = this.initialDetectedFace;
        Intrinsics.copydefault(boundingBox);
        InitialFace initialFace = new InitialFace(boundingBox, this.faceDetectedStart);
        long jAdjustedDate = adjustedDate(j);
        long jAdjustedDate2 = adjustedDate(j2);
        float videoWidth = rectF.left / this.sessionInformation.getVideoWidth();
        float videoHeight = rectF.top / this.sessionInformation.getVideoHeight();
        sendClientInfoEvent(new ClientSessionInformationEvent(new ClientChallenge(new FaceMovementAndLightClientChallenge(str, (Long) null, Long.valueOf(j3), initialFace, new TargetFace(new BoundingBox(rectF.width() / this.sessionInformation.getVideoWidth(), rectF.height() / this.sessionInformation.getVideoHeight(), videoWidth, videoHeight), jAdjustedDate, jAdjustedDate2), (ColorDisplayed) null, 34, (DefaultConstructorMarker) null))));
    }

    public final void sendColorDisplayedEvent(@NotNull FreshnessColor freshnessColor, @NotNull FreshnessColor freshnessColor2, int i, long j) {
        Intrinsics.checkNotNullParameter(freshnessColor, "");
        Intrinsics.checkNotNullParameter(freshnessColor2, "");
        sendClientInfoEvent(new ClientSessionInformationEvent(new ClientChallenge(new FaceMovementAndLightClientChallenge(this.challengeId, (Long) null, (Long) null, (InitialFace) null, (TargetFace) null, new ColorDisplayed(freshnessColor, freshnessColor2, i, adjustedDate(j)), 30, (DefaultConstructorMarker) null))));
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.http.LivenessWebSocket$sendClientInfoEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClientSessionInformationEvent $clientInfoEvent;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClientSessionInformationEvent clientSessionInformationEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$clientInfoEvent = clientSessionInformationEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return LivenessWebSocket.this.new AnonymousClass1(this.$clientInfoEvent, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC52697wV interfaceC52697wV = LivenessWebSocket.this.credentials;
                if (interfaceC52697wV != null) {
                    ClientSessionInformationEvent clientSessionInformationEvent = this.$clientInfoEvent;
                    LivenessWebSocket livenessWebSocket = LivenessWebSocket.this;
                    Json.Default r2 = Json.Default;
                    r2.getSerializersModule();
                    ByteBuffer byteBufferEncode = LivenessEventStream.INSTANCE.encode(ByteString.Companion.encodeUtf8(r2.encodeToString(ClientSessionInformationEvent.Companion.serializer(), clientSessionInformationEvent)).toByteArray(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(":event-type", "ClientSessionInformationEvent"), C56390yDp.OLrzqt(":message-type", "event"), C56390yDp.OLrzqt(":content-type", "application/json")));
                    Date date = new Date(LivenessWebSocket.adjustedDate$default(livenessWebSocket, 0L, 1, null));
                    AWSV4Signer aWSV4Signer = livenessWebSocket.signer;
                    String region = livenessWebSocket.getRegion();
                    byte[] bArrArray = byteBufferEncode.array();
                    Intrinsics.checkNotNullExpressionValue(bArrArray, "");
                    List listAYXKKw = C59454zhO.AYXKKw((CharSequence) aWSV4Signer.getSignedFrame(region, bArrArray, interfaceC52697wV.copydefault(), new Pair<>(":date", date)), 2);
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
                    Iterator it = listAYXKKw.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C56443yFo.copydefault((byte) Integer.parseInt((String) it.next(), CharsKt__CharJVMKt.checkRadix(16))));
                    }
                    byte[] bArrDbNXlk = CollectionsKt___CollectionsKt.DbNXlk(arrayList);
                    LivenessEventStream livenessEventStream = LivenessEventStream.INSTANCE;
                    byte[] bArrArray2 = byteBufferEncode.array();
                    Intrinsics.checkNotNullExpressionValue(bArrArray2, "");
                    ByteBuffer byteBufferEncode2 = livenessEventStream.encode(bArrArray2, C56424yEw.gEmmrt(C56390yDp.OLrzqt(":date", date), C56390yDp.OLrzqt(":chunk-signature", bArrDbNXlk)));
                    WebSocket webSocket$aws_predictions_release = livenessWebSocket.getWebSocket$aws_predictions_release();
                    if (webSocket$aws_predictions_release != null) {
                        ByteString.Companion companion = ByteString.Companion;
                        byte[] bArrArray3 = byteBufferEncode2.array();
                        Intrinsics.checkNotNullExpressionValue(bArrArray3, "");
                        C56443yFo.KWHzl(webSocket$aws_predictions_release.send(companion.of(Arrays.copyOf(bArrArray3, bArrArray3.length))));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void sendClientInfoEvent(ClientSessionInformationEvent clientSessionInformationEvent) {
        this.sendEventQueueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.sendEventScope, null, CoroutineStart.LAZY, new AnonymousClass1(clientSessionInformationEvent, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.http.LivenessWebSocket$sendVideoEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $videoBytes;
        final /* synthetic */ long $videoEventTime;
        int label;
        final /* synthetic */ LivenessWebSocket this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16701(byte[] bArr, LivenessWebSocket livenessWebSocket, long j, Continuation<? super C16701> continuation) {
            super(2, continuation);
            this.$videoBytes = bArr;
            this.this$0 = livenessWebSocket;
            this.$videoEventTime = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16701(this.$videoBytes, this.this$0, this.$videoEventTime, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!(this.$videoBytes.length == 0)) {
                    LivenessWebSocket livenessWebSocket = this.this$0;
                    livenessWebSocket.videoEndTimestamp = livenessWebSocket.adjustedDate(this.$videoEventTime);
                }
                InterfaceC52697wV interfaceC52697wV = this.this$0.credentials;
                if (interfaceC52697wV != null) {
                    byte[] bArr = this.$videoBytes;
                    LivenessWebSocket livenessWebSocket2 = this.this$0;
                    long j = this.$videoEventTime;
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    long jAdjustedDate = livenessWebSocket2.adjustedDate(j);
                    Intrinsics.copydefault(byteBufferWrap);
                    VideoEvent videoEvent = new VideoEvent(byteBufferWrap, jAdjustedDate);
                    Json.Default r1 = Json.Default;
                    r1.getSerializersModule();
                    ByteBuffer byteBufferEncode = LivenessEventStream.INSTANCE.encode(ByteString.Companion.encodeUtf8(r1.encodeToString(VideoEvent.Companion.serializer(), videoEvent)).toByteArray(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(":event-type", "VideoEvent"), C56390yDp.OLrzqt(":message-type", "event"), C56390yDp.OLrzqt(":content-type", "application/json")));
                    Date date = new Date(LivenessWebSocket.adjustedDate$default(livenessWebSocket2, 0L, 1, null));
                    AWSV4Signer aWSV4Signer = livenessWebSocket2.signer;
                    String region = livenessWebSocket2.getRegion();
                    byte[] bArrArray = byteBufferEncode.array();
                    Intrinsics.checkNotNullExpressionValue(bArrArray, "");
                    List listAYXKKw = C59454zhO.AYXKKw((CharSequence) aWSV4Signer.getSignedFrame(region, bArrArray, interfaceC52697wV.copydefault(), new Pair<>(":date", date)), 2);
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
                    Iterator it = listAYXKKw.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C56443yFo.copydefault((byte) Integer.parseInt((String) it.next(), CharsKt__CharJVMKt.checkRadix(16))));
                    }
                    byte[] bArrDbNXlk = CollectionsKt___CollectionsKt.DbNXlk(arrayList);
                    LivenessEventStream livenessEventStream = LivenessEventStream.INSTANCE;
                    byte[] bArrArray2 = byteBufferEncode.array();
                    Intrinsics.checkNotNullExpressionValue(bArrArray2, "");
                    ByteBuffer byteBufferEncode2 = livenessEventStream.encode(bArrArray2, C56424yEw.gEmmrt(C56390yDp.OLrzqt(":date", date), C56390yDp.OLrzqt(":chunk-signature", bArrDbNXlk)));
                    WebSocket webSocket$aws_predictions_release = livenessWebSocket2.getWebSocket$aws_predictions_release();
                    if (webSocket$aws_predictions_release != null) {
                        ByteString.Companion companion = ByteString.Companion;
                        byte[] bArrArray3 = byteBufferEncode2.array();
                        Intrinsics.checkNotNullExpressionValue(bArrArray3, "");
                        C56443yFo.KWHzl(webSocket$aws_predictions_release.send(companion.of(Arrays.copyOf(bArrArray3, bArrArray3.length))));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendVideoEvent(@NotNull byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.sendEventQueueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.sendEventScope, null, CoroutineStart.LAZY, new C16701(bArr, this, j, null), 1, null));
    }

    public static /* synthetic */ void destroy$default(LivenessWebSocket livenessWebSocket, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1000;
        }
        livenessWebSocket.destroy(i);
    }

    public final void destroy(int i) {
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(i, null);
        }
    }

    public static /* synthetic */ long adjustedDate$default(LivenessWebSocket livenessWebSocket, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = new Date().getTime();
        }
        return livenessWebSocket.adjustedDate(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTimeDiffSafe(long j) {
        return Math.abs(j) < 240000;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.http.LivenessWebSocket.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDatePattern$annotations() {
        }

        private Companion() {
        }

        public final String getDatePattern() {
            return LivenessWebSocket.datePattern;
        }
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.PREDICTIONS, "amplify:aws-predictions");
        Intrinsics.checkNotNullExpressionValue(logger, "");
        LOG = logger;
    }
}
