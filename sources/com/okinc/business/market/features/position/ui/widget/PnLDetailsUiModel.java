package com.okinc.business.market.features.position.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PnLDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<PnLDetailsUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<PnLDetailsUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnLDetailsUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PnLDetailsUiModel(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnLDetailsUiModel[] newArray(int i) {
            return new PnLDetailsUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PnLDetailsUiModel() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetailsUiModel OLrzqt(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        return new PnLDetailsUiModel(z, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnLDetailsUiModel)) {
            return false;
        }
        PnLDetailsUiModel pnLDetailsUiModel = (PnLDetailsUiModel) obj;
        return this.AYXKKw == pnLDetailsUiModel.AYXKKw && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) pnLDetailsUiModel.DbNXlk) && Intrinsics.EZpvd((Object) this.isConnected, (Object) pnLDetailsUiModel.isConnected) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) pnLDetailsUiModel.AkhnZx) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) pnLDetailsUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) pnLDetailsUiModel.valueOf) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) pnLDetailsUiModel.fJNWhG) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) pnLDetailsUiModel.AuCTel) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) pnLDetailsUiModel.AhwBna) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) pnLDetailsUiModel.djBIcL) && Intrinsics.EZpvd((Object) this.copydefault, (Object) pnLDetailsUiModel.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) pnLDetailsUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) pnLDetailsUiModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) pnLDetailsUiModel.fIwbmz) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) pnLDetailsUiModel.fARcdN) && Intrinsics.EZpvd((Object) this.values, (Object) pnLDetailsUiModel.values) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) pnLDetailsUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) pnLDetailsUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) pnLDetailsUiModel.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.AYXKKw);
        int iHashCode2 = this.DbNXlk.hashCode();
        int iHashCode3 = this.isConnected.hashCode();
        int iHashCode4 = this.AkhnZx.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        int iHashCode6 = this.valueOf.hashCode();
        int iHashCode7 = this.fJNWhG.hashCode();
        int iHashCode8 = this.AuCTel.hashCode();
        int iHashCode9 = this.AhwBna.hashCode();
        int iHashCode10 = this.djBIcL.hashCode();
        int iHashCode11 = this.copydefault.hashCode();
        int iHashCode12 = this.EZpvd.hashCode();
        int iHashCode13 = this.fetchVPNInfo.hashCode();
        int iHashCode14 = this.fIwbmz.hashCode();
        String str = this.fARcdN;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.values.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLDetailsUiModel(shouldShowPnl=" + this.AYXKKw + ", spotBalance=" + this.DbNXlk + ", totalProfit=" + this.isConnected + ", totalProfitPercentage=" + this.AkhnZx + ", currentProfit=" + this.KWHzl + ", currentProfitPercentage=" + this.valueOf + ", unrealizedProfit=" + this.fJNWhG + ", unrealizedProfitPercentage=" + this.AuCTel + ", realizedProfit=" + this.AhwBna + ", realizedProfitPercentage=" + this.djBIcL + ", averageBought=" + this.copydefault + ", averageSold=" + this.EZpvd + ", totalBought=" + this.fetchVPNInfo + ", totalSold=" + this.fIwbmz + ", walletBalance=" + this.fARcdN + ", tokenAddress=" + this.values + ", formattedBalance=" + this.gEmmrt + ", currentPrice=" + this.AEQbTJ + ", currencyAmount=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.values);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
    }

    public PnLDetailsUiModel(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.AYXKKw = z;
        this.DbNXlk = str;
        this.isConnected = str2;
        this.AkhnZx = str3;
        this.KWHzl = str4;
        this.valueOf = str5;
        this.fJNWhG = str6;
        this.AuCTel = str7;
        this.AhwBna = str8;
        this.djBIcL = str9;
        this.copydefault = str10;
        this.EZpvd = str11;
        this.fetchVPNInfo = str12;
        this.fIwbmz = str13;
        this.fARcdN = str14;
        this.values = str15;
        this.gEmmrt = str16;
        this.AEQbTJ = str17;
        this.OLrzqt = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d3: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PnLDetailsUiModel(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18);
    }
}
