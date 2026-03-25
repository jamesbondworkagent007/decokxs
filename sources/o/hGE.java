package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGE implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55001xbh AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final C24806ikl KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C55320xhi copydefault;
    public final android.view.View djBIcL;
    public final AppCompatTextView ejfBZ;
    public final AppCompatTextView fetchVPNInfo;
    public final android.widget.FrameLayout gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.widget.TextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public hGE(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C24806ikl c24806ikl, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5) {
        this.djBIcL = view;
        this.KWHzl = c24806ikl;
        this.copydefault = c55320xhi;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.AEQbTJ = c55113xdn;
        this.gEmmrt = frameLayout;
        this.valueOf = textView;
        this.AYXKKw = textView2;
        this.AhwBna = c55001xbh;
        this.DbNXlk = textView3;
        this.AkhnZx = appCompatTextView;
        this.fetchVPNInfo = appCompatTextView2;
        this.values = appCompatTextView3;
        this.isConnected = appCompatTextView4;
        this.ejfBZ = appCompatTextView5;
    }

    public static hGE AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.HJWChPfrwjPh, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hGE KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.HJWChPRGtXKCDKRTZD;
        C24806ikl c24806ikl = (C24806ikl) ViewBindings.findChildViewById(view, i);
        if (c24806ikl != null) {
            i = C23274hvD.Application.PUZqN;
            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
            if (c55320xhi != null) {
                i = C23274hvD.Application.onExtraCallback;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBase4;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.getController;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = C23274hvD.Application.value;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C23274hvD.Application.hasAttributeId;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.enumMapping;
                                        C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
                                        if (c55001xbh != null) {
                                            i = C23274hvD.Application.removeActivityDelegate;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C23274hvD.Application.AppCompatDelegateImplActionBarMenuCallback;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView != null) {
                                                    i = C23274hvD.Application.onContentScrollStarted;
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView2 != null) {
                                                        i = C23274hvD.Application.onWindowVisibilityChanged;
                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView3 != null) {
                                                            i = C23274hvD.Application.parseItem;
                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView4 != null) {
                                                                i = C23274hvD.Application.setBarThickness;
                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView5 != null) {
                                                                    return new hGE(view, c24806ikl, c55320xhi, appCompatImageView, appCompatImageView2, c55113xdn, frameLayout, textView, textView2, c55001xbh, textView3, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
