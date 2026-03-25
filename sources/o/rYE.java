package o;

import androidx.viewbinding.ViewBinding;
import o.rXV;

/* JADX INFO: loaded from: classes19.dex */
public final class rYE implements ViewBinding {
    public final android.view.View KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public rYE(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.KWHzl = view;
        this.OLrzqt = view2;
    }

    public static rYE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static rYE copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new rYE(view, view);
    }
}
