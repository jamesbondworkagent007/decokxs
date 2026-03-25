package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.planet.widget.SimpleLabelValuePairView;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46291tOx implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final SimpleLabelValuePairView EZpvd;
    public final ConstraintLayout KWHzl;
    public final SimpleLabelValuePairView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C46291tOx(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull SimpleLabelValuePairView simpleLabelValuePairView, @androidx.annotation.NonNull SimpleLabelValuePairView simpleLabelValuePairView2, @androidx.annotation.NonNull android.view.View view) {
        this.KWHzl = constraintLayout;
        this.EZpvd = simpleLabelValuePairView;
        this.copydefault = simpleLabelValuePairView2;
        this.AEQbTJ = view;
    }

    public static C46291tOx AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DGOPHZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C46291tOx AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C47501trL.TaskDescription.zsXlph;
        SimpleLabelValuePairView simpleLabelValuePairView = (SimpleLabelValuePairView) ViewBindings.findChildViewById(view, i);
        if (simpleLabelValuePairView != null) {
            i = C47501trL.TaskDescription.zuBGHE;
            SimpleLabelValuePairView simpleLabelValuePairView2 = (SimpleLabelValuePairView) ViewBindings.findChildViewById(view, i);
            if (simpleLabelValuePairView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.ULRxlR))) != null) {
                return new C46291tOx((ConstraintLayout) view, simpleLabelValuePairView, simpleLabelValuePairView2, viewFindChildViewById);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
