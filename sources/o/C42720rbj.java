package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42720rbj implements ViewBinding {
    public final C46796tdt EZpvd;
    public final C41382qpk KWHzl;
    public final C33546myW OLrzqt;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public C42720rbj(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull C46796tdt c46796tdt, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C41382qpk c41382qpk) {
        this.copydefault = c41381qpj;
        this.EZpvd = c46796tdt;
        this.OLrzqt = c33546myW;
        this.KWHzl = c41382qpk;
    }

    public static C42720rbj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        C46796tdt c46796tdt = (C46796tdt) ViewBindings.findChildViewById(view, i);
        if (c46796tdt != null) {
            i = qZH.StateListAnimator.onProviderEnabled;
            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
            if (c33546myW != null) {
                i = qZH.StateListAnimator.fmdvVn;
                C41382qpk c41382qpk = (C41382qpk) ViewBindings.findChildViewById(view, i);
                if (c41382qpk != null) {
                    return new C42720rbj((C41381qpj) view, c46796tdt, c33546myW, c41382qpk);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
