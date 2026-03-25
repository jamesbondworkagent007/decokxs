package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pGX extends android.widget.FrameLayout {
    public InterfaceC35975oKq EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pGX(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIView(InterfaceC35975oKq interfaceC35975oKq) {
        this.EZpvd = interfaceC35975oKq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.pGX.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ pGX(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pGX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        android.view.View marketTitleSelectView$default = oka != null ? oKA.TaskDescription.getMarketTitleSelectView$default(oka, context, attributeSet, 0, 4, null) : null;
        InterfaceC35975oKq interfaceC35975oKq = marketTitleSelectView$default instanceof InterfaceC35975oKq ? (InterfaceC35975oKq) marketTitleSelectView$default : null;
        this.EZpvd = interfaceC35975oKq;
        if (interfaceC35975oKq != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35966oKh.ActionBar.copydefault);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.KWHzl = typedArrayObtainStyledAttributes.getInt(C35966oKh.ActionBar.AhwBna, 0);
            typedArrayObtainStyledAttributes.recycle();
            interfaceC35975oKq.setScreenOrientation(this.KWHzl);
            addView(interfaceC35975oKq.OLrzqt());
        }
    }

    public final void setData() {
        InterfaceC35975oKq interfaceC35975oKq = this.EZpvd;
        if (interfaceC35975oKq != null) {
            interfaceC35975oKq.setData(false);
        }
    }

    public final void setData(boolean z) {
        InterfaceC35975oKq interfaceC35975oKq = this.EZpvd;
        if (interfaceC35975oKq != null) {
            interfaceC35975oKq.setData(z);
        }
    }

    public final void setOnItemSelectListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35975oKq interfaceC35975oKq = this.EZpvd;
        if (interfaceC35975oKq != null) {
            interfaceC35975oKq.setOnItemSelectListener(function1);
        }
    }

    public final void EZpvd(boolean z) {
        InterfaceC35975oKq interfaceC35975oKq = this.EZpvd;
        if (interfaceC35975oKq != null) {
            interfaceC35975oKq.AEQbTJ(z);
        }
    }
}
