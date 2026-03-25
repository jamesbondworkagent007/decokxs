package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNO implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final tUN OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public tNO(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull tUN tun, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.copydefault = frameLayout;
        this.OLrzqt = tun;
        this.EZpvd = frameLayout2;
    }

    public static tNO AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DztXDE;
        tUN tun = (tUN) ViewBindings.findChildViewById(view, i);
        if (tun != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            return new tNO(frameLayout, tun, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
