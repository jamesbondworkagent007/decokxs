package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36123oQc extends AbstractC49408unw<C36123oQc> {
    public InterfaceC49371unL<? extends java.util.List<oPY>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36123oQc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oQc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36123oQc copy$default(C36123oQc c36123oQc, InterfaceC49371unL interfaceC49371unL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = c36123oQc.KWHzl;
        }
        return c36123oQc.OLrzqt((InterfaceC49371unL<? extends java.util.List<oPY>>) interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.oPY>>, o.unL<java.util.List<o.oPY>> */
    public final InterfaceC49371unL<java.util.List<oPY>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36123oQc OLrzqt(@NotNull InterfaceC49371unL<? extends java.util.List<oPY>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        return new C36123oQc(interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC49371unL<? extends java.util.List<oPY>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36123oQc) && Intrinsics.EZpvd(this.KWHzl, ((C36123oQc) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ContractInfoUiState(items=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:380) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<? extends java.util.List<o.oPY>>):void (m)] (LINE:379) call: o.oQc.<init>(o.unL):void type: THIS */
    public /* synthetic */ C36123oQc(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36123oQc(@NotNull InterfaceC49371unL<? extends java.util.List<oPY>> interfaceC49371unL) {
        super(new Function1() { // from class: o.oQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36123oQc.KWHzl((C36123oQc) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    public static final C36123oQc KWHzl(C36123oQc c36123oQc) {
        Intrinsics.checkNotNullParameter(c36123oQc, "");
        return copy$default(c36123oQc, null, 1, null);
    }
}
