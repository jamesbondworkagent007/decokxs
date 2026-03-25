package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16026ecE {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<C10854bwM> AhwBna;
    public final boolean EZpvd;
    public final java.lang.Integer KWHzl;
    public final boolean OLrzqt;
    public final C15937eaV copydefault;
    public final AbstractC12782ctV djBIcL;
    public final C16033ecL gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C16026ecE() {
        this(null, null, null, null, null, false, null, null, false, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10854bwM> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15937eaV KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16026ecE copydefault(java.lang.Integer num, C16033ecL c16033ecL, AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull java.util.List<C10854bwM> list, boolean z, @NotNull java.lang.String str2, java.lang.String str3, boolean z2, C15937eaV c15937eaV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C16026ecE(num, c16033ecL, abstractC12782ctV, str, list, z, str2, str3, z2, c15937eaV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16026ecE)) {
            return false;
        }
        C16026ecE c16026ecE = (C16026ecE) obj;
        return Intrinsics.EZpvd(this.KWHzl, c16026ecE.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, c16026ecE.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, c16026ecE.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c16026ecE.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c16026ecE.AhwBna) && this.EZpvd == c16026ecE.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c16026ecE.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c16026ecE.valueOf) && this.OLrzqt == c16026ecE.OLrzqt && Intrinsics.EZpvd(this.copydefault, c16026ecE.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10854bwM> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.KWHzl;
        int iHashCode = num == null ? 0 : num.hashCode();
        C16033ecL c16033ecL = this.gEmmrt;
        int iHashCode2 = c16033ecL == null ? 0 : c16033ecL.hashCode();
        AbstractC12782ctV abstractC12782ctV = this.djBIcL;
        int iHashCode3 = abstractC12782ctV == null ? 0 : abstractC12782ctV.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode7 = this.AEQbTJ.hashCode();
        java.lang.String str = this.valueOf;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = java.lang.Boolean.hashCode(this.OLrzqt);
        C15937eaV c15937eaV = this.copydefault;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (c15937eaV != null ? c15937eaV.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConnectionViewState(connectState=" + this.KWHzl + ", projectInfo=" + this.gEmmrt + ", wallet=" + this.djBIcL + ", topic=" + this.AYXKKw + ", supportedNetworks=" + this.AhwBna + ", hasRisk=" + this.EZpvd + ", originUrl=" + this.AEQbTJ + ", tipMessage=" + this.valueOf + ", isWalletNotSupported=" + this.OLrzqt + ", connectAndSignData=" + this.copydefault + ")";
    }

    public C16026ecE(java.lang.Integer num, C16033ecL c16033ecL, AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull java.util.List<C10854bwM> list, boolean z, @NotNull java.lang.String str2, java.lang.String str3, boolean z2, C15937eaV c15937eaV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = num;
        this.gEmmrt = c16033ecL;
        this.djBIcL = abstractC12782ctV;
        this.AYXKKw = str;
        this.AhwBna = list;
        this.EZpvd = z;
        this.AEQbTJ = str2;
        this.valueOf = str3;
        this.OLrzqt = z2;
        this.copydefault = c15937eaV;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:o.ecL:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.ecL) : (r14v0 o.ecL))
  (wrap:o.ctV:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.ctV) : (r15v0 o.ctV))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0022: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:319)) : (r17v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r23v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
  (wrap:o.eaV:?: TERNARY null = ((wrap:int:0x004c: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 o.eaV) : (null o.eaV))
 A[MD:(java.lang.Integer, o.ecL, o.ctV, java.lang.String, java.util.List<o.bwM>, boolean, java.lang.String, java.lang.String, boolean, o.eaV):void (m)] (LINE:314) call: o.ecE.<init>(java.lang.Integer, o.ecL, o.ctV, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, boolean, o.eaV):void type: THIS */
    public /* synthetic */ C16026ecE(java.lang.Integer num, C16033ecL c16033ecL, AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.util.List list, boolean z, java.lang.String str2, java.lang.String str3, boolean z2, C15937eaV c15937eaV, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : c16033ecL, (i & 4) != 0 ? null : abstractC12782ctV, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? false : z, (i & 64) == 0 ? str2 : "", (i & 128) != 0 ? null : str3, (i & 256) == 0 ? z2 : false, (i & 512) == 0 ? c15937eaV : null);
    }

    public final java.lang.CharSequence values() {
        return C14733dqy.copydefault.KWHzl(this.djBIcL);
    }

    public final java.lang.String valueOf() {
        C16033ecL c16033ecL = this.gEmmrt;
        java.lang.String strKWHzl = c16033ecL != null ? c16033ecL.KWHzl() : null;
        return strKWHzl == null ? "" : strKWHzl;
    }

    public final java.lang.String AhwBna() {
        C16033ecL c16033ecL = this.gEmmrt;
        java.lang.String strEZpvd = c16033ecL != null ? c16033ecL.EZpvd() : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final java.lang.String copydefault() {
        C16033ecL c16033ecL = this.gEmmrt;
        java.lang.String strOLrzqt = c16033ecL != null ? c16033ecL.OLrzqt() : null;
        return strOLrzqt == null ? "" : strOLrzqt;
    }
}
