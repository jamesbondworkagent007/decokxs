package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36059oNt implements ViewBinding {
    public final C33624mzv AEQbTJ;
    public final C52794wYp AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C33624mzv OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final C52794wYp gEmmrt;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.valueOf;
    }

    public C36059oNt(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C33624mzv c33624mzv, @androidx.annotation.NonNull C33624mzv c33624mzv2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.valueOf = linearLayoutCompat;
        this.copydefault = linearLayoutCompat2;
        this.AEQbTJ = c33624mzv;
        this.OLrzqt = c33624mzv2;
        this.KWHzl = linearLayout;
        this.EZpvd = linearLayout2;
        this.gEmmrt = c52794wYp;
        this.AYXKKw = c52794wYp2;
    }

    public static C36059oNt KWHzl(@androidx.annotation.NonNull android.view.View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = C35964oKf.StateListAnimator.aPFruk;
        C33624mzv c33624mzv = (C33624mzv) ViewBindings.findChildViewById(view, i);
        if (c33624mzv != null) {
            i = C35964oKf.StateListAnimator.apNKau;
            C33624mzv c33624mzv2 = (C33624mzv) ViewBindings.findChildViewById(view, i);
            if (c33624mzv2 != null) {
                i = C35964oKf.StateListAnimator.zFZsbn;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C35964oKf.StateListAnimator.glXhWM;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C35964oKf.StateListAnimator.iTrKTi;
                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp != null) {
                            i = C35964oKf.StateListAnimator.iluEmO;
                            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp2 != null) {
                                return new C36059oNt(linearLayoutCompat, linearLayoutCompat, c33624mzv, c33624mzv2, linearLayout, linearLayout2, c52794wYp, c52794wYp2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
