package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21631hGn implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final hXQ AYXKKw;
    public final hXJ EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C21631hGn(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull hXJ hxj, @androidx.annotation.NonNull hXQ hxq) {
        this.AEQbTJ = view;
        this.OLrzqt = linearLayoutCompat;
        this.copydefault = appCompatImageView;
        this.KWHzl = linearLayoutCompat2;
        this.EZpvd = hxj;
        this.AYXKKw = hxq;
    }

    public static C21631hGn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.HJWChPRGtXKCDKRTZD, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C21631hGn AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sendBehavioSecData;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.fOrBHg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.onRepeatModeChanged;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C23274hvD.Application.onEnd;
                    hXJ hxj = (hXJ) ViewBindings.findChildViewById(view, i);
                    if (hxj != null) {
                        i = C23274hvD.Application.setShortcut;
                        hXQ hxq = (hXQ) ViewBindings.findChildViewById(view, i);
                        if (hxq != null) {
                            return new C21631hGn(view, linearLayoutCompat, appCompatImageView, linearLayoutCompat2, hxj, hxq);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
