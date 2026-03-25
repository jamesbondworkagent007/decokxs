package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34032nOx implements ViewBinding {
    public final C55173xeu EZpvd;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C34032nOx(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.OLrzqt = frameLayout;
        this.copydefault = frameLayout2;
        this.EZpvd = c55173xeu;
    }

    public static C34032nOx copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i = C35399nuc.StateListAnimator.hfdhUn;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            return new C34032nOx(frameLayout, frameLayout, c55173xeu);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
