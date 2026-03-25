package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCE implements ViewBinding {
    public final Barrier AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final C19976gWh AhwBna;
    public final C55239xgG DbNXlk;
    public final android.widget.FrameLayout EZpvd;
    public final android.view.View KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatImageView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final LinearLayoutCompat valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public hCE(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C19976gWh c19976gWh, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull android.view.View view2) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = barrier;
        this.KWHzl = view;
        this.EZpvd = frameLayout;
        this.copydefault = appCompatImageView;
        this.AhwBna = c19976gWh;
        this.gEmmrt = appCompatTextView;
        this.djBIcL = appCompatImageView2;
        this.AYXKKw = appCompatTextView2;
        this.valueOf = linearLayoutCompat;
        this.DbNXlk = c55239xgG;
        this.values = view2;
    }

    public static hCE OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hOMIpD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hCE AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.RKDWNf;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
            i = C23274hvD.Application.QTtQrx;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.LocalOnBackPressedDispatcherOwner;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1;
                    C19976gWh c19976gWh = (C19976gWh) ViewBindings.findChildViewById(view, i);
                    if (c19976gWh != null) {
                        i = C23274hvD.Application.getContract;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C23274hvD.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                i = C23274hvD.Application.ReportDrawnCompositioncheckReporter1;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C23274hvD.Application.accessobserveReporter;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        i = C23274hvD.Application.ReportDrawnComposition;
                                        C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                                        if (c55239xgG != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.setAlphabeticShortcut))) != null) {
                                            return new hCE((ConstraintLayout) view, barrier, viewFindChildViewById, frameLayout, appCompatImageView, c19976gWh, appCompatTextView, appCompatImageView2, appCompatTextView2, linearLayoutCompat, c55239xgG, viewFindChildViewById2);
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
