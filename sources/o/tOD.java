package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.planet.widget.SimpleLabelValuePairView;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOD implements ViewBinding {
    public final SimpleLabelValuePairView AEQbTJ;
    public final tUS EZpvd;
    public final android.view.View KWHzl;
    public final ConstraintLayout OLrzqt;
    public final SimpleLabelValuePairView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public tOD(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull tUS tus, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull SimpleLabelValuePairView simpleLabelValuePairView, @androidx.annotation.NonNull SimpleLabelValuePairView simpleLabelValuePairView2) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = tus;
        this.KWHzl = view;
        this.copydefault = simpleLabelValuePairView;
        this.AEQbTJ = simpleLabelValuePairView2;
    }

    public static tOD AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.run, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static tOD OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C47501trL.TaskDescription.Ufzxmz;
        tUS tus = (tUS) ViewBindings.findChildViewById(view, i);
        if (tus != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.ULRxlR))) != null) {
            i = C47501trL.TaskDescription.fBE;
            SimpleLabelValuePairView simpleLabelValuePairView = (SimpleLabelValuePairView) ViewBindings.findChildViewById(view, i);
            if (simpleLabelValuePairView != null) {
                i = C47501trL.TaskDescription.DFbvW;
                SimpleLabelValuePairView simpleLabelValuePairView2 = (SimpleLabelValuePairView) ViewBindings.findChildViewById(view, i);
                if (simpleLabelValuePairView2 != null) {
                    return new tOD((ConstraintLayout) view, tus, viewFindChildViewById, simpleLabelValuePairView, simpleLabelValuePairView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
