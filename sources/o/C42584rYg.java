package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42584rYg<T> {
    public final boolean AEQbTJ;
    public final java.util.List<T> AhwBna;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C42584rYg() {
        this(false, null, false, false, false, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.rYg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C42584rYg copy$default(C42584rYg c42584rYg, boolean z, java.util.List list, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c42584rYg.copydefault;
        }
        if ((i & 2) != 0) {
            list = c42584rYg.AhwBna;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            z2 = c42584rYg.EZpvd;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = c42584rYg.KWHzl;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = c42584rYg.AEQbTJ;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            z5 = c42584rYg.OLrzqt;
        }
        return c42584rYg.OLrzqt(z, list2, z6, z7, z8, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<T> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42584rYg<T> OLrzqt(boolean z, @NotNull java.util.List<? extends T> list, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C42584rYg<>(z, list, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42584rYg)) {
            return false;
        }
        C42584rYg c42584rYg = (C42584rYg) obj;
        return this.copydefault == c42584rYg.copydefault && Intrinsics.EZpvd(this.AhwBna, c42584rYg.AhwBna) && this.EZpvd == c42584rYg.EZpvd && this.KWHzl == c42584rYg.KWHzl && this.AEQbTJ == c42584rYg.AEQbTJ && this.OLrzqt == c42584rYg.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.copydefault) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ViewStateData(isLoading=" + this.copydefault + ", items=" + this.AhwBna + ", canLoadMore=" + this.EZpvd + ", error=" + this.KWHzl + ", isRefreshing=" + this.AEQbTJ + ", isLoadMore=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C42584rYg(boolean z, @NotNull java.util.List<? extends T> list, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.AhwBna = list;
        this.EZpvd = z2;
        this.KWHzl = z3;
        this.AEQbTJ = z4;
        this.OLrzqt = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
  (wrap:java.util.List:0x000d: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5)) : (r6v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 boolean) : false)
 A[MD:(boolean, java.util.List<? extends T>, boolean, boolean, boolean, boolean):void (m)] (LINE:3) call: o.rYg.<init>(boolean, java.util.List, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C42584rYg(boolean z, java.util.List list, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? z5 : false);
    }
}
