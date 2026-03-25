package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21597hFg implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C21597hFg(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = imageView;
        this.copydefault = linearLayoutCompat;
        this.EZpvd = linearLayoutCompat2;
        this.AEQbTJ = textView;
        this.djBIcL = textView2;
        this.AhwBna = textView3;
        this.gEmmrt = textView4;
    }

    public static C21597hFg OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.pXZxY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21597hFg KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gRtANS;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.RatingCompatStyle;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.MediaControllerCompatApi23TransportControls;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C23274hvD.Application.InspectablePropertyValueType;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.generateConfigDelta_colorMode;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C23274hvD.Application.WindowDecorActionBarActionModeImpl;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C23274hvD.Application.DrawerArrowDrawableArrowDirection;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new C21597hFg((ConstraintLayout) view, imageView, linearLayoutCompat, linearLayoutCompat2, textView, textView2, textView3, textView4);
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
