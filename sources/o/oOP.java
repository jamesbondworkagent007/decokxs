package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOP implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final android.widget.ScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.values;
    }

    public oOP(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.values = scrollView;
        this.EZpvd = imageView;
        this.KWHzl = imageView2;
        this.copydefault = imageView3;
        this.AEQbTJ = linearLayout;
        this.OLrzqt = textView;
        this.djBIcL = linearLayout2;
        this.gEmmrt = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.valueOf = appCompatTextView3;
        this.AYXKKw = appCompatTextView4;
        this.AkhnZx = linearLayout3;
        this.fetchVPNInfo = appCompatTextView5;
        this.isConnected = appCompatTextView6;
    }

    public static oOP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DIIpTV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static oOP EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.uzCIH;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C35964oKf.StateListAnimator.getNewProxyInstance;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C35964oKf.StateListAnimator.AuCTelauCTel;
                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = C35964oKf.StateListAnimator.zsXlph;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C35964oKf.StateListAnimator.AubY;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35964oKf.StateListAnimator.RuDPQV;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C35964oKf.StateListAnimator.aGOrKO;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C35964oKf.StateListAnimator.dPnHjp;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C35964oKf.StateListAnimator.atDTRm;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C35964oKf.StateListAnimator.ODCBUN;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = C35964oKf.StateListAnimator.invokespecialsiEkQe;
                                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout3 != null) {
                                                    i = C35964oKf.StateListAnimator.YFmri;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C35964oKf.StateListAnimator.OmPrLP;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            return new oOP((android.widget.ScrollView) view, imageView, imageView2, imageView3, linearLayout, textView, linearLayout2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, linearLayout3, appCompatTextView5, appCompatTextView6);
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
