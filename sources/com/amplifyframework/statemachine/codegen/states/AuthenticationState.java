package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.AuthenticationActions;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthenticationState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AuthenticationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotConfigured extends AuthenticationState {
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
 A[MD:(java.lang.String):void (m)] (LINE:35) call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.NotConfigured.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotConfigured(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private AuthenticationState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class Configured extends AuthenticationState {
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
 A[MD:(java.lang.String):void (m)] (LINE:36) call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.Configured.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Configured(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningIn extends AuthenticationState {
        private SignInState signInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, SignInState signInState, int i, Object obj) {
            if ((i & 1) != 0) {
                signInState = signingIn.signInState;
            }
            return signingIn.copy(signInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignInState component1() {
            return this.signInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningIn copy(@NotNull SignInState signInState) {
            Intrinsics.checkNotNullParameter(signInState, "");
            return new SigningIn(signInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && Intrinsics.EZpvd(this.signInState, ((SigningIn) obj).signInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignInState getSignInState() {
            return this.signInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSignInState(@NotNull SignInState signInState) {
            Intrinsics.checkNotNullParameter(signInState, "");
            this.signInState = signInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningIn(signInState=" + this.signInState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(@NotNull SignInState signInState) {
            super(null);
            Intrinsics.checkNotNullParameter(signInState, "");
            this.signInState = signInState;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:com.amplifyframework.statemachine.codegen.states.SignInState:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.amplifyframework.statemachine.codegen.states.SignInState:0x0007: CONSTRUCTOR 
  (null java.lang.String)
  (1 int)
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
 A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:37) call: com.amplifyframework.statemachine.codegen.states.SignInState.NotStarted.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 com.amplifyframework.statemachine.codegen.states.SignInState))
 A[MD:(com.amplifyframework.statemachine.codegen.states.SignInState):void (m)] (LINE:37) call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.SigningIn.<init>(com.amplifyframework.statemachine.codegen.states.SignInState):void type: THIS */
        public /* synthetic */ SigningIn(SignInState signInState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new SignInState.NotStarted(null, 1, 0 == true ? 1 : 0) : signInState);
        }
    }

    public static final class SignedIn extends AuthenticationState {
        private final DeviceMetadata deviceMetadata;
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = signedIn.signedInData;
            }
            if ((i & 2) != 0) {
                deviceMetadata = signedIn.deviceMetadata;
            }
            return signedIn.copy(signedInData, deviceMetadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceMetadata component2() {
            return this.deviceMetadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedIn copy(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            Intrinsics.checkNotNullParameter(deviceMetadata, "");
            return new SignedIn(signedInData, deviceMetadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignedIn)) {
                return false;
            }
            SignedIn signedIn = (SignedIn) obj;
            return Intrinsics.EZpvd(this.signedInData, signedIn.signedInData) && Intrinsics.EZpvd(this.deviceMetadata, signedIn.deviceMetadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceMetadata getDeviceMetadata() {
            return this.deviceMetadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedIn(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            Intrinsics.checkNotNullParameter(deviceMetadata, "");
            this.signedInData = signedInData;
            this.deviceMetadata = deviceMetadata;
        }
    }

    public static final class SigningOut extends AuthenticationState {
        private SignOutState signOutState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SigningOut() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningOut copy$default(SigningOut signingOut, SignOutState signOutState, int i, Object obj) {
            if ((i & 1) != 0) {
                signOutState = signingOut.signOutState;
            }
            return signingOut.copy(signOutState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignOutState component1() {
            return this.signOutState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningOut copy(@NotNull SignOutState signOutState) {
            Intrinsics.checkNotNullParameter(signOutState, "");
            return new SigningOut(signOutState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOut) && Intrinsics.EZpvd(this.signOutState, ((SigningOut) obj).signOutState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignOutState getSignOutState() {
            return this.signOutState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signOutState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSignOutState(@NotNull SignOutState signOutState) {
            Intrinsics.checkNotNullParameter(signOutState, "");
            this.signOutState = signOutState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOut(signOutState=" + this.signOutState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOut(@NotNull SignOutState signOutState) {
            super(null);
            Intrinsics.checkNotNullParameter(signOutState, "");
            this.signOutState = signOutState;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:com.amplifyframework.statemachine.codegen.states.SignOutState:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.amplifyframework.statemachine.codegen.states.SignOutState:0x0007: CONSTRUCTOR (null java.lang.String), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:39) call: com.amplifyframework.statemachine.codegen.states.SignOutState.NotStarted.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 com.amplifyframework.statemachine.codegen.states.SignOutState))
 A[MD:(com.amplifyframework.statemachine.codegen.states.SignOutState):void (m)] (LINE:39) call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.SigningOut.<init>(com.amplifyframework.statemachine.codegen.states.SignOutState):void type: THIS */
        public /* synthetic */ SigningOut(SignOutState signOutState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new SignOutState.NotStarted(null, 1, null) : signOutState);
        }
    }

    public static final class SignedOut extends AuthenticationState {
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

    public static final class FederatingToIdentityPool extends AuthenticationState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FederatingToIdentityPool() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FederatingToIdentityPool copy$default(FederatingToIdentityPool federatingToIdentityPool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = federatingToIdentityPool.id;
            }
            return federatingToIdentityPool.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatingToIdentityPool copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FederatingToIdentityPool(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FederatingToIdentityPool) && Intrinsics.EZpvd((Object) this.id, (Object) ((FederatingToIdentityPool) obj).id);
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
            return "FederatingToIdentityPool(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatingToIdentityPool(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:41) call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.FederatingToIdentityPool.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ FederatingToIdentityPool(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class FederatedToIdentityPool extends AuthenticationState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FederatedToIdentityPool() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FederatedToIdentityPool copy$default(FederatedToIdentityPool federatedToIdentityPool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = federatedToIdentityPool.id;
            }
            return federatedToIdentityPool.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatedToIdentityPool copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FederatedToIdentityPool(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FederatedToIdentityPool) && Intrinsics.EZpvd((Object) this.id, (Object) ((FederatedToIdentityPool) obj).id);
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
            return "FederatedToIdentityPool(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatedToIdentityPool(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:42) call: com.amplifyframework.statemachine.codegen.states.AuthenticationState.FederatedToIdentityPool.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ FederatedToIdentityPool(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends AuthenticationState {
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

    public static final class Resolver implements StateMachineResolver<AuthenticationState> {
        private final AuthenticationActions authenticationActions;
        private final NotConfigured defaultState;
        private final StateMachineResolver<SignInState> signInResolver;
        private final StateMachineResolver<SignOutState> signOutResolver;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull StateMachineResolver<SignInState> stateMachineResolver, @NotNull StateMachineResolver<SignOutState> stateMachineResolver2, @NotNull AuthenticationActions authenticationActions) {
            Intrinsics.checkNotNullParameter(stateMachineResolver, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver2, "");
            Intrinsics.checkNotNullParameter(authenticationActions, "");
            this.signInResolver = stateMachineResolver;
            this.signOutResolver = stateMachineResolver2;
            this.authenticationActions = authenticationActions;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthenticationState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthenticationState, StateMachineResolver<AuthenticationState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthenticationState> resolve(@NotNull AuthenticationState authenticationState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(authenticationState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            AuthenticationEvent.EventType eventTypeIsAuthenticationEvent = AuthEnvironmentKt.isAuthenticationEvent(stateMachineEvent);
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
            byte b20 = 0;
            byte b21 = 0;
            byte b22 = 0;
            byte b23 = 0;
            StateResolution<AuthenticationState> stateResolution = new StateResolution<>(authenticationState, null, 2, null);
            int i = 1;
            if (authenticationState instanceof NotConfigured) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.Configure) {
                    return new StateResolution<>(new Configured(str, i, b23 == true ? 1 : 0), C56402yEa.EZpvd(this.authenticationActions.configureAuthenticationAction((AuthenticationEvent.EventType.Configure) eventTypeIsAuthenticationEvent)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                    return new StateResolution<>(new FederatingToIdentityPool(b22 == true ? 1 : 0, i, b21 == true ? 1 : 0), null, 2, null);
                }
                return stateResolution;
            }
            if (authenticationState instanceof Configured) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedSignedIn) {
                    AuthenticationEvent.EventType.InitializedSignedIn initializedSignedIn = (AuthenticationEvent.EventType.InitializedSignedIn) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(initializedSignedIn.getSignedInData(), initializedSignedIn.getDeviceMetadata()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedFederated) {
                    return new StateResolution<>(new FederatedToIdentityPool(b20 == true ? 1 : 0, i, b19 == true ? 1 : 0), null, 2, null);
                }
                return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedSignedOut ? new StateResolution<>(new SignedOut(((AuthenticationEvent.EventType.InitializedSignedOut) eventTypeIsAuthenticationEvent).getSignedOutData()), null, 2, null) : stateResolution;
            }
            if (authenticationState instanceof SigningIn) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInCompleted) {
                    AuthenticationEvent.EventType.SignInCompleted signInCompleted = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(signInCompleted.getSignedInData(), signInCompleted.getDeviceMetadata()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignIn) {
                    AuthenticationEvent.EventType.CancelSignIn cancelSignIn = (AuthenticationEvent.EventType.CancelSignIn) eventTypeIsAuthenticationEvent;
                    if (cancelSignIn.getError() != null) {
                        new StateResolution(new Error(cancelSignIn.getError()), null, 2, null);
                    }
                    return new StateResolution<>(new SignedOut(new SignedOutData(null, null, null, null, 15, null)), null, 2, null);
                }
                StateResolution<StateType> stateResolutionResolve = this.signInResolver.resolve(((SigningIn) authenticationState).getSignInState(), stateMachineEvent);
                return new StateResolution<>(new SigningIn((SignInState) stateResolutionResolve.getNewState()), stateResolutionResolve.getActions());
            }
            if (authenticationState instanceof SignedIn) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                    return new StateResolution<>(new SigningOut(b18 == true ? 1 : 0, i, b17 == true ? 1 : 0), C56402yEa.EZpvd(this.authenticationActions.initiateSignOutAction((AuthenticationEvent.EventType.SignOutRequested) eventTypeIsAuthenticationEvent, ((SignedIn) authenticationState).getSignedInData())));
                }
                return stateResolution;
            }
            if (authenticationState instanceof SigningOut) {
                SignOutEvent.EventType eventTypeIsSignOutEvent = AuthEnvironmentKt.isSignOutEvent(stateMachineEvent);
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignedOutSuccess) {
                    return new StateResolution<>(new SignedOut(((SignOutEvent.EventType.SignedOutSuccess) eventTypeIsSignOutEvent).getSignedOutData()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignOut) {
                    AuthenticationEvent.EventType.CancelSignOut cancelSignOut = (AuthenticationEvent.EventType.CancelSignOut) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(cancelSignOut.getSignedInData(), cancelSignOut.getDeviceMetadata()), null, 2, null);
                }
                StateResolution<StateType> stateResolutionResolve2 = this.signOutResolver.resolve(((SigningOut) authenticationState).getSignOutState(), stateMachineEvent);
                return new StateResolution<>(new SigningOut((SignOutState) stateResolutionResolve2.getNewState()), stateResolutionResolve2.getActions());
            }
            if (authenticationState instanceof SignedOut) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent2 = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(b16 == true ? 1 : 0, i, b15 == true ? 1 : 0), C56402yEa.EZpvd(this.authenticationActions.initiateSignInAction((AuthenticationEvent.EventType.SignInRequested) eventTypeIsAuthenticationEvent)));
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                    return new StateResolution<>(new SigningOut(b14 == true ? 1 : 0, i, b13 == true ? 1 : 0), C56402yEa.EZpvd(this.authenticationActions.initiateSignOutAction((AuthenticationEvent.EventType.SignOutRequested) eventTypeIsAuthenticationEvent, null)));
                }
                if (eventTypeIsAuthorizationEvent2 instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                    return new StateResolution<>(new FederatingToIdentityPool(b12 == true ? 1 : 0, i, b11 == true ? 1 : 0), null, 2, null);
                }
                return stateResolution;
            }
            if (authenticationState instanceof FederatingToIdentityPool) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent3 = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthorizationEvent3 instanceof AuthorizationEvent.EventType.Fetched) {
                    return new StateResolution<>(new FederatedToIdentityPool(b10 == true ? 1 : 0, i, b9 == true ? 1 : 0), null, 2, null);
                }
                return eventTypeIsAuthorizationEvent3 instanceof AuthorizationEvent.EventType.ThrowError ? new StateResolution<>(new Error(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent3).getException()), null, 2, null) : stateResolution;
            }
            if (authenticationState instanceof FederatedToIdentityPool) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent4 = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool) {
                    return new StateResolution<>(new SigningOut(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), C56402yEa.EZpvd(this.authenticationActions.initiateSignOutAction(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(false, null, false, 7, null)), null)));
                }
                if (eventTypeIsAuthorizationEvent4 instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                    return new StateResolution<>(new FederatingToIdentityPool(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0), null, 2, null);
                }
                return stateResolution;
            }
            if (authenticationState instanceof Error) {
                if (AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent) instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                    return new StateResolution<>(new FederatingToIdentityPool(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool) {
                    return new StateResolution<>(new SigningOut(b2 == true ? 1 : 0, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.authenticationActions.initiateSignOutAction(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(false, null, false, 7, null)), null)));
                }
                return stateResolution;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
