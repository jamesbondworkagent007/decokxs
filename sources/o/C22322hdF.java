package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22322hdF implements ViewBinding {
    public final android.view.View EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C22322hdF(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = view;
        this.KWHzl = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.copydefault = appCompatTextView;
    }

    public static C22322hdF copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C22366hdx.Activity.AYXKKw, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C22322hdF AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C22366hdx.ActionBar.QbewEr;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C22366hdx.ActionBar.dvKsVJ;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C22366hdx.ActionBar.run;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new C22322hdF(view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
