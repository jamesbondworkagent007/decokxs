package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEN implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final C28034kMl AuCTel;
    public final android.widget.LinearLayout DbNXlk;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final C28029kMg ejfBZ;
    public final C28055kNf fARcdN;
    public final C28055kNf fIwbmz;
    public final C28024kMb fJNWhG;
    public final C28029kMg fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final C28034kMl isConnected;
    public final AppCompatTextView valueOf;
    public final C28034kMl values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AEQbTJ;
    }

    public hEN(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull C28034kMl c28034kMl, @androidx.annotation.NonNull C28034kMl c28034kMl2, @androidx.annotation.NonNull C28029kMg c28029kMg, @androidx.annotation.NonNull C28029kMg c28029kMg2, @androidx.annotation.NonNull C28055kNf c28055kNf, @androidx.annotation.NonNull C28024kMb c28024kMb, @androidx.annotation.NonNull C28034kMl c28034kMl3, @androidx.annotation.NonNull C28055kNf c28055kNf2) {
        this.AEQbTJ = nestedScrollView;
        this.OLrzqt = linearLayout;
        this.EZpvd = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.KWHzl = appCompatTextView3;
        this.valueOf = appCompatTextView4;
        this.djBIcL = appCompatTextView5;
        this.AhwBna = appCompatTextView6;
        this.gEmmrt = appCompatTextView7;
        this.AYXKKw = appCompatTextView8;
        this.DbNXlk = linearLayout2;
        this.AkhnZx = linearLayout3;
        this.isConnected = c28034kMl;
        this.values = c28034kMl2;
        this.fetchVPNInfo = c28029kMg;
        this.ejfBZ = c28029kMg2;
        this.fARcdN = c28055kNf;
        this.fJNWhG = c28024kMb;
        this.AuCTel = c28034kMl3;
        this.fIwbmz = c28055kNf2;
    }

    public static hEN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OzhFjl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hEN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gtCCJH;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.getDisplayOptions;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C23274hvD.Application.AlertControllerAlertParams;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = C23274hvD.Application.AppCompatCallback;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = C23274hvD.Application.ensureWindow;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = C23274hvD.Application.onMenuModeChange;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                i = C23274hvD.Application.setHotspotBounds;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView6 != null) {
                                    i = C23274hvD.Application.getDirection;
                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView7 != null) {
                                        i = C23274hvD.Application.getArrowShaftLength;
                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView8 != null) {
                                            i = C23274hvD.Application.getEmbeddedMenuWidthLimit;
                                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = C23274hvD.Application.isUiFocusable;
                                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout3 != null) {
                                                    i = C23274hvD.Application.onForwardingStarted;
                                                    C28034kMl c28034kMl = (C28034kMl) ViewBindings.findChildViewById(view, i);
                                                    if (c28034kMl != null) {
                                                        i = C23274hvD.Application.collapseItemActionView;
                                                        C28034kMl c28034kMl2 = (C28034kMl) ViewBindings.findChildViewById(view, i);
                                                        if (c28034kMl2 != null) {
                                                            i = C23274hvD.Application.expandItemActionView;
                                                            C28029kMg c28029kMg = (C28029kMg) ViewBindings.findChildViewById(view, i);
                                                            if (c28029kMg != null) {
                                                                i = C23274hvD.Application.shouldIncludeItem;
                                                                C28029kMg c28029kMg2 = (C28029kMg) ViewBindings.findChildViewById(view, i);
                                                                if (c28029kMg2 != null) {
                                                                    i = C23274hvD.Application.setId;
                                                                    C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
                                                                    if (c28055kNf != null) {
                                                                        i = C23274hvD.Application.internalClear;
                                                                        C28024kMb c28024kMb = (C28024kMb) ViewBindings.findChildViewById(view, i);
                                                                        if (c28024kMb != null) {
                                                                            i = C23274hvD.Application.internalRemoveItem;
                                                                            C28034kMl c28034kMl3 = (C28034kMl) ViewBindings.findChildViewById(view, i);
                                                                            if (c28034kMl3 != null) {
                                                                                i = C23274hvD.Application.findIndexOfAddedMenu;
                                                                                C28055kNf c28055kNf2 = (C28055kNf) ViewBindings.findChildViewById(view, i);
                                                                                if (c28055kNf2 != null) {
                                                                                    return new hEN((NestedScrollView) view, linearLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, linearLayout2, linearLayout3, c28034kMl, c28034kMl2, c28029kMg, c28029kMg2, c28055kNf, c28024kMb, c28034kMl3, c28055kNf2);
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
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
