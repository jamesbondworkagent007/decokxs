package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C5677aAw implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final C52794wYp valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C5677aAw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.EZpvd = constraintLayout;
        this.KWHzl = c52794wYp;
        this.AEQbTJ = imageView;
        this.copydefault = textView;
        this.OLrzqt = textView2;
        this.valueOf = c52794wYp2;
    }

    public static C5677aAw copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.OqFWZa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C5677aAw copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.QfsBiF;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C8206ayP.StateListAnimator.RXzakW;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8206ayP.StateListAnimator.DKtBnz;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C8206ayP.StateListAnimator.isReflectionWorking;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C8206ayP.StateListAnimator.UccSpe;
                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp2 != null) {
                            return new C5677aAw((ConstraintLayout) view, c52794wYp, imageView, textView, textView2, c52794wYp2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
