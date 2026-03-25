package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SignInChallengeState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.SignInChallengeState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignInChallengeState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends SignInChallengeState {
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
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.SignInChallengeState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private SignInChallengeState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class WaitingForAnswer extends SignInChallengeState {
        private final AuthChallenge challenge;
        private boolean hasNewResponse;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WaitingForAnswer copy$default(WaitingForAnswer waitingForAnswer, AuthChallenge authChallenge, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                authChallenge = waitingForAnswer.challenge;
            }
            if ((i & 2) != 0) {
                z = waitingForAnswer.hasNewResponse;
            }
            return waitingForAnswer.copy(authChallenge, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthChallenge component1() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WaitingForAnswer copy(@NotNull AuthChallenge authChallenge, boolean z) {
            Intrinsics.checkNotNullParameter(authChallenge, "");
            return new WaitingForAnswer(authChallenge, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingForAnswer)) {
                return false;
            }
            WaitingForAnswer waitingForAnswer = (WaitingForAnswer) obj;
            return Intrinsics.EZpvd(this.challenge, waitingForAnswer.challenge) && this.hasNewResponse == waitingForAnswer.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.challenge.hashCode();
            boolean z = this.hasNewResponse;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return (iHashCode * 31) + r1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "WaitingForAnswer(challenge=" + this.challenge + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.data.AuthChallenge)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.SignInChallengeState.WaitingForAnswer.<init>(com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void type: THIS */
        public /* synthetic */ WaitingForAnswer(AuthChallenge authChallenge, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(authChallenge, (i & 2) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForAnswer(@NotNull AuthChallenge authChallenge, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(authChallenge, "");
            this.challenge = authChallenge;
            this.hasNewResponse = z;
        }
    }

    public static final class Verifying extends SignInChallengeState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Verifying() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Verifying copy$default(Verifying verifying, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifying.id;
            }
            return verifying.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Verifying copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Verifying(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verifying) && Intrinsics.EZpvd((Object) this.id, (Object) ((Verifying) obj).id);
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
            return "Verifying(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verifying(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:32) call: com.amplifyframework.statemachine.codegen.states.SignInChallengeState.Verifying.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Verifying(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Verified extends SignInChallengeState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Verified() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Verified copy$default(Verified verified, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verified.id;
            }
            return verified.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Verified copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Verified(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && Intrinsics.EZpvd((Object) this.id, (Object) ((Verified) obj).id);
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
            return "Verified(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verified(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:33) call: com.amplifyframework.statemachine.codegen.states.SignInChallengeState.Verified.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Verified(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SignInChallengeState {
        private final AuthChallenge challenge;
        private final Exception exception;
        private boolean hasNewResponse;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, Exception exc, AuthChallenge authChallenge, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            if ((i & 2) != 0) {
                authChallenge = error.challenge;
            }
            if ((i & 4) != 0) {
                z = error.hasNewResponse;
            }
            return error.copy(exc, authChallenge, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Exception component1() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthChallenge component2() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@NotNull Exception exc, @NotNull AuthChallenge authChallenge, boolean z) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(authChallenge, "");
            return new Error(exc, authChallenge, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.EZpvd(this.exception, error.exception) && Intrinsics.EZpvd(this.challenge, error.challenge) && this.hasNewResponse == error.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Exception getException() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.exception.hashCode();
            int iHashCode2 = this.challenge.hashCode();
            boolean z = this.hasNewResponse;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + r2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", challenge=" + this.challenge + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Exception)
  (r2v0 com.amplifyframework.statemachine.codegen.data.AuthChallenge)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.Exception, com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void (m)] (LINE:34) call: com.amplifyframework.statemachine.codegen.states.SignInChallengeState.Error.<init>(java.lang.Exception, com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void type: THIS */
        public /* synthetic */ Error(Exception exc, AuthChallenge authChallenge, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(exc, authChallenge, (i & 4) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception exc, @NotNull AuthChallenge authChallenge, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(authChallenge, "");
            this.exception = exc;
            this.challenge = authChallenge;
            this.hasNewResponse = z;
        }
    }

    public static final class Resolver implements StateMachineResolver<SignInChallengeState> {
        private final SignInChallengeActions challengeActions;
        private final SignInChallengeState defaultState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public SignInChallengeState getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull SignInChallengeActions signInChallengeActions) {
            Intrinsics.checkNotNullParameter(signInChallengeActions, "");
            this.challengeActions = signInChallengeActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignInChallengeState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignInChallengeState, StateMachineResolver<SignInChallengeState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final SignInChallengeEvent.EventType asSignInChallengeEvent(StateMachineEvent stateMachineEvent) {
            SignInChallengeEvent signInChallengeEvent = stateMachineEvent instanceof SignInChallengeEvent ? (SignInChallengeEvent) stateMachineEvent : null;
            if (signInChallengeEvent != null) {
                return signInChallengeEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignInChallengeState> resolve(@NotNull SignInChallengeState signInChallengeState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(signInChallengeState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            int i = 2;
            StateResolution<SignInChallengeState> stateResolution = new StateResolution<>(signInChallengeState, null, 2, null);
            SignInChallengeEvent.EventType eventTypeAsSignInChallengeEvent = asSignInChallengeEvent(stateMachineEvent);
            boolean z = false;
            if (signInChallengeState instanceof NotStarted) {
                return eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer ? new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), z, i, defaultConstructorMarker), null, 2, null) : stateResolution;
            }
            if (signInChallengeState instanceof WaitingForAnswer) {
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.VerifyChallengeAnswer)) {
                    return stateResolution;
                }
                SignInChallengeEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer = (SignInChallengeEvent.EventType.VerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                WaitingForAnswer waitingForAnswer = (WaitingForAnswer) signInChallengeState;
                return new StateResolution<>(new Verifying(waitingForAnswer.getChallenge().getChallengeName()), C56402yEa.EZpvd(this.challengeActions.verifyChallengeAuthAction(verifyChallengeAnswer.getAnswer(), verifyChallengeAnswer.getMetadata(), verifyChallengeAnswer.getUserAttributes(), waitingForAnswer.getChallenge())));
            }
            if (signInChallengeState instanceof Verifying) {
                int i2 = 1;
                if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.Verified) {
                    return new StateResolution<>(new Verified(b3 == true ? 1 : 0, i2, b2 == true ? 1 : 0), null, 2, null);
                }
                if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.ThrowError) {
                    SignInChallengeEvent.EventType.ThrowError throwError = (SignInChallengeEvent.EventType.ThrowError) eventTypeAsSignInChallengeEvent;
                    return new StateResolution<>(new Error(throwError.getException(), throwError.getChallenge(), true), yDY.AhwBna());
                }
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer)) {
                    return eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer ? new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), true), yDY.AhwBna()) : stateResolution;
                }
                SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer retryVerifyChallengeAnswer = (SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                return new StateResolution<>(new Verifying(retryVerifyChallengeAnswer.getAuthChallenge().getChallengeName()), C56402yEa.EZpvd(this.challengeActions.verifyChallengeAuthAction(retryVerifyChallengeAnswer.getAnswer(), retryVerifyChallengeAnswer.getMetadata(), retryVerifyChallengeAnswer.getUserAttributes(), retryVerifyChallengeAnswer.getAuthChallenge())));
            }
            if (!(signInChallengeState instanceof Error)) {
                return stateResolution;
            }
            if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.VerifyChallengeAnswer) {
                SignInChallengeEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer2 = (SignInChallengeEvent.EventType.VerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                Error error = (Error) signInChallengeState;
                return new StateResolution<>(new Verifying(error.getChallenge().getChallengeName()), C56402yEa.EZpvd(this.challengeActions.verifyChallengeAuthAction(verifyChallengeAnswer2.getAnswer(), verifyChallengeAnswer2.getMetadata(), verifyChallengeAnswer2.getUserAttributes(), error.getChallenge())));
            }
            if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer) {
                return new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), z, i, b == true ? 1 : 0), yDY.AhwBna());
            }
            return stateResolution;
        }
    }
}
