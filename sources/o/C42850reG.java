package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42850reG implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C33545myV OLrzqt;
    public final C40358qSx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42850reG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33545myV c33545myV, @androidx.annotation.NonNull C40358qSx c40358qSx, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c33545myV;
        this.copydefault = c40358qSx;
        this.AEQbTJ = imageView;
    }

    public static C42850reG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DcMfJKffREWX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42850reG AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.igXuih;
        C33545myV c33545myV = (C33545myV) ViewBindings.findChildViewById(view, i);
        if (c33545myV != null) {
            i = qZH.StateListAnimator.sTzBva;
            C40358qSx c40358qSx = (C40358qSx) ViewBindings.findChildViewById(view, i);
            if (c40358qSx != null) {
                i = qZH.StateListAnimator.DcMfJKDSqxTE;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new C42850reG((ConstraintLayout) view, c33545myV, c40358qSx, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
