package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23413hxk implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final FragmentContainerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23413hxk(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.AEQbTJ = frameLayout;
        this.copydefault = fragmentContainerView;
        this.EZpvd = frameLayout2;
    }

    public static C23413hxk AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23413hxk copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23413hxk KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.iOIMNp;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            return new C23413hxk(frameLayout, fragmentContainerView, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
