package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRegisterScenarioRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PasskeyRegisterScenarioRequest> CREATOR = new Creator();
    private final PasskeyRegisterConfig config;
    private final PasskeyScenario scenario;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyRegisterScenarioRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRegisterScenarioRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyRegisterScenarioRequest((PasskeyScenario) parcel.readParcelable(PasskeyRegisterScenarioRequest.class.getClassLoader()), parcel.readInt() == 0 ? null : PasskeyRegisterConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRegisterScenarioRequest[] newArray(int i) {
            return new PasskeyRegisterScenarioRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRegisterScenarioRequest copy$default(PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequest, PasskeyScenario passkeyScenario, PasskeyRegisterConfig passkeyRegisterConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyScenario = passkeyRegisterScenarioRequest.scenario;
        }
        if ((i & 2) != 0) {
            passkeyRegisterConfig = passkeyRegisterScenarioRequest.config;
        }
        return passkeyRegisterScenarioRequest.copy(passkeyScenario, passkeyRegisterConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario component1() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRegisterConfig component2() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRegisterScenarioRequest copy(@NotNull PasskeyScenario passkeyScenario, PasskeyRegisterConfig passkeyRegisterConfig) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return new PasskeyRegisterScenarioRequest(passkeyScenario, passkeyRegisterConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyRegisterScenarioRequest)) {
            return false;
        }
        PasskeyRegisterScenarioRequest passkeyRegisterScenarioRequest = (PasskeyRegisterScenarioRequest) obj;
        return Intrinsics.EZpvd(this.scenario, passkeyRegisterScenarioRequest.scenario) && Intrinsics.EZpvd(this.config, passkeyRegisterScenarioRequest.config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRegisterConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.scenario.hashCode();
        PasskeyRegisterConfig passkeyRegisterConfig = this.config;
        return (iHashCode * 31) + (passkeyRegisterConfig == null ? 0 : passkeyRegisterConfig.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRegisterScenarioRequest(scenario=" + this.scenario + ", config=" + this.config + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.scenario, i);
        PasskeyRegisterConfig passkeyRegisterConfig = this.config;
        if (passkeyRegisterConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passkeyRegisterConfig.writeToParcel(parcel, i);
        }
    }

    public PasskeyRegisterScenarioRequest(@NotNull PasskeyScenario passkeyScenario, PasskeyRegisterConfig passkeyRegisterConfig) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        this.scenario = passkeyScenario;
        this.config = passkeyRegisterConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.auth.api.passkey.PasskeyScenario)
  (wrap:com.okinc.auth.api.passkey.PasskeyRegisterConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.api.passkey.PasskeyRegisterConfig) : (r2v0 com.okinc.auth.api.passkey.PasskeyRegisterConfig))
 A[MD:(com.okinc.auth.api.passkey.PasskeyScenario, com.okinc.auth.api.passkey.PasskeyRegisterConfig):void (m)] (LINE:9) call: com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest.<init>(com.okinc.auth.api.passkey.PasskeyScenario, com.okinc.auth.api.passkey.PasskeyRegisterConfig):void type: THIS */
    public /* synthetic */ PasskeyRegisterScenarioRequest(PasskeyScenario passkeyScenario, PasskeyRegisterConfig passkeyRegisterConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyScenario, (i & 2) != 0 ? null : passkeyRegisterConfig);
    }
}
