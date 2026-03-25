package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54919xaE implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55372xih EZpvd;
    public final android.widget.RelativeLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C54919xaE(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55372xih c55372xih, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = view;
        this.AEQbTJ = imageView;
        this.EZpvd = c55372xih;
        this.KWHzl = relativeLayout;
        this.OLrzqt = textView;
    }

    public static C54919xaE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.hUfVAv, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C54919xaE EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.wlaJM;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C52761wXj.FragmentManager.RlQdEF;
            C55372xih c55372xih = (C55372xih) ViewBindings.findChildViewById(view, i);
            if (c55372xih != null) {
                i = C52761wXj.FragmentManager.DCUTEI;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = C52761wXj.FragmentManager.OuxcSI;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C54919xaE(view, imageView, c55372xih, relativeLayout, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
