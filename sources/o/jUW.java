package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUW {
    public final boolean EZpvd;
    public final java.util.List<java.lang.Object> KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jUW() {
        this(false, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jUW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jUW copy$default(jUW juw, boolean z, java.util.List list, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = juw.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = juw.KWHzl;
        }
        if ((i & 4) != 0) {
            z2 = juw.EZpvd;
        }
        return juw.OLrzqt(z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jUW OLrzqt(boolean z, @NotNull java.util.List<? extends java.lang.Object> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new jUW(z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jUW)) {
            return false;
        }
        jUW juw = (jUW) obj;
        return this.OLrzqt == juw.OLrzqt && Intrinsics.EZpvd(this.KWHzl, juw.KWHzl) && this.EZpvd == juw.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterRangeUiState(isLoading=" + this.OLrzqt + ", listTab=" + this.KWHzl + ", isError=" + this.EZpvd + ")";
    }

    public jUW(boolean z, @NotNull java.util.List<? extends java.lang.Object> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = z;
        this.KWHzl = list;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r3v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, java.util.List<? extends java.lang.Object>, boolean):void (m)] (LINE:33) call: o.jUW.<init>(boolean, java.util.List, boolean):void type: THIS */
    public /* synthetic */ jUW(boolean z, java.util.List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z2);
    }
}
