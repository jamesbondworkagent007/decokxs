package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C5678aAx implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55113xdn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C5678aAx(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayout;
        this.copydefault = c55113xdn;
        this.EZpvd = linearLayout2;
        this.KWHzl = textView;
    }

    public static C5678aAx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.UrRBLY;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            int i2 = C8206ayP.StateListAnimator.isReflectionWorking;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new C5678aAx(linearLayout, c55113xdn, linearLayout, textView);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
