package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21640hGw implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.view.View OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C21640hGw(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2) {
        this.OLrzqt = view;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatImageView2;
    }

    public static C21640hGw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.BVXAa, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C21640hGw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ZxnNGp;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.postOrRun;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                return new C21640hGw(view, appCompatImageView, appCompatImageView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
