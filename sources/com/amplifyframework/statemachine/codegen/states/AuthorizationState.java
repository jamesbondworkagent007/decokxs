package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.AuthorizationActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.errors.SessionError;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState;
import com.amplifyframework.statemachine.codegen.states.RefreshSessionState;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthorizationState implements State {
    private final String type;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.AuthorizationState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AuthorizationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.type;
    }

    public static final class NotConfigured extends AuthorizationState {
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
 A[MD:(java.lang.String):void (m)] (LINE:39) call: com.amplifyframework.statemachine.codegen.states.AuthorizationState.NotConfigured.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotConfigured(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private AuthorizationState() {
        this.type = toString();
    }

    public static final class Configured extends AuthorizationState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Configured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Configured copy$default(Configured configured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configured.id;
            }
            return configured.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Configured copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Configured(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Configured) && Intrinsics.EZpvd((Object) this.id, (Object) ((Configured) obj).id);
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
            return "Configured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Configured(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:40) call: com.amplifyframework.statemachine.codegen.states.AuthorizationState.Configured.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Configured(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningIn extends AuthorizationState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signingIn.id;
            }
            return signingIn.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningIn copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SigningIn(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && Intrinsics.EZpvd((Object) this.id, (Object) ((SigningIn) obj).id);
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
            return "SigningIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:41) call: com.amplifyframework.statemachine.codegen.states.AuthorizationState.SigningIn.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SigningIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningOut extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningOut copy$default(SigningOut signingOut, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = signingOut.amplifyCredential;
            }
            return signingOut.copy(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningOut copy(@NotNull AmplifyCredential amplifyCredential) {
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            return new SigningOut(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOut) && Intrinsics.EZpvd(this.amplifyCredential, ((SigningOut) obj).amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOut(amplifyCredential=" + this.amplifyCredential + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOut(@NotNull AmplifyCredential amplifyCredential) {
            super(null);
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            this.amplifyCredential = amplifyCredential;
        }
    }

    public static final class FetchingAuthSession extends AuthorizationState {
        private final FetchAuthSessionState fetchAuthSessionState;
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FetchingAuthSession copy$default(FetchingAuthSession fetchingAuthSession, SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = fetchingAuthSession.signedInData;
            }
            if ((i & 2) != 0) {
                fetchAuthSessionState = fetchingAuthSession.fetchAuthSessionState;
            }
            return fetchingAuthSession.copy(signedInData, fetchAuthSessionState);
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
        public final FetchingAuthSession copy(@NotNull SignedInData signedInData, @NotNull FetchAuthSessionState fetchAuthSessionState) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            return new FetchingAuthSession(signedInData, fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchingAuthSession)) {
                return false;
            }
            FetchingAuthSession fetchingAuthSession = (FetchingAuthSession) obj;
            return Intrinsics.EZpvd(this.signedInData, fetchingAuthSession.signedInData) && Intrinsics.EZpvd(this.fetchAuthSessionState, fetchingAuthSession.fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.signedInData.hashCode() * 31) + this.fetchAuthSessionState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingAuthSession(signedInData=" + this.signedInData + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingAuthSession(@NotNull SignedInData signedInData, @NotNull FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            this.signedInData = signedInData;
            this.fetchAuthSessionState = fetchAuthSessionState;
        }
    }

    public static final class FetchingUnAuthSession extends AuthorizationState {
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FetchingUnAuthSession copy$default(FetchingUnAuthSession fetchingUnAuthSession, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                fetchAuthSessionState = fetchingUnAuthSession.fetchAuthSessionState;
            }
            return fetchingUnAuthSession.copy(fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState component1() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchingUnAuthSession copy(@NotNull FetchAuthSessionState fetchAuthSessionState) {
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            return new FetchingUnAuthSession(fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingUnAuthSession) && Intrinsics.EZpvd(this.fetchAuthSessionState, ((FetchingUnAuthSession) obj).fetchAuthSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.fetchAuthSessionState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingUnAuthSession(fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingUnAuthSession(@NotNull FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            this.fetchAuthSessionState = fetchAuthSessionState;
        }
    }

    public static final class RefreshingSession extends AuthorizationState {
        private final AmplifyCredential existingCredential;
        private final RefreshSessionState refreshSessionState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RefreshingSession copy$default(RefreshingSession refreshingSession, AmplifyCredential amplifyCredential, RefreshSessionState refreshSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = refreshingSession.existingCredential;
            }
            if ((i & 2) != 0) {
                refreshSessionState = refreshingSession.refreshSessionState;
            }
            return refreshingSession.copy(amplifyCredential, refreshSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component1() {
            return this.existingCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RefreshSessionState component2() {
            return this.refreshSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RefreshingSession copy(@NotNull AmplifyCredential amplifyCredential, @NotNull RefreshSessionState refreshSessionState) {
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            Intrinsics.checkNotNullParameter(refreshSessionState, "");
            return new RefreshingSession(amplifyCredential, refreshSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshingSession)) {
                return false;
            }
            RefreshingSession refreshingSession = (RefreshingSession) obj;
            return Intrinsics.EZpvd(this.existingCredential, refreshingSession.existingCredential) && Intrinsics.EZpvd(this.refreshSessionState, refreshingSession.refreshSessionState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getExistingCredential() {
            return this.existingCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RefreshSessionState getRefreshSessionState() {
            return this.refreshSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.existingCredential.hashCode() * 31) + this.refreshSessionState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingSession(existingCredential=" + this.existingCredential + ", refreshSessionState=" + this.refreshSessionState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingSession(@NotNull AmplifyCredential amplifyCredential, @NotNull RefreshSessionState refreshSessionState) {
            super(null);
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            Intrinsics.checkNotNullParameter(refreshSessionState, "");
            this.existingCredential = amplifyCredential;
            this.refreshSessionState = refreshSessionState;
        }
    }

    public static final class DeletingUser extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;
        private final DeleteUserState deleteUserState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DeletingUser copy$default(DeletingUser deletingUser, DeleteUserState deleteUserState, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                deleteUserState = deletingUser.deleteUserState;
            }
            if ((i & 2) != 0) {
                amplifyCredential = deletingUser.amplifyCredential;
            }
            return deletingUser.copy(deleteUserState, amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeleteUserState component1() {
            return this.deleteUserState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component2() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeletingUser copy(@NotNull DeleteUserState deleteUserState, @NotNull AmplifyCredential amplifyCredential) {
            Intrinsics.checkNotNullParameter(deleteUserState, "");
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            return new DeletingUser(deleteUserState, amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeletingUser)) {
                return false;
            }
            DeletingUser deletingUser = (DeletingUser) obj;
            return Intrinsics.EZpvd(this.deleteUserState, deletingUser.deleteUserState) && Intrinsics.EZpvd(this.amplifyCredential, deletingUser.amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeleteUserState getDeleteUserState() {
            return this.deleteUserState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.deleteUserState.hashCode() * 31) + this.amplifyCredential.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "DeletingUser(deleteUserState=" + this.deleteUserState + ", amplifyCredential=" + this.amplifyCredential + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeletingUser(@NotNull DeleteUserState deleteUserState, @NotNull AmplifyCredential amplifyCredential) {
            super(null);
            Intrinsics.checkNotNullParameter(deleteUserState, "");
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            this.deleteUserState = deleteUserState;
            this.amplifyCredential = amplifyCredential;
        }
    }

    public static final class StoringCredentials extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StoringCredentials copy$default(StoringCredentials storingCredentials, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = storingCredentials.amplifyCredential;
            }
            return storingCredentials.copy(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StoringCredentials copy(@NotNull AmplifyCredential amplifyCredential) {
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            return new StoringCredentials(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoringCredentials) && Intrinsics.EZpvd(this.amplifyCredential, ((StoringCredentials) obj).amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "StoringCredentials(amplifyCredential=" + this.amplifyCredential + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoringCredentials(@NotNull AmplifyCredential amplifyCredential) {
            super(null);
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            this.amplifyCredential = amplifyCredential;
        }
    }

    public static final class SessionEstablished extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionEstablished copy$default(SessionEstablished sessionEstablished, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = sessionEstablished.amplifyCredential;
            }
            return sessionEstablished.copy(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionEstablished copy(@NotNull AmplifyCredential amplifyCredential) {
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            return new SessionEstablished(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionEstablished) && Intrinsics.EZpvd(this.amplifyCredential, ((SessionEstablished) obj).amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SessionEstablished(amplifyCredential=" + this.amplifyCredential + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionEstablished(@NotNull AmplifyCredential amplifyCredential) {
            super(null);
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            this.amplifyCredential = amplifyCredential;
        }
    }

    public static final class FederatingToIdentityPool extends AuthorizationState {
        private final AmplifyCredential existingCredential;
        private final FederatedToken federatedToken;
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FederatingToIdentityPool copy$default(FederatingToIdentityPool federatingToIdentityPool, FederatedToken federatedToken, FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                federatedToken = federatingToIdentityPool.federatedToken;
            }
            if ((i & 2) != 0) {
                fetchAuthSessionState = federatingToIdentityPool.fetchAuthSessionState;
            }
            if ((i & 4) != 0) {
                amplifyCredential = federatingToIdentityPool.existingCredential;
            }
            return federatingToIdentityPool.copy(federatedToken, fetchAuthSessionState, amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatedToken component1() {
            return this.federatedToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState component2() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component3() {
            return this.existingCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatingToIdentityPool copy(@NotNull FederatedToken federatedToken, @NotNull FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential) {
            Intrinsics.checkNotNullParameter(federatedToken, "");
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            return new FederatingToIdentityPool(federatedToken, fetchAuthSessionState, amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FederatingToIdentityPool)) {
                return false;
            }
            FederatingToIdentityPool federatingToIdentityPool = (FederatingToIdentityPool) obj;
            return Intrinsics.EZpvd(this.federatedToken, federatingToIdentityPool.federatedToken) && Intrinsics.EZpvd(this.fetchAuthSessionState, federatingToIdentityPool.fetchAuthSessionState) && Intrinsics.EZpvd(this.existingCredential, federatingToIdentityPool.existingCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getExistingCredential() {
            return this.existingCredential;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatedToken getFederatedToken() {
            return this.federatedToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.federatedToken.hashCode();
            int iHashCode2 = this.fetchAuthSessionState.hashCode();
            AmplifyCredential amplifyCredential = this.existingCredential;
            return (((iHashCode * 31) + iHashCode2) * 31) + (amplifyCredential == null ? 0 : amplifyCredential.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FederatingToIdentityPool(federatedToken=" + this.federatedToken + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ", existingCredential=" + this.existingCredential + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatingToIdentityPool(@NotNull FederatedToken federatedToken, @NotNull FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential) {
            super(null);
            Intrinsics.checkNotNullParameter(federatedToken, "");
            Intrinsics.checkNotNullParameter(fetchAuthSessionState, "");
            this.federatedToken = federatedToken;
            this.fetchAuthSessionState = fetchAuthSessionState;
            this.existingCredential = amplifyCredential;
        }
    }

    public static final class Error extends AuthorizationState {
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

    public static final class Resolver implements StateMachineResolver<AuthorizationState> {
        private final AuthorizationActions authorizationActions;
        private final NotConfigured defaultState;
        private final StateMachineResolver<DeleteUserState> deleteUserResolver;
        private final StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver;
        private final StateMachineResolver<RefreshSessionState> refreshSessionResolver;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull StateMachineResolver<FetchAuthSessionState> stateMachineResolver, @NotNull StateMachineResolver<RefreshSessionState> stateMachineResolver2, @NotNull StateMachineResolver<DeleteUserState> stateMachineResolver3, @NotNull AuthorizationActions authorizationActions) {
            Intrinsics.checkNotNullParameter(stateMachineResolver, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver2, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver3, "");
            Intrinsics.checkNotNullParameter(authorizationActions, "");
            this.fetchAuthSessionResolver = stateMachineResolver;
            this.refreshSessionResolver = stateMachineResolver2;
            this.deleteUserResolver = stateMachineResolver3;
            this.authorizationActions = authorizationActions;
            this.defaultState = new NotConfigured("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthorizationState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthorizationState, StateMachineResolver<AuthorizationState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthorizationState> resolve(@NotNull AuthorizationState authorizationState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(authorizationState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(stateMachineEvent);
            AuthenticationEvent.EventType eventTypeIsAuthenticationEvent = AuthEnvironmentKt.isAuthenticationEvent(stateMachineEvent);
            AuthorizationEvent.EventType eventTypeIsAuthorizationEvent = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
            DeleteUserEvent.EventType eventTypeIsDeleteUserEvent = AuthEnvironmentKt.isDeleteUserEvent(stateMachineEvent);
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
            byte b14 = 0;
            byte b15 = 0;
            byte b16 = 0;
            byte b17 = 0;
            byte b18 = 0;
            byte b19 = 0;
            StateResolution<AuthorizationState> stateResolution = new StateResolution<>(authorizationState, null, 2, null);
            int i = 1;
            if (authorizationState instanceof NotConfigured) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Configure) {
                    return new StateResolution<>(new Configured(str, i, b19 == true ? 1 : 0), C56402yEa.EZpvd(this.authorizationActions.configureAuthorizationAction()));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.CachedCredentialsAvailable) {
                    return new StateResolution<>(new SessionEstablished(((AuthorizationEvent.EventType.CachedCredentialsAvailable) eventTypeIsAuthorizationEvent).getAmplifyCredential()), C56402yEa.EZpvd(this.authorizationActions.configureAuthorizationAction()));
                }
                return eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError ? new StateResolution<>(new NotConfigured(b18 == true ? 1 : 0, i, b17 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (authorizationState instanceof Configured) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.FetchUnAuthSession) {
                    return new StateResolution<>(new FetchingUnAuthSession(new FetchAuthSessionState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.authorizationActions.initializeFetchUnAuthSession()));
                }
                if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool)) {
                    return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested ? new StateResolution<>(new SigningIn(b16 == true ? 1 : 0, i, b15 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool.getToken(), new FetchAuthSessionState.NotStarted(null, 1, null), startFederationToIdentityPool.getExistingCredential()), C56402yEa.EZpvd(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool.getToken(), startFederationToIdentityPool.getIdentityId())));
            }
            if (authorizationState instanceof StoringCredentials) {
                if (!(eventTypeIsAuthEvent instanceof AuthEvent.EventType.ReceivedCachedCredentials)) {
                    return eventTypeIsAuthEvent instanceof AuthEvent.EventType.CachedCredentialsFailed ? new StateResolution<>(new NotConfigured(b12 == true ? 1 : 0, i, b11 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                if (((StoringCredentials) authorizationState).getAmplifyCredential() instanceof AmplifyCredential.Empty) {
                    return new StateResolution<>(new Configured(b14 == true ? 1 : 0, i, b13 == true ? 1 : 0), null, 2, null);
                }
                return new StateResolution<>(new SessionEstablished(((AuthEvent.EventType.ReceivedCachedCredentials) eventTypeIsAuthEvent).getStoredCredentials()), null, 2, null);
            }
            if (authorizationState instanceof SigningIn) {
                if (!(eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInCompleted)) {
                    return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignIn ? new StateResolution<>(new Configured(b10 == true ? 1 : 0, i, b9 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                AuthenticationEvent.EventType.SignInCompleted signInCompleted = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                return new StateResolution<>(new FetchingAuthSession(signInCompleted.getSignedInData(), new FetchAuthSessionState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.authorizationActions.initializeFetchAuthSession(signInCompleted.getSignedInData())));
            }
            if (authorizationState instanceof SigningOut) {
                if (!(AuthEnvironmentKt.isSignOutEvent(stateMachineEvent) instanceof SignOutEvent.EventType.SignOutLocally)) {
                    return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignOut ? new StateResolution<>(new SessionEstablished(((SigningOut) authorizationState).getAmplifyCredential()), null, 2, null) : stateResolution;
                }
                AuthorizationActions authorizationActions = this.authorizationActions;
                AmplifyCredential.Empty empty = AmplifyCredential.Empty.INSTANCE;
                return new StateResolution<>(new StoringCredentials(empty), C56402yEa.EZpvd(authorizationActions.persistCredentials(empty)));
            }
            if (authorizationState instanceof FetchingUnAuthSession) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                    AuthorizationEvent.EventType.Fetched fetched = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                    AmplifyCredential.IdentityPool identityPool = new AmplifyCredential.IdentityPool(fetched.getIdentityId(), fetched.getAwsCredentials());
                    return new StateResolution<>(new StoringCredentials(identityPool), C56402yEa.EZpvd(this.authorizationActions.persistCredentials(identityPool)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(new SessionError(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException(), AmplifyCredential.Empty.INSTANCE)), null, 2, null);
                }
                StateResolution<StateType> stateResolutionResolve = this.fetchAuthSessionResolver.resolve(((FetchingUnAuthSession) authorizationState).getFetchAuthSessionState(), stateMachineEvent);
                return new StateResolution<>(new FetchingUnAuthSession((FetchAuthSessionState) stateResolutionResolve.getNewState()), stateResolutionResolve.getActions());
            }
            if (authorizationState instanceof FetchingAuthSession) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                    AuthorizationEvent.EventType.Fetched fetched2 = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                    AmplifyCredential.UserAndIdentityPool userAndIdentityPool = new AmplifyCredential.UserAndIdentityPool(((FetchingAuthSession) authorizationState).getSignedInData(), fetched2.getIdentityId(), fetched2.getAwsCredentials());
                    return new StateResolution<>(new StoringCredentials(userAndIdentityPool), C56402yEa.EZpvd(this.authorizationActions.persistCredentials(userAndIdentityPool)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    AmplifyCredential.UserPool userPool = new AmplifyCredential.UserPool(((FetchingAuthSession) authorizationState).getSignedInData());
                    return new StateResolution<>(new StoringCredentials(userPool), C56402yEa.EZpvd(this.authorizationActions.persistCredentials(userPool)));
                }
                FetchingAuthSession fetchingAuthSession = (FetchingAuthSession) authorizationState;
                StateResolution<StateType> stateResolutionResolve2 = this.fetchAuthSessionResolver.resolve(fetchingAuthSession.getFetchAuthSessionState(), stateMachineEvent);
                return new StateResolution<>(new FetchingAuthSession(fetchingAuthSession.getSignedInData(), (FetchAuthSessionState) stateResolutionResolve2.getNewState()), stateResolutionResolve2.getActions());
            }
            if (authorizationState instanceof FederatingToIdentityPool) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                    AuthorizationEvent.EventType.Fetched fetched3 = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                    AmplifyCredential.IdentityPoolFederated identityPoolFederated = new AmplifyCredential.IdentityPoolFederated(((FederatingToIdentityPool) authorizationState).getFederatedToken(), fetched3.getIdentityId(), fetched3.getAwsCredentials());
                    return new StateResolution<>(new StoringCredentials(identityPoolFederated), C56402yEa.EZpvd(this.authorizationActions.persistCredentials(identityPoolFederated)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    Exception exception = ((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException();
                    AmplifyCredential existingCredential = ((FederatingToIdentityPool) authorizationState).getExistingCredential();
                    if (existingCredential == null) {
                        existingCredential = AmplifyCredential.Empty.INSTANCE;
                    }
                    return new StateResolution<>(new Error(new SessionError(exception, existingCredential)), null, 2, null);
                }
                FederatingToIdentityPool federatingToIdentityPool = (FederatingToIdentityPool) authorizationState;
                StateResolution<StateType> stateResolutionResolve3 = this.fetchAuthSessionResolver.resolve(federatingToIdentityPool.getFetchAuthSessionState(), stateMachineEvent);
                return new StateResolution<>(new FederatingToIdentityPool(federatingToIdentityPool.getFederatedToken(), (FetchAuthSessionState) stateResolutionResolve3.getNewState(), federatingToIdentityPool.getExistingCredential()), stateResolutionResolve3.getActions());
            }
            if (authorizationState instanceof RefreshingSession) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Refreshed) {
                    AuthorizationEvent.EventType.Refreshed refreshed = (AuthorizationEvent.EventType.Refreshed) eventTypeIsAuthorizationEvent;
                    return new StateResolution<>(new StoringCredentials(refreshed.getAmplifyCredential()), C56402yEa.EZpvd(this.authorizationActions.persistCredentials(refreshed.getAmplifyCredential())));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(new SessionError(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException(), ((RefreshingSession) authorizationState).getExistingCredential())), null, 2, null);
                }
                RefreshingSession refreshingSession = (RefreshingSession) authorizationState;
                StateResolution<StateType> stateResolutionResolve4 = this.refreshSessionResolver.resolve(refreshingSession.getRefreshSessionState(), stateMachineEvent);
                return new StateResolution<>(new RefreshingSession(refreshingSession.getExistingCredential(), (RefreshSessionState) stateResolutionResolve4.getNewState()), stateResolutionResolve4.getActions());
            }
            if (authorizationState instanceof DeletingUser) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.UserDeleted) {
                    return new StateResolution<>(new SigningOut(((DeletingUser) authorizationState).getAmplifyCredential()), yDY.AhwBna());
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new SessionEstablished(((DeletingUser) authorizationState).getAmplifyCredential()), null, 2, null);
                }
                DeletingUser deletingUser = (DeletingUser) authorizationState;
                StateResolution<StateType> stateResolutionResolve5 = this.deleteUserResolver.resolve(deletingUser.getDeleteUserState(), stateMachineEvent);
                return new StateResolution<>(new DeletingUser((DeleteUserState) stateResolutionResolve5.getNewState(), deletingUser.getAmplifyCredential()), stateResolutionResolve5.getActions());
            }
            if (authorizationState instanceof SessionEstablished) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), null, 2, null);
                }
                if ((eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) || (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool)) {
                    return new StateResolution<>(new SigningOut(((SessionEstablished) authorizationState).getAmplifyCredential()), null, 2, null);
                }
                if (eventTypeIsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser) {
                    return new StateResolution<>(new DeletingUser(new DeleteUserState.NotStarted(null, 1, null), ((SessionEstablished) authorizationState).getAmplifyCredential()), C56402yEa.EZpvd(this.authorizationActions.initiateDeleteUser((DeleteUserEvent.EventType.DeleteUser) eventTypeIsDeleteUserEvent)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.RefreshSession) {
                    AuthorizationEvent.EventType.RefreshSession refreshSession = (AuthorizationEvent.EventType.RefreshSession) eventTypeIsAuthorizationEvent;
                    return new StateResolution<>(new RefreshingSession(refreshSession.getAmplifyCredential(), new RefreshSessionState.NotStarted(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0)), C56402yEa.EZpvd(this.authorizationActions.initiateRefreshSessionAction(refreshSession.getAmplifyCredential())));
                }
                if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool)) {
                    return stateResolution;
                }
                AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool2 = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool2.getToken(), new FetchAuthSessionState.NotStarted(null, 1, null), startFederationToIdentityPool2.getExistingCredential()), C56402yEa.EZpvd(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool2.getToken(), startFederationToIdentityPool2.getIdentityId())));
            }
            if (authorizationState instanceof Error) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                    return new StateResolution<>(new SigningOut(AmplifyCredential.Empty.INSTANCE), null, 2, null);
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.FetchUnAuthSession) {
                    return new StateResolution<>(new FetchingUnAuthSession(new FetchAuthSessionState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.authorizationActions.initializeFetchUnAuthSession()));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.RefreshSession) {
                    AuthorizationEvent.EventType.RefreshSession refreshSession2 = (AuthorizationEvent.EventType.RefreshSession) eventTypeIsAuthorizationEvent;
                    return new StateResolution<>(new RefreshingSession(refreshSession2.getAmplifyCredential(), new RefreshSessionState.NotStarted(b2 == true ? 1 : 0, i, b == true ? 1 : 0)), C56402yEa.EZpvd(this.authorizationActions.initiateRefreshSessionAction(refreshSession2.getAmplifyCredential())));
                }
                if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool)) {
                    return eventTypeIsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser ? new StateResolution<>(new DeletingUser(new DeleteUserState.NotStarted(null, 1, null), AmplifyCredential.Empty.INSTANCE), C56402yEa.EZpvd(this.authorizationActions.initiateDeleteUser((DeleteUserEvent.EventType.DeleteUser) eventTypeIsDeleteUserEvent))) : stateResolution;
                }
                AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool3 = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool3.getToken(), new FetchAuthSessionState.NotStarted(null, 1, null), startFederationToIdentityPool3.getExistingCredential()), C56402yEa.EZpvd(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool3.getToken(), startFederationToIdentityPool3.getIdentityId())));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
