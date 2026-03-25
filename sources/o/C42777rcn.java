package o;

import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42777rcn implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final wYC AhwBna;
    public final Group EZpvd;
    public final C55173xeu KWHzl;
    public final C40499qYc OLrzqt;
    public final qYH copydefault;
    public final C40499qYc djBIcL;
    public final wYC gEmmrt;
    public final android.widget.LinearLayout valueOf;
    public final C55258xgZ values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.djBIcL;
    }

    public C42777rcn(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull qYH qyh, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C40499qYc c40499qYc2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.djBIcL = c40499qYc;
        this.copydefault = qyh;
        this.KWHzl = c55173xeu;
        this.EZpvd = group;
        this.AEQbTJ = c55113xdn;
        this.OLrzqt = c40499qYc2;
        this.AYXKKw = textView;
        this.gEmmrt = wyc;
        this.AhwBna = wyc2;
        this.valueOf = linearLayout;
        this.values = c55258xgZ;
    }

    public static C42777rcn EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RdAHlO;
        qYH qyh = (qYH) ViewBindings.findChildViewById(view, i);
        if (qyh != null) {
            i = qZH.StateListAnimator.fkESqH;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.YFmri;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = qZH.StateListAnimator.pXZxY;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        C40499qYc c40499qYc = (C40499qYc) view;
                        i = qZH.StateListAnimator.gFTCsA;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.HJWChPQPAeHI;
                            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                            if (wyc != null) {
                                i = qZH.StateListAnimator.ilfrrN;
                                wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                                if (wyc2 != null) {
                                    i = qZH.StateListAnimator.sVaiLC;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = qZH.StateListAnimator.apNKau;
                                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                        if (c55258xgZ != null) {
                                            return new C42777rcn(c40499qYc, qyh, c55173xeu, group, c55113xdn, c40499qYc, textView, wyc, wyc2, linearLayout, c55258xgZ);
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
