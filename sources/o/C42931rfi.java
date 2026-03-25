package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42931rfi implements ViewBinding {
    public final C55237xgE AEQbTJ;
    public final C55230xfy EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C42931rfi(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55237xgE c55237xgE) {
        this.copydefault = frameLayout;
        this.KWHzl = recyclerView;
        this.EZpvd = c55230xfy;
        this.AEQbTJ = c55237xgE;
    }

    public static C42931rfi copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.FhERFw;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.iMXFZQ;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = qZH.StateListAnimator.RIKbBf;
                C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                if (c55237xgE != null) {
                    return new C42931rfi((android.widget.FrameLayout) view, recyclerView, c55230xfy, c55237xgE);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
