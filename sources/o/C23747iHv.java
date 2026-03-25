package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23747iHv implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C27300jsb EZpvd;
    public final android.view.View KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C27323jsy djBIcL;
    public final C27300jsb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C23747iHv(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C27300jsb c27300jsb, @androidx.annotation.NonNull C27300jsb c27300jsb2, @androidx.annotation.NonNull C27323jsy c27323jsy) {
        this.copydefault = linearLayout;
        this.KWHzl = view;
        this.OLrzqt = view2;
        this.AEQbTJ = imageView;
        this.EZpvd = c27300jsb;
        this.valueOf = c27300jsb2;
        this.djBIcL = c27323jsy;
    }

    public static C23747iHv OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.isConnected;
        android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.ejfBZ))) != null) {
            i = C25493ixk.ActionBar.AuCTel;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C25493ixk.ActionBar.RgLUBD;
                C27300jsb c27300jsb = (C27300jsb) ViewBindings.findChildViewById(view, i);
                if (c27300jsb != null) {
                    i = C25493ixk.ActionBar.sFt;
                    C27300jsb c27300jsb2 = (C27300jsb) ViewBindings.findChildViewById(view, i);
                    if (c27300jsb2 != null) {
                        i = C25493ixk.ActionBar.getQueue;
                        C27323jsy c27323jsy = (C27323jsy) ViewBindings.findChildViewById(view, i);
                        if (c27323jsy != null) {
                            return new C23747iHv((android.widget.LinearLayout) view, viewFindChildViewById2, viewFindChildViewById, imageView, c27300jsb, c27300jsb2, c27323jsy);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
