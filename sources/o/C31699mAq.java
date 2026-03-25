package o;

import com.airbnb.lottie.LottieAnimationView;
import com.okinc.core.widget.recycler.MaoRefreshView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31699mAq extends MaoRefreshView {
    public static boolean OLrzqt;
    public LottieAnimationView EZpvd;
    public android.widget.TextView KWHzl;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static int AEQbTJ = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31699mAq(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31699mAq(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.mAq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C31699mAq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public C31699mAq(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final LottieAnimationView OLrzqt() {
        LottieAnimationView lottieAnimationView = this.EZpvd;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.core.widget.recycler.MaoRefreshView
    public android.view.View AhwBna() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C52761wXj.Fragment.gGvvIC, (android.view.ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        if (AEQbTJ != -1) {
            ((android.widget.TextView) viewInflate.findViewById(C52761wXj.FragmentManager.QSLkRj)).setText(AEQbTJ);
        }
        android.view.View viewFindViewById = viewInflate.findViewById(C52761wXj.FragmentManager.Th);
        Intrinsics.copydefault(viewFindViewById, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById;
        this.EZpvd = (LottieAnimationView) viewInflate.findViewById(C52761wXj.FragmentManager.OHqIaq);
        return viewInflate;
    }

    @Override // com.okinc.core.widget.recycler.MaoRefreshView
    public void valueOf() {
        android.widget.TextView textView = this.KWHzl;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(getContext().getString(C33089mpq.EZpvd.EZpvd()));
        LottieAnimationView lottieAnimationViewOLrzqt = OLrzqt();
        lottieAnimationViewOLrzqt.cancelAnimation();
        lottieAnimationViewOLrzqt.setFrame(0);
    }

    public final void EZpvd(float f) {
        LottieAnimationView lottieAnimationViewOLrzqt = OLrzqt();
        lottieAnimationViewOLrzqt.cancelAnimation();
        lottieAnimationViewOLrzqt.setProgress(f);
    }

    @Override // com.okinc.core.widget.recycler.MaoRefreshView
    public void gEmmrt() {
        android.widget.TextView textView = this.KWHzl;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(getContext().getString(C33089mpq.EZpvd.KWHzl()));
        EZpvd();
        performHapticFeedback(0);
    }

    @Override // com.okinc.core.widget.recycler.MaoRefreshView
    public void djBIcL() {
        android.widget.TextView textView = this.KWHzl;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(getContext().getString(C33089mpq.EZpvd.valueOf()));
        EZpvd();
    }

    /* JADX DEBUG: Possible override for method com.okinc.core.widget.recycler.MaoRefreshView.EZpvd()I */
    public final void EZpvd() {
        LottieAnimationView lottieAnimationViewOLrzqt = OLrzqt();
        lottieAnimationViewOLrzqt.cancelAnimation();
        lottieAnimationViewOLrzqt.setMinAndMaxProgress(0.5f, 1.0f);
        lottieAnimationViewOLrzqt.addAnimatorListener(new StateListAnimator());
        lottieAnimationViewOLrzqt.playAnimation();
    }

    /* JADX INFO: renamed from: o.mAq$StateListAnimator */
    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public StateListAnimator() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C31699mAq.this.OLrzqt().setMinAndMaxProgress(0.0f, 1.0f);
        }
    }

    public void AYXKKw() {
        android.widget.TextView textView = this.KWHzl;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(getContext().getString(C33089mpq.EZpvd.djBIcL()));
        LottieAnimationView lottieAnimationViewOLrzqt = OLrzqt();
        lottieAnimationViewOLrzqt.cancelAnimation();
        lottieAnimationViewOLrzqt.setFrame(0);
    }

    public final void setTitleSize(int i) {
        android.widget.TextView textView = this.KWHzl;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setTextSize(2, i);
    }

    public final void setLottieJson(java.lang.String str) {
        OLrzqt().setAnimation(str);
    }

    public final LottieAnimationView copydefault() {
        LottieAnimationView lottieAnimationView = this.EZpvd;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.mAq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mAq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(boolean z) {
            C31699mAq.OLrzqt = z;
        }

        public final void KWHzl(int i) {
            C31699mAq.AEQbTJ = i;
        }

        public final int OLrzqt() {
            return C31699mAq.AEQbTJ;
        }
    }
}
