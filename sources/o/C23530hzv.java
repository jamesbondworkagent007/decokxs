package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23530hzv implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55008xbo EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.View OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C23530hzv(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = view;
        this.EZpvd = c55008xbo;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.KWHzl = linearLayout;
        this.gEmmrt = textView;
        this.AYXKKw = textView2;
    }

    public static C23530hzv KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.dUDNAs, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C23530hzv AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ONJgbh;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.DbvGUJ;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.notifyNotificationWithChannel;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C23274hvD.Application.createSession;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.onMenuKeyEvent;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.parseItem;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C23530hzv(view, c55008xbo, appCompatImageView, appCompatImageView2, linearLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
