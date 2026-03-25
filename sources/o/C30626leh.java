package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.leh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30626leh {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C30805liA AhwBna;
    public final DexMultiTokenInfoBean EZpvd;
    public final boolean KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.Boolean gEmmrt;
    public final DexMultiTokenInfoBean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30626leh() {
        this(null, null, null, null, null, null, false, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30626leh KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.lang.String str2, C30805liA c30805liA, java.util.List<java.lang.String> list, boolean z, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4) {
        return new C30626leh(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str, str2, c30805liA, list, z, str3, bool, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30805liA djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30626leh)) {
            return false;
        }
        C30626leh c30626leh = (C30626leh) obj;
        return Intrinsics.EZpvd(this.valueOf, c30626leh.valueOf) && Intrinsics.EZpvd(this.EZpvd, c30626leh.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c30626leh.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c30626leh.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, c30626leh.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, c30626leh.OLrzqt) && this.KWHzl == c30626leh.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c30626leh.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c30626leh.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c30626leh.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.valueOf;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.EZpvd;
        int iHashCode2 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        java.lang.String str = this.AYXKKw;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        C30805liA c30805liA = this.AhwBna;
        int iHashCode5 = c30805liA == null ? 0 : c30805liA.hashCode();
        java.util.List<java.lang.String> list = this.OLrzqt;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str3 = this.djBIcL;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.Boolean bool = this.gEmmrt;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        java.lang.String str4 = this.copydefault;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeChangeParams(quoteToken=" + this.valueOf + ", baseToken=" + this.EZpvd + ", tradeAmount=" + this.AYXKKw + ", balance=" + this.AEQbTJ + ", setting=" + this.AhwBna + ", dexIds=" + this.OLrzqt + ", isAllLiqProvidersSelected=" + this.KWHzl + ", limitAmount=" + this.djBIcL + ", needApproveTxInfo=" + this.gEmmrt + ", approveAmount=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean valueOf() {
        return this.gEmmrt;
    }

    public C30626leh(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.lang.String str2, C30805liA c30805liA, java.util.List<java.lang.String> list, boolean z, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4) {
        this.valueOf = dexMultiTokenInfoBean;
        this.EZpvd = dexMultiTokenInfoBean2;
        this.AYXKKw = str;
        this.AEQbTJ = str2;
        this.AhwBna = c30805liA;
        this.OLrzqt = list;
        this.KWHzl = z;
        this.djBIcL = str3;
        this.gEmmrt = bool;
        this.copydefault = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r12v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r13v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:o.liA:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.liA) : (r16v0 o.liA))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, o.liA, java.util.List<java.lang.String>, boolean, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:99) call: o.leh.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, o.liA, java.util.List, boolean, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C30626leh(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.lang.String str2, C30805liA c30805liA, java.util.List list, boolean z, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dexMultiTokenInfoBean, (i & 2) != 0 ? null : dexMultiTokenInfoBean2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : c30805liA, (i & 32) != 0 ? null : list, (i & 64) != 0 ? true : z, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? null : bool, (i & 512) == 0 ? str4 : null);
    }

    public final boolean values() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        return (this.valueOf == null || (dexMultiTokenInfoBean = this.EZpvd) == null || dexMultiTokenInfoBean.isRiskToken() || this.valueOf.isRiskToken()) ? false : true;
    }
}
