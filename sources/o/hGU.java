package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGU implements ViewBinding {
    public final C24818ikx EZpvd;
    public final android.view.View KWHzl;
    public final C24801ikg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public hGU(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C24801ikg c24801ikg, @androidx.annotation.NonNull C24818ikx c24818ikx) {
        this.KWHzl = view;
        this.copydefault = c24801ikg;
        this.EZpvd = c24818ikx;
    }

    public static hGU copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.DPVBvL, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hGU KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OqhRBMiKdSzF;
        C24801ikg c24801ikg = (C24801ikg) ViewBindings.findChildViewById(view, i);
        if (c24801ikg != null) {
            i = C23274hvD.Application.fObYrO;
            C24818ikx c24818ikx = (C24818ikx) ViewBindings.findChildViewById(view, i);
            if (c24818ikx != null) {
                return new hGU(view, c24801ikg, c24818ikx);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
