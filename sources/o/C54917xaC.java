package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54917xaC implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final android.widget.ImageView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final ConstraintLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C54917xaC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.OLrzqt = constraintLayout;
        this.copydefault = constraintLayout2;
        this.AEQbTJ = textView;
        this.KWHzl = frameLayout;
        this.EZpvd = imageView;
        this.djBIcL = constraintLayout3;
        this.AYXKKw = c55258xgZ;
    }

    public static C54917xaC copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.gkJEwt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C54917xaC OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.RcXXUw;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C52761wXj.FragmentManager.dxcTrN;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C52761wXj.FragmentManager.iZzfmt;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C52761wXj.FragmentManager.RKDWNf;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        i = C52761wXj.FragmentManager.iKEqwx;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            return new C54917xaC(constraintLayout2, constraintLayout, textView, frameLayout, imageView, constraintLayout2, c55258xgZ);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
