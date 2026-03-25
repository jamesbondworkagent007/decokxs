package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFT implements ViewBinding {
    public final C25347iux AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final C55239xgG KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C55320xhi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public hFT(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C25347iux c25347iux, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C55320xhi c55320xhi) {
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = c25347iux;
        this.KWHzl = c55239xgG;
        this.EZpvd = appCompatTextView;
        this.copydefault = c55320xhi;
    }

    public static hFT AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.HJWChPOZOJIj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hFT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onSetRepeatMode;
        C25347iux c25347iux = (C25347iux) ViewBindings.findChildViewById(view, i);
        if (c25347iux != null) {
            i = C23274hvD.Application.dispatchOnContextAvailable;
            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
            if (c55239xgG != null) {
                i = C23274hvD.Application.initializePanelContent;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.parseItem;
                    C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                    if (c55320xhi != null) {
                        return new hFT((LinearLayoutCompat) view, c25347iux, c55239xgG, appCompatTextView, c55320xhi);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
