package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42717rbg implements ViewBinding {
    public final C42922rfZ AEQbTJ;
    public final C41303qoK OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42922rfZ getRoot() {
        return this.AEQbTJ;
    }

    public C42717rbg(@androidx.annotation.NonNull C42922rfZ c42922rfZ, @androidx.annotation.NonNull C41303qoK c41303qoK, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = c42922rfZ;
        this.OLrzqt = c41303qoK;
        this.copydefault = recyclerView;
    }

    public static C42717rbg EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dvImUD;
        C41303qoK c41303qoK = (C41303qoK) ViewBindings.findChildViewById(view, i);
        if (c41303qoK != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new C42717rbg((C42922rfZ) view, c41303qoK, recyclerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
