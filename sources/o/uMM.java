package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uMM implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public uMM(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.AYXKKw = linearLayout;
        this.copydefault = textView;
        this.OLrzqt = textView2;
        this.KWHzl = textView3;
        this.EZpvd = linearLayout2;
        this.AEQbTJ = textView4;
        this.AhwBna = linearLayout3;
        this.djBIcL = textView5;
        this.valueOf = linearLayout4;
        this.gEmmrt = textView6;
    }

    public static uMM KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.AuCTelauCTel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static uMM AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.ULRxlR;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.gezFCt;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C48033uCm.Application.hQkvHM;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C48033uCm.Application.ddauOi;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C48033uCm.Application.MediaControllerCompatMediaControllerImplApi24;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C48033uCm.Application.getMaxVolume;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C48033uCm.Application.MediaControllerCompatTransportControlsApi24;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = C48033uCm.Application.fromToken;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = C48033uCm.Application.Rstyleable;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new uMM((android.widget.LinearLayout) view, textView, textView2, textView3, linearLayout, textView4, linearLayout2, textView5, linearLayout3, textView6);
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
