package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42637raF implements ViewBinding {
    public final C55372xih EZpvd;
    public final android.view.View KWHzl;
    public final C55258xgZ OLrzqt;
    public final qAG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C42637raF(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull qAG qag, @androidx.annotation.NonNull C55372xih c55372xih, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.KWHzl = view;
        this.copydefault = qag;
        this.EZpvd = c55372xih;
        this.OLrzqt = c55258xgZ;
    }

    public static C42637raF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DLWbHP, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C42637raF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RAQtXZ;
        qAG qag = (qAG) ViewBindings.findChildViewById(view, i);
        if (qag != null) {
            i = qZH.StateListAnimator.RgLUBD;
            C55372xih c55372xih = (C55372xih) ViewBindings.findChildViewById(view, i);
            if (c55372xih != null) {
                i = qZH.StateListAnimator.apNKau;
                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                if (c55258xgZ != null) {
                    return new C42637raF(view, qag, c55372xih, c55258xgZ);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
