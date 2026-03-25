package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nOZ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.ImageView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final oIY OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public nOZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull oIY oiy, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.ImageView imageView5) {
        this.AEQbTJ = linearLayout;
        this.copydefault = frameLayout;
        this.KWHzl = imageView;
        this.OLrzqt = oiy;
        this.EZpvd = imageView2;
        this.AhwBna = imageView3;
        this.valueOf = imageView4;
        this.djBIcL = imageView5;
    }

    public static nOZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.aVhqwO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nOZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.OLrzqt;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C35399nuc.StateListAnimator.AEQbTJ;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C35399nuc.StateListAnimator.gmHjFq;
                oIY oiy = (oIY) ViewBindings.findChildViewById(view, i);
                if (oiy != null) {
                    i = C35399nuc.StateListAnimator.aBDePw;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C35399nuc.StateListAnimator.onProviderEnabled;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C35399nuc.StateListAnimator.DPVBvL;
                            android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = C35399nuc.StateListAnimator.iTrKTi;
                                android.widget.ImageView imageView5 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView5 != null) {
                                    return new nOZ((android.widget.LinearLayout) view, frameLayout, imageView, oiy, imageView2, imageView3, imageView4, imageView5);
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
