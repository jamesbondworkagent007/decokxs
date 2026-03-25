package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57373yhG implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.view.View KWHzl;
    public final C52794wYp OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C57373yhG(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.KWHzl = view;
        this.OLrzqt = c52794wYp;
        this.AEQbTJ = c52794wYp2;
    }

    public static C57373yhG AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.uzCIH, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C57373yhG OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.copydefault;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C57406yhn.StateListAnimator.AhwBna;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                return new C57373yhG(view, c52794wYp, c52794wYp2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
