package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54961xau implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final C55246xgN OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C54961xau(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55246xgN c55246xgN) {
        this.AEQbTJ = view;
        this.KWHzl = linearLayout;
        this.copydefault = constraintLayout;
        this.OLrzqt = c55246xgN;
    }

    public static C54961xau KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.dNCPSb, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54961xau OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.ixgjPv;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C52761wXj.FragmentManager.gwwfep;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C52761wXj.FragmentManager.DLGVGj;
                C55246xgN c55246xgN = (C55246xgN) ViewBindings.findChildViewById(view, i);
                if (c55246xgN != null) {
                    return new C54961xau(view, linearLayout, constraintLayout, c55246xgN);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
