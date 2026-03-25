package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21634hGq implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C21634hGq(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C52794wYp c52794wYp3, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.EZpvd = constraintLayout;
        this.copydefault = c52794wYp;
        this.AEQbTJ = c52794wYp2;
        this.OLrzqt = c52794wYp3;
        this.KWHzl = constraintLayout2;
    }

    public static C21634hGq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ORmwhf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21634hGq copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.pXZxY;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.sRzUNh;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C23274hvD.Application.inahnb;
                C52794wYp c52794wYp3 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new C21634hGq(constraintLayout, c52794wYp, c52794wYp2, c52794wYp3, constraintLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
