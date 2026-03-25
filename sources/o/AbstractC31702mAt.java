package o;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: o.mAt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC31702mAt extends android.widget.LinearLayout {
    public int EZpvd;

    public abstract void AEQbTJ(boolean z);

    public abstract android.view.View OLrzqt();

    public abstract void copydefault();

    public AbstractC31702mAt(android.content.Context context) {
        this(context, null);
    }

    public AbstractC31702mAt(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC31702mAt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C55296xhK.AEQbTJ(layoutParams, 0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setPaddingRelative(0, 0, 0, 0);
        addView(OLrzqt(), new LinearLayout.LayoutParams(-1, -2));
        measure(-2, -2);
        this.EZpvd = getMeasuredHeight();
        setHeight(0);
    }

    public void setHeight(int i) {
        if (i < 0) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public void setVisiable() {
        setHeight(this.EZpvd);
    }

    public void setGone() {
        setHeight(0);
    }

    public void EZpvd() {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(getLayoutParams().height, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mAt.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                AbstractC31702mAt.this.setHeight(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfInt.start();
    }
}
