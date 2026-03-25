package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oGS implements View.OnTouchListener {
    public final android.view.ViewGroup AEQbTJ;
    public final int EZpvd;
    public final android.animation.ValueAnimator KWHzl;
    public final android.view.View OLrzqt;
    public boolean copydefault;

    public oGS(@NotNull android.view.View view, @NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.OLrzqt = view;
        this.AEQbTJ = viewGroup;
        this.EZpvd = i;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                oGS.EZpvd(this.KWHzl, valueAnimator);
            }
        });
        this.KWHzl = valueAnimatorOfFloat;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 android.view.View)
  (r2v0 android.view.ViewGroup)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (300 int) : (r3v0 int))
 A[MD:(android.view.View, android.view.ViewGroup, int):void (m)] (LINE:18) call: o.oGS.<init>(android.view.View, android.view.ViewGroup, int):void type: THIS */
    public /* synthetic */ oGS(android.view.View view, android.view.ViewGroup viewGroup, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, viewGroup, (i2 & 4) != 0 ? 300 : i);
    }

    public static final void EZpvd(oGS ogs, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float fDjBIcL = C33129mqd.djBIcL(valueAnimator.getAnimatedValue());
        ogs.OLrzqt.setScaleX(fDjBIcL);
        ogs.OLrzqt.setScaleY(fDjBIcL);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull android.view.View view, @NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.copydefault = false;
        } else if (action == 1) {
            this.AEQbTJ.requestDisallowInterceptTouchEvent(false);
            if (!this.copydefault) {
                view.performClick();
            }
        } else if (action == 2 && !this.copydefault && motionEvent.getEventTime() - motionEvent.getDownTime() > this.EZpvd) {
            this.AEQbTJ.requestDisallowInterceptTouchEvent(true);
            this.copydefault = true;
            android.animation.ValueAnimator valueAnimator = this.KWHzl;
            Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
            valueAnimator.addListener(new Application(view));
            this.KWHzl.start();
        }
        return true;
    }

    public static final class Application implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View EZpvd;

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

        public Application(android.view.View view) {
            this.EZpvd = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            oGS.this.OLrzqt.setScaleX(1.0f);
            oGS.this.OLrzqt.setScaleY(1.0f);
            oGS.this.KWHzl.removeAllListeners();
            this.EZpvd.performLongClick();
        }
    }
}
