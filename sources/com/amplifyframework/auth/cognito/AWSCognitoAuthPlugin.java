package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthPlugin;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCognitoAuthPlugin extends AuthPlugin<AWSCognitoAuthService> {
    public static final String AWS_COGNITO_AUTH_LOG_NAMESPACE = "amplify:aws-cognito-auth:%s";
    private static final String AWS_COGNITO_AUTH_PLUGIN_KEY = "awsCognitoAuthPlugin";
    public static final Companion Companion = new Companion(null);
    private final Logger logger;
    private JSONObject pluginConfigurationJSON;
    private final CoroutineScope pluginScope;
    private final Channel<Job> queueChannel;
    private final InterfaceC56387yDm queueFacade$delegate;
    public RealAWSCognitoAuthPlugin realPlugin;

    public static /* synthetic */ void getRealPlugin$aws_auth_cognito_release$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return AWS_COGNITO_AUTH_PLUGIN_KEY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.14.12";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealPlugin$aws_auth_cognito_release(@NotNull RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        Intrinsics.checkNotNullParameter(realAWSCognitoAuthPlugin, "");
        this.realPlugin = realAWSCognitoAuthPlugin;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AWSCognitoAuthPlugin() {
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.AUTH;
        String str = String.format(AWS_COGNITO_AUTH_LOG_NAMESPACE, Arrays.copyOf(new Object[]{AWSCognitoAuthPlugin.class.getSimpleName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        Logger logger = loggingCategory.logger(categoryType, str);
        Intrinsics.checkNotNullExpressionValue(logger, "");
        this.logger = logger;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
        this.pluginScope = CoroutineScope;
        this.queueFacade$delegate = C56392yDr.copydefault(new Function0<KotlinAuthFacadeInternal>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$queueFacade$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final KotlinAuthFacadeInternal invoke() {
                return new KotlinAuthFacadeInternal(this.this$0.getRealPlugin$aws_auth_cognito_release());
            }
        });
        Channel<Job> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AWSCognitoAuthPlugin$queueChannel$1$1(channelChannel$default, null), 3, null);
        this.queueChannel = channelChannel$default;
    }

    public final RealAWSCognitoAuthPlugin getRealPlugin$aws_auth_cognito_release() {
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.realPlugin;
        if (realAWSCognitoAuthPlugin != null) {
            return realAWSCognitoAuthPlugin;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinAuthFacadeInternal getQueueFacade() {
        return (KotlinAuthFacadeInternal) this.queueFacade$delegate.getValue();
    }

    @InternalAmplifyApi
    public final JSONObject getPluginConfiguration() {
        JSONObject jSONObject = this.pluginConfigurationJSON;
        if (jSONObject != null) {
            return jSONObject;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InternalAmplifyApi
    public final void addToUserAgent(@NotNull AWSCognitoAuthMetadataType aWSCognitoAuthMetadataType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aWSCognitoAuthMetadataType, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRealPlugin$aws_auth_cognito_release().addToUserAgent(aWSCognitoAuthMetadataType, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthException toAuthException(Exception exc) {
        if (exc instanceof AuthException) {
            return (AuthException) exc;
        }
        return new UnknownException(null, exc, 1, null);
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.core.plugin.Plugin
    public void initialize(@NotNull Context context) throws AmplifyException {
        Intrinsics.checkNotNullParameter(context, "");
        getRealPlugin$aws_auth_cognito_release().initialize();
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(@NotNull JSONObject jSONObject, @NotNull Context context) throws AmplifyException {
        UserContextDataProvider userContextDataProvider;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.pluginConfigurationJSON = jSONObject;
        try {
            int i = 2;
            AuthState authState = null;
            byte b = 0;
            AuthConfiguration authConfigurationFromJson$aws_auth_cognito_release$default = AuthConfiguration.Companion.fromJson$aws_auth_cognito_release$default(AuthConfiguration.Companion, jSONObject, null, 2, null);
            CredentialStoreClient credentialStoreClient = new CredentialStoreClient(authConfigurationFromJson$aws_auth_cognito_release$default, context, this.logger);
            AWSCognitoAuthService aWSCognitoAuthServiceFromConfiguration$aws_auth_cognito_release = AWSCognitoAuthService.Companion.fromConfiguration$aws_auth_cognito_release(authConfigurationFromJson$aws_auth_cognito_release$default);
            UserPoolConfiguration userPool = authConfigurationFromJson$aws_auth_cognito_release$default.getUserPool();
            if (userPool != null) {
                String poolId = userPool.getPoolId();
                Intrinsics.copydefault((Object) poolId);
                String appClient = userPool.getAppClient();
                Intrinsics.copydefault((Object) appClient);
                userContextDataProvider = new UserContextDataProvider(context, poolId, appClient);
            } else {
                userContextDataProvider = null;
            }
            AuthEnvironment authEnvironment = new AuthEnvironment(context, authConfigurationFromJson$aws_auth_cognito_release$default, aWSCognitoAuthServiceFromConfiguration$aws_auth_cognito_release, credentialStoreClient, userContextDataProvider, HostedUIClient.Companion.create(context, authConfigurationFromJson$aws_auth_cognito_release$default.getOauth(), this.logger), this.logger);
            setRealPlugin$aws_auth_cognito_release(new RealAWSCognitoAuthPlugin(authConfigurationFromJson$aws_auth_cognito_release$default, authEnvironment, new AuthStateMachine(authEnvironment, authState, i, b == true ? 1 : 0), this.logger));
            blockQueueChannelWhileConfiguring();
        } catch (Exception e) {
            throw new ConfigurationException("Failed to configure AWSCognitoAuthPlugin.", "Make sure your amplifyconfiguration.json is valid.", e);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$blockQueueChannelWhileConfiguring$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RealAWSCognitoAuthPlugin realPlugin$aws_auth_cognito_release = AWSCognitoAuthPlugin.this.getRealPlugin$aws_auth_cognito_release();
                this.label = 1;
                if (realPlugin$aws_auth_cognito_release.suspendWhileConfiguring$aws_auth_cognito_release(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void blockQueueChannelWhileConfiguring() {
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new AnonymousClass1(null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
        final /* synthetic */ AuthSignUpOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16091(String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16091> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$password = str2;
            this.$options = authSignUpOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16091(this.$username, this.$password, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$password;
                    AuthSignUpOptions authSignUpOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.signUp(str, str2, authSignUpOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignUpResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signUp(@NotNull String str, @NotNull String str2, @NotNull AuthSignUpOptions authSignUpOptions, @NotNull Consumer<AuthSignUpResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(authSignUpOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16091(str, str2, authSignUpOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15791(String str, String str2, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15791> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$confirmationCode = str2;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15791(this.$username, this.$confirmationCode, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$confirmationCode;
                    this.label = 1;
                    obj = queueFacade.confirmSignUp(str, str2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignUpResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(@NotNull String str, @NotNull String str2, @NotNull Consumer<AuthSignUpResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15791(str, str2, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15802 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
        final /* synthetic */ AuthConfirmSignUpOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15802(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15802> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$confirmationCode = str2;
            this.$options = authConfirmSignUpOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15802(this.$username, this.$confirmationCode, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$confirmationCode;
                    AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.confirmSignUp(str, str2, authConfirmSignUpOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignUpResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(@NotNull String str, @NotNull String str2, @NotNull AuthConfirmSignUpOptions authConfirmSignUpOptions, @NotNull Consumer<AuthSignUpResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(authConfirmSignUpOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15802(str, str2, authConfirmSignUpOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15941(String str, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super C15941> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15941(this.$username, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    this.label = 1;
                    obj = queueFacade.resendSignUpCode(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthCodeDeliveryDetails) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(@NotNull String str, @NotNull Consumer<AuthCodeDeliveryDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15941(str, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15952 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
        final /* synthetic */ AuthResendSignUpCodeOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15952(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super C15952> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$options = authResendSignUpCodeOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15952(this.$username, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    AuthResendSignUpCodeOptions authResendSignUpCodeOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.resendSignUpCode(str, authResendSignUpCodeOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthCodeDeliveryDetails) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(@NotNull String str, @NotNull AuthResendSignUpCodeOptions authResendSignUpCodeOptions, @NotNull Consumer<AuthCodeDeliveryDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authResendSignUpCodeOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15952(str, authResendSignUpCodeOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16011(String str, String str2, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16011> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$password = str2;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16011(this.$username, this.$password, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$password;
                    this.label = 1;
                    obj = queueFacade.signIn(str, str2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16011(str, str2, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16022 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthSignInOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16022(String str, String str2, AuthSignInOptions authSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16022> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$password = str2;
            this.$options = authSignInOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16022(this.$username, this.$password, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$password;
                    AuthSignInOptions authSignInOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.signIn(str, str2, authSignInOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, @NotNull AuthSignInOptions authSignInOptions, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authSignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16022(str, str2, authSignInOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $challengeResponse;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15771(String str, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15771> continuation) {
            super(2, continuation);
            this.$challengeResponse = str;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15771(this.$challengeResponse, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$challengeResponse;
                    this.label = 1;
                    obj = queueFacade.confirmSignIn(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(@NotNull String str, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15771(str, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15782 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $challengeResponse;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthConfirmSignInOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15782(String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15782> continuation) {
            super(2, continuation);
            this.$challengeResponse = str;
            this.$options = authConfirmSignInOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15782(this.$challengeResponse, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$challengeResponse;
                    AuthConfirmSignInOptions authConfirmSignInOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.confirmSignIn(str, authConfirmSignInOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(@NotNull String str, @NotNull AuthConfirmSignInOptions authConfirmSignInOptions, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authConfirmSignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15782(str, authConfirmSignInOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthProvider $provider;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16031(AuthProvider authProvider, Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16031> continuation) {
            super(2, continuation);
            this.$provider = authProvider;
            this.$callingActivity = activity;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16031(this.$provider, this.$callingActivity, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthProvider authProvider = this.$provider;
                    Activity activity = this.$callingActivity;
                    this.label = 1;
                    obj = queueFacade.signInWithSocialWebUI(authProvider, activity, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(@NotNull AuthProvider authProvider, @NotNull Activity activity, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authProvider, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16031(authProvider, activity, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16042 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthWebUISignInOptions $options;
        final /* synthetic */ AuthProvider $provider;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16042(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16042> continuation) {
            super(2, continuation);
            this.$provider = authProvider;
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16042(this.$provider, this.$callingActivity, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthProvider authProvider = this.$provider;
                    Activity activity = this.$callingActivity;
                    AuthWebUISignInOptions authWebUISignInOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(@NotNull AuthProvider authProvider, @NotNull Activity activity, @NotNull AuthWebUISignInOptions authWebUISignInOptions, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authProvider, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(authWebUISignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16042(authProvider, activity, authWebUISignInOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16051(Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16051> continuation) {
            super(2, continuation);
            this.$callingActivity = activity;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16051(this.$callingActivity, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    Activity activity = this.$callingActivity;
                    this.label = 1;
                    obj = queueFacade.signInWithWebUI(activity, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(@NotNull Activity activity, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16051(activity, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthWebUISignInOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16062(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16062> continuation) {
            super(2, continuation);
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16062(this.$callingActivity, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    Activity activity = this.$callingActivity;
                    AuthWebUISignInOptions authWebUISignInOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.signInWithWebUI(activity, authWebUISignInOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSignInResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(@NotNull Activity activity, @NotNull AuthWebUISignInOptions authWebUISignInOptions, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(authWebUISignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16062(activity, authWebUISignInOptions, consumer, consumer2, null), 1, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void handleWebUISignInResponse(Intent intent) {
        getQueueFacade().handleWebUISignInResponse(intent);
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSession> $onSuccess;
        final /* synthetic */ AuthFetchSessionOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15851(AuthFetchSessionOptions authFetchSessionOptions, Consumer<AuthSession> consumer, Consumer<AuthException> consumer2, Continuation<? super C15851> continuation) {
            super(2, continuation);
            this.$options = authFetchSessionOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15851(this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthFetchSessionOptions authFetchSessionOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.fetchAuthSession(authFetchSessionOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSession) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(@NotNull AuthFetchSessionOptions authFetchSessionOptions, @NotNull Consumer<AuthSession> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authFetchSessionOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15851(authFetchSessionOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15862 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSession> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15862(Consumer<AuthSession> consumer, Consumer<AuthException> consumer2, Continuation<? super C15862> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15862(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    obj = queueFacade.fetchAuthSession(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthSession) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(@NotNull Consumer<AuthSession> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15862(consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$rememberDevice$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15931(Action action, Consumer<AuthException> consumer, Continuation<? super C15931> continuation) {
            super(2, continuation);
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15931(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    if (queueFacade.rememberDevice(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void rememberDevice(@NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15931(action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15901(Action action, Consumer<AuthException> consumer, Continuation<? super C15901> continuation) {
            super(2, continuation);
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15901(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    if (queueFacade.forgetDevice(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(@NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15901(action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthDevice $device;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15912(AuthDevice authDevice, Action action, Consumer<AuthException> consumer, Continuation<? super C15912> continuation) {
            super(2, continuation);
            this.$device = authDevice;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15912(this.$device, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthDevice authDevice = this.$device;
                    this.label = 1;
                    if (queueFacade.forgetDevice(authDevice, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(@NotNull AuthDevice authDevice, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(authDevice, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15912(authDevice, action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchDevices$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<List<AuthDevice>> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15871(Consumer<List<AuthDevice>> consumer, Consumer<AuthException> consumer2, Continuation<? super C15871> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15871(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    obj = queueFacade.fetchDevices(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((List) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchDevices(@NotNull Consumer<List<AuthDevice>> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15871(consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthResetPasswordResult> $onSuccess;
        final /* synthetic */ AuthResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15981(String str, AuthResetPasswordOptions authResetPasswordOptions, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15981> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$options = authResetPasswordOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15981(this.$username, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    AuthResetPasswordOptions authResetPasswordOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.resetPassword(str, authResetPasswordOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthResetPasswordResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(@NotNull String str, @NotNull AuthResetPasswordOptions authResetPasswordOptions, @NotNull Consumer<AuthResetPasswordResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authResetPasswordOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15981(str, authResetPasswordOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15992 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthResetPasswordResult> $onSuccess;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15992(String str, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15992> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15992(this.$username, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    this.label = 1;
                    obj = queueFacade.resetPassword(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthResetPasswordResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(@NotNull String str, @NotNull Consumer<AuthResetPasswordResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15992(str, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ AuthConfirmResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15761(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action, Consumer<AuthException> consumer, Continuation<? super C15761> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$newPassword = str2;
            this.$confirmationCode = str3;
            this.$options = authConfirmResetPasswordOptions;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15761(this.$username, this.$newPassword, this.$confirmationCode, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$newPassword;
                    String str3 = this.$confirmationCode;
                    AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions = this.$options;
                    this.label = 1;
                    if (queueFacade.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(authConfirmResetPasswordOptions, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15761(str, str2, str3, authConfirmResetPasswordOptions, action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, Action action, Consumer<AuthException> consumer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$newPassword = str2;
            this.$confirmationCode = str3;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new AnonymousClass2(this.$username, this.$newPassword, this.$confirmationCode, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$username;
                    String str2 = this.$newPassword;
                    String str3 = this.$confirmationCode;
                    this.label = 1;
                    if (queueFacade.confirmResetPassword(str, str2, str3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new AnonymousClass2(str, str2, str3, action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updatePassword$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $oldPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16111(String str, String str2, Action action, Consumer<AuthException> consumer, Continuation<? super C16111> continuation) {
            super(2, continuation);
            this.$oldPassword = str;
            this.$newPassword = str2;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16111(this.$oldPassword, this.$newPassword, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$oldPassword;
                    String str2 = this.$newPassword;
                    this.label = 1;
                    if (queueFacade.updatePassword(str, str2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updatePassword(@NotNull String str, @NotNull String str2, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16111(str, str2, action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchUserAttributes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<List<AuthUserAttribute>> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15891(Consumer<List<AuthUserAttribute>> consumer, Consumer<AuthException> consumer2, Continuation<? super C15891> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15891(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    obj = queueFacade.fetchUserAttributes(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((List) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchUserAttributes(@NotNull Consumer<List<AuthUserAttribute>> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15891(consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthUserAttribute $attribute;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthUpdateAttributeResult> $onSuccess;
        final /* synthetic */ AuthUpdateUserAttributeOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16121(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, Consumer<AuthUpdateAttributeResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16121> continuation) {
            super(2, continuation);
            this.$attribute = authUserAttribute;
            this.$options = authUpdateUserAttributeOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16121(this.$attribute, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthUserAttribute authUserAttribute = this.$attribute;
                    AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.updateUserAttribute(authUserAttribute, authUpdateUserAttributeOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthUpdateAttributeResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(@NotNull AuthUserAttribute authUserAttribute, @NotNull AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, @NotNull Consumer<AuthUpdateAttributeResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authUserAttribute, "");
        Intrinsics.checkNotNullParameter(authUpdateUserAttributeOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16121(authUserAttribute, authUpdateUserAttributeOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16132 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthUserAttribute $attribute;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthUpdateAttributeResult> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16132(AuthUserAttribute authUserAttribute, Consumer<AuthUpdateAttributeResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16132> continuation) {
            super(2, continuation);
            this.$attribute = authUserAttribute;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16132(this.$attribute, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16132) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthUserAttribute authUserAttribute = this.$attribute;
                    this.label = 1;
                    obj = queueFacade.updateUserAttribute(authUserAttribute, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthUpdateAttributeResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(@NotNull AuthUserAttribute authUserAttribute, @NotNull Consumer<AuthUpdateAttributeResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authUserAttribute, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16132(authUserAttribute, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> $onSuccess;
        final /* synthetic */ AuthUpdateUserAttributesOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16141(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, Consumer<AuthException> consumer2, Continuation<? super C16141> continuation) {
            super(2, continuation);
            this.$attributes = list;
            this.$options = authUpdateUserAttributesOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16141(this.$attributes, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    List<AuthUserAttribute> list = this.$attributes;
                    AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.updateUserAttributes(list, authUpdateUserAttributesOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((Map) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(@NotNull List<AuthUserAttribute> list, @NotNull AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, @NotNull Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(authUpdateUserAttributesOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16141(list, authUpdateUserAttributesOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16152(List<AuthUserAttribute> list, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, Consumer<AuthException> consumer2, Continuation<? super C16152> continuation) {
            super(2, continuation);
            this.$attributes = list;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16152(this.$attributes, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    List<AuthUserAttribute> list = this.$attributes;
                    this.label = 1;
                    obj = queueFacade.updateUserAttributes(list, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((Map) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(@NotNull List<AuthUserAttribute> list, @NotNull Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16152(list, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
        final /* synthetic */ AuthResendUserAttributeConfirmationCodeOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15961(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super C15961> continuation) {
            super(2, continuation);
            this.$attributeKey = authUserAttributeKey;
            this.$options = authResendUserAttributeConfirmationCodeOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15961(this.$attributeKey, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                    AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.resendUserAttributeConfirmationCode(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthCodeDeliveryDetails) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, @NotNull Consumer<AuthCodeDeliveryDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authUserAttributeKey, "");
        Intrinsics.checkNotNullParameter(authResendUserAttributeConfirmationCodeOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15961(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15972(AuthUserAttributeKey authUserAttributeKey, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super C15972> continuation) {
            super(2, continuation);
            this.$attributeKey = authUserAttributeKey;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15972(this.$attributeKey, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                    this.label = 1;
                    obj = queueFacade.resendUserAttributeConfirmationCode(authUserAttributeKey, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthCodeDeliveryDetails) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull Consumer<AuthCodeDeliveryDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authUserAttributeKey, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15972(authUserAttributeKey, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmUserAttribute$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15811(AuthUserAttributeKey authUserAttributeKey, String str, Action action, Consumer<AuthException> consumer, Continuation<? super C15811> continuation) {
            super(2, continuation);
            this.$attributeKey = authUserAttributeKey;
            this.$confirmationCode = str;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15811(this.$attributeKey, this.$confirmationCode, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                    String str = this.$confirmationCode;
                    this.label = 1;
                    if (queueFacade.confirmUserAttribute(authUserAttributeKey, str, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmUserAttribute(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull String str, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(authUserAttributeKey, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15811(authUserAttributeKey, str, action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$getCurrentUser$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthUser> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15921(Consumer<AuthUser> consumer, Consumer<AuthException> consumer2, Continuation<? super C15921> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15921(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    obj = queueFacade.getCurrentUser(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthUser) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void getCurrentUser(@NotNull Consumer<AuthUser> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15921(consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthSignOutResult> $onComplete;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16071(Consumer<AuthSignOutResult> consumer, Continuation<? super C16071> continuation) {
            super(2, continuation);
            this.$onComplete = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16071(this.$onComplete, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                obj = queueFacade.signOut(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.$onComplete.accept((AuthSignOutResult) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(@NotNull Consumer<AuthSignOutResult> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16071(consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16082 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthSignOutResult> $onComplete;
        final /* synthetic */ AuthSignOutOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16082(AuthSignOutOptions authSignOutOptions, Consumer<AuthSignOutResult> consumer, Continuation<? super C16082> continuation) {
            super(2, continuation);
            this.$options = authSignOutOptions;
            this.$onComplete = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16082(this.$options, this.$onComplete, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                AuthSignOutOptions authSignOutOptions = this.$options;
                this.label = 1;
                obj = queueFacade.signOut(authSignOutOptions, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.$onComplete.accept((AuthSignOutResult) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(@NotNull AuthSignOutOptions authSignOutOptions, @NotNull Consumer<AuthSignOutResult> consumer) {
        Intrinsics.checkNotNullParameter(authSignOutOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16082(authSignOutOptions, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteUser$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15821(Action action, Consumer<AuthException> consumer, Continuation<? super C15821> continuation) {
            super(2, continuation);
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15821(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    if (queueFacade.deleteUser(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteUser(@NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15821(action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$setUpTOTP$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<TOTPSetupDetails> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16001(Consumer<TOTPSetupDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super C16001> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16001(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    obj = queueFacade.setUpTOTP(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((TOTPSetupDetails) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void setUpTOTP(@NotNull Consumer<TOTPSetupDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16001(consumer, consumer2, null), 1, null));
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(@NotNull String str, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        verifyTOTPSetup(str, new AWSCognitoAuthVerifyTOTPSetupOptions.CognitoBuilder().build(), action, consumer);
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$verifyTOTPSetup$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ AuthVerifyTOTPSetupOptions $options;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16161(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, Action action, Consumer<AuthException> consumer, Continuation<? super C16161> continuation) {
            super(2, continuation);
            this.$code = str;
            this.$options = authVerifyTOTPSetupOptions;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16161(this.$code, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$code;
                    AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions = this.$options;
                    this.label = 1;
                    if (queueFacade.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(@NotNull String str, @NotNull AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authVerifyTOTPSetupOptions, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16161(str, authVerifyTOTPSetupOptions, action, consumer, null), 1, null));
    }

    /* JADX DEBUG: Method merged with bridge method: getEscapeHatch()Ljava/lang/Object; */
    @Override // com.amplifyframework.core.plugin.Plugin
    public AWSCognitoAuthService getEscapeHatch() {
        return getRealPlugin$aws_auth_cognito_release().escapeHatch();
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<FederateToIdentityPoolResult> $onSuccess;
        final /* synthetic */ String $providerToken;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15831(String str, AuthProvider authProvider, Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15831> continuation) {
            super(2, continuation);
            this.$providerToken = str;
            this.$authProvider = authProvider;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15831(this.$providerToken, this.$authProvider, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$providerToken;
                    AuthProvider authProvider = this.$authProvider;
                    FederateToIdentityPoolOptions federateToIdentityPoolOptionsBuild = FederateToIdentityPoolOptions.Companion.builder().build();
                    this.label = 1;
                    obj = queueFacade.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptionsBuild, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((FederateToIdentityPoolResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void federateToIdentityPool(@NotNull String str, @NotNull AuthProvider authProvider, @NotNull Consumer<FederateToIdentityPoolResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authProvider, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15831(str, authProvider, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$2, reason: invalid class name and case insensitive filesystem */
    public static final class C15842 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<FederateToIdentityPoolResult> $onSuccess;
        final /* synthetic */ FederateToIdentityPoolOptions $options;
        final /* synthetic */ String $providerToken;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15842(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C15842> continuation) {
            super(2, continuation);
            this.$providerToken = str;
            this.$authProvider = authProvider;
            this.$options = federateToIdentityPoolOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15842(this.$providerToken, this.$authProvider, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    String str = this.$providerToken;
                    AuthProvider authProvider = this.$authProvider;
                    FederateToIdentityPoolOptions federateToIdentityPoolOptions = this.$options;
                    this.label = 1;
                    obj = queueFacade.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptions, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((FederateToIdentityPoolResult) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void federateToIdentityPool(@NotNull String str, @NotNull AuthProvider authProvider, @NotNull FederateToIdentityPoolOptions federateToIdentityPoolOptions, @NotNull Consumer<FederateToIdentityPoolResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authProvider, "");
        Intrinsics.checkNotNullParameter(federateToIdentityPoolOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15842(str, authProvider, federateToIdentityPoolOptions, consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$clearFederationToIdentityPool$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15751(Action action, Consumer<AuthException> consumer, Continuation<? super C15751> continuation) {
            super(2, continuation);
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15751(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    if (queueFacade.clearFederationToIdentityPool(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearFederationToIdentityPool(@NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15751(action, consumer, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchMFAPreference$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<UserMFAPreference> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15881(Consumer<UserMFAPreference> consumer, Consumer<AuthException> consumer2, Continuation<? super C15881> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C15881(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    this.label = 1;
                    obj = queueFacade.fetchMFAPreference(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((UserMFAPreference) obj);
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchMFAPreference(@NotNull Consumer<UserMFAPreference> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C15881(consumer, consumer2, null), 1, null));
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ MFAPreference $sms;
        final /* synthetic */ MFAPreference $totp;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16101(MFAPreference mFAPreference, MFAPreference mFAPreference2, Action action, Consumer<AuthException> consumer, Continuation<? super C16101> continuation) {
            super(2, continuation);
            this.$sms = mFAPreference;
            this.$totp = mFAPreference2;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return AWSCognitoAuthPlugin.this.new C16101(this.$sms, this.$totp, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                    MFAPreference mFAPreference = this.$sms;
                    MFAPreference mFAPreference2 = this.$totp;
                    this.label = 1;
                    if (queueFacade.updateMFAPreference(mFAPreference, mFAPreference2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.call();
            } catch (Exception e) {
                this.$onError.accept(AWSCognitoAuthPlugin.this.toAuthException(e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.queueChannel.mo5769trySendJP2dKIU(BuildersKt__Builders_commonKt.launch$default(this.pluginScope, null, CoroutineStart.LAZY, new C16101(mFAPreference, mFAPreference2, action, consumer, null), 1, null));
    }
}
