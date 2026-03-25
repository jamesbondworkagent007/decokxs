package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.business.defi.wallet.home.nestedscroll.CoorLayoutSuper;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16590emm implements ViewBinding {
    public final CoorLayoutSuper AEQbTJ;
    public final C33604mzb EZpvd;
    public final AppBarLayout KWHzl;
    public final C33546myW OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public CoorLayoutSuper getRoot() {
        return this.AEQbTJ;
    }

    public C16590emm(@androidx.annotation.NonNull CoorLayoutSuper coorLayoutSuper, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = coorLayoutSuper;
        this.KWHzl = appBarLayout;
        this.EZpvd = c33604mzb;
        this.OLrzqt = c33546myW;
        this.copydefault = recyclerView;
    }

    public static C16590emm EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.frkDMe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16590emm AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iZzfmt;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C13754dXa.ActionBar.play;
            C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
            if (c33604mzb != null) {
                i = C13754dXa.ActionBar.next;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new C16590emm((CoorLayoutSuper) view, appBarLayout, c33604mzb, c33546myW, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
