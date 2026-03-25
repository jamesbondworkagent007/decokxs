package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48931uew;

/* JADX INFO: renamed from: o.ugb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49016ugb implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final RecyclerView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C49016ugb(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = linearLayout;
        this.EZpvd = linearLayout2;
        this.KWHzl = c52794wYp;
        this.copydefault = c52794wYp2;
        this.AEQbTJ = linearLayout3;
        this.AhwBna = recyclerView;
    }

    public static C49016ugb EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48931uew.StateListAnimator.copydefault;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C48931uew.StateListAnimator.EZpvd;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C48931uew.StateListAnimator.AEQbTJ;
                C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp2 != null) {
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
                    i = C48931uew.StateListAnimator.fvQaOB;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new C49016ugb(linearLayout2, linearLayout, c52794wYp, c52794wYp2, linearLayout2, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
