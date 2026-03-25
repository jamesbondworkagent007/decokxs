package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SimulateTransactionParam implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimulateTransactionParam> CREATOR = new Creator();
    private boolean replaceRecentBlockhash;
    private boolean sigVerify;
    private String transaction;

    public static final class Creator implements Parcelable.Creator<SimulateTransactionParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimulateTransactionParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimulateTransactionParam(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimulateTransactionParam[] newArray(int i) {
            return new SimulateTransactionParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimulateTransactionParam copy$default(SimulateTransactionParam simulateTransactionParam, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simulateTransactionParam.transaction;
        }
        if ((i & 2) != 0) {
            z = simulateTransactionParam.sigVerify;
        }
        if ((i & 4) != 0) {
            z2 = simulateTransactionParam.replaceRecentBlockhash;
        }
        return simulateTransactionParam.copy(str, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.sigVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.replaceRecentBlockhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimulateTransactionParam copy(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SimulateTransactionParam(str, z, z2);
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
        if (!(obj instanceof SimulateTransactionParam)) {
            return false;
        }
        SimulateTransactionParam simulateTransactionParam = (SimulateTransactionParam) obj;
        return Intrinsics.EZpvd((Object) this.transaction, (Object) simulateTransactionParam.transaction) && this.sigVerify == simulateTransactionParam.sigVerify && this.replaceRecentBlockhash == simulateTransactionParam.replaceRecentBlockhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReplaceRecentBlockhash() {
        return this.replaceRecentBlockhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSigVerify() {
        return this.sigVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.transaction.hashCode() * 31) + Boolean.hashCode(this.sigVerify)) * 31) + Boolean.hashCode(this.replaceRecentBlockhash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReplaceRecentBlockhash(boolean z) {
        this.replaceRecentBlockhash = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigVerify(boolean z) {
        this.sigVerify = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransaction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transaction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimulateTransactionParam(transaction=" + this.transaction + ", sigVerify=" + this.sigVerify + ", replaceRecentBlockhash=" + this.replaceRecentBlockhash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.transaction);
        parcel.writeInt(this.sigVerify ? 1 : 0);
        parcel.writeInt(this.replaceRecentBlockhash ? 1 : 0);
    }

    public SimulateTransactionParam(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transaction = str;
        this.sigVerify = z;
        this.replaceRecentBlockhash = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, boolean, boolean):void (m)] (LINE:455) call: com.okinc.business.defi.biz.net.bean.SimulateTransactionParam.<init>(java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ SimulateTransactionParam(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
