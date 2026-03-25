package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36109oPp implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C36109oPp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3) {
        this.AYXKKw = constraintLayout;
        this.KWHzl = view;
        this.OLrzqt = relativeLayout;
        this.EZpvd = frameLayout;
        this.copydefault = constraintLayout2;
        this.AEQbTJ = constraintLayout3;
    }

    public static C36109oPp KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.gHZMYf;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35964oKf.StateListAnimator.RIuxYh;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = C35964oKf.StateListAnimator.fmB;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C35964oKf.StateListAnimator.DcMfJKsuEgdN;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        return new C36109oPp(constraintLayout2, viewFindChildViewById, relativeLayout, frameLayout, constraintLayout, constraintLayout2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
