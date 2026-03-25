package o;

import android.animation.ValueAnimator;
import com.okinc.cruilib.extension.SlideDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mHr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31889mHr {

    /* JADX INFO: renamed from: o.mHr$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SlideDirection.values().length];
            try {
                iArr[SlideDirection.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SlideDirection.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SlideDirection.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SlideDirection.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    public static /* synthetic */ void crossFadeTo$default(android.view.View view, android.view.View view2, boolean z, long j, java.lang.Long l, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            l = 0L;
        }
        copydefault(view, view2, z, j, l, function0);
    }

    public static final void EZpvd(Function0<Unit> function0, boolean z, android.view.View view) {
        function0.invoke();
        if (z) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.mHr$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        public TaskDescription(Function0<Unit> function0, boolean z, android.view.View view) {
            this.EZpvd = function0;
            this.AEQbTJ = z;
            this.copydefault = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C31889mHr.EZpvd(this.EZpvd, this.AEQbTJ, this.copydefault);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C31889mHr.EZpvd(this.EZpvd, this.AEQbTJ, this.copydefault);
        }
    }

    public static final void copydefault(@NotNull android.view.View view, android.view.View view2, boolean z, long j, java.lang.Long l, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        TaskDescription taskDescription = new TaskDescription(function0, z, view);
        view.setAlpha(f);
        view.setVisibility(0);
        view.animate().alpha(f2).setDuration(j).setStartDelay(l != null ? l.longValue() : 0L).setListener(taskDescription);
        if (view2 != null) {
            view2.setAlpha(f2);
            view2.setVisibility(0);
            view2.animate().alpha(f).setDuration(j).setStartDelay(l != null ? l.longValue() : 0L).setListener(taskDescription);
        }
    }

    public static /* synthetic */ void fadeIn$default(android.view.View view, long j, java.lang.Long l, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = 0L;
        }
        AEQbTJ(view, j, l, function0);
    }

    /* JADX INFO: renamed from: o.mHr$StateListAnimator */
    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> EZpvd;

        public StateListAnimator(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.EZpvd.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.EZpvd.invoke();
        }
    }

    public static final void AEQbTJ(@NotNull android.view.View view, long j, java.lang.Long l, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        StateListAnimator stateListAnimator = new StateListAnimator(function0);
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(j).setStartDelay(l != null ? l.longValue() : 0L).setListener(stateListAnimator);
    }

    public static /* synthetic */ void fadeOut$default(android.view.View view, long j, java.lang.Long l, java.lang.Integer num, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = 0L;
        }
        java.lang.Long l2 = l;
        if ((i & 4) != 0) {
            num = 8;
        }
        OLrzqt(view, j, l2, num, function0);
    }

    public static final void copydefault(Function0<Unit> function0, android.view.View view, java.lang.Integer num) {
        function0.invoke();
        view.setVisibility(num != null ? num.intValue() : 8);
    }

    /* JADX INFO: renamed from: o.mHr$Application */
    public static final class Application extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ java.lang.Integer KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        public Application(Function0<Unit> function0, android.view.View view, java.lang.Integer num) {
            this.OLrzqt = function0;
            this.copydefault = view;
            this.KWHzl = num;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C31889mHr.copydefault(this.OLrzqt, this.copydefault, this.KWHzl);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C31889mHr.copydefault(this.OLrzqt, this.copydefault, this.KWHzl);
        }
    }

    public static final void OLrzqt(@NotNull android.view.View view, long j, java.lang.Long l, java.lang.Integer num, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Application application = new Application(function0, view, num);
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view.animate().alpha(0.0f).setDuration(j).setStartDelay(l != null ? l.longValue() : 0L).setListener(application);
    }

    public static /* synthetic */ void heightChange$default(android.view.View view, int i, long j, boolean z, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        KWHzl(view, i, j, z2, function0);
    }

    public static final void KWHzl(@NotNull final android.view.View view, int i, long j, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        int height = view.getHeight();
        if (height == i) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (z) {
                view.getLayoutParams().height = i;
                view.requestLayout();
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            Activity activity = new Activity(function0);
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(height, i);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mHx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    C31889mHr.copydefault(view, valueAnimator);
                }
            });
            valueAnimatorOfInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
            valueAnimatorOfInt.addListener(activity);
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: o.mHr$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> EZpvd;

        public Activity(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void copydefault(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        view.getLayoutParams().height = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
    }

    public static /* synthetic */ void widthChange$default(android.view.View view, int i, long j, boolean z, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        AEQbTJ(view, i, j, z2, function0);
    }

    public static final void AEQbTJ(@NotNull final android.view.View view, int i, long j, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        int width = view.getWidth();
        if (width == i) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (z) {
                view.getLayoutParams().width = i;
                view.requestLayout();
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            PendingIntent pendingIntent = new PendingIntent(function0);
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(width, i);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mHz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    C31889mHr.EZpvd(view, valueAnimator);
                }
            });
            valueAnimatorOfInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
            valueAnimatorOfInt.addListener(pendingIntent);
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: o.mHr$PendingIntent */
    public static final class PendingIntent extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> KWHzl;

        public PendingIntent(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function0<Unit> function0 = this.KWHzl;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function0<Unit> function0 = this.KWHzl;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void EZpvd(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        view.getLayoutParams().width = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
    }

    public static /* synthetic */ void slideInFromLeft$default(android.view.View view, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        OLrzqt(view, j, (Function0<Unit>) function0);
    }

    public static final void OLrzqt(@NotNull final android.view.View view, final long j, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: o.mHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31889mHr.copydefault(view, j, function0);
            }
        });
    }

    public static final void copydefault(final android.view.View view, long j, final Function0 function0) {
        view.setTranslationX(-view.getWidth());
        view.setVisibility(0);
        view.animate().translationX(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(j).setListener(null).withEndAction(new java.lang.Runnable() { // from class: o.mHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31889mHr.EZpvd(view, function0);
            }
        }).start();
    }

    public static final void EZpvd(android.view.View view, Function0 function0) {
        view.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void slideOutToLeft$default(android.view.View view, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        EZpvd(view, j, (Function0<Unit>) function0);
    }

    public static final void EZpvd(@NotNull final android.view.View view, long j, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        view.animate().translationX(-view.getWidth()).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(j).withEndAction(new java.lang.Runnable() { // from class: o.mHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31889mHr.djBIcL(view, function0);
            }
        }).start();
    }

    public static final void djBIcL(android.view.View view, Function0 function0) {
        view.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void slideOffScreen$default(android.view.View view, SlideDirection slideDirection, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        EZpvd(view, slideDirection, j, function0);
    }

    public static final void EZpvd(@NotNull final android.view.View view, @NotNull SlideDirection slideDirection, long j, final Function0<Unit> function0) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(slideDirection, "");
        int i = ActionBar.copydefault[slideDirection.ordinal()];
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        if (i == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(-view.getWidth()), fValueOf);
        } else if (i == 2) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(view.getWidth()), fValueOf);
        } else if (i == 3) {
            pairOLrzqt = C56390yDp.OLrzqt(fValueOf, java.lang.Float.valueOf(-view.getHeight()));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            pairOLrzqt = C56390yDp.OLrzqt(fValueOf, java.lang.Float.valueOf(view.getHeight()));
        }
        view.animate().translationX(((java.lang.Number) pairOLrzqt.component1()).floatValue()).translationY(((java.lang.Number) pairOLrzqt.component2()).floatValue()).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(j).withEndAction(new java.lang.Runnable() { // from class: o.mHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31889mHr.copydefault(view, function0);
            }
        }).start();
    }

    public static final void copydefault(android.view.View view, Function0 function0) {
        view.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void slideOnScreen$default(android.view.View view, SlideDirection slideDirection, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        copydefault(view, slideDirection, j, function0);
    }

    public static final void copydefault(@NotNull final android.view.View view, @NotNull final SlideDirection slideDirection, final long j, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(slideDirection, "");
        view.post(new java.lang.Runnable() { // from class: o.mHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31889mHr.OLrzqt(slideDirection, view, j, function0);
            }
        });
    }

    public static final void OLrzqt(SlideDirection slideDirection, android.view.View view, long j, final Function0 function0) {
        kotlin.Pair pairOLrzqt;
        int i = ActionBar.copydefault[slideDirection.ordinal()];
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        if (i == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(-view.getWidth()), fValueOf);
        } else if (i == 2) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(view.getWidth()), fValueOf);
        } else if (i == 3) {
            pairOLrzqt = C56390yDp.OLrzqt(fValueOf, java.lang.Float.valueOf(-view.getHeight()));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            pairOLrzqt = C56390yDp.OLrzqt(fValueOf, java.lang.Float.valueOf(view.getHeight()));
        }
        float fFloatValue = ((java.lang.Number) pairOLrzqt.component1()).floatValue();
        float fFloatValue2 = ((java.lang.Number) pairOLrzqt.component2()).floatValue();
        view.setTranslationX(fFloatValue);
        view.setTranslationY(fFloatValue2);
        view.setVisibility(0);
        view.animate().translationX(0.0f).translationY(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(j).setListener(null).withEndAction(new java.lang.Runnable() { // from class: o.mHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31889mHr.copydefault(function0);
            }
        }).start();
    }

    public static final void copydefault(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }
}
