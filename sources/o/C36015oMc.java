package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36015oMc implements ViewBinding {
    public final LinearLayoutCompat KWHzl;
    public final FragmentContainerView OLrzqt;
    public final FragmentContainerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C36015oMc(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2) {
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = fragmentContainerView;
        this.copydefault = fragmentContainerView2;
    }

    public static C36015oMc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C36015oMc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36015oMc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.DeEinT;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35964oKf.StateListAnimator.Qsauvs;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                return new C36015oMc((LinearLayoutCompat) view, fragmentContainerView, fragmentContainerView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
