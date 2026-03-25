package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42770rcg implements ViewBinding {
    public final qXZ EZpvd;
    public final C55173xeu KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public qXZ getRoot() {
        return this.EZpvd;
    }

    public C42770rcg(@androidx.annotation.NonNull qXZ qxz, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.EZpvd = qxz;
        this.KWHzl = c55173xeu;
    }

    public static C42770rcg KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            return new C42770rcg((qXZ) view, c55173xeu);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
