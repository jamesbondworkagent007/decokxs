package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33926nKz implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final C55230xfy OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C33926nKz(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.KWHzl = linearLayout;
        this.AEQbTJ = fragmentContainerView;
        this.copydefault = c52794wYp;
        this.OLrzqt = c55230xfy;
    }

    public static C33926nKz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DGOPHZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C33926nKz copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.gkZNMa;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35399nuc.StateListAnimator.FQMcgE;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C35399nuc.StateListAnimator.resume;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                if (c55230xfy != null) {
                    return new C33926nKz((android.widget.LinearLayout) view, fragmentContainerView, c52794wYp, c55230xfy);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
