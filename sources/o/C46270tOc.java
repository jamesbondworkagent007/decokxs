package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46270tOc implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final LottieAnimationView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C46270tOc(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = lottieAnimationView;
        this.AEQbTJ = recyclerView;
        this.EZpvd = constraintLayout2;
    }

    public static C46270tOc copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DcMfJKDCKfqPDCfLja;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C47501trL.TaskDescription.DztXDE;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C47501trL.TaskDescription.aappFQ;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    return new C46270tOc((ConstraintLayout) view, lottieAnimationView, recyclerView, constraintLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
