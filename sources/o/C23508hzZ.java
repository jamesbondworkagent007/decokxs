package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23508hzZ implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C21977hTi AkhnZx;
    public final C21977hTi DbNXlk;
    public final ConstraintLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final C21977hTi fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final C21977hTi isConnected;
    public final AppCompatTextView valueOf;
    public final C21977hTi values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23508hzZ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C21977hTi c21977hTi, @androidx.annotation.NonNull C21977hTi c21977hTi2, @androidx.annotation.NonNull C21977hTi c21977hTi3, @androidx.annotation.NonNull C21977hTi c21977hTi4, @androidx.annotation.NonNull C21977hTi c21977hTi5) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = constraintLayout2;
        this.OLrzqt = constraintLayout3;
        this.KWHzl = linearLayout;
        this.EZpvd = constraintLayout4;
        this.gEmmrt = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.AYXKKw = textView;
        this.valueOf = appCompatTextView3;
        this.djBIcL = textView2;
        this.DbNXlk = c21977hTi;
        this.isConnected = c21977hTi2;
        this.values = c21977hTi3;
        this.AkhnZx = c21977hTi4;
        this.fetchVPNInfo = c21977hTi5;
    }

    public static C23508hzZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C23274hvD.Application.gCZUJG;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout2 != null) {
            i = C23274hvD.Application.validateCustomAction;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.setState;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout3 != null) {
                    i = C23274hvD.Application.ActionBarOnNavigationListener;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.AppCompatDelegateImplAppCompatWindowCallback;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.bypassOnPanelClosed;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.setProgress;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C23274hvD.Application.getStateCount;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.WindowCallbackWrapperApi26Impl;
                                        C21977hTi c21977hTi = (C21977hTi) ViewBindings.findChildViewById(view, i);
                                        if (c21977hTi != null) {
                                            i = C23274hvD.Application.ActionMenuItem;
                                            C21977hTi c21977hTi2 = (C21977hTi) ViewBindings.findChildViewById(view, i);
                                            if (c21977hTi2 != null) {
                                                i = C23274hvD.Application.getAlphabeticModifiers;
                                                C21977hTi c21977hTi3 = (C21977hTi) ViewBindings.findChildViewById(view, i);
                                                if (c21977hTi3 != null) {
                                                    i = C23274hvD.Application.setIconTintMode;
                                                    C21977hTi c21977hTi4 = (C21977hTi) ViewBindings.findChildViewById(view, i);
                                                    if (c21977hTi4 != null) {
                                                        i = C23274hvD.Application.setOnMenuItemClickListener;
                                                        C21977hTi c21977hTi5 = (C21977hTi) ViewBindings.findChildViewById(view, i);
                                                        if (c21977hTi5 != null) {
                                                            return new C23508hzZ(constraintLayout, constraintLayout, constraintLayout2, linearLayout, constraintLayout3, appCompatTextView, appCompatTextView2, textView, appCompatTextView3, textView2, c21977hTi, c21977hTi2, c21977hTi3, c21977hTi4, c21977hTi5);
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
