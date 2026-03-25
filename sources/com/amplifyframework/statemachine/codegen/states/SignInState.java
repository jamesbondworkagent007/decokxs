package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignInActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.states.CustomSignInState;
import com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.MigrateSignInState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
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
public abstract class SignInState implements State {
    private SignInChallengeState challengeState;
    private CustomSignInState customSignInState;
    private DeviceSRPSignInState deviceSRPSignInState;
    private HostedUISignInState hostedUISignInState;
    private MigrateSignInState migrateSignInState;
    private SetupTOTPState setupTOTPState;
    private SRPSignInState srpSignInState;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.SignInState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignInState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignInChallengeState getChallengeState() {
        return this.challengeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomSignInState getCustomSignInState() {
        return this.customSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeviceSRPSignInState getDeviceSRPSignInState() {
        return this.deviceSRPSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HostedUISignInState getHostedUISignInState() {
        return this.hostedUISignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MigrateSignInState getMigrateSignInState() {
        return this.migrateSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SetupTOTPState getSetupTOTPState() {
        return this.setupTOTPState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SRPSignInState getSrpSignInState() {
        return this.srpSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChallengeState(SignInChallengeState signInChallengeState) {
        this.challengeState = signInChallengeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCustomSignInState(CustomSignInState customSignInState) {
        this.customSignInState = customSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDeviceSRPSignInState(DeviceSRPSignInState deviceSRPSignInState) {
        this.deviceSRPSignInState = deviceSRPSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHostedUISignInState(HostedUISignInState hostedUISignInState) {
        this.hostedUISignInState = hostedUISignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMigrateSignInState(MigrateSignInState migrateSignInState) {
        this.migrateSignInState = migrateSignInState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSetupTOTPState(SetupTOTPState setupTOTPState) {
        this.setupTOTPState = setupTOTPState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSrpSignInState(SRPSignInState sRPSignInState) {
        this.srpSignInState = sRPSignInState;
    }

    public static final class NotStarted extends SignInState {
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
 A[MD:(java.lang.String):void (m)] (LINE:26) call: com.amplifyframework.statemachine.codegen.states.SignInState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private SignInState() {
        this.srpSignInState = new SRPSignInState.NotStarted(null, 1, null);
        this.challengeState = new SignInChallengeState.NotStarted(null, 1, null);
        this.customSignInState = new CustomSignInState.NotStarted(null, 1, null);
        this.migrateSignInState = new MigrateSignInState.NotStarted(null, 1, null);
        this.hostedUISignInState = new HostedUISignInState.NotStarted(null, 1, null);
        this.deviceSRPSignInState = new DeviceSRPSignInState.NotStarted(null, 1, null);
        this.setupTOTPState = new SetupTOTPState.NotStarted(null, 1, null);
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class SigningInWithSRP extends SignInState {
        private SRPSignInState srpSignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningInWithSRP copy$default(SigningInWithSRP signingInWithSRP, SRPSignInState sRPSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                sRPSignInState = signingInWithSRP.srpSignInState;
            }
            return signingInWithSRP.copy(sRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SRPSignInState component1() {
            return this.srpSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningInWithSRP copy(SRPSignInState sRPSignInState) {
            return new SigningInWithSRP(sRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithSRP) && Intrinsics.EZpvd(this.srpSignInState, ((SigningInWithSRP) obj).srpSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SRPSignInState getSrpSignInState() {
            return this.srpSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SRPSignInState sRPSignInState = this.srpSignInState;
            if (sRPSignInState == null) {
                return 0;
            }
            return sRPSignInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setSrpSignInState(SRPSignInState sRPSignInState) {
            this.srpSignInState = sRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithSRP(srpSignInState=" + this.srpSignInState + ")";
        }

        public SigningInWithSRP(SRPSignInState sRPSignInState) {
            super(null);
            this.srpSignInState = sRPSignInState;
        }
    }

    public static final class SigningInWithHostedUI extends SignInState {
        private HostedUISignInState hostedUISignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningInWithHostedUI copy$default(SigningInWithHostedUI signingInWithHostedUI, HostedUISignInState hostedUISignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUISignInState = signingInWithHostedUI.hostedUISignInState;
            }
            return signingInWithHostedUI.copy(hostedUISignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUISignInState component1() {
            return this.hostedUISignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningInWithHostedUI copy(HostedUISignInState hostedUISignInState) {
            return new SigningInWithHostedUI(hostedUISignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithHostedUI) && Intrinsics.EZpvd(this.hostedUISignInState, ((SigningInWithHostedUI) obj).hostedUISignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public HostedUISignInState getHostedUISignInState() {
            return this.hostedUISignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            HostedUISignInState hostedUISignInState = this.hostedUISignInState;
            if (hostedUISignInState == null) {
                return 0;
            }
            return hostedUISignInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setHostedUISignInState(HostedUISignInState hostedUISignInState) {
            this.hostedUISignInState = hostedUISignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithHostedUI(hostedUISignInState=" + this.hostedUISignInState + ")";
        }

        public SigningInWithHostedUI(HostedUISignInState hostedUISignInState) {
            super(null);
            this.hostedUISignInState = hostedUISignInState;
        }
    }

    public static final class SigningInWithCustom extends SignInState {
        private CustomSignInState customSignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningInWithCustom copy$default(SigningInWithCustom signingInWithCustom, CustomSignInState customSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                customSignInState = signingInWithCustom.customSignInState;
            }
            return signingInWithCustom.copy(customSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomSignInState component1() {
            return this.customSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningInWithCustom copy(CustomSignInState customSignInState) {
            return new SigningInWithCustom(customSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithCustom) && Intrinsics.EZpvd(this.customSignInState, ((SigningInWithCustom) obj).customSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public CustomSignInState getCustomSignInState() {
            return this.customSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            CustomSignInState customSignInState = this.customSignInState;
            if (customSignInState == null) {
                return 0;
            }
            return customSignInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setCustomSignInState(CustomSignInState customSignInState) {
            this.customSignInState = customSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithCustom(customSignInState=" + this.customSignInState + ")";
        }

        public SigningInWithCustom(CustomSignInState customSignInState) {
            super(null);
            this.customSignInState = customSignInState;
        }
    }

    public static final class SigningInWithSRPCustom extends SignInState {
        private SRPSignInState srpSignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningInWithSRPCustom copy$default(SigningInWithSRPCustom signingInWithSRPCustom, SRPSignInState sRPSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                sRPSignInState = signingInWithSRPCustom.srpSignInState;
            }
            return signingInWithSRPCustom.copy(sRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SRPSignInState component1() {
            return this.srpSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningInWithSRPCustom copy(SRPSignInState sRPSignInState) {
            return new SigningInWithSRPCustom(sRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithSRPCustom) && Intrinsics.EZpvd(this.srpSignInState, ((SigningInWithSRPCustom) obj).srpSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SRPSignInState getSrpSignInState() {
            return this.srpSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SRPSignInState sRPSignInState = this.srpSignInState;
            if (sRPSignInState == null) {
                return 0;
            }
            return sRPSignInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setSrpSignInState(SRPSignInState sRPSignInState) {
            this.srpSignInState = sRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithSRPCustom(srpSignInState=" + this.srpSignInState + ")";
        }

        public SigningInWithSRPCustom(SRPSignInState sRPSignInState) {
            super(null);
            this.srpSignInState = sRPSignInState;
        }
    }

    public static final class SigningInViaMigrateAuth extends SignInState {
        private MigrateSignInState migrateSignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SigningInViaMigrateAuth copy$default(SigningInViaMigrateAuth signingInViaMigrateAuth, MigrateSignInState migrateSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                migrateSignInState = signingInViaMigrateAuth.migrateSignInState;
            }
            return signingInViaMigrateAuth.copy(migrateSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MigrateSignInState component1() {
            return this.migrateSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SigningInViaMigrateAuth copy(MigrateSignInState migrateSignInState) {
            return new SigningInViaMigrateAuth(migrateSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInViaMigrateAuth) && Intrinsics.EZpvd(this.migrateSignInState, ((SigningInViaMigrateAuth) obj).migrateSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public MigrateSignInState getMigrateSignInState() {
            return this.migrateSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            MigrateSignInState migrateSignInState = this.migrateSignInState;
            if (migrateSignInState == null) {
                return 0;
            }
            return migrateSignInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setMigrateSignInState(MigrateSignInState migrateSignInState) {
            this.migrateSignInState = migrateSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInViaMigrateAuth(migrateSignInState=" + this.migrateSignInState + ")";
        }

        public SigningInViaMigrateAuth(MigrateSignInState migrateSignInState) {
            super(null);
            this.migrateSignInState = migrateSignInState;
        }
    }

    public static final class ResolvingDeviceSRP extends SignInState {
        private DeviceSRPSignInState deviceSRPSignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolvingDeviceSRP copy$default(ResolvingDeviceSRP resolvingDeviceSRP, DeviceSRPSignInState deviceSRPSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceSRPSignInState = resolvingDeviceSRP.deviceSRPSignInState;
            }
            return resolvingDeviceSRP.copy(deviceSRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceSRPSignInState component1() {
            return this.deviceSRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolvingDeviceSRP copy(DeviceSRPSignInState deviceSRPSignInState) {
            return new ResolvingDeviceSRP(deviceSRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolvingDeviceSRP) && Intrinsics.EZpvd(this.deviceSRPSignInState, ((ResolvingDeviceSRP) obj).deviceSRPSignInState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public DeviceSRPSignInState getDeviceSRPSignInState() {
            return this.deviceSRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            DeviceSRPSignInState deviceSRPSignInState = this.deviceSRPSignInState;
            if (deviceSRPSignInState == null) {
                return 0;
            }
            return deviceSRPSignInState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setDeviceSRPSignInState(DeviceSRPSignInState deviceSRPSignInState) {
            this.deviceSRPSignInState = deviceSRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ResolvingDeviceSRP(deviceSRPSignInState=" + this.deviceSRPSignInState + ")";
        }

        public ResolvingDeviceSRP(DeviceSRPSignInState deviceSRPSignInState) {
            super(null);
            this.deviceSRPSignInState = deviceSRPSignInState;
        }
    }

    public static final class ResolvingChallenge extends SignInState {
        private SignInChallengeState challengeState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolvingChallenge copy$default(ResolvingChallenge resolvingChallenge, SignInChallengeState signInChallengeState, int i, Object obj) {
            if ((i & 1) != 0) {
                signInChallengeState = resolvingChallenge.challengeState;
            }
            return resolvingChallenge.copy(signInChallengeState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignInChallengeState component1() {
            return this.challengeState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolvingChallenge copy(SignInChallengeState signInChallengeState) {
            return new ResolvingChallenge(signInChallengeState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolvingChallenge) && Intrinsics.EZpvd(this.challengeState, ((ResolvingChallenge) obj).challengeState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SignInChallengeState getChallengeState() {
            return this.challengeState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SignInChallengeState signInChallengeState = this.challengeState;
            if (signInChallengeState == null) {
                return 0;
            }
            return signInChallengeState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setChallengeState(SignInChallengeState signInChallengeState) {
            this.challengeState = signInChallengeState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ResolvingChallenge(challengeState=" + this.challengeState + ")";
        }

        public ResolvingChallenge(SignInChallengeState signInChallengeState) {
            super(null);
            this.challengeState = signInChallengeState;
        }
    }

    public static final class ResolvingTOTPSetup extends SignInState {
        private SetupTOTPState setupTOTPState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolvingTOTPSetup copy$default(ResolvingTOTPSetup resolvingTOTPSetup, SetupTOTPState setupTOTPState, int i, Object obj) {
            if ((i & 1) != 0) {
                setupTOTPState = resolvingTOTPSetup.setupTOTPState;
            }
            return resolvingTOTPSetup.copy(setupTOTPState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SetupTOTPState component1() {
            return this.setupTOTPState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolvingTOTPSetup copy(SetupTOTPState setupTOTPState) {
            return new ResolvingTOTPSetup(setupTOTPState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolvingTOTPSetup) && Intrinsics.EZpvd(this.setupTOTPState, ((ResolvingTOTPSetup) obj).setupTOTPState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SetupTOTPState getSetupTOTPState() {
            return this.setupTOTPState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SetupTOTPState setupTOTPState = this.setupTOTPState;
            if (setupTOTPState == null) {
                return 0;
            }
            return setupTOTPState.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setSetupTOTPState(SetupTOTPState setupTOTPState) {
            this.setupTOTPState = setupTOTPState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ResolvingTOTPSetup(setupTOTPState=" + this.setupTOTPState + ")";
        }

        public ResolvingTOTPSetup(SetupTOTPState setupTOTPState) {
            super(null);
            this.setupTOTPState = setupTOTPState;
        }
    }

    public static final class ConfirmingDevice extends SignInState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ConfirmingDevice() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConfirmingDevice copy$default(ConfirmingDevice confirmingDevice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmingDevice.id;
            }
            return confirmingDevice.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfirmingDevice copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ConfirmingDevice(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmingDevice) && Intrinsics.EZpvd((Object) this.id, (Object) ((ConfirmingDevice) obj).id);
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
            return "ConfirmingDevice(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmingDevice(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:35) call: com.amplifyframework.statemachine.codegen.states.SignInState.ConfirmingDevice.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ ConfirmingDevice(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Done extends SignInState {
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
 A[MD:(java.lang.String):void (m)] (LINE:36) call: com.amplifyframework.statemachine.codegen.states.SignInState.Done.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Done(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SignInState {
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

    public static final class SignedIn extends SignInState {
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
 A[MD:(java.lang.String):void (m)] (LINE:38) call: com.amplifyframework.statemachine.codegen.states.SignInState.SignedIn.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SignedIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<SignInState> {
        private final StateMachineResolver<SignInChallengeState> challengeResolver;
        private final StateMachineResolver<CustomSignInState> customSignInResolver;
        private final NotStarted defaultState;
        private final StateMachineResolver<DeviceSRPSignInState> deviceSRPSignInResolver;
        private final StateMachineResolver<HostedUISignInState> hostedUISignInResolver;
        private final StateMachineResolver<MigrateSignInState> migrationSignInResolver;
        private final StateMachineResolver<SetupTOTPState> setupTOTPResolver;
        private final SignInActions signInActions;
        private final StateMachineResolver<SRPSignInState> srpSignInResolver;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull StateMachineResolver<SRPSignInState> stateMachineResolver, @NotNull StateMachineResolver<CustomSignInState> stateMachineResolver2, @NotNull StateMachineResolver<MigrateSignInState> stateMachineResolver3, @NotNull StateMachineResolver<SignInChallengeState> stateMachineResolver4, @NotNull StateMachineResolver<HostedUISignInState> stateMachineResolver5, @NotNull StateMachineResolver<DeviceSRPSignInState> stateMachineResolver6, @NotNull StateMachineResolver<SetupTOTPState> stateMachineResolver7, @NotNull SignInActions signInActions) {
            Intrinsics.checkNotNullParameter(stateMachineResolver, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver2, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver3, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver4, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver5, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver6, "");
            Intrinsics.checkNotNullParameter(stateMachineResolver7, "");
            Intrinsics.checkNotNullParameter(signInActions, "");
            this.srpSignInResolver = stateMachineResolver;
            this.customSignInResolver = stateMachineResolver2;
            this.migrationSignInResolver = stateMachineResolver3;
            this.challengeResolver = stateMachineResolver4;
            this.hostedUISignInResolver = stateMachineResolver5;
            this.deviceSRPSignInResolver = stateMachineResolver6;
            this.setupTOTPResolver = stateMachineResolver7;
            this.signInActions = signInActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignInState, StateMachineResolver<SignInState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final SignInEvent.EventType asSignInEvent(StateMachineEvent stateMachineEvent) {
            SignInEvent signInEvent = stateMachineEvent instanceof SignInEvent ? (SignInEvent) stateMachineEvent : null;
            if (signInEvent != null) {
                return signInEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignInState> resolve(@NotNull SignInState signInState, @NotNull StateMachineEvent stateMachineEvent) {
            StateResolution<StateType> stateResolutionResolve;
            StateResolution<StateType> stateResolutionResolve2;
            StateResolution<StateType> stateResolutionResolve3;
            StateResolution<StateType> stateResolutionResolve4;
            StateResolution<StateType> stateResolutionResolve5;
            StateResolution<StateType> stateResolutionResolve6;
            StateResolution<StateType> stateResolutionResolve7;
            Intrinsics.checkNotNullParameter(signInState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            StateResolution<SignInState> stateResolutionResolveSignInEvent = resolveSignInEvent(signInState, stateMachineEvent);
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) stateResolutionResolveSignInEvent.getActions());
            Builder builder = new Builder((SignInState) stateResolutionResolveSignInEvent.getNewState());
            SRPSignInState srpSignInState = signInState.getSrpSignInState();
            if (srpSignInState != null && (stateResolutionResolve7 = this.srpSignInResolver.resolve(srpSignInState, stateMachineEvent)) != 0) {
                builder.setSrpSignInState((SRPSignInState) stateResolutionResolve7.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve7.getActions());
            }
            SignInChallengeState challengeState = signInState.getChallengeState();
            if (challengeState != null && (stateResolutionResolve6 = this.challengeResolver.resolve(challengeState, stateMachineEvent)) != 0) {
                builder.setChallengeState((SignInChallengeState) stateResolutionResolve6.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve6.getActions());
            }
            MigrateSignInState migrateSignInState = signInState.getMigrateSignInState();
            if (migrateSignInState != null && (stateResolutionResolve5 = this.migrationSignInResolver.resolve(migrateSignInState, stateMachineEvent)) != 0) {
                builder.setMigrateSignInState((MigrateSignInState) stateResolutionResolve5.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve5.getActions());
            }
            HostedUISignInState hostedUISignInState = signInState.getHostedUISignInState();
            if (hostedUISignInState != null && (stateResolutionResolve4 = this.hostedUISignInResolver.resolve(hostedUISignInState, stateMachineEvent)) != 0) {
                builder.setHostedUISignInState((HostedUISignInState) stateResolutionResolve4.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve4.getActions());
            }
            CustomSignInState customSignInState = signInState.getCustomSignInState();
            if (customSignInState != null && (stateResolutionResolve3 = this.customSignInResolver.resolve(customSignInState, stateMachineEvent)) != 0) {
                builder.setCustomSignInState((CustomSignInState) stateResolutionResolve3.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve3.getActions());
            }
            DeviceSRPSignInState deviceSRPSignInState = signInState.getDeviceSRPSignInState();
            if (deviceSRPSignInState != null && (stateResolutionResolve2 = this.deviceSRPSignInResolver.resolve(deviceSRPSignInState, stateMachineEvent)) != 0) {
                builder.setDeviceSRPSignInState((DeviceSRPSignInState) stateResolutionResolve2.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve2.getActions());
            }
            SetupTOTPState setupTOTPState = signInState.getSetupTOTPState();
            if (setupTOTPState != null && (stateResolutionResolve = this.setupTOTPResolver.resolve(setupTOTPState, stateMachineEvent)) != 0) {
                builder.setSetupTOTPState((SetupTOTPState) stateResolutionResolve.getNewState());
                C56406yEe.KWHzl(listFJNWhG, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), listFJNWhG);
        }

        private final StateResolution<SignInState> resolveSignInEvent(SignInState signInState, StateMachineEvent stateMachineEvent) {
            StateResolution<SignInState> stateResolution;
            SignInEvent.EventType eventTypeAsSignInEvent = asSignInEvent(stateMachineEvent);
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
            StateResolution<SignInState> stateResolution2 = new StateResolution<>(signInState, null, 2, null);
            int i = 1;
            if (signInState instanceof NotStarted) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithSRP) {
                    stateResolution = new StateResolution<>(new SigningInWithSRP(signInState.getSrpSignInState()), C56402yEa.EZpvd(this.signInActions.startSRPAuthAction((SignInEvent.EventType.InitiateSignInWithSRP) eventTypeAsSignInEvent)));
                } else if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithCustom) {
                    stateResolution = new StateResolution<>(new SigningInWithCustom(signInState.getCustomSignInState()), C56402yEa.EZpvd(this.signInActions.startCustomAuthAction((SignInEvent.EventType.InitiateSignInWithCustom) eventTypeAsSignInEvent)));
                } else {
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateHostedUISignIn) {
                        return new StateResolution<>(new SigningInWithHostedUI(new HostedUISignInState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.signInActions.startHostedUIAuthAction((SignInEvent.EventType.InitiateHostedUISignIn) eventTypeAsSignInEvent)));
                    }
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateMigrateAuth) {
                        return new StateResolution<>(new SigningInViaMigrateAuth(new MigrateSignInState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.signInActions.startMigrationAuthAction((SignInEvent.EventType.InitiateMigrateAuth) eventTypeAsSignInEvent)));
                    }
                    if (!(eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateCustomSignInWithSRP)) {
                        return stateResolution2;
                    }
                    stateResolution = new StateResolution<>(new SigningInWithSRPCustom(signInState.getSrpSignInState()), C56402yEa.EZpvd(this.signInActions.startCustomAuthWithSRPAction((SignInEvent.EventType.InitiateCustomSignInWithSRP) eventTypeAsSignInEvent)));
                }
            } else if ((signInState instanceof SigningInWithSRP) || (signInState instanceof SigningInWithCustom) || (signInState instanceof SigningInViaMigrateAuth) || (signInState instanceof SigningInWithSRPCustom)) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                    return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), C56402yEa.EZpvd(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithDeviceSRP) {
                    return new StateResolution<>(new ResolvingDeviceSRP(new DeviceSRPSignInState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.signInActions.startDeviceSRPAuthAction((SignInEvent.EventType.InitiateSignInWithDeviceSRP) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                    return new StateResolution<>(new ConfirmingDevice(b2 == true ? 1 : 0, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
                }
                if (!(eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateTOTPSetup)) {
                    return eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution2;
                }
                stateResolution = new StateResolution<>(new ResolvingTOTPSetup(signInState.getSetupTOTPState()), C56402yEa.EZpvd(this.signInActions.initiateTOTPSetupAction((SignInEvent.EventType.InitiateTOTPSetup) eventTypeAsSignInEvent)));
            } else if (signInState instanceof ResolvingChallenge) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                    return new StateResolution<>(new ConfirmingDevice(str, i, b11 == true ? 1 : 0), C56402yEa.EZpvd(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                    return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), C56402yEa.EZpvd(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                }
                if (!(eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateTOTPSetup)) {
                    return eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution2;
                }
                stateResolution = new StateResolution<>(new ResolvingTOTPSetup(signInState.getSetupTOTPState()), C56402yEa.EZpvd(this.signInActions.initiateTOTPSetupAction((SignInEvent.EventType.InitiateTOTPSetup) eventTypeAsSignInEvent)));
            } else {
                if (signInState instanceof ResolvingTOTPSetup) {
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                        return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), C56402yEa.EZpvd(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                    }
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                        return new StateResolution<>(new ConfirmingDevice(b10 == true ? 1 : 0, i, b9 == true ? 1 : 0), C56402yEa.EZpvd(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
                    }
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithDeviceSRP) {
                        return new StateResolution<>(new ResolvingDeviceSRP(new DeviceSRPSignInState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.signInActions.startDeviceSRPAuthAction((SignInEvent.EventType.InitiateSignInWithDeviceSRP) eventTypeAsSignInEvent)));
                    }
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn) {
                        return new StateResolution<>(new SignedIn(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), null, 2, null);
                    }
                    return stateResolution2;
                }
                if (signInState instanceof ResolvingDeviceSRP) {
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                        return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), C56402yEa.EZpvd(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                    }
                    if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateTOTPSetup) {
                        return new StateResolution<>(new ResolvingTOTPSetup(new SetupTOTPState.NotStarted(null, 1, null)), C56402yEa.EZpvd(this.signInActions.initiateTOTPSetupAction((SignInEvent.EventType.InitiateTOTPSetup) eventTypeAsSignInEvent)));
                    }
                    return eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution2;
                }
                if (!(signInState instanceof ConfirmingDevice)) {
                    return signInState instanceof SigningInWithHostedUI ? eventTypeAsSignInEvent instanceof SignInEvent.EventType.SignedIn ? new StateResolution<>(new Done(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), null, 2, null) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution2 : stateResolution2;
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn) {
                    return new StateResolution<>(new SignedIn(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0), null, 2, null);
                }
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution2;
            }
            return stateResolution;
        }
    }

    public static final class Builder implements com.amplifyframework.statemachine.Builder<SignInState> {
        private SignInChallengeState challengeState;
        private CustomSignInState customSignInState;
        private DeviceSRPSignInState deviceSRPSignInState;
        private HostedUISignInState hostedUISignInState;
        private MigrateSignInState migrateSignInState;
        private SetupTOTPState setupTOTPState;
        private final SignInState signInState;
        private SRPSignInState srpSignInState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignInChallengeState getChallengeState() {
            return this.challengeState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomSignInState getCustomSignInState() {
            return this.customSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceSRPSignInState getDeviceSRPSignInState() {
            return this.deviceSRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUISignInState getHostedUISignInState() {
            return this.hostedUISignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MigrateSignInState getMigrateSignInState() {
            return this.migrateSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SetupTOTPState getSetupTOTPState() {
            return this.setupTOTPState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SRPSignInState getSrpSignInState() {
            return this.srpSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChallengeState(SignInChallengeState signInChallengeState) {
            this.challengeState = signInChallengeState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCustomSignInState(CustomSignInState customSignInState) {
            this.customSignInState = customSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDeviceSRPSignInState(DeviceSRPSignInState deviceSRPSignInState) {
            this.deviceSRPSignInState = deviceSRPSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHostedUISignInState(HostedUISignInState hostedUISignInState) {
            this.hostedUISignInState = hostedUISignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMigrateSignInState(MigrateSignInState migrateSignInState) {
            this.migrateSignInState = migrateSignInState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSetupTOTPState(SetupTOTPState setupTOTPState) {
            this.setupTOTPState = setupTOTPState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSrpSignInState(SRPSignInState sRPSignInState) {
            this.srpSignInState = sRPSignInState;
        }

        public Builder(@NotNull SignInState signInState) {
            Intrinsics.checkNotNullParameter(signInState, "");
            this.signInState = signInState;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amplifyframework.statemachine.Builder
        public SignInState build() {
            SignInState signInState = this.signInState;
            return signInState instanceof SigningInWithSRP ? new SigningInWithSRP(this.srpSignInState) : signInState instanceof ResolvingChallenge ? new ResolvingChallenge(this.challengeState) : signInState instanceof SigningInViaMigrateAuth ? new SigningInViaMigrateAuth(this.migrateSignInState) : signInState instanceof SigningInWithCustom ? new SigningInWithCustom(this.customSignInState) : signInState instanceof SigningInWithHostedUI ? new SigningInWithHostedUI(this.hostedUISignInState) : signInState instanceof SigningInWithSRPCustom ? new SigningInWithSRPCustom(this.srpSignInState) : signInState instanceof ResolvingDeviceSRP ? new ResolvingDeviceSRP(this.deviceSRPSignInState) : signInState instanceof ResolvingTOTPSetup ? new ResolvingTOTPSetup(this.setupTOTPState) : signInState;
        }
    }
}
