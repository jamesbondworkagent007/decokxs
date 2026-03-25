package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nOS implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final nOP EZpvd;
    public final android.widget.ImageView KWHzl;
    public final SubsamplingScaleImageView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.FrameLayout gEmmrt;
    public final C55113xdn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.gEmmrt;
    }

    public nOS(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull nOP nop, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull SubsamplingScaleImageView subsamplingScaleImageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.gEmmrt = frameLayout;
        this.AEQbTJ = imageView;
        this.EZpvd = nop;
        this.copydefault = linearLayout;
        this.KWHzl = imageView2;
        this.OLrzqt = subsamplingScaleImageView;
        this.valueOf = c55113xdn;
        this.AhwBna = textView;
    }

    public static nOS copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.ROgMPW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nOS EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.RgLUBD;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.RkASWs))) != null) {
            nOP nopCopydefault = nOP.copydefault(viewFindChildViewById);
            i = C35399nuc.StateListAnimator.DcMfJKdMCrTj;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C35399nuc.StateListAnimator.GQzpsZgQzpsZ;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C35399nuc.StateListAnimator.zXhzOT;
                    SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) ViewBindings.findChildViewById(view, i);
                    if (subsamplingScaleImageView != null) {
                        i = C35399nuc.StateListAnimator.GQzpsZsQwTVT;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C35399nuc.StateListAnimator.DXd;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new nOS((android.widget.FrameLayout) view, imageView, nopCopydefault, linearLayout, imageView2, subsamplingScaleImageView, c55113xdn, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
