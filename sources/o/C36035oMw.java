package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36035oMw implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.LinearLayout DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.RelativeLayout djBIcL;
    public final C55052xcf gEmmrt;
    public final C39807pzM valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.DbNXlk;
    }

    public C36035oMw(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C39807pzM c39807pzM, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.DbNXlk = linearLayout;
        this.copydefault = textView;
        this.EZpvd = textView2;
        this.KWHzl = textView3;
        this.AEQbTJ = textView4;
        this.OLrzqt = textView5;
        this.AhwBna = textView6;
        this.gEmmrt = c55052xcf;
        this.djBIcL = relativeLayout;
        this.AYXKKw = linearLayout2;
        this.valueOf = c39807pzM;
        this.values = textView7;
    }

    public static C36035oMw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.fvQaOB;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C35964oKf.StateListAnimator.dmfpNf;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C35964oKf.StateListAnimator.ODXsMY;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C35964oKf.StateListAnimator.DLWbHP;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = C35964oKf.StateListAnimator.OFhtUX;
                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = C35964oKf.StateListAnimator.hrNTAI;
                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = C35964oKf.StateListAnimator.cBPFI;
                                C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
                                if (c55052xcf != null) {
                                    i = C35964oKf.StateListAnimator.hrjNmC;
                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = C35964oKf.StateListAnimator.HJWChPdIKEqB;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C35964oKf.StateListAnimator.RXxsjQ;
                                            C39807pzM c39807pzM = (C39807pzM) ViewBindings.findChildViewById(view, i);
                                            if (c39807pzM != null) {
                                                i = C35964oKf.StateListAnimator.INotificationSideChannelDefault;
                                                android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView7 != null) {
                                                    return new C36035oMw((android.widget.LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, c55052xcf, relativeLayout, linearLayout, c39807pzM, textView7);
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
