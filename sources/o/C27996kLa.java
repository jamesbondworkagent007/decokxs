package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27996kLa extends AbstractC49408unw<C27996kLa> {
    public InterfaceC49371unL<C27997kLb> AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27996kLa() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kLa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27996kLa copy$default(C27996kLa c27996kLa, InterfaceC49371unL interfaceC49371unL, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = c27996kLa.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c27996kLa.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c27996kLa.KWHzl;
        }
        return c27996kLa.EZpvd(interfaceC49371unL, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27996kLa EZpvd(@NotNull InterfaceC49371unL<C27997kLb> interfaceC49371unL, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27996kLa(interfaceC49371unL, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<C27997kLb> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC49371unL<C27997kLb> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AEQbTJ = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27996kLa)) {
            return false;
        }
        C27996kLa c27996kLa = (C27996kLa) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c27996kLa.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27996kLa.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27996kLa.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupWatchUiState(tabList=" + this.AEQbTJ + ", selectedGroupTabKey=" + this.copydefault + ", pendingTab=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:152) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 o.unL))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("ALL") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(o.unL<o.kLb>, java.lang.String, java.lang.String):void (m)] (LINE:151) call: o.kLa.<init>(o.unL, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C27996kLa(InterfaceC49371unL interfaceC49371unL, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? "ALL" : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27996kLa(@NotNull InterfaceC49371unL<C27997kLb> interfaceC49371unL, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        super(new Function1() { // from class: o.kLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27996kLa.copydefault((C27996kLa) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = interfaceC49371unL;
        this.copydefault = str;
        this.KWHzl = str2;
    }

    public static final C27996kLa copydefault(C27996kLa c27996kLa) {
        Intrinsics.checkNotNullParameter(c27996kLa, "");
        return copy$default(c27996kLa, null, null, null, 7, null);
    }
}
