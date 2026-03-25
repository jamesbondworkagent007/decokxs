package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C41381qpj extends C40503qYg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41381qpj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41381qpj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.qpj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41381qpj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41381qpj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C40503qYg
    public void EZpvd(@NotNull C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        c55113xdn.setAnimation(C33492mxV.OLrzqt() ? "loading_market_double_night.lottie" : "loading_market_double.lottie");
    }

    @Override // o.C40503qYg
    public ConstraintLayout.LayoutParams EZpvd() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.leftToLeft = 0;
        layoutParams.topToTop = 0;
        layoutParams.rightToRight = 0;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.KWHzl(90.0f, context);
        return layoutParams;
    }

    @Override // o.C40503qYg
    public ConstraintLayout.LayoutParams OLrzqt() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.leftToLeft = 0;
        layoutParams.topToTop = 0;
        layoutParams.rightToRight = 0;
        return layoutParams;
    }
}
