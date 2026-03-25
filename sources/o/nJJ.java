package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes23.dex */
public final class nJJ implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final C35893oHp EZpvd;
    public final oJD KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.view.View isConnected;
    public final android.widget.TextView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public nJJ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull oJD ojd, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.AEQbTJ = frameLayout;
        this.copydefault = linearLayout;
        this.EZpvd = c35893oHp;
        this.OLrzqt = imageView;
        this.KWHzl = ojd;
        this.gEmmrt = textView;
        this.valueOf = textView2;
        this.AhwBna = textView3;
        this.AYXKKw = textView4;
        this.djBIcL = textView5;
        this.DbNXlk = textView6;
        this.isConnected = view;
        this.values = view2;
    }

    public static nJJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.getPostValueLengthLimit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static nJJ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C35399nuc.StateListAnimator.UrRBLY;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C35399nuc.StateListAnimator.aKhcqp;
            C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
            if (c35893oHp != null) {
                i = C35399nuc.StateListAnimator.registerUser;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35399nuc.StateListAnimator.jFiva;
                    oJD ojd = (oJD) ViewBindings.findChildViewById(view, i);
                    if (ojd != null) {
                        i = C35399nuc.StateListAnimator.fraLem;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35399nuc.StateListAnimator.onLost;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C35399nuc.StateListAnimator.QjzqRB;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C35399nuc.StateListAnimator.sQOHWT;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = C35399nuc.StateListAnimator.hBORwR;
                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = C35399nuc.StateListAnimator.DdI;
                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.iluEmO))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.hErYDe))) != null) {
                                                return new nJJ((android.widget.FrameLayout) view, linearLayout, c35893oHp, imageView, ojd, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById, viewFindChildViewById2);
                                            }
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
