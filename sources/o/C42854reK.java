package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42854reK implements ViewBinding {
    public final C40499qYc AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final C40492qXw KWHzl;
    public final C41817qxv OLrzqt;
    public final C55071xcy copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AEQbTJ;
    }

    public C42854reK(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55071xcy c55071xcy, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C41817qxv c41817qxv, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = c40499qYc;
        this.copydefault = c55071xcy;
        this.KWHzl = c40492qXw;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = c41817qxv;
        this.djBIcL = textView;
    }

    public static C42854reK AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DcMfJKfNLfdT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42854reK EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QSLkRj;
        C55071xcy c55071xcy = (C55071xcy) ViewBindings.findChildViewById(view, i);
        if (c55071xcy != null) {
            i = qZH.StateListAnimator.dLBcXg;
            C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
            if (c40492qXw != null) {
                i = qZH.StateListAnimator.svY;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = qZH.StateListAnimator.DGgkXd;
                    C41817qxv c41817qxv = (C41817qxv) ViewBindings.findChildViewById(view, i);
                    if (c41817qxv != null) {
                        i = qZH.StateListAnimator.DXTac;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C42854reK((C40499qYc) view, c55071xcy, c40492qXw, appCompatImageView, c41817qxv, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
