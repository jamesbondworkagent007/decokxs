package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBG implements ViewBinding {
    public final C24283ias AEQbTJ;
    public final android.view.View EZpvd;
    public final hWB KWHzl;
    public final hXN OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final hXN djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public hBG(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull hWB hwb, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull hXN hxn, @androidx.annotation.NonNull C24283ias c24283ias, @androidx.annotation.NonNull hXN hxn2) {
        this.copydefault = linearLayoutCompat;
        this.KWHzl = hwb;
        this.EZpvd = view;
        this.OLrzqt = hxn;
        this.AEQbTJ = c24283ias;
        this.djBIcL = hxn2;
    }

    public static hBG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RIuxYh, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hBG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.OAUGar;
        hWB hwb = (hWB) ViewBindings.findChildViewById(view, i);
        if (hwb != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.MediaMetadataCompatBuilder))) != null) {
            i = C23274hvD.Application.onAttachedToWindow;
            hXN hxn = (hXN) ViewBindings.findChildViewById(view, i);
            if (hxn != null) {
                i = C23274hvD.Application.getActionProvider;
                C24283ias c24283ias = (C24283ias) ViewBindings.findChildViewById(view, i);
                if (c24283ias != null) {
                    i = C23274hvD.Application.setIconTintList;
                    hXN hxn2 = (hXN) ViewBindings.findChildViewById(view, i);
                    if (hxn2 != null) {
                        return new hBG((LinearLayoutCompat) view, hwb, viewFindChildViewById, hxn, c24283ias, hxn2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
