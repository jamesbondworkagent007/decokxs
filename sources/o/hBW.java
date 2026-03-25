package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBW implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final C33546myW EZpvd;
    public final C33603mza KWHzl;
    public final C33604mzb OLrzqt;
    public final C55113xdn copydefault;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.EZpvd;
    }

    public hBW(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = c33546myW;
        this.copydefault = c55113xdn;
        this.KWHzl = c33603mza;
        this.AEQbTJ = c33546myW2;
        this.OLrzqt = c33604mzb;
        this.valueOf = recyclerView;
    }

    public static hBW AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.invokespecialaVhqwO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hBW copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C23274hvD.Application.lambdanew0;
            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
            if (c33603mza != null) {
                C33546myW c33546myW = (C33546myW) view;
                i = C23274hvD.Application.saveState;
                C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                if (c33604mzb != null) {
                    i = C23274hvD.Application.getOnBackPressedDispatcherannotations;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new hBW(c33546myW, c55113xdn, c33603mza, c33546myW, c33604mzb, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
