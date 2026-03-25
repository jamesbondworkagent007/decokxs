package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16976euA implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final RecyclerView EZpvd;
    public final C33604mzb KWHzl;
    public final C33546myW OLrzqt;
    public final C33603mza copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.OLrzqt;
    }

    public C16976euA(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = c33546myW;
        this.AEQbTJ = c33546myW2;
        this.KWHzl = c33604mzb;
        this.copydefault = c33603mza;
        this.EZpvd = recyclerView;
    }

    public static C16976euA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.apHBvG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16976euA KWHzl(@androidx.annotation.NonNull android.view.View view) {
        C33546myW c33546myW = (C33546myW) view;
        int i = C13754dXa.ActionBar.getShuffleMode;
        C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
        if (c33604mzb != null) {
            i = C13754dXa.ActionBar.getVolumeAttributes;
            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
            if (c33603mza != null) {
                i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new C16976euA(c33546myW, c33546myW, c33604mzb, c33603mza, recyclerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
