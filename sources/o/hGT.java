package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGT implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ProgressBar KWHzl;
    public final C55251xgS OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public hGT(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = view;
        this.KWHzl = progressBar;
        this.EZpvd = linearLayout;
        this.OLrzqt = c55251xgS;
        this.AEQbTJ = appCompatTextView;
    }

    public static hGT EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.sEAkxl, viewGroup);
        return EZpvd(viewGroup);
    }

    public static hGT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplApi217;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = C23274hvD.Application.unregisterCallbackListener;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.LocalActivityResultRegistryOwnerLocalComposition1;
                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS != null) {
                    i = C23274hvD.Application.setDisplayShowTitleEnabled;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new hGT(view, progressBar, linearLayout, c55251xgS, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
