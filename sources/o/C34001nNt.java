package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34001nNt implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C35893oHp EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C34001nNt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.copydefault = constraintLayout;
        this.EZpvd = c35893oHp;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
        this.AEQbTJ = textView3;
        this.AYXKKw = textView4;
        this.valueOf = linearLayout;
        this.djBIcL = imageView;
    }

    public static C34001nNt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.cBPFI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C34001nNt OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
        C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
        if (c35893oHp != null) {
            i = C35399nuc.StateListAnimator.RcLksq;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35399nuc.StateListAnimator.invokespecialhrnhsO;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C35399nuc.StateListAnimator.onLost;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C35399nuc.StateListAnimator.SUwuXE;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C35399nuc.StateListAnimator.OTJFaA;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C35399nuc.StateListAnimator.aSdHwS;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    return new C34001nNt((ConstraintLayout) view, c35893oHp, textView, textView2, textView3, textView4, linearLayout, imageView);
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
