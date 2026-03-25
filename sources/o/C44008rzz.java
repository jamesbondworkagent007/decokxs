package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44008rzz implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.OLrzqt;
    }

    public C44008rzz(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = relativeLayout;
        this.KWHzl = imageView;
        this.AEQbTJ = imageView2;
        this.copydefault = c52794wYp;
        this.EZpvd = textView;
        this.valueOf = textView2;
    }

    public static C44008rzz KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.DGUQLIdZmdUa;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C43662rtX.ActionBar.dzCpvv;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C43662rtX.ActionBar.cancel;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C43662rtX.ActionBar.DcMfJKfNLfdT;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C43662rtX.ActionBar.Hx;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C44008rzz((android.widget.RelativeLayout) view, imageView, imageView2, c52794wYp, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
