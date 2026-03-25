package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42934rfl implements ViewBinding {
    public final android.widget.LinearLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final C55173xeu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C42934rfl(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.KWHzl = linearLayout;
        this.OLrzqt = c52794wYp;
        this.copydefault = c55173xeu;
    }

    public static C42934rfl OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DarRvM;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.Swccd;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                return new C42934rfl((android.widget.LinearLayout) view, c52794wYp, c55173xeu);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
