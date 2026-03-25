package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48565uWc implements ViewBinding {
    public final C54979xbL AEQbTJ;
    public final C54979xbL EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C51717vsL OLrzqt;
    public final C51722vsQ copydefault;
    public final C51730vsY djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C54979xbL getRoot() {
        return this.EZpvd;
    }

    public C48565uWc(@androidx.annotation.NonNull C54979xbL c54979xbL, @androidx.annotation.NonNull C51722vsQ c51722vsQ, @androidx.annotation.NonNull C51717vsL c51717vsL, @androidx.annotation.NonNull C54979xbL c54979xbL2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C51730vsY c51730vsY) {
        this.EZpvd = c54979xbL;
        this.copydefault = c51722vsQ;
        this.OLrzqt = c51717vsL;
        this.AEQbTJ = c54979xbL2;
        this.KWHzl = linearLayoutCompat;
        this.djBIcL = c51730vsY;
    }

    public static C48565uWc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.zqTOFw;
        C51722vsQ c51722vsQ = (C51722vsQ) ViewBindings.findChildViewById(view, i);
        if (c51722vsQ != null) {
            i = C48033uCm.Application.DcMfJKgMxgjU;
            C51717vsL c51717vsL = (C51717vsL) ViewBindings.findChildViewById(view, i);
            if (c51717vsL != null) {
                C54979xbL c54979xbL = (C54979xbL) view;
                i = C48033uCm.Application.QSusPL;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C48033uCm.Application.registerOnBackInvokedCallback;
                    C51730vsY c51730vsY = (C51730vsY) ViewBindings.findChildViewById(view, i);
                    if (c51730vsY != null) {
                        return new C48565uWc(c54979xbL, c51722vsQ, c51717vsL, c54979xbL, linearLayoutCompat, c51730vsY);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
