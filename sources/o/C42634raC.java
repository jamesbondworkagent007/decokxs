package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42634raC implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final Barrier EZpvd;
    public final android.view.View KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C42634raC(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.KWHzl = view;
        this.EZpvd = barrier;
        this.copydefault = appCompatTextView;
        this.AEQbTJ = appCompatTextView2;
        this.OLrzqt = appCompatTextView3;
        this.djBIcL = appCompatTextView4;
    }

    public static C42634raC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.hrNTAI, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42634raC OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QUSxYX;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = qZH.StateListAnimator.DLl;
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
                            return new C42634raC(view, barrier, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
