package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42701rbQ implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C55113xdn EZpvd;
    public final ConstraintLayout KWHzl;
    public final RecyclerView OLrzqt;
    public final C55173xeu copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C42701rbQ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = constraintLayout2;
        this.copydefault = c55173xeu;
        this.EZpvd = c55113xdn;
        this.OLrzqt = recyclerView;
        this.AhwBna = textView;
        this.AYXKKw = textView2;
        this.gEmmrt = textView3;
    }

    public static C42701rbQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.call;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = qZH.StateListAnimator.RvdRAu;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.RLmrWm;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = qZH.StateListAnimator.HrMTQN;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = qZH.StateListAnimator.UimiPO;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.dHAKvv;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = qZH.StateListAnimator.MediaBrowserCompatItemCallback;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new C42701rbQ((ConstraintLayout) view, constraintLayout, c55173xeu, c55113xdn, recyclerView, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
