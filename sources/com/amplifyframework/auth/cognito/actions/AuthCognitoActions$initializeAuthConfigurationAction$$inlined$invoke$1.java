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
public final class AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1 implements Action {
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1.this.execute(null, null, this);
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
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        String str;
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
            String id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
            CredentialType.Amplify amplify = CredentialType.Amplify.INSTANCE;
            anonymousClass1.L$0 = eventDispatcher;
            anonymousClass1.L$1 = id;
            anonymousClass1.L$2 = authEnvironment2;
            anonymousClass1.label = 1;
            Object objLoadCredentials = credentialStoreClient.loadCredentials(amplify, anonymousClass1);
            if (objLoadCredentials == objCopydefault) {
                return objCopydefault;
            }
            eventDispatcher2 = eventDispatcher;
            authEnvironment = authEnvironment2;
            str = id;
            obj = objLoadCredentials;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) anonymousClass1.L$2;
            str = (String) anonymousClass1.L$1;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AmplifyCredential amplifyCredential = (AmplifyCredential) obj;
        if (authEnvironment.getConfiguration().getUserPool() != null) {
            authEvent = new AuthEvent(new AuthEvent.EventType.ConfigureAuthentication(authEnvironment.getConfiguration(), amplifyCredential), null, 2, null);
        } else {
            authEvent = new AuthEvent(new AuthEvent.EventType.ConfigureAuthorization(authEnvironment.getConfiguration(), amplifyCredential), null, 2, null);
        }
        authEnvironment.getLogger().verbose(str + " Sending event " + authEvent.getType());
        eventDispatcher2.send(authEvent);
        return Unit.INSTANCE;
    }

    public AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1(String str) {
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
