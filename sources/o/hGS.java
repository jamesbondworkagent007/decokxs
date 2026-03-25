package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes23.dex */
public final class hGS implements ViewBinding {
    public final Flow AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final C55320xhi EZpvd;
    public final ConstraintLayout KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public hGS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = flow;
        this.copydefault = appCompatImageView;
        this.OLrzqt = appCompatTextView;
        this.EZpvd = c55320xhi;
        this.djBIcL = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
    }

    public static hGS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DAgZj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hGS copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.adevsa;
        Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
        if (flow != null) {
            i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.toggle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.getDrawerToggleDelegate;
                    C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                    if (c55320xhi != null) {
                        i = C23274hvD.Application.populateOptionsMenu;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.StateListDrawable;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new hGS((ConstraintLayout) view, flow, appCompatImageView, appCompatTextView, c55320xhi, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
