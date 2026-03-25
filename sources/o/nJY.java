package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.im.imui.utils.OKIMStateAwareFrameLayout;
import com.okinc.uilab.edit.OKEditText;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJY implements ViewBinding {
    public final OKEditText AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.ScrollView AkhnZx;
    public final OKIMStateAwareFrameLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C55173xeu copydefault;
    public final C55001xbh djBIcL;
    public final C55113xdn fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final C52794wYp isConnected;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public nJY(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.AhwBna = linearLayout;
        this.EZpvd = oKIMStateAwareFrameLayout;
        this.copydefault = c55173xeu;
        this.AEQbTJ = oKEditText;
        this.KWHzl = textView;
        this.OLrzqt = linearLayout2;
        this.AYXKKw = textView2;
        this.djBIcL = c55001xbh;
        this.valueOf = frameLayout;
        this.gEmmrt = textView3;
        this.isConnected = c52794wYp;
        this.AkhnZx = scrollView;
        this.fetchVPNInfo = c55113xdn;
    }

    public static nJY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DLWbHP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static nJY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.AhwBna;
        OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout = (OKIMStateAwareFrameLayout) ViewBindings.findChildViewById(view, i);
        if (oKIMStateAwareFrameLayout != null) {
            i = C35399nuc.StateListAnimator.sTzBva;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35399nuc.StateListAnimator.invokespecialRtjmuc;
                OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                if (oKEditText != null) {
                    i = C35399nuc.StateListAnimator.invokespecialODCBUN;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                        i = C35399nuc.StateListAnimator.DcMfJKDDUqPf;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C35399nuc.StateListAnimator.DcMfJKsuEgdN;
                            C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
                            if (c55001xbh != null) {
                                i = C35399nuc.StateListAnimator.glVQsU;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = C35399nuc.StateListAnimator.sRzUNh;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C35399nuc.StateListAnimator.DjwCMv;
                                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                        if (c52794wYp != null) {
                                            i = C35399nuc.StateListAnimator.HJWChPQPAeHI;
                                            android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                                            if (scrollView != null) {
                                                i = C35399nuc.StateListAnimator.getUriFromString;
                                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                if (c55113xdn != null) {
                                                    return new nJY(linearLayout, oKIMStateAwareFrameLayout, c55173xeu, oKEditText, textView, linearLayout, textView2, c55001xbh, frameLayout, textView3, c52794wYp, scrollView, c55113xdn);
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
