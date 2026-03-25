package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFN implements ViewBinding {
    public final C24274iaj AEQbTJ;
    public final C24279iao EZpvd;
    public final android.widget.RelativeLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.copydefault;
    }

    public hFN(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C24274iaj c24274iaj, @androidx.annotation.NonNull C24279iao c24279iao) {
        this.copydefault = relativeLayout;
        this.AEQbTJ = c24274iaj;
        this.EZpvd = c24279iao;
    }

    public static hFN OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gdLjtZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hFN EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.svhCHd;
        C24274iaj c24274iaj = (C24274iaj) ViewBindings.findChildViewById(view, i);
        if (c24274iaj != null) {
            i = C23274hvD.Application.aeJQwa;
            C24279iao c24279iao = (C24279iao) ViewBindings.findChildViewById(view, i);
            if (c24279iao != null) {
                return new hFN((android.widget.RelativeLayout) view, c24274iaj, c24279iao);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
