package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C57631ym {
    public final InterfaceC56482yH<java.lang.String> AEQbTJ;
    public final InterfaceC57843yq EZpvd;
    public final DL KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ym */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57631ym copy$default(C57631ym c57631ym, DL dl, InterfaceC56482yH interfaceC56482yH, InterfaceC57843yq interfaceC57843yq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dl = c57631ym.KWHzl;
        }
        if ((i & 2) != 0) {
            interfaceC56482yH = c57631ym.AEQbTJ;
        }
        if ((i & 4) != 0) {
            interfaceC57843yq = c57631ym.EZpvd;
        }
        return c57631ym.OLrzqt(dl, interfaceC56482yH, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56482yH<java.lang.String> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57631ym OLrzqt(@NotNull DL dl, InterfaceC56482yH<java.lang.String> interfaceC56482yH, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(dl, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new C57631ym(dl, interfaceC56482yH, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DL copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Endpoint(uri=" + this.KWHzl + ", headers=" + this.AEQbTJ + ", attributes=" + this.EZpvd + ')';
    }

    public C57631ym(@NotNull DL dl, InterfaceC56482yH<java.lang.String> interfaceC56482yH, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(dl, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.KWHzl = dl;
        this.AEQbTJ = interfaceC56482yH;
        this.EZpvd = interfaceC57843yq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 o.DL)
  (wrap:o.yH:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.yH) : (r2v0 o.yH))
  (wrap:o.yq:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yq:0x0009: INVOKE  STATIC call: o.yv.copydefault():o.yq A[MD:():o.yq (m), WRAPPED] (LINE:41)) : (r3v0 o.yq))
 A[MD:(o.DL, o.yH<java.lang.String>, o.yq):void (m)] (LINE:37) call: o.ym.<init>(o.DL, o.yH, o.yq):void type: THIS */
    public /* synthetic */ C57631ym(DL dl, InterfaceC56482yH interfaceC56482yH, InterfaceC57843yq interfaceC57843yq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dl, (i & 2) != 0 ? null : interfaceC56482yH, (i & 4) != 0 ? C58108yv.copydefault() : interfaceC57843yq);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.DL.StateListAnimator.parse$default(o.DL$StateListAnimator, java.lang.String, o.DM, int, java.lang.Object):o.DL */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57631ym(@NotNull java.lang.String str) {
        this(DL.StateListAnimator.parse$default(DL.AEQbTJ, str, null, 2, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.DL)
  (wrap:o.yH:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.yH) : (r2v0 o.yH))
 A[MD:(o.DL, o.yH<java.lang.String>):void (m)] (LINE:45) call: o.ym.<init>(o.DL, o.yH):void type: THIS */
    public /* synthetic */ C57631ym(DL dl, InterfaceC56482yH interfaceC56482yH, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dl, (i & 2) != 0 ? null : interfaceC56482yH);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57631ym(@NotNull DL dl, InterfaceC56482yH<java.lang.String> interfaceC56482yH) {
        this(dl, interfaceC56482yH, C58108yv.copydefault());
        Intrinsics.checkNotNullParameter(dl, "");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C57631ym) {
            C57631ym c57631ym = (C57631ym) obj;
            if (Intrinsics.EZpvd(this.KWHzl, c57631ym.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c57631ym.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c57631ym.EZpvd)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        InterfaceC56482yH<java.lang.String> interfaceC56482yH = this.AEQbTJ;
        return (((iHashCode * 31) + (interfaceC56482yH != null ? interfaceC56482yH.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }
}
