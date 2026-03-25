package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C32726miy;

/* JADX INFO: renamed from: o.miG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32682miG implements ViewBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final LottieAnimationView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.RelativeLayout AkhnZx;
    public final android.widget.Space AuCTel;
    public final C32681miF DbNXlk;
    public final C33537myN EZpvd;
    public final LottieAnimationView KWHzl;
    public final wYF OLrzqt;
    public final ConstraintLayout copydefault;
    public final C32681miF djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.ScrollView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final C32681miF fetchVPNInfo;
    public final C32681miF gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.TextView valueOf;
    public final C32681miF values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C32682miG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C32681miF c32681miF, @androidx.annotation.NonNull C32681miF c32681miF2, @androidx.annotation.NonNull C32681miF c32681miF3, @androidx.annotation.NonNull C32681miF c32681miF4, @androidx.annotation.NonNull C32681miF c32681miF5, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.AhwBna = constraintLayout;
        this.EZpvd = c33537myN;
        this.OLrzqt = wyf;
        this.AEQbTJ = relativeLayout;
        this.copydefault = constraintLayout2;
        this.KWHzl = lottieAnimationView;
        this.AYXKKw = lottieAnimationView2;
        this.valueOf = textView;
        this.gEmmrt = c32681miF;
        this.djBIcL = c32681miF2;
        this.DbNXlk = c32681miF3;
        this.values = c32681miF4;
        this.fetchVPNInfo = c32681miF5;
        this.isConnected = linearLayout;
        this.AkhnZx = relativeLayout2;
        this.fIwbmz = scrollView;
        this.AuCTel = space;
        this.fARcdN = textView2;
        this.fJNWhG = textView3;
        this.ejfBZ = textView4;
        this.getFieldNames = textView5;
    }

    public static C32682miG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C32726miy.ActionBar.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C32682miG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C32726miy.Activity.EZpvd;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C32726miy.Activity.AhwBna;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C32726miy.Activity.fetchVPNInfo;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = C32726miy.Activity.fJNWhG;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C32726miy.Activity.AuCTel;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C32726miy.Activity.fIwbmz;
                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView2 != null) {
                                i = C32726miy.Activity.fARcdN;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C32726miy.Activity.hDKMBd))) != null) {
                                    C32681miF c32681miFOLrzqt = C32681miF.OLrzqt(viewFindChildViewById);
                                    i = C32726miy.Activity.getFieldNames;
                                    android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
                                    if (viewFindChildViewById2 != null) {
                                        C32681miF c32681miFOLrzqt2 = C32681miF.OLrzqt(viewFindChildViewById2);
                                        i = C32726miy.Activity.getNewProxyInstance;
                                        android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                                        if (viewFindChildViewById3 != null) {
                                            C32681miF c32681miFOLrzqt3 = C32681miF.OLrzqt(viewFindChildViewById3);
                                            i = C32726miy.Activity.uzCIH;
                                            android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                                            if (viewFindChildViewById4 != null) {
                                                C32681miF c32681miFOLrzqt4 = C32681miF.OLrzqt(viewFindChildViewById4);
                                                i = C32726miy.Activity.AubY;
                                                android.view.View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                                                if (viewFindChildViewById5 != null) {
                                                    C32681miF c32681miFOLrzqt5 = C32681miF.OLrzqt(viewFindChildViewById5);
                                                    i = C32726miy.Activity.zsXlph;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout != null) {
                                                        i = C32726miy.Activity.AuCTelauCTel;
                                                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout2 != null) {
                                                            i = C32726miy.Activity.zLjUOn;
                                                            android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                                                            if (scrollView != null) {
                                                                i = C32726miy.Activity.gHZMYf;
                                                                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                                                                if (space != null) {
                                                                    i = C32726miy.Activity.OcIXYQ;
                                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView2 != null) {
                                                                        i = C32726miy.Activity.QOLQEE;
                                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView3 != null) {
                                                                            i = C32726miy.Activity.ORxRYg;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = C32726miy.Activity.DTwDnp;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView5 != null) {
                                                                                    return new C32682miG((ConstraintLayout) view, c33537myN, wyf, relativeLayout, constraintLayout, lottieAnimationView, lottieAnimationView2, textView, c32681miFOLrzqt, c32681miFOLrzqt2, c32681miFOLrzqt3, c32681miFOLrzqt4, c32681miFOLrzqt5, linearLayout, relativeLayout2, scrollView, space, textView2, textView3, textView4, textView5);
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
