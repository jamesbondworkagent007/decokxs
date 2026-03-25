package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FetchAuthSessionState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FetchAuthSessionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends FetchAuthSessionState {
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
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private FetchAuthSessionState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class FetchingIdentity extends FetchAuthSessionState {
        private final LoginsMapProvider logins;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FetchingIdentity copy$default(FetchingIdentity fetchingIdentity, LoginsMapProvider loginsMapProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                loginsMapProvider = fetchingIdentity.logins;
            }
            return fetchingIdentity.copy(loginsMapProvider);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoginsMapProvider component1() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchingIdentity copy(@NotNull LoginsMapProvider loginsMapProvider) {
            Intrinsics.checkNotNullParameter(loginsMapProvider, "");
            return new FetchingIdentity(loginsMapProvider);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingIdentity) && Intrinsics.EZpvd(this.logins, ((FetchingIdentity) obj).logins);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoginsMapProvider getLogins() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.logins.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingIdentity(logins=" + this.logins + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingIdentity(@NotNull LoginsMapProvider loginsMapProvider) {
            super(null);
            Intrinsics.checkNotNullParameter(loginsMapProvider, "");
            this.logins = loginsMapProvider;
        }
    }

    public static final class FetchingAWSCredentials extends FetchAuthSessionState {
        private final String identityId;
        private final LoginsMapProvider logins;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FetchingAWSCredentials copy$default(FetchingAWSCredentials fetchingAWSCredentials, String str, LoginsMapProvider loginsMapProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchingAWSCredentials.identityId;
            }
            if ((i & 2) != 0) {
                loginsMapProvider = fetchingAWSCredentials.logins;
            }
            return fetchingAWSCredentials.copy(str, loginsMapProvider);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoginsMapProvider component2() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchingAWSCredentials copy(@NotNull String str, @NotNull LoginsMapProvider loginsMapProvider) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(loginsMapProvider, "");
            return new FetchingAWSCredentials(str, loginsMapProvider);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchingAWSCredentials)) {
                return false;
            }
            FetchingAWSCredentials fetchingAWSCredentials = (FetchingAWSCredentials) obj;
            return Intrinsics.EZpvd((Object) this.identityId, (Object) fetchingAWSCredentials.identityId) && Intrinsics.EZpvd(this.logins, fetchingAWSCredentials.logins);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIdentityId() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoginsMapProvider getLogins() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.identityId.hashCode() * 31) + this.logins.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingAWSCredentials(identityId=" + this.identityId + ", logins=" + this.logins + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingAWSCredentials(@NotNull String str, @NotNull LoginsMapProvider loginsMapProvider) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(loginsMapProvider, "");
            this.identityId = str;
            this.logins = loginsMapProvider;
        }
    }

    public static final class Fetched extends FetchAuthSessionState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fetched() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetched.id;
            }
            return fetched.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fetched copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fetched(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fetched) && Intrinsics.EZpvd((Object) this.id, (Object) ((Fetched) obj).id);
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
            return "Fetched(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fetched(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:30) call: com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState.Fetched.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Fetched(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Error extends FetchAuthSessionState {
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

    public static final class Resolver implements StateMachineResolver<FetchAuthSessionState> {
        private final NotStarted defaultState;
        private final FetchAuthSessionActions fetchAuthSessionActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull FetchAuthSessionActions fetchAuthSessionActions) {
            Intrinsics.checkNotNullParameter(fetchAuthSessionActions, "");
            this.fetchAuthSessionActions = fetchAuthSessionActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<FetchAuthSessionState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<FetchAuthSessionState, StateMachineResolver<FetchAuthSessionState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final FetchAuthSessionEvent.EventType asFetchAuthSessionEvent(StateMachineEvent stateMachineEvent) {
            FetchAuthSessionEvent fetchAuthSessionEvent = stateMachineEvent instanceof FetchAuthSessionEvent ? (FetchAuthSessionEvent) stateMachineEvent : null;
            if (fetchAuthSessionEvent != null) {
                return fetchAuthSessionEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<FetchAuthSessionState> resolve(@NotNull FetchAuthSessionState fetchAuthSessionState, @NotNull StateMachineEvent stateMachineEvent) {
            StateResolution<FetchAuthSessionState> stateResolution;
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            FetchAuthSessionEvent.EventType eventTypeAsFetchAuthSessionEvent = asFetchAuthSessionEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            StateResolution<FetchAuthSessionState> stateResolution2 = new StateResolution<>(fetchAuthSessionState, null, 2, null);
            if (fetchAuthSessionState instanceof NotStarted) {
                if (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchIdentity) {
                    FetchAuthSessionEvent.EventType.FetchIdentity fetchIdentity = (FetchAuthSessionEvent.EventType.FetchIdentity) eventTypeAsFetchAuthSessionEvent;
                    return new StateResolution<>(new FetchingIdentity(fetchIdentity.getLogins()), C56402yEa.EZpvd(this.fetchAuthSessionActions.fetchIdentityAction(fetchIdentity.getLogins())));
                }
                if (!(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchAwsCredentials)) {
                    return stateResolution2;
                }
                FetchAuthSessionEvent.EventType.FetchAwsCredentials fetchAwsCredentials = (FetchAuthSessionEvent.EventType.FetchAwsCredentials) eventTypeAsFetchAuthSessionEvent;
                stateResolution = new StateResolution<>(new FetchingAWSCredentials(fetchAwsCredentials.getIdentityId(), fetchAwsCredentials.getLogins()), C56402yEa.EZpvd(this.fetchAuthSessionActions.fetchAWSCredentialsAction(fetchAwsCredentials.getIdentityId(), fetchAwsCredentials.getLogins())));
            } else if (fetchAuthSessionState instanceof FetchingIdentity) {
                if (!(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchAwsCredentials)) {
                    return stateResolution2;
                }
                FetchAuthSessionEvent.EventType.FetchAwsCredentials fetchAwsCredentials2 = (FetchAuthSessionEvent.EventType.FetchAwsCredentials) eventTypeAsFetchAuthSessionEvent;
                stateResolution = new StateResolution<>(new FetchingAWSCredentials(fetchAwsCredentials2.getIdentityId(), fetchAwsCredentials2.getLogins()), C56402yEa.EZpvd(this.fetchAuthSessionActions.fetchAWSCredentialsAction(fetchAwsCredentials2.getIdentityId(), fetchAwsCredentials2.getLogins())));
            } else {
                if (!(fetchAuthSessionState instanceof FetchingAWSCredentials) || !(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                    return stateResolution2;
                }
                FetchAuthSessionEvent.EventType.Fetched fetched = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new Fetched(str, 1, b == true ? 1 : 0), C56402yEa.EZpvd(this.fetchAuthSessionActions.notifySessionEstablishedAction(fetched.getIdentityId(), fetched.getAwsCredentials())));
            }
            return stateResolution;
        }
    }
}
