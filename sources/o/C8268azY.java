package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8268azY implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final SimpleToolBar KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C8268azY(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = linearLayout;
        this.KWHzl = simpleToolBar;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = imageView;
        this.OLrzqt = textView;
        this.AhwBna = textView2;
    }

    public static C8268azY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.fZBcTu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C8268azY OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null) {
            i = C8206ayP.StateListAnimator.fLIjIY;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C8206ayP.StateListAnimator.YqksP;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C8206ayP.StateListAnimator.iCPUKe;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C8268azY((android.widget.LinearLayout) view, simpleToolBar, c52794wYp, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
