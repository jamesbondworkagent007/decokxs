package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42945rfw implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C42950rgA OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42945rfw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C42950rgA c42950rgA, @androidx.annotation.NonNull android.widget.ImageView imageView2) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = imageView;
        this.OLrzqt = c42950rgA;
        this.KWHzl = imageView2;
    }

    public static C42945rfw copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DztXDE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42945rfw copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DLWbHP;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = qZH.StateListAnimator.sTzBva;
            C42950rgA c42950rgA = (C42950rgA) ViewBindings.findChildViewById(view, i);
            if (c42950rgA != null) {
                i = qZH.StateListAnimator.init;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new C42945rfw((ConstraintLayout) view, imageView, c42950rgA, imageView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
