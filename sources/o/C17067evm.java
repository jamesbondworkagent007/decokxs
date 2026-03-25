package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17067evm implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final wYC OLrzqt;
    public final wYC copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C17067evm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = wyc;
        this.copydefault = wyc2;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = constraintLayout2;
        this.valueOf = linearLayout;
        this.AhwBna = textView;
        this.AYXKKw = textView2;
        this.gEmmrt = textView3;
    }

    public static C17067evm copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DAgZj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C17067evm OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.dNCPSb;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C13754dXa.ActionBar.DsfknC;
            wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc2 != null) {
                i = C13754dXa.ActionBar.getConnectivityMgr;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C13754dXa.ActionBar.getToken;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C13754dXa.ActionBar.getExtraBinder;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C13754dXa.ActionBar.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C13754dXa.ActionBar.onBackPressedDispatcherlambda1;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new C17067evm(constraintLayout, wyc, wyc2, appCompatImageView, constraintLayout, linearLayout, textView, textView2, textView3);
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
