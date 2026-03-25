package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17171exk implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55068xcv AhwBna;
    public final ShapeableImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ShapeableImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C17171exk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull C55068xcv c55068xcv, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = constraintLayout;
        this.copydefault = constraintLayout2;
        this.OLrzqt = shapeableImageView;
        this.AEQbTJ = imageView;
        this.EZpvd = shapeableImageView2;
        this.AhwBna = c55068xcv;
        this.valueOf = textView;
    }

    public static C17171exk copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.RIKbBf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C17171exk EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.getUserContextRegisteredStatus;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13754dXa.ActionBar.hBUiXU;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = C13754dXa.ActionBar.PUZqN;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C13754dXa.ActionBar.DkGEDn;
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                    if (shapeableImageView2 != null) {
                        i = C13754dXa.ActionBar.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU;
                        C55068xcv c55068xcv = (C55068xcv) ViewBindings.findChildViewById(view, i);
                        if (c55068xcv != null) {
                            i = C13754dXa.ActionBar.ComponentActivity1;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new C17171exk((ConstraintLayout) view, constraintLayout, shapeableImageView, imageView, shapeableImageView2, c55068xcv, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
