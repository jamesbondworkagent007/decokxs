package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: loaded from: classes19.dex */
public final class rYK implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C42593rYp copydefault;
    public final android.view.View djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public rYK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C42593rYp c42593rYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.copydefault = c42593rYp;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.valueOf = textView3;
        this.djBIcL = view;
    }

    public static rYK AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static rYK copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = rXV.ActionBar.ejfBZ;
        C42593rYp c42593rYp = (C42593rYp) ViewBindings.findChildViewById(view, i);
        if (c42593rYp != null) {
            i = rXV.ActionBar.OcIXYQ;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = rXV.ActionBar.QOLQEE;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = rXV.ActionBar.QKVWgx;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = rXV.ActionBar.DTwDnp))) != null) {
                        return new rYK(constraintLayout, constraintLayout, c42593rYp, textView, textView2, textView3, viewFindChildViewById);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
