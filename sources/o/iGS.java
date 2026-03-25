package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes23.dex */
public final class iGS implements ViewBinding {
    public final C33603mza AEQbTJ;
    public final C33546myW AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final C33537myN KWHzl;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public iGS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.valueOf = constraintLayout;
        this.KWHzl = c33537myN;
        this.EZpvd = frameLayout;
        this.copydefault = recyclerView;
        this.AEQbTJ = c33603mza;
        this.OLrzqt = c55173xeu;
        this.AYXKKw = c33546myW;
    }

    public static iGS EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static iGS OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.KWHzl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static iGS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.registerUser;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C25493ixk.ActionBar.DcMfJKfNUfqk;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C25493ixk.ActionBar.DVmcag;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C25493ixk.ActionBar.iMXFZQ;
                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                    if (c33603mza != null) {
                        i = C25493ixk.ActionBar.OKvQBs;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C25493ixk.ActionBar.QTtQrx;
                            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                            if (c33546myW != null) {
                                return new iGS((ConstraintLayout) view, c33537myN, frameLayout, recyclerView, c33603mza, c55173xeu, c33546myW);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
