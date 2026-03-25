package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17114ewg implements ViewBinding {
    public final android.widget.RelativeLayout EZpvd;
    public final C55113xdn OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.EZpvd;
    }

    public C17114ewg(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.EZpvd = relativeLayout;
        this.OLrzqt = c55113xdn;
    }

    public static C17114ewg copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.access100;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            return new C17114ewg((android.widget.RelativeLayout) view, c55113xdn);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
