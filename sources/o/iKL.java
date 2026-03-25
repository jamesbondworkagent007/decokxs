package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKL implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C27231jrL KWHzl;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public iKL(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27231jrL c27231jrL, @androidx.annotation.NonNull android.view.View view2) {
        this.AEQbTJ = view;
        this.KWHzl = c27231jrL;
        this.copydefault = view2;
    }

    public static iKL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.zqTOFw, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static iKL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.MediaMetadataCompatLongKey;
        C27231jrL c27231jrL = (C27231jrL) ViewBindings.findChildViewById(view, i);
        if (c27231jrL != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.getRatingStyle))) != null) {
            return new iKL(view, c27231jrL, viewFindChildViewById);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
