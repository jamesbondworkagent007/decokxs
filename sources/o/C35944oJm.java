package o;

import android.animation.Animator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35944oJm {
    public static WeakReference<android.app.Activity> KWHzl;
    public static WeakReference<C35942oJk> copydefault;
    public static final C35944oJm OLrzqt = new C35944oJm();
    public static final AtomicBoolean AEQbTJ = new AtomicBoolean(false);
    public static final int EZpvd = 8;

    private C35944oJm() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oJm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playAnimation$default(C35944oJm c35944oJm, android.app.Activity activity, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c35944oJm.AEQbTJ(activity, str, function0);
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.lang.String str, Function0<Unit> function0) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (activity.isFinishing() || activity.isDestroyed()) {
            pUU.valueOf("AppOverlayAnimation", "playAnimation - Activity is finishing or destroyed, skipping");
            return;
        }
        AEQbTJ.set(false);
        EZpvd();
        pUU.KWHzl("AppOverlayAnimation", "playAnimation - Starting overlay animation: " + str);
        try {
            Result.Application application = Result.Companion;
            C35942oJk c35942oJkKWHzl = KWHzl(activity, str, function0);
            copydefault(activity, c35942oJkKWHzl);
            copydefault = new WeakReference<>(c35942oJkKWHzl);
            KWHzl = new WeakReference<>(activity);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("AppOverlayAnimation", "playAnimation - Failed to create overlay", thM7380exceptionOrNullimpl);
        }
    }

    public final void EZpvd() {
        AtomicBoolean atomicBoolean = AEQbTJ;
        if (!atomicBoolean.compareAndSet(false, true)) {
            pUU.EZpvd("AppOverlayAnimation", "dismissCurrentOverlay - Already cleaning up, skipping");
            return;
        }
        try {
            WeakReference<C35942oJk> weakReference = copydefault;
            C35942oJk c35942oJk = weakReference != null ? weakReference.get() : null;
            WeakReference<android.app.Activity> weakReference2 = KWHzl;
            android.app.Activity activity = weakReference2 != null ? weakReference2.get() : null;
            copydefault = null;
            KWHzl = null;
            if (c35942oJk != null && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                pUU.EZpvd("AppOverlayAnimation", "dismissCurrentOverlay - Removing existing overlay");
                AEQbTJ(activity, c35942oJk);
            }
            atomicBoolean.set(false);
        } catch (java.lang.Throwable th) {
            AEQbTJ.set(false);
            throw th;
        }
    }

    public final C35942oJk KWHzl(android.app.Activity activity, final java.lang.String str, Function0<Unit> function0) {
        C35942oJk c35942oJk = new C35942oJk(activity, null, 0, 6, null);
        c35942oJk.setTag("app_overlay_animation");
        c35942oJk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LottieAnimationView lottieAnimationView = new LottieAnimationView(activity);
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lottieAnimationView.setClickable(false);
        lottieAnimationView.setFocusable(false);
        lottieAnimationView.setFocusableInTouchMode(false);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lottieAnimationView.addAnimatorListener(new StateListAnimator(function0));
        lottieAnimationView.setFailureListener(new LottieListener() { // from class: o.oJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C35944oJm.EZpvd(str, (java.lang.Throwable) obj);
            }
        });
        lottieAnimationView.setAnimationFromUrl(str);
        lottieAnimationView.playAnimation();
        c35942oJk.addView(lottieAnimationView);
        return c35942oJk;
    }

    /* JADX INFO: renamed from: o.oJm$StateListAnimator */
    public static final class StateListAnimator implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public StateListAnimator(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            pUU.EZpvd("AppOverlayAnimation", "Animation started");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            pUU.EZpvd("AppOverlayAnimation", "Animation ended - cleaning up");
            C35944oJm.OLrzqt.EZpvd();
            Function0<Unit> function0 = this.OLrzqt;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            pUU.EZpvd("AppOverlayAnimation", "Animation cancelled - cleaning up");
            C35944oJm.OLrzqt.EZpvd();
        }
    }

    public static final void EZpvd(java.lang.String str, java.lang.Throwable th) {
        pUU.AEQbTJ("AppOverlayAnimation", "Animation failed to load from URL: " + str, th);
        OLrzqt.EZpvd();
    }

    public final void copydefault(android.app.Activity activity, C35942oJk c35942oJk) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.addView(c35942oJk);
        }
        c35942oJk.bringToFront();
        pUU.EZpvd("AppOverlayAnimation", "attachOverlayToActivity - Overlay attached to activity");
    }

    public final void AEQbTJ(android.app.Activity activity, C35942oJk c35942oJk) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            android.view.View childAt = c35942oJk.getChildAt(0);
            LottieAnimationView lottieAnimationView = childAt instanceof LottieAnimationView ? (LottieAnimationView) childAt : null;
            if (lottieAnimationView != null) {
                lottieAnimationView.removeAllAnimatorListeners();
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.cancelAnimation();
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content);
            if (viewGroup != null) {
                viewGroup.removeView(c35942oJk);
            }
            pUU.EZpvd("AppOverlayAnimation", "removeOverlayFromActivity - Overlay removed from activity");
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("AppOverlayAnimation", "removeOverlayFromActivity - Failed to remove overlay", thM7380exceptionOrNullimpl);
        }
    }
}
