package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24237iZz implements InterfaceC27436jvE {
    public boolean AEQbTJ;
    public boolean EZpvd;
    public final boolean KWHzl;
    public final Function1<C24237iZz, Unit> OLrzqt;
    public final java.lang.String copydefault;
    public final C24236iZy valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.iZz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C24237iZz copy$default(C24237iZz c24237iZz, java.lang.String str, C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c24237iZz.copydefault;
        }
        if ((i & 2) != 0) {
            c24236iZy = c24237iZz.valueOf;
        }
        C24236iZy c24236iZy2 = c24236iZy;
        if ((i & 4) != 0) {
            z = c24237iZz.KWHzl;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = c24237iZz.EZpvd;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = c24237iZz.AEQbTJ;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            function1 = c24237iZz.OLrzqt;
        }
        return c24237iZz.EZpvd(str, c24236iZy2, z4, z5, z6, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24237iZz EZpvd(@NotNull java.lang.String str, @NotNull C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1<? super C24237iZz, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        return new C24237iZz(str, c24236iZy, z, z2, z3, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C24237iZz, Unit> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24236iZy copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24237iZz)) {
            return false;
        }
        C24237iZz c24237iZz = (C24237iZz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c24237iZz.copydefault) && Intrinsics.EZpvd(this.valueOf, c24237iZz.valueOf) && this.KWHzl == c24237iZz.KWHzl && this.EZpvd == c24237iZz.EZpvd && this.AEQbTJ == c24237iZz.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, c24237iZz.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode5 = java.lang.Boolean.hashCode(this.AEQbTJ);
        Function1<C24237iZz, Unit> function1 = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function1 == null ? 0 : function1.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeFiNovicePositionItem(id=" + this.copydefault + ", primaryAsset=" + this.valueOf + ", hasMultipleAssets=" + this.KWHzl + ", isExpanded=" + this.EZpvd + ", isLastItem=" + this.AEQbTJ + ", onToggle=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super o.iZz, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C24237iZz(@NotNull java.lang.String str, @NotNull C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1<? super C24237iZz, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        this.copydefault = str;
        this.valueOf = c24236iZy;
        this.KWHzl = z;
        this.EZpvd = z2;
        this.AEQbTJ = z3;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 o.iZy)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r13v0 kotlin.jvm.functions.Function1))
 A[MD:(java.lang.String, o.iZy, boolean, boolean, boolean, kotlin.jvm.functions.Function1<? super o.iZz, kotlin.Unit>):void (m)] (LINE:31) call: o.iZz.<init>(java.lang.String, o.iZy, boolean, boolean, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C24237iZz(java.lang.String str, C24236iZy c24236iZy, boolean z, boolean z2, boolean z3, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c24236iZy, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : function1);
    }
}
