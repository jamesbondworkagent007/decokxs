package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1 implements Action {
    final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1$1, reason: invalid class name */
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
            return AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1 authorizationCognitoActions$persistCredentials$$inlined$invoke$1;
        String str;
        AuthEnvironment authEnvironment2;
        EventDispatcher eventDispatcher2;
        AuthEvent authEvent;
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
                StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
                CredentialType.Amplify amplify = CredentialType.Amplify.INSTANCE;
                AmplifyCredential amplifyCredential = this.$amplifyCredential$inlined;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = eventDispatcher;
                anonymousClass1.L$2 = id;
                anonymousClass1.L$3 = authEnvironment;
                anonymousClass1.label = 1;
                if (credentialStoreClient.storeCredentials(amplify, amplifyCredential, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
                authorizationCognitoActions$persistCredentials$$inlined$invoke$1 = this;
            } catch (Exception unused) {
                AuthEnvironment authEnvironment3 = authEnvironment;
                EventDispatcher eventDispatcher3 = eventDispatcher;
                authEnvironment2 = authEnvironment3;
                eventDispatcher2 = eventDispatcher3;
                str = id;
                String str2 = str;
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
                authEvent = new AuthEvent(AuthEvent.EventType.CachedCredentialsFailed.INSTANCE, null, 2, null);
                id = str2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            authorizationCognitoActions$persistCredentials$$inlined$invoke$1 = (AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                id = str;
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
            } catch (Exception unused2) {
                String str22 = str;
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
                authEvent = new AuthEvent(AuthEvent.EventType.CachedCredentialsFailed.INSTANCE, null, 2, null);
                id = str22;
            }
        }
        authEvent = new AuthEvent(new AuthEvent.EventType.ReceivedCachedCredentials(authorizationCognitoActions$persistCredentials$$inlined$invoke$1.$amplifyCredential$inlined), null, 2, null);
        authEnvironment.getLogger().verbose(id + " Sending event " + authEvent.getType());
        eventDispatcher.send(authEvent);
        return Unit.INSTANCE;
    }

    public AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1(String str, AmplifyCredential amplifyCredential) {
        this.$amplifyCredential$inlined = amplifyCredential;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
