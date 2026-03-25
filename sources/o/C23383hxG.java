package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23383hxG implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final ScaleGestureDetectorOnScaleGestureListenerC7495aks OLrzqt;
    public final C33537myN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23383hxG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c33537myN;
        this.EZpvd = c52794wYp;
        this.OLrzqt = scaleGestureDetectorOnScaleGestureListenerC7495aks;
    }

    public static C23383hxG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C23383hxG OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zsXlph, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23383hxG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dxcTrN;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C23274hvD.Application.zAEkPU;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C23274hvD.Application.ActivityResultContractsPickVisualMediaCompanion;
                ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks = (ScaleGestureDetectorOnScaleGestureListenerC7495aks) ViewBindings.findChildViewById(view, i);
                if (scaleGestureDetectorOnScaleGestureListenerC7495aks != null) {
                    return new C23383hxG((ConstraintLayout) view, c33537myN, c52794wYp, scaleGestureDetectorOnScaleGestureListenerC7495aks);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
