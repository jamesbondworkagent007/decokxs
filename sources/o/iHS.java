package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes23.dex */
public final class iHS implements ViewBinding {
    public final android.widget.LinearLayout KWHzl;
    public final C27323jsy OLrzqt;
    public final C27300jsb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public iHS(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C27300jsb c27300jsb, @androidx.annotation.NonNull C27323jsy c27323jsy) {
        this.KWHzl = linearLayout;
        this.copydefault = c27300jsb;
        this.OLrzqt = c27323jsy;
    }

    public static iHS OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.getPlaybackState;
        C27300jsb c27300jsb = (C27300jsb) ViewBindings.findChildViewById(view, i);
        if (c27300jsb != null) {
            i = C25493ixk.ActionBar.getQueue;
            C27323jsy c27323jsy = (C27323jsy) ViewBindings.findChildViewById(view, i);
            if (c27323jsy != null) {
                return new iHS((android.widget.LinearLayout) view, c27300jsb, c27323jsy);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
