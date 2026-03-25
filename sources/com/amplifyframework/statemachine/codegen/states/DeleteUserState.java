package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.DeleteUserActions;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeleteUserState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.DeleteUserState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeleteUserState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends DeleteUserState {
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
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.DeleteUserState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private DeleteUserState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class DeletingUser extends DeleteUserState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DeletingUser() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DeletingUser copy$default(DeletingUser deletingUser, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deletingUser.id;
            }
            return deletingUser.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeletingUser copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DeletingUser(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletingUser) && Intrinsics.EZpvd((Object) this.id, (Object) ((DeletingUser) obj).id);
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
            return "DeletingUser(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeletingUser(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.DeleteUserState.DeletingUser.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ DeletingUser(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class UserDeleted extends DeleteUserState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UserDeleted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userDeleted.id;
            }
            return userDeleted.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserDeleted copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UserDeleted(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserDeleted) && Intrinsics.EZpvd((Object) this.id, (Object) ((UserDeleted) obj).id);
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
            return "UserDeleted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserDeleted(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.amplifyframework.statemachine.codegen.states.DeleteUserState.UserDeleted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ UserDeleted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends DeleteUserState {
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

    public static final class Resolver implements StateMachineResolver<DeleteUserState> {
        private final NotStarted defaultState;
        private final DeleteUserActions deleteUserActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull DeleteUserActions deleteUserActions) {
            Intrinsics.checkNotNullParameter(deleteUserActions, "");
            this.deleteUserActions = deleteUserActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<DeleteUserState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<DeleteUserState, StateMachineResolver<DeleteUserState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final DeleteUserEvent.EventType asDeleteUserEvent(StateMachineEvent stateMachineEvent) {
            DeleteUserEvent deleteUserEvent = stateMachineEvent instanceof DeleteUserEvent ? (DeleteUserEvent) stateMachineEvent : null;
            if (deleteUserEvent != null) {
                return deleteUserEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<DeleteUserState> resolve(@NotNull DeleteUserState deleteUserState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(deleteUserState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            DeleteUserEvent.EventType eventTypeAsDeleteUserEvent = asDeleteUserEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            if (eventTypeAsDeleteUserEvent == null) {
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            int i = 1;
            if ((deleteUserState instanceof NotStarted) || (deleteUserState instanceof Error)) {
                if (eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser) {
                    return new StateResolution<>(new DeletingUser(b2 == true ? 1 : 0, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.deleteUserActions.initDeleteUserAction(((DeleteUserEvent.EventType.DeleteUser) eventTypeAsDeleteUserEvent).getAccessToken())));
                }
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            if (deleteUserState instanceof DeletingUser) {
                if (eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.UserDeleted) {
                    return new StateResolution<>(new UserDeleted(str, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.deleteUserActions.initiateSignOut()));
                }
                if (eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.ThrowError) {
                    DeleteUserEvent.EventType.ThrowError throwError = (DeleteUserEvent.EventType.ThrowError) eventTypeAsDeleteUserEvent;
                    if (throwError.getSignOutUser()) {
                        return new StateResolution<>(new UserDeleted(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), C56402yEa.EZpvd(this.deleteUserActions.initiateSignOut()));
                    }
                    return new StateResolution<>(new Error(throwError.getException()), null, 2, null);
                }
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            return new StateResolution<>(deleteUserState, null, 2, null);
        }
    }
}
