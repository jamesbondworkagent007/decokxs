package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21506hBx implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.view.View OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C21506hBx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.OLrzqt = view;
        this.copydefault = c52794wYp;
        this.AEQbTJ = c52794wYp2;
    }

    public static C21506hBx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.gdmIOq, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C21506hBx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcqEDu;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.DQnQnb;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                return new C21506hBx(view, c52794wYp, c52794wYp2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
