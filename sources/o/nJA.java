package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJA implements ViewBinding {
    public final wYC AEQbTJ;
    public final android.view.View EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final androidx.appcompat.widget.Toolbar copydefault;
    public final androidx.appcompat.widget.Toolbar djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.Toolbar getRoot() {
        return this.copydefault;
    }

    public nJA(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = toolbar;
        this.EZpvd = view;
        this.AEQbTJ = wyc;
        this.OLrzqt = imageView;
        this.KWHzl = imageView2;
        this.djBIcL = toolbar2;
        this.valueOf = textView;
        this.gEmmrt = textView2;
    }

    public static nJA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DAIeex, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nJA OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.sTzBva;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35399nuc.StateListAnimator.abAflu;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C35399nuc.StateListAnimator.DGGHxk;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35399nuc.StateListAnimator.ORWKdN;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) view;
                        i = C35399nuc.StateListAnimator.getConnectivityMgr;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35399nuc.StateListAnimator.ORrpqH;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new nJA(toolbar, viewFindChildViewById, wyc, imageView, imageView2, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
