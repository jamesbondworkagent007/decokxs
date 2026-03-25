package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31552lwF implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55113xdn EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C31552lwF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = c55113xdn;
    }

    public static C31552lwF EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C31351lsQ.Application.DlABUU;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            return new C31552lwF((ConstraintLayout) view, c55113xdn);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
