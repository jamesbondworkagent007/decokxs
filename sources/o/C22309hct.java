package o;

import android.animation.Animator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22309hct extends AppCompatImageView {
    public android.animation.ValueAnimator EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22309hct(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22309hct(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.hct.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22309hct(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22309hct(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "PullLoadingView";
        this.OLrzqt = 3;
    }

    public final void AEQbTJ() {
        android.animation.ValueAnimator valueAnimator = this.EZpvd;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            pUU.KWHzl(this.copydefault, "start pull loading!");
            android.animation.ValueAnimator valueAnimator2 = this.EZpvd;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 100, 0);
            this.EZpvd = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setRepeatMode(1);
            }
            android.animation.ValueAnimator valueAnimator3 = this.EZpvd;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatCount(-1);
            }
            android.animation.ValueAnimator valueAnimator4 = this.EZpvd;
            if (valueAnimator4 != null) {
                valueAnimator4.setDuration(300L);
            }
            android.animation.ValueAnimator valueAnimator5 = this.EZpvd;
            if (valueAnimator5 != null) {
                valueAnimator5.addListener(new Activity());
            }
            android.animation.ValueAnimator valueAnimator6 = this.EZpvd;
            if (valueAnimator6 != null) {
                valueAnimator6.start();
            }
        }
    }

    /* JADX INFO: renamed from: o.hct$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C22309hct c22309hct = C22309hct.this;
            c22309hct.setImageDrawable(ContextCompat.getDrawable(c22309hct.getContext(), C23274hvD.ActionBar.iZzfmt));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C22309hct.this.KWHzl++;
            int i = C22309hct.this.KWHzl % C22309hct.this.OLrzqt;
            int i2 = i != 1 ? i != 2 ? C23274hvD.ActionBar.iZzfmt : C23274hvD.ActionBar.AxsJAYaxsJAY : C23274hvD.ActionBar.hUfVAv;
            C22309hct c22309hct = C22309hct.this;
            c22309hct.setImageDrawable(ContextCompat.getDrawable(c22309hct.getContext(), i2));
        }
    }

    public final void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.EZpvd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        pUU.KWHzl(this.copydefault, "cancel pull loading!");
    }
}
