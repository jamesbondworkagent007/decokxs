package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21525hCp implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final C55113xdn OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C21525hCp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c55113xdn;
        this.KWHzl = constraintLayout2;
        this.AEQbTJ = recyclerView;
    }

    public static C21525hCp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.Rtjmuc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21525hCp KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DrNnAm;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C23274hvD.Application.isFullyDrawnReported;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
            if (recyclerView != null) {
                return new C21525hCp(constraintLayout, c55113xdn, constraintLayout, recyclerView);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
