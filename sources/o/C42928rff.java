package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42928rff implements ViewBinding {
    public final C40369qTh AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final C55230xfy KWHzl;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C42928rff(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C40369qTh c40369qTh) {
        this.EZpvd = frameLayout;
        this.copydefault = recyclerView;
        this.KWHzl = c55230xfy;
        this.AEQbTJ = c40369qTh;
    }

    public static C42928rff OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.gGNlxh, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42928rff AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.FhERFw;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.iMXFZQ;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = qZH.StateListAnimator.RIKbBf;
                C40369qTh c40369qTh = (C40369qTh) ViewBindings.findChildViewById(view, i);
                if (c40369qTh != null) {
                    return new C42928rff((android.widget.FrameLayout) view, recyclerView, c55230xfy, c40369qTh);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
