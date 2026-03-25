package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8244azA implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final SimpleToolBar AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55198xfS OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C8244azA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55198xfS c55198xfS, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull SimpleToolBar simpleToolBar) {
        this.copydefault = constraintLayout;
        this.EZpvd = textView;
        this.OLrzqt = c55198xfS;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = textView2;
        this.AYXKKw = simpleToolBar;
    }

    public static C8244azA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.RcXXUw;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C8206ayP.StateListAnimator.fBE;
            C55198xfS c55198xfS = (C55198xfS) ViewBindings.findChildViewById(view, i);
            if (c55198xfS != null) {
                i = C8206ayP.StateListAnimator.DSiOMJ;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C8206ayP.StateListAnimator.isReflectionWorking;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C8206ayP.StateListAnimator.RZNAhV;
                        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
                        if (simpleToolBar != null) {
                            return new C8244azA((ConstraintLayout) view, textView, c55198xfS, c52794wYp, textView2, simpleToolBar);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
