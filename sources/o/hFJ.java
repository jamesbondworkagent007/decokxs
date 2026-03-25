package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFJ implements ViewBinding {
    public final C22147hZq AEQbTJ;
    public final hZD EZpvd;
    public final android.widget.RelativeLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.KWHzl;
    }

    public hFJ(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C22147hZq c22147hZq, @androidx.annotation.NonNull hZD hzd) {
        this.KWHzl = relativeLayout;
        this.AEQbTJ = c22147hZq;
        this.EZpvd = hzd;
    }

    public static hFJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fZc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hFJ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ORrpqH;
        C22147hZq c22147hZq = (C22147hZq) ViewBindings.findChildViewById(view, i);
        if (c22147hZq != null) {
            i = C23274hvD.Application.getConnectivityMgr;
            hZD hzd = (hZD) ViewBindings.findChildViewById(view, i);
            if (hzd != null) {
                return new hFJ((android.widget.RelativeLayout) view, c22147hZq, hzd);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
