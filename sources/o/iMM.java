package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iMM implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.ImageView KWHzl;
    public final C55251xgS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public iMM(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55251xgS c55251xgS) {
        this.AEQbTJ = view;
        this.KWHzl = imageView;
        this.copydefault = c55251xgS;
    }

    public static iMM EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.invokespecialDaTmkG, viewGroup);
        return copydefault(viewGroup);
    }

    public static iMM copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.sYcwUD;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.sVaiLC;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                return new iMM(view, imageView, c55251xgS);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
