package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C43963rzG implements ViewBinding {
    public final android.widget.FrameLayout OLrzqt;
    public final C55113xdn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C43963rzG(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.OLrzqt = frameLayout;
        this.copydefault = c55113xdn;
    }

    public static C43963rzG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.zLAIeZ;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            return new C43963rzG((android.widget.FrameLayout) view, c55113xdn);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
