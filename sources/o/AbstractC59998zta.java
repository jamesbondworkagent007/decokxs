package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC59998zta extends androidx.fragment.app.Fragment implements InterfaceC59938zsT {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59998zta() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:33) call: o.zta.<init>(int):void type: THIS */
    public /* synthetic */ AbstractC59998zta(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public AbstractC59998zta(@androidx.annotation.LayoutRes int i) {
        super(i);
        this.OLrzqt = C60000ztc.fragmentScope$default(this, false, 1, null);
    }

    @Override // o.InterfaceC59938zsT
    public C60060zuj KWHzl() {
        return (C60060zuj) this.OLrzqt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (KWHzl() == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
    }
}
