package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDL implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public hDL(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.copydefault = view;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = c52794wYp2;
    }

    public static hDL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.ExKek, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hDL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcqEDu;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.gSBher;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                return new hDL(view, c52794wYp, c52794wYp2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
