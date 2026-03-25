package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: loaded from: classes19.dex */
public final class rYI implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public rYI(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = constraintLayout;
        this.copydefault = textView;
    }

    public static rYI KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static rYI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = rXV.ActionBar.fetchVPNInfo;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new rYI((ConstraintLayout) view, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
