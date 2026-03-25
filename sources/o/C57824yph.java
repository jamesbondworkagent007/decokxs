package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Animation;

/* JADX INFO: renamed from: o.yph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57824yph {
    public static android.view.animation.Animation EZpvd(android.view.View view, float f, float f2, int i, android.view.animation.Interpolator interpolator, Animation.AnimationListener animationListener) {
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(i);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public static android.animation.ValueAnimator KWHzl(final android.view.View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration(i);
        valueAnimator.setIntValues(i2, i3);
        valueAnimator.setEvaluator(new android.animation.ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yph.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                view.setBackgroundColor(((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public static android.view.animation.Animation OLrzqt(android.view.View view, int i, android.view.animation.Interpolator interpolator, Animation.AnimationListener animationListener) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
