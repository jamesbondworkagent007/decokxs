package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSTemporaryCredentials;
import com.amplifyframework.auth.AuthCategoryBehavior;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.invalidstate.SignedInException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException;
import com.amplifyframework.auth.cognito.exceptions.service.HostedUISignOutException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidAccountTypeException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.HostedUIHelper;
import com.amplifyframework.auth.cognito.helpers.MFAHelperKt;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignUpOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendSignUpCodeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignOutOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.cognito.result.GlobalSignOutError;
import com.amplifyframework.auth.cognito.result.HostedUIError;
import com.amplifyframework.auth.cognito.result.RevokeTokenError;
import com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.NotAuthorizedException;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.auth.exceptions.SignedOutException;
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
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import com.amplifyframework.auth.result.step.AuthSignInStep;
import com.amplifyframework.auth.result.step.AuthSignUpStep;
import com.amplifyframework.auth.result.step.AuthUpdateAttributeStep;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.errors.SessionError;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import o.AccountManagerResponse;
import o.ActivityConfigurationChangeItem;
import o.ActivityLifecycleItem;
import o.ActivityRelaunchItem;
import o.AlertDialog;
import o.AnimationHandler;
import o.AnimatorInflater;
import o.AppOpsManager;
import o.ApplicationErrorReport;
import o.ApplicationLoaders;
import o.AuthenticatorDescription;
import o.BackupManagerMonitor;
import o.BinaryOperator;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.ChooseAccountActivity;
import o.ChooseAccountTypeActivity;
import o.DatePickerDialog;
import o.DexLoadReporter;
import o.ElapsedRealtimeLong;
import o.GrantCredentialsPermissionActivity;
import o.IntArrayEvaluator;
import o.IntKeyframeSet;
import o.JobServiceEngine;
import o.Nullable;
import o.Presentation;
import o.ProfilerInfo;
import o.RequiresFeature;
import o.RestoreDescription;
import o.SystemUpdatePolicy;
import o.TargetApi;
import o.TimePickerDialog;
import o.UiAutomationConnection;
import o.UserSwitchObserver;
import o.VrManager;
import o.WaitResult;
import o.WindowConfiguration;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RealAWSCognitoAuthPlugin implements AuthCategoryBehavior {
    private final AuthEnvironment authEnvironment;
    private final AuthStateMachine authStateMachine;
    private final AuthConfiguration configuration;
    private final AtomicReference<String> lastPublishedHubEventName;
    private final Logger logger;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16181 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16181(Continuation<? super C16181> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealAWSCognitoAuthPlugin.this._confirmSignUp(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_resendSignUpCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16251(Continuation<? super C16251> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealAWSCognitoAuthPlugin.this._resendSignUpCode(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16321(Continuation<? super C16321> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealAWSCognitoAuthPlugin.this._signUp(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$forgetDevice$2, reason: invalid class name and case insensitive filesystem */
    public static final class C16492 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16492(Continuation<? super C16492> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealAWSCognitoAuthPlugin.this.forgetDevice((String) null, this);
        }
    }

    public RealAWSCognitoAuthPlugin(@NotNull AuthConfiguration authConfiguration, @NotNull AuthEnvironment authEnvironment, @NotNull AuthStateMachine authStateMachine, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(authConfiguration, "");
        Intrinsics.checkNotNullParameter(authEnvironment, "");
        Intrinsics.checkNotNullParameter(authStateMachine, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.configuration = authConfiguration;
        this.authEnvironment = authEnvironment;
        this.authStateMachine = authStateMachine;
        this.logger = logger;
        this.lastPublishedHubEventName = new AtomicReference<>();
        addAuthStateChangeListener();
        configureAuthStates();
    }

    public final AWSCognitoAuthService escapeHatch() {
        return this.authEnvironment.getCognitoAuthService();
    }

    @InternalAmplifyApi
    public final void addToUserAgent(@NotNull AWSCognitoAuthMetadataType aWSCognitoAuthMetadataType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aWSCognitoAuthMetadataType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.authEnvironment.getCognitoAuthService().getCustomUserAgentPairs().put(aWSCognitoAuthMetadataType.getKey(), str);
    }

    public final void initialize() throws AmplifyException {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.initialize.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                if (authState instanceof AuthState.Configured) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    countDownLatch.countDown();
                }
            }
        }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.initialize.2
            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            throw new AmplifyException("Failed to configure auth plugin.", "Make sure your amplifyconfiguration.json is valid");
        }
    }

    public final Object suspendWhileConfiguring$aws_auth_cognito_release(@NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                if ((authState instanceof AuthState.Configured) || (authState instanceof AuthState.Error)) {
                    this.this$0.authStateMachine.cancel(stateChangeListenerToken);
                    Continuation<Unit> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                }
            }
        }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2$2
            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signUp(@NotNull final String str, @NotNull final String str2, @NotNull final AuthSignUpOptions authSignUpOptions, @NotNull final Consumer<AuthSignUpResult> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(authSignUpOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signUp.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.NotConfigured) {
                    consumer2.accept(new InvalidUserPoolConfigurationException());
                } else if ((authNState instanceof AuthenticationState.SignedIn) || (authNState instanceof AuthenticationState.SignedOut)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01801(this, str, str2, authSignUpOptions, consumer, consumer2, null), 3, null);
                } else {
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signUp$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
                final /* synthetic */ AuthSignUpOptions $options;
                final /* synthetic */ String $password;
                final /* synthetic */ String $username;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01801(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C01801> continuation) {
                    super(2, continuation);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$username = str;
                    this.$password = str2;
                    this.$options = authSignUpOptions;
                    this.$onSuccess = consumer;
                    this.$onError = consumer2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01801(this.this$0, this.$username, this.$password, this.$options, this.$onSuccess, this.$onError, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        String str = this.$username;
                        String str2 = this.$password;
                        AuthSignUpOptions authSignUpOptions = this.$options;
                        Consumer<AuthSignUpResult> consumer = this.$onSuccess;
                        Consumer<AuthException> consumer2 = this.$onError;
                        this.label = 1;
                        if (realAWSCognitoAuthPlugin._signUp(str, str2, authSignUpOptions, consumer, consumer2, this) == objCopydefault) {
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
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0249 A[Catch: Exception -> 0x01fe, TryCatch #2 {Exception -> 0x01fe, blocks: (B:76:0x01c8, B:78:0x01ce, B:80:0x01e1, B:82:0x01e7, B:87:0x0204, B:89:0x020b, B:107:0x0262, B:90:0x0222, B:92:0x022f, B:97:0x023b, B:99:0x0243, B:101:0x0249, B:103:0x0251, B:105:0x0259, B:106:0x025d, B:20:0x006a, B:36:0x00db, B:38:0x00ef, B:40:0x0107, B:42:0x010d, B:44:0x011c, B:46:0x0122, B:48:0x012c, B:50:0x0134, B:52:0x013d, B:54:0x014d, B:55:0x0155, B:57:0x0159, B:60:0x0160, B:61:0x0171, B:63:0x0177, B:65:0x018a, B:66:0x018e, B:67:0x0198), top: B:121:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259 A[Catch: Exception -> 0x01fe, TryCatch #2 {Exception -> 0x01fe, blocks: (B:76:0x01c8, B:78:0x01ce, B:80:0x01e1, B:82:0x01e7, B:87:0x0204, B:89:0x020b, B:107:0x0262, B:90:0x0222, B:92:0x022f, B:97:0x023b, B:99:0x0243, B:101:0x0249, B:103:0x0251, B:105:0x0259, B:106:0x025d, B:20:0x006a, B:36:0x00db, B:38:0x00ef, B:40:0x0107, B:42:0x010d, B:44:0x011c, B:46:0x0122, B:48:0x012c, B:50:0x0134, B:52:0x013d, B:54:0x014d, B:55:0x0155, B:57:0x0159, B:60:0x0160, B:61:0x0171, B:63:0x0177, B:65:0x018a, B:66:0x018e, B:67:0x0198), top: B:121:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8 A[Catch: Exception -> 0x01fe, TRY_ENTER, TryCatch #2 {Exception -> 0x01fe, blocks: (B:76:0x01c8, B:78:0x01ce, B:80:0x01e1, B:82:0x01e7, B:87:0x0204, B:89:0x020b, B:107:0x0262, B:90:0x0222, B:92:0x022f, B:97:0x023b, B:99:0x0243, B:101:0x0249, B:103:0x0251, B:105:0x0259, B:106:0x025d, B:20:0x006a, B:36:0x00db, B:38:0x00ef, B:40:0x0107, B:42:0x010d, B:44:0x011c, B:46:0x0122, B:48:0x012c, B:50:0x0134, B:52:0x013d, B:54:0x014d, B:55:0x0155, B:57:0x0159, B:60:0x0160, B:61:0x0171, B:63:0x0177, B:65:0x018a, B:66:0x018e, B:67:0x0198), top: B:121:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0222 A[Catch: Exception -> 0x01fe, TryCatch #2 {Exception -> 0x01fe, blocks: (B:76:0x01c8, B:78:0x01ce, B:80:0x01e1, B:82:0x01e7, B:87:0x0204, B:89:0x020b, B:107:0x0262, B:90:0x0222, B:92:0x022f, B:97:0x023b, B:99:0x0243, B:101:0x0249, B:103:0x0251, B:105:0x0259, B:106:0x025d, B:20:0x006a, B:36:0x00db, B:38:0x00ef, B:40:0x0107, B:42:0x010d, B:44:0x011c, B:46:0x0122, B:48:0x012c, B:50:0x0134, B:52:0x013d, B:54:0x014d, B:55:0x0155, B:57:0x0159, B:60:0x0160, B:61:0x0171, B:63:0x0177, B:65:0x018a, B:66:0x018e, B:67:0x0198), top: B:121:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023b A[Catch: Exception -> 0x01fe, TryCatch #2 {Exception -> 0x01fe, blocks: (B:76:0x01c8, B:78:0x01ce, B:80:0x01e1, B:82:0x01e7, B:87:0x0204, B:89:0x020b, B:107:0x0262, B:90:0x0222, B:92:0x022f, B:97:0x023b, B:99:0x0243, B:101:0x0249, B:103:0x0251, B:105:0x0259, B:106:0x025d, B:20:0x006a, B:36:0x00db, B:38:0x00ef, B:40:0x0107, B:42:0x010d, B:44:0x011c, B:46:0x0122, B:48:0x012c, B:50:0x0134, B:52:0x013d, B:54:0x014d, B:55:0x0155, B:57:0x0159, B:60:0x0160, B:61:0x0171, B:63:0x0177, B:65:0x018a, B:66:0x018e, B:67:0x0198), top: B:121:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object _signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super Unit> continuation) throws Throwable {
        C16321 c16321;
        Consumer<AuthException> consumer3;
        Consumer<AuthException> consumer4;
        String str3;
        AuthSignUpOptions authSignUpOptions2;
        Consumer<AuthSignUpResult> consumer5;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
        String str4;
        List<ChooseAccountActivity> list;
        UserSwitchObserver userSwitchObserver;
        Consumer<AuthException> consumer6;
        Consumer<AuthSignUpResult> consumer7;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2;
        Map mapGEmmrt;
        AuthSignUpResult authSignUpResult;
        String str5;
        AnimatorInflater animatorInflaterCopydefault;
        if (continuation instanceof C16321) {
            c16321 = (C16321) continuation;
            int i = c16321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16321.label = i - Integer.MIN_VALUE;
            } else {
                c16321 = new C16321(continuation);
            }
        }
        Object userContextData = c16321.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16321.label;
        String str6 = "";
        if (i2 == 0) {
            C56391yDq.AEQbTJ(userContextData);
            this.logger.verbose("SignUp Starting execution");
            try {
                List<AuthUserAttribute> userAttributes = authSignUpOptions.getUserAttributes();
                Intrinsics.checkNotNullExpressionValue(userAttributes, "");
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(userAttributes, 10));
                for (final AuthUserAttribute authUserAttribute : userAttributes) {
                    try {
                        arrayList.add(ChooseAccountActivity.EZpvd.EZpvd(new Function1<ChooseAccountActivity.TaskDescription, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$userAttributes$1$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ChooseAccountActivity.TaskDescription taskDescription) {
                                invoke2(taskDescription);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ChooseAccountActivity.TaskDescription taskDescription) {
                                Intrinsics.checkNotNullParameter(taskDescription, "");
                                taskDescription.KWHzl(authUserAttribute.getKey().getKeyString());
                                taskDescription.AEQbTJ(authUserAttribute.getValue());
                            }
                        }));
                    } catch (Exception e) {
                        e = e;
                        consumer4 = consumer2;
                        consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Sign up failed."));
                        return Unit.INSTANCE;
                    }
                }
                AuthEnvironment authEnvironment = this.authEnvironment;
                c16321.L$0 = this;
                c16321.L$1 = str;
                str3 = str2;
                c16321.L$2 = str3;
                authSignUpOptions2 = authSignUpOptions;
                c16321.L$3 = authSignUpOptions2;
                consumer5 = consumer;
                c16321.L$4 = consumer5;
                consumer3 = consumer2;
                try {
                    c16321.L$5 = consumer3;
                    c16321.L$6 = arrayList;
                    c16321.label = 1;
                    userContextData = authEnvironment.getUserContextData(str, c16321);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    realAWSCognitoAuthPlugin = this;
                    str4 = str;
                    list = arrayList;
                    consumer4 = consumer3;
                } catch (Exception e2) {
                    e = e2;
                    consumer4 = consumer3;
                    consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Sign up failed."));
                }
            } catch (Exception e3) {
                e = e3;
                consumer3 = consumer2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer6 = (Consumer) c16321.L$2;
                consumer7 = (Consumer) c16321.L$1;
                realAWSCognitoAuthPlugin2 = (RealAWSCognitoAuthPlugin) c16321.L$0;
                try {
                    C56391yDq.AEQbTJ(userContextData);
                    userSwitchObserver = (UserSwitchObserver) userContextData;
                    consumer5 = consumer7;
                    realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
                    consumer4 = consumer6;
                    if (userSwitchObserver == null || (animatorInflaterCopydefault = userSwitchObserver.copydefault()) == null) {
                        mapGEmmrt = null;
                    } else {
                        Pair[] pairArr = new Pair[3];
                        pairArr[0] = C56390yDp.OLrzqt("DESTINATION", animatorInflaterCopydefault.EZpvd());
                        ElapsedRealtimeLong elapsedRealtimeLongCopydefault = animatorInflaterCopydefault.copydefault();
                        pairArr[1] = C56390yDp.OLrzqt(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, elapsedRealtimeLongCopydefault != null ? elapsedRealtimeLongCopydefault.AEQbTJ() : null);
                        pairArr[2] = C56390yDp.OLrzqt("ATTRIBUTE", animatorInflaterCopydefault.KWHzl());
                        mapGEmmrt = C56424yEw.gEmmrt(pairArr);
                    }
                    if (userSwitchObserver == null && userSwitchObserver.AEQbTJ()) {
                        authSignUpResult = new AuthSignUpResult(true, new AuthNextSignUpStep(AuthSignUpStep.DONE, C56424yEw.KWHzl(), null), userSwitchObserver.KWHzl());
                    } else {
                        AuthSignUpStep authSignUpStep = AuthSignUpStep.CONFIRM_SIGN_UP_STEP;
                        Map mapKWHzl = C56424yEw.KWHzl();
                        if (mapGEmmrt != null && (str5 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), "DESTINATION")) != null) {
                            str6 = str5;
                        }
                        authSignUpResult = new AuthSignUpResult(false, new AuthNextSignUpStep(authSignUpStep, mapKWHzl, new AuthCodeDeliveryDetails(str6, AuthCodeDeliveryDetails.DeliveryMedium.fromString(mapGEmmrt == null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), VerifyDAppDomainUrlResponse.LEVEL_MEDIUM) : null), mapGEmmrt == null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), "ATTRIBUTE") : null)), userSwitchObserver != null ? userSwitchObserver.KWHzl() : null);
                    }
                    consumer5.accept(authSignUpResult);
                    realAWSCognitoAuthPlugin.logger.verbose("SignUp Execution complete");
                } catch (Exception e4) {
                    e = e4;
                    consumer4 = consumer6;
                    consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Sign up failed."));
                }
                return Unit.INSTANCE;
            }
            list = (List) c16321.L$6;
            consumer4 = (Consumer) c16321.L$5;
            Consumer<AuthSignUpResult> consumer8 = (Consumer) c16321.L$4;
            authSignUpOptions2 = (AuthSignUpOptions) c16321.L$3;
            String str7 = (String) c16321.L$2;
            str4 = (String) c16321.L$1;
            realAWSCognitoAuthPlugin = (RealAWSCognitoAuthPlugin) c16321.L$0;
            try {
                C56391yDq.AEQbTJ(userContextData);
                consumer5 = consumer8;
                str3 = str7;
            } catch (Exception e5) {
                e = e5;
                consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Sign up failed."));
            }
        }
        final String str8 = (String) userContextData;
        final String pinpointEndpointId = realAWSCognitoAuthPlugin.authEnvironment.getPinpointEndpointId();
        BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
            userSwitchObserver = null;
            if (userSwitchObserver == null) {
            }
            return Unit.INSTANCE;
        }
        VrManager.Application application = new VrManager.Application();
        application.OLrzqt(str4);
        application.EZpvd(str3);
        application.AEQbTJ(list);
        UserPoolConfiguration userPool = realAWSCognitoAuthPlugin.configuration.getUserPool();
        application.KWHzl(userPool != null ? userPool.getAppClient() : null);
        AuthHelper.Companion companion = AuthHelper.Companion;
        UserPoolConfiguration userPool2 = realAWSCognitoAuthPlugin.configuration.getUserPool();
        String appClient = userPool2 != null ? userPool2.getAppClient() : null;
        UserPoolConfiguration userPool3 = realAWSCognitoAuthPlugin.configuration.getUserPool();
        application.copydefault(companion.getSecretHash(str4, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null));
        if (pinpointEndpointId != null) {
            application.AEQbTJ(AccountManagerResponse.OLrzqt.OLrzqt(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$response$1$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AccountManagerResponse.Application application2) {
                    invoke2(application2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AccountManagerResponse.Application application2) {
                    Intrinsics.checkNotNullParameter(application2, "");
                    application2.OLrzqt(pinpointEndpointId);
                }
            }));
        }
        if (str8 != null) {
            application.EZpvd(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$response$1$2$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RestoreDescription.Application application2) {
                    invoke2(application2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RestoreDescription.Application application2) {
                    Intrinsics.checkNotNullParameter(application2, "");
                    application2.copydefault(str8);
                }
            });
        }
        AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = authSignUpOptions2 instanceof AWSCognitoAuthSignUpOptions ? (AWSCognitoAuthSignUpOptions) authSignUpOptions2 : null;
        if (aWSCognitoAuthSignUpOptions != null) {
            Map<String, String> validationData = aWSCognitoAuthSignUpOptions.getValidationData();
            ArrayList arrayList2 = new ArrayList();
            for (final Map.Entry<String, String> entry : validationData.entrySet()) {
                ChooseAccountActivity chooseAccountActivityEZpvd = ChooseAccountActivity.EZpvd.EZpvd(new Function1<ChooseAccountActivity.TaskDescription, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$response$1$3$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ChooseAccountActivity.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ChooseAccountActivity.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                        taskDescription.KWHzl(entry.getKey());
                        taskDescription.AEQbTJ(entry.getValue());
                    }
                });
                if (chooseAccountActivityEZpvd != null) {
                    arrayList2.add(chooseAccountActivityEZpvd);
                }
            }
            application.OLrzqt(arrayList2);
            application.copydefault(aWSCognitoAuthSignUpOptions.getClientMetadata());
        }
        VrManager vrManagerEZpvd = application.EZpvd();
        c16321.L$0 = realAWSCognitoAuthPlugin;
        c16321.L$1 = consumer5;
        c16321.L$2 = consumer4;
        c16321.L$3 = null;
        c16321.L$4 = null;
        c16321.L$5 = null;
        c16321.L$6 = null;
        c16321.label = 2;
        userContextData = cognitoIdentityProviderClient.OLrzqt(vrManagerEZpvd, c16321);
        if (userContextData == objCopydefault) {
            return objCopydefault;
        }
        consumer6 = consumer4;
        consumer7 = consumer5;
        realAWSCognitoAuthPlugin2 = realAWSCognitoAuthPlugin;
        userSwitchObserver = (UserSwitchObserver) userContextData;
        consumer5 = consumer7;
        realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
        consumer4 = consumer6;
        if (userSwitchObserver == null) {
            mapGEmmrt = null;
            if (userSwitchObserver == null) {
                AuthSignUpStep authSignUpStep2 = AuthSignUpStep.CONFIRM_SIGN_UP_STEP;
                Map mapKWHzl2 = C56424yEw.KWHzl();
                if (mapGEmmrt != null) {
                    str6 = str5;
                }
                authSignUpResult = new AuthSignUpResult(false, new AuthNextSignUpStep(authSignUpStep2, mapKWHzl2, new AuthCodeDeliveryDetails(str6, AuthCodeDeliveryDetails.DeliveryMedium.fromString(mapGEmmrt == null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), VerifyDAppDomainUrlResponse.LEVEL_MEDIUM) : null), mapGEmmrt == null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), "ATTRIBUTE") : null)), userSwitchObserver != null ? userSwitchObserver.KWHzl() : null);
                consumer5.accept(authSignUpResult);
                realAWSCognitoAuthPlugin.logger.verbose("SignUp Execution complete");
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(@NotNull String str, @NotNull String str2, @NotNull Consumer<AuthSignUpResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthConfirmSignUpOptions.DefaultAuthConfirmSignUpOptions defaultAuthConfirmSignUpOptionsDefaults = AuthConfirmSignUpOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthConfirmSignUpOptionsDefaults, "");
        confirmSignUp(str, str2, defaultAuthConfirmSignUpOptionsDefaults, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(@NotNull final String str, @NotNull final String str2, @NotNull final AuthConfirmSignUpOptions authConfirmSignUpOptions, @NotNull final Consumer<AuthSignUpResult> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(authConfirmSignUpOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.confirmSignUp.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.NotConfigured) {
                    consumer2.accept(new InvalidUserPoolConfigurationException());
                } else if ((authNState instanceof AuthenticationState.SignedIn) || (authNState instanceof AuthenticationState.SignedOut)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01671(this, str, str2, authConfirmSignUpOptions, consumer, consumer2, null), 3, null);
                } else {
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmSignUp$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $confirmationCode;
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
                final /* synthetic */ AuthConfirmSignUpOptions $options;
                final /* synthetic */ String $username;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01671(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C01671> continuation) {
                    super(2, continuation);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$username = str;
                    this.$confirmationCode = str2;
                    this.$options = authConfirmSignUpOptions;
                    this.$onSuccess = consumer;
                    this.$onError = consumer2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01671(this.this$0, this.$username, this.$confirmationCode, this.$options, this.$onSuccess, this.$onError, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        String str = this.$username;
                        String str2 = this.$confirmationCode;
                        AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
                        Consumer<AuthSignUpResult> consumer = this.$onSuccess;
                        Consumer<AuthException> consumer2 = this.$onError;
                        this.label = 1;
                        if (realAWSCognitoAuthPlugin._confirmSignUp(str, str2, authConfirmSignUpOptions, consumer, consumer2, this) == objCopydefault) {
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
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object _confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, Continuation<? super Unit> continuation) throws Throwable {
        C16181 c16181;
        Consumer<AuthException> consumer3;
        Consumer<AuthException> consumer4;
        AuthConfirmSignUpOptions authConfirmSignUpOptions2;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
        String str3;
        Consumer<AuthSignUpResult> consumer5;
        String str4;
        Consumer<AuthException> consumer6;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2;
        if (continuation instanceof C16181) {
            c16181 = (C16181) continuation;
            int i = c16181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16181.label = i - Integer.MIN_VALUE;
            } else {
                c16181 = new C16181(continuation);
            }
        }
        Object userContextData = c16181.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16181.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(userContextData);
            this.logger.verbose("ConfirmSignUp Starting execution");
            try {
                AuthEnvironment authEnvironment = this.authEnvironment;
                c16181.L$0 = this;
                c16181.L$1 = str;
                c16181.L$2 = str2;
                authConfirmSignUpOptions2 = authConfirmSignUpOptions;
                c16181.L$3 = authConfirmSignUpOptions2;
                c16181.L$4 = consumer;
                consumer3 = consumer2;
                try {
                    c16181.L$5 = consumer3;
                    c16181.label = 1;
                    userContextData = authEnvironment.getUserContextData(str, c16181);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    realAWSCognitoAuthPlugin = this;
                    str3 = str;
                    consumer5 = consumer;
                    str4 = str2;
                    consumer4 = consumer3;
                } catch (Exception e) {
                    e = e;
                    consumer4 = consumer3;
                    consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Confirm sign up failed."));
                }
            } catch (Exception e2) {
                e = e2;
                consumer3 = consumer2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer6 = (Consumer) c16181.L$2;
                consumer5 = (Consumer) c16181.L$1;
                realAWSCognitoAuthPlugin2 = (RealAWSCognitoAuthPlugin) c16181.L$0;
                try {
                    C56391yDq.AEQbTJ(userContextData);
                    realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
                    consumer4 = consumer6;
                    consumer5.accept(new AuthSignUpResult(true, new AuthNextSignUpStep(AuthSignUpStep.DONE, C56424yEw.KWHzl(), null), null));
                    realAWSCognitoAuthPlugin.logger.verbose("ConfirmSignUp Execution complete");
                } catch (Exception e3) {
                    e = e3;
                    consumer4 = consumer6;
                    consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Confirm sign up failed."));
                }
                return Unit.INSTANCE;
            }
            consumer4 = (Consumer) c16181.L$5;
            consumer5 = (Consumer) c16181.L$4;
            authConfirmSignUpOptions2 = (AuthConfirmSignUpOptions) c16181.L$3;
            str4 = (String) c16181.L$2;
            str3 = (String) c16181.L$1;
            realAWSCognitoAuthPlugin = (RealAWSCognitoAuthPlugin) c16181.L$0;
            try {
                C56391yDq.AEQbTJ(userContextData);
            } catch (Exception e4) {
                e = e4;
                consumer4.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Confirm sign up failed."));
            }
        }
        final String str5 = (String) userContextData;
        final String pinpointEndpointId = realAWSCognitoAuthPlugin.authEnvironment.getPinpointEndpointId();
        BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
            IntKeyframeSet.Activity activity = new IntKeyframeSet.Activity();
            activity.KWHzl(str3);
            activity.EZpvd(str4);
            UserPoolConfiguration userPool = realAWSCognitoAuthPlugin.configuration.getUserPool();
            activity.AEQbTJ(userPool != null ? userPool.getAppClient() : null);
            AuthHelper.Companion companion = AuthHelper.Companion;
            UserPoolConfiguration userPool2 = realAWSCognitoAuthPlugin.configuration.getUserPool();
            String appClient = userPool2 != null ? userPool2.getAppClient() : null;
            UserPoolConfiguration userPool3 = realAWSCognitoAuthPlugin.configuration.getUserPool();
            activity.OLrzqt(companion.getSecretHash(str3, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null));
            if (pinpointEndpointId != null) {
                activity.EZpvd(AccountManagerResponse.OLrzqt.OLrzqt(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignUp$2$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AccountManagerResponse.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AccountManagerResponse.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        application.OLrzqt(pinpointEndpointId);
                    }
                }));
            }
            if (str5 != null) {
                activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignUp$2$2$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(RestoreDescription.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull RestoreDescription.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        application.copydefault(str5);
                    }
                });
            }
            AWSCognitoAuthConfirmSignUpOptions aWSCognitoAuthConfirmSignUpOptions = authConfirmSignUpOptions2 instanceof AWSCognitoAuthConfirmSignUpOptions ? (AWSCognitoAuthConfirmSignUpOptions) authConfirmSignUpOptions2 : null;
            if (aWSCognitoAuthConfirmSignUpOptions != null) {
                activity.OLrzqt(aWSCognitoAuthConfirmSignUpOptions.getClientMetadata());
            }
            IntKeyframeSet intKeyframeSetAEQbTJ = activity.AEQbTJ();
            c16181.L$0 = realAWSCognitoAuthPlugin;
            c16181.L$1 = consumer5;
            c16181.L$2 = consumer4;
            c16181.L$3 = null;
            c16181.L$4 = null;
            c16181.L$5 = null;
            c16181.label = 2;
            userContextData = cognitoIdentityProviderClient.copydefault(intKeyframeSetAEQbTJ, c16181);
            if (userContextData == objCopydefault) {
                return objCopydefault;
            }
            consumer6 = consumer4;
            realAWSCognitoAuthPlugin2 = realAWSCognitoAuthPlugin;
            realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
            consumer4 = consumer6;
        }
        consumer5.accept(new AuthSignUpResult(true, new AuthNextSignUpStep(AuthSignUpStep.DONE, C56424yEw.KWHzl(), null), null));
        realAWSCognitoAuthPlugin.logger.verbose("ConfirmSignUp Execution complete");
        return Unit.INSTANCE;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(@NotNull String str, @NotNull Consumer<AuthCodeDeliveryDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthResendSignUpCodeOptions.DefaultAuthResendSignUpCodeOptions defaultAuthResendSignUpCodeOptionsDefaults = AuthResendSignUpCodeOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthResendSignUpCodeOptionsDefaults, "");
        resendSignUpCode(str, defaultAuthResendSignUpCodeOptionsDefaults, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(@NotNull final String str, @NotNull final AuthResendSignUpCodeOptions authResendSignUpCodeOptions, @NotNull final Consumer<AuthCodeDeliveryDetails> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authResendSignUpCodeOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.resendSignUpCode.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.NotConfigured) {
                    consumer2.accept(new InvalidUserPoolConfigurationException());
                } else if ((authNState instanceof AuthenticationState.SignedIn) || (authNState instanceof AuthenticationState.SignedOut)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01751(this, str, authResendSignUpCodeOptions, consumer, consumer2, null), 3, null);
                } else {
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendSignUpCode$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
                final /* synthetic */ AuthResendSignUpCodeOptions $options;
                final /* synthetic */ String $username;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01751(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super C01751> continuation) {
                    super(2, continuation);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$username = str;
                    this.$options = authResendSignUpCodeOptions;
                    this.$onSuccess = consumer;
                    this.$onError = consumer2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01751(this.this$0, this.$username, this.$options, this.$onSuccess, this.$onError, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        String str = this.$username;
                        AuthResendSignUpCodeOptions authResendSignUpCodeOptions = this.$options;
                        Consumer<AuthCodeDeliveryDetails> consumer = this.$onSuccess;
                        Consumer<AuthException> consumer2 = this.$onError;
                        this.label = 1;
                        if (realAWSCognitoAuthPlugin._resendSignUpCode(str, authResendSignUpCodeOptions, consumer, consumer2, this) == objCopydefault) {
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
        });
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x01b2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:96:0x002b */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145 A[Catch: Exception -> 0x0063, TRY_ENTER, TryCatch #1 {Exception -> 0x0063, blocks: (B:13:0x003e, B:60:0x0137, B:65:0x0145, B:67:0x014b, B:69:0x015f, B:71:0x0165, B:73:0x017d, B:75:0x0181, B:79:0x018d, B:81:0x0195, B:83:0x019b, B:84:0x01a2, B:18:0x005f, B:37:0x00a4, B:39:0x00b8, B:41:0x00c7, B:43:0x00cd, B:45:0x00df, B:47:0x00e7, B:49:0x00f1, B:51:0x00f9, B:53:0x0105, B:55:0x0115, B:56:0x011d), top: B:96:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d A[Catch: Exception -> 0x0063, TRY_ENTER, TryCatch #1 {Exception -> 0x0063, blocks: (B:13:0x003e, B:60:0x0137, B:65:0x0145, B:67:0x014b, B:69:0x015f, B:71:0x0165, B:73:0x017d, B:75:0x0181, B:79:0x018d, B:81:0x0195, B:83:0x019b, B:84:0x01a2, B:18:0x005f, B:37:0x00a4, B:39:0x00b8, B:41:0x00c7, B:43:0x00cd, B:45:0x00df, B:47:0x00e7, B:49:0x00f1, B:51:0x00f9, B:53:0x0105, B:55:0x0115, B:56:0x011d), top: B:96:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:13:0x003e, B:60:0x0137, B:65:0x0145, B:67:0x014b, B:69:0x015f, B:71:0x0165, B:73:0x017d, B:75:0x0181, B:79:0x018d, B:81:0x0195, B:83:0x019b, B:84:0x01a2, B:18:0x005f, B:37:0x00a4, B:39:0x00b8, B:41:0x00c7, B:43:0x00cd, B:45:0x00df, B:47:0x00e7, B:49:0x00f1, B:51:0x00f9, B:53:0x0105, B:55:0x0115, B:56:0x011d), top: B:96:0x002b }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.amplifyframework.core.Consumer] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object _resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, Continuation<? super Unit> continuation) throws Throwable {
        C16251 c16251;
        ?? r10;
        Consumer<AuthCodeDeliveryDetails> consumer3;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
        String str2;
        Map<String, String> map;
        ?? r2;
        ProfilerInfo profilerInfo;
        Consumer<AuthCodeDeliveryDetails> consumer4;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2;
        Map mapGEmmrt;
        AnimatorInflater animatorInflaterAEQbTJ;
        ?? r22;
        ?? r23 = authResendSignUpCodeOptions;
        if (continuation instanceof C16251) {
            c16251 = (C16251) continuation;
            int i = c16251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16251.label = i - Integer.MIN_VALUE;
            } else {
                c16251 = new C16251(continuation);
            }
        }
        Object userContextData = c16251.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16251.label;
        try {
        } catch (Exception e) {
            e = e;
            r10 = r23;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(userContextData);
            this.logger.verbose("ResendSignUpCode Starting execution");
            try {
                AWSCognitoAuthResendSignUpCodeOptions aWSCognitoAuthResendSignUpCodeOptions = r23 instanceof AWSCognitoAuthResendSignUpCodeOptions ? (AWSCognitoAuthResendSignUpCodeOptions) r23 : null;
                Map<String, String> metadata = aWSCognitoAuthResendSignUpCodeOptions != null ? aWSCognitoAuthResendSignUpCodeOptions.getMetadata() : null;
                AuthEnvironment authEnvironment = this.authEnvironment;
                c16251.L$0 = this;
                c16251.L$1 = str;
                consumer3 = consumer;
                c16251.L$2 = consumer3;
                r10 = consumer2;
                try {
                    c16251.L$3 = r10;
                    c16251.L$4 = metadata;
                    c16251.label = 1;
                    userContextData = authEnvironment.getUserContextData(str, c16251);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    realAWSCognitoAuthPlugin = this;
                    str2 = str;
                    map = metadata;
                    r2 = r10;
                } catch (Exception e2) {
                    e = e2;
                    r10.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Resend sign up code failed."));
                }
            } catch (Exception e3) {
                e = e3;
                r10 = consumer2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Consumer consumer5 = (Consumer) c16251.L$2;
                consumer4 = (Consumer) c16251.L$1;
                realAWSCognitoAuthPlugin2 = (RealAWSCognitoAuthPlugin) c16251.L$0;
                C56391yDq.AEQbTJ(userContextData);
                r22 = consumer5;
                profilerInfo = (ProfilerInfo) userContextData;
                consumer3 = consumer4;
                realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
                r23 = r22;
                if (profilerInfo == null || (animatorInflaterAEQbTJ = profilerInfo.AEQbTJ()) == null) {
                    mapGEmmrt = null;
                } else {
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = C56390yDp.OLrzqt("DESTINATION", animatorInflaterAEQbTJ.EZpvd());
                    ElapsedRealtimeLong elapsedRealtimeLongCopydefault = animatorInflaterAEQbTJ.copydefault();
                    pairArr[1] = C56390yDp.OLrzqt(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, elapsedRealtimeLongCopydefault != null ? elapsedRealtimeLongCopydefault.AEQbTJ() : null);
                    pairArr[2] = C56390yDp.OLrzqt("ATTRIBUTE", animatorInflaterAEQbTJ.KWHzl());
                    mapGEmmrt = C56424yEw.gEmmrt(pairArr);
                }
                if (mapGEmmrt != null || (str = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), "DESTINATION")) == null) {
                    String str3 = "";
                }
                consumer3.accept(new AuthCodeDeliveryDetails(str3, AuthCodeDeliveryDetails.DeliveryMedium.fromString(mapGEmmrt == null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), VerifyDAppDomainUrlResponse.LEVEL_MEDIUM) : null), mapGEmmrt != null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), "ATTRIBUTE") : null));
                realAWSCognitoAuthPlugin.logger.verbose("ResendSignUpCode Execution complete");
                return Unit.INSTANCE;
            }
            map = (Map) c16251.L$4;
            Consumer consumer6 = (Consumer) c16251.L$3;
            consumer3 = (Consumer) c16251.L$2;
            str2 = (String) c16251.L$1;
            realAWSCognitoAuthPlugin = (RealAWSCognitoAuthPlugin) c16251.L$0;
            C56391yDq.AEQbTJ(userContextData);
            r2 = consumer6;
        }
        final String str4 = (String) userContextData;
        final String pinpointEndpointId = realAWSCognitoAuthPlugin.authEnvironment.getPinpointEndpointId();
        BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
            profilerInfo = null;
            r23 = r2;
            if (profilerInfo == null) {
            }
            return Unit.INSTANCE;
        }
        Presentation.TaskDescription taskDescription = new Presentation.TaskDescription();
        UserPoolConfiguration userPool = realAWSCognitoAuthPlugin.configuration.getUserPool();
        taskDescription.EZpvd(userPool != null ? userPool.getAppClient() : null);
        taskDescription.copydefault(str2);
        AuthHelper.Companion companion = AuthHelper.Companion;
        UserPoolConfiguration userPool2 = realAWSCognitoAuthPlugin.configuration.getUserPool();
        String appClient = userPool2 != null ? userPool2.getAppClient() : null;
        UserPoolConfiguration userPool3 = realAWSCognitoAuthPlugin.configuration.getUserPool();
        taskDescription.AEQbTJ(companion.getSecretHash(str2, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null));
        taskDescription.EZpvd(map);
        if (pinpointEndpointId != null) {
            taskDescription.AEQbTJ(AccountManagerResponse.OLrzqt.OLrzqt(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_resendSignUpCode$response$1$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AccountManagerResponse.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AccountManagerResponse.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                    application.OLrzqt(pinpointEndpointId);
                }
            }));
        }
        if (str4 != null) {
            taskDescription.copydefault(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_resendSignUpCode$response$1$2$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RestoreDescription.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RestoreDescription.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                    application.copydefault(str4);
                }
            });
        }
        Presentation presentationOLrzqt = taskDescription.OLrzqt();
        c16251.L$0 = realAWSCognitoAuthPlugin;
        c16251.L$1 = consumer3;
        c16251.L$2 = r2;
        c16251.L$3 = null;
        c16251.L$4 = null;
        c16251.label = 2;
        userContextData = cognitoIdentityProviderClient.KWHzl(presentationOLrzqt, c16251);
        if (userContextData == objCopydefault) {
            return objCopydefault;
        }
        consumer4 = consumer3;
        realAWSCognitoAuthPlugin2 = realAWSCognitoAuthPlugin;
        r22 = r2;
        profilerInfo = (ProfilerInfo) userContextData;
        consumer3 = consumer4;
        realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
        r23 = r22;
        if (profilerInfo == null) {
            mapGEmmrt = null;
            if (mapGEmmrt != null) {
                String str32 = "";
                consumer3.accept(new AuthCodeDeliveryDetails(str32, AuthCodeDeliveryDetails.DeliveryMedium.fromString(mapGEmmrt == null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), VerifyDAppDomainUrlResponse.LEVEL_MEDIUM) : null), mapGEmmrt != null ? (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapGEmmrt), "ATTRIBUTE") : null));
                realAWSCognitoAuthPlugin.logger.verbose("ResendSignUpCode Execution complete");
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthSignInOptions.DefaultAuthSignInOptions defaultAuthSignInOptionsDefaults = AuthSignInOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthSignInOptionsDefaults, "");
        signIn(str, str2, defaultAuthSignInOptionsDefaults, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(final String str, final String str2, @NotNull final AuthSignInOptions authSignInOptions, @NotNull final Consumer<AuthSignInResult> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authSignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signIn.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthSignInOptions authSignInOptions2 = authSignInOptions;
                AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptionsBuild = authSignInOptions2 instanceof AWSCognitoAuthSignInOptions ? (AWSCognitoAuthSignInOptions) authSignInOptions2 : null;
                if (aWSCognitoAuthSignInOptionsBuild == null) {
                    aWSCognitoAuthSignInOptionsBuild = AWSCognitoAuthSignInOptions.builder().authFlowType(this.configuration.getAuthFlowType()).build();
                    Intrinsics.checkNotNullExpressionValue(aWSCognitoAuthSignInOptionsBuild, "");
                }
                final AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions = aWSCognitoAuthSignInOptionsBuild;
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.NotConfigured) {
                    consumer2.accept(new InvalidUserPoolConfigurationException());
                    return;
                }
                if ((authNState instanceof AuthenticationState.SignedOut) || (authNState instanceof AuthenticationState.Configured)) {
                    this._signIn(str, str2, aWSCognitoAuthSignInOptions, consumer, consumer2);
                    return;
                }
                if (authNState instanceof AuthenticationState.SignedIn) {
                    consumer2.accept(new SignedInException(null, null, 3, null));
                    return;
                }
                if (authNState instanceof AuthenticationState.SigningIn) {
                    final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                    AuthStateMachine authStateMachine = this.authStateMachine;
                    final RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this;
                    final String str3 = str;
                    final String str4 = str2;
                    final Consumer<AuthSignInResult> consumer3 = consumer;
                    final Consumer<AuthException> consumer4 = consumer2;
                    Function1<AuthState, Unit> function1 = new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signIn.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AuthState authState2) {
                            invoke2(authState2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull AuthState authState2) {
                            Intrinsics.checkNotNullParameter(authState2, "");
                            if (authState2.getAuthNState() instanceof AuthenticationState.SignedOut) {
                                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                                realAWSCognitoAuthPlugin._signIn(str3, str4, aWSCognitoAuthSignInOptions, consumer3, consumer4);
                            }
                        }
                    };
                    final RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this;
                    authStateMachine.listen(stateChangeListenerToken, function1, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signIn.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            realAWSCognitoAuthPlugin2.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
                        }
                    });
                    return;
                }
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _signIn(final String str, final String str2, final AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, final Consumer<AuthSignInResult> consumer, final Consumer<AuthException> consumer2) {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._signIn.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                AuthorizationState authZState = authState.getAuthZState();
                if (authNState instanceof AuthenticationState.SigningIn) {
                    SignInState signInState = ((AuthenticationState.SigningIn) authNState).getSignInState();
                    SignInState.SigningInWithSRP signingInWithSRP = signInState instanceof SignInState.SigningInWithSRP ? (SignInState.SigningInWithSRP) signInState : null;
                    SRPSignInState srpSignInState = signingInWithSRP != null ? signingInWithSRP.getSrpSignInState() : null;
                    SignInState.ResolvingChallenge resolvingChallenge = signInState instanceof SignInState.ResolvingChallenge ? (SignInState.ResolvingChallenge) signInState : null;
                    SignInChallengeState challengeState = resolvingChallenge != null ? resolvingChallenge.getChallengeState() : null;
                    SignInState.ResolvingTOTPSetup resolvingTOTPSetup = signInState instanceof SignInState.ResolvingTOTPSetup ? (SignInState.ResolvingTOTPSetup) signInState : null;
                    SetupTOTPState setupTOTPState = resolvingTOTPSetup != null ? resolvingTOTPSetup.getSetupTOTPState() : null;
                    if (srpSignInState instanceof SRPSignInState.Error) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        consumer2.accept(CognitoAuthExceptionConverter.Companion.lookup(((SRPSignInState.Error) srpSignInState).getException(), "Sign in failed."));
                        return;
                    }
                    if (signInState instanceof SignInState.Error) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        consumer2.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignInState.Error) signInState).getException(), "Sign in failed."));
                        return;
                    } else if (challengeState instanceof SignInChallengeState.WaitingForAnswer) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        SignInChallengeHelper.INSTANCE.getNextStep(((SignInChallengeState.WaitingForAnswer) challengeState).getChallenge(), consumer, consumer2, (16 & 8) != 0 ? null : null, (16 & 16) != 0 ? null : null);
                        return;
                    } else {
                        if (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                            SetupTOTPState.WaitingForAnswer waitingForAnswer = (SetupTOTPState.WaitingForAnswer) setupTOTPState;
                            SignInChallengeHelper.INSTANCE.getNextStep(new AuthChallenge(GrantCredentialsPermissionActivity.Fragment.EZpvd.copydefault(), null, null, null), consumer, consumer2, (16 & 8) != 0 ? null : waitingForAnswer.getSignInTOTPSetupData(), (16 & 16) != 0 ? null : null);
                            waitingForAnswer.setHasNewResponse(false);
                            return;
                        }
                        return;
                    }
                }
                if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    consumer.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, C56424yEw.KWHzl(), null, null, null)));
                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
                }
            }
        }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._signIn.2

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signIn$2$WhenMappings */
            /* JADX INFO: loaded from: classes21.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[AuthFlowType.values().length];
                    try {
                        iArr[AuthFlowType.USER_SRP_AUTH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AuthFlowType.CUSTOM_AUTH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AuthFlowType.CUSTOM_AUTH_WITHOUT_SRP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AuthFlowType.CUSTOM_AUTH_WITH_SRP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AuthFlowType.USER_PASSWORD_AUTH.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SignInData sRPSignInData;
                AuthFlowType authFlowType = aWSCognitoAuthSignInOptions.getAuthFlowType();
                if (authFlowType == null) {
                    authFlowType = this.configuration.getAuthFlowType();
                }
                int i = WhenMappings.$EnumSwitchMapping$0[authFlowType.ordinal()];
                if (i == 1) {
                    String str3 = str;
                    String str4 = str2;
                    Map<String, String> metadata = aWSCognitoAuthSignInOptions.getMetadata();
                    Intrinsics.checkNotNullExpressionValue(metadata, "");
                    sRPSignInData = new SignInData.SRPSignInData(str3, str4, metadata);
                } else if (i == 2 || i == 3) {
                    String str5 = str;
                    Map<String, String> metadata2 = aWSCognitoAuthSignInOptions.getMetadata();
                    Intrinsics.checkNotNullExpressionValue(metadata2, "");
                    sRPSignInData = new SignInData.CustomAuthSignInData(str5, metadata2);
                } else if (i == 4) {
                    String str6 = str;
                    String str7 = str2;
                    Map<String, String> metadata3 = aWSCognitoAuthSignInOptions.getMetadata();
                    Intrinsics.checkNotNullExpressionValue(metadata3, "");
                    sRPSignInData = new SignInData.CustomSRPAuthSignInData(str6, str7, metadata3);
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str8 = str;
                    String str9 = str2;
                    Map<String, String> metadata4 = aWSCognitoAuthSignInOptions.getMetadata();
                    Intrinsics.checkNotNullExpressionValue(metadata4, "");
                    sRPSignInData = new SignInData.MigrationAuthSignInData(str8, str9, metadata4);
                }
                this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(sRPSignInData), null, 2, null));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(@NotNull String str, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthConfirmSignInOptions.DefaultAuthConfirmSignInOptions defaultAuthConfirmSignInOptionsDefaults = AuthConfirmSignInOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthConfirmSignInOptionsDefaults, "");
        confirmSignIn(str, defaultAuthConfirmSignInOptionsDefaults, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(@NotNull final String str, @NotNull final AuthConfirmSignInOptions authConfirmSignInOptions, @NotNull final Consumer<AuthSignInResult> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authConfirmSignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.confirmSignIn.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                AuthenticationState.SigningIn signingIn = authNState instanceof AuthenticationState.SigningIn ? (AuthenticationState.SigningIn) authNState : null;
                SignInState signInState = signingIn != null ? signingIn.getSignInState() : null;
                if (signInState instanceof SignInState.ResolvingChallenge) {
                    SignInChallengeState challengeState = ((SignInState.ResolvingChallenge) signInState).getChallengeState();
                    if ((challengeState instanceof SignInChallengeState.WaitingForAnswer) || (challengeState instanceof SignInChallengeState.Error)) {
                        RealAWSCognitoAuthPlugin.this._confirmSignIn(signInState, str, authConfirmSignInOptions, consumer, consumer2);
                        return;
                    } else {
                        consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                        return;
                    }
                }
                if (signInState instanceof SignInState.ResolvingTOTPSetup) {
                    SetupTOTPState setupTOTPState = ((SignInState.ResolvingTOTPSetup) signInState).getSetupTOTPState();
                    if ((setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) || (setupTOTPState instanceof SetupTOTPState.Error)) {
                        RealAWSCognitoAuthPlugin.this._confirmSignIn(signInState, str, authConfirmSignInOptions, consumer, consumer2);
                        return;
                    } else {
                        consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                        return;
                    }
                }
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _confirmSignIn(final SignInState signInState, final String str, final AuthConfirmSignInOptions authConfirmSignInOptions, final Consumer<AuthSignInResult> consumer, final Consumer<AuthException> consumer2) {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._confirmSignIn.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) throws UnknownException {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [716=4] */
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2(@NotNull AuthState authState) throws UnknownException {
                AuthSignInStep authSignInStep;
                String str2;
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                AuthorizationState authZState = authState.getAuthZState();
                Set<MFAType> allowedMFATypes = null;
                AuthenticationState.SigningIn signingIn = authNState instanceof AuthenticationState.SigningIn ? (AuthenticationState.SigningIn) authNState : null;
                SignInState signInState2 = signingIn != null ? signingIn.getSignInState() : null;
                boolean z = signInState2 instanceof SignInState.ResolvingTOTPSetup;
                SignInState.ResolvingTOTPSetup resolvingTOTPSetup = z ? (SignInState.ResolvingTOTPSetup) signInState2 : null;
                SetupTOTPState setupTOTPState = resolvingTOTPSetup != null ? resolvingTOTPSetup.getSetupTOTPState() : null;
                if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    consumer.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, C56424yEw.KWHzl(), null, null, null)));
                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
                    return;
                }
                if (signInState2 instanceof SignInState.Error) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    consumer2.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignInState.Error) signInState2).getException(), "Confirm Sign in failed."));
                    return;
                }
                boolean z2 = signInState2 instanceof SignInState.ResolvingChallenge;
                if (z2) {
                    SignInState.ResolvingChallenge resolvingChallenge = (SignInState.ResolvingChallenge) signInState2;
                    if (resolvingChallenge.getChallengeState() instanceof SignInChallengeState.WaitingForAnswer) {
                        SignInChallengeState challengeState = resolvingChallenge.getChallengeState();
                        Intrinsics.copydefault(challengeState, "");
                        if (((SignInChallengeState.WaitingForAnswer) challengeState).getHasNewResponse()) {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                            SignInChallengeState challengeState2 = resolvingChallenge.getChallengeState();
                            Intrinsics.copydefault(challengeState2, "");
                            SignInChallengeState.WaitingForAnswer waitingForAnswer = (SignInChallengeState.WaitingForAnswer) challengeState2;
                            String challengeName = waitingForAnswer.getChallenge().getChallengeName();
                            switch (challengeName.hashCode()) {
                                case -1362602558:
                                    authSignInStep = !challengeName.equals("SMS_MFA") ? AuthSignInStep.CONFIRM_SIGN_IN_WITH_CUSTOM_CHALLENGE : AuthSignInStep.CONFIRM_SIGN_IN_WITH_SMS_MFA_CODE;
                                    break;
                                case 161754570:
                                    if (challengeName.equals("SOFTWARE_TOKEN_MFA")) {
                                        authSignInStep = AuthSignInStep.CONFIRM_SIGN_IN_WITH_TOTP_CODE;
                                        break;
                                    }
                                    break;
                                case 338106308:
                                    if (challengeName.equals("NEW_PASSWORD_REQUIRED")) {
                                        authSignInStep = AuthSignInStep.CONFIRM_SIGN_IN_WITH_NEW_PASSWORD;
                                        break;
                                    }
                                    break;
                                case 872896308:
                                    if (challengeName.equals("SELECT_MFA_TYPE")) {
                                        Map<String, String> parameters = waitingForAnswer.getChallenge().getParameters();
                                        if (parameters != null && (str2 = parameters.get("MFAS_CAN_CHOOSE")) != null) {
                                            allowedMFATypes = SignInChallengeHelper.INSTANCE.getAllowedMFATypes(str2);
                                        }
                                        authSignInStep = AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SELECTION;
                                        break;
                                    }
                                    break;
                            }
                            AuthSignInStep authSignInStep2 = authSignInStep;
                            Set<MFAType> set = allowedMFATypes;
                            Map<String, String> parameters2 = waitingForAnswer.getChallenge().getParameters();
                            if (parameters2 == null) {
                                parameters2 = C56424yEw.KWHzl();
                            }
                            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(authSignInStep2, parameters2, null, null, set)));
                            SignInChallengeState challengeState3 = resolvingChallenge.getChallengeState();
                            Intrinsics.copydefault(challengeState3, "");
                            ((SignInChallengeState.WaitingForAnswer) challengeState3).setHasNewResponse(false);
                            return;
                        }
                    }
                }
                if (z && (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer)) {
                    SetupTOTPState.WaitingForAnswer waitingForAnswer2 = (SetupTOTPState.WaitingForAnswer) setupTOTPState;
                    if (waitingForAnswer2.getHasNewResponse()) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        SignInChallengeHelper.INSTANCE.getNextStep(new AuthChallenge(GrantCredentialsPermissionActivity.Fragment.EZpvd.copydefault(), null, null, null), consumer, consumer2, (16 & 8) != 0 ? null : waitingForAnswer2.getSignInTOTPSetupData(), (16 & 16) != 0 ? null : null);
                        waitingForAnswer2.setHasNewResponse(false);
                        return;
                    }
                }
                if (z && (setupTOTPState instanceof SetupTOTPState.Error)) {
                    SetupTOTPState.Error error = (SetupTOTPState.Error) setupTOTPState;
                    if (error.getHasNewResponse()) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        consumer2.accept(CognitoAuthExceptionConverter.Companion.lookup(error.getException(), "Confirm Sign in failed."));
                        error.setHasNewResponse(false);
                        return;
                    }
                }
                if (z2) {
                    SignInState.ResolvingChallenge resolvingChallenge2 = (SignInState.ResolvingChallenge) signInState2;
                    if (resolvingChallenge2.getChallengeState() instanceof SignInChallengeState.Error) {
                        SignInChallengeState challengeState4 = resolvingChallenge2.getChallengeState();
                        Intrinsics.copydefault(challengeState4, "");
                        if (((SignInChallengeState.Error) challengeState4).getHasNewResponse()) {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                            Consumer<AuthException> consumer3 = consumer2;
                            CognitoAuthExceptionConverter.Companion companion = CognitoAuthExceptionConverter.Companion;
                            SignInChallengeState challengeState5 = resolvingChallenge2.getChallengeState();
                            Intrinsics.copydefault(challengeState5, "");
                            consumer3.accept(companion.lookup(((SignInChallengeState.Error) challengeState5).getException(), "Confirm Sign in failed."));
                            SignInChallengeState challengeState6 = resolvingChallenge2.getChallengeState();
                            Intrinsics.copydefault(challengeState6, "");
                            ((SignInChallengeState.Error) challengeState6).setHasNewResponse(false);
                        }
                    }
                }
            }
        }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._confirmSignIn.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Map<String, String> mapKWHzl;
                List<AuthUserAttribute> listAhwBna;
                AuthConfirmSignInOptions authConfirmSignInOptions2 = authConfirmSignInOptions;
                AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = authConfirmSignInOptions2 instanceof AWSCognitoAuthConfirmSignInOptions ? (AWSCognitoAuthConfirmSignInOptions) authConfirmSignInOptions2 : null;
                if (aWSCognitoAuthConfirmSignInOptions == null || (mapKWHzl = aWSCognitoAuthConfirmSignInOptions.getMetadata()) == null) {
                    mapKWHzl = C56424yEw.KWHzl();
                }
                if (aWSCognitoAuthConfirmSignInOptions == null || (listAhwBna = aWSCognitoAuthConfirmSignInOptions.getUserAttributes()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                SignInState signInState2 = signInState;
                if (signInState2 instanceof SignInState.ResolvingChallenge) {
                    SignInChallengeState challengeState = signInState2.getChallengeState();
                    if (!(challengeState instanceof SignInChallengeState.WaitingForAnswer) || !Intrinsics.EZpvd((Object) ((SignInChallengeState.WaitingForAnswer) challengeState).getChallenge().getChallengeName(), (Object) "SELECT_MFA_TYPE") || MFAHelperKt.getMFATypeOrNull(str) != null) {
                        this.authStateMachine.send(new SignInChallengeEvent(new SignInChallengeEvent.EventType.VerifyChallengeAnswer(str, mapKWHzl, listAhwBna), null, 2, null));
                        return;
                    } else {
                        consumer2.accept(new InvalidParameterException("Value for challengeResponse must be one of SMS_MFA or SOFTWARE_TOKEN_MFA", null, 2, null));
                        return;
                    }
                }
                if (signInState2 instanceof SignInState.ResolvingTOTPSetup) {
                    SetupTOTPState setupTOTPState = signInState2.getSetupTOTPState();
                    if (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) {
                        SetupTOTPState setupTOTPState2 = signInState.getSetupTOTPState();
                        Intrinsics.copydefault(setupTOTPState2, "");
                        SignInTOTPSetupData signInTOTPSetupData = ((SetupTOTPState.WaitingForAnswer) setupTOTPState2).getSignInTOTPSetupData();
                        this.authStateMachine.send(new SetupTOTPEvent(new SetupTOTPEvent.EventType.VerifyChallengeAnswer(str, signInTOTPSetupData.getUsername(), signInTOTPSetupData.getSession(), aWSCognitoAuthConfirmSignInOptions != null ? aWSCognitoAuthConfirmSignInOptions.getFriendlyDeviceName() : null), null, 2, null));
                        return;
                    }
                    if (setupTOTPState instanceof SetupTOTPState.Error) {
                        SetupTOTPState setupTOTPState3 = signInState.getSetupTOTPState();
                        Intrinsics.copydefault(setupTOTPState3, "");
                        String username = ((SetupTOTPState.Error) setupTOTPState3).getUsername();
                        SetupTOTPState setupTOTPState4 = signInState.getSetupTOTPState();
                        Intrinsics.copydefault(setupTOTPState4, "");
                        this.authStateMachine.send(new SetupTOTPEvent(new SetupTOTPEvent.EventType.VerifyChallengeAnswer(str, username, ((SetupTOTPState.Error) setupTOTPState4).getSession(), aWSCognitoAuthConfirmSignInOptions != null ? aWSCognitoAuthConfirmSignInOptions.getFriendlyDeviceName() : null), null, 2, null));
                        return;
                    }
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                    return;
                }
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(@NotNull AuthProvider authProvider, @NotNull Activity activity, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authProvider, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptionsBuild = AWSCognitoAuthWebUISignInOptions.builder().build();
        Intrinsics.checkNotNullExpressionValue(aWSCognitoAuthWebUISignInOptionsBuild, "");
        signInWithSocialWebUI(authProvider, activity, aWSCognitoAuthWebUISignInOptionsBuild, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(@NotNull AuthProvider authProvider, @NotNull Activity activity, @NotNull AuthWebUISignInOptions authWebUISignInOptions, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authProvider, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(authWebUISignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        signInWithHostedUI(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(@NotNull Activity activity, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthWebUISignInOptions authWebUISignInOptionsBuild = AuthWebUISignInOptions.builder().build();
        Intrinsics.checkNotNullExpressionValue(authWebUISignInOptionsBuild, "");
        signInWithWebUI(activity, authWebUISignInOptionsBuild, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(@NotNull Activity activity, @NotNull AuthWebUISignInOptions authWebUISignInOptions, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(authWebUISignInOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        signInWithHostedUI$default(this, null, activity, authWebUISignInOptions, consumer, consumer2, 1, null);
    }

    public static /* synthetic */ void signInWithHostedUI$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if ((i & 1) != 0) {
            authProvider = null;
        }
        realAWSCognitoAuthPlugin.signInWithHostedUI(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    private final void signInWithHostedUI(final AuthProvider authProvider, final Activity activity, final AuthWebUISignInOptions authWebUISignInOptions, final Consumer<AuthSignInResult> consumer, final Consumer<AuthException> consumer2) {
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signInWithHostedUI.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.NotConfigured) {
                    consumer2.accept(new InvalidUserPoolConfigurationException());
                    return;
                }
                if (authNState instanceof AuthenticationState.SignedOut) {
                    if (this.configuration.getOauth() != null) {
                        this._signInWithHostedUI(activity, authWebUISignInOptions, consumer, consumer2, authProvider);
                        return;
                    } else {
                        consumer2.accept(new InvalidOauthConfigurationException());
                        return;
                    }
                }
                if (authNState instanceof AuthenticationState.SignedIn) {
                    consumer2.accept(new SignedInException(null, null, 3, null));
                    return;
                }
                if (authNState instanceof AuthenticationState.SigningIn) {
                    final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                    AuthStateMachine authStateMachine = this.authStateMachine;
                    final RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this;
                    final Activity activity2 = activity;
                    final AuthWebUISignInOptions authWebUISignInOptions2 = authWebUISignInOptions;
                    final Consumer<AuthSignInResult> consumer3 = consumer;
                    final Consumer<AuthException> consumer4 = consumer2;
                    final AuthProvider authProvider2 = authProvider;
                    Function1<AuthState, Unit> function1 = new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signInWithHostedUI.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AuthState authState2) {
                            invoke2(authState2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull AuthState authState2) {
                            Intrinsics.checkNotNullParameter(authState2, "");
                            if (authState2.getAuthNState() instanceof AuthenticationState.SignedOut) {
                                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                                realAWSCognitoAuthPlugin._signInWithHostedUI(activity2, authWebUISignInOptions2, consumer3, consumer4, authProvider2);
                            }
                        }
                    };
                    final RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this;
                    authStateMachine.listen(stateChangeListenerToken, function1, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signInWithHostedUI.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            realAWSCognitoAuthPlugin2.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
                        }
                    });
                    return;
                }
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        });
    }

    public static /* synthetic */ void _signInWithHostedUI$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, AuthProvider authProvider, int i, Object obj) {
        if ((i & 16) != 0) {
            authProvider = null;
        }
        realAWSCognitoAuthPlugin._signInWithHostedUI(activity, authWebUISignInOptions, consumer, consumer2, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _signInWithHostedUI(final Activity activity, final AuthWebUISignInOptions authWebUISignInOptions, final Consumer<AuthSignInResult> consumer, final Consumer<AuthException> consumer2, final AuthProvider authProvider) {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._signInWithHostedUI.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                AuthException unknownException;
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                AuthorizationState authZState = authState.getAuthZState();
                if (authNState instanceof AuthenticationState.SigningIn) {
                    HostedUISignInState hostedUISignInState = ((AuthenticationState.SigningIn) authNState).getSignInState().getHostedUISignInState();
                    if (hostedUISignInState instanceof HostedUISignInState.Error) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        Exception exception = ((HostedUISignInState.Error) hostedUISignInState).getException();
                        Consumer<AuthException> consumer3 = consumer2;
                        if (exception instanceof AuthException) {
                            unknownException = (AuthException) exception;
                        } else {
                            unknownException = new UnknownException("Sign in failed", exception);
                        }
                        consumer3.accept(unknownException);
                        RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
                        return;
                    }
                    return;
                }
                if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    consumer.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, C56424yEw.KWHzl(), null, null, null)));
                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
                }
            }
        }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._signInWithHostedUI.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(new SignInData.HostedUISignInData(HostedUIHelper.INSTANCE.createHostedUIOptions(activity, authProvider, authWebUISignInOptions))), null, 2, null));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void handleWebUISignInResponse(final Intent intent) {
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.handleWebUISignInResponse.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                HostedUIErrorData hostedUIErrorData;
                Uri uriCreateSignOutUri$aws_auth_cognito_release;
                Intrinsics.checkNotNullParameter(authState, "");
                Intent intent2 = intent;
                Uri data = intent2 != null ? intent2.getData() : null;
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SigningOut) {
                    SignOutState signOutState = ((AuthenticationState.SigningOut) authNState).getSignOutState();
                    SignOutState.SigningOutHostedUI signingOutHostedUI = signOutState instanceof SignOutState.SigningOutHostedUI ? (SignOutState.SigningOutHostedUI) signOutState : null;
                    if (signingOutHostedUI != null) {
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this;
                        if (data == null && !signingOutHostedUI.getBypassCancel() && !Intrinsics.EZpvd(signingOutHostedUI.getSignedInData().getSignInMethod(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN))) {
                            realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.UserCancelled(signingOutHostedUI.getSignedInData()), null, 2, null));
                            return;
                        }
                        if (data == null) {
                            HostedUIClient hostedUIClient = realAWSCognitoAuthPlugin.authEnvironment.getHostedUIClient();
                            hostedUIErrorData = new HostedUIErrorData((hostedUIClient == null || (uriCreateSignOutUri$aws_auth_cognito_release = hostedUIClient.createSignOutUri$aws_auth_cognito_release()) == null) ? null : uriCreateSignOutUri$aws_auth_cognito_release.toString(), new HostedUISignOutException(realAWSCognitoAuthPlugin.authEnvironment.getHostedUIClient() != null));
                        } else {
                            hostedUIErrorData = null;
                        }
                        if (signingOutHostedUI.getGlobalSignOut()) {
                            realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(signingOutHostedUI.getSignedInData(), hostedUIErrorData), null, 2, null));
                            return;
                        } else {
                            realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signingOutHostedUI.getSignedInData(), hostedUIErrorData, null, 4, null), null, 2, null));
                            return;
                        }
                    }
                    return;
                }
                if (!(authNState instanceof AuthenticationState.SigningIn)) {
                    this.logger.warn("Received handleWebUIResponse but ignoring because the user is not currently signing in or signing out");
                } else if (data != null) {
                    this.authStateMachine.send(new HostedUIEvent(new HostedUIEvent.EventType.FetchToken(data), null, 2, null));
                } else {
                    this.authStateMachine.send(new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(new UserCancelledException("The user cancelled the sign-in attempt, so it did not complete.", "To recover: catch this error, and show the sign-in screen again.")), null, 2, null));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSession(Continuation<? super AWSCognitoAuthSession> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getSession$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSession authSession) {
                Intrinsics.checkNotNullParameter(authSession, "");
                if (authSession instanceof AWSCognitoAuthSession) {
                    Continuation<AWSCognitoAuthSession> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(authSession));
                } else {
                    Continuation<AWSCognitoAuthSession> continuation3 = c56434yFf;
                    Result.Application application2 = Result.Companion;
                    continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new UnknownException("fetchAuthSession did not return a type of AWSCognitoAuthSession", null, 2, null))));
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getSession$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AWSCognitoAuthSession> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(@NotNull Consumer<AuthSession> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        fetchAuthSession(AuthFetchSessionOptions.Companion.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(@NotNull AuthFetchSessionOptions authFetchSessionOptions, @NotNull final Consumer<AuthSession> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authFetchSessionOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        final boolean forceRefresh = authFetchSessionOptions.getForceRefresh();
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.fetchAuthSession.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthorizationState authZState = authState.getAuthZState();
                if (authZState instanceof AuthorizationState.Configured) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(AuthorizationEvent.EventType.FetchUnAuthSession.INSTANCE, null, 2, null));
                    RealAWSCognitoAuthPlugin.this._fetchAuthSession(consumer, consumer2);
                    return;
                }
                if (authZState instanceof AuthorizationState.SessionEstablished) {
                    AmplifyCredential amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
                    if (!AWSCognitoAuthSessionKt.isValid(amplifyCredential) || forceRefresh) {
                        if (amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated) {
                            AmplifyCredential.IdentityPoolFederated identityPoolFederated = (AmplifyCredential.IdentityPoolFederated) amplifyCredential;
                            RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(identityPoolFederated.getFederatedToken(), identityPoolFederated.getIdentityId(), amplifyCredential), null, 2, null));
                        } else {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.RefreshSession(amplifyCredential), null, 2, null));
                        }
                        RealAWSCognitoAuthPlugin.this._fetchAuthSession(consumer, consumer2);
                        return;
                    }
                    consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession$default(amplifyCredential, null, 1, null));
                    return;
                }
                if (authZState instanceof AuthorizationState.Error) {
                    Exception exception = ((AuthorizationState.Error) authZState).getException();
                    if (exception instanceof SessionError) {
                        AmplifyCredential amplifyCredential2 = ((SessionError) exception).getAmplifyCredential();
                        if (amplifyCredential2 instanceof AmplifyCredential.IdentityPoolFederated) {
                            AmplifyCredential.IdentityPoolFederated identityPoolFederated2 = (AmplifyCredential.IdentityPoolFederated) amplifyCredential2;
                            RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(identityPoolFederated2.getFederatedToken(), identityPoolFederated2.getIdentityId(), amplifyCredential2), null, 2, null));
                        } else {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.RefreshSession(amplifyCredential2), null, 2, null));
                        }
                        RealAWSCognitoAuthPlugin.this._fetchAuthSession(consumer, consumer2);
                        return;
                    }
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                    return;
                }
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _fetchAuthSession(final Consumer<AuthSession> consumer, Consumer<AuthException> consumer2) {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._fetchAuthSession.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthorizationState authZState = authState.getAuthZState();
                if (authZState instanceof AuthorizationState.SessionEstablished) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession$default(((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential(), null, 1, null));
                    return;
                }
                if (authZState instanceof AuthorizationState.Error) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                    Exception exception = ((AuthorizationState.Error) authZState).getException();
                    if (exception instanceof SessionError) {
                        SessionError sessionError = (SessionError) exception;
                        Exception exception2 = sessionError.getException();
                        if (exception2 instanceof SignedOutException) {
                            consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) sessionError.getException()));
                            return;
                        }
                        if (exception2 instanceof SessionExpiredException) {
                            consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, (AuthException) sessionError.getException()));
                            RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SESSION_EXPIRED.toString());
                            return;
                        } else if (exception2 instanceof ServiceException) {
                            consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, (AuthException) sessionError.getException()));
                            return;
                        } else if (exception2 instanceof NotAuthorizedException) {
                            consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, (AuthException) sessionError.getException()));
                            return;
                        } else {
                            consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new UnknownException("Fetch auth session failed.", exception)));
                            return;
                        }
                    }
                    if (exception instanceof ConfigurationException) {
                        consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new InvalidAccountTypeException(exception)));
                    } else {
                        consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new UnknownException("Fetch auth session failed.", exception)));
                    }
                }
            }
        }, null);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void rememberDevice(@NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.rememberDevice.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SignedIn) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01741(this, authNState, action, consumer, null), 3, null);
                } else if (authNState instanceof AuthenticationState.SignedOut) {
                    consumer.accept(new SignedOutException(null, null, null, 7, null));
                } else {
                    consumer.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$rememberDevice$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Action $onSuccess;
                final /* synthetic */ AuthenticationState $state;
                Object L$0;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01741(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthenticationState authenticationState, Action action, Consumer<AuthException> consumer, Continuation<? super C01741> continuation) {
                    super(2, continuation);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$state = authenticationState;
                    this.$onSuccess = action;
                    this.$onError = consumer;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01741(this.this$0, this.$state, this.$onSuccess, this.$onError, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                        AuthEnvironment authEnvironment = realAWSCognitoAuthPlugin2.authEnvironment;
                        String username = ((AuthenticationState.SignedIn) this.$state).getSignedInData().getUsername();
                        this.L$0 = realAWSCognitoAuthPlugin2;
                        this.label = 1;
                        Object deviceMetadata = authEnvironment.getDeviceMetadata(username, this);
                        if (deviceMetadata == objCopydefault) {
                            return objCopydefault;
                        }
                        realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
                        obj = deviceMetadata;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        realAWSCognitoAuthPlugin = (RealAWSCognitoAuthPlugin) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                    }
                    DeviceMetadata.Metadata metadata = (DeviceMetadata.Metadata) obj;
                    realAWSCognitoAuthPlugin.updateDevice(metadata != null ? metadata.getDeviceKey() : null, Nullable.Application.copydefault, this.$onSuccess, this.$onError);
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(@NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        AuthDevice authDeviceFromId = AuthDevice.fromId("");
        Intrinsics.checkNotNullExpressionValue(authDeviceFromId, "");
        forgetDevice(authDeviceFromId, action, consumer);
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateDevice$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class C16631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $alternateDeviceId;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ Nullable $rememberedStatusType;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16631(Action action, Consumer<AuthException> consumer, String str, Nullable nullable, Continuation<? super C16631> continuation) {
            super(2, continuation);
            this.$onSuccess = action;
            this.$onError = consumer;
            this.$alternateDeviceId = str;
            this.$rememberedStatusType = nullable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RealAWSCognitoAuthPlugin.this.new C16631(this.$onSuccess, this.$onError, this.$alternateDeviceId, this.$rememberedStatusType, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Update device ID failed."));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = RealAWSCognitoAuthPlugin.this;
                this.label = 1;
                obj = realAWSCognitoAuthPlugin.getSession(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.$onSuccess.call();
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult();
            BinaryOperator cognitoIdentityProviderClient = RealAWSCognitoAuthPlugin.this.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient != null) {
                SystemUpdatePolicy.StateListAnimator stateListAnimator = SystemUpdatePolicy.EZpvd;
                final String str = this.$alternateDeviceId;
                final Nullable nullable = this.$rememberedStatusType;
                SystemUpdatePolicy systemUpdatePolicyOLrzqt = stateListAnimator.OLrzqt(new Function1<SystemUpdatePolicy.Activity, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.updateDevice.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SystemUpdatePolicy.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SystemUpdatePolicy.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        AWSCognitoUserPoolTokens value = userPoolTokensResult.getValue();
                        activity.KWHzl(value != null ? value.getAccessToken() : null);
                        activity.EZpvd(str);
                        activity.EZpvd(nullable);
                    }
                });
                this.label = 2;
                obj = cognitoIdentityProviderClient.OLrzqt(systemUpdatePolicyOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            this.$onSuccess.call();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDevice(String str, Nullable nullable, Action action, Consumer<AuthException> consumer) {
        BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new C16631(action, consumer, str, nullable, null), 3, null);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(@NotNull final AuthDevice authDevice, @NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(authDevice, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.forgetDevice.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SignedIn) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01721(authDevice, this, authNState, action, consumer, null), 3, null);
                } else if (authNState instanceof AuthenticationState.SignedOut) {
                    consumer.accept(new SignedOutException(null, null, null, 7, null));
                } else {
                    consumer.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$forgetDevice$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ AuthenticationState $authNState;
                final /* synthetic */ AuthDevice $device;
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Action $onSuccess;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01721(AuthDevice authDevice, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthenticationState authenticationState, Action action, Consumer<AuthException> consumer, Continuation<? super C01721> continuation) {
                    super(2, continuation);
                    this.$device = authDevice;
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$authNState = authenticationState;
                    this.$onSuccess = action;
                    this.$onError = consumer;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01721(this.$device, this.this$0, this.$authNState, this.$onSuccess, this.$onError, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:10:0x001a, B:29:0x0077, B:11:0x001e, B:19:0x0051, B:21:0x0055, B:23:0x005b, B:14:0x0025, B:16:0x0036, B:26:0x0066), top: B:35:0x0009 }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    String deviceKey;
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            C56391yDq.AEQbTJ(obj);
                            String id = this.$device.getId();
                            Intrinsics.checkNotNullExpressionValue(id, "");
                            if (id.length() == 0) {
                                AuthEnvironment authEnvironment = this.this$0.authEnvironment;
                                String username = ((AuthenticationState.SignedIn) this.$authNState).getSignedInData().getUsername();
                                this.label = 1;
                                obj = authEnvironment.getDeviceMetadata(username, this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                                DeviceMetadata.Metadata metadata = (DeviceMetadata.Metadata) obj;
                                if (metadata == null) {
                                }
                                realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 2;
                                if (realAWSCognitoAuthPlugin.forgetDevice(deviceKey, this) == objCopydefault) {
                                }
                                this.$onSuccess.call();
                            } else {
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                String id2 = this.$device.getId();
                                this.label = 3;
                                if (realAWSCognitoAuthPlugin2.forgetDevice(id2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                this.$onSuccess.call();
                            }
                        } else if (i == 1) {
                            C56391yDq.AEQbTJ(obj);
                            DeviceMetadata.Metadata metadata2 = (DeviceMetadata.Metadata) obj;
                            deviceKey = metadata2 == null ? metadata2.getDeviceKey() : null;
                            realAWSCognitoAuthPlugin = this.this$0;
                            this.label = 2;
                            if (realAWSCognitoAuthPlugin.forgetDevice(deviceKey, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.$onSuccess.call();
                        } else {
                            if (i != 2 && i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            this.$onSuccess.call();
                        }
                    } catch (Exception e) {
                        this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Failed to forget device."));
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forgetDevice(final String str, Continuation<? super Unit> continuation) throws Throwable {
        C16492 c16492;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
        if (continuation instanceof C16492) {
            c16492 = (C16492) continuation;
            int i = c16492.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16492.label = i - Integer.MIN_VALUE;
            } else {
                c16492 = new C16492(continuation);
            }
        }
        Object session = c16492.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16492.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(session);
            c16492.L$0 = this;
            c16492.L$1 = str;
            c16492.label = 1;
            session = getSession(c16492);
            if (session == objCopydefault) {
                return objCopydefault;
            }
            realAWSCognitoAuthPlugin = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(session);
                return Unit.INSTANCE;
            }
            str = (String) c16492.L$1;
            realAWSCognitoAuthPlugin = (RealAWSCognitoAuthPlugin) c16492.L$0;
            C56391yDq.AEQbTJ(session);
        }
        final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult = ((AWSCognitoAuthSession) session).getUserPoolTokensResult();
        BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
            return Unit.INSTANCE;
        }
        TargetApi targetApiKWHzl = TargetApi.OLrzqt.KWHzl(new Function1<TargetApi.Activity, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.forgetDevice.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TargetApi.Activity activity) {
                invoke2(activity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TargetApi.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                AWSCognitoUserPoolTokens value = userPoolTokensResult.getValue();
                activity.AEQbTJ(value != null ? value.getAccessToken() : null);
                activity.OLrzqt(str);
            }
        });
        c16492.L$0 = null;
        c16492.L$1 = null;
        c16492.label = 2;
        if (cognitoIdentityProviderClient.AEQbTJ(targetApiKWHzl, c16492) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchDevices(@NotNull final Consumer<List<AuthDevice>> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.fetchDevices.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SignedIn) {
                    RealAWSCognitoAuthPlugin.this._fetchDevices(consumer, consumer2);
                } else if (authNState instanceof AuthenticationState.SignedOut) {
                    consumer2.accept(new SignedOutException(null, null, null, 7, null));
                } else {
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_fetchDevices$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class C16241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<List<AuthDevice>> $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16241(Consumer<List<AuthDevice>> consumer, Consumer<AuthException> consumer2, Continuation<? super C16241> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RealAWSCognitoAuthPlugin.this.new C16241(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:6:0x000f, B:21:0x0057, B:24:0x005d, B:26:0x0063, B:27:0x0072, B:29:0x0078, B:32:0x0086, B:34:0x008c, B:35:0x0090, B:37:0x0096, B:41:0x00ab, B:43:0x00af, B:45:0x00b5, B:47:0x00c1, B:46:0x00bd, B:10:0x001b, B:16:0x002d, B:18:0x0043, B:13:0x0022), top: B:53:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:6:0x000f, B:21:0x0057, B:24:0x005d, B:26:0x0063, B:27:0x0072, B:29:0x0078, B:32:0x0086, B:34:0x008c, B:35:0x0090, B:37:0x0096, B:41:0x00ab, B:43:0x00af, B:45:0x00b5, B:47:0x00c1, B:46:0x00bd, B:10:0x001b, B:16:0x002d, B:18:0x0043, B:13:0x0022), top: B:53:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            DexLoadReporter dexLoadReporter;
            List<AuthDevice> listAhwBna;
            List<RequiresFeature> listKWHzl;
            String strOLrzqt;
            Object next;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Fetch devices failed."));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = RealAWSCognitoAuthPlugin.this;
                this.label = 1;
                obj = realAWSCognitoAuthPlugin.getSession(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    dexLoadReporter = (DexLoadReporter) obj;
                    if (dexLoadReporter == null || (listKWHzl = dexLoadReporter.KWHzl()) == null) {
                        listAhwBna = yDY.AhwBna();
                    } else {
                        listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(listKWHzl, 10));
                        for (RequiresFeature requiresFeature : listKWHzl) {
                            String strKWHzl = requiresFeature.KWHzl();
                            if (strKWHzl == null) {
                                strKWHzl = "";
                            }
                            List<ChooseAccountActivity> listCopydefault = requiresFeature.copydefault();
                            if (listCopydefault != null) {
                                Iterator<T> it = listCopydefault.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.EZpvd((Object) ((ChooseAccountActivity) next).KWHzl(), (Object) "device_name")) {
                                        break;
                                    }
                                }
                                ChooseAccountActivity chooseAccountActivity = (ChooseAccountActivity) next;
                                strOLrzqt = chooseAccountActivity != null ? chooseAccountActivity.OLrzqt() : null;
                            }
                            listAhwBna.add(AuthDevice.fromId(strKWHzl, strOLrzqt));
                        }
                    }
                    this.$onSuccess.accept(listAhwBna);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult();
            BinaryOperator cognitoIdentityProviderClient = RealAWSCognitoAuthPlugin.this.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient != null) {
                DatePickerDialog datePickerDialogCopydefault = DatePickerDialog.EZpvd.copydefault(new Function1<DatePickerDialog.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_fetchDevices$1$response$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DatePickerDialog.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DatePickerDialog.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        AWSCognitoUserPoolTokens value = userPoolTokensResult.getValue();
                        application.KWHzl(value != null ? value.getAccessToken() : null);
                    }
                });
                this.label = 2;
                obj = cognitoIdentityProviderClient.EZpvd(datePickerDialogCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                dexLoadReporter = (DexLoadReporter) obj;
                if (dexLoadReporter == null) {
                    listAhwBna = yDY.AhwBna();
                    this.$onSuccess.accept(listAhwBna);
                }
                return Unit.INSTANCE;
            }
            dexLoadReporter = null;
            if (dexLoadReporter == null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _fetchDevices(Consumer<List<AuthDevice>> consumer, Consumer<AuthException> consumer2) {
        BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new C16241(consumer, consumer2, null), 3, null);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(@NotNull String str, @NotNull AuthResetPasswordOptions authResetPasswordOptions, @NotNull Consumer<AuthResetPasswordResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authResetPasswordOptions, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        try {
            BinaryOperator cognitoIdentityProviderClient = this.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            UserPoolConfiguration userPool = this.configuration.getUserPool();
            String appClient = userPool != null ? userPool.getAppClient() : null;
            if (appClient != null) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C16571(str, cognitoIdentityProviderClient, appClient, authResetPasswordOptions, consumer, consumer2, null), 3, null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception unused) {
            consumer2.accept(new InvalidUserPoolConfigurationException());
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resetPassword$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $appClient;
        final /* synthetic */ BinaryOperator $cognitoIdentityProviderClient;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthResetPasswordResult> $onSuccess;
        final /* synthetic */ AuthResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16571(String str, BinaryOperator binaryOperator, String str2, AuthResetPasswordOptions authResetPasswordOptions, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16571> continuation) {
            super(2, continuation);
            this.$username = str;
            this.$cognitoIdentityProviderClient = binaryOperator;
            this.$appClient = str2;
            this.$options = authResetPasswordOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RealAWSCognitoAuthPlugin.this.new C16571(this.$username, this.$cognitoIdentityProviderClient, this.$appClient, this.$options, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AuthEnvironment authEnvironment = RealAWSCognitoAuthPlugin.this.authEnvironment;
                String str = this.$username;
                this.label = 1;
                obj = authEnvironment.getUserContextData(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            String str2 = (String) obj;
            String pinpointEndpointId = RealAWSCognitoAuthPlugin.this.authEnvironment.getPinpointEndpointId();
            BinaryOperator binaryOperator = this.$cognitoIdentityProviderClient;
            String str3 = this.$appClient;
            UserPoolConfiguration userPool = RealAWSCognitoAuthPlugin.this.configuration.getUserPool();
            ResetPasswordUseCase resetPasswordUseCase = new ResetPasswordUseCase(binaryOperator, str3, userPool != null ? userPool.getAppClientSecret() : null);
            String str4 = this.$username;
            AuthResetPasswordOptions authResetPasswordOptions = this.$options;
            Consumer<AuthResetPasswordResult> consumer = this.$onSuccess;
            Consumer<AuthException> consumer2 = this.$onError;
            this.label = 2;
            if (resetPasswordUseCase.execute(str4, authResetPasswordOptions, str2, pinpointEndpointId, consumer, consumer2, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(@NotNull String str, @NotNull Consumer<AuthResetPasswordResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthResetPasswordOptions.DefaultAuthResetPasswordOptions defaultAuthResetPasswordOptionsDefaults = AuthResetPasswordOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthResetPasswordOptionsDefaults, "");
        resetPassword(str, defaultAuthResetPasswordOptionsDefaults, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, @NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(authConfirmResetPasswordOptions, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.confirmResetPassword.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                if (!(authState.getAuthNState() instanceof AuthenticationState.NotConfigured)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01661(this, str, consumer, str3, str2, authConfirmResetPasswordOptions, action, null), 3, null);
                } else {
                    consumer.accept(new ConfigurationException("Confirm Reset Password failed.", "Cognito User Pool not configured. Please check amplifyconfiguration.json file.", null, 4, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmResetPassword$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $confirmationCode;
                final /* synthetic */ String $newPassword;
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Action $onSuccess;
                final /* synthetic */ AuthConfirmResetPasswordOptions $options;
                final /* synthetic */ String $username;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01661(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, Consumer<AuthException> consumer, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action, Continuation<? super C01661> continuation) {
                    super(2, continuation);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$username = str;
                    this.$onError = consumer;
                    this.$confirmationCode = str2;
                    this.$newPassword = str3;
                    this.$options = authConfirmResetPasswordOptions;
                    this.$onSuccess = action;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01661(this.this$0, this.$username, this.$onError, this.$confirmationCode, this.$newPassword, this.$options, this.$onSuccess, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Map<String, String> mapKWHzl;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    try {
                    } catch (Exception e) {
                        this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION));
                    }
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        AuthEnvironment authEnvironment = this.this$0.authEnvironment;
                        String str = this.$username;
                        this.label = 1;
                        obj = authEnvironment.getUserContextData(str, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            this.$onSuccess.call();
                            return Unit.INSTANCE;
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    final String str2 = (String) obj;
                    final String pinpointEndpointId = this.this$0.authEnvironment.getPinpointEndpointId();
                    BinaryOperator cognitoIdentityProviderClient = this.this$0.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                    Intrinsics.copydefault(cognitoIdentityProviderClient);
                    String str3 = this.$username;
                    String str4 = this.$confirmationCode;
                    String str5 = this.$newPassword;
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions = this.$options;
                    IntArrayEvaluator.Activity activity = new IntArrayEvaluator.Activity();
                    activity.OLrzqt(str3);
                    activity.copydefault(str4);
                    activity.KWHzl(str5);
                    AuthHelper.Companion companion = AuthHelper.Companion;
                    UserPoolConfiguration userPool = realAWSCognitoAuthPlugin.configuration.getUserPool();
                    String appClient = userPool != null ? userPool.getAppClient() : null;
                    UserPoolConfiguration userPool2 = realAWSCognitoAuthPlugin.configuration.getUserPool();
                    activity.AEQbTJ(companion.getSecretHash(str3, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null));
                    AWSCognitoAuthConfirmResetPasswordOptions aWSCognitoAuthConfirmResetPasswordOptions = authConfirmResetPasswordOptions instanceof AWSCognitoAuthConfirmResetPasswordOptions ? (AWSCognitoAuthConfirmResetPasswordOptions) authConfirmResetPasswordOptions : null;
                    if (aWSCognitoAuthConfirmResetPasswordOptions == null || (mapKWHzl = aWSCognitoAuthConfirmResetPasswordOptions.getMetadata()) == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    }
                    activity.EZpvd(mapKWHzl);
                    UserPoolConfiguration userPool3 = realAWSCognitoAuthPlugin.configuration.getUserPool();
                    activity.EZpvd(userPool3 != null ? userPool3.getAppClient() : null);
                    if (str2 != null) {
                        activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmResetPassword$1$1$1$1$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(RestoreDescription.Application application) {
                                invoke2(application);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull RestoreDescription.Application application) {
                                Intrinsics.checkNotNullParameter(application, "");
                                application.copydefault(str2);
                            }
                        });
                    }
                    if (pinpointEndpointId != null) {
                        activity.OLrzqt(AccountManagerResponse.OLrzqt.OLrzqt(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmResetPassword$1$1$1$2$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AccountManagerResponse.Application application) {
                                invoke2(application);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull AccountManagerResponse.Application application) {
                                Intrinsics.checkNotNullParameter(application, "");
                                application.OLrzqt(pinpointEndpointId);
                            }
                        }));
                    }
                    IntArrayEvaluator intArrayEvaluatorEZpvd = activity.EZpvd();
                    this.label = 2;
                    obj = cognitoIdentityProviderClient.EZpvd(intArrayEvaluatorEZpvd, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    this.$onSuccess.call();
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        AuthConfirmResetPasswordOptions.DefaultAuthConfirmResetPasswordOptions defaultAuthConfirmResetPasswordOptionsDefaults = AuthConfirmResetPasswordOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthConfirmResetPasswordOptionsDefaults, "");
        confirmResetPassword(str, str2, str3, defaultAuthConfirmResetPasswordOptionsDefaults, action, consumer);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updatePassword(@NotNull final String str, @NotNull final String str2, @NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.updatePassword.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SignedIn) {
                    RealAWSCognitoAuthPlugin.this._updatePassword(str, str2, action, consumer);
                } else if (authNState instanceof AuthenticationState.SignedOut) {
                    consumer.accept(new SignedOutException(null, null, null, 7, null));
                } else {
                    consumer.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_updatePassword$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class C16331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $oldPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16331(Action action, Consumer<AuthException> consumer, String str, String str2, Continuation<? super C16331> continuation) {
            super(2, continuation);
            this.$onSuccess = action;
            this.$onError = consumer;
            this.$oldPassword = str;
            this.$newPassword = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RealAWSCognitoAuthPlugin.this.new C16331(this.$onSuccess, this.$onError, this.$oldPassword, this.$newPassword, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, e.toString()));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = RealAWSCognitoAuthPlugin.this;
                this.label = 1;
                obj = realAWSCognitoAuthPlugin.getSession(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.$onSuccess.call();
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult();
            AnimationHandler.ActionBar actionBar = AnimationHandler.KWHzl;
            final String str = this.$oldPassword;
            final String str2 = this.$newPassword;
            AnimationHandler animationHandlerEZpvd = actionBar.EZpvd(new Function1<AnimationHandler.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_updatePassword$1$changePasswordRequest$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationHandler.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationHandler.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                    application.OLrzqt(str);
                    application.KWHzl(str2);
                    AWSCognitoUserPoolTokens value = userPoolTokensResult.getValue();
                    application.EZpvd(value != null ? value.getAccessToken() : null);
                }
            });
            BinaryOperator cognitoIdentityProviderClient = RealAWSCognitoAuthPlugin.this.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient != null) {
                this.label = 2;
                obj = cognitoIdentityProviderClient.KWHzl(animationHandlerEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            this.$onSuccess.call();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _updatePassword(String str, String str2, Action action, Consumer<AuthException> consumer) {
        BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new C16331(action, consumer, str, str2, null), 3, null);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchUserAttributes(@NotNull final Consumer<List<AuthUserAttribute>> consumer, @NotNull final Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.fetchUserAttributes.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SignedIn) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01711(this, consumer, consumer2, null), 3, null);
                } else if (authNState instanceof AuthenticationState.SignedOut) {
                    consumer2.accept(new SignedOutException(null, null, null, 7, null));
                } else {
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchUserAttributes$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Consumer<List<AuthUserAttribute>> $onSuccess;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01711(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<List<AuthUserAttribute>> consumer, Consumer<AuthException> consumer2, Continuation<? super C01711> continuation) {
                    super(2, continuation);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$onSuccess = consumer;
                    this.$onError = consumer2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C01711(this.this$0, this.$onSuccess, this.$onError, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: Exception -> 0x00a3, LOOP:0: B:31:0x0078->B:33:0x007e, LOOP_END, TryCatch #0 {Exception -> 0x00a3, blocks: (B:6:0x000e, B:25:0x0065, B:26:0x0068, B:28:0x006e, B:30:0x0074, B:31:0x0078, B:33:0x007e, B:34:0x0099, B:10:0x001a, B:16:0x002c, B:18:0x003b, B:20:0x0041, B:22:0x005c, B:13:0x0021), top: B:40:0x0008 }] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    ApplicationErrorReport applicationErrorReport;
                    List<ChooseAccountActivity> listAEQbTJ;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    try {
                    } catch (Exception e) {
                        this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, e.toString()));
                    }
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        this.label = 1;
                        obj = realAWSCognitoAuthPlugin.getSession(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            applicationErrorReport = (ApplicationErrorReport) obj;
                            List listOLrzqt = C56402yEa.OLrzqt();
                            if (applicationErrorReport != null && (listAEQbTJ = applicationErrorReport.AEQbTJ()) != null) {
                                for (ChooseAccountActivity chooseAccountActivity : listAEQbTJ) {
                                    listOLrzqt.add(new AuthUserAttribute(AuthUserAttributeKey.custom(chooseAccountActivity.KWHzl()), chooseAccountActivity.OLrzqt()));
                                }
                            }
                            this.$onSuccess.accept(C56402yEa.fARcdN(listOLrzqt));
                            return Unit.INSTANCE;
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                    applicationErrorReport = null;
                    final String accessToken = value != null ? value.getAccessToken() : null;
                    ApplicationLoaders applicationLoadersOLrzqt = ApplicationLoaders.copydefault.OLrzqt(new Function1<ApplicationLoaders.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchUserAttributes$1$1$getUserRequest$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ApplicationLoaders.Application application) {
                            invoke2(application);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ApplicationLoaders.Application application) {
                            Intrinsics.checkNotNullParameter(application, "");
                            application.EZpvd(accessToken);
                        }
                    });
                    BinaryOperator cognitoIdentityProviderClient = this.this$0.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                        this.label = 2;
                        obj = cognitoIdentityProviderClient.KWHzl(applicationLoadersOLrzqt, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        applicationErrorReport = (ApplicationErrorReport) obj;
                    }
                    List listOLrzqt2 = C56402yEa.OLrzqt();
                    if (applicationErrorReport != null) {
                        while (r0.hasNext()) {
                        }
                    }
                    this.$onSuccess.accept(C56402yEa.fARcdN(listOLrzqt2));
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttribute$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthUserAttribute $attribute;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthUpdateAttributeResult> $onSuccess;
        final /* synthetic */ AuthUpdateUserAttributeOptions $options;
        int label;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16651(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthUpdateAttributeResult> consumer, Consumer<AuthException> consumer2, Continuation<? super C16651> continuation) {
            super(2, continuation);
            this.$attribute = authUserAttribute;
            this.$options = authUpdateUserAttributeOptions;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16651(this.$attribute, this.$options, this.this$0, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List listEZpvd = C56402yEa.EZpvd(this.$attribute);
                    AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions = this.$options;
                    AWSCognitoAuthUpdateUserAttributeOptions aWSCognitoAuthUpdateUserAttributeOptions = authUpdateUserAttributeOptions instanceof AWSCognitoAuthUpdateUserAttributeOptions ? (AWSCognitoAuthUpdateUserAttributeOptions) authUpdateUserAttributeOptions : null;
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) listEZpvd);
                    Map<String, String> metadata = aWSCognitoAuthUpdateUserAttributeOptions != null ? aWSCognitoAuthUpdateUserAttributeOptions.getMetadata() : null;
                    this.label = 1;
                    obj = realAWSCognitoAuthPlugin.updateUserAttributes((List<AuthUserAttribute>) listFJNWhG, metadata, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((AuthUpdateAttributeResult) ((Map.Entry) CollectionsKt___CollectionsKt.dNCPSb(((Map) obj).entrySet())).getValue());
            } catch (AuthException e) {
                this.$onError.accept(e);
            } catch (Exception e2) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e2, e2.toString()));
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
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C16651(authUserAttribute, authUpdateUserAttributeOptions, this, consumer, consumer2, null), 3, null);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(@NotNull AuthUserAttribute authUserAttribute, @NotNull Consumer<AuthUpdateAttributeResult> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(authUserAttribute, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthUpdateUserAttributeOptions.DefaultAuthUpdateUserAttributeOptions defaultAuthUpdateUserAttributeOptionsDefaults = AuthUpdateUserAttributeOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthUpdateUserAttributeOptionsDefaults, "");
        updateUserAttribute(authUserAttribute, defaultAuthUpdateUserAttributeOptionsDefaults, consumer, consumer2);
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> $onSuccess;
        final /* synthetic */ AuthUpdateUserAttributesOptions $options;
        Object L$0;
        int label;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16661(AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, List<AuthUserAttribute> list, Consumer<AuthException> consumer2, Continuation<? super C16661> continuation) {
            super(2, continuation);
            this.$options = authUpdateUserAttributesOptions;
            this.$onSuccess = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$attributes = list;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16661(this.$options, this.$onSuccess, this.this$0, this.$attributes, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Consumer consumer;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions = this.$options;
                    AWSCognitoAuthUpdateUserAttributesOptions aWSCognitoAuthUpdateUserAttributesOptions = authUpdateUserAttributesOptions instanceof AWSCognitoAuthUpdateUserAttributesOptions ? (AWSCognitoAuthUpdateUserAttributesOptions) authUpdateUserAttributesOptions : null;
                    Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer2 = this.$onSuccess;
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    List<AuthUserAttribute> list = this.$attributes;
                    Map<String, String> metadata = aWSCognitoAuthUpdateUserAttributesOptions != null ? aWSCognitoAuthUpdateUserAttributesOptions.getMetadata() : null;
                    this.L$0 = consumer2;
                    this.label = 1;
                    obj = realAWSCognitoAuthPlugin.updateUserAttributes(list, metadata, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    consumer = consumer2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    consumer = (Consumer) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                consumer.accept(obj);
            } catch (AuthException e) {
                this.$onError.accept(e);
            } catch (Exception e2) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e2, e2.toString()));
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
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C16661(authUpdateUserAttributesOptions, consumer, this, list, consumer2, null), 3, null);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(@NotNull List<AuthUserAttribute> list, @NotNull Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, @NotNull Consumer<AuthException> consumer2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        AuthUpdateUserAttributesOptions.DefaultAuthUpdateUserAttributesOptions defaultAuthUpdateUserAttributesOptionsDefaults = AuthUpdateUserAttributesOptions.defaults();
        Intrinsics.checkNotNullExpressionValue(defaultAuthUpdateUserAttributesOptionsDefaults, "");
        updateUserAttributes(list, defaultAuthUpdateUserAttributesOptionsDefaults, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateUserAttributes(final List<AuthUserAttribute> list, final Map<String, String> map, Continuation<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.util.Map<com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.result.AuthUpdateAttributeResult>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                invoke2(authState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AuthState authState) {
                Intrinsics.checkNotNullParameter(authState, "");
                AuthenticationState authNState = authState.getAuthNState();
                if (authNState instanceof AuthenticationState.SignedIn) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(this, c56434yFf, list, map, null), 3, null);
                    return;
                }
                if (authNState instanceof AuthenticationState.SignedOut) {
                    Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new SignedOutException(null, null, null, 7, null))));
                } else {
                    Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation3 = c56434yFf;
                    Result.Application application2 = Result.Companion;
                    continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new InvalidStateException(null, null, null, 7, null))));
                }
            }

            /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ List<AuthUserAttribute> $attributes;
                final /* synthetic */ Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> $continuation;
                final /* synthetic */ Map<String, String> $userAttributesOptionsMetadata;
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.coroutines.Continuation<? super java.util.Map<com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.result.AuthUpdateAttributeResult>> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Continuation<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation, List<AuthUserAttribute> list, Map<String, String> map, Continuation<? super AnonymousClass1> continuation2) {
                    super(2, continuation2);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$continuation = continuation;
                    this.$attributes = list;
                    this.$userAttributesOptionsMetadata = map;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$continuation, this.$attributes, this.$userAttributesOptionsMetadata, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00cf A[Catch: Exception -> 0x00e4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e4, blocks: (B:7:0x001a, B:32:0x00b4, B:33:0x00ba, B:35:0x00cf, B:11:0x0027, B:17:0x0039, B:19:0x0048, B:22:0x0050, B:23:0x006c, B:25:0x0072, B:26:0x0087, B:28:0x00a2, B:14:0x002e), top: B:41:0x0008 }] */
                /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.ArrayList, java.util.Collection] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Unit unit;
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
                    Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation;
                    final Ref.ObjectRef objectRef;
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2;
                    Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation2;
                    Ref.ObjectRef objectRef2;
                    BackupManagerMonitor backupManagerMonitor;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    try {
                    } catch (Exception e) {
                        Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation3 = this.$continuation;
                        Result.Application application = Result.Companion;
                        continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(CognitoAuthExceptionConverter.Companion.lookup(e, e.toString()))));
                    }
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin3 = this.this$0;
                        this.label = 1;
                        obj = realAWSCognitoAuthPlugin3.getSession(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            objectRef2 = (Ref.ObjectRef) this.L$2;
                            continuation2 = (Continuation) this.L$1;
                            realAWSCognitoAuthPlugin2 = (RealAWSCognitoAuthPlugin) this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            objectRef = objectRef2;
                            continuation = continuation2;
                            realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
                            backupManagerMonitor = (BackupManagerMonitor) obj;
                            Result.Application application2 = Result.Companion;
                            continuation.resumeWith(Result.m7377constructorimpl(realAWSCognitoAuthPlugin.getUpdateUserAttributeResult(backupManagerMonitor, (List) objectRef.element)));
                            unit = Unit.INSTANCE;
                            if (unit == null) {
                                Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation4 = this.$continuation;
                                Result.Application application3 = Result.Companion;
                                continuation4.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new InvalidUserPoolConfigurationException())));
                            }
                            return Unit.INSTANCE;
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                    unit = null;
                    backupManagerMonitor = null;
                    final String accessToken = value != null ? value.getAccessToken() : null;
                    if (accessToken != null) {
                        List<AuthUserAttribute> list = this.$attributes;
                        realAWSCognitoAuthPlugin = this.this$0;
                        continuation = this.$continuation;
                        final Map<String, String> map = this.$userAttributesOptionsMetadata;
                        objectRef = new Ref.ObjectRef();
                        ?? arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final AuthUserAttribute authUserAttribute : list) {
                            arrayList.add(ChooseAccountActivity.EZpvd.EZpvd(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0083: INVOKE 
                                  (r8v0 'arrayList' ?? I:java.util.Collection)
                                  (wrap:o.ChooseAccountActivity:0x007f: INVOKE 
                                  (wrap:o.ChooseAccountActivity$Application:0x0078: SGET  A[Catch: Exception -> 0x00e4, WRAPPED] (LINE:1634) o.ChooseAccountActivity.EZpvd o.ChooseAccountActivity$Application)
                                  (wrap:kotlin.jvm.functions.Function1<o.ChooseAccountActivity$TaskDescription, kotlin.Unit>:0x007c: CONSTRUCTOR (r9v4 'authUserAttribute' com.amplifyframework.auth.AuthUserAttribute A[DONT_INLINE]) A[Catch: Exception -> 0x00e4, MD:(com.amplifyframework.auth.AuthUserAttribute):void (m), WRAPPED] call: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1$1$userAttributes$1$1.<init>(com.amplifyframework.auth.AuthUserAttribute):void type: CONSTRUCTOR)
                                 VIRTUAL call: o.ChooseAccountActivity.Application.EZpvd(kotlin.jvm.functions.Function1):o.ChooseAccountActivity A[Catch: Exception -> 0x00e4, MD:(kotlin.jvm.functions.Function1<? super o.ChooseAccountActivity$TaskDescription, kotlin.Unit>):o.ChooseAccountActivity (m), WRAPPED] (LINE:1634))
                                 INTERFACE call: java.util.Collection.add(java.lang.Object):boolean A[Catch: Exception -> 0x00e4, MD:(E):boolean (c)] (LINE:2405) in method: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes21.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1$1$userAttributes$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 27 more
                                */
                            /*
                                this = this;
                                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                                int r1 = r12.label
                                r2 = 2
                                r3 = 1
                                if (r1 == 0) goto L2b
                                if (r1 == r3) goto L27
                                if (r1 != r2) goto L1f
                                java.lang.Object r0 = r12.L$2
                                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                                java.lang.Object r1 = r12.L$1
                                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                                java.lang.Object r2 = r12.L$0
                                com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r2 = (com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin) r2
                                o.C56391yDq.AEQbTJ(r13)     // Catch: java.lang.Exception -> Le4
                                goto Lb4
                            L1f:
                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r13.<init>(r0)
                                throw r13
                            L27:
                                o.C56391yDq.AEQbTJ(r13)     // Catch: java.lang.Exception -> Le4
                                goto L39
                            L2b:
                                o.C56391yDq.AEQbTJ(r13)
                                com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r13 = r12.this$0     // Catch: java.lang.Exception -> Le4
                                r12.label = r3     // Catch: java.lang.Exception -> Le4
                                java.lang.Object r13 = com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.access$getSession(r13, r12)     // Catch: java.lang.Exception -> Le4
                                if (r13 != r0) goto L39
                                return r0
                            L39:
                                com.amplifyframework.auth.cognito.AWSCognitoAuthSession r13 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r13     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.result.AuthSessionResult r13 = r13.getUserPoolTokensResult()     // Catch: java.lang.Exception -> Le4
                                java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.AWSCognitoUserPoolTokens r13 = (com.amplifyframework.auth.AWSCognitoUserPoolTokens) r13     // Catch: java.lang.Exception -> Le4
                                r1 = 0
                                if (r13 == 0) goto L4d
                                java.lang.String r13 = r13.getAccessToken()     // Catch: java.lang.Exception -> Le4
                                goto L4e
                            L4d:
                                r13 = r1
                            L4e:
                                if (r13 == 0) goto Lcd
                                java.util.List<com.amplifyframework.auth.AuthUserAttribute> r3 = r12.$attributes     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r4 = r12.this$0     // Catch: java.lang.Exception -> Le4
                                kotlin.coroutines.Continuation<java.util.Map<com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.result.AuthUpdateAttributeResult>> r5 = r12.$continuation     // Catch: java.lang.Exception -> Le4
                                java.util.Map<java.lang.String, java.lang.String> r6 = r12.$userAttributesOptionsMetadata     // Catch: java.lang.Exception -> Le4
                                kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> Le4
                                r7.<init>()     // Catch: java.lang.Exception -> Le4
                                java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le4
                                r9 = 10
                                int r9 = kotlin.collections.CollectionsKt.copydefault(r3, r9)     // Catch: java.lang.Exception -> Le4
                                r8.<init>(r9)     // Catch: java.lang.Exception -> Le4
                                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Le4
                            L6c:
                                boolean r9 = r3.hasNext()     // Catch: java.lang.Exception -> Le4
                                if (r9 == 0) goto L87
                                java.lang.Object r9 = r3.next()     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.AuthUserAttribute r9 = (com.amplifyframework.auth.AuthUserAttribute) r9     // Catch: java.lang.Exception -> Le4
                                o.ChooseAccountActivity$Application r10 = o.ChooseAccountActivity.EZpvd     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1$1$userAttributes$1$1 r11 = new com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1$1$userAttributes$1$1     // Catch: java.lang.Exception -> Le4
                                r11.<init>(r9)     // Catch: java.lang.Exception -> Le4
                                o.ChooseAccountActivity r9 = r10.EZpvd(r11)     // Catch: java.lang.Exception -> Le4
                                r8.add(r9)     // Catch: java.lang.Exception -> Le4
                                goto L6c
                            L87:
                                r7.element = r8     // Catch: java.lang.Exception -> Le4
                                o.BackupHelper$ActionBar r3 = o.BackupHelper.copydefault     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1$1$userAttributesRequest$1 r8 = new com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1$1$1$userAttributesRequest$1     // Catch: java.lang.Exception -> Le4
                                r8.<init>(r13, r7, r6)     // Catch: java.lang.Exception -> Le4
                                o.BackupHelper r13 = r3.KWHzl(r8)     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.cognito.AuthEnvironment r3 = com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.access$getAuthEnvironment$p(r4)     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.cognito.AWSCognitoAuthService r3 = r3.getCognitoAuthService()     // Catch: java.lang.Exception -> Le4
                                o.BinaryOperator r3 = r3.getCognitoIdentityProviderClient()     // Catch: java.lang.Exception -> Le4
                                if (r3 == 0) goto Lba
                                r12.L$0 = r4     // Catch: java.lang.Exception -> Le4
                                r12.L$1 = r5     // Catch: java.lang.Exception -> Le4
                                r12.L$2 = r7     // Catch: java.lang.Exception -> Le4
                                r12.label = r2     // Catch: java.lang.Exception -> Le4
                                java.lang.Object r13 = r3.KWHzl(r13, r12)     // Catch: java.lang.Exception -> Le4
                                if (r13 != r0) goto Lb1
                                return r0
                            Lb1:
                                r2 = r4
                                r1 = r5
                                r0 = r7
                            Lb4:
                                o.BackupManagerMonitor r13 = (o.BackupManagerMonitor) r13     // Catch: java.lang.Exception -> Le4
                                r7 = r0
                                r5 = r1
                                r4 = r2
                                r1 = r13
                            Lba:
                                kotlin.Result$Application r13 = kotlin.Result.Companion     // Catch: java.lang.Exception -> Le4
                                T r13 = r7.element     // Catch: java.lang.Exception -> Le4
                                java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Exception -> Le4
                                java.util.Map r13 = com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.access$getUpdateUserAttributeResult(r4, r1, r13)     // Catch: java.lang.Exception -> Le4
                                java.lang.Object r13 = kotlin.Result.m7377constructorimpl(r13)     // Catch: java.lang.Exception -> Le4
                                r5.resumeWith(r13)     // Catch: java.lang.Exception -> Le4
                                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Le4
                            Lcd:
                                if (r1 != 0) goto Lfe
                                kotlin.coroutines.Continuation<java.util.Map<com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.result.AuthUpdateAttributeResult>> r13 = r12.$continuation     // Catch: java.lang.Exception -> Le4
                                kotlin.Result$Application r0 = kotlin.Result.Companion     // Catch: java.lang.Exception -> Le4
                                com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException r0 = new com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException     // Catch: java.lang.Exception -> Le4
                                r0.<init>()     // Catch: java.lang.Exception -> Le4
                                java.lang.Object r0 = o.C56391yDq.EZpvd(r0)     // Catch: java.lang.Exception -> Le4
                                java.lang.Object r0 = kotlin.Result.m7377constructorimpl(r0)     // Catch: java.lang.Exception -> Le4
                                r13.resumeWith(r0)     // Catch: java.lang.Exception -> Le4
                                goto Lfe
                            Le4:
                                r13 = move-exception
                                kotlin.coroutines.Continuation<java.util.Map<com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.result.AuthUpdateAttributeResult>> r0 = r12.$continuation
                                kotlin.Result$Application r1 = kotlin.Result.Companion
                                com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter$Companion r1 = com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter.Companion
                                java.lang.String r2 = r13.toString()
                                com.amplifyframework.auth.AuthException r13 = r1.lookup(r13, r2)
                                java.lang.Object r13 = o.C56391yDq.EZpvd(r13)
                                java.lang.Object r13 = kotlin.Result.m7377constructorimpl(r13)
                                r0.resumeWith(r13)
                            Lfe:
                                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                return r13
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateUserAttributes$3$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }
                });
                Object objKWHzl = c56434yFf.KWHzl();
                if (objKWHzl == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(continuation);
                }
                return objKWHzl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final Map<AuthUserAttributeKey, AuthUpdateAttributeResult> getUpdateUserAttributeResult(BackupManagerMonitor backupManagerMonitor, List<ChooseAccountActivity> list) {
                List<AnimatorInflater> listOLrzqt;
                HashMap map = new HashMap();
                if (backupManagerMonitor != null && (listOLrzqt = backupManagerMonitor.OLrzqt()) != null) {
                    for (AnimatorInflater animatorInflater : listOLrzqt) {
                        if (animatorInflater.KWHzl() != null) {
                            ElapsedRealtimeLong elapsedRealtimeLongCopydefault = animatorInflater.copydefault();
                            AuthCodeDeliveryDetails.DeliveryMedium deliveryMediumFromString = AuthCodeDeliveryDetails.DeliveryMedium.fromString(elapsedRealtimeLongCopydefault != null ? elapsedRealtimeLongCopydefault.AEQbTJ() : null);
                            Intrinsics.checkNotNullExpressionValue(deliveryMediumFromString, "");
                            AuthUpdateAttributeResult authUpdateAttributeResult = new AuthUpdateAttributeResult(false, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.CONFIRM_ATTRIBUTE_WITH_CODE, new HashMap(), new AuthCodeDeliveryDetails(String.valueOf(animatorInflater.EZpvd()), deliveryMediumFromString, animatorInflater.KWHzl())));
                            AuthUserAttributeKey authUserAttributeKeyCustom = AuthUserAttributeKey.custom(animatorInflater.KWHzl());
                            Intrinsics.checkNotNullExpressionValue(authUserAttributeKeyCustom, "");
                            map.put(authUserAttributeKeyCustom, authUpdateAttributeResult);
                        }
                    }
                }
                for (ChooseAccountActivity chooseAccountActivity : list) {
                    if (!map.containsKey(AuthUserAttributeKey.custom(chooseAccountActivity.KWHzl()))) {
                        AuthUpdateAttributeResult authUpdateAttributeResult2 = new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.DONE, new HashMap(), null));
                        AuthUserAttributeKey authUserAttributeKeyCustom2 = AuthUserAttributeKey.custom(chooseAccountActivity.KWHzl());
                        Intrinsics.checkNotNullExpressionValue(authUserAttributeKeyCustom2, "");
                        map.put(authUserAttributeKeyCustom2, authUpdateAttributeResult2);
                    }
                }
                return map;
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void resendUserAttributeConfirmationCode(@NotNull final AuthUserAttributeKey authUserAttributeKey, @NotNull AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, @NotNull final Consumer<AuthCodeDeliveryDetails> consumer, @NotNull final Consumer<AuthException> consumer2) {
                Intrinsics.checkNotNullParameter(authUserAttributeKey, "");
                Intrinsics.checkNotNullParameter(authResendUserAttributeConfirmationCodeOptions, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(consumer2, "");
                final AWSCognitoAuthResendUserAttributeConfirmationCodeOptions aWSCognitoAuthResendUserAttributeConfirmationCodeOptions = authResendUserAttributeConfirmationCodeOptions instanceof AWSCognitoAuthResendUserAttributeConfirmationCodeOptions ? (AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) authResendUserAttributeConfirmationCodeOptions : null;
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.resendUserAttributeConfirmationCode.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        if (authNState instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01761(this, consumer2, authUserAttributeKey, aWSCognitoAuthResendUserAttributeConfirmationCodeOptions, consumer, null), 3, null);
                        } else if (authNState instanceof AuthenticationState.SignedOut) {
                            consumer2.accept(new SignedOutException(null, null, null, 7, null));
                        } else {
                            consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C01761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ AuthUserAttributeKey $attributeKey;
                        final /* synthetic */ AWSCognitoAuthResendUserAttributeConfirmationCodeOptions $metadataOptions;
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
                        Object L$0;
                        Object L$1;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01761(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, AuthUserAttributeKey authUserAttributeKey, AWSCognitoAuthResendUserAttributeConfirmationCodeOptions aWSCognitoAuthResendUserAttributeConfirmationCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer2, Continuation<? super C01761> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$attributeKey = authUserAttributeKey;
                            this.$metadataOptions = aWSCognitoAuthResendUserAttributeConfirmationCodeOptions;
                            this.$onSuccess = consumer2;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C01761(this.this$0, this.$onError, this.$attributeKey, this.$metadataOptions, this.$onSuccess, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0083 */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:7:0x0017, B:28:0x007d, B:31:0x0085, B:33:0x008b, B:35:0x0091, B:37:0x0097, B:38:0x009b, B:39:0x00bb, B:42:0x00c3, B:11:0x0023, B:17:0x0035, B:19:0x0043, B:22:0x004b, B:24:0x006e, B:14:0x002a), top: B:48:0x0009 }] */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:7:0x0017, B:28:0x007d, B:31:0x0085, B:33:0x008b, B:35:0x0091, B:37:0x0097, B:38:0x009b, B:39:0x00bb, B:42:0x00c3, B:11:0x0023, B:17:0x0035, B:19:0x0043, B:22:0x004b, B:24:0x006e, B:14:0x002a), top: B:48:0x0009 }] */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:7:0x0017, B:28:0x007d, B:31:0x0085, B:33:0x008b, B:35:0x0091, B:37:0x0097, B:38:0x009b, B:39:0x00bb, B:42:0x00c3, B:11:0x0023, B:17:0x0035, B:19:0x0043, B:22:0x004b, B:24:0x006e, B:14:0x002a), top: B:48:0x0009 }] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Consumer<AuthCodeDeliveryDetails> consumer;
                            final Consumer<AuthException> consumer2;
                            AlertDialog alertDialog;
                            Consumer<AuthCodeDeliveryDetails> consumer3;
                            Consumer<AuthException> consumer4;
                            AnimatorInflater animatorInflaterAEQbTJ;
                            Object obj2;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            Object obj3 = null;
                            obj3 = null;
                            try {
                            } catch (Exception e) {
                                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, e.toString()));
                            }
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 1;
                                obj = realAWSCognitoAuthPlugin.getSession(this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    consumer4 = (Consumer) this.L$1;
                                    consumer3 = (Consumer) this.L$0;
                                    C56391yDq.AEQbTJ(obj);
                                    alertDialog = (AlertDialog) obj;
                                    consumer2 = consumer4;
                                    consumer = consumer3;
                                    if (alertDialog != null && (animatorInflaterAEQbTJ = alertDialog.AEQbTJ()) != null) {
                                        if (animatorInflaterAEQbTJ.KWHzl() == null) {
                                            ElapsedRealtimeLong elapsedRealtimeLongCopydefault = animatorInflaterAEQbTJ.copydefault();
                                            AuthCodeDeliveryDetails.DeliveryMedium deliveryMediumFromString = AuthCodeDeliveryDetails.DeliveryMedium.fromString(elapsedRealtimeLongCopydefault != null ? elapsedRealtimeLongCopydefault.AEQbTJ() : null);
                                            Intrinsics.checkNotNullExpressionValue(deliveryMediumFromString, "");
                                            consumer.accept(new AuthCodeDeliveryDetails(String.valueOf(animatorInflaterAEQbTJ.EZpvd()), deliveryMediumFromString, animatorInflaterAEQbTJ.KWHzl()));
                                            obj2 = Unit.INSTANCE;
                                        } else {
                                            obj2 = new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1$1$1$1$2
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    consumer2.accept(new CodeDeliveryFailureException(null, 1, null));
                                                }
                                            };
                                        }
                                        obj3 = obj2;
                                    }
                                    if (obj3 == null) {
                                        this.$onError.accept(new InvalidUserPoolConfigurationException());
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                            final String accessToken = value != null ? value.getAccessToken() : null;
                            if (accessToken != null) {
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                final AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                                final AWSCognitoAuthResendUserAttributeConfirmationCodeOptions aWSCognitoAuthResendUserAttributeConfirmationCodeOptions = this.$metadataOptions;
                                consumer = this.$onSuccess;
                                consumer2 = this.$onError;
                                AppOpsManager appOpsManagerEZpvd = AppOpsManager.copydefault.EZpvd(new Function1<AppOpsManager.Activity, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1$1$1$getUserAttributeVerificationCodeRequest$1
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(AppOpsManager.Activity activity) {
                                        invoke2(activity);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull AppOpsManager.Activity activity) {
                                        Intrinsics.checkNotNullParameter(activity, "");
                                        activity.copydefault(accessToken);
                                        activity.EZpvd(authUserAttributeKey.getKeyString());
                                        AWSCognitoAuthResendUserAttributeConfirmationCodeOptions aWSCognitoAuthResendUserAttributeConfirmationCodeOptions2 = aWSCognitoAuthResendUserAttributeConfirmationCodeOptions;
                                        activity.EZpvd(aWSCognitoAuthResendUserAttributeConfirmationCodeOptions2 != null ? aWSCognitoAuthResendUserAttributeConfirmationCodeOptions2.getMetadata() : null);
                                    }
                                });
                                BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                                if (cognitoIdentityProviderClient == null) {
                                    alertDialog = null;
                                    if (alertDialog != null) {
                                    }
                                    if (obj3 == null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                this.L$0 = consumer;
                                this.L$1 = consumer2;
                                this.label = 2;
                                obj = cognitoIdentityProviderClient.KWHzl(appOpsManagerEZpvd, this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                                consumer3 = consumer;
                                consumer4 = consumer2;
                                alertDialog = (AlertDialog) obj;
                                consumer2 = consumer4;
                                consumer = consumer3;
                                if (alertDialog != null) {
                                    if (animatorInflaterAEQbTJ.KWHzl() == null) {
                                    }
                                    obj3 = obj2;
                                }
                                if (obj3 == null) {
                                }
                                return Unit.INSTANCE;
                            }
                            this.$onError.accept(new InvalidUserPoolConfigurationException());
                            Unit unit2 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        }
                    }
                });
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void resendUserAttributeConfirmationCode(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull Consumer<AuthCodeDeliveryDetails> consumer, @NotNull Consumer<AuthException> consumer2) {
                Intrinsics.checkNotNullParameter(authUserAttributeKey, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(consumer2, "");
                AuthResendUserAttributeConfirmationCodeOptions.DefaultAuthResendUserAttributeConfirmationCodeOptions defaultAuthResendUserAttributeConfirmationCodeOptionsDefaults = AuthResendUserAttributeConfirmationCodeOptions.defaults();
                Intrinsics.checkNotNullExpressionValue(defaultAuthResendUserAttributeConfirmationCodeOptionsDefaults, "");
                resendUserAttributeConfirmationCode(authUserAttributeKey, defaultAuthResendUserAttributeConfirmationCodeOptionsDefaults, consumer, consumer2);
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void confirmUserAttribute(@NotNull final AuthUserAttributeKey authUserAttributeKey, @NotNull final String str, @NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
                Intrinsics.checkNotNullParameter(authUserAttributeKey, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.confirmUserAttribute.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        if (authNState instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01681(this, consumer, action, authUserAttributeKey, str, null), 3, null);
                        } else if (authNState instanceof AuthenticationState.SignedOut) {
                            consumer.accept(new SignedOutException(null, null, null, 7, null));
                        } else {
                            consumer.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmUserAttribute$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C01681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ AuthUserAttributeKey $attributeKey;
                        final /* synthetic */ String $confirmationCode;
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Action $onSuccess;
                        Object L$0;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01681(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Action action, AuthUserAttributeKey authUserAttributeKey, String str, Continuation<? super C01681> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$onSuccess = action;
                            this.$attributeKey = authUserAttributeKey;
                            this.$confirmationCode = str;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C01681(this.this$0, this.$onError, this.$onSuccess, this.$attributeKey, this.$confirmationCode, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #0 {Exception -> 0x0089, blocks: (B:7:0x0012, B:28:0x0074, B:29:0x0077, B:31:0x007e, B:11:0x001e, B:17:0x0030, B:19:0x003f, B:22:0x0047, B:24:0x0068, B:14:0x0025), top: B:37:0x0008 }] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Unit unit;
                            Action action;
                            Action action2;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            try {
                            } catch (Exception e) {
                                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, e.toString()));
                            }
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 1;
                                obj = realAWSCognitoAuthPlugin.getSession(this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    action2 = (Action) this.L$0;
                                    C56391yDq.AEQbTJ(obj);
                                    action = action2;
                                    action.call();
                                    unit = Unit.INSTANCE;
                                    if (unit == null) {
                                        this.$onError.accept(new InvalidUserPoolConfigurationException());
                                    }
                                    return Unit.INSTANCE;
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                            unit = null;
                            final String accessToken = value != null ? value.getAccessToken() : null;
                            if (accessToken != null) {
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                action = this.$onSuccess;
                                final AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                                final String str = this.$confirmationCode;
                                JobServiceEngine jobServiceEngineAEQbTJ = JobServiceEngine.AEQbTJ.AEQbTJ(new Function1<JobServiceEngine.Activity, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmUserAttribute$1$1$1$verifyUserAttributeRequest$1
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(JobServiceEngine.Activity activity) {
                                        invoke2(activity);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull JobServiceEngine.Activity activity) {
                                        Intrinsics.checkNotNullParameter(activity, "");
                                        activity.OLrzqt(accessToken);
                                        activity.KWHzl(authUserAttributeKey.getKeyString());
                                        activity.copydefault(str);
                                    }
                                });
                                BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                                if (cognitoIdentityProviderClient != null) {
                                    this.L$0 = action;
                                    this.label = 2;
                                    obj = cognitoIdentityProviderClient.EZpvd(jobServiceEngineAEQbTJ, this);
                                    if (obj == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    action2 = action;
                                    action = action2;
                                }
                                action.call();
                                unit = Unit.INSTANCE;
                            }
                            if (unit == null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void getCurrentUser(@NotNull final Consumer<AuthUser> consumer, @NotNull final Consumer<AuthException> consumer2) {
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(consumer2, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.getCurrentUser.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        if (authNState instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new C01731(this, consumer2, consumer, null), 3, null);
                        } else if (authNState instanceof AuthenticationState.SignedOut) {
                            consumer2.accept(new SignedOutException(null, null, null, 7, null));
                        } else {
                            consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getCurrentUser$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C01731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Consumer<AuthUser> $onSuccess;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01731(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Consumer<AuthUser> consumer2, Continuation<? super C01731> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$onSuccess = consumer2;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C01731(this.this$0, this.$onError, this.$onSuccess, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 1;
                                obj = realAWSCognitoAuthPlugin.getSession(this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                            Unit unit = null;
                            String accessToken = value != null ? value.getAccessToken() : null;
                            if (accessToken != null) {
                                Consumer<AuthUser> consumer = this.$onSuccess;
                                SessionHelper sessionHelper = SessionHelper.INSTANCE;
                                String userSub = sessionHelper.getUserSub(accessToken);
                                if (userSub == null) {
                                    userSub = "";
                                }
                                String username = sessionHelper.getUsername(accessToken);
                                consumer.accept(new AuthUser(userSub, username != null ? username : ""));
                                unit = Unit.INSTANCE;
                            }
                            if (unit == null) {
                                this.$onError.accept(new InvalidUserPoolConfigurationException());
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void signOut(@NotNull Consumer<AuthSignOutResult> consumer) {
                Intrinsics.checkNotNullParameter(consumer, "");
                AuthSignOutOptions authSignOutOptionsBuild = AuthSignOutOptions.builder().build();
                Intrinsics.checkNotNullExpressionValue(authSignOutOptionsBuild, "");
                signOut(authSignOutOptionsBuild, consumer);
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void signOut(@NotNull final AuthSignOutOptions authSignOutOptions, @NotNull final Consumer<AuthSignOutResult> consumer) {
                Intrinsics.checkNotNullParameter(authSignOutOptions, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.signOut.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        if (authNState instanceof AuthenticationState.NotConfigured) {
                            consumer.accept(AWSCognitoAuthSignOutResult.CompleteSignOut.INSTANCE);
                            return;
                        }
                        if ((authNState instanceof AuthenticationState.SignedIn) || (authNState instanceof AuthenticationState.SignedOut)) {
                            boolean zIsGlobalSignOut = authSignOutOptions.isGlobalSignOut();
                            AuthSignOutOptions authSignOutOptions2 = authSignOutOptions;
                            AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = authSignOutOptions2 instanceof AWSCognitoAuthSignOutOptions ? (AWSCognitoAuthSignOutOptions) authSignOutOptions2 : null;
                            this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(zIsGlobalSignOut, aWSCognitoAuthSignOutOptions != null ? aWSCognitoAuthSignOutOptions.getBrowserPackage() : null, false, 4, null)), null, 2, null));
                            RealAWSCognitoAuthPlugin._signOut$default(this, false, consumer, 1, null);
                            return;
                        }
                        if (authNState instanceof AuthenticationState.FederatedToIdentityPool) {
                            consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(new InvalidStateException("The user is currently federated to identity pool. You must call clearFederationToIdentityPool to clear credentials.", null, null, 6, null)));
                        } else {
                            consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(new InvalidStateException(null, null, null, 7, null)));
                        }
                    }
                });
            }

            public static /* synthetic */ void _signOut$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, boolean z, Consumer consumer, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = true;
                }
                realAWSCognitoAuthPlugin._signOut(z, consumer);
            }

            private final void _signOut(final boolean z, final Consumer<AuthSignOutResult> consumer) {
                final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._signOut.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        if (authState instanceof AuthState.Configured) {
                            AuthState.Configured configured = (AuthState.Configured) authState;
                            AuthenticationState authenticationStateComponent1 = configured.component1();
                            AuthorizationState authorizationStateComponent2 = configured.component2();
                            if ((authenticationStateComponent1 instanceof AuthenticationState.SignedOut) && (authorizationStateComponent2 instanceof AuthorizationState.Configured)) {
                                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                                AuthenticationState.SignedOut signedOut = (AuthenticationState.SignedOut) authenticationStateComponent1;
                                if (signedOut.getSignedOutData().getHasError()) {
                                    SignedOutData signedOutData = signedOut.getSignedOutData();
                                    Consumer<AuthSignOutResult> consumer2 = consumer;
                                    HostedUIErrorData hostedUIErrorData = signedOutData.getHostedUIErrorData();
                                    HostedUIError hostedUIError = hostedUIErrorData != null ? new HostedUIError(hostedUIErrorData) : null;
                                    GlobalSignOutErrorData globalSignOutErrorData = signedOutData.getGlobalSignOutErrorData();
                                    GlobalSignOutError globalSignOutError = globalSignOutErrorData != null ? new GlobalSignOutError(globalSignOutErrorData) : null;
                                    RevokeTokenErrorData revokeTokenErrorData = signedOutData.getRevokeTokenErrorData();
                                    consumer2.accept(new AWSCognitoAuthSignOutResult.PartialSignOut(hostedUIError, globalSignOutError, revokeTokenErrorData != null ? new RevokeTokenError(revokeTokenErrorData) : null));
                                    if (z) {
                                        RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_OUT.toString());
                                        return;
                                    }
                                    return;
                                }
                                consumer.accept(AWSCognitoAuthSignOutResult.CompleteSignOut.INSTANCE);
                                if (z) {
                                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_OUT.toString());
                                    return;
                                }
                                return;
                            }
                            if (authenticationStateComponent1 instanceof AuthenticationState.Error) {
                                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                                consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(CognitoAuthExceptionConverter.Companion.lookup(((AuthenticationState.Error) authenticationStateComponent1).getException(), "Sign out failed.")));
                            }
                        }
                    }
                }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._signOut.2
                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void deleteUser(@NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.deleteUser.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        if (authNState instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01691(this, consumer, action, null), 3, null);
                        } else if (authNState instanceof AuthenticationState.SignedOut) {
                            consumer.accept(new SignedOutException(null, null, null, 7, null));
                        } else {
                            consumer.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$deleteUser$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C01691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Action $onSuccess;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01691(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Action action, Continuation<? super C01691> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$onSuccess = action;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C01691(this.this$0, this.$onError, this.$onSuccess, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            try {
                                if (i == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                    this.label = 1;
                                    obj = realAWSCognitoAuthPlugin.getSession(this);
                                    if (obj == objCopydefault) {
                                        return objCopydefault;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                                Unit unit = null;
                                String accessToken = value != null ? value.getAccessToken() : null;
                                if (accessToken != null) {
                                    this.this$0._deleteUser(accessToken, this.$onSuccess, this.$onError);
                                    unit = Unit.INSTANCE;
                                }
                                if (unit == null) {
                                    this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                                }
                            } catch (Exception unused) {
                                this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void _deleteUser(final String str, final Action action, final Consumer<AuthException> consumer) {
                final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._deleteUser.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Exception] */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        if (authState instanceof AuthState.Configured) {
                            AuthState.Configured configured = (AuthState.Configured) authState;
                            AuthenticationState authenticationStateComponent1 = configured.component1();
                            AuthorizationState authorizationStateComponent2 = configured.component2();
                            Exception exc = objectRef.element;
                            if (authorizationStateComponent2 instanceof AuthorizationState.DeletingUser) {
                                AuthorizationState.DeletingUser deletingUser = (AuthorizationState.DeletingUser) authorizationStateComponent2;
                                if (deletingUser.getDeleteUserState() instanceof DeleteUserState.Error) {
                                    objectRef.element = ((DeleteUserState.Error) deletingUser.getDeleteUserState()).getException();
                                    return;
                                }
                            }
                            if ((authenticationStateComponent1 instanceof AuthenticationState.SignedOut) && (authorizationStateComponent2 instanceof AuthorizationState.Configured)) {
                                this.sendHubEvent(AuthChannelEventName.USER_DELETED.toString());
                                this.authStateMachine.cancel(stateChangeListenerToken);
                                action.call();
                            } else {
                                if (!(authorizationStateComponent2 instanceof AuthorizationState.SessionEstablished) || exc == null) {
                                    return;
                                }
                                this.authStateMachine.cancel(stateChangeListenerToken);
                                consumer.accept(CognitoAuthExceptionConverter.Companion.lookup(exc, "Request to delete user may have failed. Please check exception stack"));
                            }
                        }
                    }
                }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._deleteUser.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.authStateMachine.send(new DeleteUserEvent(new DeleteUserEvent.EventType.DeleteUser(str), null, 2, null));
                    }
                });
            }

            private final void addAuthStateChangeListener() {
                this.authStateMachine.listen(new StateChangeListenerToken(), new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.addAuthStateChangeListener.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        RealAWSCognitoAuthPlugin.this.logger.verbose("Auth State Change: " + authState);
                    }
                }, null);
            }

            private final void configureAuthStates() {
                final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.configureAuthStates.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        if (authState instanceof AuthState.Configured) {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                        }
                    }
                }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.configureAuthStates.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthEvent(new AuthEvent.EventType.ConfigureAuth(RealAWSCognitoAuthPlugin.this.configuration), null, 2, null));
                    }
                });
            }

            public final void federateToIdentityPool(@NotNull final String str, @NotNull final AuthProvider authProvider, final FederateToIdentityPoolOptions federateToIdentityPoolOptions, @NotNull final Consumer<FederateToIdentityPoolResult> consumer, @NotNull final Consumer<AuthException> consumer2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(authProvider, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(consumer2, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.federateToIdentityPool.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke2(@NotNull AuthState authState) {
                        AmplifyCredential amplifyCredential;
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        AuthorizationState authZState = authState.getAuthZState();
                        if (!(authState instanceof AuthState.Configured)) {
                            consumer2.accept(new InvalidStateException("Federation could not be completed.", null, null, 6, null));
                            return;
                        }
                        if (((authNState instanceof AuthenticationState.SignedOut) || (authNState instanceof AuthenticationState.Error) || (authNState instanceof AuthenticationState.NotConfigured) || (authNState instanceof AuthenticationState.FederatedToIdentityPool)) && ((authZState instanceof AuthorizationState.Configured) || (authZState instanceof AuthorizationState.SessionEstablished) || (authZState instanceof AuthorizationState.Error))) {
                            if (authZState instanceof AuthorizationState.SessionEstablished) {
                                amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
                            } else if (authZState instanceof AuthorizationState.Error) {
                                Exception exception = ((AuthorizationState.Error) authZState).getException();
                                SessionError sessionError = exception instanceof SessionError ? (SessionError) exception : null;
                                amplifyCredential = sessionError != null ? sessionError.getAmplifyCredential() : null;
                            }
                            AuthStateMachine authStateMachine = this.authStateMachine;
                            FederatedToken federatedToken = new FederatedToken(str, CodegenExtensionsKt.getIdentityProviderName(authProvider));
                            FederateToIdentityPoolOptions federateToIdentityPoolOptions2 = federateToIdentityPoolOptions;
                            authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(federatedToken, federateToIdentityPoolOptions2 != null ? federateToIdentityPoolOptions2.getDeveloperProvidedIdentityId() : null, amplifyCredential), null, 2, null));
                            this._federateToIdentityPool(consumer, consumer2);
                            return;
                        }
                        consumer2.accept(new InvalidStateException("Federation could not be completed.", null, null, 6, null));
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void _federateToIdentityPool(final Consumer<FederateToIdentityPoolResult> consumer, final Consumer<AuthException> consumer2) {
                final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                this.authStateMachine.listen(stateChangeListenerToken, new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._federateToIdentityPool.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        AuthorizationState authZState = authState.getAuthZState();
                        if ((authNState instanceof AuthenticationState.FederatedToIdentityPool) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                            AmplifyCredential amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
                            AmplifyCredential.IdentityPoolFederated identityPoolFederated = amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated ? (AmplifyCredential.IdentityPoolFederated) amplifyCredential : null;
                            String identityId = identityPoolFederated != null ? identityPoolFederated.getIdentityId() : null;
                            AWSCredentials credentials = identityPoolFederated != null ? identityPoolFederated.getCredentials() : null;
                            com.amplifyframework.auth.AWSCredentials aWSCredentialsCreateAWSCredentials = com.amplifyframework.auth.AWSCredentials.Factory.createAWSCredentials(credentials != null ? credentials.getAccessKeyId() : null, credentials != null ? credentials.getSecretAccessKey() : null, credentials != null ? credentials.getSessionToken() : null, credentials != null ? credentials.getExpiration() : null);
                            AWSTemporaryCredentials aWSTemporaryCredentials = aWSCredentialsCreateAWSCredentials instanceof AWSTemporaryCredentials ? (AWSTemporaryCredentials) aWSCredentialsCreateAWSCredentials : null;
                            if (identityId != null && aWSTemporaryCredentials != null) {
                                consumer.accept(new FederateToIdentityPoolResult(identityId, aWSTemporaryCredentials));
                                RealAWSCognitoAuthPlugin.this.sendHubEvent(AWSCognitoAuthChannelEventName.FEDERATED_TO_IDENTITY_POOL.toString());
                                return;
                            } else {
                                consumer2.accept(new UnknownException("Unable to parse credentials to expected output.", null, 2, null));
                                return;
                            }
                        }
                        if ((authNState instanceof AuthenticationState.Error) && (authZState instanceof AuthorizationState.Error)) {
                            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(stateChangeListenerToken);
                            consumer2.accept(CognitoAuthExceptionConverter.Companion.lookup(((AuthorizationState.Error) authZState).getException(), "Federation could not be completed."));
                        }
                    }
                }, new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._federateToIdentityPool.2
                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            }

            public final void clearFederationToIdentityPool(@NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.clearFederationToIdentityPool.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
                    
                        if ((((com.amplifyframework.statemachine.codegen.errors.SessionError) r1.getException()).getAmplifyCredential() instanceof com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolFederated) != false) goto L14;
                     */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        AuthenticationState authNState = authState.getAuthNState();
                        AuthorizationState authZState = authState.getAuthZState();
                        if (!(authState instanceof AuthState.Configured) || !(authNState instanceof AuthenticationState.FederatedToIdentityPool) || !(authZState instanceof AuthorizationState.SessionEstablished)) {
                            if (authZState instanceof AuthorizationState.Error) {
                                AuthorizationState.Error error = (AuthorizationState.Error) authZState;
                                if (error.getException() instanceof SessionError) {
                                }
                            }
                            consumer.accept(new InvalidStateException("Clearing of federation failed.", null, null, 6, null));
                            return;
                        }
                        RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.ClearFederationToIdentityPool(null, 1, null), null, 2, null));
                        RealAWSCognitoAuthPlugin.this._clearFederationToIdentityPool(action, consumer);
                    }
                });
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void setUpTOTP(@NotNull final Consumer<TOTPSetupDetails> consumer, @NotNull final Consumer<AuthException> consumer2) {
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(consumer2, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.setUpTOTP.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01771(this, consumer2, consumer, null), 3, null);
                        } else {
                            consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$setUpTOTP$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C01771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Consumer<TOTPSetupDetails> $onSuccess;
                        Object L$0;
                        Object L$1;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01771(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Consumer<TOTPSetupDetails> consumer2, Continuation<? super C01771> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$onSuccess = consumer2;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C01771(this.this$0, this.$onError, this.$onSuccess, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:7:0x0017, B:30:0x0080, B:32:0x0084, B:34:0x008a, B:37:0x0095, B:11:0x0023, B:17:0x0035, B:19:0x0043, B:22:0x004b, B:24:0x0057, B:26:0x0065, B:14:0x002a), top: B:43:0x0009 }] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            BinaryOperator cognitoIdentityProviderClient;
                            Consumer<TOTPSetupDetails> consumer;
                            String str;
                            AuthenticatorDescription authenticatorDescription;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            AuthenticatorDescription authenticatorDescription2 = null;
                            try {
                            } catch (Exception e) {
                                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Cannot find a multi-factor authentication (MFA) method."));
                            }
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 1;
                                obj = realAWSCognitoAuthPlugin.getSession(this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    str = (String) this.L$1;
                                    consumer = (Consumer) this.L$0;
                                    C56391yDq.AEQbTJ(obj);
                                    authenticatorDescription = (AuthenticatorDescription) obj;
                                    if (authenticatorDescription != null) {
                                        String strKWHzl = authenticatorDescription.KWHzl();
                                        if (strKWHzl != null) {
                                            consumer.accept(new TOTPSetupDetails(strKWHzl, str));
                                        }
                                        authenticatorDescription2 = authenticatorDescription;
                                    }
                                    if (authenticatorDescription2 == null) {
                                        this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                            String accessToken = value != null ? value.getAccessToken() : null;
                            if (accessToken != null) {
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                Consumer<TOTPSetupDetails> consumer2 = this.$onSuccess;
                                String username = SessionHelper.INSTANCE.getUsername(accessToken);
                                if (username != null && (cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient()) != null) {
                                    ChooseAccountTypeActivity.Activity activity = new ChooseAccountTypeActivity.Activity();
                                    activity.KWHzl(accessToken);
                                    ChooseAccountTypeActivity chooseAccountTypeActivityOLrzqt = activity.OLrzqt();
                                    this.L$0 = consumer2;
                                    this.L$1 = username;
                                    this.label = 2;
                                    obj = cognitoIdentityProviderClient.KWHzl(chooseAccountTypeActivityOLrzqt, this);
                                    if (obj == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    consumer = consumer2;
                                    str = username;
                                    authenticatorDescription = (AuthenticatorDescription) obj;
                                    if (authenticatorDescription != null) {
                                    }
                                }
                                if (authenticatorDescription2 == null) {
                                }
                                return Unit.INSTANCE;
                            }
                            this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                            Unit unit2 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        }
                    }
                });
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void verifyTOTPSetup(@NotNull String str, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                verifyTotp(str, null, action, consumer);
            }

            @Override // com.amplifyframework.auth.AuthCategoryBehavior
            public void verifyTOTPSetup(@NotNull String str, @NotNull AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, @NotNull Action action, @NotNull Consumer<AuthException> consumer) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(authVerifyTOTPSetupOptions, "");
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                AWSCognitoAuthVerifyTOTPSetupOptions aWSCognitoAuthVerifyTOTPSetupOptions = authVerifyTOTPSetupOptions instanceof AWSCognitoAuthVerifyTOTPSetupOptions ? (AWSCognitoAuthVerifyTOTPSetupOptions) authVerifyTOTPSetupOptions : null;
                verifyTotp(str, aWSCognitoAuthVerifyTOTPSetupOptions != null ? aWSCognitoAuthVerifyTOTPSetupOptions.getFriendlyDeviceName() : null, action, consumer);
            }

            public final void fetchMFAPreference(@NotNull final Consumer<UserMFAPreference> consumer, @NotNull final Consumer<AuthException> consumer2) {
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(consumer2, "");
                this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.fetchMFAPreference.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01701(this, consumer2, consumer, null), 3, null);
                        } else {
                            consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchMFAPreference$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C01701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Consumer<UserMFAPreference> $onSuccess;
                        Object L$0;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01701(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Consumer<UserMFAPreference> consumer2, Continuation<? super C01701> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$onSuccess = consumer2;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C01701(this.this$0, this.$onError, this.$onSuccess, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:7:0x0013, B:28:0x0071, B:30:0x0075, B:32:0x007b, B:35:0x0082, B:37:0x008d, B:38:0x0091, B:40:0x0097, B:42:0x00a6, B:44:0x00ac, B:45:0x00b0, B:47:0x00bb, B:11:0x001f, B:17:0x0031, B:19:0x003f, B:22:0x0047, B:24:0x0059, B:14:0x0026), top: B:53:0x0009 }] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Consumer<UserMFAPreference> consumer;
                            ApplicationErrorReport applicationErrorReport;
                            LinkedHashSet linkedHashSet;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            ApplicationErrorReport applicationErrorReport2 = null;
                            applicationErrorReport2 = null;
                            try {
                            } catch (Exception e) {
                                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Cannot update the MFA preferences"));
                            }
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 1;
                                obj = realAWSCognitoAuthPlugin.getSession(this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    consumer = (Consumer) this.L$0;
                                    C56391yDq.AEQbTJ(obj);
                                    applicationErrorReport = (ApplicationErrorReport) obj;
                                    if (applicationErrorReport != null) {
                                        List<String> listOLrzqt = applicationErrorReport.OLrzqt();
                                        if (listOLrzqt == null || listOLrzqt.isEmpty()) {
                                            linkedHashSet = null;
                                        } else {
                                            linkedHashSet = new LinkedHashSet();
                                            List<String> listOLrzqt2 = applicationErrorReport.OLrzqt();
                                            if (listOLrzqt2 != null) {
                                                Iterator<T> it = listOLrzqt2.iterator();
                                                while (it.hasNext()) {
                                                    linkedHashSet.add(MFAHelperKt.getMFAType((String) it.next()));
                                                }
                                            }
                                        }
                                        String strCopydefault = applicationErrorReport.copydefault();
                                        consumer.accept(new UserMFAPreference(linkedHashSet, strCopydefault != null ? MFAHelperKt.getMFAType(strCopydefault) : null));
                                        applicationErrorReport2 = applicationErrorReport;
                                    }
                                    if (applicationErrorReport2 == null) {
                                        this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                            String accessToken = value != null ? value.getAccessToken() : null;
                            if (accessToken != null) {
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                Consumer<UserMFAPreference> consumer2 = this.$onSuccess;
                                BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                                if (cognitoIdentityProviderClient != null) {
                                    ApplicationLoaders.Application application = new ApplicationLoaders.Application();
                                    application.EZpvd(accessToken);
                                    ApplicationLoaders applicationLoadersCopydefault = application.copydefault();
                                    this.L$0 = consumer2;
                                    this.label = 2;
                                    obj = cognitoIdentityProviderClient.KWHzl(applicationLoadersCopydefault, this);
                                    if (obj == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    consumer = consumer2;
                                    applicationErrorReport = (ApplicationErrorReport) obj;
                                    if (applicationErrorReport != null) {
                                    }
                                }
                                if (applicationErrorReport2 == null) {
                                }
                                return Unit.INSTANCE;
                            }
                            this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                            Unit unit2 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        }
                    }
                });
            }

            public final void updateMFAPreference(final MFAPreference mFAPreference, final MFAPreference mFAPreference2, @NotNull final Action action, @NotNull final Consumer<AuthException> consumer) {
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                if (mFAPreference == null && mFAPreference2 == null) {
                    consumer.accept(new InvalidParameterException("No mfa settings given", null, 2, null));
                } else {
                    final boolean z = (mFAPreference == null || !Intrinsics.EZpvd(mFAPreference.getMfaPreferred$aws_auth_cognito_release(), Boolean.TRUE)) && (mFAPreference2 == null || !Intrinsics.EZpvd(mFAPreference2.getMfaPreferred$aws_auth_cognito_release(), Boolean.TRUE));
                    fetchMFAPreference(new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$$ExternalSyntheticLambda1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // com.amplifyframework.core.Consumer
                        public final void accept(Object obj) {
                            RealAWSCognitoAuthPlugin.updateMFAPreference$lambda$20(this.f$0, consumer, mFAPreference, mFAPreference2, z, action, (UserMFAPreference) obj);
                        }
                    }, new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$$ExternalSyntheticLambda2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // com.amplifyframework.core.Consumer
                        public final void accept(Object obj) {
                            RealAWSCognitoAuthPlugin.updateMFAPreference$lambda$21(consumer, (AuthException) obj);
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void updateMFAPreference$lambda$20(final RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, final Consumer consumer, final MFAPreference mFAPreference, final MFAPreference mFAPreference2, final boolean z, final Action action, final UserMFAPreference userMFAPreference) {
                Intrinsics.checkNotNullParameter(realAWSCognitoAuthPlugin, "");
                Intrinsics.checkNotNullParameter(consumer, "");
                Intrinsics.checkNotNullParameter(action, "");
                Intrinsics.checkNotNullParameter(userMFAPreference, "");
                realAWSCognitoAuthPlugin.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                        invoke2(authState);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AuthState authState) {
                        Intrinsics.checkNotNullParameter(authState, "");
                        if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(realAWSCognitoAuthPlugin, consumer, mFAPreference, mFAPreference2, z, userMFAPreference, action, null), 3, null);
                        } else {
                            consumer.accept(new InvalidStateException(null, null, null, 7, null));
                        }
                    }

                    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Consumer<AuthException> $onError;
                        final /* synthetic */ Action $onSuccess;
                        final /* synthetic */ boolean $overridePreferredSetting;
                        final /* synthetic */ MFAPreference $sms;
                        final /* synthetic */ MFAPreference $totp;
                        final /* synthetic */ UserMFAPreference $userPreference;
                        Object L$0;
                        int label;
                        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, MFAPreference mFAPreference, MFAPreference mFAPreference2, boolean z, UserMFAPreference userMFAPreference, Action action, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = realAWSCognitoAuthPlugin;
                            this.$onError = consumer;
                            this.$sms = mFAPreference;
                            this.$totp = mFAPreference2;
                            this.$overridePreferredSetting = z;
                            this.$userPreference = userMFAPreference;
                            this.$onSuccess = action;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, this.$onError, this.$sms, this.$totp, this.$overridePreferredSetting, this.$userPreference, this.$onSuccess, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[Catch: Exception -> 0x00f7, TryCatch #0 {Exception -> 0x00f7, blocks: (B:7:0x0013, B:56:0x00da, B:58:0x00de, B:60:0x00e4, B:11:0x0020, B:17:0x0032, B:19:0x0040, B:22:0x0048, B:24:0x0062, B:26:0x006d, B:28:0x0073, B:36:0x008b, B:38:0x0098, B:40:0x009d, B:42:0x00a3, B:50:0x00ba, B:52:0x00c7, B:44:0x00aa, B:46:0x00b2, B:30:0x007a, B:32:0x0082, B:14:0x0027), top: B:66:0x0009 }] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            WaitResult waitResultEZpvd;
                            WindowConfiguration windowConfigurationEZpvd;
                            Action action;
                            final boolean zBooleanValue;
                            UiAutomationConnection uiAutomationConnection;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            UiAutomationConnection uiAutomationConnection2 = null;
                            final boolean zBooleanValue2 = true;
                            try {
                            } catch (Exception e) {
                                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Amazon Cognito cannot update the MFA preferences"));
                            }
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                this.label = 1;
                                obj = realAWSCognitoAuthPlugin.getSession(this);
                                if (obj == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    action = (Action) this.L$0;
                                    C56391yDq.AEQbTJ(obj);
                                    uiAutomationConnection = (UiAutomationConnection) obj;
                                    if (uiAutomationConnection != null) {
                                        action.call();
                                        uiAutomationConnection2 = uiAutomationConnection;
                                    }
                                    if (uiAutomationConnection2 == null) {
                                        this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                            String accessToken = value != null ? value.getAccessToken() : null;
                            if (accessToken != null) {
                                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                final MFAPreference mFAPreference = this.$sms;
                                final MFAPreference mFAPreference2 = this.$totp;
                                boolean z = this.$overridePreferredSetting;
                                UserMFAPreference userMFAPreference = this.$userPreference;
                                Action action2 = this.$onSuccess;
                                BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                                if (cognitoIdentityProviderClient != null) {
                                    TimePickerDialog.StateListAnimator stateListAnimator = new TimePickerDialog.StateListAnimator();
                                    stateListAnimator.OLrzqt(accessToken);
                                    if (mFAPreference != null) {
                                        Boolean mfaPreferred$aws_auth_cognito_release = mFAPreference.getMfaPreferred$aws_auth_cognito_release();
                                        if (mfaPreferred$aws_auth_cognito_release != null) {
                                            zBooleanValue = mfaPreferred$aws_auth_cognito_release.booleanValue();
                                        } else {
                                            zBooleanValue = z && userMFAPreference.getPreferred() == MFAType.SMS && mFAPreference.getMfaEnabled$aws_auth_cognito_release();
                                        }
                                        waitResultEZpvd = WaitResult.EZpvd.EZpvd(
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0092: INVOKE (r5v7 'waitResultEZpvd' o.WaitResult) = 
                                              (wrap:o.WaitResult$StateListAnimator:0x008b: SGET  A[Catch: Exception -> 0x00f7, WRAPPED] (LINE:2291) o.WaitResult.EZpvd o.WaitResult$StateListAnimator)
                                              (wrap:kotlin.jvm.functions.Function1<o.WaitResult$Application, kotlin.Unit>:0x008f: CONSTRUCTOR 
                                              (r5v0 'mFAPreference' com.amplifyframework.auth.cognito.MFAPreference A[DONT_INLINE])
                                              (r11v5 'zBooleanValue' boolean A[DONT_INLINE])
                                             A[Catch: Exception -> 0x00f7, MD:(com.amplifyframework.auth.cognito.MFAPreference, boolean):void (m), WRAPPED] call: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$1$1.<init>(com.amplifyframework.auth.cognito.MFAPreference, boolean):void type: CONSTRUCTOR)
                                             VIRTUAL call: o.WaitResult.StateListAnimator.EZpvd(kotlin.jvm.functions.Function1):o.WaitResult A[Catch: Exception -> 0x00f7, MD:(kotlin.jvm.functions.Function1<? super o.WaitResult$Application, kotlin.Unit>):o.WaitResult (m)] (LINE:2291) in method: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes21.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$1$1, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 33 more
                                            */
                                        /*
                                            this = this;
                                            java.lang.Object r0 = o.C56437yFi.OLrzqt()
                                            int r1 = r14.label
                                            r2 = 2
                                            r3 = 0
                                            r4 = 1
                                            if (r1 == 0) goto L24
                                            if (r1 == r4) goto L20
                                            if (r1 != r2) goto L18
                                            java.lang.Object r0 = r14.L$0
                                            com.amplifyframework.core.Action r0 = (com.amplifyframework.core.Action) r0
                                            o.C56391yDq.AEQbTJ(r15)     // Catch: java.lang.Exception -> Lf7
                                            goto Lda
                                        L18:
                                            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                            r15.<init>(r0)
                                            throw r15
                                        L20:
                                            o.C56391yDq.AEQbTJ(r15)     // Catch: java.lang.Exception -> Lf7
                                            goto L32
                                        L24:
                                            o.C56391yDq.AEQbTJ(r15)
                                            com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r15 = r14.this$0     // Catch: java.lang.Exception -> Lf7
                                            r14.label = r4     // Catch: java.lang.Exception -> Lf7
                                            java.lang.Object r15 = com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.access$getSession(r15, r14)     // Catch: java.lang.Exception -> Lf7
                                            if (r15 != r0) goto L32
                                            return r0
                                        L32:
                                            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r15 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r15     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.result.AuthSessionResult r15 = r15.getUserPoolTokensResult()     // Catch: java.lang.Exception -> Lf7
                                            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.AWSCognitoUserPoolTokens r15 = (com.amplifyframework.auth.AWSCognitoUserPoolTokens) r15     // Catch: java.lang.Exception -> Lf7
                                            if (r15 == 0) goto L45
                                            java.lang.String r15 = r15.getAccessToken()     // Catch: java.lang.Exception -> Lf7
                                            goto L46
                                        L45:
                                            r15 = r3
                                        L46:
                                            if (r15 == 0) goto Le4
                                            com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r1 = r14.this$0     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.MFAPreference r5 = r14.$sms     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.MFAPreference r6 = r14.$totp     // Catch: java.lang.Exception -> Lf7
                                            boolean r7 = r14.$overridePreferredSetting     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.UserMFAPreference r8 = r14.$userPreference     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.core.Action r9 = r14.$onSuccess     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.AuthEnvironment r1 = com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.access$getAuthEnvironment$p(r1)     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.AWSCognitoAuthService r1 = r1.getCognitoAuthService()     // Catch: java.lang.Exception -> Lf7
                                            o.BinaryOperator r1 = r1.getCognitoIdentityProviderClient()     // Catch: java.lang.Exception -> Lf7
                                            if (r1 == 0) goto Le2
                                            o.TimePickerDialog$StateListAnimator r10 = new o.TimePickerDialog$StateListAnimator     // Catch: java.lang.Exception -> Lf7
                                            r10.<init>()     // Catch: java.lang.Exception -> Lf7
                                            r10.OLrzqt(r15)     // Catch: java.lang.Exception -> Lf7
                                            r15 = 0
                                            if (r5 == 0) goto L97
                                            java.lang.Boolean r11 = r5.getMfaPreferred$aws_auth_cognito_release()     // Catch: java.lang.Exception -> Lf7
                                            if (r11 == 0) goto L78
                                            boolean r11 = r11.booleanValue()     // Catch: java.lang.Exception -> Lf7
                                            goto L8b
                                        L78:
                                            if (r7 == 0) goto L8a
                                            com.amplifyframework.auth.MFAType r11 = r8.getPreferred()     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.MFAType r12 = com.amplifyframework.auth.MFAType.SMS     // Catch: java.lang.Exception -> Lf7
                                            if (r11 != r12) goto L8a
                                            boolean r11 = r5.getMfaEnabled$aws_auth_cognito_release()     // Catch: java.lang.Exception -> Lf7
                                            if (r11 == 0) goto L8a
                                            r11 = r4
                                            goto L8b
                                        L8a:
                                            r11 = r15
                                        L8b:
                                            o.WaitResult$StateListAnimator r12 = o.WaitResult.EZpvd     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$1$1 r13 = new com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$1$1     // Catch: java.lang.Exception -> Lf7
                                            r13.<init>(r5, r11)     // Catch: java.lang.Exception -> Lf7
                                            o.WaitResult r5 = r12.EZpvd(r13)     // Catch: java.lang.Exception -> Lf7
                                            goto L98
                                        L97:
                                            r5 = r3
                                        L98:
                                            r10.OLrzqt(r5)     // Catch: java.lang.Exception -> Lf7
                                            if (r6 == 0) goto Lc6
                                            java.lang.Boolean r5 = r6.getMfaPreferred$aws_auth_cognito_release()     // Catch: java.lang.Exception -> Lf7
                                            if (r5 == 0) goto La8
                                            boolean r4 = r5.booleanValue()     // Catch: java.lang.Exception -> Lf7
                                            goto Lba
                                        La8:
                                            if (r7 == 0) goto Lb9
                                            com.amplifyframework.auth.MFAType r5 = r8.getPreferred()     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.MFAType r7 = com.amplifyframework.auth.MFAType.TOTP     // Catch: java.lang.Exception -> Lf7
                                            if (r5 != r7) goto Lb9
                                            boolean r5 = r6.getMfaEnabled$aws_auth_cognito_release()     // Catch: java.lang.Exception -> Lf7
                                            if (r5 == 0) goto Lb9
                                            goto Lba
                                        Lb9:
                                            r4 = r15
                                        Lba:
                                            o.WindowConfiguration$Application r15 = o.WindowConfiguration.EZpvd     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$2$1 r5 = new com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$2$1     // Catch: java.lang.Exception -> Lf7
                                            r5.<init>(r6, r4)     // Catch: java.lang.Exception -> Lf7
                                            o.WindowConfiguration r15 = r15.EZpvd(r5)     // Catch: java.lang.Exception -> Lf7
                                            goto Lc7
                                        Lc6:
                                            r15 = r3
                                        Lc7:
                                            r10.KWHzl(r15)     // Catch: java.lang.Exception -> Lf7
                                            o.TimePickerDialog r15 = r10.KWHzl()     // Catch: java.lang.Exception -> Lf7
                                            r14.L$0 = r9     // Catch: java.lang.Exception -> Lf7
                                            r14.label = r2     // Catch: java.lang.Exception -> Lf7
                                            java.lang.Object r15 = r1.EZpvd(r15, r14)     // Catch: java.lang.Exception -> Lf7
                                            if (r15 != r0) goto Ld9
                                            return r0
                                        Ld9:
                                            r0 = r9
                                        Lda:
                                            o.UiAutomationConnection r15 = (o.UiAutomationConnection) r15     // Catch: java.lang.Exception -> Lf7
                                            if (r15 == 0) goto Le2
                                            r0.call()     // Catch: java.lang.Exception -> Lf7
                                            r3 = r15
                                        Le2:
                                            if (r3 != 0) goto L105
                                        Le4:
                                            com.amplifyframework.core.Consumer<com.amplifyframework.auth.AuthException> r15 = r14.$onError     // Catch: java.lang.Exception -> Lf7
                                            com.amplifyframework.auth.exceptions.SignedOutException r6 = new com.amplifyframework.auth.exceptions.SignedOutException     // Catch: java.lang.Exception -> Lf7
                                            r1 = 0
                                            r2 = 0
                                            r3 = 0
                                            r4 = 7
                                            r5 = 0
                                            r0 = r6
                                            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Lf7
                                            r15.accept(r6)     // Catch: java.lang.Exception -> Lf7
                                            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Lf7
                                            goto L105
                                        Lf7:
                                            r15 = move-exception
                                            com.amplifyframework.core.Consumer<com.amplifyframework.auth.AuthException> r0 = r14.$onError
                                            com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter$Companion r1 = com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter.Companion
                                            java.lang.String r2 = "Amazon Cognito cannot update the MFA preferences"
                                            com.amplifyframework.auth.AuthException r15 = r1.lookup(r15, r2)
                                            r0.accept(r15)
                                        L105:
                                            kotlin.Unit r15 = kotlin.Unit.INSTANCE
                                            return r15
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void updateMFAPreference$lambda$21(Consumer consumer, AuthException authException) {
                            Intrinsics.checkNotNullParameter(consumer, "");
                            Intrinsics.checkNotNullParameter(authException, "");
                            consumer.accept(new AuthException("Failed to fetch current MFA preferences which is a pre-requisite to update MFA preferences", "Sorry, we don't have a suggested fix for this error yet.", authException));
                        }

                        private final void verifyTotp(final String str, final String str2, final Action action, final Consumer<AuthException> consumer) {
                            this.authStateMachine.getCurrentState(new Function1<AuthState, Unit>() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.verifyTotp.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AuthState authState) {
                                    invoke2(authState);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull AuthState authState) {
                                    Intrinsics.checkNotNullParameter(authState, "");
                                    if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C01821(this, consumer, str, str2, action, null), 3, null);
                                    } else {
                                        consumer.accept(new InvalidStateException(null, null, null, 7, null));
                                    }
                                }

                                /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$verifyTotp$1$1, reason: invalid class name and collision with other inner class name */
                                public static final class C01821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ String $code;
                                    final /* synthetic */ String $friendlyDeviceName;
                                    final /* synthetic */ Consumer<AuthException> $onError;
                                    final /* synthetic */ Action $onSuccess;
                                    Object L$0;
                                    int label;
                                    final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C01821(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, String str, String str2, Action action, Continuation<? super C01821> continuation) {
                                        super(2, continuation);
                                        this.this$0 = realAWSCognitoAuthPlugin;
                                        this.$onError = consumer;
                                        this.$code = str;
                                        this.$friendlyDeviceName = str2;
                                        this.$onSuccess = action;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new C01821(this.this$0, this.$onError, this.$code, this.$friendlyDeviceName, this.$onSuccess, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C01821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:7:0x0013, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:33:0x008c, B:34:0x0099, B:36:0x009c, B:11:0x001f, B:17:0x0031, B:19:0x003f, B:22:0x0047, B:24:0x005d, B:14:0x0026), top: B:42:0x0009 }] */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Action action;
                                        ActivityRelaunchItem activityRelaunchItem;
                                        Object objCopydefault = C56442yFn.copydefault();
                                        int i = this.label;
                                        ActivityRelaunchItem activityRelaunchItem2 = null;
                                        try {
                                        } catch (Exception e) {
                                            this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Amazon Cognito cannot find a multi-factor authentication (MFA) method."));
                                        }
                                        if (i == 0) {
                                            C56391yDq.AEQbTJ(obj);
                                            RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                                            this.label = 1;
                                            obj = realAWSCognitoAuthPlugin.getSession(this);
                                            if (obj == objCopydefault) {
                                                return objCopydefault;
                                            }
                                        } else {
                                            if (i != 1) {
                                                if (i != 2) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                action = (Action) this.L$0;
                                                C56391yDq.AEQbTJ(obj);
                                                activityRelaunchItem = (ActivityRelaunchItem) obj;
                                                if (activityRelaunchItem != null) {
                                                    if (!(activityRelaunchItem.AEQbTJ() instanceof ActivityLifecycleItem.Activity)) {
                                                        throw new ServiceException("An unknown service error has occurred", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
                                                    }
                                                    action.call();
                                                    activityRelaunchItem2 = activityRelaunchItem;
                                                }
                                                if (activityRelaunchItem2 == null) {
                                                    this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                                                    Unit unit = Unit.INSTANCE;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            C56391yDq.AEQbTJ(obj);
                                        }
                                        AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                                        String accessToken = value != null ? value.getAccessToken() : null;
                                        if (accessToken != null) {
                                            RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                                            String str = this.$code;
                                            String str2 = this.$friendlyDeviceName;
                                            Action action2 = this.$onSuccess;
                                            BinaryOperator cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                                            if (cognitoIdentityProviderClient != null) {
                                                ActivityConfigurationChangeItem.Application application = new ActivityConfigurationChangeItem.Application();
                                                application.KWHzl(str);
                                                application.EZpvd(str2);
                                                application.AEQbTJ(accessToken);
                                                ActivityConfigurationChangeItem activityConfigurationChangeItemEZpvd = application.EZpvd();
                                                this.L$0 = action2;
                                                this.label = 2;
                                                obj = cognitoIdentityProviderClient.copydefault(activityConfigurationChangeItemEZpvd, this);
                                                if (obj == objCopydefault) {
                                                    return objCopydefault;
                                                }
                                                action = action2;
                                                activityRelaunchItem = (ActivityRelaunchItem) obj;
                                                if (activityRelaunchItem != null) {
                                                }
                                            }
                                            if (activityRelaunchItem2 == null) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                                        Unit unit2 = Unit.INSTANCE;
                                        return Unit.INSTANCE;
                                    }
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final void _clearFederationToIdentityPool(final Action action, final Consumer<AuthException> consumer) {
                            _signOut(false, new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$$ExternalSyntheticLambda0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // com.amplifyframework.core.Consumer
                                public final void accept(Object obj) {
                                    RealAWSCognitoAuthPlugin._clearFederationToIdentityPool$lambda$22(consumer, action, this, (AuthSignOutResult) obj);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void _clearFederationToIdentityPool$lambda$22(Consumer consumer, Action action, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthSignOutResult authSignOutResult) {
                            Intrinsics.checkNotNullParameter(consumer, "");
                            Intrinsics.checkNotNullParameter(action, "");
                            Intrinsics.checkNotNullParameter(realAWSCognitoAuthPlugin, "");
                            Intrinsics.checkNotNullParameter(authSignOutResult, "");
                            if (authSignOutResult instanceof AWSCognitoAuthSignOutResult.FailedSignOut) {
                                consumer.accept(((AWSCognitoAuthSignOutResult.FailedSignOut) authSignOutResult).getException());
                            } else {
                                action.call();
                                realAWSCognitoAuthPlugin.sendHubEvent(AWSCognitoAuthChannelEventName.FEDERATION_TO_IDENTITY_POOL_CLEARED.toString());
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final void sendHubEvent(String str) {
                            if (Intrinsics.EZpvd((Object) this.lastPublishedHubEventName.get(), (Object) str)) {
                                return;
                            }
                            this.lastPublishedHubEventName.set(str);
                            Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(str));
                        }
                    }
