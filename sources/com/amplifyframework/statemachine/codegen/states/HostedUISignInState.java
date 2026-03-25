package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.HostedUIActions;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HostedUISignInState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.HostedUISignInState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HostedUISignInState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends HostedUISignInState {
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
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.HostedUISignInState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private HostedUISignInState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class ShowingUI extends HostedUISignInState {
        private final HostedUIOptions hostedUIOptions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ShowingUI copy$default(ShowingUI showingUI, HostedUIOptions hostedUIOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUIOptions = showingUI.hostedUIOptions;
            }
            return showingUI.copy(hostedUIOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUIOptions component1() {
            return this.hostedUIOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShowingUI copy(@NotNull HostedUIOptions hostedUIOptions) {
            Intrinsics.checkNotNullParameter(hostedUIOptions, "");
            return new ShowingUI(hostedUIOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowingUI) && Intrinsics.EZpvd(this.hostedUIOptions, ((ShowingUI) obj).hostedUIOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUIOptions getHostedUIOptions() {
            return this.hostedUIOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.hostedUIOptions.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ShowingUI(hostedUIOptions=" + this.hostedUIOptions + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowingUI(@NotNull HostedUIOptions hostedUIOptions) {
            super(null);
            Intrinsics.checkNotNullParameter(hostedUIOptions, "");
            this.hostedUIOptions = hostedUIOptions;
        }
    }

    public static final class FetchingToken extends HostedUISignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FetchingToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FetchingToken copy$default(FetchingToken fetchingToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchingToken.id;
            }
            return fetchingToken.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchingToken copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FetchingToken(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingToken) && Intrinsics.EZpvd((Object) this.id, (Object) ((FetchingToken) obj).id);
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
            return "FetchingToken(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingToken(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.amplifyframework.statemachine.codegen.states.HostedUISignInState.FetchingToken.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ FetchingToken(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Done extends HostedUISignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Done() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Done copy$default(Done done, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.id;
            }
            return done.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Done copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Done(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && Intrinsics.EZpvd((Object) this.id, (Object) ((Done) obj).id);
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
            return "Done(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Done(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:30) call: com.amplifyframework.statemachine.codegen.states.HostedUISignInState.Done.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Done(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends HostedUISignInState {
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

    public static final class Resolver implements StateMachineResolver<HostedUISignInState> {
        private final NotStarted defaultState;
        private final HostedUIActions hostedUIActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull HostedUIActions hostedUIActions) {
            Intrinsics.checkNotNullParameter(hostedUIActions, "");
            this.hostedUIActions = hostedUIActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<HostedUISignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<HostedUISignInState, StateMachineResolver<HostedUISignInState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final HostedUIEvent.EventType asHostedUIEvent(StateMachineEvent stateMachineEvent) {
            HostedUIEvent hostedUIEvent = stateMachineEvent instanceof HostedUIEvent ? (HostedUIEvent) stateMachineEvent : null;
            if (hostedUIEvent != null) {
                return hostedUIEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<HostedUISignInState> resolve(@NotNull HostedUISignInState hostedUISignInState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(hostedUISignInState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            HostedUIEvent.EventType eventTypeAsHostedUIEvent = asHostedUIEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            StateResolution<HostedUISignInState> stateResolution = new StateResolution<>(hostedUISignInState, null, 2, null);
            if (hostedUISignInState instanceof NotStarted) {
                if (!(eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ShowHostedUI)) {
                    return stateResolution;
                }
                HostedUIEvent.EventType.ShowHostedUI showHostedUI = (HostedUIEvent.EventType.ShowHostedUI) eventTypeAsHostedUIEvent;
                return new StateResolution<>(new ShowingUI(showHostedUI.getHostedUISignInData().getHostedUIOptions()), C56402yEa.EZpvd(this.hostedUIActions.showHostedUI(showHostedUI)));
            }
            int i = 1;
            if (!(hostedUISignInState instanceof ShowingUI)) {
                return hostedUISignInState instanceof FetchingToken ? eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.TokenFetched ? new StateResolution<>(new Done(b2 == true ? 1 : 0, i, b == true ? 1 : 0), null, 2, null) : eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ThrowError ? new StateResolution<>(new Error(((HostedUIEvent.EventType.ThrowError) eventTypeAsHostedUIEvent).getException()), null, 2, null) : stateResolution : stateResolution;
            }
            if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.FetchToken) {
                return new StateResolution<>(new FetchingToken(str, i, b3 == true ? 1 : 0), C56402yEa.EZpvd(this.hostedUIActions.fetchHostedUISignInToken((HostedUIEvent.EventType.FetchToken) eventTypeAsHostedUIEvent, ((ShowingUI) hostedUISignInState).getHostedUIOptions().getBrowserPackage())));
            }
            return eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ThrowError ? new StateResolution<>(new Error(((HostedUIEvent.EventType.ThrowError) eventTypeAsHostedUIEvent).getException()), null, 2, null) : stateResolution;
        }
    }
}
