package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42743rcF implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C55173xeu OLrzqt;
    public final C40505qYi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.copydefault;
    }

    public C42743rcF(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = c40505qYi;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = recyclerView;
        this.EZpvd = textView;
    }

    public static C42743rcF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C42743rcF((C40505qYi) view, c55173xeu, recyclerView, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
