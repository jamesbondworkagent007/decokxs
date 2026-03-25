package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23390hxN implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.view.View AhwBna;
    public final ConstraintLayout EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatTextView djBIcL;
    public final C24477iea gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23390hxN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C24477iea c24477iea, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.EZpvd = constraintLayout2;
        this.gEmmrt = c24477iea;
        this.AhwBna = view;
        this.djBIcL = appCompatTextView;
    }

    public static C23390hxN OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C23390hxN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QKVWgx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23390hxN OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.DcMfJKRKUgwx;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.WFXFk;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.handleMessage;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C23274hvD.Application.onBackPressed;
                    C24477iea c24477iea = (C24477iea) ViewBindings.findChildViewById(view, i);
                    if (c24477iea != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.setContentdefault))) != null) {
                        i = C23274hvD.Application.getOutline;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new C23390hxN(constraintLayout, linearLayoutCompat, appCompatImageView, appCompatImageView2, constraintLayout, c24477iea, viewFindChildViewById, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
