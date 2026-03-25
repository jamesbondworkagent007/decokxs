package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSQ implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final AppCompatImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.RelativeLayout gEmmrt;
    public final android.widget.TextView valueOf;
    public final LinearLayoutCompat values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.gEmmrt;
    }

    public uSQ(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.gEmmrt = relativeLayout;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = linearLayoutCompat;
        this.EZpvd = linearLayoutCompat2;
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.djBIcL = textView3;
        this.AYXKKw = textView4;
        this.valueOf = textView5;
        this.AhwBna = textView6;
        this.fetchVPNInfo = textView7;
        this.values = linearLayoutCompat3;
    }

    public static uSQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialsiEkQe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uSQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.AuCTel;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C48033uCm.Application.ejfBZ;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C48033uCm.Application.hKJZrr;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C48033uCm.Application.RckOJh;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C48033uCm.Application.zzJhsT;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C48033uCm.Application.jFiva;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C48033uCm.Application.sEcTXd;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C48033uCm.Application.RIKbBf;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C48033uCm.Application.parseResult;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = C48033uCm.Application.AttrRes;
                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = C48033uCm.Application.conditional;
                                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat3 != null) {
                                                    return new uSQ((android.widget.RelativeLayout) view, appCompatImageView, linearLayoutCompat, linearLayoutCompat2, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayoutCompat3);
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
