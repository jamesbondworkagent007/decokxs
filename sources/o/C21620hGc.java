package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21620hGc implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C55320xhi DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.view.View OLrzqt;
    public final AppCompatTextView copydefault;
    public final LinearLayoutCompat djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.djBIcL;
    }

    public C21620hGc(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull C55320xhi c55320xhi) {
        this.djBIcL = linearLayoutCompat;
        this.KWHzl = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.OLrzqt = view;
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = linearLayout;
        this.valueOf = linearLayout2;
        this.gEmmrt = appCompatTextView3;
        this.AhwBna = appCompatTextView4;
        this.AYXKKw = appCompatTextView5;
        this.isConnected = appCompatTextView6;
        this.DbNXlk = c55320xhi;
    }

    public static C21620hGc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.HJWChPOKBmQNaCIdOM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21620hGc copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.UhxbNG;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C23274hvD.Application.gmHjFq;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.UimiPOhkCVbT))) != null) {
                i = C23274hvD.Application.DjzMc;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.onSetCaptioningEnabled;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.unregisterOnBackInvokedCallback;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C23274hvD.Application.initializePanelContent;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = C23274hvD.Application.initializePanelMenu;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = C23274hvD.Application.preparePanel;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView5 != null) {
                                        i = C23274hvD.Application.createRatingBar;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView6 != null) {
                                            i = C23274hvD.Application.parseItem;
                                            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                            if (c55320xhi != null) {
                                                return new C21620hGc((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2, viewFindChildViewById, appCompatImageView, linearLayout, linearLayout2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, c55320xhi);
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
