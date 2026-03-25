package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iKU implements ViewBinding {
    public final C27446jvO EZpvd;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public iKU(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27446jvO c27446jvO) {
        this.copydefault = view;
        this.EZpvd = c27446jvO;
    }

    public static iKU OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.zSsVtY, viewGroup);
        return EZpvd(viewGroup);
    }

    public static iKU EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.aHXSQp;
        C27446jvO c27446jvO = (C27446jvO) ViewBindings.findChildViewById(view, i);
        if (c27446jvO != null) {
            return new iKU(view, c27446jvO);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
