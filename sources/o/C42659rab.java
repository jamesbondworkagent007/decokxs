package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42659rab implements ViewBinding {
    public final C35144npl AEQbTJ;
    public final C55113xdn AhwBna;
    public final C55258xgZ EZpvd;
    public final C34889nkv KWHzl;
    public final C34887nkt OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.LinearLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.gEmmrt;
    }

    public C42659rab(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C34887nkt c34887nkt, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C35144npl c35144npl, @androidx.annotation.NonNull C34889nkv c34889nkv, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.gEmmrt = linearLayout;
        this.OLrzqt = c34887nkt;
        this.EZpvd = c55258xgZ;
        this.AEQbTJ = c35144npl;
        this.KWHzl = c34889nkv;
        this.copydefault = linearLayout2;
        this.AhwBna = c55113xdn;
    }

    public static C42659rab EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.UlJrfe;
        C34887nkt c34887nkt = (C34887nkt) ViewBindings.findChildViewById(view, i);
        if (c34887nkt != null) {
            i = qZH.StateListAnimator.fupbxE;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = qZH.StateListAnimator.FSMca;
                C35144npl c35144npl = (C35144npl) ViewBindings.findChildViewById(view, i);
                if (c35144npl != null) {
                    i = qZH.StateListAnimator.Dfm;
                    C34889nkv c34889nkv = (C34889nkv) ViewBindings.findChildViewById(view, i);
                    if (c34889nkv != null) {
                        i = qZH.StateListAnimator.GPCHlQ;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = qZH.StateListAnimator.ibnZAm;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                return new C42659rab((android.widget.LinearLayout) view, c34887nkt, c55258xgZ, c35144npl, c34889nkv, linearLayout, c55113xdn);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
