package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21598hFh implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final C33546myW AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C33604mzb OLrzqt;
    public final C55113xdn copydefault;
    public final RecyclerView djBIcL;
    public final C33603mza gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C21598hFh(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.EZpvd = frameLayout;
        this.KWHzl = linearLayout;
        this.AEQbTJ = c55173xeu;
        this.copydefault = c55113xdn;
        this.OLrzqt = c33604mzb;
        this.gEmmrt = c33603mza;
        this.djBIcL = recyclerView;
        this.AYXKKw = c33546myW;
    }

    public static C21598hFh EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.GQzpsZgQzpsZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21598hFh AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gqOnQv;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.HJWChPDXdlte;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C23274hvD.Application.saveState;
                    C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                    if (c33604mzb != null) {
                        i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                        C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                        if (c33603mza != null) {
                            i = C23274hvD.Application.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C23274hvD.Application.ActivityResultLauncherHolder;
                                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                if (c33546myW != null) {
                                    return new C21598hFh((android.widget.FrameLayout) view, linearLayout, c55173xeu, c55113xdn, c33604mzb, c33603mza, recyclerView, c33546myW);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
