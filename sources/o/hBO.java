package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBO implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C25248itD AYXKKw;
    public final RecyclerView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C33603mza OLrzqt;
    public final C33546myW copydefault;
    public final android.widget.FrameLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public hBO(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C25248itD c25248itD) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c33603mza;
        this.EZpvd = recyclerView;
        this.copydefault = c33546myW;
        this.gEmmrt = frameLayout2;
        this.AYXKKw = c25248itD;
    }

    public static hBO OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ggKfIT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hBO KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcMfJKDIADVb;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.lambdanew0;
            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
            if (c33603mza != null) {
                i = C23274hvD.Application.ComponentActivity21;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.getLauncher;
                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                    if (c33546myW != null) {
                        i = C23274hvD.Application.ReportDrawnKtReportDrawn1;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = C23274hvD.Application.setDuration;
                            C25248itD c25248itD = (C25248itD) ViewBindings.findChildViewById(view, i);
                            if (c25248itD != null) {
                                return new hBO((android.widget.FrameLayout) view, constraintLayout, c33603mza, recyclerView, c33546myW, frameLayout, c25248itD);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
