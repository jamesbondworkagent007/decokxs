package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iJM implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55024xcD AhwBna;
    public final RecyclerView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final C55173xeu djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public iJM(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55024xcD c55024xcD) {
        this.copydefault = constraintLayout;
        this.KWHzl = linearLayout;
        this.EZpvd = recyclerView;
        this.OLrzqt = imageView;
        this.AEQbTJ = textView;
        this.djBIcL = c55173xeu;
        this.AhwBna = c55024xcD;
    }

    public static iJM OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.iLAtSv;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C25493ixk.ActionBar.PUZqN;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C25493ixk.ActionBar.RjCdvpRjCdvp;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C25493ixk.ActionBar.RhlVAI;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C25493ixk.ActionBar.UNDaji;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C25493ixk.ActionBar.addSubscription;
                            C55024xcD c55024xcD = (C55024xcD) ViewBindings.findChildViewById(view, i);
                            if (c55024xcD != null) {
                                return new iJM((ConstraintLayout) view, linearLayout, recyclerView, imageView, textView, c55173xeu, c55024xcD);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
