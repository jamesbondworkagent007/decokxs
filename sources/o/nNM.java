package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nNM implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout AhwBna;
    public final nKW EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public nNM(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull nKW nkw, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.KWHzl = linearLayout;
        this.EZpvd = nkw;
        this.OLrzqt = imageView;
        this.copydefault = textView;
        this.AEQbTJ = textView2;
        this.gEmmrt = textView3;
        this.AhwBna = linearLayout2;
    }

    public static nNM KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.Swccd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static nNM KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.siEkQe;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            nKW nkwKWHzl = nKW.KWHzl(viewFindChildViewById);
            i = C35399nuc.StateListAnimator.OzhFjl;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C35399nuc.StateListAnimator.fRNHEq;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C35399nuc.StateListAnimator.onLost;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C35399nuc.StateListAnimator.hTAtCx;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                            return new nNM(linearLayout, nkwKWHzl, imageView, textView, textView2, textView3, linearLayout);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
