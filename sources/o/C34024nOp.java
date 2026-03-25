package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34024nOp implements ViewBinding {
    public final C55113xdn EZpvd;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C34024nOp(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.OLrzqt = frameLayout;
        this.EZpvd = c55113xdn;
    }

    public static C34024nOp AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.bindToGooglePlayService;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            return new C34024nOp((android.widget.FrameLayout) view, c55113xdn);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
