package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36086oOt implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final android.view.View AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final AppCompatImageView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AhwBna;
    }

    public C36086oOt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AhwBna = view;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.copydefault = appCompatImageView3;
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.AYXKKw = c55258xgZ;
        this.gEmmrt = appCompatTextView;
    }

    public static C36086oOt EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.zOIQXb, viewGroup);
        return copydefault(viewGroup);
    }

    public static C36086oOt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.drbYRJ;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C35964oKf.StateListAnimator.sRzUNh;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C35964oKf.StateListAnimator.aappFQ;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = C35964oKf.StateListAnimator.OCdtug;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C35964oKf.StateListAnimator.OeawrHRnVkix;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat2 != null) {
                            i = C35964oKf.StateListAnimator.getVolumeControl;
                            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ != null) {
                                i = C35964oKf.StateListAnimator.setActive;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new C36086oOt(view, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, linearLayoutCompat2, c55258xgZ, appCompatTextView);
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
