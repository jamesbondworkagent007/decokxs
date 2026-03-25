package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33922nKv implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final RecyclerView AYXKKw;
    public final C52794wYp EZpvd;
    public final C55230xfy KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C52794wYp valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C33922nKv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.OLrzqt = constraintLayout;
        this.copydefault = linearLayout;
        this.AEQbTJ = fragmentContainerView;
        this.EZpvd = c52794wYp;
        this.KWHzl = c55230xfy;
        this.AYXKKw = recyclerView;
        this.valueOf = c52794wYp2;
    }

    public static C33922nKv OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.zblBkD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C33922nKv copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.DXXBbs;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C35399nuc.StateListAnimator.hNurIN;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C35399nuc.StateListAnimator.FQMcgE;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C35399nuc.StateListAnimator.resume;
                    C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                    if (c55230xfy != null) {
                        i = C35399nuc.StateListAnimator.gFTCsA;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C35399nuc.StateListAnimator.UCQKYV;
                            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp2 != null) {
                                return new C33922nKv((ConstraintLayout) view, linearLayout, fragmentContainerView, c52794wYp, c55230xfy, recyclerView, c52794wYp2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
