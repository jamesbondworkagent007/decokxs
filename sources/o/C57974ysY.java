package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57974ysY {
    public final boolean EZpvd;
    public final boolean OLrzqt;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57974ysY() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ysY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57974ysY copy$default(C57974ysY c57974ysY, boolean z, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c57974ysY.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c57974ysY.OLrzqt;
        }
        if ((i & 4) != 0) {
            list = c57974ysY.copydefault;
        }
        return c57974ysY.KWHzl(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57974ysY KWHzl(boolean z, boolean z2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C57974ysY(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57974ysY)) {
            return false;
        }
        C57974ysY c57974ysY = (C57974ysY) obj;
        return this.EZpvd == c57974ysY.EZpvd && this.OLrzqt == c57974ysY.OLrzqt && Intrinsics.EZpvd(this.copydefault, c57974ysY.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z = this.EZpvd;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.OLrzqt;
        return (((r0 * 31) + (z2 ? 1 : z2)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupervisorConfig(enable=" + this.EZpvd + ", autoCreate=" + this.OLrzqt + ", lruKillerWhiteList=" + this.copydefault + ')';
    }

    public C57974ysY(boolean z, boolean z2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.copydefault = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r4v0 java.util.List))
 A[MD:(boolean, boolean, java.util.List<java.lang.String>):void (m)] (LINE:26) call: o.ysY.<init>(boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C57974ysY(boolean z, boolean z2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
