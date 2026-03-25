package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49524uqF implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.RelativeLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.EZpvd;
    }

    public C49524uqF(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = relativeLayout;
        this.KWHzl = imageView;
        this.copydefault = imageView2;
        this.OLrzqt = relativeLayout2;
        this.AEQbTJ = textView;
        this.AYXKKw = textView2;
    }

    public static C49524uqF copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C49511upt.Application.gkJEwt;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C49511upt.Application.iZzfmt;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                i = C49511upt.Application.awiJhF;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C49511upt.Application.dzCpvv;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C49524uqF(relativeLayout, imageView, imageView2, relativeLayout, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
