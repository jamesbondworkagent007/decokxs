package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31596lwy implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final ConstraintLayout EZpvd;
    public final C31552lwF KWHzl;
    public final C52794wYp OLrzqt;
    public final C55173xeu copydefault;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C31596lwy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C31552lwF c31552lwF, @androidx.annotation.NonNull ConstraintLayout constraintLayout3) {
        this.valueOf = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.AEQbTJ = c52794wYp;
        this.copydefault = c55173xeu;
        this.OLrzqt = c52794wYp2;
        this.KWHzl = c31552lwF;
        this.AYXKKw = constraintLayout3;
    }

    public static C31596lwy AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C31351lsQ.Application.dvKsVJ;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31351lsQ.Application.run;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C31351lsQ.Application.fLIjIY;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C31351lsQ.Application.gtCCJH;
                    C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C31351lsQ.Application.DcMfJKsuEgdN))) != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        return new C31596lwy(constraintLayout2, constraintLayout, c52794wYp, c55173xeu, c52794wYp2, C31552lwF.EZpvd(viewFindChildViewById), constraintLayout2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
