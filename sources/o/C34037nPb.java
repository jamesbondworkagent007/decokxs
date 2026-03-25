package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nPb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34037nPb implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final CircularProgressIndicator EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final wYB copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C34037nPb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYB wyb, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull CircularProgressIndicator circularProgressIndicator, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.gEmmrt = constraintLayout;
        this.copydefault = wyb;
        this.OLrzqt = frameLayout;
        this.AEQbTJ = frameLayout2;
        this.KWHzl = imageView;
        this.EZpvd = circularProgressIndicator;
        this.valueOf = textView;
        this.djBIcL = textView2;
    }

    public static C34037nPb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.dIjzlO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C34037nPb EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.RJOkX;
        wYB wyb = (wYB) ViewBindings.findChildViewById(view, i);
        if (wyb != null) {
            i = C35399nuc.StateListAnimator.zSsVtY;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C35399nuc.StateListAnimator.DGUQLIekVPG;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = C35399nuc.StateListAnimator.Rtjmuc;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C35399nuc.StateListAnimator.RLmrWm;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                        if (circularProgressIndicator != null) {
                            i = C35399nuc.StateListAnimator.OtZEmZ;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C35399nuc.StateListAnimator.hBUiXU;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new C34037nPb((ConstraintLayout) view, wyb, frameLayout, frameLayout2, imageView, circularProgressIndicator, textView, textView2);
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
