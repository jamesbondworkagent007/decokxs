package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uRA implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final OKRegularCell EZpvd;
    public final android.widget.ImageView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public uRA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = oKRegularCell;
        this.KWHzl = imageView;
    }

    public static uRA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DSiOMJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static uRA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1;
        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
        if (oKRegularCell != null) {
            i = C48033uCm.Application.onViewAttachedToWindow;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new uRA((ConstraintLayout) view, oKRegularCell, imageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
