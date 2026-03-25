package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42656raY implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.view.View OLrzqt;
    public final qXP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C42656raY(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull qXP qxp) {
        this.OLrzqt = view;
        this.AEQbTJ = c52794wYp;
        this.copydefault = qxp;
    }

    public static C42656raY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DcqEDu, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42656raY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QKudOq;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.adevsa;
            qXP qxp = (qXP) ViewBindings.findChildViewById(view, i);
            if (qxp != null) {
                return new C42656raY(view, c52794wYp, qxp);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
