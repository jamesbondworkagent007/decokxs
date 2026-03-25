package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nKW implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final C35893oHp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public nKW(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C35893oHp c35893oHp) {
        this.AEQbTJ = frameLayout;
        this.KWHzl = frameLayout2;
        this.copydefault = c35893oHp;
    }

    public static nKW KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
        C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
        if (c35893oHp != null) {
            return new nKW(frameLayout, frameLayout, c35893oHp);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
