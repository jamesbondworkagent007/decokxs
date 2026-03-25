package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDV {
    public final java.util.List<C27370jts> AEQbTJ;
    public final C27376jty EZpvd;
    public final C27376jty KWHzl;
    public final java.util.List<C27368jtq> OLrzqt;
    public final C27373jtv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iDV() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iDV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iDV copy$default(iDV idv, C27376jty c27376jty, java.util.List list, C27376jty c27376jty2, java.util.List list2, C27373jtv c27373jtv, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c27376jty = idv.EZpvd;
        }
        if ((i & 2) != 0) {
            list = idv.AEQbTJ;
        }
        java.util.List list3 = list;
        if ((i & 4) != 0) {
            c27376jty2 = idv.KWHzl;
        }
        C27376jty c27376jty3 = c27376jty2;
        if ((i & 8) != 0) {
            list2 = idv.OLrzqt;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            c27373jtv = idv.copydefault;
        }
        return idv.AEQbTJ(c27376jty, list3, c27376jty3, list4, c27373jtv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iDV AEQbTJ(C27376jty c27376jty, @NotNull java.util.List<C27370jts> list, C27376jty c27376jty2, @NotNull java.util.List<C27368jtq> list2, C27373jtv c27373jtv) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new iDV(c27376jty, list, c27376jty2, list2, c27373jtv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27376jty AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27376jty EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C27370jts> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27373jtv OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C27368jtq> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iDV)) {
            return false;
        }
        iDV idv = (iDV) obj;
        return Intrinsics.EZpvd(this.EZpvd, idv.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, idv.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, idv.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, idv.OLrzqt) && Intrinsics.EZpvd(this.copydefault, idv.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C27376jty c27376jty = this.EZpvd;
        int iHashCode = c27376jty == null ? 0 : c27376jty.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        C27376jty c27376jty2 = this.KWHzl;
        int iHashCode3 = c27376jty2 == null ? 0 : c27376jty2.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        C27373jtv c27373jtv = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c27373jtv != null ? c27373jtv.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DashboardProtocolDetails(assetTitle=" + this.EZpvd + ", assets=" + this.AEQbTJ + ", borrowTitle=" + this.KWHzl + ", borrow=" + this.OLrzqt + ", rewards=" + this.copydefault + ")";
    }

    public iDV(C27376jty c27376jty, @NotNull java.util.List<C27370jts> list, C27376jty c27376jty2, @NotNull java.util.List<C27368jtq> list2, C27373jtv c27373jtv) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = c27376jty;
        this.AEQbTJ = list;
        this.KWHzl = c27376jty2;
        this.OLrzqt = list2;
        this.copydefault = c27373jtv;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:o.jty:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.jty) : (r5v0 o.jty))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r6v0 java.util.List))
  (wrap:o.jty:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.jty) : (r7v0 o.jty))
  (wrap:java.util.List:0x0020: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r8v0 java.util.List))
  (wrap:o.jtv:?: TERNARY null = ((wrap:int:0x0021: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.jtv) : (r9v0 o.jtv))
 A[MD:(o.jty, java.util.List<o.jts>, o.jty, java.util.List<o.jtq>, o.jtv):void (m)] (LINE:16) call: o.iDV.<init>(o.jty, java.util.List, o.jty, java.util.List, o.jtv):void type: THIS */
    public /* synthetic */ iDV(C27376jty c27376jty, java.util.List list, C27376jty c27376jty2, java.util.List list2, C27373jtv c27373jtv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c27376jty, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : c27376jty2, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? null : c27373jtv);
    }
}
