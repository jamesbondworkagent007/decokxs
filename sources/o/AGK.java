package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AGK {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.Long AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String AuCTel;
    public java.util.List<java.lang.String> AuCTelauCTel;
    public boolean AubY;
    public C4151AzT AwvSrB;
    public java.lang.String AxsJAY;
    public boolean DbNXlk;
    public C4181Azx EZpvd;
    public java.util.List<C4136AzE> KWHzl;
    public java.util.List<java.lang.Long> OLrzqt;
    public java.lang.String copydefault;
    public long djBIcL;
    public long ejfBZ;
    public java.lang.String fARcdN;
    public boolean fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public long gEmmrt;
    public java.lang.String gHZMYf;
    public long getFieldNames;
    public java.lang.String getNewProxyInstance;
    public java.lang.String hDKMBd;
    public java.lang.String isConnected;
    public boolean iwGUEr;
    public boolean uzCIH;
    public C4151AzT valueOf;
    public java.lang.String values;
    public long wlaJM;
    public long zLjUOn;
    public boolean zsXlph;
    public java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: o.AGK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AGK copy$default(AGK agk, C4181Azx c4181Azx, java.lang.String str, java.lang.String str2, java.lang.String str3, C4151AzT c4151AzT, C4151AzT c4151AzT2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, java.util.List list2, long j, boolean z, long j2, boolean z2, boolean z3, boolean z4, java.lang.String str7, boolean z5, java.lang.Long l, long j3, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, long j4, long j5, long j6, java.util.List list3, boolean z6, java.lang.String str14, java.lang.String str15, int i, int i2, java.lang.Object obj) {
        C4181Azx c4181Azx2 = (i & 1) != 0 ? agk.EZpvd : c4181Azx;
        java.lang.String str16 = (i & 2) != 0 ? agk.copydefault : str;
        java.lang.String str17 = (i & 4) != 0 ? agk.getNewProxyInstance : str2;
        java.lang.String str18 = (i & 8) != 0 ? agk.zuBGHE : str3;
        C4151AzT c4151AzT3 = (i & 16) != 0 ? agk.AwvSrB : c4151AzT;
        C4151AzT c4151AzT4 = (i & 32) != 0 ? agk.valueOf : c4151AzT2;
        java.lang.String str19 = (i & 64) != 0 ? agk.AEQbTJ : str4;
        java.lang.String str20 = (i & 128) != 0 ? agk.fetchVPNInfo : str5;
        java.lang.String str21 = (i & 256) != 0 ? agk.AxsJAY : str6;
        java.util.List list4 = (i & 512) != 0 ? agk.KWHzl : list;
        java.util.List list5 = (i & 1024) != 0 ? agk.OLrzqt : list2;
        long j7 = (i & 2048) != 0 ? agk.gEmmrt : j;
        boolean z7 = (i & 4096) != 0 ? agk.DbNXlk : z;
        long j8 = j7;
        long j9 = (i & 8192) != 0 ? agk.zLjUOn : j2;
        return agk.AEQbTJ(c4181Azx2, str16, str17, str18, c4151AzT3, c4151AzT4, str19, str20, str21, list4, list5, j8, z7, j9, (i & 16384) != 0 ? agk.iwGUEr : z2, (i & 32768) != 0 ? agk.zsXlph : z3, (i & 65536) != 0 ? agk.uzCIH : z4, (i & 131072) != 0 ? agk.values : str7, (i & 262144) != 0 ? agk.fIwbmz : z5, (i & 524288) != 0 ? agk.AhwBna : l, (i & 1048576) != 0 ? agk.djBIcL : j3, (i & 2097152) != 0 ? agk.AYXKKw : str8, (4194304 & i) != 0 ? agk.isConnected : str9, (i & 8388608) != 0 ? agk.AkhnZx : str10, (i & 16777216) != 0 ? agk.fJNWhG : str11, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? agk.AuCTel : str12, (i & 67108864) != 0 ? agk.hDKMBd : str13, (i & 134217728) != 0 ? agk.ejfBZ : j4, (i & 268435456) != 0 ? agk.getFieldNames : j5, (i & 536870912) != 0 ? agk.wlaJM : j6, (i & 1073741824) != 0 ? agk.AuCTelauCTel : list3, (i & Integer.MIN_VALUE) != 0 ? agk.AubY : z6, (i2 & 1) != 0 ? agk.gHZMYf : str14, (i2 & 2) != 0 ? agk.fARcdN : str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGK AEQbTJ(@NotNull C4181Azx c4181Azx, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, C4151AzT c4151AzT, C4151AzT c4151AzT2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.util.List<C4136AzE> list, java.util.List<java.lang.Long> list2, long j, boolean z, long j2, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str7, boolean z5, java.lang.Long l, long j3, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, long j4, long j5, long j6, @NotNull java.util.List<java.lang.String> list3, boolean z6, @NotNull java.lang.String str14, java.lang.String str15) {
        Intrinsics.checkNotNullParameter(c4181Azx, "");
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
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new AGK(c4181Azx, str, str2, str3, c4151AzT, c4151AzT2, str4, str5, str6, list, list2, j, z, j2, z2, z3, z4, str7, z5, l, j3, str8, str9, str10, str11, str12, str13, j4, j5, j6, list3, z6, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AuCTelauCTel() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C4136AzE> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4181Azx KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGK)) {
            return false;
        }
        AGK agk = (AGK) obj;
        return Intrinsics.EZpvd(this.EZpvd, agk.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) agk.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) agk.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) agk.zuBGHE) && Intrinsics.EZpvd(this.AwvSrB, agk.AwvSrB) && Intrinsics.EZpvd(this.valueOf, agk.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) agk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) agk.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AxsJAY, (java.lang.Object) agk.AxsJAY) && Intrinsics.EZpvd(this.KWHzl, agk.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, agk.OLrzqt) && this.gEmmrt == agk.gEmmrt && this.DbNXlk == agk.DbNXlk && this.zLjUOn == agk.zLjUOn && this.iwGUEr == agk.iwGUEr && this.zsXlph == agk.zsXlph && this.uzCIH == agk.uzCIH && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) agk.values) && this.fIwbmz == agk.fIwbmz && Intrinsics.EZpvd(this.AhwBna, agk.AhwBna) && this.djBIcL == agk.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) agk.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) agk.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) agk.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) agk.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) agk.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) agk.hDKMBd) && this.ejfBZ == agk.ejfBZ && this.getFieldNames == agk.getFieldNames && this.wlaJM == agk.wlaJM && Intrinsics.EZpvd(this.AuCTelauCTel, agk.AuCTelauCTel) && this.AubY == agk.AubY && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) agk.gHZMYf) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) agk.fARcdN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFieldNames() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.getNewProxyInstance.hashCode();
        int iHashCode5 = this.zuBGHE.hashCode();
        C4151AzT c4151AzT = this.AwvSrB;
        int iHashCode6 = c4151AzT == null ? 0 : c4151AzT.hashCode();
        C4151AzT c4151AzT2 = this.valueOf;
        int iHashCode7 = c4151AzT2 == null ? 0 : c4151AzT2.hashCode();
        int iHashCode8 = this.AEQbTJ.hashCode();
        int iHashCode9 = this.fetchVPNInfo.hashCode();
        int iHashCode10 = this.AxsJAY.hashCode();
        java.util.List<C4136AzE> list = this.KWHzl;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        java.util.List<java.lang.Long> list2 = this.OLrzqt;
        int iHashCode12 = list2 == null ? 0 : list2.hashCode();
        int iHashCode13 = java.lang.Long.hashCode(this.gEmmrt);
        int iHashCode14 = java.lang.Boolean.hashCode(this.DbNXlk);
        int iHashCode15 = java.lang.Long.hashCode(this.zLjUOn);
        int iHashCode16 = java.lang.Boolean.hashCode(this.iwGUEr);
        int iHashCode17 = java.lang.Boolean.hashCode(this.zsXlph);
        int iHashCode18 = java.lang.Boolean.hashCode(this.uzCIH);
        int iHashCode19 = this.values.hashCode();
        int iHashCode20 = java.lang.Boolean.hashCode(this.fIwbmz);
        java.lang.Long l = this.AhwBna;
        if (l == null) {
            i = iHashCode15;
            i2 = iHashCode16;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            i = iHashCode15;
            i2 = iHashCode16;
        }
        int iHashCode21 = java.lang.Long.hashCode(this.djBIcL);
        int iHashCode22 = this.AYXKKw.hashCode();
        int iHashCode23 = this.isConnected.hashCode();
        int iHashCode24 = this.AkhnZx.hashCode();
        int iHashCode25 = this.fJNWhG.hashCode();
        int iHashCode26 = this.AuCTel.hashCode();
        int iHashCode27 = this.hDKMBd.hashCode();
        int iHashCode28 = java.lang.Long.hashCode(this.ejfBZ);
        int iHashCode29 = java.lang.Long.hashCode(this.getFieldNames);
        int iHashCode30 = java.lang.Long.hashCode(this.wlaJM);
        int iHashCode31 = this.AuCTelauCTel.hashCode();
        int iHashCode32 = java.lang.Boolean.hashCode(this.AubY);
        int iHashCode33 = this.gHZMYf.hashCode();
        java.lang.String str2 = this.fARcdN;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (str2 == null ? 0 : str2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SwapChainInfo(base=" + this.EZpvd + ", chainUsed=" + this.copydefault + ", sortMultipleSwap=" + this.getNewProxyInstance + ", tradeHashUrl=" + this.zuBGHE + ", toleranceSlippage=" + this.AwvSrB + ", crossToleranceSlippage=" + this.valueOf + ", baseToken=" + this.AEQbTJ + ", hotTokens=" + this.fetchVPNInfo + ", tokenAddress=" + this.AxsJAY + ", bridgeSupportChainInfoList=" + this.KWHzl + ", bridgeSupportChainList=" + this.OLrzqt + ", crossChainType=" + this.gEmmrt + ", isNeedDealFeeCallData=" + this.DbNXlk + ", supportSwapType=" + this.zLjUOn + ", supportAaWallet=" + this.iwGUEr + ", supportMemeMode=" + this.zsXlph + ", supportBatchBroadcast=" + this.uzCIH + ", gasPriceScalar=" + this.values + ", isSupportBlinksShareUrl=" + this.fIwbmz + ", displayTime=" + this.AhwBna + ", explorerAccountPath=" + this.djBIcL + ", filterTokenType=" + this.AYXKKw + ", greyLogoUrl=" + this.isConnected + ", intentCode=" + this.AkhnZx + ", nativeTokenSymbol=" + this.fJNWhG + ", sortCrossBridge=" + this.AuCTel + ", sortSingleSwap=" + this.hDKMBd + ", limitOrderMode=" + this.ejfBZ + ", supportLimitOrderPriorityFee=" + this.getFieldNames + ", supportLimitOrderSlippage=" + this.wlaJM + ", supportPlatformIds=" + this.AuCTelauCTel + ", supportWidget=" + this.AubY + ", whiteLogoUrl=" + this.gHZMYf + ", rawJson=" + this.fARcdN + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long uzCIH() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4151AzT valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long wlaJM() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4151AzT zLjUOn() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zsXlph() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.gHZMYf;
    }

    public AGK(@NotNull C4181Azx c4181Azx, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, C4151AzT c4151AzT, C4151AzT c4151AzT2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.util.List<C4136AzE> list, java.util.List<java.lang.Long> list2, long j, boolean z, long j2, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str7, boolean z5, java.lang.Long l, long j3, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, long j4, long j5, long j6, @NotNull java.util.List<java.lang.String> list3, boolean z6, @NotNull java.lang.String str14, java.lang.String str15) {
        Intrinsics.checkNotNullParameter(c4181Azx, "");
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
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.EZpvd = c4181Azx;
        this.copydefault = str;
        this.getNewProxyInstance = str2;
        this.zuBGHE = str3;
        this.AwvSrB = c4151AzT;
        this.valueOf = c4151AzT2;
        this.AEQbTJ = str4;
        this.fetchVPNInfo = str5;
        this.AxsJAY = str6;
        this.KWHzl = list;
        this.OLrzqt = list2;
        this.gEmmrt = j;
        this.DbNXlk = z;
        this.zLjUOn = j2;
        this.iwGUEr = z2;
        this.zsXlph = z3;
        this.uzCIH = z4;
        this.values = str7;
        this.fIwbmz = z5;
        this.AhwBna = l;
        this.djBIcL = j3;
        this.AYXKKw = str8;
        this.isConnected = str9;
        this.AkhnZx = str10;
        this.fJNWhG = str11;
        this.AuCTel = str12;
        this.hDKMBd = str13;
        this.ejfBZ = j4;
        this.getFieldNames = j5;
        this.wlaJM = j6;
        this.AuCTelauCTel = list3;
        this.AubY = z6;
        this.gHZMYf = str14;
        this.fARcdN = str15;
    }
}
