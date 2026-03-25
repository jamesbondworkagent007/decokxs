package o;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZJ {
    public static final iZJ OLrzqt = new iZJ();

    private iZJ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iZJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateExpandCollapse$default(iZJ izj, android.view.View view, boolean z, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        izj.EZpvd(view, z, map);
    }

    public final void EZpvd(@NotNull final android.view.View view, boolean z, @NotNull final java.util.Map<android.view.View, android.animation.ValueAnimator> map) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.animation.ValueAnimator valueAnimator = map.get(view);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        map.remove(view);
        if (!z) {
            int height = view.getHeight();
            if (height > 0) {
                android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(height, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.iZK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                        iZJ.AEQbTJ(view, valueAnimator2);
                    }
                });
                valueAnimatorOfInt.addListener(new Application(view, map));
                valueAnimatorOfInt.start();
                map.put(view, valueAnimatorOfInt);
                return;
            }
            view.setVisibility(8);
            view.getLayoutParams().height = 0;
            return;
        }
        view.setVisibility(0);
        view.getLayoutParams().height = 0;
        view.requestLayout();
        view.post(new java.lang.Runnable() { // from class: o.iZN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                iZJ.copydefault(view, map);
            }
        });
    }

    public static final void copydefault(final android.view.View view, java.util.Map map) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        int width = viewGroup != null ? viewGroup.getWidth() : view.getWidth();
        if (width > 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight > 0) {
                android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, measuredHeight);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.iZL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        iZJ.KWHzl(view, valueAnimator);
                    }
                });
                valueAnimatorOfInt.addListener(new ActionBar(view, map));
                valueAnimatorOfInt.start();
                map.put(view, valueAnimatorOfInt);
                return;
            }
            view.getLayoutParams().height = -2;
            view.requestLayout();
            return;
        }
        view.getLayoutParams().height = -2;
        view.requestLayout();
    }

    public static final void KWHzl(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        view.getLayoutParams().height = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
    }

    public static final class ActionBar extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ java.util.Map<android.view.View, android.animation.ValueAnimator> KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        public ActionBar(android.view.View view, java.util.Map<android.view.View, android.animation.ValueAnimator> map) {
            this.copydefault = view;
            this.KWHzl = map;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault.getLayoutParams().height = -2;
            this.copydefault.requestLayout();
            this.KWHzl.remove(this.copydefault);
        }
    }

    public static final void AEQbTJ(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        view.getLayoutParams().height = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
    }

    public static final class Application extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.util.Map<android.view.View, android.animation.ValueAnimator> EZpvd;

        public Application(android.view.View view, java.util.Map<android.view.View, android.animation.ValueAnimator> map) {
            this.AEQbTJ = view;
            this.EZpvd = map;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.setVisibility(8);
            this.AEQbTJ.getLayoutParams().height = 0;
            this.EZpvd.remove(this.AEQbTJ);
        }
    }
}
