package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyResetRemoveRequest implements Parcelable {
    public static final Parcelable.Creator<PasskeyResetRemoveRequest> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final PasskeyResetRemoveType KWHzl;
    public final boolean OLrzqt;
    public final PasskeyScenario copydefault;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyResetRemoveRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyResetRemoveRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyResetRemoveRequest((PasskeyResetRemoveType) parcel.readParcelable(PasskeyResetRemoveRequest.class.getClassLoader()), parcel.readInt() != 0, (PasskeyScenario) parcel.readParcelable(PasskeyResetRemoveRequest.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyResetRemoveRequest[] newArray(int i) {
            return new PasskeyResetRemoveRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyResetRemoveRequest copy$default(PasskeyResetRemoveRequest passkeyResetRemoveRequest, PasskeyResetRemoveType passkeyResetRemoveType, boolean z, PasskeyScenario passkeyScenario, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyResetRemoveType = passkeyResetRemoveRequest.KWHzl;
        }
        if ((i & 2) != 0) {
            z = passkeyResetRemoveRequest.AEQbTJ;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            passkeyScenario = passkeyResetRemoveRequest.copydefault;
        }
        PasskeyScenario passkeyScenario2 = passkeyScenario;
        if ((i & 8) != 0) {
            z2 = passkeyResetRemoveRequest.EZpvd;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = passkeyResetRemoveRequest.OLrzqt;
        }
        return passkeyResetRemoveRequest.OLrzqt(passkeyResetRemoveType, z4, passkeyScenario2, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyResetRemoveRequest OLrzqt(@NotNull PasskeyResetRemoveType passkeyResetRemoveType, boolean z, @NotNull PasskeyScenario passkeyScenario, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(passkeyResetRemoveType, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return new PasskeyResetRemoveRequest(passkeyResetRemoveType, z, passkeyScenario, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyResetRemoveType copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof PasskeyResetRemoveRequest)) {
            return false;
        }
        PasskeyResetRemoveRequest passkeyResetRemoveRequest = (PasskeyResetRemoveRequest) obj;
        return Intrinsics.EZpvd(this.KWHzl, passkeyResetRemoveRequest.KWHzl) && this.AEQbTJ == passkeyResetRemoveRequest.AEQbTJ && Intrinsics.EZpvd(this.copydefault, passkeyResetRemoveRequest.copydefault) && this.EZpvd == passkeyResetRemoveRequest.EZpvd && this.OLrzqt == passkeyResetRemoveRequest.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyResetRemoveRequest(type=" + this.KWHzl + ", showIncompatibleBottomSheet=" + this.AEQbTJ + ", scenario=" + this.copydefault + ", showGuideReminderInSingleRemove=" + this.EZpvd + ", isForceIncompatibleForPasskeyError=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.KWHzl, i);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public PasskeyResetRemoveRequest(@NotNull PasskeyResetRemoveType passkeyResetRemoveType, boolean z, @NotNull PasskeyScenario passkeyScenario, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(passkeyResetRemoveType, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        this.KWHzl = passkeyResetRemoveType;
        this.AEQbTJ = z;
        this.copydefault = passkeyScenario;
        this.EZpvd = z2;
        this.OLrzqt = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 com.okinc.auth.api.passkey.PasskeyResetRemoveType)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:com.okinc.auth.api.passkey.PasskeyScenario:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.auth.api.passkey.PasskeyScenario:0x000c: SGET  A[WRAPPED] (LINE:11) com.okinc.auth.api.passkey.PasskeyScenario.Account.AEQbTJ com.okinc.auth.api.passkey.PasskeyScenario$Account) : (r10v0 com.okinc.auth.api.passkey.PasskeyScenario))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(com.okinc.auth.api.passkey.PasskeyResetRemoveType, boolean, com.okinc.auth.api.passkey.PasskeyScenario, boolean, boolean):void (m)] (LINE:8) call: com.okinc.auth.api.passkey.PasskeyResetRemoveRequest.<init>(com.okinc.auth.api.passkey.PasskeyResetRemoveType, boolean, com.okinc.auth.api.passkey.PasskeyScenario, boolean, boolean):void type: THIS */
    public /* synthetic */ PasskeyResetRemoveRequest(PasskeyResetRemoveType passkeyResetRemoveType, boolean z, PasskeyScenario passkeyScenario, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyResetRemoveType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? PasskeyScenario.Account.AEQbTJ : passkeyScenario, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }
}
