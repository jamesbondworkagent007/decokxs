package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8283azn implements ViewBinding {
    public final C55178xez OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C8283azn(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55178xez c55178xez) {
        this.copydefault = linearLayout;
        this.OLrzqt = c55178xez;
    }

    public static C8283azn KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DGUQLIDGUQLI;
        C55178xez c55178xez = (C55178xez) ViewBindings.findChildViewById(view, i);
        if (c55178xez != null) {
            return new C8283azn((android.widget.LinearLayout) view, c55178xez);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
