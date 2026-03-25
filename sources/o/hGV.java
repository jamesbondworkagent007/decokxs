package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes23.dex */
public final class hGV implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C55113xdn EZpvd;
    public final AppCompatImageView KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public hGV(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.OLrzqt = view;
        this.copydefault = frameLayout;
        this.EZpvd = c55113xdn;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = appCompatTextView;
    }

    public static hGV KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.QOeQqh, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static hGV OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.apAOXX;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplApi23;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C23274hvD.Application.MediaBrowserCompatMediaItem;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.initializeDrawableForDisplay;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new hGV(view, frameLayout, c55113xdn, appCompatImageView, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
