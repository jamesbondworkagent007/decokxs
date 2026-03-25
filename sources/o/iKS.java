package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKS implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C27228jrI EZpvd;
    public final android.view.View OLrzqt;
    public final C27250jre copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public iKS(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27228jrI c27228jrI, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C27250jre c27250jre) {
        this.OLrzqt = view;
        this.EZpvd = c27228jrI;
        this.AEQbTJ = textView;
        this.copydefault = c27250jre;
    }

    public static iKS copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.DGUQLIDGUQLI, viewGroup);
        return KWHzl(viewGroup);
    }

    public static iKS KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.newUnratedRating;
        C27228jrI c27228jrI = (C27228jrI) ViewBindings.findChildViewById(view, i);
        if (c27228jrI != null) {
            i = C25493ixk.ActionBar.hasHeart;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C25493ixk.ActionBar.getStarRating;
                C27250jre c27250jre = (C27250jre) ViewBindings.findChildViewById(view, i);
                if (c27250jre != null) {
                    return new iKS(view, c27228jrI, textView, c27250jre);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
