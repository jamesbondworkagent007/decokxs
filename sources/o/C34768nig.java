package o;

import androidx.viewbinding.ViewBinding;
import o.C34764nic;

/* JADX INFO: renamed from: o.nig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34768nig implements ViewBinding {
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C34768nig(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.OLrzqt = frameLayout;
        this.copydefault = frameLayout2;
    }

    public static C34768nig KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C34768nig OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C34764nic.Activity.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C34768nig OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        return new C34768nig(frameLayout, frameLayout);
    }
}
