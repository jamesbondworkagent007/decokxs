package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.im.imui.utils.OKIMStateAwareFrameLayout;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33925nKy implements ViewBinding {
    public final OKIMStateAwareFrameLayout AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final C55001xbh AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final C55166xen EZpvd;
    public final C52794wYp KWHzl;
    public final wYK OLrzqt;
    public final C55166xen copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.ScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.isConnected;
    }

    public C33925nKy(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55166xen c55166xen, @androidx.annotation.NonNull C55166xen c55166xen2, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.isConnected = linearLayout;
        this.AEQbTJ = oKIMStateAwareFrameLayout;
        this.KWHzl = c52794wYp;
        this.EZpvd = c55166xen;
        this.copydefault = c55166xen2;
        this.OLrzqt = wyk;
        this.valueOf = linearLayout2;
        this.AhwBna = c55001xbh;
        this.djBIcL = textView;
        this.AYXKKw = frameLayout;
        this.gEmmrt = textView2;
        this.values = scrollView;
        this.fetchVPNInfo = textView3;
        this.AkhnZx = textView4;
        this.DbNXlk = textView5;
    }

    public static C33925nKy EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DCUTEIddSDPG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33925nKy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.gEmmrt;
        OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout = (OKIMStateAwareFrameLayout) ViewBindings.findChildViewById(view, i);
        if (oKIMStateAwareFrameLayout != null) {
            i = C35399nuc.StateListAnimator.QOLQEE;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C35399nuc.StateListAnimator.OBJEWx;
                C55166xen c55166xen = (C55166xen) ViewBindings.findChildViewById(view, i);
                if (c55166xen != null) {
                    i = C35399nuc.StateListAnimator.hBpjJd;
                    C55166xen c55166xen2 = (C55166xen) ViewBindings.findChildViewById(view, i);
                    if (c55166xen2 != null) {
                        i = C35399nuc.StateListAnimator.USBtdM;
                        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                        if (wyk != null) {
                            i = C35399nuc.StateListAnimator.DcMfJKDCKfqP;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C35399nuc.StateListAnimator.DlmWDR;
                                C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
                                if (c55001xbh != null) {
                                    i = C35399nuc.StateListAnimator.DwQSDd;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C35399nuc.StateListAnimator.DzkRMH;
                                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = C35399nuc.StateListAnimator.hGuIrQ;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = C35399nuc.StateListAnimator.iLAtSv;
                                                android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                                                if (scrollView != null) {
                                                    i = C35399nuc.StateListAnimator.dXhJGx;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C35399nuc.StateListAnimator.ScLVFT;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = C35399nuc.StateListAnimator.zMXLsR;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                return new C33925nKy((android.widget.LinearLayout) view, oKIMStateAwareFrameLayout, c52794wYp, c55166xen, c55166xen2, wyk, linearLayout, c55001xbh, textView, frameLayout, textView2, scrollView, textView3, textView4, textView5);
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
