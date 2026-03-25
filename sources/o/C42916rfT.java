package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42916rfT implements ViewBinding {
    public final android.widget.ImageView KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C42916rfT(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.OLrzqt = view;
        this.KWHzl = imageView;
    }

    public static C42916rfT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.sYcwUD, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C42916rfT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.awiJhF;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new C42916rfT(view, imageView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
