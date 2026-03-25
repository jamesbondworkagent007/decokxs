package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBK implements ViewBinding {
    public final C24288iax AEQbTJ;
    public final android.view.View EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final hYO OLrzqt;
    public final hYO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public hBK(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull hYO hyo, @androidx.annotation.NonNull C24288iax c24288iax, @androidx.annotation.NonNull hYO hyo2) {
        this.KWHzl = linearLayoutCompat;
        this.EZpvd = view;
        this.copydefault = hyo;
        this.AEQbTJ = c24288iax;
        this.OLrzqt = hyo2;
    }

    public static hBK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RSDDiY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hBK copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaMetadataCompatBuilder;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.onAttachedToWindow;
            hYO hyo = (hYO) ViewBindings.findChildViewById(view, i);
            if (hyo != null) {
                i = C23274hvD.Application.getActionProvider;
                C24288iax c24288iax = (C24288iax) ViewBindings.findChildViewById(view, i);
                if (c24288iax != null) {
                    i = C23274hvD.Application.setIconTintList;
                    hYO hyo2 = (hYO) ViewBindings.findChildViewById(view, i);
                    if (hyo2 != null) {
                        return new hBK((LinearLayoutCompat) view, viewFindChildViewById, hyo, c24288iax, hyo2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
