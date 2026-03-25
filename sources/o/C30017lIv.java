package o;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30017lIv {
    public static final C30017lIv EZpvd = new C30017lIv();
    public static final java.util.Map<java.lang.String, java.lang.Integer> copydefault = new LinkedHashMap();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Integer> KWHzl() {
        return copydefault;
    }

    private C30017lIv() {
    }

    /* JADX INFO: renamed from: o.lIv$Activity */
    public static final class Activity extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ android.view.ViewGroup AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ androidx.fragment.app.FragmentManager copydefault;

        public Activity(java.lang.String str, android.view.ViewGroup viewGroup, int i, androidx.fragment.app.FragmentManager fragmentManager) {
            this.OLrzqt = str;
            this.AEQbTJ = viewGroup;
            this.EZpvd = i;
            this.copydefault = fragmentManager;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(view, "");
            if (Intrinsics.EZpvd((java.lang.Object) fragment.getTag(), (java.lang.Object) this.OLrzqt)) {
                Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new Application(view, view, this.OLrzqt, this.AEQbTJ, this.EZpvd, this.copydefault, this)), "");
            }
        }

        /* JADX INFO: renamed from: o.lIv$Activity$Application */
        public static final class Application implements java.lang.Runnable {
            public final /* synthetic */ int AEQbTJ;
            public final /* synthetic */ androidx.fragment.app.FragmentManager EZpvd;
            public final /* synthetic */ android.view.ViewGroup KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ android.view.View copydefault;
            public final /* synthetic */ Activity djBIcL;
            public final /* synthetic */ android.view.View valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, android.view.View view2, java.lang.String str, android.view.ViewGroup viewGroup, int i, androidx.fragment.app.FragmentManager fragmentManager, Activity activity) {
                this.copydefault = view;
                this.valueOf = view2;
                this.OLrzqt = str;
                this.KWHzl = viewGroup;
                this.AEQbTJ = i;
                this.EZpvd = fragmentManager;
                this.djBIcL = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int height = this.valueOf.getHeight();
                C30017lIv c30017lIv = C30017lIv.EZpvd;
                c30017lIv.KWHzl().put(this.OLrzqt, java.lang.Integer.valueOf(height));
                c30017lIv.AEQbTJ(this.KWHzl, this.AEQbTJ, height);
                this.EZpvd.unregisterFragmentLifecycleCallbacks(this.djBIcL);
            }
        }
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        fragmentManager.registerFragmentLifecycleCallbacks(new Activity(str, viewGroup, i, fragmentManager), true);
    }

    public final java.lang.Integer KWHzl(java.lang.String str) {
        return copydefault.get(str);
    }

    public final void AEQbTJ(@NotNull final android.view.View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        if (i == i2) {
            return;
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.setInterpolator(new FastOutSlowInInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.lIu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C30017lIv.OLrzqt(view, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public static final void OLrzqt(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
