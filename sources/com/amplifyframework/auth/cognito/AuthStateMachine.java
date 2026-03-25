package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.actions.AuthCognitoActions;
import com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions;
import com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions;
import com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions;
import com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions;
import com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions;
import com.amplifyframework.auth.cognito.actions.HostedUICognitoActions;
import com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions;
import com.amplifyframework.auth.cognito.actions.SRPCognitoActions;
import com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignInCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignOutCognitoActions;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.StateMachine;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.CustomSignInState;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState;
import com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.MigrateSignInState;
import com.amplifyframework.statemachine.codegen.states.RefreshSessionState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthStateMachine extends StateMachine<AuthState, Environment> {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.StateMachineResolver)
  (r2v0 com.amplifyframework.statemachine.Environment)
  (wrap:com.amplifyframework.statemachine.codegen.states.AuthState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.states.AuthState) : (r3v0 com.amplifyframework.statemachine.codegen.states.AuthState))
 A[MD:(com.amplifyframework.statemachine.StateMachineResolver<com.amplifyframework.statemachine.codegen.states.AuthState>, com.amplifyframework.statemachine.Environment, com.amplifyframework.statemachine.codegen.states.AuthState):void (m)] (LINE:51) call: com.amplifyframework.auth.cognito.AuthStateMachine.<init>(com.amplifyframework.statemachine.StateMachineResolver, com.amplifyframework.statemachine.Environment, com.amplifyframework.statemachine.codegen.states.AuthState):void type: THIS */
    public /* synthetic */ AuthStateMachine(StateMachineResolver stateMachineResolver, Environment environment, AuthState authState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateMachineResolver, environment, (i & 4) != 0 ? null : authState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthStateMachine(@NotNull StateMachineResolver<AuthState> stateMachineResolver, @NotNull Environment environment, AuthState authState) {
        super(stateMachineResolver, environment, null, null, authState, 12, null);
        Intrinsics.checkNotNullParameter(stateMachineResolver, "");
        Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.Environment)
  (wrap:com.amplifyframework.statemachine.codegen.states.AuthState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.states.AuthState) : (r2v0 com.amplifyframework.statemachine.codegen.states.AuthState))
 A[MD:(com.amplifyframework.statemachine.Environment, com.amplifyframework.statemachine.codegen.states.AuthState):void (m)] (LINE:57) call: com.amplifyframework.auth.cognito.AuthStateMachine.<init>(com.amplifyframework.statemachine.Environment, com.amplifyframework.statemachine.codegen.states.AuthState):void type: THIS */
    public /* synthetic */ AuthStateMachine(Environment environment, AuthState authState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(environment, (i & 2) != 0 ? null : authState);
    }

    public AuthStateMachine(@NotNull Environment environment, AuthState authState) {
        Intrinsics.checkNotNullParameter(environment, "");
        AuthenticationState.Resolver resolver = new AuthenticationState.Resolver(new SignInState.Resolver(new SRPSignInState.Resolver(SRPCognitoActions.INSTANCE), new CustomSignInState.Resolver(SignInCustomCognitoActions.INSTANCE), new MigrateSignInState.Resolver(MigrateAuthCognitoActions.INSTANCE), new SignInChallengeState.Resolver(SignInChallengeCognitoActions.INSTANCE), new HostedUISignInState.Resolver(HostedUICognitoActions.INSTANCE), new DeviceSRPSignInState.Resolver(DeviceSRPCognitoSignInActions.INSTANCE), new SetupTOTPState.Resolver(SetupTOTPCognitoActions.INSTANCE), SignInCognitoActions.INSTANCE), new SignOutState.Resolver(SignOutCognitoActions.INSTANCE), AuthenticationCognitoActions.INSTANCE);
        FetchAuthSessionCognitoActions fetchAuthSessionCognitoActions = FetchAuthSessionCognitoActions.INSTANCE;
        this(new AuthState.Resolver(resolver, new AuthorizationState.Resolver(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), new RefreshSessionState.Resolver(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), fetchAuthSessionCognitoActions), new DeleteUserState.Resolver(DeleteUserCognitoActions.INSTANCE), AuthorizationCognitoActions.INSTANCE), AuthCognitoActions.INSTANCE), environment, authState);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.AuthStateMachine.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AuthStateMachine logging(@NotNull Environment environment) {
            Intrinsics.checkNotNullParameter(environment, "");
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default = StateMachineResolver.DefaultImpls.logging$default(new AuthenticationState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new SignInState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new SRPSignInState.Resolver(SRPCognitoActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new CustomSignInState.Resolver(SignInCustomCognitoActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new MigrateSignInState.Resolver(MigrateAuthCognitoActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new SignInChallengeState.Resolver(SignInChallengeCognitoActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new HostedUISignInState.Resolver(HostedUICognitoActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new DeviceSRPSignInState.Resolver(DeviceSRPCognitoSignInActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new SetupTOTPState.Resolver(SetupTOTPCognitoActions.INSTANCE), null, null, 3, null), SignInCognitoActions.INSTANCE), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new SignOutState.Resolver(SignOutCognitoActions.INSTANCE), null, null, 3, null), AuthenticationCognitoActions.INSTANCE), null, null, 3, null);
            FetchAuthSessionCognitoActions fetchAuthSessionCognitoActions = FetchAuthSessionCognitoActions.INSTANCE;
            return new AuthStateMachine(StateMachineResolver.DefaultImpls.logging$default(new AuthState.Resolver(loggingStateMachineResolverLogging$default, StateMachineResolver.DefaultImpls.logging$default(new AuthorizationState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new RefreshSessionState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), null, null, 3, null), fetchAuthSessionCognitoActions), null, null, 3, null), new DeleteUserState.Resolver(DeleteUserCognitoActions.INSTANCE), AuthorizationCognitoActions.INSTANCE), null, null, 3, null), AuthCognitoActions.INSTANCE), null, null, 3, null), environment, null, 4, null);
        }
    }
}
