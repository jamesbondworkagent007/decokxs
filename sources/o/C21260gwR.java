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

/* JADX INFO: renamed from: o.gwR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21260gwR extends TickerView {
    public final TaskDescription EZpvd;
    public Animator.AnimatorListener OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21260gwR(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new TaskDescription();
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21260gwR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new TaskDescription();
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21260gwR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new TaskDescription();
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.gwR$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public TaskDescription() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            C21260gwR c21260gwR = C21260gwR.this;
            c21260gwR.EZpvd(c21260gwR.OLrzqt);
            C21260gwR.this.OLrzqt = null;
            C21260gwR.this.EZpvd();
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

    public static /* synthetic */ void setTickerText$default(C21260gwR c21260gwR, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        c21260gwR.setTickerText(str, z, z2);
    }

    public final void setTickerText(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(this.OLrzqt);
        this.OLrzqt = null;
        setText(str, z);
        if (z2) {
            if (z) {
                TaskDescription taskDescription = this.EZpvd;
                this.OLrzqt = taskDescription;
                copydefault(taskDescription);
                return;
            }
            EZpvd();
        }
    }

    public final void EZpvd() {
        java.lang.String strDjBIcL = djBIcL();
        android.text.TextPaint textPaint = new android.text.TextPaint(this.uzCIH);
        int iKWHzl = KWHzl();
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int iEZpvd = C55302xhQ.EZpvd(resources);
        if (iKWHzl >= iEZpvd) {
            iKWHzl = iEZpvd;
        }
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
                if (C55298xhM.AhwBna(textSize3, r6) >= 28.0f || OLrzqt(copydefault(textPaint, 1.0f), strDjBIcL) >= f) {
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

    public final android.graphics.Paint copydefault(android.graphics.Paint paint, float f) {
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

    public final float OLrzqt(android.graphics.Paint paint, java.lang.String str) {
        float fMeasureText = paint.measureText(str);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return fMeasureText + (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0) + (getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) r0) : 0);
    }
}
