package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23380hxD implements ViewBinding {
    public final FragmentContainerView EZpvd;
    public final android.widget.FrameLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C23380hxD(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView) {
        this.KWHzl = frameLayout;
        this.EZpvd = fragmentContainerView;
    }

    public static C23380hxD OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C23380hxD OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.getNewProxyInstance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23380hxD KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OFqMGB;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            return new C23380hxD((android.widget.FrameLayout) view, fragmentContainerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
