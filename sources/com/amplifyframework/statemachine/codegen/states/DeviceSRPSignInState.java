package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeviceSRPSignInState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeviceSRPSignInState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends DeviceSRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.id;
            }
            return notStarted.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotStarted copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NotStarted(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && Intrinsics.EZpvd((Object) this.id, (Object) ((NotStarted) obj).id);
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
            return "NotStarted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:26) call: com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private DeviceSRPSignInState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class InitiatingDeviceSRP extends DeviceSRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InitiatingDeviceSRP() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InitiatingDeviceSRP copy$default(InitiatingDeviceSRP initiatingDeviceSRP, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initiatingDeviceSRP.id;
            }
            return initiatingDeviceSRP.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InitiatingDeviceSRP copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InitiatingDeviceSRP(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingDeviceSRP) && Intrinsics.EZpvd((Object) this.id, (Object) ((InitiatingDeviceSRP) obj).id);
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
            return "InitiatingDeviceSRP(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingDeviceSRP(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState.InitiatingDeviceSRP.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ InitiatingDeviceSRP(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class RespondingDevicePasswordVerifier extends DeviceSRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RespondingDevicePasswordVerifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RespondingDevicePasswordVerifier copy$default(RespondingDevicePasswordVerifier respondingDevicePasswordVerifier, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respondingDevicePasswordVerifier.id;
            }
            return respondingDevicePasswordVerifier.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RespondingDevicePasswordVerifier copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RespondingDevicePasswordVerifier(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingDevicePasswordVerifier) && Intrinsics.EZpvd((Object) this.id, (Object) ((RespondingDevicePasswordVerifier) obj).id);
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
            return "RespondingDevicePasswordVerifier(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingDevicePasswordVerifier(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState.RespondingDevicePasswordVerifier.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ RespondingDevicePasswordVerifier(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SignedIn extends DeviceSRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signedIn.id;
            }
            return signedIn.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedIn copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SignedIn(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedIn) && Intrinsics.EZpvd((Object) this.id, (Object) ((SignedIn) obj).id);
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
            return "SignedIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState.SignedIn.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SignedIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends DeviceSRPSignInState {
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

    public static final class Resolver implements StateMachineResolver<DeviceSRPSignInState> {
        private final NotStarted defaultState;
        private final DeviceSRPSignInActions deviceSRPSignInActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull DeviceSRPSignInActions deviceSRPSignInActions) {
            Intrinsics.checkNotNullParameter(deviceSRPSignInActions, "");
            this.deviceSRPSignInActions = deviceSRPSignInActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<DeviceSRPSignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<DeviceSRPSignInState, StateMachineResolver<DeviceSRPSignInState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final DeviceSRPSignInEvent.EventType asDeviceSRPSignInEvent(StateMachineEvent stateMachineEvent) {
            DeviceSRPSignInEvent deviceSRPSignInEvent = stateMachineEvent instanceof DeviceSRPSignInEvent ? (DeviceSRPSignInEvent) stateMachineEvent : null;
            if (deviceSRPSignInEvent != null) {
                return deviceSRPSignInEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<DeviceSRPSignInState> resolve(@NotNull DeviceSRPSignInState deviceSRPSignInState, @NotNull StateMachineEvent stateMachineEvent) {
            StateResolution<DeviceSRPSignInState> stateResolution;
            Intrinsics.checkNotNullParameter(deviceSRPSignInState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            DeviceSRPSignInEvent.EventType eventTypeAsDeviceSRPSignInEvent = asDeviceSRPSignInEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            if (eventTypeAsDeviceSRPSignInEvent == null) {
                return new StateResolution<>(deviceSRPSignInState, null, 2, null);
            }
            int i = 1;
            if (deviceSRPSignInState instanceof NotStarted) {
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge) {
                    return new StateResolution<>(new InitiatingDeviceSRP(str, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.deviceSRPSignInActions.respondDeviceSRP((DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge) eventTypeAsDeviceSRPSignInEvent)));
                }
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowAuthError) {
                    stateResolution = new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowAuthError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null);
                } else {
                    return new StateResolution<>(deviceSRPSignInState, null, 2, null);
                }
            } else if (deviceSRPSignInState instanceof InitiatingDeviceSRP) {
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier) {
                    return new StateResolution<>(new RespondingDevicePasswordVerifier(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), C56402yEa.EZpvd(this.deviceSRPSignInActions.respondDevicePasswordVerifier((DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier) eventTypeAsDeviceSRPSignInEvent)));
                }
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError) {
                    stateResolution = new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null);
                } else if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowAuthError) {
                    stateResolution = new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowAuthError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null);
                } else {
                    return new StateResolution<>(deviceSRPSignInState, null, 2, null);
                }
            } else {
                if (deviceSRPSignInState instanceof RespondingDevicePasswordVerifier) {
                    if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.FinalizeSignIn) {
                        return new StateResolution<>(new SignedIn(b2 == true ? 1 : 0, i, b == true ? 1 : 0), null, 2, null);
                    }
                    return new StateResolution<>(deviceSRPSignInState, null, 2, null);
                }
                return new StateResolution<>(deviceSRPSignInState, null, 2, null);
            }
            return stateResolution;
        }
    }
}
