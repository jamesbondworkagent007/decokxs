package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oNN implements ViewBinding {
    public final mYA AEQbTJ;
    public final wYC AYXKKw;
    public final C55052xcf AhwBna;
    public final android.widget.TextView AkhnZx;
    public final wYC DbNXlk;
    public final ConstraintLayout EZpvd;
    public final C32348mYr KWHzl;
    public final mYF OLrzqt;
    public final mYK copydefault;
    public final wYC djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final C55113xdn fetchVPNInfo;
    public final wYC gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final C55173xeu valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.isConnected;
    }

    public oNN(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C32348mYr c32348mYr, @androidx.annotation.NonNull mYA mya, @androidx.annotation.NonNull mYK myk, @androidx.annotation.NonNull mYF myf, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull wYC wyc3, @androidx.annotation.NonNull wYC wyc4, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.isConnected = linearLayout;
        this.KWHzl = c32348mYr;
        this.AEQbTJ = mya;
        this.copydefault = myk;
        this.OLrzqt = myf;
        this.EZpvd = constraintLayout;
        this.valueOf = c55173xeu;
        this.AhwBna = c55052xcf;
        this.gEmmrt = wyc;
        this.AYXKKw = wyc2;
        this.djBIcL = wyc3;
        this.DbNXlk = wyc4;
        this.fetchVPNInfo = c55113xdn;
        this.AkhnZx = textView;
        this.values = textView2;
        this.fARcdN = textView3;
        this.ejfBZ = textView4;
    }

    public static oNN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.OTwTPd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static oNN copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.QHmsKR;
        C32348mYr c32348mYr = (C32348mYr) ViewBindings.findChildViewById(view, i);
        if (c32348mYr != null) {
            i = C35964oKf.StateListAnimator.DGOPHZDGOPHZ;
            mYA mya = (mYA) ViewBindings.findChildViewById(view, i);
            if (mya != null) {
                i = C35964oKf.StateListAnimator.DBxZfM;
                mYK myk = (mYK) ViewBindings.findChildViewById(view, i);
                if (myk != null) {
                    i = C35964oKf.StateListAnimator.DNMMPQ;
                    mYF myf = (mYF) ViewBindings.findChildViewById(view, i);
                    if (myf != null) {
                        i = C35964oKf.StateListAnimator.RKcVTr;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C35964oKf.StateListAnimator.invokespecialhlXVux;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C35964oKf.StateListAnimator.scanPackages;
                                C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
                                if (c55052xcf != null) {
                                    i = C35964oKf.StateListAnimator.FhERFw;
                                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                                    if (wyc != null) {
                                        i = C35964oKf.StateListAnimator.DQnQnb;
                                        wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                                        if (wyc2 != null) {
                                            i = C35964oKf.StateListAnimator.inahnb;
                                            wYC wyc3 = (wYC) ViewBindings.findChildViewById(view, i);
                                            if (wyc3 != null) {
                                                i = C35964oKf.StateListAnimator.Dff;
                                                wYC wyc4 = (wYC) ViewBindings.findChildViewById(view, i);
                                                if (wyc4 != null) {
                                                    i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                    if (c55113xdn != null) {
                                                        i = C35964oKf.StateListAnimator.setIconBitmap;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C35964oKf.StateListAnimator.getPercentRating;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = C35964oKf.StateListAnimator.onMetadataChanged;
                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = C35964oKf.StateListAnimator.MediaControllerCompatApi23TransportControls;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView4 != null) {
                                                                        return new oNN((android.widget.LinearLayout) view, c32348mYr, mya, myk, myf, constraintLayout, c55173xeu, c55052xcf, wyc, wyc2, wyc3, wyc4, c55113xdn, textView, textView2, textView3, textView4);
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
