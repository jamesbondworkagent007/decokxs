package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEW implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C33604mzb AYXKKw;
    public final C33546myW AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C55113xdn OLrzqt;
    public final C55173xeu copydefault;
    public final RecyclerView djBIcL;
    public final C33603mza valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public hEW(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = frameLayout2;
        this.EZpvd = linearLayout;
        this.copydefault = c55173xeu;
        this.OLrzqt = c55113xdn;
        this.AYXKKw = c33604mzb;
        this.valueOf = c33603mza;
        this.djBIcL = recyclerView;
        this.AhwBna = c33546myW;
    }

    public static hEW AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OgHfcT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hEW EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
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
                                    return new hEW(frameLayout, frameLayout, linearLayout, c55173xeu, c55113xdn, c33604mzb, c33603mza, recyclerView, c33546myW);
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
