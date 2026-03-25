package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C49511upt;

/* JADX INFO: renamed from: o.urt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49617urt implements ViewBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.AEQbTJ;
    }

    public C49617urt(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2) {
        this.AEQbTJ = relativeLayout;
        this.OLrzqt = relativeLayout2;
        this.copydefault = textView;
        this.KWHzl = imageView;
        this.EZpvd = imageView2;
    }

    public static C49617urt KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
        int i = C49511upt.Application.gtdfxv;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C49511upt.Application.cBPFI;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C49511upt.Application.gwwfep;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new C49617urt(relativeLayout, relativeLayout, textView, imageView, imageView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
