package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21552hDp implements ViewBinding {
    public final C19863gSc AEQbTJ;
    public final C55251xgS AYXKKw;
    public final android.view.View AhwBna;
    public final AppCompatTextView DbNXlk;
    public final Barrier EZpvd;
    public final C19863gSc KWHzl;
    public final C19863gSc OLrzqt;
    public final Flow copydefault;
    public final ConstraintLayout djBIcL;
    public final C55251xgS fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final AppCompatTextView isConnected;
    public final C22265hcB valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C21552hDp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C19863gSc c19863gSc, @androidx.annotation.NonNull C19863gSc c19863gSc2, @androidx.annotation.NonNull C19863gSc c19863gSc3, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C22265hcB c22265hcB, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.djBIcL = constraintLayout;
        this.EZpvd = barrier;
        this.OLrzqt = c19863gSc;
        this.KWHzl = c19863gSc2;
        this.AEQbTJ = c19863gSc3;
        this.copydefault = flow;
        this.gEmmrt = appCompatImageView;
        this.AhwBna = view;
        this.valueOf = c22265hcB;
        this.AYXKKw = c55251xgS;
        this.fetchVPNInfo = c55251xgS2;
        this.isConnected = appCompatTextView;
        this.DbNXlk = appCompatTextView2;
    }

    public static C21552hDp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJKgMxgjU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21552hDp AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.ffGIBT;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.gLWkOL;
            C19863gSc c19863gSc = (C19863gSc) ViewBindings.findChildViewById(view, i);
            if (c19863gSc != null) {
                i = C23274hvD.Application.dpErvT;
                C19863gSc c19863gSc2 = (C19863gSc) ViewBindings.findChildViewById(view, i);
                if (c19863gSc2 != null) {
                    i = C23274hvD.Application.xxhdY;
                    C19863gSc c19863gSc3 = (C19863gSc) ViewBindings.findChildViewById(view, i);
                    if (c19863gSc3 != null) {
                        i = C23274hvD.Application.znKlvJ;
                        Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                        if (flow != null) {
                            i = C23274hvD.Application.DjzMc;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getString))) != null) {
                                i = C23274hvD.Application.getCurrentControllerInfo;
                                C22265hcB c22265hcB = (C22265hcB) ViewBindings.findChildViewById(view, i);
                                if (c22265hcB != null) {
                                    i = C23274hvD.Application.launchdefault;
                                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                    if (c55251xgS != null) {
                                        i = C23274hvD.Application.bindRcKey;
                                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                        if (c55251xgS2 != null) {
                                            i = C23274hvD.Application.shouldAnimateContextView;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = C23274hvD.Application.indexOfTransition;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    return new C21552hDp((ConstraintLayout) view, barrier, c19863gSc, c19863gSc2, c19863gSc3, flow, appCompatImageView, viewFindChildViewById, c22265hcB, c55251xgS, c55251xgS2, appCompatTextView, appCompatTextView2);
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
