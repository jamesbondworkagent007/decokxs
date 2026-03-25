package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48441uRn implements ViewBinding {
    public final C54120wyP KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C48441uRn(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C54120wyP c54120wyP) {
        this.OLrzqt = linearLayout;
        this.KWHzl = c54120wyP;
    }

    public static C48441uRn copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.inflate;
        C54120wyP c54120wyP = (C54120wyP) ViewBindings.findChildViewById(view, i);
        if (c54120wyP != null) {
            return new C48441uRn((android.widget.LinearLayout) view, c54120wyP);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
