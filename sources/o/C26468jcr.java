package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26468jcr {
    public final boolean AEQbTJ;
    public final int EZpvd;
    public final boolean KWHzl;
    public final java.util.List<InterfaceC27436jvE> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26468jcr() {
        this(null, 0, false, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jcr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26468jcr copy$default(C26468jcr c26468jcr, java.util.List list, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = c26468jcr.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = c26468jcr.EZpvd;
        }
        if ((i2 & 4) != 0) {
            z = c26468jcr.KWHzl;
        }
        if ((i2 & 8) != 0) {
            z2 = c26468jcr.AEQbTJ;
        }
        return c26468jcr.copydefault(list, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC27436jvE> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26468jcr copydefault(@NotNull java.util.List<? extends InterfaceC27436jvE> list, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C26468jcr(list, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26468jcr)) {
            return false;
        }
        C26468jcr c26468jcr = (C26468jcr) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c26468jcr.OLrzqt) && this.EZpvd == c26468jcr.EZpvd && this.KWHzl == c26468jcr.KWHzl && this.AEQbTJ == c26468jcr.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CommonProductsInfo(products=" + this.OLrzqt + ", prevPage=" + this.EZpvd + ", hasMore=" + this.KWHzl + ", isComplete=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.jvE> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26468jcr(@NotNull java.util.List<? extends InterfaceC27436jvE> list, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.EZpvd = i;
        this.KWHzl = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:250)) : (r2v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r3v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(java.util.List<? extends o.jvE>, int, boolean, boolean):void (m)] (LINE:249) call: o.jcr.<init>(java.util.List, int, boolean, boolean):void type: THIS */
    public /* synthetic */ C26468jcr(java.util.List list, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? yDY.AhwBna() : list, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? true : z2);
    }

    public final boolean OLrzqt() {
        return this.OLrzqt.isEmpty();
    }
}
