package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.SignInActions;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInCognitoActions implements SignInActions {
    public static final SignInCognitoActions INSTANCE = new SignInCognitoActions();

    private SignInCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startSRPAuthAction(@NotNull final SignInEvent.EventType.InitiateSignInWithSRP initiateSignInWithSRP) {
        Intrinsics.checkNotNullParameter(initiateSignInWithSRP, "");
        Action.Companion companion = Action.Companion;
        final String str = "StartSRPAuth";
        return new Action(str, initiateSignInWithSRP) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startSRPAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithSRP $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateSignInWithSRP;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.InitiateSRP(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent.getType());
                eventDispatcher.send(sRPEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startCustomAuthAction(@NotNull final SignInEvent.EventType.InitiateSignInWithCustom initiateSignInWithCustom) {
        Intrinsics.checkNotNullParameter(initiateSignInWithCustom, "");
        Action.Companion companion = Action.Companion;
        final String str = "StartCustomAuth";
        return new Action(str, initiateSignInWithCustom) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startCustomAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithCustom $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateSignInWithCustom;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                CustomSignInEvent customSignInEvent = new CustomSignInEvent(new CustomSignInEvent.EventType.InitiateCustomSignIn(this.$event$inlined.getUsername(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                eventDispatcher.send(customSignInEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startMigrationAuthAction(@NotNull final SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        Intrinsics.checkNotNullParameter(initiateMigrateAuth, "");
        Action.Companion companion = Action.Companion;
        final String str = "StartMigrationAuth";
        return new Action(str, initiateMigrateAuth) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startMigrationAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateMigrateAuth $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateMigrateAuth;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent.getType());
                eventDispatcher.send(signInEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startCustomAuthWithSRPAction(@NotNull final SignInEvent.EventType.InitiateCustomSignInWithSRP initiateCustomSignInWithSRP) {
        Intrinsics.checkNotNullParameter(initiateCustomSignInWithSRP, "");
        Action.Companion companion = Action.Companion;
        final String str = "StartCustomSRPAuth";
        return new Action(str, initiateCustomSignInWithSRP) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startCustomAuthWithSRPAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateCustomSignInWithSRP $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateCustomSignInWithSRP;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.InitiateSRPWithCustom(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent.getType());
                eventDispatcher.send(sRPEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startDeviceSRPAuthAction(@NotNull final SignInEvent.EventType.InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP) {
        Intrinsics.checkNotNullParameter(initiateSignInWithDeviceSRP, "");
        Action.Companion companion = Action.Companion;
        final String str = "StartDeviceSRPAuth";
        return new Action(str, initiateSignInWithDeviceSRP) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startDeviceSRPAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithDeviceSRP $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateSignInWithDeviceSRP;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                DeviceSRPSignInEvent deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge(this.$event$inlined.getUsername(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + deviceSRPSignInEvent.getType());
                eventDispatcher.send(deviceSRPSignInEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initResolveChallenge(@NotNull final SignInEvent.EventType.ReceivedChallenge receivedChallenge) {
        Intrinsics.checkNotNullParameter(receivedChallenge, "");
        Action.Companion companion = Action.Companion;
        final String str = "InitResolveChallenge";
        return new Action(str, receivedChallenge) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initResolveChallenge$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.ReceivedChallenge $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = receivedChallenge;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignInChallengeEvent signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.WaitForAnswer(this.$event$inlined.getChallenge(), true), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInChallengeEvent.getType());
                eventDispatcher.send(signInChallengeEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action confirmDevice(@NotNull SignInEvent.EventType.ConfirmDevice confirmDevice) {
        Intrinsics.checkNotNullParameter(confirmDevice, "");
        Action.Companion companion = Action.Companion;
        return new SignInCognitoActions$confirmDevice$$inlined$invoke$1("ConfirmDevice", confirmDevice);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startHostedUIAuthAction(@NotNull final SignInEvent.EventType.InitiateHostedUISignIn initiateHostedUISignIn) {
        Intrinsics.checkNotNullParameter(initiateHostedUISignIn, "");
        Action.Companion companion = Action.Companion;
        final String str = "StartHostedUIAuth";
        return new Action(str, initiateHostedUISignIn) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startHostedUIAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateHostedUISignIn $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateHostedUISignIn;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ShowHostedUI(this.$event$inlined.getHostedUISignInData()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent.getType());
                eventDispatcher.send(hostedUIEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initiateTOTPSetupAction(@NotNull final SignInEvent.EventType.InitiateTOTPSetup initiateTOTPSetup) {
        Intrinsics.checkNotNullParameter(initiateTOTPSetup, "");
        Action.Companion companion = Action.Companion;
        final String str = "initiateTOTPSetup";
        return new Action(str, initiateTOTPSetup) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initiateTOTPSetupAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateTOTPSetup $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = initiateTOTPSetup;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SetupTOTPEvent setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.SetupTOTP(this.$event$inlined.getSignInTOTPSetupData()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                eventDispatcher.send(setupTOTPEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
