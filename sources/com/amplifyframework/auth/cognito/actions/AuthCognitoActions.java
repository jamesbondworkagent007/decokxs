package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.AuthActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthCognitoActions implements AuthActions {
    public static final AuthCognitoActions INSTANCE = new AuthCognitoActions();

    private AuthCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthConfigurationAction(@NotNull AuthEvent.EventType.ConfigureAuth configureAuth) {
        Intrinsics.checkNotNullParameter(configureAuth, "");
        Action.Companion companion = Action.Companion;
        return new AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1("InitAuthConfig");
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthenticationConfigurationAction(@NotNull final AuthEvent.EventType.ConfigureAuthentication configureAuthentication) {
        Intrinsics.checkNotNullParameter(configureAuthentication, "");
        Action.Companion companion = Action.Companion;
        final String str = "InitAuthNConfig";
        return new Action(str, configureAuthentication) { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthenticationConfigurationAction$$inlined$invoke$1
            final /* synthetic */ AuthEvent.EventType.ConfigureAuthentication $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = configureAuthentication;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.Configure(this.$event$inlined.getConfiguration(), this.$event$inlined.getStoredCredentials()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthorizationConfigurationAction(@NotNull final AuthEvent.EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "");
        Action.Companion companion = Action.Companion;
        final String str = "InitAuthZConfig";
        return new Action(str, eventType) { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthorizationConfigurationAction$$inlined$invoke$1
            final /* synthetic */ AuthEvent.EventType $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = eventType;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                AuthorizationEvent authorizationEventInvoke;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1 authCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1 = new Function1<AmplifyCredential, AuthorizationEvent>() { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    public final AuthorizationEvent invoke(@NotNull AmplifyCredential amplifyCredential) {
                        Intrinsics.checkNotNullParameter(amplifyCredential, "");
                        return Intrinsics.EZpvd(amplifyCredential, AmplifyCredential.Empty.INSTANCE) ? new AuthorizationEvent(AuthorizationEvent.EventType.Configure.INSTANCE, null, 2, null) : new AuthorizationEvent(new AuthorizationEvent.EventType.CachedCredentialsAvailable(amplifyCredential), null, 2, null);
                    }
                };
                AuthEvent.EventType eventType2 = this.$event$inlined;
                if (eventType2 instanceof AuthEvent.EventType.ConfiguredAuthentication) {
                    authorizationEventInvoke = authCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1.invoke(((AuthEvent.EventType.ConfiguredAuthentication) eventType2).getStoredCredentials());
                } else {
                    authorizationEventInvoke = eventType2 instanceof AuthEvent.EventType.ConfigureAuthorization ? authCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1.invoke(((AuthEvent.EventType.ConfigureAuthorization) eventType2).getStoredCredentials()) : new AuthorizationEvent(AuthorizationEvent.EventType.Configure.INSTANCE, null, 2, null);
                }
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEventInvoke.getType());
                eventDispatcher.send(authorizationEventInvoke);
                return Unit.INSTANCE;
            }
        };
    }
}
