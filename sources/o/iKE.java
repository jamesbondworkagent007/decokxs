package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKE implements ViewBinding {
    public final android.view.View OLrzqt;
    public final C27131jpR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public iKE(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27131jpR c27131jpR) {
        this.OLrzqt = view;
        this.copydefault = c27131jpR;
    }

    public static iKE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.swzYdv, viewGroup);
        return copydefault(viewGroup);
    }

    public static iKE copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.dLBcXg;
        C27131jpR c27131jpR = (C27131jpR) ViewBindings.findChildViewById(view, i);
        if (c27131jpR != null) {
            return new iKE(view, c27131jpR);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
