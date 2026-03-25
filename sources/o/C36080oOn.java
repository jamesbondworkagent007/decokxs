package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36080oOn implements ViewBinding {
    public final C55113xdn EZpvd;
    public final FragmentContainerView KWHzl;
    public final C55173xeu OLrzqt;
    public final NestedScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.copydefault;
    }

    public C36080oOn(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView) {
        this.copydefault = nestedScrollView;
        this.OLrzqt = c55173xeu;
        this.EZpvd = c55113xdn;
        this.KWHzl = fragmentContainerView;
    }

    public static C36080oOn OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.sTzBva, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C36080oOn AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.invokespecialgBtXYZ;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C35964oKf.StateListAnimator.mayLaunchUrl;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    return new C36080oOn((NestedScrollView) view, c55173xeu, c55113xdn, fragmentContainerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
