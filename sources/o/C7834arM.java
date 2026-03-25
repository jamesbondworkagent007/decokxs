package o;

import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7834arM {
    public final boolean AEQbTJ;
    public boolean EZpvd;
    public final Activity KWHzl;
    public ViewTreeObserver.OnGlobalLayoutListener OLrzqt;
    public int copydefault;

    /* JADX INFO: renamed from: o.arM$Activity */
    public interface Activity {
        void KWHzl(boolean z, int i);
    }

    public C7834arM(boolean z, Activity activity) {
        this.AEQbTJ = z;
        this.KWHzl = activity;
    }

    public final void copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(viewGroup);
        if (rootWindowInsets != null) {
            kotlin.Pair<java.lang.Boolean, java.lang.Integer> pairKWHzl = KWHzl(rootWindowInsets);
            boolean zBooleanValue = pairKWHzl.component1().booleanValue();
            int iIntValue = pairKWHzl.component2().intValue();
            this.EZpvd = zBooleanValue;
            this.copydefault = iIntValue;
        }
        this.OLrzqt = new StateListAnimator(viewGroup, this);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.arM$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C7834arM AEQbTJ;
        public final /* synthetic */ android.view.ViewGroup KWHzl;

        public StateListAnimator(android.view.ViewGroup viewGroup, C7834arM c7834arM) {
            this.KWHzl = viewGroup;
            this.AEQbTJ = c7834arM;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.KWHzl);
            if (rootWindowInsets != null) {
                this.AEQbTJ.OLrzqt(rootWindowInsets);
            }
        }
    }

    public final void EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.OLrzqt;
        if (onGlobalLayoutListener != null) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.EZpvd = false;
        this.copydefault = 0;
    }

    public final void OLrzqt(WindowInsetsCompat windowInsetsCompat) {
        kotlin.Pair<java.lang.Boolean, java.lang.Integer> pairKWHzl = KWHzl(windowInsetsCompat);
        boolean zBooleanValue = pairKWHzl.component1().booleanValue();
        int iIntValue = pairKWHzl.component2().intValue();
        if (!this.AEQbTJ ? this.EZpvd != zBooleanValue : !(this.EZpvd == zBooleanValue && this.copydefault == iIntValue)) {
            Activity activity = this.KWHzl;
            if (activity != null) {
                activity.KWHzl(zBooleanValue, iIntValue);
            }
        }
        this.EZpvd = zBooleanValue;
        this.copydefault = iIntValue;
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.Integer> KWHzl(WindowInsetsCompat windowInsetsCompat) {
        boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(zIsVisible), java.lang.Integer.valueOf(zIsVisible ? windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom - windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom : 0));
    }
}
