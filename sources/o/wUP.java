package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wUP extends C49908uxS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:10) call: o.wUP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wUP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wUP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ConstraintLayout constraintLayout = valueOf().EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = -1;
            layoutParams2.startToStart = 0;
            constraintLayout.setLayoutParams(layoutParams2);
            C55251xgS c55251xgS = valueOf().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            ViewGroup.LayoutParams layoutParams3 = c55251xgS.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.startToStart = -1;
                layoutParams4.endToEnd = 0;
                c55251xgS.setLayoutParams(layoutParams4);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void EZpvd(boolean z, int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (z) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            layoutParams2.setMarginEnd(C55298xhM.dp2px$default(52.0f, null, 1, null));
            layoutParams2.endToEnd = -1;
            layoutParams2.endToStart = i;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
            layoutParams2.setMarginEnd(0);
            layoutParams2.endToEnd = 0;
            layoutParams2.endToStart = -1;
            layoutParams2.matchConstraintDefaultWidth = 0;
        }
        setLayoutParams(layoutParams2);
        requestLayout();
    }
}
