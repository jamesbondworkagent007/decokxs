package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48931uew;

/* JADX INFO: renamed from: o.ugt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49034ugt implements ViewBinding {
    public final android.widget.ImageView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C49034ugt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.KWHzl = frameLayout;
        this.EZpvd = imageView;
        this.OLrzqt = frameLayout2;
    }

    public static C49034ugt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C49034ugt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48931uew.Application.AuCTelauCTel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C49034ugt KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48931uew.StateListAnimator.UeEOUB;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            return new C49034ugt(frameLayout, imageView, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
