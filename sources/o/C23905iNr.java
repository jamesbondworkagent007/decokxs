package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23905iNr implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C27138jpY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23905iNr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27138jpY c27138jpY) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c27138jpY;
    }

    public static C23905iNr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.pauseLocationServices, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23905iNr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.DKtBnz;
        C27138jpY c27138jpY = (C27138jpY) ViewBindings.findChildViewById(view, i);
        if (c27138jpY != null) {
            return new C23905iNr((ConstraintLayout) view, c27138jpY);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
