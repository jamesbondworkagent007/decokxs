package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33299mto implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C33299mto(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.EZpvd = imageView;
        this.copydefault = textView;
        this.OLrzqt = view;
    }

    public static C33299mto OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C33160mrH.Application.AkhnZx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C33299mto AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C33160mrH.StateListAnimator.ejfBZ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C33160mrH.StateListAnimator.hDKMBd;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C33160mrH.StateListAnimator.iwGUEr))) != null) {
                return new C33299mto(constraintLayout, constraintLayout, imageView, textView, viewFindChildViewById);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
