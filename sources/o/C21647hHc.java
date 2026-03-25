package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21647hHc implements ViewBinding {
    public final wYC AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatTextView AhwBna;
    public final wYC EZpvd;
    public final wYC KWHzl;
    public final C28067kNr OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final C55251xgS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C21647hHc(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull C28067kNr c28067kNr, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull wYC wyc3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AYXKKw = constraintLayout;
        this.copydefault = linearLayout;
        this.EZpvd = wyc;
        this.OLrzqt = c28067kNr;
        this.AEQbTJ = wyc2;
        this.KWHzl = wyc3;
        this.gEmmrt = imageView;
        this.valueOf = c55251xgS;
        this.AhwBna = appCompatTextView;
        this.djBIcL = appCompatTextView2;
    }

    public static C21647hHc AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aWJMta, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21647hHc copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getNewProxyInstance;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.DNMMPQ;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C23274hvD.Application.gAnGwV;
                C28067kNr c28067kNr = (C28067kNr) ViewBindings.findChildViewById(view, i);
                if (c28067kNr != null) {
                    i = C23274hvD.Application.QhsCdEQhsCdE;
                    wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc2 != null) {
                        i = C23274hvD.Application.ArkbYM;
                        wYC wyc3 = (wYC) ViewBindings.findChildViewById(view, i);
                        if (wyc3 != null) {
                            i = C23274hvD.Application.getCallbacks;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C23274hvD.Application.setIconBitmap;
                                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                if (c55251xgS != null) {
                                    i = C23274hvD.Application.AlertController3;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = C23274hvD.Application.getListMenuView;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            return new C21647hHc((ConstraintLayout) view, linearLayout, wyc, c28067kNr, wyc2, wyc3, imageView, c55251xgS, appCompatTextView, appCompatTextView2);
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
