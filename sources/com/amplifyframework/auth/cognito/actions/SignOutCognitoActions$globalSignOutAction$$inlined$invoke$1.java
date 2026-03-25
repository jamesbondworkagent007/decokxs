package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ApplicationThreadConstants;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignOutEvent.EventType.SignOutGlobally $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
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
            return SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1 signOutCognitoActions$globalSignOutAction$$inlined$invoke$1;
        String str;
        EventDispatcher eventDispatcher3;
        BinaryOperator cognitoIdentityProviderClient;
        String str2;
        SignOutEvent signOutEvent;
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
            final String accessToken = this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getAccessToken();
            try {
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            } catch (Exception e) {
                e = e;
                eventDispatcher2 = eventDispatcher;
            }
            if (cognitoIdentityProviderClient != null) {
                ApplicationThreadConstants applicationThreadConstantsAEQbTJ = ApplicationThreadConstants.copydefault.AEQbTJ(new Function1<ApplicationThreadConstants.ActionBar, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$1$evt$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ApplicationThreadConstants.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ApplicationThreadConstants.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                        actionBar.AEQbTJ(accessToken);
                    }
                });
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = accessToken;
                    anonymousClass1.label = 1;
                    Object objCopydefault2 = cognitoIdentityProviderClient.copydefault(applicationThreadConstantsAEQbTJ, anonymousClass1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
                    str2 = id;
                    str = accessToken;
                    eventDispatcher3 = eventDispatcher2;
                    obj = objCopydefault2;
                } catch (Exception e2) {
                    e = e2;
                    signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
                    str = accessToken;
                    eventDispatcher3 = eventDispatcher2;
                    authEnvironment.getLogger().warn("Failed to sign out globally.", e);
                    signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGloballyError(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), new GlobalSignOutErrorData(str, e)), null, 2, null);
                    str2 = id;
                }
            } else {
                signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
                str2 = id;
                str = accessToken;
                eventDispatcher3 = eventDispatcher;
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, 4, null), null, 2, null);
                authEnvironment.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return Unit.INSTANCE;
            }
            signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
            str = accessToken;
            eventDispatcher3 = eventDispatcher2;
            authEnvironment.getLogger().warn("Failed to sign out globally.", e);
            signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGloballyError(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), new GlobalSignOutErrorData(str, e)), null, 2, null);
            str2 = id;
            authEnvironment.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
            eventDispatcher3.send(signOutEvent);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) anonymousClass1.L$4;
        authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
        str2 = (String) anonymousClass1.L$2;
        eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
        signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = (SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1) anonymousClass1.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (Exception e3) {
            e = e3;
            id = str2;
            authEnvironment.getLogger().warn("Failed to sign out globally.", e);
            signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGloballyError(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), new GlobalSignOutErrorData(str, e)), null, 2, null);
            str2 = id;
        }
        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, 4, null), null, 2, null);
        authEnvironment.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
        eventDispatcher3.send(signOutEvent);
        return Unit.INSTANCE;
    }

    public SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1(String str, SignOutEvent.EventType.SignOutGlobally signOutGlobally) {
        this.$event$inlined = signOutGlobally;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
