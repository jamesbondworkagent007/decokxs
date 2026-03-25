package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42741rcD implements ViewBinding {
    public final C55230xfy AEQbTJ;
    public final android.widget.FrameLayout EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C42741rcD(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.EZpvd = frameLayout;
        this.AEQbTJ = c55230xfy;
    }

    public static C42741rcD KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fJk;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            return new C42741rcD((android.widget.FrameLayout) view, c55230xfy);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
