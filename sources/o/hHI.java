package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hHI implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final wYK EZpvd;
    public final C55258xgZ KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public hHI(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.copydefault = view;
        this.EZpvd = wyk;
        this.KWHzl = c55258xgZ;
        this.OLrzqt = imageView;
        this.AEQbTJ = linearLayout;
    }

    public static hHI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.FF, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static hHI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gwwfep;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C23274hvD.Application.zHQtTQ;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = C23274hvD.Application.QAQCdZ;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.onPlaybackStateChanged;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new hHI(view, wyk, c55258xgZ, imageView, linearLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
