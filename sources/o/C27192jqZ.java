package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import com.immomo.mls.fun.constants.TextAlign;
import com.robinhood.ticker.TickerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27192jqZ extends TickerView {
    public final StateListAnimator EZpvd;
    public Animator.AnimatorListener copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27192jqZ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new StateListAnimator();
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27192jqZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new StateListAnimator();
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27192jqZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new StateListAnimator();
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.jqZ$StateListAnimator */
    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public StateListAnimator() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            C27192jqZ c27192jqZ = C27192jqZ.this;
            c27192jqZ.EZpvd(c27192jqZ.copydefault);
            C27192jqZ.this.copydefault = null;
            C27192jqZ.this.EZpvd();
        }
    }

    public final void OLrzqt() {
        setCharacterLists(C57862yqS.copydefault());
        setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.EZpvd));
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            setGravity((AhwBna() & 8388611) == 8388611 ? TextAlign.RIGHT : TextAlign.LEFT);
        }
    }

    public static /* synthetic */ void setTickerText$default(C27192jqZ c27192jqZ, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        c27192jqZ.setTickerText(str, z, z2);
    }

    public final void setTickerText(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(this.copydefault);
        this.copydefault = null;
        setText(str, z);
        if (z2) {
            if (z) {
                StateListAnimator stateListAnimator = this.EZpvd;
                this.copydefault = stateListAnimator;
                copydefault(stateListAnimator);
                return;
            }
            EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd() {
        java.lang.String strDjBIcL = djBIcL();
        android.text.TextPaint textPaint = new android.text.TextPaint(this.uzCIH);
        int iKWHzl = KWHzl();
        Intrinsics.copydefault((java.lang.Object) strDjBIcL);
        float f = iKWHzl;
        if (OLrzqt(textPaint, strDjBIcL) > f) {
            do {
                float textSize = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                textPaint.setTextSize(textSize - C55298xhM.djBIcL(1.0f, r6));
                float textSize2 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                if (C55298xhM.AhwBna(textSize2, r6) - 1.0f <= 9.0f) {
                    break;
                }
            } while (OLrzqt(textPaint, strDjBIcL) > f);
        } else {
            while (true) {
                float textSize3 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                if (C55298xhM.AhwBna(textSize3, r6) >= 28.0f || OLrzqt(OLrzqt(textPaint, 1.0f), strDjBIcL) >= f) {
                    break;
                }
                float textSize4 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                textPaint.setTextSize(textSize4 + C55298xhM.djBIcL(1.0f, r6));
            }
        }
        if (valueOf() == textPaint.getTextSize()) {
            return;
        }
        setTextSize(textPaint.getTextSize());
        setText("", false);
        setText(strDjBIcL, false);
    }

    private final android.graphics.Paint OLrzqt(android.graphics.Paint paint, float f) {
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        float textSize = paint2.getTextSize();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint2.setTextSize(textSize + C55298xhM.djBIcL(f, r1));
        return paint2;
    }

    private final int KWHzl() {
        if (getMeasuredWidth() <= 0) {
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        return getMeasuredWidth();
    }

    private final float OLrzqt(android.graphics.Paint paint, java.lang.String str) {
        float fMeasureText = paint.measureText(str);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return fMeasureText + (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0) + (getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) r0) : 0);
    }
}
