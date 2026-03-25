package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oLS implements oLP {
    public final long AEQbTJ;
    public boolean EZpvd;
    public final java.util.List<oLP> KWHzl;
    public final int OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.oLS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oLS copy$default(oLS ols, long j, float f, java.util.List list, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = ols.AEQbTJ;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            f = ols.copydefault;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            list = ols.KWHzl;
        }
        java.util.List list2 = list;
        if ((i2 & 8) != 0) {
            i = ols.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = ols.EZpvd;
        }
        return ols.OLrzqt(j2, f2, list2, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<oLP> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oLS OLrzqt(long j, float f, @NotNull java.util.List<? extends oLP> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new oLS(j, f, list, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oLS)) {
            return false;
        }
        oLS ols = (oLS) obj;
        return this.AEQbTJ == ols.AEQbTJ && java.lang.Float.compare(this.copydefault, ols.copydefault) == 0 && Intrinsics.EZpvd(this.KWHzl, ols.KWHzl) && this.OLrzqt == ols.OLrzqt && this.EZpvd == ols.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.AEQbTJ) * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KLineMergeEvent(date=" + this.AEQbTJ + ", centerX=" + this.copydefault + ", eventList=" + this.KWHzl + ", totalEvent=" + this.OLrzqt + ", showTimeLine=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.oLP> */
    /* JADX WARN: Multi-variable type inference failed */
    public oLS(long j, float f, @NotNull java.util.List<? extends oLP> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = j;
        this.copydefault = f;
        this.KWHzl = list;
        this.OLrzqt = i;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 long)
  (wrap:float:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r10v0 float))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r11v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(long, float, java.util.List<? extends o.oLP>, int, boolean):void (m)] (LINE:33) call: o.oLS.<init>(long, float, java.util.List, int, boolean):void type: THIS */
    public /* synthetic */ oLS(long j, float f, java.util.List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? yDY.AhwBna() : list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }
}
