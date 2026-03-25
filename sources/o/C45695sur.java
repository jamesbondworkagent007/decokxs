package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C45697sut;

/* JADX INFO: renamed from: o.sur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45695sur implements ViewBinding {
    public final C52794wYp EZpvd;
    public final RecyclerView KWHzl;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C45695sur(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = recyclerView;
        this.EZpvd = c52794wYp;
    }

    public static C45695sur OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C45695sur copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C45697sut.StateListAnimator.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C45695sur AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C45697sut.Activity.DbNXlk;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C45697sut.Activity.isConnected;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                return new C45695sur((ConstraintLayout) view, recyclerView, c52794wYp);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
