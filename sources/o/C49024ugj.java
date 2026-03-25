package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48931uew;

/* JADX INFO: renamed from: o.ugj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49024ugj implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final CoordinatorLayout copydefault;
    public final android.widget.FrameLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.djBIcL;
    }

    public C49024ugj(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout5) {
        this.djBIcL = frameLayout;
        this.copydefault = coordinatorLayout;
        this.KWHzl = frameLayout2;
        this.AEQbTJ = constraintLayout;
        this.EZpvd = frameLayout3;
        this.OLrzqt = frameLayout4;
        this.AYXKKw = frameLayout5;
    }

    public static C49024ugj KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48931uew.Application.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C49024ugj copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48931uew.StateListAnimator.iwGUEr;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
        if (coordinatorLayout != null) {
            i = C48931uew.StateListAnimator.QVAiDq;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C48931uew.StateListAnimator.dxcTrN;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C48931uew.StateListAnimator.fZBcTu;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = C48931uew.StateListAnimator.dvKsVJ;
                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout3 != null) {
                            android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) view;
                            return new C49024ugj(frameLayout4, coordinatorLayout, frameLayout, constraintLayout, frameLayout2, frameLayout3, frameLayout4);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
