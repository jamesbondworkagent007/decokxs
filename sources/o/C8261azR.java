package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8261azR implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C52794wYp EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C8261azR(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = linearLayout;
        this.KWHzl = imageView;
        this.copydefault = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.AEQbTJ = imageView2;
        this.AYXKKw = textView;
        this.djBIcL = textView2;
    }

    public static C8261azR copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.aKErDB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C8261azR AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DTwDnp;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C8206ayP.StateListAnimator.fLIjIY;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C8206ayP.StateListAnimator.DGUQLIOvDItG;
                C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp2 != null) {
                    i = C8206ayP.StateListAnimator.YqksP;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C8206ayP.StateListAnimator.iCPUKe;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C8206ayP.StateListAnimator.isReflectionWorking;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C8261azR((android.widget.LinearLayout) view, imageView, c52794wYp, c52794wYp2, imageView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
