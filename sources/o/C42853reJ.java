package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42853reJ implements ViewBinding {
    public final C40492qXw AEQbTJ;
    public final C55071xcy EZpvd;
    public final AppCompatImageView KWHzl;
    public final C40499qYc OLrzqt;
    public final C42989rgn copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.OLrzqt;
    }

    public C42853reJ(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55071xcy c55071xcy, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C42989rgn c42989rgn, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = c40499qYc;
        this.EZpvd = c55071xcy;
        this.AEQbTJ = c40492qXw;
        this.KWHzl = appCompatImageView;
        this.copydefault = c42989rgn;
        this.valueOf = textView;
    }

    public static C42853reJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DcMfJKfwDlxl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42853reJ copydefault(@androidx.annotation.NonNull android.view.View view) {
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
                    C42989rgn c42989rgn = (C42989rgn) ViewBindings.findChildViewById(view, i);
                    if (c42989rgn != null) {
                        i = qZH.StateListAnimator.DXTac;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C42853reJ((C40499qYc) view, c55071xcy, c40492qXw, appCompatImageView, c42989rgn, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
