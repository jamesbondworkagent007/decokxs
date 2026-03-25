package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42738rcA implements ViewBinding {
    public final C48917uei EZpvd;
    public final C40499qYc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.copydefault;
    }

    public C42738rcA(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C48917uei c48917uei) {
        this.copydefault = c40499qYc;
        this.EZpvd = c48917uei;
    }

    public static C42738rcA OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.pauseLocationServices;
        C48917uei c48917uei = (C48917uei) ViewBindings.findChildViewById(view, i);
        if (c48917uei != null) {
            return new C42738rcA((C40499qYc) view, c48917uei);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
