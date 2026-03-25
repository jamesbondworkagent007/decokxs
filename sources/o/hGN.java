package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hGN implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final AppCompatImageView EZpvd;
    public final android.widget.RelativeLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final C24253iaO djBIcL;
    public final C24247iaI gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.KWHzl;
    }

    public hGN(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C24253iaO c24253iaO, @androidx.annotation.NonNull C24247iaI c24247iaI) {
        this.KWHzl = relativeLayout;
        this.EZpvd = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.OLrzqt = imageView;
        this.AEQbTJ = linearLayout;
        this.AYXKKw = linearLayout2;
        this.valueOf = appCompatTextView;
        this.djBIcL = c24253iaO;
        this.gEmmrt = c24247iaI;
    }

    public static hGN EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.HJWChPhFGucI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hGN copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ejfBZ;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.ICustomTabsServiceStub;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.setRccState;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.setContent;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C23274hvD.Application.removeAllTabs;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C23274hvD.Application.getDecorToolbar;
                                C24253iaO c24253iaO = (C24253iaO) ViewBindings.findChildViewById(view, i);
                                if (c24253iaO != null) {
                                    i = C23274hvD.Application.setVerticalMirror;
                                    C24247iaI c24247iaI = (C24247iaI) ViewBindings.findChildViewById(view, i);
                                    if (c24247iaI != null) {
                                        return new hGN((android.widget.RelativeLayout) view, appCompatImageView, appCompatImageView2, imageView, linearLayout, linearLayout2, appCompatTextView, c24253iaO, c24247iaI);
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
