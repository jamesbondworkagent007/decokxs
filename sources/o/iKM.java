package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKM implements ViewBinding {
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final C27231jrL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public iKM(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C27231jrL c27231jrL) {
        this.KWHzl = view;
        this.EZpvd = view2;
        this.copydefault = c27231jrL;
    }

    public static iKM OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.zYHWMc, viewGroup);
        return copydefault(viewGroup);
    }

    public static iKM copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.getRatingStyle;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C25493ixk.ActionBar.newStarRating;
            C27231jrL c27231jrL = (C27231jrL) ViewBindings.findChildViewById(view, i);
            if (c27231jrL != null) {
                return new iKM(view, viewFindChildViewById, c27231jrL);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
