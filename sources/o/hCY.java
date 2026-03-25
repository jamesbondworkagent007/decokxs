package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCY implements ViewBinding {
    public final Barrier AEQbTJ;
    public final C22265hcB AYXKKw;
    public final ConstraintLayout AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView AuCTel;
    public final AppCompatTextView DbNXlk;
    public final android.view.View EZpvd;
    public final AppCompatImageView KWHzl;
    public final Barrier OLrzqt;
    public final C55251xgS copydefault;
    public final C55251xgS djBIcL;
    public final AppCompatTextView ejfBZ;
    public final AppCompatTextView fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final AppCompatTextView fetchVPNInfo;
    public final C55251xgS gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public hCY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C22265hcB c22265hcB, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10, @androidx.annotation.NonNull AppCompatTextView appCompatTextView11) {
        this.AhwBna = constraintLayout;
        this.OLrzqt = barrier;
        this.AEQbTJ = barrier2;
        this.copydefault = c55251xgS;
        this.EZpvd = view;
        this.KWHzl = appCompatImageView;
        this.AYXKKw = c22265hcB;
        this.gEmmrt = c55251xgS2;
        this.djBIcL = c55251xgS3;
        this.valueOf = appCompatTextView;
        this.AkhnZx = appCompatTextView2;
        this.values = appCompatTextView3;
        this.DbNXlk = appCompatTextView4;
        this.isConnected = appCompatTextView5;
        this.fetchVPNInfo = appCompatTextView6;
        this.AuCTel = appCompatTextView7;
        this.fARcdN = appCompatTextView8;
        this.fJNWhG = appCompatTextView9;
        this.fIwbmz = appCompatTextView10;
        this.ejfBZ = appCompatTextView11;
    }

    public static hCY copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJKDSqxTE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hCY KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.ffGIBT;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.OuxcSI;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C23274hvD.Application.drbYRJ;
                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
                    i = C23274hvD.Application.DjzMc;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.getCurrentControllerInfo;
                        C22265hcB c22265hcB = (C22265hcB) ViewBindings.findChildViewById(view, i);
                        if (c22265hcB != null) {
                            i = C23274hvD.Application.launchdefault;
                            C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                            if (c55251xgS2 != null) {
                                i = C23274hvD.Application.bindRcKey;
                                C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                if (c55251xgS3 != null) {
                                    i = C23274hvD.Application.setDisplayHomeAsUpEnabled;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = C23274hvD.Application.setHomeActionContentDescription;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C23274hvD.Application.setHideOffset;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C23274hvD.Application.setElevation;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C23274hvD.Application.onMenuVisibilityChanged;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C23274hvD.Application.shouldAnimateContextView;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            i = C23274hvD.Application.updateStateFromTypedArray;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView7 != null) {
                                                                i = C23274hvD.Application.applyTheme;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView8 != null) {
                                                                    i = C23274hvD.Application.getIntrinsicWidth;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView9 != null) {
                                                                        i = C23274hvD.Application.getHotspotBounds;
                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView10 != null) {
                                                                            i = C23274hvD.Application.indexOfTransition;
                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView11 != null) {
                                                                                return new hCY((ConstraintLayout) view, barrier, barrier2, c55251xgS, viewFindChildViewById, appCompatImageView, c22265hcB, c55251xgS2, c55251xgS3, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11);
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
