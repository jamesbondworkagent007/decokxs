package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21469hAn implements ViewBinding {
    public final C55052xcf AEQbTJ;
    public final SwitchCompat AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final C55052xcf KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C55258xgZ djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AhwBna;
    }

    public C21469hAn(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull C55052xcf c55052xcf2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SwitchCompat switchCompat, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AhwBna = linearLayoutCompat;
        this.AEQbTJ = c55052xcf;
        this.KWHzl = c55052xcf2;
        this.OLrzqt = imageView;
        this.copydefault = imageView2;
        this.EZpvd = linearLayoutCompat2;
        this.gEmmrt = linearLayout;
        this.AYXKKw = switchCompat;
        this.djBIcL = c55258xgZ;
        this.valueOf = textView;
        this.fetchVPNInfo = textView2;
    }

    public static C21469hAn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aHXSQp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21469hAn KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OqCbbx;
        C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
        if (c55052xcf != null) {
            i = C23274hvD.Application.onProviderEnabled;
            C55052xcf c55052xcf2 = (C55052xcf) ViewBindings.findChildViewById(view, i);
            if (c55052xcf2 != null) {
                i = C23274hvD.Application.hijVBL;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.getStateLabel;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                        i = C23274hvD.Application.prepareFromUri;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.ContextAwareHelper;
                            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                            if (switchCompat != null) {
                                i = C23274hvD.Application.setOnDismissListener;
                                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                if (c55258xgZ != null) {
                                    i = C23274hvD.Application.getDelegate;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C23274hvD.Application.dispatchKeyEvent;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new C21469hAn(linearLayoutCompat, c55052xcf, c55052xcf2, imageView, imageView2, linearLayoutCompat, linearLayout, switchCompat, c55258xgZ, textView, textView2);
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
