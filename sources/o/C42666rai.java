package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42666rai implements ViewBinding {
    public final C55230xfy AEQbTJ;
    public final C55113xdn EZpvd;
    public final C55173xeu KWHzl;
    public final RecyclerView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C42666rai(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.copydefault = constraintLayout;
        this.OLrzqt = recyclerView;
        this.KWHzl = c55173xeu;
        this.EZpvd = c55113xdn;
        this.AEQbTJ = c55230xfy;
    }

    public static C42666rai EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.QVAiDq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42666rai EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.heceqZ;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.fkESqH;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.pXZxY;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = qZH.StateListAnimator.fJk;
                    C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                    if (c55230xfy != null) {
                        return new C42666rai((ConstraintLayout) view, recyclerView, c55173xeu, c55113xdn, c55230xfy);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
