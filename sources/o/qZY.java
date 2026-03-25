package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes9.dex */
public final class qZY implements ViewBinding {
    public final C42922rfZ AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C42922rfZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42922rfZ getRoot() {
        return this.copydefault;
    }

    public qZY(@androidx.annotation.NonNull C42922rfZ c42922rfZ, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C42922rfZ c42922rfZ2) {
        this.copydefault = c42922rfZ;
        this.KWHzl = frameLayout;
        this.EZpvd = recyclerView;
        this.OLrzqt = frameLayout2;
        this.AEQbTJ = c42922rfZ2;
    }

    public static qZY KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DbNXlk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.HrFqwD;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.OKSWiw;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    C42922rfZ c42922rfZ = (C42922rfZ) view;
                    return new qZY(c42922rfZ, frameLayout, recyclerView, frameLayout2, c42922rfZ);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
