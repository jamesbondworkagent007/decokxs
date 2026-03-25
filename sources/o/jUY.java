package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUY {
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.util.List<C26280jYp> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jUY() {
        this(false, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jUY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jUY copy$default(jUY juy, boolean z, java.util.List list, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = juy.KWHzl;
        }
        if ((i & 2) != 0) {
            list = juy.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = juy.OLrzqt;
        }
        return juy.copydefault(z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C26280jYp> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jUY copydefault(boolean z, @NotNull java.util.List<C26280jYp> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new jUY(z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jUY)) {
            return false;
        }
        jUY juy = (jUY) obj;
        return this.KWHzl == juy.KWHzl && Intrinsics.EZpvd(this.copydefault, juy.copydefault) && this.OLrzqt == juy.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterRankUiState(isLoading=" + this.KWHzl + ", listTab=" + this.copydefault + ", isError=" + this.OLrzqt + ")";
    }

    public jUY(boolean z, @NotNull java.util.List<C26280jYp> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = z;
        this.copydefault = list;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r3v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, java.util.List<o.jYp>, boolean):void (m)] (LINE:26) call: o.jUY.<init>(boolean, java.util.List, boolean):void type: THIS */
    public /* synthetic */ jUY(boolean z, java.util.List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z2);
    }
}
