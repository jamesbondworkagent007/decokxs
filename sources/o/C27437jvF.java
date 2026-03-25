package o;

import com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27437jvF implements InterfaceC27436jvE {
    public final Orientation AEQbTJ;
    public final float EZpvd;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27437jvF() {
        this(0.0f, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27437jvF copy$default(C27437jvF c27437jvF, float f, Orientation orientation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c27437jvF.EZpvd;
        }
        if ((i & 2) != 0) {
            orientation = c27437jvF.AEQbTJ;
        }
        return c27437jvF.KWHzl(f, orientation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27437jvF KWHzl(float f, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "");
        return new C27437jvF(f, orientation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Orientation OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27437jvF)) {
            return false;
        }
        C27437jvF c27437jvF = (C27437jvF) obj;
        return java.lang.Float.compare(this.EZpvd, c27437jvF.EZpvd) == 0 && this.AEQbTJ == c27437jvF.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiDivider(widthDp=" + this.EZpvd + ", orientation=" + this.AEQbTJ + ")";
    }

    public C27437jvF(float f, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "");
        this.EZpvd = f;
        this.AEQbTJ = orientation;
        this.copydefault = java.lang.System.currentTimeMillis();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r1v0 float))
  (wrap:com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation:0x000a: SGET  A[WRAPPED] (LINE:14) com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation.HORIZONTAL com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation) : (r2v0 com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation))
 A[MD:(float, com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation):void (m)] (LINE:14) call: o.jvF.<init>(float, com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation):void type: THIS */
    public /* synthetic */ C27437jvF(float f, Orientation orientation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.5f : f, (i & 2) != 0 ? Orientation.HORIZONTAL : orientation);
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27437jvF c27437jvF = interfaceC27436jvE instanceof C27437jvF ? (C27437jvF) interfaceC27436jvE : null;
        return c27437jvF != null && this.copydefault == c27437jvF.copydefault;
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27437jvF c27437jvF = interfaceC27436jvE instanceof C27437jvF ? (C27437jvF) interfaceC27436jvE : null;
        return c27437jvF != null && this.EZpvd == c27437jvF.EZpvd;
    }
}
