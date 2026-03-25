package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21528hCs implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C55008xbo EZpvd;
    public final C55008xbo KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AYXKKw;
    }

    public C21528hCs(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AYXKKw = view;
        this.AEQbTJ = linearLayout;
        this.KWHzl = c55008xbo;
        this.EZpvd = c55008xbo2;
        this.copydefault = imageView;
        this.OLrzqt = imageView2;
        this.gEmmrt = linearLayout2;
        this.valueOf = textView;
        this.AhwBna = textView2;
    }

    public static C21528hCs copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.deregisterUser, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C21528hCs OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fdt;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.gCNefq;
            C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
            if (c55008xbo != null) {
                i = C23274hvD.Application.HJWChPURsaBn;
                C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo2 != null) {
                    i = C23274hvD.Application.MediaBrowserCompatCallbackHandler;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C23274hvD.Application.search;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C23274hvD.Application.addOnNewIntentListener;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C23274hvD.Application.setDrawerArrowDrawable;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C23274hvD.Application.superDispatchKeyEvent;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new C21528hCs(view, linearLayout, c55008xbo, c55008xbo2, imageView, imageView2, linearLayout2, textView, textView2);
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
