package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25703jDf extends ConstraintLayout {
    public final C21622hGe KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25703jDf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25703jDf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.jDf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C25703jDf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25703jDf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C21622hGe.copydefault(android.view.LayoutInflater.from(context), this);
    }

    public final void setWinLossValues(int i, int i2) {
        android.widget.TextView textView = this.KWHzl.OLrzqt;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        textView.setText(C23271hvA.getNumberICUWithPrecision$default(c23271hvA, java.lang.String.valueOf(i), null, 1, null));
        this.KWHzl.KWHzl.setText(C23271hvA.getNumberICUWithPrecision$default(c23271hvA, java.lang.String.valueOf(i2), null, 1, null));
        int i3 = i2 + i;
        float f = i3 == 0 ? 0.5f : i == i3 ? 0.9f : i / i3;
        android.view.View view = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = f;
            view.setLayoutParams(layoutParams2);
            android.view.View view2 = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.weight = 1.0f - f;
                view2.setLayoutParams(layoutParams4);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void setWinLossValues(@NotNull java.util.List<java.lang.Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() >= 2) {
            setWinLossValues(list.get(0).intValue(), list.get(1).intValue());
        }
    }
}
