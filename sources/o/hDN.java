package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDN implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final wYC AYXKKw;
    public final OKSortTextView AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final android.widget.TextView AuCTel;
    public final C55173xeu DbNXlk;
    public final wYC EZpvd;
    public final wYC KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final OKSortTextView djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final LinearLayoutCompat fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final ConstraintLayout fetchVPNInfo;
    public final wYC gEmmrt;
    public final LinearLayoutCompat isConnected;
    public final android.widget.TextView iwGUEr;
    public final OKSortTextView valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public hDN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull wYC wyc3, @androidx.annotation.NonNull wYC wyc4, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout5, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.values = constraintLayout;
        this.copydefault = constraintLayout2;
        this.AEQbTJ = constraintLayout3;
        this.OLrzqt = constraintLayout4;
        this.KWHzl = wyc;
        this.EZpvd = wyc2;
        this.gEmmrt = wyc3;
        this.AYXKKw = wyc4;
        this.valueOf = oKSortTextView;
        this.AhwBna = oKSortTextView2;
        this.djBIcL = oKSortTextView3;
        this.AkhnZx = linearLayout;
        this.isConnected = linearLayoutCompat;
        this.fetchVPNInfo = constraintLayout5;
        this.DbNXlk = c55173xeu;
        this.fIwbmz = linearLayoutCompat2;
        this.ejfBZ = textView;
        this.fJNWhG = textView2;
        this.fARcdN = textView3;
        this.AuCTel = textView4;
        this.iwGUEr = textView5;
    }

    public static hDN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QslYrK, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hDN OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.invokespecialatDTRm;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.ROgMPW;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C23274hvD.Application.YFmri;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout3 != null) {
                    i = C23274hvD.Application.hrnhsO;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        i = C23274hvD.Application.RIsQag;
                        wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                        if (wyc2 != null) {
                            i = C23274hvD.Application.RjCdvp;
                            wYC wyc3 = (wYC) ViewBindings.findChildViewById(view, i);
                            if (wyc3 != null) {
                                i = C23274hvD.Application.RjCdvpRjCdvp;
                                wYC wyc4 = (wYC) ViewBindings.findChildViewById(view, i);
                                if (wyc4 != null) {
                                    i = C23274hvD.Application.isEmpty;
                                    OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                    if (oKSortTextView != null) {
                                        i = C23274hvD.Application.build;
                                        OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                        if (oKSortTextView2 != null) {
                                            i = C23274hvD.Application.setExtras;
                                            OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                            if (oKSortTextView3 != null) {
                                                i = C23274hvD.Application.removeQueueItemAt;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C23274hvD.Application.createCallback;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayoutCompat != null) {
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                        i = C23274hvD.Application.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A;
                                                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                                        if (c55173xeu != null) {
                                                            i = C23274hvD.Application.ActivityResultRegistryKt;
                                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayoutCompat2 != null) {
                                                                i = C23274hvD.Application.selectTab;
                                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView != null) {
                                                                    i = C23274hvD.Application.setBackgroundDrawable;
                                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView2 != null) {
                                                                        i = C23274hvD.Application.onDrawerClosed;
                                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView3 != null) {
                                                                            i = C23274hvD.Application.addActiveDelegate;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = C23274hvD.Application.DrawableContainerApi21Impl;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView5 != null) {
                                                                                    return new hDN(constraintLayout4, constraintLayout, constraintLayout2, constraintLayout3, wyc, wyc2, wyc3, wyc4, oKSortTextView, oKSortTextView2, oKSortTextView3, linearLayout, linearLayoutCompat, constraintLayout4, c55173xeu, linearLayoutCompat2, textView, textView2, textView3, textView4, textView5);
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
