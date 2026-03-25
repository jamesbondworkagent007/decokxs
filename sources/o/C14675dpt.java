package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14675dpt {
    public static final C14675dpt copydefault = new C14675dpt();

    private C14675dpt() {
    }

    public final android.animation.ObjectAnimator copydefault(android.view.View view, float f, float f2, long j) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", f, f2);
        objectAnimatorOfFloat.setDuration(j);
        Intrinsics.copydefault(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    public final android.animation.ObjectAnimator EZpvd(@NotNull android.view.View view, long j) {
        Intrinsics.checkNotNullParameter(view, "");
        android.animation.ObjectAnimator objectAnimatorCopydefault = copydefault(view, 0.0f, 1.0f, j);
        objectAnimatorCopydefault.addListener(new Application(view));
        return objectAnimatorCopydefault;
    }

    public final android.animation.ObjectAnimator OLrzqt(@NotNull android.view.View view, long j) {
        Intrinsics.checkNotNullParameter(view, "");
        android.animation.ObjectAnimator objectAnimatorCopydefault = copydefault(view, 1.0f, 0.0f, j);
        objectAnimatorCopydefault.addListener(new ActionBar(view));
        return objectAnimatorCopydefault;
    }

    public final android.animation.ValueAnimator copydefault(final android.view.View view, int i, int i2, long j, final ViewGroup.LayoutParams layoutParams) {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.dpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C14675dpt.AEQbTJ(layoutParams, view, valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfInt.setStartDelay(100L);
        valueAnimatorOfInt.setDuration(j);
        Intrinsics.copydefault(valueAnimatorOfInt);
        return valueAnimatorOfInt;
    }

    public static final void AEQbTJ(ViewGroup.LayoutParams layoutParams, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    public final android.animation.ValueAnimator copydefault(@NotNull android.view.View view, int i, long j) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams);
        android.animation.ValueAnimator valueAnimatorCopydefault = copydefault(view, 0, i, j, layoutParams);
        valueAnimatorCopydefault.addListener(new Activity(layoutParams, view));
        valueAnimatorCopydefault.addListener(new StateListAnimator(view));
        return valueAnimatorCopydefault;
    }

    public final android.animation.ValueAnimator AEQbTJ(@NotNull android.view.View view, long j) {
        Intrinsics.checkNotNullParameter(view, "");
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams);
        android.animation.ValueAnimator valueAnimatorCopydefault = copydefault(view, height, 0, j, layoutParams);
        valueAnimatorCopydefault.addListener(new TaskDescription(view));
        return valueAnimatorCopydefault;
    }

    /* JADX INFO: renamed from: o.dpt$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar(android.view.View view) {
            this.OLrzqt = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: o.dpt$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ViewGroup.LayoutParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity(ViewGroup.LayoutParams layoutParams, android.view.View view) {
            this.copydefault = layoutParams;
            this.OLrzqt = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault.height = 0;
            this.OLrzqt.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o.dpt$Application */
    public static final class Application implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Application(android.view.View view) {
            this.KWHzl = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.KWHzl.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: o.dpt$StateListAnimator */
    public static final class StateListAnimator implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public StateListAnimator(android.view.View view) {
            this.copydefault = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault.requestLayout();
        }
    }

    /* JADX INFO: renamed from: o.dpt$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription(android.view.View view) {
            this.KWHzl = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.KWHzl.setVisibility(8);
            this.KWHzl.requestLayout();
        }
    }
}
