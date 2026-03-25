package com.okinc.business.market.features.smart_money.ranking.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RankingFilterModel implements Parcelable {
    public static final Parcelable.Creator<RankingFilterModel> CREATOR = new Creator();
    public String AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public String EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public String djBIcL;
    public String gEmmrt;
    public String valueOf;

    public static final class Creator implements Parcelable.Creator<RankingFilterModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RankingFilterModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RankingFilterModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RankingFilterModel[] newArray(int i) {
            return new RankingFilterModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankingFilterModel() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingFilterModel KWHzl(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RankingFilterModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof RankingFilterModel)) {
            return false;
        }
        RankingFilterModel rankingFilterModel = (RankingFilterModel) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) rankingFilterModel.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) rankingFilterModel.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) rankingFilterModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) rankingFilterModel.EZpvd) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) rankingFilterModel.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) rankingFilterModel.AhwBna) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) rankingFilterModel.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) rankingFilterModel.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) rankingFilterModel.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) rankingFilterModel.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        String str = this.AEQbTJ;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.EZpvd;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.djBIcL;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AhwBna;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AYXKKw;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.OLrzqt;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.gEmmrt;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.valueOf;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankingFilterModel(id=" + this.KWHzl + ", name=" + this.copydefault + ", pnlMin=" + this.AEQbTJ + ", pnlMax=" + this.EZpvd + ", winRateMin=" + this.djBIcL + ", winRateMax=" + this.AhwBna + ", transactionAmountMin=" + this.AYXKKw + ", transactionAmountMax=" + this.OLrzqt + ", volumeMin=" + this.gEmmrt + ", volumeMax=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
    }

    public RankingFilterModel(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
        this.djBIcL = str5;
        this.AhwBna = str6;
        this.AYXKKw = str7;
        this.OLrzqt = str8;
        this.gEmmrt = str9;
        this.valueOf = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RankingFilterModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
