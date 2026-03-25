package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignOutActions;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SignOutState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.SignOutState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignOutState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends SignOutState {
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
 A[MD:(java.lang.String):void (m)] (LINE:31) call: com.amplifyframework.statemachine.codegen.states.SignOutState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private SignOutState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class SigningOutHostedUI extends SignOutState {
        private final boolean bypassCancel;
        private final boolean globalSignOut;
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningOutHostedUI copy$default(SigningOutHostedUI signingOutHostedUI, SignedInData signedInData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = signingOutHostedUI.signedInData;
            }
            if ((i & 2) != 0) {
                z = signingOutHostedUI.globalSignOut;
            }
            if ((i & 4) != 0) {
                z2 = signingOutHostedUI.bypassCancel;
            }
            return signingOutHostedUI.copy(signedInData, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.globalSignOut;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.bypassCancel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningOutHostedUI copy(@NotNull SignedInData signedInData, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            return new SigningOutHostedUI(signedInData, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SigningOutHostedUI)) {
                return false;
            }
            SigningOutHostedUI signingOutHostedUI = (SigningOutHostedUI) obj;
            return Intrinsics.EZpvd(this.signedInData, signingOutHostedUI.signedInData) && this.globalSignOut == signingOutHostedUI.globalSignOut && this.bypassCancel == signingOutHostedUI.bypassCancel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getBypassCancel() {
            return this.bypassCancel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getGlobalSignOut() {
            return this.globalSignOut;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.signedInData.hashCode();
            boolean z = this.globalSignOut;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            boolean z2 = this.bypassCancel;
            return (((iHashCode * 31) + r1) * 31) + (z2 ? 1 : z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOutHostedUI(signedInData=" + this.signedInData + ", globalSignOut=" + this.globalSignOut + ", bypassCancel=" + this.bypassCancel + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOutHostedUI(@NotNull SignedInData signedInData, boolean z, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            this.signedInData = signedInData;
            this.globalSignOut = z;
            this.bypassCancel = z2;
        }
    }

    public static final class SigningOutGlobally extends SignOutState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SigningOutGlobally() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningOutGlobally copy$default(SigningOutGlobally signingOutGlobally, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signingOutGlobally.id;
            }
            return signingOutGlobally.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningOutGlobally copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SigningOutGlobally(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOutGlobally) && Intrinsics.EZpvd((Object) this.id, (Object) ((SigningOutGlobally) obj).id);
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
            return "SigningOutGlobally(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOutGlobally(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:37) call: com.amplifyframework.statemachine.codegen.states.SignOutState.SigningOutGlobally.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SigningOutGlobally(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class RevokingToken extends SignOutState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RevokingToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RevokingToken copy$default(RevokingToken revokingToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = revokingToken.id;
            }
            return revokingToken.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RevokingToken copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RevokingToken(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevokingToken) && Intrinsics.EZpvd((Object) this.id, (Object) ((RevokingToken) obj).id);
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
            return "RevokingToken(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevokingToken(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:38) call: com.amplifyframework.statemachine.codegen.states.SignOutState.RevokingToken.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ RevokingToken(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class BuildingRevokeTokenError extends SignOutState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BuildingRevokeTokenError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BuildingRevokeTokenError copy$default(BuildingRevokeTokenError buildingRevokeTokenError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buildingRevokeTokenError.id;
            }
            return buildingRevokeTokenError.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuildingRevokeTokenError copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new BuildingRevokeTokenError(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildingRevokeTokenError) && Intrinsics.EZpvd((Object) this.id, (Object) ((BuildingRevokeTokenError) obj).id);
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
            return "BuildingRevokeTokenError(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuildingRevokeTokenError(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:39) call: com.amplifyframework.statemachine.codegen.states.SignOutState.BuildingRevokeTokenError.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ BuildingRevokeTokenError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningOutLocally extends SignOutState {
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningOutLocally copy$default(SigningOutLocally signingOutLocally, SignedInData signedInData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = signingOutLocally.signedInData;
            }
            return signingOutLocally.copy(signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningOutLocally copy(SignedInData signedInData) {
            return new SigningOutLocally(signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOutLocally) && Intrinsics.EZpvd(this.signedInData, ((SigningOutLocally) obj).signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SignedInData signedInData = this.signedInData;
            if (signedInData == null) {
                return 0;
            }
            return signedInData.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOutLocally(signedInData=" + this.signedInData + ")";
        }

        public SigningOutLocally(SignedInData signedInData) {
            super(null);
            this.signedInData = signedInData;
        }
    }

    public static final class SignedOut extends SignOutState {
        private final SignedOutData signedOutData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignedOut copy$default(SignedOut signedOut, SignedOutData signedOutData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedOutData = signedOut.signedOutData;
            }
            return signedOut.copy(signedOutData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedOutData component1() {
            return this.signedOutData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedOut copy(@NotNull SignedOutData signedOutData) {
            Intrinsics.checkNotNullParameter(signedOutData, "");
            return new SignedOut(signedOutData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedOut) && Intrinsics.EZpvd(this.signedOutData, ((SignedOut) obj).signedOutData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedOutData getSignedOutData() {
            return this.signedOutData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signedOutData.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedOut(signedOutData=" + this.signedOutData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedOut(@NotNull SignedOutData signedOutData) {
            super(null);
            Intrinsics.checkNotNullParameter(signedOutData, "");
            this.signedOutData = signedOutData;
        }
    }

    public static final class Error extends SignOutState {
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

    public static final class Resolver implements StateMachineResolver<SignOutState> {
        private final NotStarted defaultState;
        private final SignOutActions signOutActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull SignOutActions signOutActions) {
            Intrinsics.checkNotNullParameter(signOutActions, "");
            this.signOutActions = signOutActions;
            this.defaultState = new NotStarted("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignOutState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignOutState, StateMachineResolver<SignOutState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignOutState> resolve(@NotNull SignOutState signOutState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(signOutState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
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
            StateResolution<SignOutState> stateResolution = new StateResolution<>(signOutState, null, 2, null);
            SignOutEvent.EventType eventTypeIsSignOutEvent = AuthEnvironmentKt.isSignOutEvent(stateMachineEvent);
            int i = 1;
            if (signOutState instanceof NotStarted) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.InvokeHostedUISignOut) {
                    SignOutEvent.EventType.InvokeHostedUISignOut invokeHostedUISignOut = (SignOutEvent.EventType.InvokeHostedUISignOut) eventTypeIsSignOutEvent;
                    return new StateResolution<>(new SigningOutHostedUI(invokeHostedUISignOut.getSignedInData(), invokeHostedUISignOut.getSignOutData().getGlobalSignOut(), invokeHostedUISignOut.getSignOutData().getBypassCancel()), C56402yEa.EZpvd(this.signOutActions.hostedUISignOutAction(invokeHostedUISignOut)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGlobally) {
                    return new StateResolution<>(new SigningOutGlobally(str, i, b11 == true ? 1 : 0), C56402yEa.EZpvd(this.signOutActions.globalSignOutAction((SignOutEvent.EventType.SignOutGlobally) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(b10 == true ? 1 : 0, i, b9 == true ? 1 : 0), C56402yEa.EZpvd(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (!(eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutLocally)) {
                    return stateResolution;
                }
                SignOutEvent.EventType.SignOutLocally signOutLocally = (SignOutEvent.EventType.SignOutLocally) eventTypeIsSignOutEvent;
                return new StateResolution<>(new SigningOutLocally(signOutLocally.getSignedInData()), C56402yEa.EZpvd(this.signOutActions.localSignOutAction(signOutLocally)));
            }
            if (signOutState instanceof SigningOutHostedUI) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGlobally) {
                    return new StateResolution<>(new SigningOutGlobally(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), C56402yEa.EZpvd(this.signOutActions.globalSignOutAction((SignOutEvent.EventType.SignOutGlobally) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.UserCancelled) {
                    return new StateResolution<>(new Error(new Exception("User Cancelled")), C56402yEa.EZpvd(this.signOutActions.userCancelledAction((SignOutEvent.EventType.UserCancelled) eventTypeIsSignOutEvent)));
                }
                return stateResolution;
            }
            if (signOutState instanceof SigningOutLocally) {
                AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(stateMachineEvent);
                if (!(eventTypeIsAuthEvent instanceof AuthEvent.EventType.ReceivedCachedCredentials)) {
                    return eventTypeIsAuthEvent instanceof AuthEvent.EventType.CachedCredentialsFailed ? new StateResolution<>(new Error(new Exception("Failed clearing store")), null, 2, null) : stateResolution;
                }
                SignedInData signedInData = ((SigningOutLocally) signOutState).getSignedInData();
                return new StateResolution<>(new SignedOut(new SignedOutData(signedInData != null ? signedInData.getUsername() : null, null, null, null, 14, null)), null, 2, null);
            }
            if (signOutState instanceof SigningOutGlobally) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), C56402yEa.EZpvd(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGloballyError) {
                    return new StateResolution<>(new BuildingRevokeTokenError(b2 == true ? 1 : 0, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.signOutActions.buildRevokeTokenErrorAction((SignOutEvent.EventType.SignOutGloballyError) eventTypeIsSignOutEvent)));
                }
                return stateResolution;
            }
            if ((!(signOutState instanceof RevokingToken) && !(signOutState instanceof BuildingRevokeTokenError)) || !(eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutLocally)) {
                return stateResolution;
            }
            SignOutEvent.EventType.SignOutLocally signOutLocally2 = (SignOutEvent.EventType.SignOutLocally) eventTypeIsSignOutEvent;
            return new StateResolution<>(new SigningOutLocally(signOutLocally2.getSignedInData()), C56402yEa.EZpvd(this.signOutActions.localSignOutAction(signOutLocally2)));
        }
    }
}
