package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOW implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C55230xfy KWHzl;
    public final C46246tNf copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public tOW(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C46246tNf c46246tNf, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.EZpvd = linearLayout;
        this.copydefault = c46246tNf;
        this.AEQbTJ = recyclerView;
        this.KWHzl = c55230xfy;
    }

    public static tOW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.Ufzxmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static tOW copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DcMfJKdMCrTj;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C46246tNf c46246tNfAEQbTJ = C46246tNf.AEQbTJ(viewFindChildViewById);
            int i2 = C47501trL.TaskDescription.sVvuFk;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
            if (recyclerView != null) {
                i2 = C47501trL.TaskDescription.Dfv;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i2);
                if (c55230xfy != null) {
                    return new tOW((android.widget.LinearLayout) view, c46246tNfAEQbTJ, recyclerView, c55230xfy);
                }
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
