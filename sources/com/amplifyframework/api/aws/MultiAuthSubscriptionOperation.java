package com.amplifyframework.api.aws;

import androidx.annotation.NonNull;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.auth.AuthRuleRequestDecorator;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.auth.AuthorizationTypeIterator;
import com.amplifyframework.datastore.appsync.AppSyncExtensions;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
final class MultiAuthSubscriptionOperation<T> extends AWSGraphQLOperation<T> {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.API, "amplify:aws-api");
    private AuthorizationTypeIterator authTypes;
    private final AtomicBoolean canceled;
    private final ExecutorService executorService;
    private final Consumer<GraphQLResponse<T>> onNextItem;
    private final Action onSubscriptionComplete;
    private final Consumer<ApiException> onSubscriptionError;
    private final Consumer<String> onSubscriptionStart;
    private final AuthRuleRequestDecorator requestDecorator;
    private final SubscriptionEndpoint subscriptionEndpoint;
    private Future<?> subscriptionFuture;
    private String subscriptionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Future<?> getSubscriptionFuture() {
        return this.subscriptionFuture;
    }

    private MultiAuthSubscriptionOperation(Builder<T> builder) {
        super(((Builder) builder).graphQlRequest, ((Builder) builder).responseFactory, ((Builder) builder).apiName);
        this.subscriptionEndpoint = ((Builder) builder).subscriptionEndpoint;
        this.onSubscriptionStart = ((Builder) builder).onSubscriptionStart;
        this.onNextItem = ((Builder) builder).onNextItem;
        this.onSubscriptionError = ((Builder) builder).onSubscriptionError;
        this.onSubscriptionComplete = ((Builder) builder).onSubscriptionComplete;
        this.executorService = ((Builder) builder).executorService;
        this.canceled = new AtomicBoolean(false);
        this.requestDecorator = ((Builder) builder).requestDecorator;
        this.authTypes = MultiAuthModeStrategy.getInstance().authTypesFor(((Builder) builder).graphQlRequest.getModelSchema(), ((Builder) builder).graphQlRequest.getAuthRuleOperation());
    }

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        synchronized (this) {
            if (this.canceled.get()) {
                this.onSubscriptionError.accept(new ApiException("Operation already canceled.", "Don't cancel the subscription before starting it!"));
            } else {
                this.subscriptionFuture = this.executorService.submit(new MultiAuthSubscriptionOperation$$ExternalSyntheticLambda1(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRequest() {
        Logger logger = LOG;
        logger.debug("Processing subscription request: " + getRequest().getContent());
        if (this.authTypes.hasNext()) {
            AuthorizationType next = this.authTypes.next();
            logger.debug("Attempting to subscribe with " + next.name());
            GraphQLRequest request = getRequest();
            if (this.authTypes.isOwnerBasedRule()) {
                try {
                    request = this.requestDecorator.decorate(request, next);
                } catch (ApiException.ApiAuthException unused) {
                    this.subscriptionFuture = this.executorService.submit(new MultiAuthSubscriptionOperation$$ExternalSyntheticLambda1(this));
                    return;
                } catch (ApiException e) {
                    LOG.warn("Unable to automatically add an owner to the request.", e);
                    emitErrorAndCancelSubscription(e);
                    return;
                }
            }
            this.subscriptionEndpoint.requestSubscription(request, next, new Consumer() { // from class: com.amplifyframework.api.aws.MultiAuthSubscriptionOperation$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$dispatchRequest$0((String) obj);
                }
            }, new Consumer() { // from class: com.amplifyframework.api.aws.MultiAuthSubscriptionOperation$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$dispatchRequest$1((GraphQLResponse) obj);
                }
            }, new Consumer() { // from class: com.amplifyframework.api.aws.MultiAuthSubscriptionOperation$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$dispatchRequest$2((ApiException) obj);
                }
            }, this.onSubscriptionComplete);
            return;
        }
        emitErrorAndCancelSubscription(new ApiException.ApiAuthException("Unable to establish subscription connection with any of the compatible auth types.", "Check your application logs for detail."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchRequest$0(String str) {
        this.subscriptionId = str;
        this.onSubscriptionStart.accept(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchRequest$1(GraphQLResponse graphQLResponse) {
        if (graphQLResponse.hasErrors() && hasAuthRelatedErrors(graphQLResponse) && this.authTypes.hasNext()) {
            this.executorService.submit(new MultiAuthSubscriptionOperation$$ExternalSyntheticLambda1(this));
        } else {
            this.onNextItem.accept(graphQLResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchRequest$2(ApiException apiException) {
        LOG.warn("A subscription error occurred.", apiException);
        if ((apiException instanceof ApiException.ApiAuthException) && this.authTypes.hasNext()) {
            this.executorService.submit(new MultiAuthSubscriptionOperation$$ExternalSyntheticLambda1(this));
        } else {
            emitErrorAndCancelSubscription(apiException);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        synchronized (this) {
            if (this.subscriptionId != null && !this.canceled.get()) {
                this.canceled.set(true);
                this.executorService.execute(new Runnable() { // from class: com.amplifyframework.api.aws.MultiAuthSubscriptionOperation$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$cancel$3();
                    }
                });
            } else {
                Future<?> future = this.subscriptionFuture;
                if (future != null && future.cancel(true)) {
                    LOG.debug("Subscription attempt was canceled.");
                } else {
                    LOG.debug("Nothing to cancel. Subscription not yet created, or already cancelled.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$3() {
        try {
            LOG.debug("Cancelling subscription: " + this.subscriptionId);
            this.subscriptionEndpoint.releaseSubscription(this.subscriptionId);
        } catch (ApiException e) {
            this.onSubscriptionError.accept(e);
        }
    }

    private boolean hasAuthRelatedErrors(GraphQLResponse<T> graphQLResponse) {
        for (GraphQLResponse.Error error : graphQLResponse.getErrors()) {
            if (!Empty.check(error.getExtensions())) {
                return new AppSyncExtensions(error.getExtensions()).isUnauthorizedErrorType();
            }
        }
        return false;
    }

    private void emitErrorAndCancelSubscription(ApiException apiException) {
        cancel();
        this.onSubscriptionError.accept(apiException);
    }

    public boolean isCanceled() {
        return this.canceled.get();
    }

    public void setCanceled(boolean z) {
        this.canceled.set(z);
    }

    public static final class Builder<T> {
        private String apiName;
        private ExecutorService executorService;
        private AppSyncGraphQLRequest<T> graphQlRequest;
        private Consumer<GraphQLResponse<T>> onNextItem;
        private Action onSubscriptionComplete;
        private Consumer<ApiException> onSubscriptionError;
        private Consumer<String> onSubscriptionStart;
        private AuthRuleRequestDecorator requestDecorator;
        private GraphQLResponse.Factory responseFactory;
        private SubscriptionEndpoint subscriptionEndpoint;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder<T> apiName(String str) {
            this.apiName = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder<T> requestDecorator(AuthRuleRequestDecorator authRuleRequestDecorator) {
            this.requestDecorator = authRuleRequestDecorator;
            return this;
        }

        public Builder<T> subscriptionEndpoint(@NonNull SubscriptionEndpoint subscriptionEndpoint) {
            Objects.requireNonNull(subscriptionEndpoint);
            this.subscriptionEndpoint = subscriptionEndpoint;
            return this;
        }

        public Builder<T> graphQlRequest(@NonNull AppSyncGraphQLRequest<T> appSyncGraphQLRequest) {
            Objects.requireNonNull(appSyncGraphQLRequest);
            this.graphQlRequest = appSyncGraphQLRequest;
            return this;
        }

        public Builder<T> responseFactory(@NonNull GraphQLResponse.Factory factory) {
            Objects.requireNonNull(factory);
            this.responseFactory = factory;
            return this;
        }

        public Builder<T> executorService(@NonNull ExecutorService executorService) {
            Objects.requireNonNull(executorService);
            this.executorService = executorService;
            return this;
        }

        public Builder<T> onSubscriptionStart(@NonNull Consumer<String> consumer) {
            Objects.requireNonNull(consumer);
            this.onSubscriptionStart = consumer;
            return this;
        }

        public Builder<T> onNextItem(@NonNull Consumer<GraphQLResponse<T>> consumer) {
            Objects.requireNonNull(consumer);
            this.onNextItem = consumer;
            return this;
        }

        public Builder<T> onSubscriptionError(@NonNull Consumer<ApiException> consumer) {
            Objects.requireNonNull(consumer);
            this.onSubscriptionError = consumer;
            return this;
        }

        public Builder<T> onSubscriptionComplete(@NonNull Action action) {
            Objects.requireNonNull(action);
            this.onSubscriptionComplete = action;
            return this;
        }

        public MultiAuthSubscriptionOperation<T> build() {
            return new MultiAuthSubscriptionOperation<>(this);
        }
    }
}
