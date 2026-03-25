package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34031nOw implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final C35315nsx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C34031nOw(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C35315nsx c35315nsx) {
        this.EZpvd = frameLayout;
        this.copydefault = c35315nsx;
    }

    public static C34031nOw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.QHmsKR;
        C35315nsx c35315nsx = (C35315nsx) ViewBindings.findChildViewById(view, i);
        if (c35315nsx != null) {
            return new C34031nOw((android.widget.FrameLayout) view, c35315nsx);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
