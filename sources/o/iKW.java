package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKW implements ViewBinding {
    public final C27446jvO AEQbTJ;
    public final C27532jwv KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public iKW(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27446jvO c27446jvO, @androidx.annotation.NonNull C27532jwv c27532jwv) {
        this.OLrzqt = view;
        this.AEQbTJ = c27446jvO;
        this.KWHzl = c27532jwv;
    }

    public static iKW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.DGUQLIdZmdUa, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static iKW AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.aHXSQp;
        C27446jvO c27446jvO = (C27446jvO) ViewBindings.findChildViewById(view, i);
        if (c27446jvO != null) {
            i = C25493ixk.ActionBar.addQueueItemAt;
            C27532jwv c27532jwv = (C27532jwv) ViewBindings.findChildViewById(view, i);
            if (c27532jwv != null) {
                return new iKW(view, c27446jvO, c27532jwv);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
