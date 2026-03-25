package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54954xan implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final wYK EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C54954xan(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.copydefault = view;
        this.EZpvd = wyk;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = appCompatTextView2;
    }

    public static C54954xan EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.QOLQEE, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54954xan OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.zLjUOn;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C52761wXj.FragmentManager.dxcTrN;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C52761wXj.FragmentManager.RKDWNf;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C52761wXj.FragmentManager.iKEqwx;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        return new C54954xan(view, wyk, appCompatTextView, appCompatImageView, appCompatTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
