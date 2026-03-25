package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16920esy implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final AppCompatTextView KWHzl;
    public final LottieAnimationView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C16920esy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = lottieAnimationView;
        this.KWHzl = appCompatTextView;
    }

    public static C16920esy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.sElUiK, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16920esy copydefault(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C13754dXa.ActionBar.QezThh;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C13754dXa.ActionBar.access000;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C13754dXa.ActionBar.setContentView;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new C16920esy(constraintLayout, constraintLayout, appCompatImageView, lottieAnimationView, appCompatTextView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
