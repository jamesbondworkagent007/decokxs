package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCT implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C55251xgS AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final C22265hcB EZpvd;
    public final Barrier KWHzl;
    public final Barrier OLrzqt;
    public final ConstraintLayout copydefault;
    public final C55251xgS djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public hCT(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C22265hcB c22265hcB, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7) {
        this.copydefault = constraintLayout;
        this.OLrzqt = barrier;
        this.KWHzl = barrier2;
        this.AEQbTJ = view;
        this.EZpvd = c22265hcB;
        this.AYXKKw = c55251xgS;
        this.djBIcL = c55251xgS2;
        this.gEmmrt = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.valueOf = appCompatTextView3;
        this.DbNXlk = appCompatTextView4;
        this.fetchVPNInfo = appCompatTextView5;
        this.AkhnZx = appCompatTextView6;
        this.isConnected = appCompatTextView7;
    }

    public static hCT OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.getSessionID, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hCT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.ffGIBT;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.OuxcSI;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
                i = C23274hvD.Application.getCurrentControllerInfo;
                C22265hcB c22265hcB = (C22265hcB) ViewBindings.findChildViewById(view, i);
                if (c22265hcB != null) {
                    i = C23274hvD.Application.launchdefault;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C23274hvD.Application.bindRcKey;
                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS2 != null) {
                            i = C23274hvD.Application.setDisplayHomeAsUpEnabled;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C23274hvD.Application.setHideOnContentScrollEnabled;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C23274hvD.Application.onMenuVisibilityChanged;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView3 != null) {
                                        i = C23274hvD.Application.WindowDecorActionBarActionModeImpl;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView4 != null) {
                                            i = C23274hvD.Application.updateStateFromTypedArray;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView5 != null) {
                                                i = C23274hvD.Application.cloneConstantState;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView6 != null) {
                                                    i = C23274hvD.Application.indexOfTransition;
                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView7 != null) {
                                                        return new hCT((ConstraintLayout) view, barrier, barrier2, viewFindChildViewById, c22265hcB, c55251xgS, c55251xgS2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
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
