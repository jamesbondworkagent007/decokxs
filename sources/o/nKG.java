package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nKG implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final C55230xfy KWHzl;
    public final FragmentContainerView OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public nKG(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = fragmentContainerView;
        this.copydefault = c52794wYp;
        this.KWHzl = c55230xfy;
        this.EZpvd = c52794wYp2;
    }

    public static nKG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.WS, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nKG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.gkZNMa;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35399nuc.StateListAnimator.FQMcgE;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C35399nuc.StateListAnimator.resume;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                if (c55230xfy != null) {
                    i = C35399nuc.StateListAnimator.UCQKYV;
                    C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp2 != null) {
                        return new nKG((android.widget.LinearLayout) view, fragmentContainerView, c52794wYp, c55230xfy, c52794wYp2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
