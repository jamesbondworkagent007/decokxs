package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C28102kOz;

/* JADX INFO: loaded from: classes23.dex */
public final class kOS implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final C52794wYp KWHzl;
    public final C52794wYp OLrzqt;
    public final wYC copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public kOS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c52794wYp;
        this.KWHzl = c52794wYp2;
        this.copydefault = wyc;
        this.AEQbTJ = imageView;
        this.valueOf = textView;
        this.AhwBna = textView2;
    }

    public static kOS EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static kOS EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C28102kOz.Activity.KWHzl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static kOS EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C28102kOz.StateListAnimator.AEQbTJ;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C28102kOz.StateListAnimator.OLrzqt;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C28102kOz.StateListAnimator.AhwBna;
                wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                if (wyc != null) {
                    i = C28102kOz.StateListAnimator.djBIcL;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C28102kOz.StateListAnimator.AuCTelauCTel;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C28102kOz.StateListAnimator.AubY;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new kOS((ConstraintLayout) view, c52794wYp, c52794wYp2, wyc, imageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
