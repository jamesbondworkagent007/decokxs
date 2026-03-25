package o;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXY {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return "";
    }

    public static final <T> void KWHzl(@NotNull final oXR oxr, @NotNull java.util.List<? extends T> list, boolean z, @NotNull oXS oxs, @NotNull oXM oxm, @NotNull Function1<? super T, java.lang.String> function1, @NotNull Function1<? super T, java.lang.String> function12, @NotNull Function1<? super T, java.lang.Float> function13) {
        Intrinsics.checkNotNullParameter(oxr, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oxs, "");
        Intrinsics.checkNotNullParameter(oxm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                oXY.AEQbTJ(oxr, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new TaskDescription(oxr, oxs, list, z, oxm, function13, function1, function12));
        valueAnimatorOfFloat.start();
    }

    public static final void AEQbTJ(oXR oxr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        oxr.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }

    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ java.util.List<T> AEQbTJ;
        public final /* synthetic */ Function1<T, java.lang.String> AYXKKw;
        public final /* synthetic */ Function1<T, java.lang.String> EZpvd;
        public final /* synthetic */ Function1<T, java.lang.Float> KWHzl;
        public final /* synthetic */ oXM OLrzqt;
        public final /* synthetic */ oXS copydefault;
        public final /* synthetic */ oXR djBIcL;
        public final /* synthetic */ boolean gEmmrt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Float> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.String> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(oXR oxr, oXS oxs, java.util.List<? extends T> list, boolean z, oXM oxm, Function1<? super T, java.lang.Float> function1, Function1<? super T, java.lang.String> function12, Function1<? super T, java.lang.String> function13) {
            this.djBIcL = oxr;
            this.copydefault = oxs;
            this.AEQbTJ = list;
            this.gEmmrt = z;
            this.OLrzqt = oxm;
            this.KWHzl = function1;
            this.EZpvd = function12;
            this.AYXKKw = function13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.djBIcL.setDrawOption(this.copydefault);
            this.djBIcL.setData(this.AEQbTJ, false, this.gEmmrt, this.OLrzqt, this.KWHzl, this.EZpvd, this.AYXKKw);
            oXY.EZpvd(this.djBIcL);
        }
    }

    public static final void EZpvd(@NotNull final oXR oxr) {
        Intrinsics.checkNotNullParameter(oxr, "");
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oXZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                oXY.copydefault(oxr, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static final void copydefault(oXR oxr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        oxr.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }
}
