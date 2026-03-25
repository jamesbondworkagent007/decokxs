package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54934xaT implements ViewBinding {
    public final C55317xhf AEQbTJ;
    public final ConstraintLayout AhwBna;
    public final wYC EZpvd;
    public final wYC KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.RelativeLayout copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C54934xaT(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull C55317xhf c55317xhf, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat) {
        this.AhwBna = constraintLayout;
        this.KWHzl = wyc;
        this.EZpvd = wyc2;
        this.AEQbTJ = c55317xhf;
        this.OLrzqt = linearLayout;
        this.copydefault = relativeLayout;
        this.gEmmrt = textView;
        this.djBIcL = linearLayoutCompat;
    }

    public static C54934xaT OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C54934xaT OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.QHmsKR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C54934xaT KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.isConnected;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C52761wXj.FragmentManager.dvKsVJ;
            wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc2 != null) {
                i = C52761wXj.FragmentManager.QSBOWP;
                C55317xhf c55317xhf = (C55317xhf) ViewBindings.findChildViewById(view, i);
                if (c55317xhf != null) {
                    i = C52761wXj.FragmentManager.spnCvw;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C52761wXj.FragmentManager.apNbdB;
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = C52761wXj.FragmentManager.iKEqwx;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C52761wXj.FragmentManager.DPHsZd;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    return new C54934xaT((ConstraintLayout) view, wyc, wyc2, c55317xhf, linearLayout, relativeLayout, textView, linearLayoutCompat);
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
