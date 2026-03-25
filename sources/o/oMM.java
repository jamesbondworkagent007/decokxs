package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oMM implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C55320xhi EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public oMM(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55320xhi c55320xhi) {
        this.OLrzqt = linearLayout;
        this.KWHzl = linearLayout2;
        this.AEQbTJ = recyclerView;
        this.EZpvd = c55320xhi;
    }

    public static oMM copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = C35964oKf.StateListAnimator.updateVisuals;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35964oKf.StateListAnimator.INotificationSideChannelStubProxy;
            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
            if (c55320xhi != null) {
                return new oMM(linearLayout, linearLayout, recyclerView, c55320xhi);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
