package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class FunctionConfig implements Parcelable {
    public static final Parcelable.Creator<FunctionConfig> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;

    public static final class Creator implements Parcelable.Creator<FunctionConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FunctionConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FunctionConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FunctionConfig[] newArray(int i) {
            return new FunctionConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FunctionConfig() {
        this(false, false, false, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FunctionConfig copy$default(FunctionConfig functionConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = functionConfig.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = functionConfig.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z3 = functionConfig.OLrzqt;
        }
        if ((i & 8) != 0) {
            z4 = functionConfig.EZpvd;
        }
        return functionConfig.AEQbTJ(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FunctionConfig AEQbTJ(boolean z, boolean z2, boolean z3, boolean z4) {
        return new FunctionConfig(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof FunctionConfig)) {
            return false;
        }
        FunctionConfig functionConfig = (FunctionConfig) obj;
        return this.KWHzl == functionConfig.KWHzl && this.AEQbTJ == functionConfig.AEQbTJ && this.OLrzqt == functionConfig.OLrzqt && this.EZpvd == functionConfig.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.KWHzl) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FunctionConfig(supportAddAccount=" + this.KWHzl + ", supportFold=" + this.AEQbTJ + ", hiddenTip=" + this.OLrzqt + ", showRootWalletTotalBalance=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public FunctionConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.KWHzl = z;
        this.AEQbTJ = z2;
        this.OLrzqt = z3;
        this.EZpvd = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean):void (m)] (LINE:22) call: com.okinc.wallet.api.bean.FunctionConfig.<init>(boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ FunctionConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
