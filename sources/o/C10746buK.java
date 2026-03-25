package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainTransactionEntity;
import com.okinc.business.defi.biz.net.bean.Address;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.InvestTxData;
import com.okinc.business.defi.biz.net.bean.RegisterInfo;
import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxContractInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.buK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10746buK {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public long AEQbTJ;
    public long AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String DbNXlk;
    public long EZpvd;
    public long OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.Integer fetchVPNInfo;
    public java.lang.String gEmmrt;
    public int hDKMBd;
    public java.lang.String isConnected;
    public java.lang.String iwGUEr;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.fIwbmz = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10746buK copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j2, int i, int i2, int i3, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, long j3, long j4, java.lang.Integer num) {
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
        return new C10746buK(str, j, str2, str3, str4, j2, i, i2, i3, str5, str6, str7, str8, str9, str10, str11, str12, str13, j3, j4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        long j = this.OLrzqt;
        return j != 0 ? j : this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10746buK)) {
            return false;
        }
        C10746buK c10746buK = (C10746buK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) c10746buK.iwGUEr) && this.AEQbTJ == c10746buK.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c10746buK.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c10746buK.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c10746buK.AkhnZx) && this.EZpvd == c10746buK.EZpvd && this.hDKMBd == c10746buK.hDKMBd && this.fARcdN == c10746buK.fARcdN && this.fIwbmz == c10746buK.fIwbmz && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c10746buK.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c10746buK.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c10746buK.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c10746buK.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c10746buK.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c10746buK.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c10746buK.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c10746buK.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c10746buK.djBIcL) && this.AYXKKw == c10746buK.AYXKKw && this.OLrzqt == c10746buK.OLrzqt && Intrinsics.EZpvd(this.fetchVPNInfo, c10746buK.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.iwGUEr.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.AEQbTJ);
        int iHashCode3 = this.fJNWhG.hashCode();
        int iHashCode4 = this.ejfBZ.hashCode();
        int iHashCode5 = this.AkhnZx.hashCode();
        int iHashCode6 = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode7 = java.lang.Integer.hashCode(this.hDKMBd);
        int iHashCode8 = java.lang.Integer.hashCode(this.fARcdN);
        int iHashCode9 = java.lang.Integer.hashCode(this.fIwbmz);
        int iHashCode10 = this.valueOf.hashCode();
        int iHashCode11 = this.AuCTel.hashCode();
        int iHashCode12 = this.isConnected.hashCode();
        int iHashCode13 = this.AhwBna.hashCode();
        int iHashCode14 = this.gEmmrt.hashCode();
        int iHashCode15 = this.copydefault.hashCode();
        int iHashCode16 = this.DbNXlk.hashCode();
        int iHashCode17 = this.values.hashCode();
        int iHashCode18 = this.djBIcL.hashCode();
        int iHashCode19 = java.lang.Long.hashCode(this.AYXKKw);
        int iHashCode20 = java.lang.Long.hashCode(this.OLrzqt);
        java.lang.Integer num = this.fetchVPNInfo;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CustomChainTransaction(walletId=" + this.iwGUEr + ", coinId=" + this.AEQbTJ + ", txHash=" + this.fJNWhG + ", txId=" + this.ejfBZ + ", originTxHash=" + this.AkhnZx + ", chainId=" + this.EZpvd + ", txType=" + this.hDKMBd + ", repeatTxType=" + this.fARcdN + ", txStatus=" + this.fIwbmz + ", fromAddress=" + this.valueOf + ", toAddress=" + this.AuCTel + ", nonce=" + this.isConnected + ", gasPrice=" + this.AhwBna + ", gasLimit=" + this.gEmmrt + ", coinAmount=" + this.copydefault + ", inputData=" + this.DbNXlk + ", rawTx=" + this.values + ", failReason=" + this.djBIcL + ", createAt=" + this.AYXKKw + ", confirmAt=" + this.OLrzqt + ", hideTxType=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.fJNWhG;
    }

    public C10746buK(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j2, int i, int i2, int i3, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, long j3, long j4, java.lang.Integer num) {
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
        this.iwGUEr = str;
        this.AEQbTJ = j;
        this.fJNWhG = str2;
        this.ejfBZ = str3;
        this.AkhnZx = str4;
        this.EZpvd = j2;
        this.hDKMBd = i;
        this.fARcdN = i2;
        this.fIwbmz = i3;
        this.valueOf = str5;
        this.AuCTel = str6;
        this.isConnected = str7;
        this.AhwBna = str8;
        this.gEmmrt = str9;
        this.copydefault = str10;
        this.DbNXlk = str11;
        this.values = str12;
        this.djBIcL = str13;
        this.AYXKKw = j3;
        this.OLrzqt = j4;
        this.fetchVPNInfo = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (r28v0 java.lang.String)
  (r29v0 long)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 long)
  (r36v0 int)
  (r37v0 int)
  (r38v0 int)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r53v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r53v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r48v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r53v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r50v0 long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0027: ARITH (r53v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r52v0 java.lang.Integer))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.Integer):void (m)] (LINE:29) call: o.buK.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.Integer):void type: THIS */
    public /* synthetic */ C10746buK(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2, int i, int i2, int i3, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, long j3, long j4, java.lang.Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, str4, j2, i, i2, i3, str5, str6, str7, str8, str9, str10, str11, str12, (i4 & 131072) != 0 ? "" : str13, (i4 & 262144) != 0 ? 0L : j3, (i4 & 524288) != 0 ? 0L : j4, (i4 & 1048576) != 0 ? 0 : num);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoinAndAddressHistoryDetail KWHzl() {
        java.lang.String str;
        int i;
        int i2;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(this.AEQbTJ);
        C10854bwM c10854bwMAEQbTJ = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AEQbTJ() : null;
        C10854bwM c10854bwMKWHzl = c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.KWHzl() : null;
        java.lang.String str2 = this.ejfBZ;
        java.lang.String str3 = this.fJNWhG;
        java.lang.String str4 = this.valueOf;
        java.lang.String str5 = this.AuCTel;
        long j = this.AEQbTJ;
        long jAEQbTJ = c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.AEQbTJ() : 0L;
        int i3 = this.hDKMBd;
        java.lang.String str6 = (i3 == 3 || i3 == 4) ? this.AuCTel : "";
        java.lang.String str7 = this.copydefault;
        if (i3 == 6 || i3 == 4) {
            str = "";
        } else {
            java.lang.String strFJNWhG = c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.fJNWhG() : null;
            if (strFJNWhG != null) {
                str = strFJNWhG;
            }
        }
        int iValueOf = c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.valueOf() : 0;
        int iFZBcTu = c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.fZBcTu() : 0;
        java.lang.String strFJNWhG2 = c10854bwMKWHzl != null ? c10854bwMKWHzl.fJNWhG() : null;
        java.lang.String str8 = strFJNWhG2 == null ? "" : strFJNWhG2;
        int iValueOf2 = c10854bwMKWHzl != null ? c10854bwMKWHzl.valueOf() : 0;
        int iFZBcTu2 = c10854bwMKWHzl != null ? c10854bwMKWHzl.fZBcTu() : 0;
        long jDjBIcL = djBIcL();
        int i4 = this.fIwbmz;
        int i5 = this.fARcdN;
        java.lang.String str9 = this.AhwBna;
        java.lang.String str10 = this.gEmmrt;
        java.lang.String str11 = this.isConnected;
        java.lang.String str12 = this.DbNXlk;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str9, str10), true, (RoundingMode) null, 2, (java.lang.Object) null);
        int i6 = this.fIwbmz;
        return new CoinAndAddressHistoryDetail(str2, str3, (java.lang.String) null, str4, str4, str5, j, jAEQbTJ, i3, (java.lang.String) null, str7, str7, str, iValueOf, iFZBcTu, str8, iValueOf2, iFZBcTu2, (java.lang.String) null, jDjBIcL, i4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, "2", (java.lang.String) null, (java.lang.String) null, str9, (java.lang.String) null, str10, str11, str12, (java.lang.Integer) null, i6 == 1, i6 == 1 && ((i2 = this.fARcdN) == 0 || i2 == 1), i6 == 1 && ((i = this.fARcdN) == 0 || i == 1), i6 == 1 && this.fARcdN == 2, (java.lang.String) null, (UTXOSpeedUpInfoJsonBean) null, strConvertToBigIntegerString$default, false, (java.lang.String) null, str6, i5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, this.fetchVPNInfo, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, 769917444, 520087234, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TxIdOrHashHistoryDetail convertToTxIdOrHashHistoryDetail$default(C10746buK c10746buK, ContractAddressResp contractAddressResp, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contractAddressResp = null;
        }
        return c10746buK.OLrzqt(contractAddressResp);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TxIdOrHashHistoryDetail OLrzqt(ContractAddressResp contractAddressResp) {
        java.util.List listEZpvd;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        TxContractInfo txContractInfo;
        TxContractInfo txContractInfo2;
        TxAssetChangeBean txAssetChangeBean;
        java.lang.String strOLrzqt;
        java.lang.String symbol;
        java.lang.String str4;
        CustomChainMeta customChainMetaOLrzqt;
        int i;
        int i2;
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        CustomChainCoinMeta customChainCoinMetaEZpvd2;
        CustomChainCoinMeta customChainCoinMetaEZpvd3;
        C10854bwM c10854bwMAEQbTJ;
        CustomChainMeta customChainMetaOLrzqt2;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(this.AEQbTJ);
        int i3 = this.hDKMBd;
        if (i3 == 1) {
            listEZpvd = C56402yEa.EZpvd(new TxAssetChangeBean(C54870xYj.AEQbTJ(this.copydefault, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.isConnected() : 4), "1", customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.ejfBZ() : null, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.fetchVPNInfo() : null, (java.lang.String) null, (java.lang.String) null, customChainCoinMetaOLrzqt != null ? java.lang.Integer.valueOf(customChainCoinMetaOLrzqt.isConnected()) : null, (java.lang.Integer) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, 32688, (DefaultConstructorMarker) null));
        } else if (i3 == 2) {
            listEZpvd = C56402yEa.EZpvd(new TxAssetChangeBean(C54870xYj.AEQbTJ(this.copydefault, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.isConnected() : 4), "2", customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.ejfBZ() : null, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.fetchVPNInfo() : null, (java.lang.String) null, (java.lang.String) null, customChainCoinMetaOLrzqt != null ? java.lang.Integer.valueOf(customChainCoinMetaOLrzqt.isConnected()) : null, (java.lang.Integer) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, 32688, (DefaultConstructorMarker) null));
        } else {
            listEZpvd = yDY.AhwBna();
        }
        java.lang.String strAEQbTJ = (customChainCoinMetaOLrzqt == null || (customChainMetaOLrzqt2 = customChainCoinMetaOLrzqt.OLrzqt()) == null) ? null : customChainMetaOLrzqt2.AEQbTJ();
        java.lang.String str5 = this.ejfBZ;
        long j = this.AEQbTJ;
        java.lang.String str6 = this.fJNWhG;
        java.lang.String str7 = this.copydefault;
        long jDjBIcL = djBIcL();
        int i4 = this.fIwbmz;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(this.AhwBna, this.gEmmrt), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String str8 = this.djBIcL;
        java.util.List listEZpvd2 = C56402yEa.EZpvd(new Address(this.valueOf, (java.lang.String) null, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        java.util.List listEZpvd3 = C56402yEa.EZpvd(new Address(this.AuCTel, (java.lang.String) null, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        java.util.List listAhwBna = this.hDKMBd == 1 ? listEZpvd : yDY.AhwBna();
        int i5 = this.hDKMBd;
        if (i5 != 2 && i5 != 3) {
            listEZpvd = yDY.AhwBna();
        } else if (i5 == 3) {
            listEZpvd = C56402yEa.EZpvd(new TxAssetChangeBean(C54870xYj.AEQbTJ(this.copydefault, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.isConnected() : 4), "2", customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.ejfBZ() : null, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.fetchVPNInfo() : null, (java.lang.String) null, (java.lang.String) null, customChainCoinMetaOLrzqt != null ? java.lang.Integer.valueOf(customChainCoinMetaOLrzqt.isConnected()) : null, (java.lang.Integer) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, 32688, (DefaultConstructorMarker) null));
        }
        java.util.List list = listEZpvd;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
            str = strAEQbTJ + "/tx/" + this.fJNWhG;
        } else {
            str = "";
        }
        int i6 = this.hDKMBd;
        java.lang.String str9 = this.isConnected;
        java.lang.String str10 = this.AhwBna;
        java.lang.String str11 = this.gEmmrt;
        long jAEQbTJ = (customChainCoinMetaOLrzqt == null || (c10854bwMAEQbTJ = customChainCoinMetaOLrzqt.AEQbTJ()) == null) ? 0L : c10854bwMAEQbTJ.AEQbTJ();
        java.lang.String strEjfBZ = (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd3 = customChainCoinMetaOLrzqt.EZpvd()) == null) ? null : customChainCoinMetaEZpvd3.ejfBZ();
        java.lang.String str12 = strEjfBZ == null ? "" : strEjfBZ;
        java.lang.String strEjfBZ2 = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.ejfBZ() : null;
        java.lang.String str13 = strEjfBZ2 == null ? "" : strEjfBZ2;
        int iIsConnected = (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd2 = customChainCoinMetaOLrzqt.EZpvd()) == null) ? 4 : customChainCoinMetaEZpvd2.isConnected();
        int iIsConnected2 = (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt.EZpvd()) == null) ? 4 : customChainCoinMetaEZpvd.isConnected();
        int i7 = this.fIwbmz;
        boolean z = i7 == 1;
        boolean z2 = i7 == 1 && ((i2 = this.fARcdN) == 0 || i2 == 1);
        boolean z3 = i7 == 1 && ((i = this.fARcdN) == 0 || i == 1);
        boolean z4 = i7 == 1 && this.fARcdN == 2;
        int i8 = this.fARcdN;
        int i9 = this.hDKMBd;
        if (i9 == 3) {
            str2 = str8;
            str3 = str11;
            txContractInfo = new TxContractInfo(customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.fetchVPNInfo() : null, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.djBIcL() : null, customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.ejfBZ() : null);
        } else {
            if (i9 != 4) {
                str2 = str8;
                str3 = str11;
                txContractInfo2 = null;
                if (this.hDKMBd != 4) {
                    java.lang.String symbol2 = contractAddressResp != null ? contractAddressResp.getSymbol() : null;
                    java.lang.String strSubstring = this.DbNXlk.substring(r1.length() - 64);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    java.lang.String strOLrzqt2 = C33491mxU.OLrzqt(strSubstring);
                    java.lang.String contractAddress = contractAddressResp != null ? contractAddressResp.getContractAddress() : null;
                    java.lang.String logo = contractAddressResp != null ? contractAddressResp.getLogo() : null;
                    if (logo == null || logo.length() == 0) {
                        java.lang.String strGEmmrt = C33129mqd.gEmmrt((contractAddressResp == null || (symbol = contractAddressResp.getSymbol()) == null) ? null : C59454zhO.wlaJM(symbol));
                        if (strGEmmrt != null) {
                            strOLrzqt = C9700baY.OLrzqt(strGEmmrt);
                            str4 = strOLrzqt;
                        }
                        str4 = null;
                    } else {
                        if (contractAddressResp != null) {
                            strOLrzqt = contractAddressResp.getLogo();
                            str4 = strOLrzqt;
                        }
                        str4 = null;
                    }
                    txAssetChangeBean = new TxAssetChangeBean(strOLrzqt2, "1", symbol2, str4, contractAddress, (java.lang.String) null, contractAddressResp != null ? java.lang.Integer.valueOf(contractAddressResp.getPrecision()) : null, contractAddressResp != null ? java.lang.Integer.valueOf(contractAddressResp.getPrecision()) : null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, 32544, (DefaultConstructorMarker) null);
                } else {
                    txAssetChangeBean = null;
                }
                return new TxIdOrHashHistoryDetail(str5, str6, (java.lang.String) null, (java.lang.String) null, j, jAEQbTJ, str7, (java.lang.String) null, str13, 0, 0, str12, iIsConnected2, iIsConnected, jDjBIcL, i4, (java.lang.String) null, (java.lang.String) null, listEZpvd2, listEZpvd3, strConvertToBigIntegerString$default, (java.lang.String) null, str2, str, (java.lang.String) null, i6, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str10, (java.lang.String) null, str3, str9, this.DbNXlk, (java.lang.Integer) null, z, z2, z3, z4, false, false, (java.lang.String) null, (UTXOSpeedUpInfoJsonBean) null, (java.lang.String) null, listAhwBna, list, (java.util.List) null, txContractInfo2, (RegisterInfo) null, java.lang.Integer.valueOf(i8), txAssetChangeBean, (java.util.List) null, (InvestTxData) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, true, (java.lang.String) null, (java.lang.Boolean) null, -1121778036, -876792, 458751, (DefaultConstructorMarker) null);
            }
            str2 = str8;
            str3 = str11;
            txContractInfo = new TxContractInfo(contractAddressResp != null ? contractAddressResp.getLogo() : null, C12801cto.EZpvd.KWHzl(this.DbNXlk, C33129mqd.AYXKKw(java.lang.Long.valueOf(-((customChainCoinMetaOLrzqt == null || (customChainMetaOLrzqt = customChainCoinMetaOLrzqt.OLrzqt()) == null) ? -1L : customChainMetaOLrzqt.EZpvd())))), (java.lang.String) null, 4, (DefaultConstructorMarker) null);
        }
        txContractInfo2 = txContractInfo;
        if (this.hDKMBd != 4) {
        }
        return new TxIdOrHashHistoryDetail(str5, str6, (java.lang.String) null, (java.lang.String) null, j, jAEQbTJ, str7, (java.lang.String) null, str13, 0, 0, str12, iIsConnected2, iIsConnected, jDjBIcL, i4, (java.lang.String) null, (java.lang.String) null, listEZpvd2, listEZpvd3, strConvertToBigIntegerString$default, (java.lang.String) null, str2, str, (java.lang.String) null, i6, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str10, (java.lang.String) null, str3, str9, this.DbNXlk, (java.lang.Integer) null, z, z2, z3, z4, false, false, (java.lang.String) null, (UTXOSpeedUpInfoJsonBean) null, (java.lang.String) null, listAhwBna, list, (java.util.List) null, txContractInfo2, (RegisterInfo) null, java.lang.Integer.valueOf(i8), txAssetChangeBean, (java.util.List) null, (InvestTxData) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, true, (java.lang.String) null, (java.lang.Boolean) null, -1121778036, -876792, 458751, (DefaultConstructorMarker) null);
    }

    public final CustomChainTransactionEntity OLrzqt() {
        return new CustomChainTransactionEntity(this.iwGUEr, this.AEQbTJ, this.fJNWhG, this.ejfBZ, this.AkhnZx, null, this.EZpvd, this.hDKMBd, this.fARcdN, this.fIwbmz, this.valueOf, this.AuCTel, C33129mqd.valueOf(this.isConnected), this.AhwBna, this.gEmmrt, this.copydefault, this.DbNXlk, this.values, this.djBIcL, this.AYXKKw, this.OLrzqt, 32, null);
    }

    /* JADX INFO: renamed from: o.buK$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.buK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C10746buK AEQbTJ(@NotNull CustomChainTransactionEntity customChainTransactionEntity) {
            Intrinsics.checkNotNullParameter(customChainTransactionEntity, "");
            return new C10746buK(customChainTransactionEntity.getWalletId(), customChainTransactionEntity.getCoinId(), customChainTransactionEntity.getTxHash(), customChainTransactionEntity.getTxId(), customChainTransactionEntity.getOriginTxHash(), customChainTransactionEntity.getChainId(), customChainTransactionEntity.getTxType(), customChainTransactionEntity.getRepeatTxType(), customChainTransactionEntity.getTxStatus(), customChainTransactionEntity.getFromAddress(), customChainTransactionEntity.getToAddress(), C33129mqd.gEmmrt(java.lang.Long.valueOf(customChainTransactionEntity.getNonce())), customChainTransactionEntity.getGasPrice(), customChainTransactionEntity.getGasLimit(), customChainTransactionEntity.getCoinAmount(), customChainTransactionEntity.getInputData(), customChainTransactionEntity.getRawTx(), customChainTransactionEntity.getFailReason(), customChainTransactionEntity.getCreateAt(), customChainTransactionEntity.getConfirmAt(), null, 1048576, null);
        }
    }
}
