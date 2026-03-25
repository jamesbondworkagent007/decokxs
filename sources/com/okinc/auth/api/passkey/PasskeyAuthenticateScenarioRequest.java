package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateScenarioRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PasskeyAuthenticateScenarioRequest> CREATOR = new Creator();
    private final boolean enableExternal;
    private final PasskeyAuthenticateRequest request;
    private final PasskeyScenario scenario;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyAuthenticateScenarioRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyAuthenticateScenarioRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyAuthenticateScenarioRequest((PasskeyScenario) parcel.readParcelable(PasskeyAuthenticateScenarioRequest.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PasskeyAuthenticateRequest.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyAuthenticateScenarioRequest[] newArray(int i) {
            return new PasskeyAuthenticateScenarioRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyAuthenticateScenarioRequest copy$default(PasskeyAuthenticateScenarioRequest passkeyAuthenticateScenarioRequest, PasskeyScenario passkeyScenario, boolean z, PasskeyAuthenticateRequest passkeyAuthenticateRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyScenario = passkeyAuthenticateScenarioRequest.scenario;
        }
        if ((i & 2) != 0) {
            z = passkeyAuthenticateScenarioRequest.enableExternal;
        }
        if ((i & 4) != 0) {
            passkeyAuthenticateRequest = passkeyAuthenticateScenarioRequest.request;
        }
        return passkeyAuthenticateScenarioRequest.copy(passkeyScenario, z, passkeyAuthenticateRequest);
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
    public final PasskeyAuthenticateRequest component3() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateScenarioRequest copy(@NotNull PasskeyScenario passkeyScenario, boolean z, PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return new PasskeyAuthenticateScenarioRequest(passkeyScenario, z, passkeyAuthenticateRequest);
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
        if (!(obj instanceof PasskeyAuthenticateScenarioRequest)) {
            return false;
        }
        PasskeyAuthenticateScenarioRequest passkeyAuthenticateScenarioRequest = (PasskeyAuthenticateScenarioRequest) obj;
        return Intrinsics.EZpvd(this.scenario, passkeyAuthenticateScenarioRequest.scenario) && this.enableExternal == passkeyAuthenticateScenarioRequest.enableExternal && Intrinsics.EZpvd(this.request, passkeyAuthenticateScenarioRequest.request);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableExternal() {
        return this.enableExternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateRequest getRequest() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.scenario.hashCode();
        int iHashCode2 = Boolean.hashCode(this.enableExternal);
        PasskeyAuthenticateRequest passkeyAuthenticateRequest = this.request;
        return (((iHashCode * 31) + iHashCode2) * 31) + (passkeyAuthenticateRequest == null ? 0 : passkeyAuthenticateRequest.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyAuthenticateScenarioRequest(scenario=" + this.scenario + ", enableExternal=" + this.enableExternal + ", request=" + this.request + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.scenario, i);
        parcel.writeInt(this.enableExternal ? 1 : 0);
        PasskeyAuthenticateRequest passkeyAuthenticateRequest = this.request;
        if (passkeyAuthenticateRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passkeyAuthenticateRequest.writeToParcel(parcel, i);
        }
    }

    public PasskeyAuthenticateScenarioRequest(@NotNull PasskeyScenario passkeyScenario, boolean z, PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        this.scenario = passkeyScenario;
        this.enableExternal = z;
        this.request = passkeyAuthenticateRequest;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 com.okinc.auth.api.passkey.PasskeyScenario)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:com.okinc.auth.api.passkey.PasskeyAuthenticateRequest:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.api.passkey.PasskeyAuthenticateRequest) : (r3v0 com.okinc.auth.api.passkey.PasskeyAuthenticateRequest))
 A[MD:(com.okinc.auth.api.passkey.PasskeyScenario, boolean, com.okinc.auth.api.passkey.PasskeyAuthenticateRequest):void (m)] (LINE:10) call: com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest.<init>(com.okinc.auth.api.passkey.PasskeyScenario, boolean, com.okinc.auth.api.passkey.PasskeyAuthenticateRequest):void type: THIS */
    public /* synthetic */ PasskeyAuthenticateScenarioRequest(PasskeyScenario passkeyScenario, boolean z, PasskeyAuthenticateRequest passkeyAuthenticateRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyScenario, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : passkeyAuthenticateRequest);
    }
}
