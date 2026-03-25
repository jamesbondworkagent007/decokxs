package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nKK implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public nKK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = lottieAnimationView;
        this.OLrzqt = recyclerView;
        this.copydefault = constraintLayout2;
        this.KWHzl = textView;
    }

    public static nKK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.fHqPtx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static nKK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.getAdvertisingId;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C35399nuc.StateListAnimator.OStAOF;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C35399nuc.StateListAnimator.FF;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new nKK(constraintLayout, lottieAnimationView, recyclerView, constraintLayout, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
