package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54946xaf implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C52781wYc EZpvd;
    public final wXQ KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55118xds copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C55118xds getRoot() {
        return this.copydefault;
    }

    public C54946xaf(@androidx.annotation.NonNull C55118xds c55118xds, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C52781wYc c52781wYc, @androidx.annotation.NonNull wXQ wxq) {
        this.copydefault = c55118xds;
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.EZpvd = c52781wYc;
        this.KWHzl = wxq;
    }

    public static C54946xaf AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.ejfBZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C54946xaf KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.gHZMYf;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C52761wXj.FragmentManager.accept;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C52761wXj.FragmentManager.ODWQjV;
                C52781wYc c52781wYc = (C52781wYc) ViewBindings.findChildViewById(view, i);
                if (c52781wYc != null) {
                    i = C52761wXj.FragmentManager.UrRBLY;
                    wXQ wxq = (wXQ) ViewBindings.findChildViewById(view, i);
                    if (wxq != null) {
                        return new C54946xaf((C55118xds) view, constraintLayout, constraintLayout2, c52781wYc, wxq);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
