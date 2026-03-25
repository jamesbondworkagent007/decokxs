package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNL implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final LottieAnimationView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public tNL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = constraintLayout;
        this.EZpvd = linearLayout;
        this.copydefault = lottieAnimationView;
        this.AEQbTJ = recyclerView;
        this.OLrzqt = textView;
    }

    public static tNL EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.cBPFI;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C47501trL.TaskDescription.DcMfJKDCKfqPDCfLja;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C47501trL.TaskDescription.DztXDE;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C47501trL.TaskDescription.dpErvT;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new tNL((ConstraintLayout) view, linearLayout, lottieAnimationView, recyclerView, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
