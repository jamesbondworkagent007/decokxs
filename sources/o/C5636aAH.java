package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5636aAH implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C5636aAH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = constraintLayout;
        this.copydefault = textView;
        this.KWHzl = imageView;
        this.AEQbTJ = textView2;
    }

    public static C5636aAH EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.gasjUx;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C8206ayP.StateListAnimator.aUsmxb;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8206ayP.StateListAnimator.isReflectionWorking;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C5636aAH((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
