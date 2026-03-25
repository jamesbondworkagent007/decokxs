package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBD implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final hYH EZpvd;
    public final C24288iax KWHzl;
    public final android.view.View OLrzqt;
    public final hYH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public hBD(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull hYH hyh, @androidx.annotation.NonNull C24288iax c24288iax, @androidx.annotation.NonNull hYH hyh2) {
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = view;
        this.EZpvd = hyh;
        this.KWHzl = c24288iax;
        this.copydefault = hyh2;
    }

    public static hBD OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJK, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hBD copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaMetadataCompatBuilder;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.onAttachedToWindow;
            hYH hyh = (hYH) ViewBindings.findChildViewById(view, i);
            if (hyh != null) {
                i = C23274hvD.Application.getActionProvider;
                C24288iax c24288iax = (C24288iax) ViewBindings.findChildViewById(view, i);
                if (c24288iax != null) {
                    i = C23274hvD.Application.setIconTintList;
                    hYH hyh2 = (hYH) ViewBindings.findChildViewById(view, i);
                    if (hyh2 != null) {
                        return new hBD((LinearLayoutCompat) view, viewFindChildViewById, hyh, c24288iax, hyh2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
