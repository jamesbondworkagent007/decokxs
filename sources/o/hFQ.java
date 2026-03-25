package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hFQ implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public hFQ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C52794wYp c52794wYp3, @androidx.annotation.NonNull C52794wYp c52794wYp4) {
        this.KWHzl = linearLayout;
        this.copydefault = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.OLrzqt = c52794wYp3;
        this.AEQbTJ = c52794wYp4;
    }

    public static hFQ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.Qsauvs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hFQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.setMessage;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.calculateNightMode;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C23274hvD.Application.clear;
                C52794wYp c52794wYp3 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp3 != null) {
                    i = C23274hvD.Application.lerp;
                    C52794wYp c52794wYp4 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp4 != null) {
                        return new hFQ((android.widget.LinearLayout) view, c52794wYp, c52794wYp2, c52794wYp3, c52794wYp4);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
