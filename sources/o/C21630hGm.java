package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21630hGm implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C28067kNr OLrzqt;
    public final wYC copydefault;
    public final android.widget.TextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C21630hGm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C28067kNr c28067kNr, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c28067kNr;
        this.copydefault = wyc;
        this.EZpvd = linearLayout;
        this.KWHzl = linearLayoutCompat;
        this.gEmmrt = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.AhwBna = textView;
        this.djBIcL = textView2;
        this.AYXKKw = textView3;
        this.values = textView4;
        this.AkhnZx = textView5;
        this.DbNXlk = textView6;
    }

    public static C21630hGm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.itxZVF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21630hGm copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gAnGwV;
        C28067kNr c28067kNr = (C28067kNr) ViewBindings.findChildViewById(view, i);
        if (c28067kNr != null) {
            i = C23274hvD.Application.QhsCdEQhsCdE;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C23274hvD.Application.unregisterCallback;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C23274hvD.Application.MediaControllerCompatApi21;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C23274hvD.Application.from;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C23274hvD.Application.FloatRange;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView2 != null) {
                                i = C23274hvD.Application.getElevation;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C23274hvD.Application.AppCompatDelegateImplApi17Impl;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.isPowerSaveMode;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C23274hvD.Application.getListMenuView;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C23274hvD.Application.createToggleButton;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = C23274hvD.Application.setConstantState;
                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        return new C21630hGm((ConstraintLayout) view, c28067kNr, wyc, linearLayout, linearLayoutCompat, appCompatTextView, appCompatTextView2, textView, textView2, textView3, textView4, textView5, textView6);
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
