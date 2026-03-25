package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30677lff extends AbstractC30687lfp<C21661hHq> implements InterfaceC30586ldu {
    public int AYXKKw;
    public android.animation.ValueAnimator AhwBna;
    public Function0<Unit> KWHzl;
    public android.animation.ValueAnimator OLrzqt;
    public boolean copydefault = true;
    public android.animation.ValueAnimator gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String EZpvd = java.lang.String.valueOf(C56524yIo.AEQbTJ(C30677lff.class).valueOf());

    @Override // o.InterfaceC30586ldu
    public void KWHzl() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21661hHq copydefault(C30677lff c30677lff) {
        return (C21661hHq) c30677lff.fARcdN();
    }

    /* JADX INFO: renamed from: o.lff$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lff.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C30677lff KWHzl() {
            return new C30677lff();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21661hHq OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21661hHq c21661hHqOLrzqt = C21661hHq.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21661hHqOLrzqt, "");
        return c21661hHqOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C21661hHq c21661hHq, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21661hHq, "");
        if (C33492mxV.OLrzqt()) {
            c21661hHq.KWHzl.setImageResource(C57406yhn.Activity.djSkpj);
            c21661hHq.AYXKKw.setImageResource(C57406yhn.Activity.djSkpj);
        } else {
            c21661hHq.KWHzl.setImageResource(C57406yhn.Activity.RcXXUw);
            c21661hHq.AYXKKw.setImageResource(C57406yhn.Activity.RcXXUw);
        }
        gEmmrt();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.lfe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30677lff.EZpvd(this.copydefault);
                }
            });
        }
    }

    public static final void EZpvd(C30677lff c30677lff) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30677lff, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        android.widget.FrameLayout frameLayout;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        android.widget.FrameLayout frameLayout2;
        if (isAdded()) {
            if (C23317hvu.getNewProxyInstance()) {
                C21661hHq c21661hHq = (C21661hHq) fARcdN();
                if (c21661hHq != null && (frameLayout2 = c21661hHq.gEmmrt) != null) {
                    frameLayout2.setVisibility(8);
                }
                C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
                if (c21661hHq2 != null && (lottieAnimationView2 = c21661hHq2.AYXKKw) != null) {
                    lottieAnimationView2.setVisibility(8);
                }
                C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
                if (c21661hHq3 != null && (lottieAnimationView = c21661hHq3.KWHzl) != null) {
                    lottieAnimationView.setVisibility(0);
                }
                C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
                if (c21661hHq4 != null && (frameLayout = c21661hHq4.AEQbTJ) != null) {
                    frameLayout.setVisibility(8);
                }
                djBIcL();
                return;
            }
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            AdvancedMainFragment advancedMainFragment = parentFragment instanceof AdvancedMainFragment ? (AdvancedMainFragment) parentFragment : null;
            if (advancedMainFragment != null) {
                advancedMainFragment.EZpvd();
            }
        }
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (isAdded()) {
            pUU.KWHzl(getTAG(), "setHideKLineCallback");
            this.KWHzl = function0;
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(java.lang.String.valueOf(C56524yIo.AEQbTJ(C30616leX.class).valueOf()));
            if (fragmentFindFragmentByTag != null) {
                C30616leX c30616leX = fragmentFindFragmentByTag instanceof C30616leX ? (C30616leX) fragmentFindFragmentByTag : null;
                if (c30616leX != null) {
                    c30616leX.OLrzqt(function0);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(int i) {
        C31699mAq c31699mAq;
        C31699mAq c31699mAq2;
        LottieAnimationView lottieAnimationView;
        C21661hHq c21661hHq;
        C21661hHq c21661hHq2;
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        if (i > 0 && (((c21661hHq = (C21661hHq) fARcdN()) == null || (frameLayout2 = c21661hHq.gEmmrt) == null || frameLayout2.getVisibility() != 0) && (c21661hHq2 = (C21661hHq) fARcdN()) != null && (frameLayout = c21661hHq2.gEmmrt) != null)) {
            frameLayout.setVisibility(0);
        }
        C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
        if (c21661hHq3 != null && (lottieAnimationView = c21661hHq3.AYXKKw) != null) {
            lottieAnimationView.setVisibility(0);
        }
        float f = i;
        C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
        float fDjBIcL = f / (C33129mqd.djBIcL((c21661hHq4 == null || (c31699mAq2 = c21661hHq4.AhwBna) == null) ? null : java.lang.Integer.valueOf(c31699mAq2.getMeasuredHeight())) * 2);
        C21661hHq c21661hHq5 = (C21661hHq) fARcdN();
        if (c21661hHq5 == null || (c31699mAq = c21661hHq5.AhwBna) == null) {
            return;
        }
        if (C33129mqd.AEQbTJ(java.lang.Float.valueOf(fDjBIcL), java.lang.Float.valueOf(0.5f))) {
            fDjBIcL = 0.5f;
        }
        c31699mAq.EZpvd(fDjBIcL);
    }

    /* JADX INFO: renamed from: o.lff$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
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

        public TaskDescription() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C30677lff.this.AYXKKw();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        C22309hct c22309hct;
        android.widget.LinearLayout linearLayout;
        C31699mAq c31699mAq;
        C31699mAq c31699mAq2;
        pUU.KWHzl(EZpvd, "pullControl  " + z);
        C21661hHq c21661hHq = (C21661hHq) fARcdN();
        if (c21661hHq != null && (c31699mAq2 = c21661hHq.AhwBna) != null) {
            c31699mAq2.AYXKKw();
        }
        C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
        if (c21661hHq2 != null && (c31699mAq = c21661hHq2.AhwBna) != null) {
            c31699mAq.setVisibility(8);
        }
        C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
        if (c21661hHq3 != null && (linearLayout = c21661hHq3.djBIcL) != null) {
            linearLayout.setVisibility(0);
        }
        C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
        if (c21661hHq4 != null && (c22309hct = c21661hHq4.EZpvd) != null) {
            c22309hct.AEQbTJ();
        }
        if (this.copydefault) {
            this.copydefault = false;
            C25352ivB.startVibrator$default(0L, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z, @NotNull Function0<Unit> function0) {
        android.widget.FrameLayout frameLayout;
        android.widget.TextView textView;
        C22309hct c22309hct;
        C22309hct c22309hct2;
        LottieAnimationView lottieAnimationView;
        android.widget.FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(function0, "");
        pUU.KWHzl(EZpvd, "stateChangeControl  " + z);
        if (z) {
            C21661hHq c21661hHq = (C21661hHq) fARcdN();
            if (c21661hHq != null && (frameLayout2 = c21661hHq.gEmmrt) != null) {
                frameLayout2.setVisibility(8);
            }
            C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
            if (c21661hHq2 != null && (lottieAnimationView = c21661hHq2.AYXKKw) != null) {
                lottieAnimationView.setVisibility(8);
            }
            djBIcL();
        } else {
            valueOf();
        }
        C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
        if (c21661hHq3 != null && (c22309hct2 = c21661hHq3.EZpvd) != null) {
            c22309hct2.OLrzqt();
        }
        C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
        if (c21661hHq4 != null && (c22309hct = c21661hHq4.EZpvd) != null) {
            c22309hct.setAlpha(1.0f);
        }
        C21661hHq c21661hHq5 = (C21661hHq) fARcdN();
        if (c21661hHq5 != null && (textView = c21661hHq5.copydefault) != null) {
            textView.setAlpha(1.0f);
        }
        C21661hHq c21661hHq6 = (C21661hHq) fARcdN();
        if (c21661hHq6 != null && (frameLayout = c21661hHq6.AEQbTJ) != null) {
            frameLayout.setAlpha(1.0f);
        }
        this.KWHzl = function0;
        this.copydefault = true;
    }

    public final void djBIcL() {
        if (isAdded()) {
            java.lang.String strValueOf = java.lang.String.valueOf(C56524yIo.AEQbTJ(C30616leX.class).valueOf());
            if (getChildFragmentManager().findFragmentByTag(strValueOf) != null) {
                return;
            }
            getChildFragmentManager().beginTransaction().replace(C23274hvD.Application.putCallback, C30616leX.Companion.KWHzl(this.KWHzl), strValueOf).commitNowAllowingStateLoss();
            C23317hvu.fetchVPNInfo(true);
            values();
        }
    }

    public final void values() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag;
        if (isAdded() && (fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(java.lang.String.valueOf(C56524yIo.AEQbTJ(C30616leX.class).valueOf()))) != null) {
            C30616leX c30616leX = fragmentFindFragmentByTag instanceof C30616leX ? (C30616leX) fragmentFindFragmentByTag : null;
            if (c30616leX != null) {
                c30616leX.copydefault(new Function1() { // from class: o.lfh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30677lff.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C30677lff c30677lff, boolean z) {
        android.widget.FrameLayout frameLayout;
        LottieAnimationView lottieAnimationView;
        C21661hHq c21661hHq = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq != null && (lottieAnimationView = c21661hHq.KWHzl) != null) {
            lottieAnimationView.setVisibility(z ? 0 : 8);
        }
        C21661hHq c21661hHq2 = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq2 != null && (frameLayout = c21661hHq2.AEQbTJ) != null) {
            frameLayout.setVisibility(z ^ true ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        C31699mAq c31699mAq;
        LottieAnimationView lottieAnimationView;
        C31699mAq c31699mAq2;
        C22309hct c22309hct;
        android.widget.LinearLayout linearLayout;
        pUU.KWHzl(EZpvd, "loadingControl " + z);
        if (z) {
            C21661hHq c21661hHq = (C21661hHq) fARcdN();
            if (c21661hHq != null && (linearLayout = c21661hHq.djBIcL) != null) {
                linearLayout.setVisibility(8);
            }
            C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
            if (c21661hHq2 != null && (c22309hct = c21661hHq2.EZpvd) != null) {
                c22309hct.OLrzqt();
            }
            C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
            if (c21661hHq3 == null || (c31699mAq2 = c21661hHq3.AhwBna) == null) {
                return;
            }
            c31699mAq2.djBIcL();
            return;
        }
        C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
        if (c21661hHq4 != null && (lottieAnimationView = c21661hHq4.KWHzl) != null) {
            lottieAnimationView.setVisibility(8);
        }
        C21661hHq c21661hHq5 = (C21661hHq) fARcdN();
        if (c21661hHq5 == null || (c31699mAq = c21661hHq5.AhwBna) == null) {
            return;
        }
        c31699mAq.AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        LottieAnimationView lottieAnimationView;
        if (!z) {
            C21661hHq c21661hHq = (C21661hHq) fARcdN();
            if (c21661hHq != null && (lottieAnimationView = c21661hHq.KWHzl) != null) {
                lottieAnimationView.setVisibility(0);
            }
            C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
            if (c21661hHq2 == null || (frameLayout2 = c21661hHq2.gEmmrt) == null) {
                return;
            }
            frameLayout2.setVisibility(8);
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.AhwBna;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.gEmmrt;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(10.0f, 0.0f);
        this.AhwBna = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.lfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                C30677lff.EZpvd(this.OLrzqt, valueAnimator3);
            }
        });
        valueAnimatorOfFloat.addListener(new ActionBar());
        valueAnimatorOfFloat.start();
        C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
        int measuredHeight = (c21661hHq3 == null || (frameLayout = c21661hHq3.gEmmrt) == null) ? 0 : frameLayout.getMeasuredHeight();
        this.AYXKKw = measuredHeight;
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(measuredHeight, 0);
        this.gEmmrt = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(400L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.lfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                C30677lff.AYXKKw(this.OLrzqt, valueAnimator3);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C30677lff c30677lff, android.animation.ValueAnimator valueAnimator) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        android.widget.TextView textView;
        C22309hct c22309hct;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        float fFloatValue = ((java.lang.Float) animatedValue).floatValue() / 10;
        pUU.KWHzl(EZpvd, "hidePullRefresh alpha: " + fFloatValue);
        C21661hHq c21661hHq = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq != null && (c22309hct = c21661hHq.EZpvd) != null) {
            c22309hct.setAlpha(fFloatValue);
        }
        C21661hHq c21661hHq2 = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq2 != null && (textView = c21661hHq2.copydefault) != null) {
            textView.setAlpha(fFloatValue);
        }
        C21661hHq c21661hHq3 = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq3 != null && (lottieAnimationView2 = c21661hHq3.AYXKKw) != null) {
            lottieAnimationView2.setAlpha(fFloatValue);
        }
        C21661hHq c21661hHq4 = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq4 == null || (lottieAnimationView = c21661hHq4.KWHzl) == null) {
            return;
        }
        lottieAnimationView.setAlpha(1.0f - fFloatValue);
    }

    /* JADX INFO: renamed from: o.lff$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            LottieAnimationView lottieAnimationView;
            LottieAnimationView lottieAnimationView2;
            Intrinsics.checkNotNullParameter(animator, "");
            C21661hHq c21661hHqCopydefault = C30677lff.copydefault(C30677lff.this);
            if (c21661hHqCopydefault != null && (lottieAnimationView2 = c21661hHqCopydefault.KWHzl) != null) {
                lottieAnimationView2.setVisibility(0);
            }
            C21661hHq c21661hHqCopydefault2 = C30677lff.copydefault(C30677lff.this);
            if (c21661hHqCopydefault2 == null || (lottieAnimationView = c21661hHqCopydefault2.KWHzl) == null) {
                return;
            }
            lottieAnimationView.setAlpha(0.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            LottieAnimationView lottieAnimationView;
            LottieAnimationView lottieAnimationView2;
            Intrinsics.checkNotNullParameter(animator, "");
            C21661hHq c21661hHqCopydefault = C30677lff.copydefault(C30677lff.this);
            if (c21661hHqCopydefault != null && (lottieAnimationView2 = c21661hHqCopydefault.AYXKKw) != null) {
                lottieAnimationView2.setVisibility(8);
            }
            C21661hHq c21661hHqCopydefault2 = C30677lff.copydefault(C30677lff.this);
            if (c21661hHqCopydefault2 == null || (lottieAnimationView = c21661hHqCopydefault2.AYXKKw) == null) {
                return;
            }
            lottieAnimationView.setAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            LottieAnimationView lottieAnimationView;
            LottieAnimationView lottieAnimationView2;
            Intrinsics.checkNotNullParameter(animator, "");
            C21661hHq c21661hHqCopydefault = C30677lff.copydefault(C30677lff.this);
            if (c21661hHqCopydefault != null && (lottieAnimationView2 = c21661hHqCopydefault.AYXKKw) != null) {
                lottieAnimationView2.setVisibility(8);
            }
            C21661hHq c21661hHqCopydefault2 = C30677lff.copydefault(C30677lff.this);
            if (c21661hHqCopydefault2 == null || (lottieAnimationView = c21661hHqCopydefault2.AYXKKw) == null) {
                return;
            }
            lottieAnimationView.setAlpha(1.0f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AYXKKw(C30677lff c30677lff, android.animation.ValueAnimator valueAnimator) {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        C21661hHq c21661hHq = (C21661hHq) c30677lff.fARcdN();
        ViewGroup.LayoutParams layoutParams = (c21661hHq == null || (frameLayout2 = c21661hHq.gEmmrt) == null) ? null : frameLayout2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            pUU.KWHzl(EZpvd, "hidePullRefresh: " + iIntValue);
            marginLayoutParams.height = iIntValue;
            C21661hHq c21661hHq2 = (C21661hHq) c30677lff.fARcdN();
            if (c21661hHq2 == null || (frameLayout = c21661hHq2.gEmmrt) == null) {
                return;
            }
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        android.widget.LinearLayout linearLayout;
        C22309hct c22309hct;
        LottieAnimationView lottieAnimationView;
        android.widget.LinearLayout linearLayout2;
        C31699mAq c31699mAq;
        android.widget.FrameLayout frameLayout3;
        C21661hHq c21661hHq = (C21661hHq) fARcdN();
        if (c21661hHq != null && (frameLayout3 = c21661hHq.gEmmrt) != null) {
            frameLayout3.setVisibility(0);
        }
        C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
        if (c21661hHq2 != null && (c31699mAq = c21661hHq2.AhwBna) != null) {
            c31699mAq.setVisibility(0);
        }
        C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
        if (c21661hHq3 != null && (linearLayout2 = c21661hHq3.djBIcL) != null) {
            linearLayout2.setVisibility(8);
        }
        C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
        if (c21661hHq4 != null && (lottieAnimationView = c21661hHq4.AYXKKw) != null) {
            lottieAnimationView.setVisibility(8);
        }
        C21661hHq c21661hHq5 = (C21661hHq) fARcdN();
        if (c21661hHq5 != null && (c22309hct = c21661hHq5.EZpvd) != null) {
            c22309hct.OLrzqt();
        }
        C21661hHq c21661hHq6 = (C21661hHq) fARcdN();
        if (c21661hHq6 != null && (linearLayout = c21661hHq6.djBIcL) != null) {
            linearLayout.setBackgroundResource(0);
        }
        if (this.AYXKKw > 0) {
            C21661hHq c21661hHq7 = (C21661hHq) fARcdN();
            ViewGroup.LayoutParams layoutParams = (c21661hHq7 == null || (frameLayout2 = c21661hHq7.gEmmrt) == null) ? null : frameLayout2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = this.AYXKKw;
                C21661hHq c21661hHq8 = (C21661hHq) fARcdN();
                if (c21661hHq8 == null || (frameLayout = c21661hHq8.gEmmrt) == null) {
                    return;
                }
                frameLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        C22309hct c22309hct;
        C22309hct c22309hct2;
        android.widget.LinearLayout linearLayout;
        C31699mAq c31699mAq;
        android.widget.FrameLayout frameLayout;
        C21661hHq c21661hHq = (C21661hHq) fARcdN();
        if (c21661hHq != null && (frameLayout = c21661hHq.gEmmrt) != null) {
            frameLayout.setVisibility(0);
        }
        C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
        if (c21661hHq2 != null && (c31699mAq = c21661hHq2.AhwBna) != null) {
            c31699mAq.setVisibility(8);
        }
        C21661hHq c21661hHq3 = (C21661hHq) fARcdN();
        if (c21661hHq3 != null && (linearLayout = c21661hHq3.djBIcL) != null) {
            linearLayout.setVisibility(0);
        }
        C21661hHq c21661hHq4 = (C21661hHq) fARcdN();
        if (c21661hHq4 != null && (c22309hct2 = c21661hHq4.EZpvd) != null) {
            c22309hct2.setVisibility(0);
        }
        C21661hHq c21661hHq5 = (C21661hHq) fARcdN();
        if (c21661hHq5 == null || (c22309hct = c21661hHq5.EZpvd) == null) {
            return;
        }
        c22309hct.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        C22309hct c22309hct;
        android.widget.LinearLayout linearLayout;
        C21661hHq c21661hHq = (C21661hHq) fARcdN();
        if (c21661hHq != null && (linearLayout = c21661hHq.djBIcL) != null) {
            linearLayout.setBackgroundResource(0);
        }
        C21661hHq c21661hHq2 = (C21661hHq) fARcdN();
        if (c21661hHq2 != null && (c22309hct = c21661hHq2.EZpvd) != null) {
            c22309hct.OLrzqt();
        }
        valueOf();
    }

    public final void AEQbTJ() {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(10.0f, 0.0f);
        this.OLrzqt = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(225L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.lfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C30677lff.KWHzl(this.OLrzqt, valueAnimator2);
            }
        });
        Intrinsics.copydefault(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new TaskDescription());
        valueAnimatorOfFloat.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C30677lff c30677lff, android.animation.ValueAnimator valueAnimator) {
        android.widget.FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        float fFloatValue = ((java.lang.Float) animatedValue).floatValue() / 10;
        C21661hHq c21661hHq = (C21661hHq) c30677lff.fARcdN();
        if (c21661hHq == null || (frameLayout = c21661hHq.AEQbTJ) == null) {
            return;
        }
        frameLayout.setAlpha(fFloatValue);
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.OLrzqt = null;
        android.animation.ValueAnimator valueAnimator2 = this.AhwBna;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.AhwBna = null;
        android.animation.ValueAnimator valueAnimator3 = this.gEmmrt;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.gEmmrt = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        android.widget.FrameLayout frameLayout;
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(C56524yIo.AEQbTJ(C30616leX.class).valueOf());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(strValueOf);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded() || fragmentFindFragmentByTag.isDetached() || fragmentFindFragmentByTag.isRemoving()) {
            return;
        }
        C21661hHq c21661hHq = (C21661hHq) fARcdN();
        if (c21661hHq != null && (frameLayout = c21661hHq.AEQbTJ) != null) {
            frameLayout.setVisibility(8);
        }
        childFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.widget.FrameLayout AhwBna() {
        C21661hHq c21661hHq = (C21661hHq) fARcdN();
        if (c21661hHq != null) {
            return c21661hHq.gEmmrt;
        }
        return null;
    }
}
