package com.okinc.business.market.features.holdings.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.RiskControlLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HoldingAsset implements kMU, Parcelable {
    public static final Parcelable.Creator<HoldingAsset> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final RiskControlLevel AuCTel;
    public final String AuCTelauCTel;
    public final String AubY;
    public final String AwvSrB;
    public final boolean DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final boolean ejfBZ;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public final String getFieldNames;
    public final boolean getNewProxyInstance;
    public final String hDKMBd;
    public final String isConnected;
    public final String iwGUEr;
    public final String uzCIH;
    public final boolean valueOf;
    public final boolean values;
    public final String wlaJM;
    public final String zLjUOn;
    public final String zsXlph;

    public static final class Creator implements Parcelable.Creator<HoldingAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoldingAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HoldingAsset(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), RiskControlLevel.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoldingAsset[] newArray(int i) {
            return new HoldingAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HoldingAsset() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, Integer.MAX_VALUE, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldingAsset OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z, boolean z2, @NotNull String str13, boolean z3, boolean z4, boolean z5, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull RiskControlLevel riskControlLevel, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, boolean z6, boolean z7) {
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        return new HoldingAsset(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, z2, str13, z3, z4, z5, str14, str15, str16, riskControlLevel, str17, str18, str19, str20, str21, str22, str23, z6, z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
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
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HoldingAsset)) {
            return false;
        }
        HoldingAsset holdingAsset = (HoldingAsset) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) holdingAsset.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) holdingAsset.EZpvd) && Intrinsics.EZpvd((Object) this.uzCIH, (Object) holdingAsset.uzCIH) && Intrinsics.EZpvd((Object) this.iwGUEr, (Object) holdingAsset.iwGUEr) && Intrinsics.EZpvd((Object) this.getFieldNames, (Object) holdingAsset.getFieldNames) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) holdingAsset.fIwbmz) && Intrinsics.EZpvd((Object) this.copydefault, (Object) holdingAsset.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) holdingAsset.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) holdingAsset.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) holdingAsset.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) holdingAsset.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) holdingAsset.AYXKKw) && this.AhwBna == holdingAsset.AhwBna && this.fetchVPNInfo == holdingAsset.fetchVPNInfo && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) holdingAsset.AkhnZx) && this.values == holdingAsset.values && this.DbNXlk == holdingAsset.DbNXlk && this.getNewProxyInstance == holdingAsset.getNewProxyInstance && Intrinsics.EZpvd((Object) this.isConnected, (Object) holdingAsset.isConnected) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) holdingAsset.fARcdN) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) holdingAsset.fJNWhG) && this.AuCTel == holdingAsset.AuCTel && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) holdingAsset.hDKMBd) && Intrinsics.EZpvd((Object) this.wlaJM, (Object) holdingAsset.wlaJM) && Intrinsics.EZpvd((Object) this.AubY, (Object) holdingAsset.AubY) && Intrinsics.EZpvd((Object) this.zsXlph, (Object) holdingAsset.zsXlph) && Intrinsics.EZpvd((Object) this.AuCTelauCTel, (Object) holdingAsset.AuCTelauCTel) && Intrinsics.EZpvd((Object) this.zLjUOn, (Object) holdingAsset.zLjUOn) && Intrinsics.EZpvd((Object) this.AwvSrB, (Object) holdingAsset.AwvSrB) && this.ejfBZ == holdingAsset.ejfBZ && this.valueOf == holdingAsset.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.uzCIH.hashCode()) * 31) + this.iwGUEr.hashCode()) * 31) + this.getFieldNames.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.fetchVPNInfo)) * 31) + this.AkhnZx.hashCode()) * 31) + Boolean.hashCode(this.values)) * 31) + Boolean.hashCode(this.DbNXlk)) * 31) + Boolean.hashCode(this.getNewProxyInstance)) * 31) + this.isConnected.hashCode()) * 31) + this.fARcdN.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.hDKMBd.hashCode()) * 31) + this.wlaJM.hashCode()) * 31) + this.AubY.hashCode()) * 31) + this.zsXlph.hashCode()) * 31) + this.AuCTelauCTel.hashCode()) * 31) + this.zLjUOn.hashCode()) * 31) + this.AwvSrB.hashCode()) * 31) + Boolean.hashCode(this.ejfBZ)) * 31) + Boolean.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HoldingAsset(chainId=" + this.AEQbTJ + ", chainLogo=" + this.EZpvd + ", tokenAddress=" + this.uzCIH + ", tokenLogo=" + this.iwGUEr + ", tokenSymbol=" + this.getFieldNames + ", price=" + this.fIwbmz + ", amount=" + this.copydefault + ", boughtAvgPrice=" + this.KWHzl + ", boughtVolume=" + this.OLrzqt + ", convertToNativeTokenAmount=" + this.djBIcL + ", currencyAmount=" + this.gEmmrt + ", holdAvgPrice=" + this.AYXKKw + ", inWatchList=" + this.AhwBna + ", lowLiquidity=" + this.fetchVPNInfo + ", marketCap=" + this.AkhnZx + ", meme=" + this.values + ", nativeToken=" + this.DbNXlk + ", stableToken=" + this.getNewProxyInstance + ", nativeTokenAddress=" + this.isConnected + ", nativeTokenPrice=" + this.fARcdN + ", realizedProfit=" + this.fJNWhG + ", riskControlLevel=" + this.AuCTel + ", spotBalance=" + this.hDKMBd + ", totalProfit=" + this.wlaJM + ", totalProfitPercentage=" + this.AubY + ", unrealizedProfit=" + this.zsXlph + ", unrealizedProfitPercentage=" + this.AuCTelauCTel + ", upnlConvertToNativeTokenAmount=" + this.zLjUOn + ", walletAddress=" + this.AwvSrB + ", showCostPrice=" + this.ejfBZ + ", isPnlSupported=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.uzCIH);
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.getFieldNames);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AYXKKw);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeInt(this.DbNXlk ? 1 : 0);
        parcel.writeInt(this.getNewProxyInstance ? 1 : 0);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.AuCTel.name());
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.wlaJM);
        parcel.writeString(this.AubY);
        parcel.writeString(this.zsXlph);
        parcel.writeString(this.AuCTelauCTel);
        parcel.writeString(this.zLjUOn);
        parcel.writeString(this.AwvSrB);
        parcel.writeInt(this.ejfBZ ? 1 : 0);
        parcel.writeInt(this.valueOf ? 1 : 0);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public HoldingAsset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z, boolean z2, @NotNull String str13, boolean z3, boolean z4, boolean z5, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull RiskControlLevel riskControlLevel, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, boolean z6, boolean z7) {
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.uzCIH = str3;
        this.iwGUEr = str4;
        this.getFieldNames = str5;
        this.fIwbmz = str6;
        this.copydefault = str7;
        this.KWHzl = str8;
        this.OLrzqt = str9;
        this.djBIcL = str10;
        this.gEmmrt = str11;
        this.AYXKKw = str12;
        this.AhwBna = z;
        this.fetchVPNInfo = z2;
        this.AkhnZx = str13;
        this.values = z3;
        this.DbNXlk = z4;
        this.getNewProxyInstance = z5;
        this.isConnected = str14;
        this.fARcdN = str15;
        this.fJNWhG = str16;
        this.AuCTel = riskControlLevel;
        this.hDKMBd = str17;
        this.wlaJM = str18;
        this.AubY = str19;
        this.zsXlph = str20;
        this.AuCTelauCTel = str21;
        this.zLjUOn = str22;
        this.AwvSrB = str23;
        this.ejfBZ = z6;
        this.valueOf = z7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x016f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0098: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.RiskControlLevel:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c8: SGET  A[WRAPPED] (LINE:31) com.okinc.business.market.common.constants.RiskControlLevel.UNKNOWN com.okinc.business.market.common.constants.RiskControlLevel) : (r54v0 com.okinc.business.market.common.constants.RiskControlLevel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x011c: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? false : (r62v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0127: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? false : (r63v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:9) call: com.okinc.business.market.features.holdings.domain.model.HoldingAsset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ HoldingAsset(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13, boolean z3, boolean z4, boolean z5, String str14, String str15, String str16, RiskControlLevel riskControlLevel, String str17, String str18, String str19, String str20, String str21, String str22, String str23, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? false : z3, (i & 65536) != 0 ? false : z4, (i & 131072) != 0 ? false : z5, (i & 262144) != 0 ? "" : str14, (i & 524288) != 0 ? "" : str15, (i & 1048576) != 0 ? "" : str16, (i & 2097152) != 0 ? RiskControlLevel.UNKNOWN : riskControlLevel, (i & 4194304) != 0 ? "" : str17, (i & 8388608) != 0 ? "" : str18, (i & 16777216) != 0 ? "" : str19, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str20, (i & 67108864) != 0 ? "" : str21, (i & 134217728) != 0 ? "" : str22, (i & 268435456) != 0 ? "" : str23, (i & 536870912) != 0 ? false : z6, (i & 1073741824) != 0 ? false : z7);
    }
}
