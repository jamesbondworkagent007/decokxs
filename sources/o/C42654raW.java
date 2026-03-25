package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42654raW implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C46796tdt EZpvd;
    public final C42922rfZ KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C55173xeu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42922rfZ getRoot() {
        return this.KWHzl;
    }

    public C42654raW(@androidx.annotation.NonNull C42922rfZ c42922rfZ, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C46796tdt c46796tdt) {
        this.KWHzl = c42922rfZ;
        this.OLrzqt = frameLayout;
        this.copydefault = c55173xeu;
        this.AEQbTJ = frameLayout2;
        this.EZpvd = c46796tdt;
    }

    public static C42654raW KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DbNXlk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.Swccd;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.sEAkxl;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = qZH.StateListAnimator.IKQXqd;
                    C46796tdt c46796tdt = (C46796tdt) ViewBindings.findChildViewById(view, i);
                    if (c46796tdt != null) {
                        return new C42654raW((C42922rfZ) view, frameLayout, c55173xeu, frameLayout2, c46796tdt);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
