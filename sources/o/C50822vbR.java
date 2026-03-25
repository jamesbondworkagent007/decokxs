package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50822vbR implements ViewBinding {
    public final C55258xgZ AEQbTJ;
    public final wYD EZpvd;
    public final C55320xhi KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C50822vbR(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYD wyd, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55320xhi c55320xhi) {
        this.OLrzqt = linearLayout;
        this.EZpvd = wyd;
        this.copydefault = linearLayout2;
        this.AEQbTJ = c55258xgZ;
        this.KWHzl = c55320xhi;
    }

    public static C50822vbR copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.abAflu;
        wYD wyd = (wYD) ViewBindings.findChildViewById(view, i);
        if (wyd != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i = C48033uCm.Application.EmptySuper;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = C48033uCm.Application.onApplyWindowInsets;
                C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                if (c55320xhi != null) {
                    return new C50822vbR(linearLayout, wyd, linearLayout, c55258xgZ, c55320xhi);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
