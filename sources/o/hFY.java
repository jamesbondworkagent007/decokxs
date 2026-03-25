package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hFY implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final CircularProgressIndicator KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public hFY(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull CircularProgressIndicator circularProgressIndicator) {
        this.OLrzqt = view;
        this.EZpvd = appCompatImageView;
        this.AEQbTJ = appCompatImageView2;
        this.KWHzl = circularProgressIndicator;
    }

    public static hFY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.HJWChPQPAeHI, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static hFY OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.openFileOutput;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C23274hvD.Application.PlaybackStateCompatMediaKeyAction;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                if (circularProgressIndicator != null) {
                    return new hFY(view, appCompatImageView, appCompatImageView2, circularProgressIndicator);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
