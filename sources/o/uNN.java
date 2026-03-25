package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uNN implements ViewBinding {
    public final C55258xgZ AEQbTJ;
    public final C55258xgZ KWHzl;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public uNN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55258xgZ c55258xgZ2) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = c55258xgZ;
        this.KWHzl = c55258xgZ2;
    }

    public static uNN EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DAIeex, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uNN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.setupButtons;
        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
        if (c55258xgZ != null) {
            i = C48033uCm.Application.setCursor;
            C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ2 != null) {
                return new uNN((ConstraintLayout) view, c55258xgZ, c55258xgZ2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
