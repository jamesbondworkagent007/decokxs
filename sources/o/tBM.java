package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBM {
    public static final tBM copydefault = new tBM();

    private tBM() {
    }

    public static /* synthetic */ int formatTextColor$default(tBM tbm, java.lang.String str, android.content.Context context, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return tbm.OLrzqt(str, context, bool);
    }

    public final int OLrzqt(java.lang.String str, @NotNull android.content.Context context, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "");
        if (bool != null && Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if (C33129mqd.gEmmrt(str, 0)) {
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    public static /* synthetic */ int formatKlineColor$default(tBM tbm, java.lang.String str, android.content.Context context, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return tbm.EZpvd(str, context, bool);
    }

    public final int EZpvd(java.lang.String str, @NotNull android.content.Context context, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "");
        if (bool != null && Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if (C33129mqd.gEmmrt(str, 0)) {
            return C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        return C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    public final void copydefault(@NotNull android.view.View view, java.lang.String str) {
        GradientDrawable gradientDrawableKWHzl;
        Intrinsics.checkNotNullParameter(view, "");
        float dimension = view.getContext().getResources().getDimension(C47501trL.StateListAnimator.EZpvd);
        if (C33129mqd.gEmmrt(str, 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iIsConnected = c33512mxp.isConnected(context, 0.0f);
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iIsConnected2 = c33512mxp.isConnected(context2, 0.0f);
            android.content.Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            gradientDrawableKWHzl = KWHzl(new int[]{iIsConnected, iIsConnected2, c33512mxp.isConnected(context3, 0.185f)}, dimension);
        } else if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            gradientDrawableKWHzl = EZpvd(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), dimension);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context4 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            int iZLjUOn = c33512mxp2.zLjUOn(context4, 0.0f);
            android.content.Context context5 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            int iZLjUOn2 = c33512mxp2.zLjUOn(context5, 0.0f);
            android.content.Context context6 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            gradientDrawableKWHzl = KWHzl(new int[]{iZLjUOn, iZLjUOn2, c33512mxp2.zLjUOn(context6, 0.185f)}, dimension);
        }
        view.setBackground(gradientDrawableKWHzl);
    }

    public static final class Activity implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.ViewGroup KWHzl;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ android.animation.LayoutTransition copydefault;

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

        public Activity(android.view.ViewGroup viewGroup, android.animation.LayoutTransition layoutTransition, android.view.View view, Function0 function0) {
            this.KWHzl = viewGroup;
            this.copydefault = layoutTransition;
            this.AEQbTJ = view;
            this.OLrzqt = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.view.ViewGroup viewGroup = this.KWHzl;
            if (viewGroup != null) {
                viewGroup.setLayoutTransition(this.copydefault);
            }
            this.AEQbTJ.setVisibility(8);
            this.OLrzqt.invoke();
        }
    }

    public static final class StateListAnimator implements Animator.AnimatorListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.ViewGroup OLrzqt;
        public final /* synthetic */ android.animation.LayoutTransition copydefault;

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

        public StateListAnimator(android.view.ViewGroup viewGroup, android.animation.LayoutTransition layoutTransition, Function0 function0) {
            this.OLrzqt = viewGroup;
            this.copydefault = layoutTransition;
            this.AEQbTJ = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.view.ViewGroup viewGroup = this.OLrzqt;
            if (viewGroup != null) {
                viewGroup.setLayoutTransition(this.copydefault);
            }
            Function0 function0 = this.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final GradientDrawable KWHzl(int[] iArr, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(f);
        return gradientDrawable;
    }

    public final GradientDrawable EZpvd(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        return gradientDrawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tBM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playExpandAnimation$default(tBM tbm, android.view.View view, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        tbm.EZpvd(view, (Function0<Unit>) function0);
    }

    public final void EZpvd(@NotNull final android.view.View view, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        int i = view.getLayoutParams().height;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.animation.LayoutTransition layoutTransition = viewGroup != null ? viewGroup.getLayoutTransition() : null;
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(null);
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, measuredHeight);
        valueAnimatorOfInt.setDuration(230L);
        valueAnimatorOfInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                tBM.copydefault(view, valueAnimator);
            }
        });
        Intrinsics.copydefault(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new StateListAnimator(viewGroup, layoutTransition, function0));
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.start();
    }

    public static final void copydefault(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tBM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playCollapseAnimation$default(tBM tbm, android.view.View view, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.tBP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return tBM.EZpvd();
                }
            };
        }
        tbm.OLrzqt(view, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull final android.view.View view, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (view.getVisibility() != 0 || view.getHeight() == 0) {
            view.setVisibility(8);
            function0.invoke();
            return;
        }
        int height = view.getHeight();
        if (height <= 1) {
            view.setVisibility(8);
            function0.invoke();
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.animation.LayoutTransition layoutTransition = viewGroup != null ? viewGroup.getLayoutTransition() : null;
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(null);
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(height, 1);
        valueAnimatorOfInt.setDuration(230L);
        valueAnimatorOfInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                tBM.OLrzqt(view, valueAnimator);
            }
        });
        Intrinsics.copydefault(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new Activity(viewGroup, layoutTransition, view, function0));
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.start();
    }

    public static final void OLrzqt(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = iIntValue;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    public final void EZpvd(@NotNull android.view.View view, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        if (z && i > 0) {
            float dimension = view.getContext().getResources().getDimension(C47501trL.StateListAnimator.EZpvd);
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(i, iCopydefault);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(0);
            view.setForeground(gradientDrawable);
            return;
        }
        view.setForeground(null);
    }

    public final void KWHzl(@NotNull final android.view.View view, final boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        float f = z ? view.getContext().getResources().getDisplayMetrics().density * 1 : 0.0f;
        float[] fArr = new float[2];
        fArr[0] = z ? 0.3f * f : f;
        fArr[1] = z ? f : 0.0f;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(230L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                tBM.copydefault(view, z, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static final void copydefault(android.view.View view, boolean z, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        copydefault.EZpvd(view, z, (int) ((java.lang.Float) animatedValue).floatValue());
    }

    public final void AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setBackground(EZpvd(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), view.getContext().getResources().getDimension(C47501trL.StateListAnimator.EZpvd)));
    }
}
