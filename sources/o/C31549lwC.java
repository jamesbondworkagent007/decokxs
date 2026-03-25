package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31549lwC implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final C55173xeu KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C31549lwC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.EZpvd = constraintLayout;
        this.KWHzl = c55173xeu;
    }

    public static C31549lwC KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C31351lsQ.Application.OEsIKP;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            return new C31549lwC((ConstraintLayout) view, c55173xeu);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
