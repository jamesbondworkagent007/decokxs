package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.JWTParser;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import o.RemoteInput;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignOutEvent.EventType.RevokeToken $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.amplifyframework.statemachine.EventDispatcher] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        final AuthEnvironment authEnvironment;
        final String refreshToken;
        SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1 signOutCognitoActions$revokeTokenAction$$inlined$invoke$1;
        Object obj;
        AuthEnvironment authEnvironment2;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        SignOutEvent signOutEvent;
        Object obj4;
        ?? r8;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj5 = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj5);
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            Logger logger = authEnvironment.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            Object obj6 = " Starting execution";
            sb.append(" Starting execution");
            logger.verbose(sb.toString());
            String accessToken = this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getAccessToken();
            refreshToken = this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getRefreshToken();
            try {
            } catch (Exception e) {
                e = e;
            }
            if (accessToken != null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    obj6 = eventDispatcher;
                    signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
                    obj = obj6;
                    authEnvironment.getLogger().warn("Failed to revoke tokens.", e);
                    signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(refreshToken, e)), null, 2, null);
                    obj4 = obj;
                }
                if (JWTParser.INSTANCE.hasClaim(accessToken, "origin_jti")) {
                    BinaryOperator cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                        RemoteInput remoteInputAEQbTJ = RemoteInput.KWHzl.AEQbTJ(new Function1<RemoteInput.ActionBar, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$revokeTokenAction$1$evt$2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(RemoteInput.ActionBar actionBar) {
                                invoke2(actionBar);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull RemoteInput.ActionBar actionBar) {
                                Intrinsics.checkNotNullParameter(actionBar, "");
                                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                                actionBar.OLrzqt(userPool != null ? userPool.getAppClient() : null);
                                UserPoolConfiguration userPool2 = authEnvironment.getConfiguration().getUserPool();
                                actionBar.KWHzl(userPool2 != null ? userPool2.getAppClientSecret() : null);
                                actionBar.AEQbTJ(refreshToken);
                            }
                        });
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = eventDispatcher;
                        anonymousClass1.L$2 = id;
                        anonymousClass1.L$3 = authEnvironment;
                        anonymousClass1.L$4 = refreshToken;
                        anonymousClass1.label = 1;
                        Object objCopydefault2 = cognitoIdentityProviderClient.copydefault(remoteInputAEQbTJ, anonymousClass1);
                        if (objCopydefault2 == objCopydefault) {
                            return objCopydefault;
                        }
                        signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
                        authEnvironment2 = authEnvironment;
                        str = refreshToken;
                        obj3 = eventDispatcher;
                        str2 = id;
                        obj5 = objCopydefault2;
                    } else {
                        signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
                        authEnvironment2 = authEnvironment;
                        str = refreshToken;
                        obj2 = eventDispatcher;
                        str2 = id;
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, null, 12, null), null, 2, null);
                        r8 = obj2;
                        authEnvironment2.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
                        r8.send(signOutEvent);
                        return Unit.INSTANCE;
                    }
                    authEnvironment2 = authEnvironment;
                    str2 = id;
                    r8 = obj4;
                    authEnvironment2.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
                    r8.send(signOutEvent);
                    return Unit.INSTANCE;
                }
            }
            authEnvironment.getLogger().debug("Access Token does not contain `origin_jti` claim. Skip revoking tokens.");
            signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$event$inlined.getSignedInData(), this.$event$inlined.getHostedUIErrorData(), this.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(refreshToken, new Exception("Access Token does not contain `origin_jti` claim. Skip revoking tokens."))), null, 2, null);
            obj4 = eventDispatcher;
            authEnvironment2 = authEnvironment;
            str2 = id;
            r8 = obj4;
            authEnvironment2.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
            r8.send(signOutEvent);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) anonymousClass1.L$4;
        authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
        str2 = (String) anonymousClass1.L$2;
        obj2 = (EventDispatcher) anonymousClass1.L$1;
        signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = (SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1) anonymousClass1.L$0;
        try {
            C56391yDq.AEQbTJ(obj5);
            obj3 = obj2;
        } catch (Exception e3) {
            e = e3;
            refreshToken = str;
            id = str2;
            authEnvironment = authEnvironment2;
            obj = obj2;
            authEnvironment.getLogger().warn("Failed to revoke tokens.", e);
            signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(refreshToken, e)), null, 2, null);
            obj4 = obj;
            authEnvironment2 = authEnvironment;
            str2 = id;
            r8 = obj4;
        }
        obj2 = obj3;
        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, null, 12, null), null, 2, null);
        r8 = obj2;
        authEnvironment2.getLogger().verbose(str2 + " Sending event " + signOutEvent.getType());
        r8.send(signOutEvent);
        return Unit.INSTANCE;
    }

    public SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1(String str, SignOutEvent.EventType.RevokeToken revokeToken) {
        this.$event$inlined = revokeToken;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
