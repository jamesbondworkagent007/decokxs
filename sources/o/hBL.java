package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBL implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final hWB EZpvd;
    public final android.view.View KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C24289iay copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public hBL(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull hWB hwb, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C24289iay c24289iay) {
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = hwb;
        this.KWHzl = view;
        this.AEQbTJ = recyclerView;
        this.copydefault = c24289iay;
    }

    public static hBL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RkASWs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hBL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.OAUGar;
        hWB hwb = (hWB) ViewBindings.findChildViewById(view, i);
        if (hwb != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.MediaMetadataCompatBuilder))) != null) {
            i = C23274hvD.Application.Cancellable;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C23274hvD.Application.getActionProvider;
                C24289iay c24289iay = (C24289iay) ViewBindings.findChildViewById(view, i);
                if (c24289iay != null) {
                    return new hBL((LinearLayoutCompat) view, hwb, viewFindChildViewById, recyclerView, c24289iay);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
