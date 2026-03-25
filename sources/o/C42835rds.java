package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42835rds implements ViewBinding {
    public final C40499qYc AEQbTJ;
    public final qCX OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AEQbTJ;
    }

    public C42835rds(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull qCX qcx) {
        this.AEQbTJ = c40499qYc;
        this.OLrzqt = qcx;
    }

    public static C42835rds EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.pauseLocationServices;
        qCX qcx = (qCX) ViewBindings.findChildViewById(view, i);
        if (qcx != null) {
            return new C42835rds((C40499qYc) view, qcx);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
