package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: loaded from: classes19.dex */
public final class rYA implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55068xcv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public rYA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55068xcv c55068xcv, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.copydefault = c55068xcv;
        this.KWHzl = constraintLayout2;
    }

    public static rYA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.valueOf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static rYA KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = rXV.ActionBar.AEQbTJ;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = rXV.ActionBar.copydefault;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = rXV.ActionBar.EZpvd;
                C55068xcv c55068xcv = (C55068xcv) ViewBindings.findChildViewById(view, i);
                if (c55068xcv != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new rYA(constraintLayout, textView, textView2, c55068xcv, constraintLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
