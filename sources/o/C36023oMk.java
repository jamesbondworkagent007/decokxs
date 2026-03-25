package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36023oMk implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C36023oMk(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3) {
        this.KWHzl = linearLayout;
        this.OLrzqt = imageView;
        this.copydefault = imageView2;
        this.AEQbTJ = imageView3;
    }

    public static C36023oMk OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.fGsPTM;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C35964oKf.StateListAnimator.vqBjd;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C35964oKf.StateListAnimator.hBUiXU;
                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    return new C36023oMk((android.widget.LinearLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
