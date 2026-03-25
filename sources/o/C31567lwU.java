package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31567lwU implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C31567lwU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.EZpvd = imageView;
        this.AEQbTJ = imageView2;
        this.copydefault = textView;
    }

    public static C31567lwU OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C31351lsQ.ActionBar.QkdxfA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C31567lwU copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C31351lsQ.Application.AwvSrB;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31351lsQ.Application.UccSpe;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C31351lsQ.Application.invokespecialRuDPQV;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C31351lsQ.Application.gdwsGQ;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C31567lwU((ConstraintLayout) view, constraintLayout, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
