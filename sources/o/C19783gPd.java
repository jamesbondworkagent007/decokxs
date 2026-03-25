package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.PreCheckModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19783gPd {
    public final DexMultiTokenInfoBean AEQbTJ;
    public final int AYXKKw;
    public final java.lang.Long AhwBna;
    public final gOU AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.Throwable DbNXlk;
    public final boolean EZpvd;
    public final DefiChainInfo KWHzl;
    public final boolean OLrzqt;
    public final BusinessType copydefault;
    public final java.lang.String djBIcL;
    public final boolean ejfBZ;
    public final SlippageMode fARcdN;
    public final boolean fIwbmz;
    public final int fJNWhG;
    public final PreCheckModel fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final int getFieldNames;
    public final DexMultiTokenInfoBean getNewProxyInstance;
    public final InterfaceC19780gPa hDKMBd;
    public final java.lang.Throwable isConnected;
    public final InterfaceC9738bbJ iwGUEr;
    public final java.lang.String uzCIH;
    public final boolean valueOf;
    public final gOT values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BusinessType AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19783gPd EZpvd(PreCheckModel preCheckModel, @NotNull BusinessType businessType, @NotNull DefiChainInfo defiChainInfo, gOU gou, java.lang.Throwable th, java.lang.Throwable th2, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str4, java.lang.Long l, @NotNull InterfaceC19780gPa interfaceC19780gPa, @NotNull gOT got, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        Intrinsics.checkNotNullParameter(got, "");
        return new C19783gPd(preCheckModel, businessType, defiChainInfo, gou, th, th2, slippageMode, str, str2, str3, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, i, i2, i3, z, z2, z3, z4, z5, str4, l, interfaceC19780gPa, got, interfaceC9738bbJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode ejfBZ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19783gPd)) {
            return false;
        }
        C19783gPd c19783gPd = (C19783gPd) obj;
        return Intrinsics.EZpvd(this.fetchVPNInfo, c19783gPd.fetchVPNInfo) && this.copydefault == c19783gPd.copydefault && Intrinsics.EZpvd(this.KWHzl, c19783gPd.KWHzl) && Intrinsics.EZpvd(this.AkhnZx, c19783gPd.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, c19783gPd.DbNXlk) && Intrinsics.EZpvd(this.isConnected, c19783gPd.isConnected) && this.fARcdN == c19783gPd.fARcdN && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c19783gPd.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c19783gPd.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c19783gPd.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, c19783gPd.AEQbTJ) && Intrinsics.EZpvd(this.getNewProxyInstance, c19783gPd.getNewProxyInstance) && this.AYXKKw == c19783gPd.AYXKKw && this.fJNWhG == c19783gPd.fJNWhG && this.getFieldNames == c19783gPd.getFieldNames && this.fIwbmz == c19783gPd.fIwbmz && this.ejfBZ == c19783gPd.ejfBZ && this.valueOf == c19783gPd.valueOf && this.EZpvd == c19783gPd.EZpvd && this.OLrzqt == c19783gPd.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) c19783gPd.uzCIH) && Intrinsics.EZpvd(this.AhwBna, c19783gPd.AhwBna) && Intrinsics.EZpvd(this.hDKMBd, c19783gPd.hDKMBd) && Intrinsics.EZpvd(this.values, c19783gPd.values) && Intrinsics.EZpvd(this.iwGUEr, c19783gPd.iwGUEr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean fJNWhG() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gOU fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckModel gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC19780gPa getFieldNames() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewProxyInstance() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PreCheckModel preCheckModel = this.fetchVPNInfo;
        int iHashCode = preCheckModel == null ? 0 : preCheckModel.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        gOU gou = this.AkhnZx;
        int iHashCode4 = gou == null ? 0 : gou.hashCode();
        java.lang.Throwable th = this.DbNXlk;
        int iHashCode5 = th == null ? 0 : th.hashCode();
        java.lang.Throwable th2 = this.isConnected;
        int iHashCode6 = th2 == null ? 0 : th2.hashCode();
        int iHashCode7 = this.fARcdN.hashCode();
        java.lang.String str = this.AuCTel;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.gEmmrt;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.djBIcL;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.AEQbTJ;
        int iHashCode11 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.getNewProxyInstance;
        int iHashCode12 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        int iHashCode13 = java.lang.Integer.hashCode(this.AYXKKw);
        int iHashCode14 = java.lang.Integer.hashCode(this.fJNWhG);
        int iHashCode15 = java.lang.Integer.hashCode(this.getFieldNames);
        int iHashCode16 = java.lang.Boolean.hashCode(this.fIwbmz);
        int iHashCode17 = java.lang.Boolean.hashCode(this.ejfBZ);
        int iHashCode18 = java.lang.Boolean.hashCode(this.valueOf);
        int iHashCode19 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode20 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str4 = this.uzCIH;
        int iHashCode21 = str4 == null ? 0 : str4.hashCode();
        java.lang.Long l = this.AhwBna;
        int iHashCode22 = l == null ? 0 : l.hashCode();
        int iHashCode23 = this.hDKMBd.hashCode();
        int iHashCode24 = this.values.hashCode();
        InterfaceC9738bbJ interfaceC9738bbJ = this.iwGUEr;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + (interfaceC9738bbJ == null ? 0 : interfaceC9738bbJ.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gOT isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ iwGUEr() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReminderContext(preCheckModel=" + this.fetchVPNInfo + ", businessType=" + this.copydefault + ", chainInfo=" + this.KWHzl + ", quoteRequest=" + this.AkhnZx + ", quoteError=" + this.DbNXlk + ", presetConfigError=" + this.isConnected + ", slippageType=" + this.fARcdN + ", slippage=" + this.AuCTel + ", maxSlippage=" + this.gEmmrt + ", maxLimitSlippage=" + this.djBIcL + ", fromToken=" + this.AEQbTJ + ", toToken=" + this.getNewProxyInstance + ", liquidities=" + this.AYXKKw + ", selectLiquidities=" + this.fJNWhG + ", transactionNum=" + this.getFieldNames + ", showCancelApproveReminder=" + this.fIwbmz + ", shouldCheckSA=" + this.ejfBZ + ", marketCapEmpty=" + this.valueOf + ", isServiceOffline=" + this.EZpvd + ", isNeedCheckSuppportTPSL=" + this.OLrzqt + ", tradeAmount=" + this.uzCIH + ", orderExpireTimestamp=" + this.AhwBna + ", walletStatusProvider=" + this.hDKMBd + ", saStatusProvider=" + this.values + ", wallet=" + this.iwGUEr + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.fJNWhG;
    }

    public C19783gPd(PreCheckModel preCheckModel, @NotNull BusinessType businessType, @NotNull DefiChainInfo defiChainInfo, gOU gou, java.lang.Throwable th, java.lang.Throwable th2, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str4, java.lang.Long l, @NotNull InterfaceC19780gPa interfaceC19780gPa, @NotNull gOT got, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        Intrinsics.checkNotNullParameter(got, "");
        this.fetchVPNInfo = preCheckModel;
        this.copydefault = businessType;
        this.KWHzl = defiChainInfo;
        this.AkhnZx = gou;
        this.DbNXlk = th;
        this.isConnected = th2;
        this.fARcdN = slippageMode;
        this.AuCTel = str;
        this.gEmmrt = str2;
        this.djBIcL = str3;
        this.AEQbTJ = dexMultiTokenInfoBean;
        this.getNewProxyInstance = dexMultiTokenInfoBean2;
        this.AYXKKw = i;
        this.fJNWhG = i2;
        this.getFieldNames = i3;
        this.fIwbmz = z;
        this.ejfBZ = z2;
        this.valueOf = z3;
        this.EZpvd = z4;
        this.OLrzqt = z5;
        this.uzCIH = str4;
        this.AhwBna = l;
        this.hDKMBd = interfaceC19780gPa;
        this.values = got;
        this.iwGUEr = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c4: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.common.reminder.PreCheckModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r55v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.common.reminder.PreCheckModel) : (r30v0 com.okinc.business.dex.trade.common.reminder.PreCheckModel))
  (r31v0 com.okinc.business.dex.trade.common.reminder.BusinessType)
  (r32v0 com.okinc.business.dexlogic.bean.DefiChainInfo)
  (wrap:o.gOU:?: TERNARY null = ((wrap:int:0x000b: ARITH (r55v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.gOU) : (r33v0 o.gOU))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0013: ARITH (r55v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r34v0 java.lang.Throwable))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x001b: ARITH (r55v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r35v0 java.lang.Throwable))
  (r36v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r55v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r55v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r55v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r55v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r40v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r55v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r41v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r55v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r55v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005e: ARITH (r55v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006a: ARITH (32768 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0074: ARITH (65536 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (131072 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (262144 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0092: ARITH (524288 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (1048576 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a6: ARITH (2097152 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r51v0 java.lang.Long))
  (r52v0 o.gPa)
  (r53v0 o.gOT)
  (wrap:o.bbJ:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r55v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null o.bbJ) : (r54v0 o.bbJ))
 A[MD:(com.okinc.business.dex.trade.common.reminder.PreCheckModel, com.okinc.business.dex.trade.common.reminder.BusinessType, com.okinc.business.dexlogic.bean.DefiChainInfo, o.gOU, java.lang.Throwable, java.lang.Throwable, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, int, int, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Long, o.gPa, o.gOT, o.bbJ):void (m)] (LINE:18) call: o.gPd.<init>(com.okinc.business.dex.trade.common.reminder.PreCheckModel, com.okinc.business.dex.trade.common.reminder.BusinessType, com.okinc.business.dexlogic.bean.DefiChainInfo, o.gOU, java.lang.Throwable, java.lang.Throwable, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, int, int, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Long, o.gPa, o.gOT, o.bbJ):void type: THIS */
    public /* synthetic */ C19783gPd(PreCheckModel preCheckModel, BusinessType businessType, DefiChainInfo defiChainInfo, gOU gou, java.lang.Throwable th, java.lang.Throwable th2, SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str4, java.lang.Long l, InterfaceC19780gPa interfaceC19780gPa, gOT got, InterfaceC9738bbJ interfaceC9738bbJ, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : preCheckModel, businessType, defiChainInfo, (i4 & 8) != 0 ? null : gou, (i4 & 16) != 0 ? null : th, (i4 & 32) != 0 ? null : th2, slippageMode, (i4 & 128) != 0 ? null : str, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : str3, (i4 & 1024) != 0 ? null : dexMultiTokenInfoBean, (i4 & 2048) != 0 ? null : dexMultiTokenInfoBean2, (i4 & 4096) != 0 ? 0 : i, (i4 & 8192) != 0 ? 0 : i2, (i4 & 16384) != 0 ? 0 : i3, (32768 & i4) != 0 ? false : z, (65536 & i4) != 0 ? false : z2, (131072 & i4) != 0 ? false : z3, (262144 & i4) != 0 ? false : z4, (524288 & i4) != 0 ? false : z5, (1048576 & i4) != 0 ? null : str4, (2097152 & i4) != 0 ? null : l, interfaceC19780gPa, got, (i4 & 16777216) != 0 ? null : interfaceC9738bbJ);
    }
}
