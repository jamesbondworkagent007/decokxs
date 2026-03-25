package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyLinkScenarioRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PasskeyLinkScenarioRequest> CREATOR = new Creator();
    private final boolean enableExternal;
    private final PasskeyScenario scenario;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyLinkScenarioRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyLinkScenarioRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyLinkScenarioRequest((PasskeyScenario) parcel.readParcelable(PasskeyLinkScenarioRequest.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyLinkScenarioRequest[] newArray(int i) {
            return new PasskeyLinkScenarioRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyLinkScenarioRequest copy$default(PasskeyLinkScenarioRequest passkeyLinkScenarioRequest, PasskeyScenario passkeyScenario, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyScenario = passkeyLinkScenarioRequest.scenario;
        }
        if ((i & 2) != 0) {
            z = passkeyLinkScenarioRequest.enableExternal;
        }
        return passkeyLinkScenarioRequest.copy(passkeyScenario, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario component1() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enableExternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyLinkScenarioRequest copy(@NotNull PasskeyScenario passkeyScenario, boolean z) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return new PasskeyLinkScenarioRequest(passkeyScenario, z);
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
        if (!(obj instanceof PasskeyLinkScenarioRequest)) {
            return false;
        }
        PasskeyLinkScenarioRequest passkeyLinkScenarioRequest = (PasskeyLinkScenarioRequest) obj;
        return Intrinsics.EZpvd(this.scenario, passkeyLinkScenarioRequest.scenario) && this.enableExternal == passkeyLinkScenarioRequest.enableExternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableExternal() {
        return this.enableExternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.scenario.hashCode() * 31) + Boolean.hashCode(this.enableExternal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyLinkScenarioRequest(scenario=" + this.scenario + ", enableExternal=" + this.enableExternal + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.scenario, i);
        parcel.writeInt(this.enableExternal ? 1 : 0);
    }

    public PasskeyLinkScenarioRequest(@NotNull PasskeyScenario passkeyScenario, boolean z) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        this.scenario = passkeyScenario;
        this.enableExternal = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.auth.api.passkey.PasskeyScenario)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(com.okinc.auth.api.passkey.PasskeyScenario, boolean):void (m)] (LINE:9) call: com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest.<init>(com.okinc.auth.api.passkey.PasskeyScenario, boolean):void type: THIS */
    public /* synthetic */ PasskeyLinkScenarioRequest(PasskeyScenario passkeyScenario, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyScenario, (i & 2) != 0 ? true : z);
    }
}
