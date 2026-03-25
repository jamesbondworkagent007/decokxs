package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: loaded from: classes19.dex */
public final class rYJ implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public rYJ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55251xgS c55251xgS) {
        this.OLrzqt = frameLayout;
        this.AEQbTJ = c55251xgS;
    }

    public static rYJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static rYJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = rXV.ActionBar.QUSxYX;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            return new rYJ((android.widget.FrameLayout) view, c55251xgS);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
