package com.amplifyframework.auth.cognito.actions;

import android.net.Uri;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.HostedUIClient;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.SignOutActions;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignOutCognitoActions implements SignOutActions {
    public static final SignOutCognitoActions INSTANCE = new SignOutCognitoActions();

    private SignOutCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action hostedUISignOutAction(@NotNull final SignOutEvent.EventType.InvokeHostedUISignOut invokeHostedUISignOut) {
        Intrinsics.checkNotNullParameter(invokeHostedUISignOut, "");
        Action.Companion companion = Action.Companion;
        final String str = "HostedUISignOut";
        return new Action(str, invokeHostedUISignOut) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$hostedUISignOutAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.InvokeHostedUISignOut $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = invokeHostedUISignOut;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                SignOutEvent signOutEvent;
                Uri uriCreateSignOutUri$aws_auth_cognito_release;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                } catch (Exception e) {
                    authEnvironment.getLogger().warn("Failed to sign out web ui.", e);
                    HostedUIClient hostedUIClient = authEnvironment.getHostedUIClient();
                    HostedUIErrorData hostedUIErrorData = new HostedUIErrorData((hostedUIClient == null || (uriCreateSignOutUri$aws_auth_cognito_release = hostedUIClient.createSignOutUri$aws_auth_cognito_release()) == null) ? null : uriCreateSignOutUri$aws_auth_cognito_release.toString(), e);
                    if (this.$event$inlined.getSignOutData().getGlobalSignOut()) {
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(this.$event$inlined.getSignedInData(), hostedUIErrorData), null, 2, null);
                    } else {
                        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.RevokeToken(this.$event$inlined.getSignedInData(), hostedUIErrorData, null, 4, null), null, 2, null);
                    }
                    authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                    eventDispatcher.send(signOutEvent);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                String browserPackage = this.$event$inlined.getSignOutData().getBrowserPackage();
                if (browserPackage == null) {
                    SignInMethod signInMethod = this.$event$inlined.getSignedInData().getSignInMethod();
                    SignInMethod.HostedUI hostedUI = signInMethod instanceof SignInMethod.HostedUI ? (SignInMethod.HostedUI) signInMethod : null;
                    browserPackage = hostedUI != null ? hostedUI.getBrowserPackage() : null;
                }
                authEnvironment.getHostedUIClient().launchCustomTabsSignOut(browserPackage);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action localSignOutAction(@NotNull final SignOutEvent.EventType.SignOutLocally signOutLocally) {
        Intrinsics.checkNotNullParameter(signOutLocally, "");
        Action.Companion companion = Action.Companion;
        final String str = "LocalSignOut";
        return new Action(str, signOutLocally) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$localSignOutAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.SignOutLocally $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = signOutLocally;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignedInData signedInData = this.$event$inlined.getSignedInData();
                SignOutEvent signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignedOutSuccess(new SignedOutData(signedInData != null ? signedInData.getUsername() : null, this.$event$inlined.getHostedUIErrorData(), this.$event$inlined.getGlobalSignOutErrorData(), this.$event$inlined.getRevokeTokenErrorData())), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher.send(signOutEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action globalSignOutAction(@NotNull SignOutEvent.EventType.SignOutGlobally signOutGlobally) {
        Intrinsics.checkNotNullParameter(signOutGlobally, "");
        Action.Companion companion = Action.Companion;
        return new SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1("GlobalSignOut", signOutGlobally);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action revokeTokenAction(@NotNull SignOutEvent.EventType.RevokeToken revokeToken) {
        Intrinsics.checkNotNullParameter(revokeToken, "");
        Action.Companion companion = Action.Companion;
        return new SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1("RevokeTokens", revokeToken);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action buildRevokeTokenErrorAction(@NotNull final SignOutEvent.EventType.SignOutGloballyError signOutGloballyError) {
        Intrinsics.checkNotNullParameter(signOutGloballyError, "");
        Action.Companion companion = Action.Companion;
        final String str = "BuildRevokeTokenError";
        return new Action(str, signOutGloballyError) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$buildRevokeTokenErrorAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.SignOutGloballyError $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = signOutGloballyError;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignOutEvent signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$event$inlined.getSignedInData(), this.$event$inlined.getHostedUIErrorData(), this.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getRefreshToken(), new Exception("RevokeToken not attempted because GlobalSignOut failed."))), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher.send(signOutEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action userCancelledAction(@NotNull final SignOutEvent.EventType.UserCancelled userCancelled) {
        Intrinsics.checkNotNullParameter(userCancelled, "");
        Action.Companion companion = Action.Companion;
        final String str = "UserCancelledSignOut";
        return new Action(str, userCancelled) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$userCancelledAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.UserCancelled $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = userCancelled;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignOut(this.$event$inlined.getSignedInData(), DeviceMetadata.Empty.INSTANCE), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
