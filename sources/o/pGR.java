package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pGR extends android.widget.FrameLayout {
    public InterfaceC35967oKi AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pGR(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35967oKi EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIView(InterfaceC35967oKi interfaceC35967oKi) {
        this.AEQbTJ = interfaceC35967oKi;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:16) call: o.pGR.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ pGR(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pGR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        android.view.View drawLineToolsView$default = oka != null ? oKA.TaskDescription.getDrawLineToolsView$default(oka, context, attributeSet, 0, 4, null) : null;
        InterfaceC35967oKi interfaceC35967oKi = drawLineToolsView$default instanceof InterfaceC35967oKi ? (InterfaceC35967oKi) drawLineToolsView$default : null;
        this.AEQbTJ = interfaceC35967oKi;
        if (interfaceC35967oKi != null) {
            addView(interfaceC35967oKi.KWHzl());
        }
    }

    public final void setOnItemClickListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35967oKi interfaceC35967oKi = this.AEQbTJ;
        if (interfaceC35967oKi != null) {
            interfaceC35967oKi.setOnItemClickListener(function1);
        }
    }

    public final void setOnItemClickTypeListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35967oKi interfaceC35967oKi = this.AEQbTJ;
        if (interfaceC35967oKi != null) {
            interfaceC35967oKi.setOnItemClickTypeListener(function1);
        }
    }

    public final void setOnLineHideListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35967oKi interfaceC35967oKi = this.AEQbTJ;
        if (interfaceC35967oKi != null) {
            interfaceC35967oKi.setOnLineHideListener(function1);
        }
    }

    public final void KWHzl() {
        InterfaceC35967oKi interfaceC35967oKi = this.AEQbTJ;
        if (interfaceC35967oKi != null) {
            interfaceC35967oKi.AEQbTJ();
        }
    }

    public final void setShowShareIcon(boolean z) {
        InterfaceC35967oKi interfaceC35967oKi = this.AEQbTJ;
        if (interfaceC35967oKi != null) {
            interfaceC35967oKi.setShowShareIcon(z);
        }
    }
}
