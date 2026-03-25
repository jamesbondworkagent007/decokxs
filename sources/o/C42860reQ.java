package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42860reQ implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C55372xih EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42860reQ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55372xih c55372xih, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = view;
        this.KWHzl = imageView;
        this.EZpvd = c55372xih;
        this.OLrzqt = relativeLayout;
        this.copydefault = textView;
    }

    public static C42860reQ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DcMfJKsuEgdN, viewGroup);
        return copydefault(viewGroup);
    }

    public static C42860reQ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DWgRXt;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = qZH.StateListAnimator.RbVjfb;
            C55372xih c55372xih = (C55372xih) ViewBindings.findChildViewById(view, i);
            if (c55372xih != null) {
                i = qZH.StateListAnimator.getUserContextRegisteredStatus;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = qZH.StateListAnimator.hOMIpD;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C42860reQ(view, imageView, c55372xih, relativeLayout, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
