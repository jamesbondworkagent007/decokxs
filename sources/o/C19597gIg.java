package o;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19597gIg extends android.widget.FrameLayout {
    public final C17127ewt KWHzl;
    public final Activity OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19597gIg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19597gIg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.gIg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19597gIg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19597gIg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C17127ewt c17127ewtOLrzqt = C17127ewt.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        LottieAnimationView lottieAnimationView = c17127ewtOLrzqt.KWHzl;
        lottieAnimationView.setMinAndMaxFrame(69, 191);
        lottieAnimationView.setRepeatCount(-1);
        Intrinsics.checkNotNullExpressionValue(c17127ewtOLrzqt, "");
        this.KWHzl = c17127ewtOLrzqt;
        this.OLrzqt = new Activity();
    }

    /* JADX INFO: renamed from: o.gIg$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C19597gIg.this.KWHzl.EZpvd.removeAnimatorListener(this);
            C17127ewt c17127ewt = C19597gIg.this.KWHzl;
            LottieAnimationView lottieAnimationView = c17127ewt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(8);
            LottieAnimationView lottieAnimationView2 = c17127ewt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(0);
            c17127ewt.KWHzl.playAnimation();
        }
    }

    public final void OLrzqt() {
        C17127ewt c17127ewt = this.KWHzl;
        LottieAnimationView lottieAnimationView = c17127ewt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
        LottieAnimationView lottieAnimationView2 = c17127ewt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        lottieAnimationView2.setVisibility(0);
        c17127ewt.EZpvd.addAnimatorListener(this.OLrzqt);
        c17127ewt.EZpvd.playAnimation();
    }
}
