package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42672rao implements ViewBinding {
    public final C55071xcy AEQbTJ;
    public final C42989rgn EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final AppCompatImageView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C42672rao(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C42989rgn c42989rgn, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55071xcy c55071xcy) {
        this.copydefault = linearLayout;
        this.EZpvd = c42989rgn;
        this.KWHzl = linearLayout2;
        this.OLrzqt = appCompatImageView;
        this.AEQbTJ = c55071xcy;
    }

    public static C42672rao KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.dvKsVJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42672rao AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sTzBva;
        C42989rgn c42989rgn = (C42989rgn) ViewBindings.findChildViewById(view, i);
        if (c42989rgn != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i = qZH.StateListAnimator.fVjYLc;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.RgaQzq;
                C55071xcy c55071xcy = (C55071xcy) ViewBindings.findChildViewById(view, i);
                if (c55071xcy != null) {
                    return new C42672rao(linearLayout, c42989rgn, linearLayout, appCompatImageView, c55071xcy);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
