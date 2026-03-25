package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cSX {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.Integer AuCTel;
    public java.lang.Integer AuCTelauCTel;
    public java.lang.String AubY;
    public java.lang.Long DbNXlk;
    public int EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public long copydefault;
    public java.lang.String djBIcL;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.Long fIwbmz;
    public java.lang.Integer fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String getFieldNames;
    public java.lang.String getNewProxyInstance;
    public java.lang.String hDKMBd;
    public java.lang.String isConnected;
    public java.lang.String iwGUEr;
    public int uzCIH;
    public java.lang.String valueOf;
    public java.lang.String values;
    public java.lang.String wlaJM;
    public java.lang.String zLjUOn;
    public java.lang.Integer zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public cSX() {
        this(null, null, null, null, 0, 0L, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTelauCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AubY() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cSX KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, int i, long j, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num2, java.lang.Long l, java.lang.String str8, int i2, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.Integer num3, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.Integer num4, java.lang.Long l2, int i3, java.lang.String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new cSX(str, str2, str3, num, i, j, str4, str5, str6, str7, num2, l, str8, i2, str9, str10, str11, num3, str12, str13, str14, str15, str16, str17, str18, str19, num4, l2, i3, str20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.uzCIH = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cSX)) {
            return false;
        }
        cSX csx = (cSX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) csx.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) csx.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) csx.iwGUEr) && Intrinsics.EZpvd(this.AuCTelauCTel, csx.AuCTelauCTel) && this.uzCIH == csx.uzCIH && this.copydefault == csx.copydefault && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) csx.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) csx.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) csx.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) csx.ejfBZ) && Intrinsics.EZpvd(this.AuCTel, csx.AuCTel) && Intrinsics.EZpvd(this.DbNXlk, csx.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) csx.fetchVPNInfo) && this.EZpvd == csx.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) csx.getFieldNames) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) csx.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.zLjUOn, (java.lang.Object) csx.zLjUOn) && Intrinsics.EZpvd(this.zsXlph, csx.zsXlph) && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) csx.AubY) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) csx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) csx.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) csx.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) csx.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) csx.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) csx.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) csx.gEmmrt) && Intrinsics.EZpvd(this.fJNWhG, csx.fJNWhG) && Intrinsics.EZpvd(this.fIwbmz, csx.fIwbmz) && this.OLrzqt == csx.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) csx.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.getNewProxyInstance.hashCode();
        java.lang.String str = this.wlaJM;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.iwGUEr.hashCode();
        java.lang.Integer num = this.AuCTelauCTel;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.uzCIH);
        int iHashCode6 = java.lang.Long.hashCode(this.copydefault);
        java.lang.String str2 = this.fARcdN;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AkhnZx;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.isConnected;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.ejfBZ;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        java.lang.Integer num2 = this.AuCTel;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        java.lang.Long l = this.DbNXlk;
        int iHashCode12 = l == null ? 0 : l.hashCode();
        java.lang.String str6 = this.fetchVPNInfo;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        int iHashCode14 = java.lang.Integer.hashCode(this.EZpvd);
        java.lang.String str7 = this.getFieldNames;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.hDKMBd;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.zLjUOn;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        java.lang.Integer num3 = this.zsXlph;
        int iHashCode18 = num3 == null ? 0 : num3.hashCode();
        java.lang.String str10 = this.AubY;
        int iHashCode19 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.KWHzl;
        int iHashCode20 = str11 == null ? 0 : str11.hashCode();
        java.lang.String str12 = this.AYXKKw;
        int iHashCode21 = str12 == null ? 0 : str12.hashCode();
        java.lang.String str13 = this.values;
        int iHashCode22 = str13 == null ? 0 : str13.hashCode();
        java.lang.String str14 = this.djBIcL;
        int iHashCode23 = str14 == null ? 0 : str14.hashCode();
        java.lang.String str15 = this.valueOf;
        int iHashCode24 = str15 == null ? 0 : str15.hashCode();
        java.lang.String str16 = this.AhwBna;
        int iHashCode25 = str16 == null ? 0 : str16.hashCode();
        java.lang.String str17 = this.gEmmrt;
        int iHashCode26 = str17 == null ? 0 : str17.hashCode();
        java.lang.Integer num4 = this.fJNWhG;
        int iHashCode27 = num4 == null ? 0 : num4.hashCode();
        java.lang.Long l2 = this.fIwbmz;
        int iHashCode28 = l2 == null ? 0 : l2.hashCode();
        int iHashCode29 = java.lang.Integer.hashCode(this.OLrzqt);
        java.lang.String str18 = this.AEQbTJ;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + (str18 == null ? 0 : str18.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long iwGUEr() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RootWalletView(rootWalletId=" + this.getNewProxyInstance + ", walletIds=" + this.wlaJM + ", name=" + this.iwGUEr + ", type=" + this.AuCTelauCTel + ", sortIndex=" + this.uzCIH + ", createAt=" + this.copydefault + ", hardwareUniqueId=" + this.fARcdN + ", hardwarePassphraseId=" + this.AkhnZx + ", hardwareName=" + this.isConnected + ", hardwareSystem=" + this.ejfBZ + ", hardwareType=" + this.AuCTel + ", hardwareCreateAt=" + this.DbNXlk + ", hardwareData=" + this.fetchVPNInfo + ", createIndex=" + this.EZpvd + ", mpcRootWalletId=" + this.getFieldNames + ", mpcId=" + this.hDKMBd + ", uid=" + this.zLjUOn + ", status=" + this.zsXlph + ", version=" + this.AubY + ", accountName=" + this.KWHzl + ", displayAccountName=" + this.AYXKKw + ", encryptShareKey=" + this.values + ", ecdsaPubkey=" + this.djBIcL + ", ecdsaChainCode=" + this.valueOf + ", ed25519Pubkey=" + this.AhwBna + ", ed25519ChainCode=" + this.gEmmrt + ", isEscape=" + this.fJNWhG + ", mpcCreateAt=" + this.fIwbmz + ", createType=" + this.OLrzqt + ", copiedEscapeListString=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zLjUOn() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer zsXlph() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer zuBGHE() {
        return this.fJNWhG;
    }

    public cSX(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, int i, long j, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num2, java.lang.Long l, java.lang.String str8, int i2, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.Integer num3, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.Integer num4, java.lang.Long l2, int i3, java.lang.String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getNewProxyInstance = str;
        this.wlaJM = str2;
        this.iwGUEr = str3;
        this.AuCTelauCTel = num;
        this.uzCIH = i;
        this.copydefault = j;
        this.fARcdN = str4;
        this.AkhnZx = str5;
        this.isConnected = str6;
        this.ejfBZ = str7;
        this.AuCTel = num2;
        this.DbNXlk = l;
        this.fetchVPNInfo = str8;
        this.EZpvd = i2;
        this.getFieldNames = str9;
        this.hDKMBd = str10;
        this.zLjUOn = str11;
        this.zsXlph = num3;
        this.AubY = str12;
        this.KWHzl = str13;
        this.AYXKKw = str14;
        this.values = str15;
        this.djBIcL = str16;
        this.valueOf = str17;
        this.AhwBna = str18;
        this.gEmmrt = str19;
        this.fJNWhG = num4;
        this.fIwbmz = l2;
        this.OLrzqt = i3;
        this.AEQbTJ = str20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0179: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r38v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0058: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0060: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r45v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:int:0x0078: TERNARY null = ((wrap:int:0x0070: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r47v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009b: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a5: INVOKE 
  (wrap:int:0x00a1: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.mpc.MpcShare2Status:0x009f: SGET  A[WRAPPED] (LINE:60) com.okinc.business.defi.biz.core.mpc.MpcShare2Status.SHARE2_INVALID com.okinc.business.defi.biz.core.mpc.MpcShare2Status)
 VIRTUAL call: com.okinc.business.defi.biz.core.mpc.MpcShare2Status.getValue():int A[MD:():int (m), WRAPPED] (LINE:60))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:60)) : (r51v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("0") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0106: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r60v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0115: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r61v0 java.lang.Long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0124: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x012a: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType:0x0128: SGET  A[WRAPPED] (LINE:71) com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.LOCAL_CREATE com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType)
 VIRTUAL call: com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.getValue():int A[MD:():int (m), WRAPPED] (LINE:71)) : (r62v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0133: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, int, java.lang.String):void (m)] (LINE:42) call: o.cSX.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, int, java.lang.String):void type: THIS */
    public /* synthetic */ cSX(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, long j, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num2, java.lang.Long l, java.lang.String str8, int i2, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.Integer num3, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.Integer num4, java.lang.Long l2, int i3, java.lang.String str20, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) == 0 ? str3 : "", (i4 & 8) != 0 ? 0 : num, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? null : str4, (i4 & 128) != 0 ? null : str5, (i4 & 256) != 0 ? null : str6, (i4 & 512) != 0 ? null : str7, (i4 & 1024) != 0 ? null : num2, (i4 & 2048) != 0 ? null : l, (i4 & 4096) != 0 ? null : str8, (i4 & 8192) != 0 ? -1 : i2, (i4 & 16384) != 0 ? null : str9, (i4 & 32768) != 0 ? null : str10, (i4 & 65536) != 0 ? null : str11, (i4 & 131072) != 0 ? java.lang.Integer.valueOf(MpcShare2Status.SHARE2_INVALID.getValue()) : num3, (i4 & 262144) != 0 ? "0" : str12, (i4 & 524288) != 0 ? null : str13, (i4 & 1048576) != 0 ? null : str14, (i4 & 2097152) != 0 ? null : str15, (i4 & 4194304) != 0 ? null : str16, (i4 & 8388608) != 0 ? null : str17, (i4 & 16777216) != 0 ? null : str18, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str19, (i4 & 67108864) != 0 ? 0 : num4, (i4 & 134217728) != 0 ? 0L : l2, (i4 & 268435456) != 0 ? MpcWalletCreateType.LOCAL_CREATE.getValue() : i3, (i4 & 536870912) != 0 ? null : str20);
    }

    public final RootWalletEntity EZpvd() {
        return new RootWalletEntity(this.getNewProxyInstance, this.iwGUEr, this.uzCIH, this.copydefault, this.EZpvd);
    }

    public final C12786ctZ copydefault() {
        java.lang.String str = this.getNewProxyInstance;
        java.lang.String str2 = this.iwGUEr;
        WalletType.Application application = WalletType.Companion;
        java.lang.Integer num = this.AuCTelauCTel;
        return new C12786ctZ(str, str2, application.KWHzl(num != null ? num.intValue() : -1), this.copydefault, this.uzCIH, this.EZpvd);
    }
}
