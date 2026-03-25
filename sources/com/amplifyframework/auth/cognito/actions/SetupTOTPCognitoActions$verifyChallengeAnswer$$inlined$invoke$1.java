package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityConfigurationChangeItem;
import o.ActivityLifecycleItem;
import o.ActivityRelaunchItem;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.VerifyChallengeAnswer $eventType$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:12:0x0040, B:27:0x00bc, B:32:0x00ca, B:34:0x00d2, B:35:0x00e7, B:36:0x010b), top: B:49:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #2 {Exception -> 0x0045, blocks: (B:12:0x0040, B:27:0x00bc, B:32:0x00ca, B:34:0x00d2, B:35:0x00e7, B:36:0x010b), top: B:49:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1;
        EventDispatcher eventDispatcher3;
        AuthEnvironment authEnvironment2;
        ActivityRelaunchItem activityRelaunchItem;
        SetupTOTPEvent setupTOTPEvent;
        SetupTOTPEvent setupTOTPEvent2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                BinaryOperator cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    ActivityConfigurationChangeItem.Application application = new ActivityConfigurationChangeItem.Application();
                    application.KWHzl(this.$eventType$inlined.getAnswer());
                    application.OLrzqt(this.$eventType$inlined.getSession());
                    application.EZpvd(this.$eventType$inlined.getFriendlyDeviceName());
                    ActivityConfigurationChangeItem activityConfigurationChangeItemEZpvd = application.EZpvd();
                    anonymousClass1.L$0 = this;
                    eventDispatcher2 = eventDispatcher;
                    try {
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = id;
                        anonymousClass1.L$3 = authEnvironment;
                        anonymousClass1.label = 1;
                        Object objCopydefault2 = cognitoIdentityProviderClient.copydefault(activityConfigurationChangeItemEZpvd, anonymousClass1);
                        if (objCopydefault2 == objCopydefault) {
                            return objCopydefault;
                        }
                        setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
                        authEnvironment2 = authEnvironment;
                        eventDispatcher3 = eventDispatcher2;
                        obj = objCopydefault2;
                        activityRelaunchItem = (ActivityRelaunchItem) obj;
                        if (activityRelaunchItem != null) {
                        }
                        setupTOTPEvent = setupTOTPEvent2;
                    } catch (Exception e) {
                        e = e;
                        setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
                        eventDispatcher3 = eventDispatcher2;
                        setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                        authEnvironment2 = authEnvironment;
                    }
                } else {
                    setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
                    authEnvironment2 = authEnvironment;
                    activityRelaunchItem = null;
                    eventDispatcher3 = eventDispatcher;
                    if (activityRelaunchItem != null) {
                    }
                    setupTOTPEvent = setupTOTPEvent2;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
            setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
            eventDispatcher3 = eventDispatcher2;
            setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
            authEnvironment2 = authEnvironment;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = (SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                activityRelaunchItem = (ActivityRelaunchItem) obj;
                if (activityRelaunchItem != null) {
                    if (activityRelaunchItem.AEQbTJ() instanceof ActivityLifecycleItem.Activity) {
                        setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.RespondToAuthChallenge(setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), activityRelaunchItem.KWHzl()), null, 2, null);
                    } else {
                        setupTOTPEvent2 = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new ServiceException("An unknown service error has occurred", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                    }
                } else {
                    setupTOTPEvent2 = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token verification failed"), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                }
                setupTOTPEvent = setupTOTPEvent2;
            } catch (Exception e3) {
                e = e3;
                authEnvironment = authEnvironment2;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                authEnvironment2 = authEnvironment;
            }
        }
        authEnvironment2.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
        eventDispatcher3.send(setupTOTPEvent);
        return Unit.INSTANCE;
    }

    public SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer) {
        this.$eventType$inlined = verifyChallengeAnswer;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
