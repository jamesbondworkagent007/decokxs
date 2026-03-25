package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36063oNx implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final android.view.View EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final LinearLayoutCompat gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.gEmmrt;
    }

    public C36063oNx(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5) {
        this.gEmmrt = linearLayoutCompat;
        this.KWHzl = linearLayoutCompat2;
        this.EZpvd = view;
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.valueOf = appCompatTextView3;
        this.AYXKKw = appCompatTextView4;
        this.djBIcL = appCompatTextView5;
    }

    public static C36063oNx KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.UrRBLY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C36063oNx EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.ejfBZ;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.OqFWZa))) != null) {
            i = C35964oKf.StateListAnimator.fXG;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C35964oKf.StateListAnimator.GVpNrsfQMcgE;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C35964oKf.StateListAnimator.isDevMode;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C35964oKf.StateListAnimator.STbtMW;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C35964oKf.StateListAnimator.IIEbr;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView4 != null) {
                                i = C35964oKf.StateListAnimator.isCurrent;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    return new C36063oNx((LinearLayoutCompat) view, linearLayoutCompat, viewFindChildViewById, constraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
