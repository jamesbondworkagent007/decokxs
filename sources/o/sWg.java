package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.sWj;

/* JADX INFO: loaded from: classes19.dex */
public final class sWg implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final C33546myW AYXKKw;
    public final RecyclerView EZpvd;
    public final C55173xeu KWHzl;
    public final C55173xeu OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public sWg(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull C55173xeu c55173xeu3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.copydefault = frameLayout;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = c55173xeu2;
        this.OLrzqt = c55173xeu3;
        this.EZpvd = recyclerView;
        this.AYXKKw = c33546myW;
    }

    public static sWg AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(sWj.TaskDescription.KWHzl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static sWg copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = sWj.Application.gEmmrt;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = sWj.Application.AYXKKw;
            C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu2 != null) {
                i = sWj.Application.AhwBna;
                C55173xeu c55173xeu3 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu3 != null) {
                    i = sWj.Application.isConnected;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = sWj.Application.fJNWhG;
                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                        if (c33546myW != null) {
                            return new sWg((android.widget.FrameLayout) view, c55173xeu, c55173xeu2, c55173xeu3, recyclerView, c33546myW);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
