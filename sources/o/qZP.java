package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes9.dex */
public final class qZP implements ViewBinding {
    public final C55254xgV AEQbTJ;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final C57596ylR KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final android.widget.FrameLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.gEmmrt;
    }

    public qZP(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C57596ylR c57596ylR, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.gEmmrt = frameLayout;
        this.OLrzqt = frameLayout2;
        this.copydefault = linearLayout;
        this.KWHzl = c57596ylR;
        this.AEQbTJ = c55254xgV;
        this.EZpvd = frameLayout3;
        this.djBIcL = frameLayout4;
        this.AhwBna = linearLayout2;
    }

    public static qZP AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DbNXlk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.GGlJim;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = qZH.StateListAnimator.QMuEJi;
                C57596ylR c57596ylR = (C57596ylR) ViewBindings.findChildViewById(view, i);
                if (c57596ylR != null) {
                    i = qZH.StateListAnimator.OmJATG;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = qZH.StateListAnimator.sEAkxl;
                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = qZH.StateListAnimator.OKSWiw;
                            android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout3 != null) {
                                i = qZH.StateListAnimator.sendRequest;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    return new qZP((android.widget.FrameLayout) view, frameLayout, linearLayout, c57596ylR, c55254xgV, frameLayout2, frameLayout3, linearLayout2);
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
