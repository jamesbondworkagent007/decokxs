package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23534hzz implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final C55173xeu OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C23534hzz(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.copydefault = linearLayout;
        this.EZpvd = recyclerView;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = linearLayout2;
    }

    public static C23534hzz KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.htlTjW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23534hzz AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.UJEglR;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C23274hvD.Application.QOjuYg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new C23534hzz((android.widget.LinearLayout) view, recyclerView, c55173xeu, linearLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
