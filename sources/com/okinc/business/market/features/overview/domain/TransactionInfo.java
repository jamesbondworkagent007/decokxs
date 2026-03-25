package com.okinc.business.market.features.overview.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TransactionInfo implements Parcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new Creator();
    public final TransactionStatistic AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<TransactionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TransactionStatistic.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionInfo[] newArray(int i) {
            return new TransactionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionInfo() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, String str, String str2, String str3, String str4, TransactionStatistic transactionStatistic, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionInfo.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = transactionInfo.KWHzl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = transactionInfo.OLrzqt;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = transactionInfo.copydefault;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            transactionStatistic = transactionInfo.AEQbTJ;
        }
        return transactionInfo.OLrzqt(str, str5, str6, str7, transactionStatistic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStatistic EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfo OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TransactionInfo(str, str2, str3, str4, transactionStatistic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof TransactionInfo)) {
            return false;
        }
        TransactionInfo transactionInfo = (TransactionInfo) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) transactionInfo.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) transactionInfo.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) transactionInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) transactionInfo.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, transactionInfo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        TransactionStatistic transactionStatistic = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (transactionStatistic == null ? 0 : transactionStatistic.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionInfo(price5M=" + this.EZpvd + ", price1H=" + this.KWHzl + ", price4H=" + this.OLrzqt + ", price24H=" + this.copydefault + ", transactionStatistic=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        TransactionStatistic transactionStatistic = this.AEQbTJ;
        if (transactionStatistic == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionStatistic.writeToParcel(parcel, i);
        }
    }

    public TransactionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.copydefault = str4;
        this.AEQbTJ = transactionStatistic;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.features.overview.domain.TransactionStatistic:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.overview.domain.TransactionStatistic) : (r8v0 com.okinc.business.market.features.overview.domain.TransactionStatistic))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.overview.domain.TransactionStatistic):void (m)] (LINE:25) call: com.okinc.business.market.features.overview.domain.TransactionInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.overview.domain.TransactionStatistic):void type: THIS */
    public /* synthetic */ TransactionInfo(String str, String str2, String str3, String str4, TransactionStatistic transactionStatistic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : transactionStatistic);
    }
}
