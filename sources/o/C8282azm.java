package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8282azm implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C52794wYp EZpvd;
    public final wYC KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final wYC copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final C55317xhf valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public C8282azm(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55317xhf c55317xhf, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.djBIcL = linearLayout;
        this.copydefault = wyc;
        this.EZpvd = c52794wYp;
        this.KWHzl = wyc2;
        this.AEQbTJ = c52794wYp2;
        this.OLrzqt = imageView;
        this.AhwBna = textView;
        this.gEmmrt = textView2;
        this.valueOf = c55317xhf;
        this.AYXKKw = textView3;
    }

    public static C8282azm AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DbNXlk;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C8206ayP.StateListAnimator.AuCTel;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C8206ayP.StateListAnimator.ORxRYg;
                wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                if (wyc2 != null) {
                    i = C8206ayP.StateListAnimator.QUSxYX;
                    C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp2 != null) {
                        i = C8206ayP.StateListAnimator.iRxXKY;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C8206ayP.StateListAnimator.accept;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C8206ayP.StateListAnimator.WS;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C8206ayP.StateListAnimator.zqTOFw;
                                    C55317xhf c55317xhf = (C55317xhf) ViewBindings.findChildViewById(view, i);
                                    if (c55317xhf != null) {
                                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new C8282azm((android.widget.LinearLayout) view, wyc, c52794wYp, wyc2, c52794wYp2, imageView, textView, textView2, c55317xhf, textView3);
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
