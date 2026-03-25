package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oMN implements ViewBinding {
    public final RecyclerView EZpvd;
    public final C55237xgE KWHzl;
    public final C55237xgE OLrzqt;
    public final oQY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C55237xgE getRoot() {
        return this.OLrzqt;
    }

    public oMN(@androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull oQY oqy, @androidx.annotation.NonNull C55237xgE c55237xgE2) {
        this.OLrzqt = c55237xgE;
        this.EZpvd = recyclerView;
        this.copydefault = oqy;
        this.KWHzl = c55237xgE2;
    }

    public static oMN AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.UUsvzUhTFPAC;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35964oKf.StateListAnimator.DLl;
            oQY oqy = (oQY) ViewBindings.findChildViewById(view, i);
            if (oqy != null) {
                C55237xgE c55237xgE = (C55237xgE) view;
                return new oMN(c55237xgE, recyclerView, oqy, c55237xgE);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
