package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.ValidationException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.actions.AuthenticationActions;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationCognitoActions implements AuthenticationActions {
    public static final AuthenticationCognitoActions INSTANCE = new AuthenticationCognitoActions();

    private AuthenticationCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action configureAuthenticationAction(@NotNull AuthenticationEvent.EventType.Configure configure) {
        Intrinsics.checkNotNullParameter(configure, "");
        Action.Companion companion = Action.Companion;
        return new AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1("ConfigureAuthN", configure);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action initiateSignInAction(@NotNull final AuthenticationEvent.EventType.SignInRequested signInRequested) {
        Intrinsics.checkNotNullParameter(signInRequested, "");
        Action.Companion companion = Action.Companion;
        final String str = "InitiateSignInAction";
        return new Action(str, signInRequested) { // from class: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$initiateSignInAction$$inlined$invoke$1
            final /* synthetic */ AuthenticationEvent.EventType.SignInRequested $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = signInRequested;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                StateMachineEvent authenticationEvent;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignInData signInData = this.$event$inlined.getSignInData();
                if (signInData instanceof SignInData.SRPSignInData) {
                    SignInData.SRPSignInData sRPSignInData = (SignInData.SRPSignInData) signInData;
                    if (sRPSignInData.getUsername() != null && sRPSignInData.getPassword() != null) {
                        authenticationEvent = new SignInEvent(new SignInEvent.EventType.InitiateSignInWithSRP(sRPSignInData.getUsername(), sRPSignInData.getPassword(), sRPSignInData.getMetadata()), null, 2, null);
                    } else {
                        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username or password empty", null, 4, null)), null, 2, null);
                    }
                } else if (signInData instanceof SignInData.CustomAuthSignInData) {
                    SignInData.CustomAuthSignInData customAuthSignInData = (SignInData.CustomAuthSignInData) signInData;
                    if (customAuthSignInData.getUsername() != null) {
                        authenticationEvent = new SignInEvent(new SignInEvent.EventType.InitiateSignInWithCustom(customAuthSignInData.getUsername(), customAuthSignInData.getMetadata()), null, 2, null);
                    } else {
                        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username can not be empty", null, 4, null)), null, 2, null);
                    }
                } else if (signInData instanceof SignInData.CustomSRPAuthSignInData) {
                    SignInData.CustomSRPAuthSignInData customSRPAuthSignInData = (SignInData.CustomSRPAuthSignInData) signInData;
                    if (customSRPAuthSignInData.getUsername() != null && customSRPAuthSignInData.getPassword() != null) {
                        authenticationEvent = new SignInEvent(new SignInEvent.EventType.InitiateCustomSignInWithSRP(customSRPAuthSignInData.getUsername(), customSRPAuthSignInData.getPassword(), customSRPAuthSignInData.getMetadata()), null, 2, null);
                    } else {
                        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username can not be empty", null, 4, null)), null, 2, null);
                    }
                } else if (signInData instanceof SignInData.HostedUISignInData) {
                    authenticationEvent = new SignInEvent(new SignInEvent.EventType.InitiateHostedUISignIn((SignInData.HostedUISignInData) signInData), null, 2, null);
                } else if (signInData instanceof SignInData.MigrationAuthSignInData) {
                    SignInData.MigrationAuthSignInData migrationAuthSignInData = (SignInData.MigrationAuthSignInData) signInData;
                    if (migrationAuthSignInData.getUsername() != null && migrationAuthSignInData.getPassword() != null) {
                        authenticationEvent = new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(migrationAuthSignInData.getUsername(), migrationAuthSignInData.getPassword(), migrationAuthSignInData.getMetadata()), null, 2, null);
                    } else {
                        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username or password empty", null, 4, null)), null, 2, null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action initiateSignOutAction(@NotNull final AuthenticationEvent.EventType.SignOutRequested signOutRequested, final SignedInData signedInData) {
        Intrinsics.checkNotNullParameter(signOutRequested, "");
        Action.Companion companion = Action.Companion;
        final String str = "InitSignOut";
        return new Action(str, signedInData, signOutRequested) { // from class: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$initiateSignOutAction$$inlined$invoke$1
            final /* synthetic */ AuthenticationEvent.EventType.SignOutRequested $event$inlined;
            final /* synthetic */ SignedInData $signedInData$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$signedInData$inlined = signedInData;
                this.$event$inlined = signOutRequested;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                SignOutEvent signOutEvent;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignedInData signedInData2 = this.$signedInData$inlined;
                if (signedInData2 != null && (signedInData2.getSignInMethod() instanceof SignInMethod.HostedUI)) {
                    signOutEvent = new SignOutEvent(new SignOutEvent.EventType.InvokeHostedUISignOut(this.$event$inlined.getSignOutData(), this.$signedInData$inlined), null, 2, null);
                } else {
                    SignedInData signedInData3 = this.$signedInData$inlined;
                    if (signedInData3 != null && Intrinsics.EZpvd(signedInData3.getSignInMethod(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN)) && authEnvironment.getHostedUIClient() != null) {
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.InvokeHostedUISignOut(this.$event$inlined.getSignOutData(), this.$signedInData$inlined), null, 2, null);
                    } else if (this.$signedInData$inlined != null && this.$event$inlined.getSignOutData().getGlobalSignOut()) {
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(this.$signedInData$inlined, null, 2, null), null, 2, null);
                    } else if (this.$signedInData$inlined != null && !this.$event$inlined.getSignOutData().getGlobalSignOut()) {
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.RevokeToken(this.$signedInData$inlined, null, null, 6, null), null, 2, null);
                    } else {
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$signedInData$inlined, null, null, null, 14, null), null, 2, null);
                    }
                }
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher.send(signOutEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
