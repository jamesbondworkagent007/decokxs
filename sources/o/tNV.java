package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNV implements ViewBinding {
    public final tUN EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C33546myW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public tNV(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull tUN tun, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.KWHzl = frameLayout;
        this.EZpvd = tun;
        this.copydefault = c33546myW;
    }

    public static tNV OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DztXDE;
        tUN tun = (tUN) ViewBindings.findChildViewById(view, i);
        if (tun != null) {
            i = C47501trL.TaskDescription.DBAlnt;
            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
            if (c33546myW != null) {
                return new tNV((android.widget.FrameLayout) view, tun, c33546myW);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
