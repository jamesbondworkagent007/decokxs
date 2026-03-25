package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNU implements ViewBinding {
    public final C46500tWq AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C46471tVo KWHzl;
    public final C55113xdn OLrzqt;
    public final tUN copydefault;
    public final android.widget.FrameLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.djBIcL;
    }

    public tNU(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C46500tWq c46500tWq, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C46471tVo c46471tVo, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull tUN tun) {
        this.djBIcL = frameLayout;
        this.AEQbTJ = c46500tWq;
        this.EZpvd = linearLayout;
        this.KWHzl = c46471tVo;
        this.OLrzqt = c55113xdn;
        this.copydefault = tun;
    }

    public static tNU OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.ffGIBT;
        C46500tWq c46500tWq = (C46500tWq) ViewBindings.findChildViewById(view, i);
        if (c46500tWq != null) {
            i = C47501trL.TaskDescription.DGgnkA;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C47501trL.TaskDescription.zDUObI;
                C46471tVo c46471tVo = (C46471tVo) ViewBindings.findChildViewById(view, i);
                if (c46471tVo != null) {
                    i = C47501trL.TaskDescription.zpGcln;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C47501trL.TaskDescription.DztXDE;
                        tUN tun = (tUN) ViewBindings.findChildViewById(view, i);
                        if (tun != null) {
                            return new tNU((android.widget.FrameLayout) view, c46500tWq, linearLayout, c46471tVo, c55113xdn, tun);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
