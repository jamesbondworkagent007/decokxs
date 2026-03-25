package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17161exa implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final wYC OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C17161exa(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull wYC wyc) {
        this.EZpvd = frameLayout;
        this.OLrzqt = wyc;
    }

    public static C17161exa OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.PlaybackStateCompatState;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            return new C17161exa((android.widget.FrameLayout) view, wyc);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
