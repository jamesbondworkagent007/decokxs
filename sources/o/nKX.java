package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nKX implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final C55173xeu EZpvd;
    public final C55230xfy KWHzl;
    public final RecyclerView OLrzqt;
    public final ConstraintLayout copydefault;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public nKX(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.copydefault = constraintLayout;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = c55113xdn;
        this.KWHzl = c55230xfy;
        this.OLrzqt = recyclerView;
        this.valueOf = recyclerView2;
    }

    public static nKX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DNMMPQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static nKX KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.fsSxsn;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C35399nuc.StateListAnimator.DcMfJKsgNvtZ;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C35399nuc.StateListAnimator.QfZsXX;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                if (c55230xfy != null) {
                    i = C35399nuc.StateListAnimator.HJWChPhFGucI;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C35399nuc.StateListAnimator.HJWChPiaHEvk;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView2 != null) {
                            return new nKX((ConstraintLayout) view, c55173xeu, c55113xdn, c55230xfy, recyclerView, recyclerView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
