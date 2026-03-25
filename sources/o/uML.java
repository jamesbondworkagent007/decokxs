package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uML implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final Flow copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public uML(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull ConstraintLayout constraintLayout4) {
        this.valueOf = constraintLayout;
        this.copydefault = flow;
        this.EZpvd = linearLayout;
        this.KWHzl = imageView;
        this.AEQbTJ = linearLayout2;
        this.OLrzqt = constraintLayout2;
        this.AhwBna = constraintLayout3;
        this.djBIcL = textView;
        this.AYXKKw = c55258xgZ;
        this.gEmmrt = constraintLayout4;
    }

    public static uML KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.wlaJM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static uML EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.ikEgkI;
        Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
        if (flow != null) {
            i = C48033uCm.Application.validateRelationship;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C48033uCm.Application.ICustomTabsServiceStubProxy;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C48033uCm.Application.MediaBrowserCompatItemCallbackItemCallbackApi23;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C48033uCm.Application.removeOnNewIntentListener;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                            i = C48033uCm.Application.selectContentView;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C48033uCm.Application.setCursor;
                                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                if (c55258xgZ != null) {
                                    i = C48033uCm.Application.updateVisibility;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        return new uML(constraintLayout2, flow, linearLayout, imageView, linearLayout2, constraintLayout, constraintLayout2, textView, c55258xgZ, constraintLayout3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
