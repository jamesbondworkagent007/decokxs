package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.divider.MaterialDivider;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNK implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final MaterialDivider copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public tNK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull MaterialDivider materialDivider, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = linearLayout;
        this.copydefault = materialDivider;
        this.KWHzl = linearLayout2;
    }

    public static tNK copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.AEQbTJ;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C47501trL.TaskDescription.ULRxlR;
            MaterialDivider materialDivider = (MaterialDivider) ViewBindings.findChildViewById(view, i);
            if (materialDivider != null) {
                i = C47501trL.TaskDescription.DrNnAm;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    return new tNK((ConstraintLayout) view, linearLayout, materialDivider, linearLayout2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
