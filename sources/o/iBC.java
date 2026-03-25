package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iBC {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final Function0<Unit> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iBC() {
        this(0, 0, 0, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iBC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iBC copy$default(iBC ibc, int i, int i2, int i3, java.lang.String str, Function0 function0, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = ibc.EZpvd;
        }
        if ((i4 & 2) != 0) {
            i2 = ibc.KWHzl;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = ibc.AEQbTJ;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = ibc.copydefault;
        }
        java.lang.String str2 = str;
        if ((i4 & 16) != 0) {
            function0 = ibc.OLrzqt;
        }
        return ibc.EZpvd(i, i5, i6, str2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iBC EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull java.lang.String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        return new iBC(i, i2, i3, str, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iBC)) {
            return false;
        }
        iBC ibc = (iBC) obj;
        return this.EZpvd == ibc.EZpvd && this.KWHzl == ibc.KWHzl && this.AEQbTJ == ibc.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ibc.copydefault) && Intrinsics.EZpvd(this.OLrzqt, ibc.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode3 = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode4 = this.copydefault.hashCode();
        Function0<Unit> function0 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RestrictionPopUpInfo(title=" + this.EZpvd + ", message=" + this.KWHzl + ", buttonText=" + this.AEQbTJ + ", displayRegion=" + this.copydefault + ", btnClickListener=" + this.OLrzqt + ")";
    }

    public iBC(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull java.lang.String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.KWHzl = i2;
        this.AEQbTJ = i3;
        this.copydefault = str;
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ixk.FragmentManager.DcMfJKDDUqPf int) : (r4v0 int))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.ixk.FragmentManager.fmB int) : (r5v0 int))
  (wrap:int:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0011: SGET  A[WRAPPED] o.ixk.FragmentManager.OHqIaq int) : (r6v0 int))
  (wrap:java.lang.String:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r8v0 kotlin.jvm.functions.Function0))
 A[MD:(int, int, int, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:100) call: o.iBC.<init>(int, int, int, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ iBC(int i, int i2, int i3, java.lang.String str, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C25493ixk.FragmentManager.DcMfJKDDUqPf : i, (i4 & 2) != 0 ? C25493ixk.FragmentManager.fmB : i2, (i4 & 4) != 0 ? C25493ixk.FragmentManager.OHqIaq : i3, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? null : function0);
    }
}
