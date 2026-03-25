package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16912esq implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final AppCompatImageView AkhnZx;
    public final android.view.View DbNXlk;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatImageView djBIcL;
    public final android.view.View gEmmrt;
    public final AppCompatImageView isConnected;
    public final C55251xgS valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public C16912esq(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull AppCompatImageView appCompatImageView5) {
        this.values = constraintLayout;
        this.OLrzqt = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.KWHzl = appCompatImageView;
        this.EZpvd = appCompatTextView3;
        this.AEQbTJ = appCompatTextView4;
        this.AhwBna = constraintLayout2;
        this.AYXKKw = appCompatImageView2;
        this.gEmmrt = view;
        this.valueOf = c55251xgS;
        this.djBIcL = appCompatImageView3;
        this.DbNXlk = view2;
        this.AkhnZx = appCompatImageView4;
        this.isConnected = appCompatImageView5;
    }

    public static C16912esq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.zzJhsT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16912esq AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C13754dXa.ActionBar.AEQbTJ;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C13754dXa.ActionBar.gEmmrt;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = C13754dXa.ActionBar.fetchVPNInfo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C13754dXa.ActionBar.DbNXlk;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = C13754dXa.ActionBar.DTwDnp;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = C13754dXa.ActionBar.QOLQEE;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C13754dXa.ActionBar.fVjYLc;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.OAhWiU))) != null) {
                                    i = C13754dXa.ActionBar.OgHfcT;
                                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                    if (c55251xgS != null) {
                                        i = C13754dXa.ActionBar.kcQGz;
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.putText))) != null) {
                                            i = C13754dXa.ActionBar.setSessionActivity;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView4 != null) {
                                                i = C13754dXa.ActionBar.MediaSessionCompatQueueItem;
                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatImageView5 != null) {
                                                    return new C16912esq((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatTextView3, appCompatTextView4, constraintLayout, appCompatImageView2, viewFindChildViewById, c55251xgS, appCompatImageView3, viewFindChildViewById2, appCompatImageView4, appCompatImageView5);
                                                }
                                            }
                                        }
                                    }
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
