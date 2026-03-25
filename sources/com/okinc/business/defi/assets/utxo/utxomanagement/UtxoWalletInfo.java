package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UtxoWalletInfo implements Parcelable {
    public static final Parcelable.Creator<UtxoWalletInfo> CREATOR = new Creator();
    public final Integer AEQbTJ;
    public final long KWHzl;
    public final String OLrzqt;
    public final long copydefault;

    public static final class Creator implements Parcelable.Creator<UtxoWalletInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoWalletInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoWalletInfo(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoWalletInfo[] newArray(int i) {
            return new UtxoWalletInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UtxoWalletInfo copy$default(UtxoWalletInfo utxoWalletInfo, String str, long j, long j2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utxoWalletInfo.OLrzqt;
        }
        if ((i & 2) != 0) {
            j = utxoWalletInfo.KWHzl;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = utxoWalletInfo.copydefault;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            num = utxoWalletInfo.AEQbTJ;
        }
        return utxoWalletInfo.EZpvd(str, j3, j4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoWalletInfo EZpvd(@NotNull String str, long j, long j2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UtxoWalletInfo(str, j, j2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof UtxoWalletInfo)) {
            return false;
        }
        UtxoWalletInfo utxoWalletInfo = (UtxoWalletInfo) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) utxoWalletInfo.OLrzqt) && this.KWHzl == utxoWalletInfo.KWHzl && this.copydefault == utxoWalletInfo.copydefault && Intrinsics.EZpvd(this.AEQbTJ, utxoWalletInfo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = Long.hashCode(this.KWHzl);
        int iHashCode3 = Long.hashCode(this.copydefault);
        Integer num = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoWalletInfo(address=" + this.OLrzqt + ", coinId=" + this.KWHzl + ", chainId=" + this.copydefault + ", utxoType=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeLong(this.KWHzl);
        parcel.writeLong(this.copydefault);
        Integer num = this.AEQbTJ;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public UtxoWalletInfo(@NotNull String str, long j, long j2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.KWHzl = j;
        this.copydefault = j2;
        this.AEQbTJ = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 long)
  (r11v0 long)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
 A[MD:(java.lang.String, long, long, java.lang.Integer):void (m)] (LINE:39) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoWalletInfo.<init>(java.lang.String, long, long, java.lang.Integer):void type: THIS */
    public /* synthetic */ UtxoWalletInfo(String str, long j, long j2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, (i & 8) != 0 ? null : num);
    }
}
