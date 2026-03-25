package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uWK implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C55258xgZ copydefault;
    public final LinearLayoutCompat djBIcL;
    public final C55239xgG gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public uWK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55239xgG c55239xgG) {
        this.AEQbTJ = view;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.copydefault = c55258xgZ;
        this.djBIcL = linearLayoutCompat;
        this.gEmmrt = c55239xgG;
    }

    public static uWK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C48033uCm.Activity.finishInit, viewGroup);
        return KWHzl(viewGroup);
    }

    public static uWK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.QSLkRj;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C48033uCm.Application.postMessage;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C48033uCm.Application.extraCommand;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = C48033uCm.Application.ICustomTabsServiceStub;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C48033uCm.Application.onStateChanged;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C48033uCm.Application.ColorRes;
                            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                            if (c55239xgG != null) {
                                return new uWK(view, appCompatImageView, appCompatTextView, appCompatTextView2, c55258xgZ, linearLayoutCompat, c55239xgG);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
