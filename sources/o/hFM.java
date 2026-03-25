package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFM implements ViewBinding {
    public final C22138hZh EZpvd;
    public final hYY OLrzqt;
    public final android.widget.RelativeLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.copydefault;
    }

    public hFM(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull hYY hyy, @androidx.annotation.NonNull C22138hZh c22138hZh) {
        this.copydefault = relativeLayout;
        this.OLrzqt = hyy;
        this.EZpvd = c22138hZh;
    }

    public static hFM copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.HJWChPDXdlte, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hFM copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OHsvZP;
        hYY hyy = (hYY) ViewBindings.findChildViewById(view, i);
        if (hyy != null) {
            i = C23274hvD.Application.fGT;
            C22138hZh c22138hZh = (C22138hZh) ViewBindings.findChildViewById(view, i);
            if (c22138hZh != null) {
                return new hFM((android.widget.RelativeLayout) view, hyy, c22138hZh);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
