package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mmin18.widget.RealtimeBlurView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34039nPd implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final RealtimeBlurView KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C34039nPd(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RealtimeBlurView realtimeBlurView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.AEQbTJ = frameLayout;
        this.KWHzl = realtimeBlurView;
        this.copydefault = linearLayout;
        this.EZpvd = frameLayout2;
    }

    public static C34039nPd AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.atDTRm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C34039nPd AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.fJNWhG;
        RealtimeBlurView realtimeBlurView = (RealtimeBlurView) ViewBindings.findChildViewById(view, i);
        if (realtimeBlurView != null) {
            i = C35399nuc.StateListAnimator.KDccX;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
                return new C34039nPd(frameLayout, realtimeBlurView, linearLayout, frameLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
