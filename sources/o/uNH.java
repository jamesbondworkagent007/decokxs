package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes16.dex */
public final class uNH implements ViewBinding {
    public final C55258xgZ EZpvd;
    public final C55239xgG KWHzl;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public uNH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55239xgG c55239xgG) {
        this.copydefault = constraintLayout;
        this.EZpvd = c55258xgZ;
        this.KWHzl = c55239xgG;
    }

    public static uNH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.gkJEwt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static uNH copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.addMenuProvider;
        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
        if (c55258xgZ != null) {
            i = C48033uCm.Application.addOnConfigurationChangedListener;
            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
            if (c55239xgG != null) {
                return new uNH((ConstraintLayout) view, c55258xgZ, c55239xgG);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
