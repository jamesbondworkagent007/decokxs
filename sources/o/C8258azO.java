package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8258azO implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C52794wYp EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C8258azO(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayout;
        this.copydefault = imageView;
        this.EZpvd = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.KWHzl = imageView2;
        this.valueOf = textView;
        this.AhwBna = textView2;
    }

    public static C8258azO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.QfsBiF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C8258azO AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
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
                                return new C8258azO((android.widget.LinearLayout) view, imageView, c52794wYp, c52794wYp2, imageView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
