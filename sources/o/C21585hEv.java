package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21585hEv implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.view.View AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final AppCompatTextView AuCTel;
    public final AppCompatTextView DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final ConstraintLayout KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final AppCompatImageView djBIcL;
    public final AppCompatTextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final C24804ikj fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final AppCompatTextView fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.view.View valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AhwBna;
    }

    public C21585hEv(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C24804ikj c24804ikj) {
        this.AhwBna = linearLayoutCompat;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.EZpvd = linearLayoutCompat2;
        this.OLrzqt = linearLayoutCompat3;
        this.copydefault = linearLayoutCompat4;
        this.AYXKKw = view;
        this.gEmmrt = view2;
        this.valueOf = view3;
        this.djBIcL = appCompatImageView;
        this.values = appCompatTextView;
        this.isConnected = appCompatTextView2;
        this.DbNXlk = appCompatTextView3;
        this.AkhnZx = linearLayout;
        this.fetchVPNInfo = appCompatTextView4;
        this.fJNWhG = appCompatTextView5;
        this.AuCTel = appCompatTextView6;
        this.ejfBZ = appCompatTextView7;
        this.fARcdN = textView;
        this.fIwbmz = c24804ikj;
    }

    public static C21585hEv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.GFUIi, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21585hEv AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C23274hvD.Application.DcMfJKfNLfdT;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.DcMfJKfbSiEC;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i = C23274hvD.Application.DzkRMH;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C23274hvD.Application.QFTsTN;
                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.OmJATG))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.RcvFxC))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.pause))) != null) {
                        i = C23274hvD.Application.ZAwExL;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C23274hvD.Application.setToolbarNavigationClickListener;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C23274hvD.Application.supportInvalidateOptionsMenu;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C23274hvD.Application.setSupportProgressBarVisibility;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView3 != null) {
                                        i = C23274hvD.Application.initializePanelDecor;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C23274hvD.Application.initWindowDecorActionBar;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = C23274hvD.Application.isActivityManifestHandlingUiMode;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView5 != null) {
                                                    i = C23274hvD.Application.createIntentFilterForBroadcastReceiver;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView6 != null) {
                                                        i = C23274hvD.Application.startAsSupportActionMode;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView7 != null) {
                                                            i = C23274hvD.Application.flushThemedResourcesCache;
                                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                i = C23274hvD.Application.setActionView;
                                                                C24804ikj c24804ikj = (C24804ikj) ViewBindings.findChildViewById(view, i);
                                                                if (c24804ikj != null) {
                                                                    return new C21585hEv(linearLayoutCompat, constraintLayout, constraintLayout2, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, linearLayout, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, textView, c24804ikj);
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
