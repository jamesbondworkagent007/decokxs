package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ AuthenticationEvent.EventType.Configure $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1.this.execute(null, null, this);
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
        AuthenticationEvent authenticationEvent;
        AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1 authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment2;
        Object obj;
        DeviceMetadata deviceMetadata;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj2 = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            Object storedCredentials = this.$event$inlined.getStoredCredentials();
            if (storedCredentials instanceof AmplifyCredential.UserPoolTypeCredential) {
                StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
                CredentialType.Device device = new CredentialType.Device(((AmplifyCredential.UserPoolTypeCredential) storedCredentials).getSignedInData().getUsername());
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = eventDispatcher;
                anonymousClass1.L$2 = id;
                anonymousClass1.L$3 = authEnvironment;
                anonymousClass1.L$4 = storedCredentials;
                anonymousClass1.label = 1;
                Object objLoadCredentials = credentialStoreClient.loadCredentials(device, anonymousClass1);
                if (objLoadCredentials == objCopydefault) {
                    return objCopydefault;
                }
                authEnvironment2 = authEnvironment;
                obj = storedCredentials;
                obj2 = objLoadCredentials;
                eventDispatcher2 = eventDispatcher;
                authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1 = this;
            } else {
                if (storedCredentials instanceof AmplifyCredential.IdentityPoolFederated) {
                    authenticationEvent = new AuthenticationEvent(AuthenticationEvent.EventType.InitializedFederated.INSTANCE, null, 2, null);
                } else {
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.InitializedSignedOut(new SignedOutData(null, null, null, null, 15, null)), null, 2, null);
                }
                authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1 = this;
                eventDispatcher2 = eventDispatcher;
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                AuthEvent authEvent = new AuthEvent(new AuthEvent.EventType.ConfiguredAuthentication(authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1.$event$inlined.getConfiguration(), authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1.$event$inlined.getStoredCredentials()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authEvent.getType());
                eventDispatcher2.send(authEvent);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = (AmplifyCredential) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1 = (AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj2);
        }
        AmplifyCredential.DeviceData deviceData = obj2 instanceof AmplifyCredential.DeviceData ? (AmplifyCredential.DeviceData) obj2 : null;
        if (deviceData == null || (deviceMetadata = deviceData.getDeviceMetadata()) == null) {
            deviceMetadata = DeviceMetadata.Empty.INSTANCE;
        }
        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.InitializedSignedIn(((AmplifyCredential.UserPoolTypeCredential) obj).getSignedInData(), deviceMetadata), null, 2, null);
        authEnvironment = authEnvironment2;
        authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        AuthEvent authEvent2 = new AuthEvent(new AuthEvent.EventType.ConfiguredAuthentication(authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1.$event$inlined.getConfiguration(), authenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1.$event$inlined.getStoredCredentials()), null, 2, null);
        authEnvironment.getLogger().verbose(id + " Sending event " + authEvent2.getType());
        eventDispatcher2.send(authEvent2);
        return Unit.INSTANCE;
    }

    public AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1(String str, AuthenticationEvent.EventType.Configure configure) {
        this.$event$inlined = configure;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
