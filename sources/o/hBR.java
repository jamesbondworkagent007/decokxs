package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBR implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final C33603mza EZpvd;
    public final C55113xdn KWHzl;
    public final RecyclerView OLrzqt;
    public final ConstraintLayout copydefault;
    public final C54989xbV gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public hBR(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C54989xbV c54989xbV) {
        this.copydefault = constraintLayout;
        this.KWHzl = c55113xdn;
        this.EZpvd = c33603mza;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = c33546myW;
        this.gEmmrt = c54989xbV;
    }

    public static hBR EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.invokespecialROgMPW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hBR OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
            if (c33603mza != null) {
                i = C23274hvD.Application.onDraw;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.getLauncher;
                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                    if (c33546myW != null) {
                        i = C23274hvD.Application.ActionBarDrawerToggleHoneycomb;
                        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
                        if (c54989xbV != null) {
                            return new hBR((ConstraintLayout) view, c55113xdn, c33603mza, recyclerView, c33546myW, c54989xbV);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
