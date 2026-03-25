package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iHX implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.ImageView getRoot() {
        return this.AEQbTJ;
    }

    public iHX(@androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2) {
        this.AEQbTJ = imageView;
        this.OLrzqt = imageView2;
    }

    public static iHX AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.dNCPSb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static iHX copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view;
        return new iHX(imageView, imageView);
    }
}
