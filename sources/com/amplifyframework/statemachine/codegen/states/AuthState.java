package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.AuthActions;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.C56406yEe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthState implements State {
    private AuthenticationState authNState;
    private AuthorizationState authZState;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.AuthState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AuthState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthenticationState getAuthNState() {
        return this.authNState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthorizationState getAuthZState() {
        return this.authZState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAuthNState(AuthenticationState authenticationState) {
        this.authNState = authenticationState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAuthZState(AuthorizationState authorizationState) {
        this.authZState = authorizationState;
    }

    public static final class NotConfigured extends AuthState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notConfigured.id;
            }
            return notConfigured.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotConfigured copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NotConfigured(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && Intrinsics.EZpvd((Object) this.id, (Object) ((NotConfigured) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "NotConfigured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.AuthState.NotConfigured.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotConfigured(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private AuthState() {
        this.authNState = new AuthenticationState.NotConfigured(null, 1, null);
        this.authZState = new AuthorizationState.NotConfigured(null, 1, null);
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class ConfiguringAuth extends AuthState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ConfiguringAuth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConfiguringAuth copy$default(ConfiguringAuth configuringAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configuringAuth.id;
            }
            return configuringAuth.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfiguringAuth copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ConfiguringAuth(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguringAuth) && Intrinsics.EZpvd((Object) this.id, (Object) ((ConfiguringAuth) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfiguringAuth(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfiguringAuth(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.AuthState.ConfiguringAuth.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ ConfiguringAuth(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class ConfiguringAuthentication extends AuthState {
        private AuthenticationState authNState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConfiguringAuthentication copy$default(ConfiguringAuthentication configuringAuthentication, AuthenticationState authenticationState, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = configuringAuthentication.authNState;
            }
            return configuringAuthentication.copy(authenticationState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationState component1() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfiguringAuthentication copy(AuthenticationState authenticationState) {
            return new ConfiguringAuthentication(authenticationState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguringAuthentication) && Intrinsics.EZpvd(this.authNState, ((ConfiguringAuthentication) obj).authNState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthenticationState getAuthNState() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            AuthenticationState authenticationState = this.authNState;
            if (authenticationState == null) {
                return 0;
            }
            return authenticationState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfiguringAuthentication(authNState=" + this.authNState + ")";
        }

        public ConfiguringAuthentication(AuthenticationState authenticationState) {
            super(null);
            this.authNState = authenticationState;
        }
    }

    public static final class ConfiguringAuthorization extends AuthState {
        private AuthenticationState authNState;
        private AuthorizationState authZState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConfiguringAuthorization copy$default(ConfiguringAuthorization configuringAuthorization, AuthenticationState authenticationState, AuthorizationState authorizationState, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = configuringAuthorization.authNState;
            }
            if ((i & 2) != 0) {
                authorizationState = configuringAuthorization.authZState;
            }
            return configuringAuthorization.copy(authenticationState, authorizationState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationState component1() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthorizationState component2() {
            return this.authZState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfiguringAuthorization copy(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            return new ConfiguringAuthorization(authenticationState, authorizationState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfiguringAuthorization)) {
                return false;
            }
            ConfiguringAuthorization configuringAuthorization = (ConfiguringAuthorization) obj;
            return Intrinsics.EZpvd(this.authNState, configuringAuthorization.authNState) && Intrinsics.EZpvd(this.authZState, configuringAuthorization.authZState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthenticationState getAuthNState() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthorizationState getAuthZState() {
            return this.authZState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            AuthenticationState authenticationState = this.authNState;
            int iHashCode = authenticationState == null ? 0 : authenticationState.hashCode();
            AuthorizationState authorizationState = this.authZState;
            return (iHashCode * 31) + (authorizationState != null ? authorizationState.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthZState(AuthorizationState authorizationState) {
            this.authZState = authorizationState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfiguringAuthorization(authNState=" + this.authNState + ", authZState=" + this.authZState + ")";
        }

        public ConfiguringAuthorization(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            super(null);
            this.authNState = authenticationState;
            this.authZState = authorizationState;
        }
    }

    public static final class Configured extends AuthState {
        private AuthenticationState authNState;
        private AuthorizationState authZState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Configured copy$default(Configured configured, AuthenticationState authenticationState, AuthorizationState authorizationState, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = configured.authNState;
            }
            if ((i & 2) != 0) {
                authorizationState = configured.authZState;
            }
            return configured.copy(authenticationState, authorizationState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationState component1() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthorizationState component2() {
            return this.authZState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Configured copy(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            return new Configured(authenticationState, authorizationState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configured)) {
                return false;
            }
            Configured configured = (Configured) obj;
            return Intrinsics.EZpvd(this.authNState, configured.authNState) && Intrinsics.EZpvd(this.authZState, configured.authZState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthenticationState getAuthNState() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthorizationState getAuthZState() {
            return this.authZState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            AuthenticationState authenticationState = this.authNState;
            int iHashCode = authenticationState == null ? 0 : authenticationState.hashCode();
            AuthorizationState authorizationState = this.authZState;
            return (iHashCode * 31) + (authorizationState != null ? authorizationState.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthZState(AuthorizationState authorizationState) {
            this.authZState = authorizationState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Configured(authNState=" + this.authNState + ", authZState=" + this.authZState + ")";
        }

        public Configured(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            super(null);
            this.authNState = authenticationState;
            this.authZState = authorizationState;
        }
    }

    public static final class Error extends AuthState {
        private final Exception exception;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Exception component1() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return new Error(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.EZpvd(this.exception, ((Error) obj).exception);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Exception getException() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.exception.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception exc) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            this.exception = exc;
        }
    }

    public static final class Resolver implements StateMachineResolver<AuthState> {
        private final AuthActions authActions;
        private final StateMachineResolver<AuthenticationState> authNResolver;
        private final StateMachineResolver<AuthorizationState> authZResolver;
        private final NotConfigured defaultState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull StateMachineResolver<AuthenticationState> stateMachineResolver, @NotNull StateMachineResolver<AuthorizationState> stateMachineResolver2, @NotNull AuthActions authActions) {
            Intrinsics.checkNotNullParameter(stateMachineResolver, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver2, "");
            Intrinsics.checkNotNullParameter(authActions, "");
            this.authNResolver = stateMachineResolver;
            this.authZResolver = stateMachineResolver2;
            this.authActions = authActions;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthState, StateMachineResolver<AuthState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthState> resolve(@NotNull AuthState authState, @NotNull StateMachineEvent stateMachineEvent) {
            StateResolution<StateType> stateResolutionResolve;
            StateResolution<StateType> stateResolutionResolve2;
            Intrinsics.checkNotNullParameter(authState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            StateResolution<AuthState> stateResolutionResolveAuthEvent = resolveAuthEvent(authState, stateMachineEvent);
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) stateResolutionResolveAuthEvent.getActions());
            Builder builder = new Builder((AuthState) stateResolutionResolveAuthEvent.getNewState());
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState != null && (stateResolutionResolve2 = this.authNResolver.resolve(authNState, stateMachineEvent)) != 0) {
                builder.setAuthNState((AuthenticationState) stateResolutionResolve2.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve2.getActions());
            }
            AuthorizationState authZState = authState.getAuthZState();
            if (authZState != null && (stateResolutionResolve = this.authZResolver.resolve(authZState, stateMachineEvent)) != 0) {
                builder.setAuthZState((AuthorizationState) stateResolutionResolve.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), listFJNWhG);
        }

        private final StateResolution<AuthState> resolveAuthEvent(AuthState authState, StateMachineEvent stateMachineEvent) {
            AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            StateResolution<AuthState> stateResolution = new StateResolution<>(authState, null, 2, null);
            int i = 1;
            if (authState instanceof NotConfigured) {
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuth) {
                    return new StateResolution<>(new ConfiguringAuth(str, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.authActions.initializeAuthConfigurationAction((AuthEvent.EventType.ConfigureAuth) eventTypeIsAuthEvent)));
                }
                return stateResolution;
            }
            if (!(authState instanceof ConfiguringAuth)) {
                return authState instanceof ConfiguringAuthentication ? eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfiguredAuthentication ? new StateResolution<>(new ConfiguringAuthorization(authState.getAuthNState(), new AuthorizationState.NotConfigured(null, 1, null)), C56402yEa.EZpvd(this.authActions.initializeAuthorizationConfigurationAction(eventTypeIsAuthEvent))) : stateResolution : ((authState instanceof ConfiguringAuthorization) && (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfiguredAuthorization)) ? new StateResolution<>(new Configured(authState.getAuthNState(), authState.getAuthZState()), null, 2, null) : stateResolution;
            }
            if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuthentication) {
                return new StateResolution<>(new ConfiguringAuthentication(new AuthenticationState.NotConfigured(null, 1, null)), C56402yEa.EZpvd(this.authActions.initializeAuthenticationConfigurationAction((AuthEvent.EventType.ConfigureAuthentication) eventTypeIsAuthEvent)));
            }
            return eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuthorization ? new StateResolution<>(new ConfiguringAuthorization(new AuthenticationState.NotConfigured(null, 1, null), new AuthorizationState.NotConfigured(null, 1, null)), C56402yEa.EZpvd(this.authActions.initializeAuthorizationConfigurationAction(eventTypeIsAuthEvent))) : stateResolution;
        }
    }

    public static final class Builder implements com.amplifyframework.statemachine.Builder<AuthState> {
        private AuthenticationState authNState;
        private final AuthState authState;
        private AuthorizationState authZState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationState getAuthNState() {
            return this.authNState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthorizationState getAuthZState() {
            return this.authZState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthZState(AuthorizationState authorizationState) {
            this.authZState = authorizationState;
        }

        public Builder(@NotNull AuthState authState) {
            Intrinsics.checkNotNullParameter(authState, "");
            this.authState = authState;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amplifyframework.statemachine.Builder
        public AuthState build() {
            AuthState authState = this.authState;
            return authState instanceof ConfiguringAuthentication ? new ConfiguringAuthentication(this.authNState) : authState instanceof ConfiguringAuthorization ? new ConfiguringAuthorization(this.authNState, this.authZState) : authState instanceof Configured ? new Configured(this.authNState, this.authZState) : authState;
        }
    }
}
