package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48318uNa implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final C55173xeu KWHzl;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C48318uNa(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = frameLayout;
        this.KWHzl = c55173xeu;
        this.OLrzqt = recyclerView;
    }

    public static C48318uNa OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.OKSWiw;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new C48318uNa((android.widget.FrameLayout) view, c55173xeu, recyclerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
