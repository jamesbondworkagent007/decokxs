package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fTY {
    public final java.util.List<fTZ.Application> AEQbTJ;
    public final java.util.List<fTZ.Application> EZpvd;
    public final int KWHzl;
    public final java.util.List<fTZ.Application> OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public fTY() {
        this(0, 0, false, false, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.fTY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fTY copy$default(fTY fty, int i, int i2, boolean z, boolean z2, java.util.List list, java.util.List list2, java.util.List list3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = fty.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i2 = fty.valueOf;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = fty.djBIcL;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = fty.copydefault;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            list = fty.OLrzqt;
        }
        java.util.List list4 = list;
        if ((i3 & 32) != 0) {
            list2 = fty.AEQbTJ;
        }
        java.util.List list5 = list2;
        if ((i3 & 64) != 0) {
            list3 = fty.EZpvd;
        }
        return fty.AEQbTJ(i, i4, z3, z4, list4, list5, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final fTY AEQbTJ(int i, int i2, boolean z, boolean z2, @NotNull java.util.List<fTZ.Application> list, @NotNull java.util.List<fTZ.Application> list2, @NotNull java.util.List<fTZ.Application> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new fTY(i, i2, z, z2, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<fTZ.Application> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<fTZ.Application> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fTY)) {
            return false;
        }
        fTY fty = (fTY) obj;
        return this.KWHzl == fty.KWHzl && this.valueOf == fty.valueOf && this.djBIcL == fty.djBIcL && this.copydefault == fty.copydefault && Intrinsics.EZpvd(this.OLrzqt, fty.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, fty.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, fty.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PaginationState(currentPage=" + this.KWHzl + ", pageSize=" + this.valueOf + ", isLoadingMore=" + this.djBIcL + ", hasMorePages=" + this.copydefault + ", allTokens=" + this.OLrzqt + ", displayedTokens=" + this.AEQbTJ + ", hiddenTokens=" + this.EZpvd + ")";
    }

    public fTY(int i, int i2, boolean z, boolean z2, @NotNull java.util.List<fTZ.Application> list, @NotNull java.util.List<fTZ.Application> list2, @NotNull java.util.List<fTZ.Application> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.KWHzl = i;
        this.valueOf = i2;
        this.djBIcL = z;
        this.copydefault = z2;
        this.OLrzqt = list;
        this.AEQbTJ = list2;
        this.EZpvd = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (50 int) : (r7v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 boolean) : false)
  (wrap:boolean:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:java.util.List:0x0023: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r10v0 java.util.List))
  (wrap:java.util.List:0x002c: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0031: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r12v0 java.util.List))
 A[MD:(int, int, boolean, boolean, java.util.List<o.fTZ$Application>, java.util.List<o.fTZ$Application>, java.util.List<o.fTZ$Application>):void (m)] (LINE:28) call: o.fTY.<init>(int, int, boolean, boolean, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ fTY(int i, int i2, boolean z, boolean z2, java.util.List list, java.util.List list2, java.util.List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 50 : i2, (i3 & 4) == 0 ? z : false, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? yDY.AhwBna() : list, (i3 & 32) != 0 ? yDY.AhwBna() : list2, (i3 & 64) != 0 ? yDY.AhwBna() : list3);
    }
}
