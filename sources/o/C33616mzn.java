package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.WindowManager;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: renamed from: o.mzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33616mzn {
    public static android.animation.ArgbEvaluator KWHzl = new android.animation.ArgbEvaluator();
    public static final android.view.animation.Interpolator OLrzqt = new FastOutSlowInInterpolator();
    public static final android.view.animation.Interpolator EZpvd = new FastOutLinearInInterpolator();
    public static final android.view.animation.Interpolator AYXKKw = new LinearOutSlowInInterpolator();
    public static final android.view.animation.Interpolator copydefault = new android.view.animation.AccelerateInterpolator();
    public static final android.view.animation.Interpolator AEQbTJ = new android.view.animation.DecelerateInterpolator();
    public static final android.view.animation.Interpolator valueOf = C33619mzq.AEQbTJ();
    public static final android.view.animation.Interpolator djBIcL = new android.view.animation.LinearInterpolator();

    public static android.animation.ObjectAnimator EZpvd(android.view.View view, int i, android.view.animation.Interpolator interpolator, Animator.AnimatorListener animatorListener, float... fArr) {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, fArr).setDuration(i);
        duration.setInterpolator(interpolator);
        if (animatorListener != null) {
            duration.addListener(animatorListener);
        }
        return duration;
    }

    public static android.animation.ObjectAnimator copydefault(android.view.View view, int i, android.view.animation.Interpolator interpolator, Animator.AnimatorListener animatorListener, float... fArr) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, fArr);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.setInterpolator(interpolator);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        return objectAnimatorOfFloat;
    }

    public static android.animation.ValueAnimator KWHzl(int i, android.animation.TimeInterpolator timeInterpolator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener, java.lang.Object... objArr) {
        android.animation.ValueAnimator valueAnimatorOfObject = android.animation.ValueAnimator.ofObject(KWHzl, objArr);
        valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        if (animatorListener != null) {
            valueAnimatorOfObject.addListener(animatorListener);
        }
        valueAnimatorOfObject.setDuration(i);
        valueAnimatorOfObject.setInterpolator(timeInterpolator);
        return valueAnimatorOfObject;
    }

    public static android.animation.AnimatorSet copydefault(android.animation.Animator... animatorArr) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    public static android.animation.Animator KWHzl(final android.view.Window window, int i, android.view.animation.Interpolator interpolator, float... fArr) {
        final WindowManager.LayoutParams attributes = window.getAttributes();
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(fArr).setDuration(i);
        duration.setInterpolator(interpolator);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mzn.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                attributes.dimAmount = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                window.setAttributes(attributes);
            }
        });
        return duration;
    }
}
