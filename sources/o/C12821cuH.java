package o;

import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cuH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12821cuH {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public java.lang.Long AEQbTJ;
    public long AYXKKw;
    public java.util.ArrayList<CustomChainAddressEntity> AhwBna;
    public final WalletType AkhnZx;
    public java.lang.String AuCTel;
    public WalletType AuCTelauCTel;
    public java.lang.String AubY;
    public final C13854daT DbNXlk;
    public int EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.String ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public java.lang.String fJNWhG;
    public EOSInfoEntity fetchVPNInfo;
    public final java.util.ArrayList<C11283cIm> gEmmrt;
    public final MPCWalletEntity getFieldNames;
    public java.util.ArrayList<ChainAddressSegWitEntity> getNewProxyInstance;
    public java.lang.String hDKMBd;
    public java.util.ArrayList<C10854bwM> isConnected;
    public java.lang.String iwGUEr;
    public C12786ctZ uzCIH;
    public java.util.ArrayList<ChainAddressEntity> valueOf;
    public boolean values;
    public java.lang.String wlaJM;
    public WalletSyncStatus zLjUOn;
    public java.util.ArrayList<SepInfoEntity> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<CustomChainAddressEntity> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12821cuH AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WalletType walletType, @NotNull WalletSyncStatus walletSyncStatus, java.lang.Long l, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, @NotNull java.util.ArrayList<C10854bwM> arrayList, EOSInfoEntity eOSInfoEntity, java.util.ArrayList<SepInfoEntity> arrayList2, @NotNull java.util.ArrayList<ChainAddressEntity> arrayList3, @NotNull java.util.ArrayList<CustomChainAddressEntity> arrayList4, @NotNull java.util.ArrayList<ChainAddressSegWitEntity> arrayList5, MPCWalletEntity mPCWalletEntity, C13854daT c13854daT, @NotNull java.util.ArrayList<C11283cIm> arrayList6, @NotNull WalletType walletType2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(walletSyncStatus, "");
        Intrinsics.checkNotNullParameter(c12786ctZ, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(arrayList4, "");
        Intrinsics.checkNotNullParameter(arrayList5, "");
        Intrinsics.checkNotNullParameter(arrayList6, "");
        Intrinsics.checkNotNullParameter(walletType2, "");
        return new C12821cuH(str, str2, walletType, walletSyncStatus, l, i, c12786ctZ, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, z5, j, arrayList, eOSInfoEntity, arrayList2, arrayList3, arrayList4, arrayList5, mPCWalletEntity, c13854daT, arrayList6, walletType2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(EOSInfoEntity eOSInfoEntity) {
        this.fetchVPNInfo = eOSInfoEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<ChainAddressEntity> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<ChainAddressSegWitEntity> AuCTel() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C11283cIm> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wlaJM = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EOSInfoEntity djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12821cuH)) {
            return false;
        }
        C12821cuH c12821cuH = (C12821cuH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c12821cuH.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) c12821cuH.hDKMBd) && this.AuCTelauCTel == c12821cuH.AuCTelauCTel && this.zLjUOn == c12821cuH.zLjUOn && Intrinsics.EZpvd(this.AEQbTJ, c12821cuH.AEQbTJ) && this.EZpvd == c12821cuH.EZpvd && Intrinsics.EZpvd(this.uzCIH, c12821cuH.uzCIH) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c12821cuH.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c12821cuH.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) c12821cuH.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c12821cuH.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) c12821cuH.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) c12821cuH.AubY) && this.values == c12821cuH.values && this.OLrzqt == c12821cuH.OLrzqt && this.KWHzl == c12821cuH.KWHzl && this.fARcdN == c12821cuH.fARcdN && this.fIwbmz == c12821cuH.fIwbmz && this.AYXKKw == c12821cuH.AYXKKw && Intrinsics.EZpvd(this.isConnected, c12821cuH.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, c12821cuH.fetchVPNInfo) && Intrinsics.EZpvd(this.zsXlph, c12821cuH.zsXlph) && Intrinsics.EZpvd(this.valueOf, c12821cuH.valueOf) && Intrinsics.EZpvd(this.AhwBna, c12821cuH.AhwBna) && Intrinsics.EZpvd(this.getNewProxyInstance, c12821cuH.getNewProxyInstance) && Intrinsics.EZpvd(this.getFieldNames, c12821cuH.getFieldNames) && Intrinsics.EZpvd(this.DbNXlk, c12821cuH.DbNXlk) && Intrinsics.EZpvd(this.gEmmrt, c12821cuH.gEmmrt) && this.AkhnZx == c12821cuH.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType fARcdN() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12786ctZ fIwbmz() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SepInfoEntity> fJNWhG() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13854daT gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fJNWhG.hashCode();
        int iHashCode2 = this.hDKMBd.hashCode();
        int iHashCode3 = this.AuCTelauCTel.hashCode();
        int iHashCode4 = this.zLjUOn.hashCode();
        java.lang.Long l = this.AEQbTJ;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode7 = this.uzCIH.hashCode();
        int iHashCode8 = this.djBIcL.hashCode();
        java.lang.String str = this.ejfBZ;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.iwGUEr;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        int iHashCode11 = this.AuCTel.hashCode();
        int iHashCode12 = this.wlaJM.hashCode();
        int iHashCode13 = this.AubY.hashCode();
        int iHashCode14 = java.lang.Boolean.hashCode(this.values);
        int iHashCode15 = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode16 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode17 = java.lang.Boolean.hashCode(this.fARcdN);
        int iHashCode18 = java.lang.Boolean.hashCode(this.fIwbmz);
        int iHashCode19 = java.lang.Long.hashCode(this.AYXKKw);
        int iHashCode20 = this.isConnected.hashCode();
        EOSInfoEntity eOSInfoEntity = this.fetchVPNInfo;
        int iHashCode21 = eOSInfoEntity == null ? 0 : eOSInfoEntity.hashCode();
        java.util.ArrayList<SepInfoEntity> arrayList = this.zsXlph;
        int iHashCode22 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode23 = this.valueOf.hashCode();
        int iHashCode24 = this.AhwBna.hashCode();
        int iHashCode25 = this.getNewProxyInstance.hashCode();
        MPCWalletEntity mPCWalletEntity = this.getFieldNames;
        int iHashCode26 = mPCWalletEntity == null ? 0 : mPCWalletEntity.hashCode();
        C13854daT c13854daT = this.DbNXlk;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (c13854daT == null ? 0 : c13854daT.hashCode())) * 31) + this.gEmmrt.hashCode()) * 31) + this.AkhnZx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPCWalletEntity isConnected() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletEntityBean(id=" + this.fJNWhG + ", name=" + this.hDKMBd + ", type=" + this.AuCTelauCTel + ", syncStatus=" + this.zLjUOn + ", chainId=" + this.AEQbTJ + ", addressIndex=" + this.EZpvd + ", rootWallet=" + this.uzCIH + ", data=" + this.djBIcL + ", mnemonic=" + this.ejfBZ + ", privateKey=" + this.iwGUEr + ", mnemonicLanguage=" + this.AuCTel + ", xpub=" + this.wlaJM + ", xpriv=" + this.AubY + ", fromCreate=" + this.values + ", backup=" + this.OLrzqt + ", cloudBackup=" + this.KWHzl + ", iHuaweiBackup=" + this.fARcdN + ", isSegWit=" + this.fIwbmz + ", createAt=" + this.AYXKKw + ", defaultCoins=" + this.isConnected + ", eosInfo=" + this.fetchVPNInfo + ", sepInfoList=" + this.zsXlph + ", defaultAddressList=" + this.valueOf + ", customAddressList=" + this.AhwBna + ", segwitAddressList=" + this.getNewProxyInstance + ", mpcShareEntity=" + this.getFieldNames + ", hardwareInfo=" + this.DbNXlk + ", createSignChainList=" + this.gEmmrt + ", eoaWalletType=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C10854bwM> valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.hDKMBd;
    }

    public C12821cuH(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WalletType walletType, @NotNull WalletSyncStatus walletSyncStatus, java.lang.Long l, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, @NotNull java.util.ArrayList<C10854bwM> arrayList, EOSInfoEntity eOSInfoEntity, java.util.ArrayList<SepInfoEntity> arrayList2, @NotNull java.util.ArrayList<ChainAddressEntity> arrayList3, @NotNull java.util.ArrayList<CustomChainAddressEntity> arrayList4, @NotNull java.util.ArrayList<ChainAddressSegWitEntity> arrayList5, MPCWalletEntity mPCWalletEntity, C13854daT c13854daT, @NotNull java.util.ArrayList<C11283cIm> arrayList6, @NotNull WalletType walletType2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(walletSyncStatus, "");
        Intrinsics.checkNotNullParameter(c12786ctZ, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(arrayList4, "");
        Intrinsics.checkNotNullParameter(arrayList5, "");
        Intrinsics.checkNotNullParameter(arrayList6, "");
        Intrinsics.checkNotNullParameter(walletType2, "");
        this.fJNWhG = str;
        this.hDKMBd = str2;
        this.AuCTelauCTel = walletType;
        this.zLjUOn = walletSyncStatus;
        this.AEQbTJ = l;
        this.EZpvd = i;
        this.uzCIH = c12786ctZ;
        this.djBIcL = str3;
        this.ejfBZ = str4;
        this.iwGUEr = str5;
        this.AuCTel = str6;
        this.wlaJM = str7;
        this.AubY = str8;
        this.values = z;
        this.OLrzqt = z2;
        this.KWHzl = z3;
        this.fARcdN = z4;
        this.fIwbmz = z5;
        this.AYXKKw = j;
        this.isConnected = arrayList;
        this.fetchVPNInfo = eOSInfoEntity;
        this.zsXlph = arrayList2;
        this.valueOf = arrayList3;
        this.AhwBna = arrayList4;
        this.getNewProxyInstance = arrayList5;
        this.getFieldNames = mPCWalletEntity;
        this.DbNXlk = c13854daT;
        this.gEmmrt = arrayList6;
        this.AkhnZx = walletType2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: INVOKE 
  (wrap:java.util.UUID:0x0006: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:32))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:32)) : (r34v0 java.lang.String))
  (r35v0 java.lang.String)
  (r36v0 com.okinc.business.defi.biz.constant.WalletType)
  (r37v0 com.okinc.business.defi.biz.constant.WalletSyncStatus)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r38v0 java.lang.Long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (r40v0 o.ctZ)
  (r41v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 boolean)
  (r48v0 boolean)
  (r49v0 boolean)
  (r50v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (131072 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004a: ARITH (262144 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:50)) : (r52v0 long))
  (r54v0 java.util.ArrayList)
  (wrap:com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity:?: TERNARY null = ((wrap:int:0x0058: ARITH (1048576 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity) : (r55v0 com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0062: ARITH (2097152 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r56v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x006c: ARITH (4194304 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:54) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r57v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x007b: ARITH (8388608 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0083: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:55) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r58v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x008a: ARITH (16777216 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0092: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:56) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r59v0 java.util.ArrayList))
  (wrap:com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity:?: TERNARY null = ((wrap:int:0x0099: ARITH (33554432 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity) : (r60v0 com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity))
  (wrap:o.daT:?: TERNARY null = ((wrap:int:0x00a3: ARITH (67108864 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null o.daT) : (r61v0 o.daT))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x00ad: ARITH (134217728 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b5: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:59) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r62v0 java.util.ArrayList))
  (wrap:com.okinc.business.defi.biz.constant.WalletType:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c1: SGET  A[WRAPPED] (LINE:60) com.okinc.business.defi.biz.constant.WalletType.AAWallet com.okinc.business.defi.biz.constant.WalletType) : (r63v0 com.okinc.business.defi.biz.constant.WalletType))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.biz.constant.WalletType, com.okinc.business.defi.biz.constant.WalletSyncStatus, java.lang.Long, int, o.ctZ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, long, java.util.ArrayList<o.bwM>, com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity, java.util.ArrayList<com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity>, java.util.ArrayList<com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity>, java.util.ArrayList<com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity>, java.util.ArrayList<com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity>, com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity, o.daT, java.util.ArrayList<o.cIm>, com.okinc.business.defi.biz.constant.WalletType):void (m)] (LINE:31) call: o.cuH.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.constant.WalletType, com.okinc.business.defi.biz.constant.WalletSyncStatus, java.lang.Long, int, o.ctZ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, long, java.util.ArrayList, com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity, o.daT, java.util.ArrayList, com.okinc.business.defi.biz.constant.WalletType):void type: THIS */
    public /* synthetic */ C12821cuH(java.lang.String str, java.lang.String str2, WalletType walletType, WalletSyncStatus walletSyncStatus, java.lang.Long l, int i, C12786ctZ c12786ctZ, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, java.util.ArrayList arrayList, EOSInfoEntity eOSInfoEntity, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5, MPCWalletEntity mPCWalletEntity, C13854daT c13854daT, java.util.ArrayList arrayList6, WalletType walletType2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, walletType, walletSyncStatus, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? 0 : i, c12786ctZ, str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? "" : str6, str7, str8, z, z2, z3, z4, (131072 & i2) != 0 ? false : z5, (262144 & i2) != 0 ? java.lang.System.currentTimeMillis() : j, arrayList, (1048576 & i2) != 0 ? null : eOSInfoEntity, (2097152 & i2) != 0 ? null : arrayList2, (4194304 & i2) != 0 ? new java.util.ArrayList() : arrayList3, (8388608 & i2) != 0 ? new java.util.ArrayList() : arrayList4, (16777216 & i2) != 0 ? new java.util.ArrayList() : arrayList5, (33554432 & i2) != 0 ? null : mPCWalletEntity, (67108864 & i2) != 0 ? null : c13854daT, (134217728 & i2) != 0 ? new java.util.ArrayList() : arrayList6, (i2 & 268435456) != 0 ? WalletType.AAWallet : walletType2);
    }

    /* JADX INFO: renamed from: o.cuH$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cuH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C12821cuH copydefault(@NotNull java.lang.String str, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, boolean z2, boolean z3, boolean z4) {
            int iOrdinal;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            C12821cuH c12821cuH = new C12821cuH(null, str, WalletType.HDWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, str3, null, str4, str5, str6, z, z2, z3, z4, false, 0L, C10954byG.EZpvd.valueOf().AYXKKw(), null, null, null, null, null, null, null, null, null, 536216081, null);
            EOSInfoEntity eOSInfoEntity = new EOSInfoEntity(null, null, 0, null, null, null, 0, 127, null);
            eOSInfoEntity.setWalletId(c12821cuH.AhwBna());
            if (z) {
                iOrdinal = EOSState.Unopened.ordinal();
            } else {
                iOrdinal = EOSState.Unknown.ordinal();
            }
            eOSInfoEntity.setState(iOrdinal);
            c12821cuH.AEQbTJ(eOSInfoEntity);
            return c12821cuH;
        }

        public final C12821cuH KWHzl(@NotNull java.lang.String str, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull WalletType walletType, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(walletType, "");
            return new C12821cuH(null, str, WalletType.AAWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, str3, null, str4, str5, str6, z, z2, z3, z4, false, 0L, C10954byG.EZpvd.valueOf().getNewProxyInstance(), null, null, null, null, null, null, null, null, walletType, 267780625, null);
        }

        public final C12821cuH EZpvd(@NotNull java.lang.String str, @NotNull C12786ctZ c12786ctZ, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, @NotNull MPCWalletEntity mPCWalletEntity) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(mPCWalletEntity, "");
            java.lang.String str5 = null;
            C12821cuH c12821cuH = new C12821cuH(null, str, WalletType.MPCWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, null, str5, str5, str3, str4, z, z2, z3, z4, false, 0L, C10954byG.EZpvd.valueOf().fIwbmz(), null, null, null, null, null, mPCWalletEntity, null, null, null, 502662929, null);
            mPCWalletEntity.setRootWalletId(c12786ctZ.AEQbTJ());
            if (z3 || z4 || z2) {
                mPCWalletEntity.setStatus(MpcShare2Status.SHARE2_VALID.getValue());
            }
            return c12821cuH;
        }

        public final C12821cuH OLrzqt(@NotNull java.lang.String str, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, @NotNull MPCWalletEntity mPCWalletEntity, @NotNull WalletType walletType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(mPCWalletEntity, "");
            Intrinsics.checkNotNullParameter(walletType, "");
            java.lang.String str5 = null;
            C12821cuH c12821cuH = new C12821cuH(null, str, WalletType.AAWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, null, str5, str5, str3, str4, z, z2, z3, z4, false, 0L, C10954byG.EZpvd.valueOf().fARcdN(), null, null, null, null, null, mPCWalletEntity, null, null, walletType, 234227473, null);
            mPCWalletEntity.setRootWalletId(c12786ctZ.AEQbTJ());
            if (z3 || z4 || z2) {
                mPCWalletEntity.setStatus(MpcShare2Status.SHARE2_VALID.getValue());
            }
            return c12821cuH;
        }

        public final C12821cuH AEQbTJ(@NotNull java.lang.String str, long j, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
            EOSInfoEntity eOSInfoEntity;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            WalletType walletType = WalletType.KeyWallet;
            WalletSyncStatus walletSyncStatus = WalletSyncStatus.NotSync;
            C10954byG c10954byG = C10954byG.EZpvd;
            java.util.List<C10854bwM> listValueOf = c10954byG.valueOf().valueOf(j);
            Intrinsics.copydefault(listValueOf, "");
            C12821cuH c12821cuH = new C12821cuH(null, str, walletType, walletSyncStatus, java.lang.Long.valueOf(j), 0, c12786ctZ, str2, null, str3, null, str4, str5, z, !z, false, false, false, 0L, (java.util.ArrayList) listValueOf, null, null, null, null, null, null, null, null, null, 536216865, null);
            C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(j);
            if (c10854bwMKWHzl == null || !c10854bwMKWHzl.OuxcSI()) {
                eOSInfoEntity = null;
            } else {
                eOSInfoEntity = new EOSInfoEntity(null, null, 0, null, null, null, 0, 127, null);
                eOSInfoEntity.setWalletId(c12821cuH.AhwBna());
                eOSInfoEntity.setState(EOSState.Unknown.ordinal());
            }
            c12821cuH.AEQbTJ(eOSInfoEntity);
            return c12821cuH;
        }

        public final C12821cuH KWHzl(@NotNull java.lang.String str, long j, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull WalletType walletType, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(walletType, "");
            WalletType walletType2 = WalletType.AAWallet;
            WalletSyncStatus walletSyncStatus = WalletSyncStatus.NotSync;
            java.util.List<C10854bwM> listAYXKKw = C10954byG.EZpvd.valueOf().AYXKKw(j);
            Intrinsics.copydefault(listAYXKKw, "");
            return new C12821cuH(null, str, walletType2, walletSyncStatus, java.lang.Long.valueOf(j), 0, c12786ctZ, str2, null, str3, null, str4, str5, z, !z, false, false, false, 0L, (java.util.ArrayList) listAYXKKw, null, null, null, null, null, null, null, null, walletType, 267781409, null);
        }

        public final C12821cuH EZpvd(@NotNull java.lang.String str, @NotNull C12786ctZ c12786ctZ, @NotNull ChainAddress chainAddress, @NotNull C13854daT c13854daT, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            Intrinsics.checkNotNullParameter(c13854daT, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            WalletType walletType = WalletType.HardwareWallet;
            WalletSyncStatus walletSyncStatus = WalletSyncStatus.NotSync;
            java.lang.String address = chainAddress.getAddress();
            java.util.List<C10854bwM> listValueOf = C10954byG.EZpvd.valueOf().valueOf(chainAddress.getCoinId());
            Intrinsics.copydefault(listValueOf, "");
            C12821cuH c12821cuH = new C12821cuH(null, str, walletType, walletSyncStatus, -1L, 0, c12786ctZ, address, null, null, null, str2, str3, z, !z, false, false, false, 0L, (java.util.ArrayList) listValueOf, null, null, null, null, null, null, c13854daT, null, null, 469108513, null);
            C13854daT c13854daTGEmmrt = c12821cuH.gEmmrt();
            if (c13854daTGEmmrt != null) {
                c13854daTGEmmrt.OLrzqt(c12786ctZ.AEQbTJ());
            }
            return c12821cuH;
        }

        public final C12821cuH EZpvd(@NotNull java.lang.String str, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.ArrayList<ChainAddressEntity> arrayList, @NotNull java.util.ArrayList<ChainAddressSegWitEntity> arrayList2, C13854daT c13854daT) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            return new C12821cuH(null, str, WalletType.HardwareWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, null, null, null, str3, str4, false, true, false, false, false, 0L, new java.util.ArrayList(), null, null, arrayList, null, arrayList2, null, c13854daT, null, null, 448136977, null);
        }

        public final C12821cuH copydefault(@NotNull java.lang.String str, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.ArrayList<ChainAddressEntity> arrayList, @NotNull java.util.ArrayList<ChainAddressSegWitEntity> arrayList2, C13854daT c13854daT) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            return new C12821cuH(null, str, WalletType.HardwareWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, null, null, null, str3, str4, false, true, false, false, false, 0L, new java.util.ArrayList(), null, null, arrayList, null, arrayList2, null, c13854daT, null, null, 448136977, null);
        }

        public final C12821cuH AEQbTJ(@NotNull java.lang.String str, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.ArrayList<ChainAddressEntity> arrayList, @NotNull java.util.ArrayList<ChainAddressSegWitEntity> arrayList2, C13854daT c13854daT) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            return new C12821cuH(null, str, WalletType.HardwareWallet, WalletSyncStatus.NotSync, null, i, c12786ctZ, str2, null, null, null, str3, str4, false, true, false, false, false, 0L, new java.util.ArrayList(), null, null, arrayList, null, arrayList2, null, c13854daT, null, null, 448136977, null);
        }

        public final C12821cuH OLrzqt(@NotNull java.lang.String str, @NotNull WalletType walletType, @NotNull C12786ctZ c12786ctZ, @NotNull ChainAddress chainAddress, @NotNull C13854daT c13854daT, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(walletType, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            Intrinsics.checkNotNullParameter(c13854daT, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            WalletType walletType2 = WalletType.AAWallet;
            WalletSyncStatus walletSyncStatus = WalletSyncStatus.NotSync;
            java.lang.String address = chainAddress.getAddress();
            java.util.List<C10854bwM> listAYXKKw = C10954byG.EZpvd.valueOf().AYXKKw(chainAddress.getCoinId());
            Intrinsics.copydefault(listAYXKKw, "");
            C12821cuH c12821cuH = new C12821cuH(null, str, walletType2, walletSyncStatus, -1L, 0, c12786ctZ, address, null, null, null, str2, str3, z, !z, false, false, false, 0L, (java.util.ArrayList) listAYXKKw, null, null, null, null, null, null, c13854daT, null, walletType, 200673057, null);
            C13854daT c13854daTGEmmrt = c12821cuH.gEmmrt();
            if (c13854daTGEmmrt != null) {
                c13854daTGEmmrt.OLrzqt(c12786ctZ.AEQbTJ());
            }
            return c12821cuH;
        }

        public final C12821cuH EZpvd(@NotNull java.lang.String str, long j, @NotNull C12786ctZ c12786ctZ, @NotNull WalletType walletType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
            java.util.List<C10854bwM> listValueOf;
            EOSInfoEntity eOSInfoEntity;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(walletType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            WalletType walletType2 = WalletType.TrackingWallet;
            WalletSyncStatus walletSyncStatus = WalletSyncStatus.NotSync;
            if (walletType == walletType2) {
                listValueOf = C10954byG.EZpvd.valueOf().AYXKKw(j);
            } else {
                listValueOf = C10954byG.EZpvd.valueOf().valueOf(j);
            }
            Intrinsics.copydefault(listValueOf, "");
            C12821cuH c12821cuH = new C12821cuH(null, str, walletType2, walletSyncStatus, java.lang.Long.valueOf(j), 0, c12786ctZ, str2, null, null, null, str3, str4, z, !z, false, false, false, 0L, (java.util.ArrayList) listValueOf, null, null, null, null, null, null, null, null, walletType, 267781921, null);
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
            if (c10854bwMKWHzl == null || !c10854bwMKWHzl.OuxcSI()) {
                eOSInfoEntity = null;
            } else {
                eOSInfoEntity = new EOSInfoEntity(null, null, 0, null, null, null, 0, 127, null);
                eOSInfoEntity.setWalletId(c12821cuH.AhwBna());
                eOSInfoEntity.setState(EOSState.Unknown.ordinal());
            }
            c12821cuH.AEQbTJ(eOSInfoEntity);
            return c12821cuH;
        }

        public final C12821cuH OLrzqt(@NotNull java.lang.String str, long j, @NotNull C10854bwM c10854bwM, int i, @NotNull C12786ctZ c12786ctZ, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(c12786ctZ, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new C12821cuH(null, str, WalletType.TonWallet, WalletSyncStatus.NotSync, java.lang.Long.valueOf(j), 0, c12786ctZ, str2, str3, null, str4, str5, str6, false, true, z, z2, false, 0L, yDY.copydefault(c10854bwM), null, null, null, null, null, null, null, null, null, 536216065, null);
        }
    }

    public static /* synthetic */ WalletEntity convertToWalletEntity$default(C12821cuH c12821cuH, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C11600cUg.OLrzqt(true);
        }
        return c12821cuH.copydefault(i, i2);
    }

    public final WalletEntity copydefault(int i, int i2) {
        java.lang.String str = this.fJNWhG;
        int iOrdinal = this.AuCTelauCTel.ordinal();
        java.lang.String str2 = this.djBIcL;
        java.lang.Long l = this.AEQbTJ;
        return new WalletEntity(str, iOrdinal, str2, l != null ? l.longValue() : -1L, this.AuCTel, this.hDKMBd, 0, C11600cUg.OLrzqt(this.OLrzqt), C11600cUg.OLrzqt(this.KWHzl), C11600cUg.OLrzqt(this.fARcdN), i2, this.wlaJM, this.AubY, C11600cUg.OLrzqt(this.fIwbmz), C11600cUg.OLrzqt(this.values), this.AYXKKw, i, this.uzCIH.AEQbTJ(), this.EZpvd, this.zLjUOn.getValue(), null, null, this.AkhnZx.ordinal(), 0, C32979mnm.EZpvd.EZpvd(), 11534400, null);
    }
}
