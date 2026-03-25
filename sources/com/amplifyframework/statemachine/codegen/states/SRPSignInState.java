package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SRPActions;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SRPSignInState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.SRPSignInState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SRPSignInState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends SRPSignInState {
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
 A[MD:(java.lang.String):void (m)] (LINE:26) call: com.amplifyframework.statemachine.codegen.states.SRPSignInState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private SRPSignInState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class InitiatingSRPA extends SRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InitiatingSRPA() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InitiatingSRPA copy$default(InitiatingSRPA initiatingSRPA, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initiatingSRPA.id;
            }
            return initiatingSRPA.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InitiatingSRPA copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InitiatingSRPA(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingSRPA) && Intrinsics.EZpvd((Object) this.id, (Object) ((InitiatingSRPA) obj).id);
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
            return "InitiatingSRPA(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingSRPA(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.SRPSignInState.InitiatingSRPA.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ InitiatingSRPA(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class RespondingPasswordVerifier extends SRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RespondingPasswordVerifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RespondingPasswordVerifier copy$default(RespondingPasswordVerifier respondingPasswordVerifier, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respondingPasswordVerifier.id;
            }
            return respondingPasswordVerifier.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RespondingPasswordVerifier copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RespondingPasswordVerifier(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingPasswordVerifier) && Intrinsics.EZpvd((Object) this.id, (Object) ((RespondingPasswordVerifier) obj).id);
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
            return "RespondingPasswordVerifier(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingPasswordVerifier(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.SRPSignInState.RespondingPasswordVerifier.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ RespondingPasswordVerifier(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SignedIn extends SRPSignInState {
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
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.amplifyframework.statemachine.codegen.states.SRPSignInState.SignedIn.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SignedIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Cancelling extends SRPSignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Cancelling() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Cancelling copy$default(Cancelling cancelling, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cancelling.id;
            }
            return cancelling.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Cancelling copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Cancelling(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancelling) && Intrinsics.EZpvd((Object) this.id, (Object) ((Cancelling) obj).id);
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
            return "Cancelling(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancelling(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:30) call: com.amplifyframework.statemachine.codegen.states.SRPSignInState.Cancelling.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Cancelling(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SRPSignInState {
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

    public static final class Resolver implements StateMachineResolver<SRPSignInState> {
        private final NotStarted defaultState;
        private final SRPActions srpActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull SRPActions sRPActions) {
            Intrinsics.checkNotNullParameter(sRPActions, "");
            this.srpActions = sRPActions;
            this.defaultState = new NotStarted("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SRPSignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SRPSignInState, StateMachineResolver<SRPSignInState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final SRPEvent.EventType asSRPEvent(StateMachineEvent stateMachineEvent) {
            SRPEvent sRPEvent = stateMachineEvent instanceof SRPEvent ? (SRPEvent) stateMachineEvent : null;
            if (sRPEvent != null) {
                return sRPEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SRPSignInState> resolve(@NotNull SRPSignInState sRPSignInState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(sRPSignInState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            SRPEvent.EventType eventTypeAsSRPEvent = asSRPEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            byte b6 = 0;
            byte b7 = 0;
            byte b8 = 0;
            byte b9 = 0;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            StateResolution<SRPSignInState> stateResolution = new StateResolution<>(sRPSignInState, null, 2, null);
            int i = 1;
            if (sRPSignInState instanceof NotStarted) {
                if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.InitiateSRP) {
                    return new StateResolution<>(new InitiatingSRPA(str, i, b13 == true ? 1 : 0), C56402yEa.EZpvd(this.srpActions.initiateSRPAuthAction((SRPEvent.EventType.InitiateSRP) eventTypeAsSRPEvent)));
                }
                if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.InitiateSRPWithCustom) {
                    return new StateResolution<>(new InitiatingSRPA(b12 == true ? 1 : 0, i, b11 == true ? 1 : 0), C56402yEa.EZpvd(this.srpActions.initiateSRPWithCustomAuthAction((SRPEvent.EventType.InitiateSRPWithCustom) eventTypeAsSRPEvent)));
                }
                return stateResolution;
            }
            if (sRPSignInState instanceof InitiatingSRPA) {
                if (!(eventTypeAsSRPEvent instanceof SRPEvent.EventType.RespondPasswordVerifier)) {
                    return eventTypeAsSRPEvent instanceof SRPEvent.EventType.ThrowAuthError ? new StateResolution<>(new Error(((SRPEvent.EventType.ThrowAuthError) eventTypeAsSRPEvent).getException()), null, 2, null) : eventTypeAsSRPEvent instanceof SRPEvent.EventType.CancelSRPSignIn ? new StateResolution<>(new Cancelling(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                SRPEvent.EventType.RespondPasswordVerifier respondPasswordVerifier = (SRPEvent.EventType.RespondPasswordVerifier) eventTypeAsSRPEvent;
                return new StateResolution<>(new RespondingPasswordVerifier(b10 == true ? 1 : 0, i, b9 == true ? 1 : 0), C56402yEa.EZpvd(this.srpActions.verifyPasswordSRPAction(respondPasswordVerifier.getChallengeParameters(), respondPasswordVerifier.getMetadata(), respondPasswordVerifier.getSession())));
            }
            if (!(sRPSignInState instanceof RespondingPasswordVerifier)) {
                return ((sRPSignInState instanceof Cancelling) && (eventTypeAsSRPEvent instanceof SRPEvent.EventType.Reset)) ? new StateResolution<>(new NotStarted(b2 == true ? 1 : 0, i, b == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (!(eventTypeAsSRPEvent instanceof SRPEvent.EventType.RetryRespondPasswordVerifier)) {
                return eventTypeAsSRPEvent instanceof SRPEvent.EventType.ThrowPasswordVerifierError ? new StateResolution<>(new Error(((SRPEvent.EventType.ThrowPasswordVerifierError) eventTypeAsSRPEvent).getException()), null, 2, null) : eventTypeAsSRPEvent instanceof SRPEvent.EventType.CancelSRPSignIn ? new StateResolution<>(new Cancelling(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            SRPEvent.EventType.RetryRespondPasswordVerifier retryRespondPasswordVerifier = (SRPEvent.EventType.RetryRespondPasswordVerifier) eventTypeAsSRPEvent;
            return new StateResolution<>(new RespondingPasswordVerifier(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.srpActions.verifyPasswordSRPAction(retryRespondPasswordVerifier.getChallengeParameters(), retryRespondPasswordVerifier.getMetadata(), retryRespondPasswordVerifier.getSession())));
        }
    }
}
