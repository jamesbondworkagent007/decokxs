package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33897nJx implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView DbNXlk;
    public final oIV EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final LinearLayoutCompat djBIcL;
    public final C55251xgS gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public C33897nJx(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull oIV oiv, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AhwBna = linearLayout;
        this.copydefault = frameLayout;
        this.EZpvd = oiv;
        this.KWHzl = imageView;
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = linearLayout2;
        this.djBIcL = linearLayoutCompat2;
        this.AYXKKw = linearLayoutCompat3;
        this.gEmmrt = c55251xgS;
        this.valueOf = textView;
        this.values = imageView2;
        this.isConnected = textView2;
        this.DbNXlk = textView3;
    }

    public static C33897nJx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.QKudOq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33897nJx EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.htlTjW;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C35399nuc.StateListAnimator.DQzvGN;
            oIV oiv = (oIV) ViewBindings.findChildViewById(view, i);
            if (oiv != null) {
                i = C35399nuc.StateListAnimator.YFmri;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35399nuc.StateListAnimator.DcMfJKOmnske;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C35399nuc.StateListAnimator.DcMfJKfNLfdT;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C35399nuc.StateListAnimator.GFUIi;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = C35399nuc.StateListAnimator.DuXjdv;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = C35399nuc.StateListAnimator.NRYds;
                                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                    if (c55251xgS != null) {
                                        i = C35399nuc.StateListAnimator.dYepVG;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C35399nuc.StateListAnimator.znKlvJ;
                                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = C35399nuc.StateListAnimator.ardYFU;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C35399nuc.StateListAnimator.SaJVGb;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        return new C33897nJx((android.widget.LinearLayout) view, frameLayout, oiv, imageView, linearLayoutCompat, linearLayout, linearLayoutCompat2, linearLayoutCompat3, c55251xgS, textView, imageView2, textView2, textView3);
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
