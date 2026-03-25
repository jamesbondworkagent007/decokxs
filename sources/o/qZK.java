package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes23.dex */
public final class qZK implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55230xfy AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final C55173xeu KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public qZK(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout5) {
        this.AhwBna = linearLayout;
        this.KWHzl = c55173xeu;
        this.EZpvd = frameLayout;
        this.OLrzqt = frameLayout2;
        this.copydefault = frameLayout3;
        this.AEQbTJ = frameLayout4;
        this.AYXKKw = c55230xfy;
        this.valueOf = frameLayout5;
    }

    public static qZK AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fGQ;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.aJZHYI;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = qZH.StateListAnimator.isReflectionWorking;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = qZH.StateListAnimator.DTeKQX;
                    android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout3 != null) {
                        i = qZH.StateListAnimator.HJWChPHhYHK;
                        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout4 != null) {
                            i = qZH.StateListAnimator.jFiva;
                            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                            if (c55230xfy != null) {
                                i = qZH.StateListAnimator.OAjjVP;
                                android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout5 != null) {
                                    return new qZK((android.widget.LinearLayout) view, c55173xeu, frameLayout, frameLayout2, frameLayout3, frameLayout4, c55230xfy, frameLayout5);
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
