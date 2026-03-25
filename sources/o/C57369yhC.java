package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57369yhC implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57369yhC(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = view;
        this.KWHzl = imageView;
        this.EZpvd = textView;
        this.AEQbTJ = textView2;
    }

    public static C57369yhC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.ejfBZ, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C57369yhC KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.DTwDnp;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57406yhn.StateListAnimator.Ufzxmz;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C57406yhn.StateListAnimator.UhxbNG;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C57369yhC(view, imageView, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
