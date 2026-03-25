package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54925xaK implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final Barrier AYXKKw;
    public final MaterialTextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final android.view.View KWHzl;
    public final wYC OLrzqt;
    public final AppCompatImageView copydefault;
    public final MaterialTextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final Barrier valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C54925xaK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull MaterialTextView materialTextView, @androidx.annotation.NonNull MaterialTextView materialTextView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2) {
        this.KWHzl = view;
        this.EZpvd = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.AEQbTJ = linearLayout;
        this.OLrzqt = wyc;
        this.AhwBna = materialTextView;
        this.djBIcL = materialTextView2;
        this.gEmmrt = constraintLayout;
        this.AYXKKw = barrier;
        this.valueOf = barrier2;
    }

    public static C54925xaK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.OuxcSI, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54925xaK OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.getFieldNames;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C52761wXj.FragmentManager.RKDWNf;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C52761wXj.FragmentManager.run;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C52761wXj.FragmentManager.KDccX;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        i = C52761wXj.FragmentManager.zzQwtT;
                        MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                        if (materialTextView != null) {
                            i = C52761wXj.FragmentManager.iKEqwx;
                            MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                            if (materialTextView2 != null) {
                                i = C52761wXj.FragmentManager.DPhTBN;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = C52761wXj.FragmentManager.DrNnAm;
                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                    if (barrier != null) {
                                        i = C52761wXj.FragmentManager.DPHNDa;
                                        Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                        if (barrier2 != null) {
                                            return new C54925xaK(view, appCompatImageView, appCompatImageView2, linearLayout, wyc, materialTextView, materialTextView2, constraintLayout, barrier, barrier2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
