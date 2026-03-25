package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21643hGz implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C52794wYp EZpvd;
    public final AppCompatImageView KWHzl;
    public final android.view.View OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C21643hGz(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.OLrzqt = view;
        this.EZpvd = c52794wYp;
        this.KWHzl = appCompatImageView;
        this.copydefault = appCompatTextView;
        this.AEQbTJ = appCompatTextView2;
    }

    public static C21643hGz EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.QSAYLr, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C21643hGz OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.heceqZ;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.updateVisuals;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.setDisplayShowTitleEnabled;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.parseItem;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        return new C21643hGz(view, c52794wYp, appCompatImageView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
