package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54935xaU implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final wYC AYXKKw;
    public final wYC EZpvd;
    public final ConstraintLayout KWHzl;
    public final C55047xca OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.ImageView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C54935xaU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55047xca c55047xca, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.KWHzl = constraintLayout;
        this.copydefault = view;
        this.OLrzqt = c55047xca;
        this.EZpvd = wyc;
        this.AEQbTJ = linearLayout;
        this.AYXKKw = wyc2;
        this.djBIcL = imageView;
    }

    public static C54935xaU OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.gwTjWJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C54935xaU KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.fvQaOB;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C52761wXj.FragmentManager.gkJEwt;
            C55047xca c55047xca = (C55047xca) ViewBindings.findChildViewById(view, i);
            if (c55047xca != null) {
                i = C52761wXj.FragmentManager.call;
                wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                if (wyc != null) {
                    i = C52761wXj.FragmentManager.TarCU;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C52761wXj.FragmentManager.zlvcHA;
                        wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                        if (wyc2 != null) {
                            i = C52761wXj.FragmentManager.zSsVtY;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                return new C54935xaU((ConstraintLayout) view, viewFindChildViewById, c55047xca, wyc, linearLayout, wyc2, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
