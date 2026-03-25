package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBI implements ViewBinding {
    public final C24285iau AEQbTJ;
    public final android.view.View EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final hYA OLrzqt;
    public final hYA copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public hBI(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull hYA hya, @androidx.annotation.NonNull C24285iau c24285iau, @androidx.annotation.NonNull hYA hya2) {
        this.KWHzl = linearLayoutCompat;
        this.EZpvd = view;
        this.copydefault = hya;
        this.AEQbTJ = c24285iau;
        this.OLrzqt = hya2;
    }

    public static hBI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DQzvGNdrmXxudrmXxu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hBI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaMetadataCompatBuilder;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.onAttachedToWindow;
            hYA hya = (hYA) ViewBindings.findChildViewById(view, i);
            if (hya != null) {
                i = C23274hvD.Application.getActionProvider;
                C24285iau c24285iau = (C24285iau) ViewBindings.findChildViewById(view, i);
                if (c24285iau != null) {
                    i = C23274hvD.Application.setIconTintList;
                    hYA hya2 = (hYA) ViewBindings.findChildViewById(view, i);
                    if (hya2 != null) {
                        return new hBI((LinearLayoutCompat) view, viewFindChildViewById, hya, c24285iau, hya2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
