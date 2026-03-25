package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24234iZw implements InterfaceC27436jvE {
    public final boolean AEQbTJ;
    public boolean EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public final Function1<C24234iZw, Unit> copydefault;
    public final C24236iZy gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.iZw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C24234iZw copy$default(C24234iZw c24234iZw, java.lang.String str, C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c24234iZw.KWHzl;
        }
        if ((i & 2) != 0) {
            c24236iZy = c24234iZw.gEmmrt;
        }
        C24236iZy c24236iZy2 = c24236iZy;
        if ((i & 4) != 0) {
            z = c24234iZw.AEQbTJ;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = c24234iZw.EZpvd;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = c24234iZw.OLrzqt;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            function1 = c24234iZw.copydefault;
        }
        return c24234iZw.AEQbTJ(str, c24236iZy2, z4, z5, z6, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24234iZw AEQbTJ(@NotNull java.lang.String str, @NotNull C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1<? super C24234iZw, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        return new C24234iZw(str, c24236iZy, z, z2, z3, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C24234iZw, Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24236iZy copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24234iZw)) {
            return false;
        }
        C24234iZw c24234iZw = (C24234iZw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c24234iZw.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, c24234iZw.gEmmrt) && this.AEQbTJ == c24234iZw.AEQbTJ && this.EZpvd == c24234iZw.EZpvd && this.OLrzqt == c24234iZw.OLrzqt && Intrinsics.EZpvd(this.copydefault, c24234iZw.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode5 = java.lang.Boolean.hashCode(this.OLrzqt);
        Function1<C24234iZw, Unit> function1 = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function1 == null ? 0 : function1.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeFiNoviceExpandableItem(id=" + this.KWHzl + ", primaryAsset=" + this.gEmmrt + ", hasMultipleAssets=" + this.AEQbTJ + ", isExpanded=" + this.EZpvd + ", isLastItem=" + this.OLrzqt + ", onToggle=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super o.iZw, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C24234iZw(@NotNull java.lang.String str, @NotNull C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1<? super C24234iZw, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        this.KWHzl = str;
        this.gEmmrt = c24236iZy;
        this.AEQbTJ = z;
        this.EZpvd = z2;
        this.OLrzqt = z3;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 o.iZy)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r13v0 kotlin.jvm.functions.Function1))
 A[MD:(java.lang.String, o.iZy, boolean, boolean, boolean, kotlin.jvm.functions.Function1<? super o.iZw, kotlin.Unit>):void (m)] (LINE:45) call: o.iZw.<init>(java.lang.String, o.iZy, boolean, boolean, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C24234iZw(java.lang.String str, C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c24236iZy, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : function1);
    }
}
