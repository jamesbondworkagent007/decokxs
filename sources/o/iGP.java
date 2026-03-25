package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iGP implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.LinearLayout DbNXlk;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C27207jqo OLrzqt;
    public final C27137jpX copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final C27204jql valueOf;
    public final C33546myW values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public iGP(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C27137jpX c27137jpX, @androidx.annotation.NonNull C27207jqo c27207jqo, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C27204jql c27204jql, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout5, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.AkhnZx = constraintLayout;
        this.AEQbTJ = c33537myN;
        this.copydefault = c27137jpX;
        this.OLrzqt = c27207jqo;
        this.EZpvd = frameLayout;
        this.KWHzl = frameLayout2;
        this.AhwBna = linearLayout;
        this.gEmmrt = linearLayout2;
        this.valueOf = c27204jql;
        this.djBIcL = constraintLayout2;
        this.AYXKKw = linearLayout3;
        this.fetchVPNInfo = linearLayout4;
        this.DbNXlk = linearLayout5;
        this.values = c33546myW;
    }

    public static iGP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static iGP KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static iGP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.iwGUEr;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C25493ixk.ActionBar.fGQ;
            C27137jpX c27137jpX = (C27137jpX) ViewBindings.findChildViewById(view, i);
            if (c27137jpX != null) {
                i = C25493ixk.ActionBar.DcMfJKfNUfqk;
                C27207jqo c27207jqo = (C27207jqo) ViewBindings.findChildViewById(view, i);
                if (c27207jqo != null) {
                    i = C25493ixk.ActionBar.DcMfJKsfEqpH;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = C25493ixk.ActionBar.DcMfJKgMxgjU;
                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = C25493ixk.ActionBar.DcMfJKfwDlxl;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C25493ixk.ActionBar.DcMfJKsgNvtZ;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C25493ixk.ActionBar.DlABUU;
                                    C27204jql c27204jql = (C27204jql) ViewBindings.findChildViewById(view, i);
                                    if (c27204jql != null) {
                                        i = C25493ixk.ActionBar.DfrfUJ;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = C25493ixk.ActionBar.getAdvertisingId;
                                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout3 != null) {
                                                i = C25493ixk.ActionBar.bindToGooglePlayService;
                                                android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout4 != null) {
                                                    i = C25493ixk.ActionBar.DxnCrt;
                                                    android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout5 != null) {
                                                        i = C25493ixk.ActionBar.QTtQrx;
                                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                        if (c33546myW != null) {
                                                            return new iGP((ConstraintLayout) view, c33537myN, c27137jpX, c27207jqo, frameLayout, frameLayout2, linearLayout, linearLayout2, c27204jql, constraintLayout, linearLayout3, linearLayout4, linearLayout5, c33546myW);
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
