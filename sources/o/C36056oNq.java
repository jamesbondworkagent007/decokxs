package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36056oNq implements ViewBinding {
    public final ScaleGestureDetectorOnScaleGestureListenerC7495aks AEQbTJ;
    public final C33537myN EZpvd;
    public final ConstraintLayout KWHzl;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C36056oNq(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks) {
        this.KWHzl = constraintLayout;
        this.EZpvd = c33537myN;
        this.copydefault = c52794wYp;
        this.AEQbTJ = scaleGestureDetectorOnScaleGestureListenerC7495aks;
    }

    public static C36056oNq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C36056oNq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.WS, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C36056oNq AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.fJNWhG;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C35964oKf.StateListAnimator.finit;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase;
                ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks = (ScaleGestureDetectorOnScaleGestureListenerC7495aks) ViewBindings.findChildViewById(view, i);
                if (scaleGestureDetectorOnScaleGestureListenerC7495aks != null) {
                    return new C36056oNq((ConstraintLayout) view, c33537myN, c52794wYp, scaleGestureDetectorOnScaleGestureListenerC7495aks);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
