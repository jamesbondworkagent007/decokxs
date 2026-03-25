package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent;
import com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState;
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
public abstract class RefreshSessionState implements State {
    private final FetchAuthSessionState fetchAuthSessionState;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.RefreshSessionState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RefreshSessionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FetchAuthSessionState getFetchAuthSessionState() {
        return this.fetchAuthSessionState;
    }

    public static final class NotStarted extends RefreshSessionState {
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
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.amplifyframework.statemachine.codegen.states.RefreshSessionState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private RefreshSessionState() {
        this.fetchAuthSessionState = new FetchAuthSessionState.NotStarted(null, 1, null);
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class RefreshingUserPoolTokens extends RefreshSessionState {
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RefreshingUserPoolTokens copy$default(RefreshingUserPoolTokens refreshingUserPoolTokens, SignedInData signedInData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = refreshingUserPoolTokens.signedInData;
            }
            return refreshingUserPoolTokens.copy(signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RefreshingUserPoolTokens copy(@NotNull SignedInData signedInData) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            return new RefreshingUserPoolTokens(signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingUserPoolTokens) && Intrinsics.EZpvd(this.signedInData, ((RefreshingUserPoolTokens) obj).signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signedInData.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingUserPoolTokens(signedInData=" + this.signedInData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingUserPoolTokens(@NotNull SignedInData signedInData) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            this.signedInData = signedInData;
        }
    }

    public static final class RefreshingAuthSession extends RefreshSessionState {
        private final FetchAuthSessionState fetchAuthSessionState;
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RefreshingAuthSession copy$default(RefreshingAuthSession refreshingAuthSession, SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = refreshingAuthSession.signedInData;
            }
            if ((i & 2) != 0) {
                fetchAuthSessionState = refreshingAuthSession.fetchAuthSessionState;
            }
            return refreshingAuthSession.copy(signedInData, fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState component2() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RefreshingAuthSession copy(@NotNull SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            return new RefreshingAuthSession(signedInData, fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshingAuthSession)) {
                return false;
            }
            RefreshingAuthSession refreshingAuthSession = (RefreshingAuthSession) obj;
            return Intrinsics.EZpvd(this.signedInData, refreshingAuthSession.signedInData) && Intrinsics.EZpvd(this.fetchAuthSessionState, refreshingAuthSession.fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.RefreshSessionState
        public FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.signedInData.hashCode();
            FetchAuthSessionState fetchAuthSessionState = this.fetchAuthSessionState;
            return (iHashCode * 31) + (fetchAuthSessionState == null ? 0 : fetchAuthSessionState.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingAuthSession(signedInData=" + this.signedInData + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingAuthSession(@NotNull SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            this.signedInData = signedInData;
            this.fetchAuthSessionState = fetchAuthSessionState;
        }
    }

    public static final class RefreshingUnAuthSession extends RefreshSessionState {
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RefreshingUnAuthSession copy$default(RefreshingUnAuthSession refreshingUnAuthSession, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                fetchAuthSessionState = refreshingUnAuthSession.fetchAuthSessionState;
            }
            return refreshingUnAuthSession.copy(fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState component1() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RefreshingUnAuthSession copy(FetchAuthSessionState fetchAuthSessionState) {
            return new RefreshingUnAuthSession(fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingUnAuthSession) && Intrinsics.EZpvd(this.fetchAuthSessionState, ((RefreshingUnAuthSession) obj).fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.RefreshSessionState
        public FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            FetchAuthSessionState fetchAuthSessionState = this.fetchAuthSessionState;
            if (fetchAuthSessionState == null) {
                return 0;
            }
            return fetchAuthSessionState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingUnAuthSession(fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }

        public RefreshingUnAuthSession(FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            this.fetchAuthSessionState = fetchAuthSessionState;
        }
    }

    public static final class Refreshed extends RefreshSessionState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Refreshed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = refreshed.id;
            }
            return refreshed.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Refreshed copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Refreshed(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Refreshed) && Intrinsics.EZpvd((Object) this.id, (Object) ((Refreshed) obj).id);
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
            return "Refreshed(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refreshed(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:40) call: com.amplifyframework.statemachine.codegen.states.RefreshSessionState.Refreshed.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Refreshed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<RefreshSessionState> {
        private final NotStarted defaultState;
        private final FetchAuthSessionActions fetchAuthSessionActions;
        private final StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull StateMachineResolver<FetchAuthSessionState> stateMachineResolver, @NotNull FetchAuthSessionActions fetchAuthSessionActions) {
            Intrinsics.checkNotNullParameter(stateMachineResolver, "");
            Intrinsics.checkNotNullParameter(fetchAuthSessionActions, "");
            this.fetchAuthSessionResolver = stateMachineResolver;
            this.fetchAuthSessionActions = fetchAuthSessionActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<RefreshSessionState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<RefreshSessionState, StateMachineResolver<RefreshSessionState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final FetchAuthSessionEvent.EventType asFetchAuthSessionEvent(StateMachineEvent stateMachineEvent) {
            FetchAuthSessionEvent fetchAuthSessionEvent = stateMachineEvent instanceof FetchAuthSessionEvent ? (FetchAuthSessionEvent) stateMachineEvent : null;
            if (fetchAuthSessionEvent != null) {
                return fetchAuthSessionEvent.getEventType();
            }
            return null;
        }

        private final RefreshSessionEvent.EventType asRefreshSessionEvent(StateMachineEvent stateMachineEvent) {
            RefreshSessionEvent refreshSessionEvent = stateMachineEvent instanceof RefreshSessionEvent ? (RefreshSessionEvent) stateMachineEvent : null;
            if (refreshSessionEvent != null) {
                return refreshSessionEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<RefreshSessionState> resolve(@NotNull RefreshSessionState refreshSessionState, @NotNull StateMachineEvent stateMachineEvent) {
            StateResolution<StateType> stateResolutionResolve;
            Intrinsics.checkNotNullParameter(refreshSessionState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            StateResolution<RefreshSessionState> stateResolutionResolveRefreshSessionEvent = resolveRefreshSessionEvent(refreshSessionState, stateMachineEvent);
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) stateResolutionResolveRefreshSessionEvent.getActions());
            Builder builder = new Builder((RefreshSessionState) stateResolutionResolveRefreshSessionEvent.getNewState());
            FetchAuthSessionState fetchAuthSessionState = refreshSessionState.getFetchAuthSessionState();
            if (fetchAuthSessionState != null && (stateResolutionResolve = this.fetchAuthSessionResolver.resolve(fetchAuthSessionState, stateMachineEvent)) != 0) {
                builder.setFetchAuthSessionState((FetchAuthSessionState) stateResolutionResolve.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), listFJNWhG);
        }

        private final StateResolution<RefreshSessionState> resolveRefreshSessionEvent(RefreshSessionState refreshSessionState, StateMachineEvent stateMachineEvent) {
            RefreshSessionEvent.EventType eventTypeAsRefreshSessionEvent = asRefreshSessionEvent(stateMachineEvent);
            FetchAuthSessionEvent.EventType eventTypeAsFetchAuthSessionEvent = asFetchAuthSessionEvent(stateMachineEvent);
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            StateResolution<RefreshSessionState> stateResolution = new StateResolution<>(refreshSessionState, null, 2, null);
            int i = 1;
            if (refreshSessionState instanceof NotStarted) {
                if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshUserPoolTokens) {
                    RefreshSessionEvent.EventType.RefreshUserPoolTokens refreshUserPoolTokens = (RefreshSessionEvent.EventType.RefreshUserPoolTokens) eventTypeAsRefreshSessionEvent;
                    return new StateResolution<>(new RefreshingUserPoolTokens(refreshUserPoolTokens.getSignedInData()), C56402yEa.EZpvd(this.fetchAuthSessionActions.refreshUserPoolTokensAction(refreshUserPoolTokens.getSignedInData())));
                }
                if (!(eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshUnAuthSession)) {
                    return stateResolution;
                }
                return new StateResolution<>(new RefreshingUnAuthSession(new FetchAuthSessionState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.fetchAuthSessionActions.refreshAuthSessionAction(((RefreshSessionEvent.EventType.RefreshUnAuthSession) eventTypeAsRefreshSessionEvent).getLogins())));
            }
            if (refreshSessionState instanceof RefreshingUnAuthSession) {
                if (!(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                    return stateResolution;
                }
                FetchAuthSessionEvent.EventType.Fetched fetched = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new Refreshed(str, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.IdentityPool(fetched.getIdentityId(), fetched.getAwsCredentials()))));
            }
            if (refreshSessionState instanceof RefreshingUserPoolTokens) {
                if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.Refreshed) {
                    return new StateResolution<>(new Refreshed(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), C56402yEa.EZpvd(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.UserPool(((RefreshSessionEvent.EventType.Refreshed) eventTypeAsRefreshSessionEvent).getSignedInData()))));
                }
                if (!(eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshAuthSession)) {
                    return stateResolution;
                }
                RefreshSessionEvent.EventType.RefreshAuthSession refreshAuthSession = (RefreshSessionEvent.EventType.RefreshAuthSession) eventTypeAsRefreshSessionEvent;
                return new StateResolution<>(new RefreshingAuthSession(refreshAuthSession.getSignedInData(), new FetchAuthSessionState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.fetchAuthSessionActions.refreshAuthSessionAction(refreshAuthSession.getLogins())));
            }
            if (!(refreshSessionState instanceof RefreshingAuthSession) || !(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                return stateResolution;
            }
            FetchAuthSessionEvent.EventType.Fetched fetched2 = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
            return new StateResolution<>(new Refreshed(b2 == true ? 1 : 0, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.UserAndIdentityPool(((RefreshingAuthSession) refreshSessionState).getSignedInData(), fetched2.getIdentityId(), fetched2.getAwsCredentials()))));
        }
    }

    public static final class Builder implements com.amplifyframework.statemachine.Builder<RefreshSessionState> {
        private FetchAuthSessionState fetchAuthSessionState;
        private final RefreshSessionState refreshSessionState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFetchAuthSessionState(FetchAuthSessionState fetchAuthSessionState) {
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public Builder(@NotNull RefreshSessionState refreshSessionState) {
            Intrinsics.checkNotNullParameter(refreshSessionState, "");
            this.refreshSessionState = refreshSessionState;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amplifyframework.statemachine.Builder
        public RefreshSessionState build() {
            RefreshSessionState refreshSessionState = this.refreshSessionState;
            return refreshSessionState instanceof RefreshingUnAuthSession ? new RefreshingUnAuthSession(this.fetchAuthSessionState) : refreshSessionState instanceof RefreshingAuthSession ? new RefreshingAuthSession(((RefreshingAuthSession) refreshSessionState).getSignedInData(), this.fetchAuthSessionState) : refreshSessionState;
        }
    }
}
