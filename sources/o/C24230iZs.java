package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24230iZs {
    public final java.util.List<C24224iZm> AEQbTJ;
    public final C24229iZr EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<C24228iZq> OLrzqt;
    public final C24224iZm copydefault;
    public final java.lang.String djBIcL;
    public final C24224iZm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24230iZs() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.iZs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C24230iZs copy$default(C24230iZs c24230iZs, java.util.List list, C24229iZr c24229iZr, C24224iZm c24224iZm, java.util.List list2, java.lang.String str, java.lang.String str2, C24224iZm c24224iZm2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c24230iZs.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c24229iZr = c24230iZs.EZpvd;
        }
        C24229iZr c24229iZr2 = c24229iZr;
        if ((i & 4) != 0) {
            c24224iZm = c24230iZs.copydefault;
        }
        C24224iZm c24224iZm3 = c24224iZm;
        if ((i & 8) != 0) {
            list2 = c24230iZs.OLrzqt;
        }
        java.util.List list3 = list2;
        if ((i & 16) != 0) {
            str = c24230iZs.djBIcL;
        }
        java.lang.String str3 = str;
        if ((i & 32) != 0) {
            str2 = c24230iZs.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i & 64) != 0) {
            c24224iZm2 = c24230iZs.gEmmrt;
        }
        return c24230iZs.copydefault(list, c24229iZr2, c24224iZm3, list3, str3, str4, c24224iZm2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C24224iZm> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24229iZr KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C24228iZq> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24230iZs copydefault(@NotNull java.util.List<C24224iZm> list, C24229iZr c24229iZr, C24224iZm c24224iZm, java.util.List<C24228iZq> list2, java.lang.String str, java.lang.String str2, C24224iZm c24224iZm2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C24230iZs(list, c24229iZr, c24224iZm, list2, str, str2, c24224iZm2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24230iZs)) {
            return false;
        }
        C24230iZs c24230iZs = (C24230iZs) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c24230iZs.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c24230iZs.EZpvd) && Intrinsics.EZpvd(this.copydefault, c24230iZs.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c24230iZs.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c24230iZs.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c24230iZs.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, c24230iZs.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        C24229iZr c24229iZr = this.EZpvd;
        int iHashCode2 = c24229iZr == null ? 0 : c24229iZr.hashCode();
        C24224iZm c24224iZm = this.copydefault;
        int iHashCode3 = c24224iZm == null ? 0 : c24224iZm.hashCode();
        java.util.List<C24228iZq> list = this.OLrzqt;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        java.lang.String str = this.djBIcL;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        C24224iZm c24224iZm2 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (c24224iZm2 != null ? c24224iZm2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExpandedDataRaw(assetsSections=" + this.AEQbTJ + ", claimableRewards=" + this.EZpvd + ", positionsSection=" + this.copydefault + ", extraFields=" + this.OLrzqt + ", tradingPair=" + this.djBIcL + ", pnl=" + this.KWHzl + ", unclaimedFeeSection=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24224iZm valueOf() {
        return this.gEmmrt;
    }

    public C24230iZs(@NotNull java.util.List<C24224iZm> list, C24229iZr c24229iZr, C24224iZm c24224iZm, java.util.List<C24228iZq> list2, java.lang.String str, java.lang.String str2, C24224iZm c24224iZm2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.EZpvd = c24229iZr;
        this.copydefault = c24224iZm;
        this.OLrzqt = list2;
        this.djBIcL = str;
        this.KWHzl = str2;
        this.gEmmrt = c24224iZm2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:44)) : (r6v0 java.util.List))
  (wrap:o.iZr:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.iZr) : (r7v0 o.iZr))
  (wrap:o.iZm:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.iZm) : (r8v0 o.iZm))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:o.iZm:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 o.iZm) : (null o.iZm))
 A[MD:(java.util.List<o.iZm>, o.iZr, o.iZm, java.util.List<o.iZq>, java.lang.String, java.lang.String, o.iZm):void (m)] (LINE:43) call: o.iZs.<init>(java.util.List, o.iZr, o.iZm, java.util.List, java.lang.String, java.lang.String, o.iZm):void type: THIS */
    public /* synthetic */ C24230iZs(java.util.List list, C24229iZr c24229iZr, C24224iZm c24224iZm, java.util.List list2, java.lang.String str, java.lang.String str2, C24224iZm c24224iZm2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : c24229iZr, (i & 4) != 0 ? null : c24224iZm, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? c24224iZm2 : null);
    }
}
