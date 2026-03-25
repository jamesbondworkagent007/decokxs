package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21613hFw implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final ConstraintLayout AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final NestedScrollView EZpvd;
    public final AppCompatTextView KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.view.View valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.EZpvd;
    }

    public C21613hFw(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.EZpvd = nestedScrollView;
        this.copydefault = imageView;
        this.KWHzl = appCompatTextView;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = view;
        this.valueOf = view2;
        this.AhwBna = appCompatTextView2;
        this.gEmmrt = appCompatTextView3;
        this.AYXKKw = appCompatTextView4;
        this.djBIcL = appCompatTextView5;
        this.isConnected = appCompatTextView6;
        this.values = appCompatTextView7;
        this.DbNXlk = appCompatTextView8;
        this.fetchVPNInfo = appCompatTextView9;
        this.AkhnZx = constraintLayout;
    }

    public static C21613hFw copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.config, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21613hFw AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.zagaMW;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.onSkipToNext;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C23274hvD.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.Dimension))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.message))) != null) {
                    i = C23274hvD.Application.getAutoTimeNightModeManager;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C23274hvD.Application.onKeyDownPanel;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C23274hvD.Application.onKeyUpPanel;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView4 != null) {
                                i = C23274hvD.Application.invalidatePanelMenu;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    i = C23274hvD.Application.sanitizeWindowFeatureId;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView6 != null) {
                                        i = C23274hvD.Application.reopenMenu;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView7 != null) {
                                            i = C23274hvD.Application.performPanelShortcut;
                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView8 != null) {
                                                i = C23274hvD.Application.openPanel;
                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView9 != null) {
                                                    i = C23274hvD.Application.getMenuWrapper;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout != null) {
                                                        return new C21613hFw((NestedScrollView) view, imageView, appCompatTextView, recyclerView, viewFindChildViewById, viewFindChildViewById2, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, constraintLayout);
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
