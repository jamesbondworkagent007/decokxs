package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iJI implements ViewBinding {
    public final C55024xcD AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final C55173xeu KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final Group copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.LinearLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public iJI(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55024xcD c55024xcD, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4) {
        this.AYXKKw = constraintLayout;
        this.copydefault = group;
        this.KWHzl = c55173xeu;
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = c55024xcD;
        this.EZpvd = linearLayout;
        this.djBIcL = linearLayout2;
        this.gEmmrt = linearLayout3;
        this.AhwBna = linearLayout4;
    }

    public static iJI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.reset;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = C25493ixk.ActionBar.zLAIeZ;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C25493ixk.ActionBar.DQzvGN;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C25493ixk.ActionBar.DQYQgr;
                    C55024xcD c55024xcD = (C55024xcD) ViewBindings.findChildViewById(view, i);
                    if (c55024xcD != null) {
                        i = C25493ixk.ActionBar.DcMfJKDCKfqP;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C25493ixk.ActionBar.scanPackages;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C25493ixk.ActionBar.DcMfJKDCKfqPDCfLja;
                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = C25493ixk.ActionBar.fmB;
                                    android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout4 != null) {
                                        return new iJI((ConstraintLayout) view, group, c55173xeu, linearLayoutCompat, c55024xcD, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
