package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42940rfr implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final android.view.View KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C42940rfr(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.KWHzl = view;
        this.copydefault = appCompatTextView;
        this.AEQbTJ = appCompatTextView2;
        this.OLrzqt = appCompatTextView3;
        this.EZpvd = appCompatTextView4;
    }

    public static C42940rfr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.FHvxmb, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42940rfr AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DLl;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.dHAKvv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = qZH.StateListAnimator.onTransact;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = qZH.StateListAnimator.readTypedObject;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView4 != null) {
                        return new C42940rfr(view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
