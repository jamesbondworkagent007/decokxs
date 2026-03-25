package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hHO implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.HorizontalScrollView AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final pGX KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public hHO(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull pGX pgx, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = linearLayout;
        this.KWHzl = pgx;
        this.AEQbTJ = imageView;
        this.copydefault = linearLayout2;
        this.EZpvd = linearLayout3;
        this.AYXKKw = horizontalScrollView;
        this.djBIcL = textView;
    }

    public static hHO EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DTwDnp;
        pGX pgx = (pGX) ViewBindings.findChildViewById(view, i);
        if (pgx != null) {
            i = C23274hvD.Application.UNDaji;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.addQueueItem;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C23274hvD.Application.prepareFromSearch;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C23274hvD.Application.removeCancellable;
                        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                        if (horizontalScrollView != null) {
                            i = C23274hvD.Application.removeOnMenuVisibilityListener;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new hHO((android.widget.LinearLayout) view, pgx, imageView, linearLayout, linearLayout2, horizontalScrollView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
