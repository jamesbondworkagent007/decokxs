package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23480hyy implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C55113xdn AYXKKw;
    public final AppCompatImageView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final C24804ikj AuCTel;
    public final LinearLayoutCompat DbNXlk;
    public final android.view.View EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final android.view.View djBIcL;
    public final android.widget.TextView ejfBZ;
    public final AppCompatTextView fetchVPNInfo;
    public final C55113xdn gEmmrt;
    public final ConstraintLayout isConnected;
    public final android.view.View valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.DbNXlk;
    }

    public C23480hyy(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C24804ikj c24804ikj) {
        this.DbNXlk = linearLayoutCompat;
        this.KWHzl = constraintLayout;
        this.AEQbTJ = linearLayoutCompat2;
        this.copydefault = linearLayoutCompat3;
        this.EZpvd = view;
        this.OLrzqt = view2;
        this.AhwBna = appCompatImageView;
        this.AYXKKw = c55113xdn;
        this.djBIcL = view3;
        this.gEmmrt = c55113xdn2;
        this.valueOf = view4;
        this.isConnected = constraintLayout2;
        this.values = appCompatTextView;
        this.fetchVPNInfo = appCompatTextView2;
        this.AkhnZx = appCompatTextView3;
        this.ejfBZ = textView;
        this.AuCTel = c24804ikj;
    }

    public static C23480hyy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DXXBbs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23480hyy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        android.view.View viewFindChildViewById4;
        int i = C23274hvD.Application.DcMfJKfNUfqk;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            i = C23274hvD.Application.DzkRMH;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.OmJATG))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.pause))) != null) {
                i = C23274hvD.Application.ZAwExL;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.getRatingStyle;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.newUnratedRating))) != null) {
                        i = C23274hvD.Application.getName;
                        C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn2 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getIcon))) != null) {
                            i = C23274hvD.Application.PipHintTrackerKttrackPipAnimationHintViewflow1;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C23274hvD.Application.supportInvalidateOptionsMenu;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C23274hvD.Application.initWindowDecorActionBar;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C23274hvD.Application.AppCompatDelegateImplAutoBatteryNightModeManager;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C23274hvD.Application.flushNougats;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C23274hvD.Application.setActionView;
                                                C24804ikj c24804ikj = (C24804ikj) ViewBindings.findChildViewById(view, i);
                                                if (c24804ikj != null) {
                                                    return new C23480hyy(linearLayoutCompat, constraintLayout, linearLayoutCompat, linearLayoutCompat2, viewFindChildViewById, viewFindChildViewById2, appCompatImageView, c55113xdn, viewFindChildViewById3, c55113xdn2, viewFindChildViewById4, constraintLayout2, appCompatTextView, appCompatTextView2, appCompatTextView3, textView, c24804ikj);
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
