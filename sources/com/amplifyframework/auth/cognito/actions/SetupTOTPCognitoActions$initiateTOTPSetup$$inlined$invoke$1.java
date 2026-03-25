package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AuthenticatorDescription;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import o.ChooseAccountTypeActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.SetupTOTP $eventType$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1$1, reason: invalid class name */
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
            return SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: Exception -> 0x00a7, TryCatch #1 {Exception -> 0x00a7, blocks: (B:25:0x00a4, B:30:0x00ad, B:32:0x00b3, B:33:0x00d1), top: B:43:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a7, blocks: (B:25:0x00a4, B:30:0x00ad, B:32:0x00b3, B:33:0x00d1), top: B:43:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment2;
        String str;
        Exception e;
        SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1;
        SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12;
        AuthenticatorDescription authenticatorDescription;
        Object objKWHzl;
        SetupTOTPEvent setupTOTPEvent;
        String strKWHzl;
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
                    ChooseAccountTypeActivity.Activity activity = new ChooseAccountTypeActivity.Activity();
                    activity.copydefault(this.$eventType$inlined.getTotpSetupDetails().getSession());
                    ChooseAccountTypeActivity chooseAccountTypeActivityOLrzqt = activity.OLrzqt();
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = eventDispatcher;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.label = 1;
                    objKWHzl = cognitoIdentityProviderClient.KWHzl(chooseAccountTypeActivityOLrzqt, anonymousClass1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12 = this;
                    authenticatorDescription = (AuthenticatorDescription) objKWHzl;
                    if (authenticatorDescription != null) {
                        setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token setup failed"), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12.$eventType$inlined.getTotpSetupDetails().getSession()), null, 2, null);
                    }
                } else {
                    setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12 = this;
                    authenticatorDescription = null;
                    if (authenticatorDescription != null) {
                    }
                }
            } catch (Exception e2) {
                eventDispatcher2 = eventDispatcher;
                authEnvironment2 = authEnvironment;
                str = id;
                e = e2;
                setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = this;
            }
            setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getSession()), null, 2, null);
            id = str;
            authEnvironment = authEnvironment2;
            eventDispatcher = eventDispatcher2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = (SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
                setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12 = setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1;
                objKWHzl = obj;
                id = str;
            } catch (Exception e3) {
                e = e3;
            }
            try {
                authenticatorDescription = (AuthenticatorDescription) objKWHzl;
                if (authenticatorDescription != null && (strKWHzl = authenticatorDescription.KWHzl()) != null) {
                    setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.WaitForAnswer(new SignInTOTPSetupData(strKWHzl, authenticatorDescription.OLrzqt(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12.$eventType$inlined.getTotpSetupDetails().getUsername())), null, 2, null);
                } else {
                    setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token setup failed"), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12.$eventType$inlined.getTotpSetupDetails().getSession()), null, 2, null);
                }
            } catch (Exception e4) {
                SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$13 = setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12;
                eventDispatcher2 = eventDispatcher;
                authEnvironment2 = authEnvironment;
                str = id;
                e = e4;
                setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$13;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getSession()), null, 2, null);
                id = str;
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
        eventDispatcher.send(setupTOTPEvent);
        return Unit.INSTANCE;
    }

    public SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.SetupTOTP setupTOTP) {
        this.$eventType$inlined = setupTOTP;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
