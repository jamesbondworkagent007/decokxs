package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5635aAG implements ViewBinding {
    public final ShapeableImageView AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C5635aAG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = shapeableImageView;
        this.copydefault = textView;
        this.OLrzqt = textView2;
    }

    public static C5635aAG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.ffGIBT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C5635aAG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.zuBGHE;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = C8206ayP.StateListAnimator.sSMYrx;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C8206ayP.StateListAnimator.AwvSrB;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C5635aAG((ConstraintLayout) view, shapeableImageView, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
