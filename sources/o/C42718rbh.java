package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42718rbh implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final pZX KWHzl;
    public final android.widget.TextView OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public pZX getRoot() {
        return this.KWHzl;
    }

    public C42718rbh(@androidx.annotation.NonNull pZX pzx, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = pzx;
        this.copydefault = recyclerView;
        this.OLrzqt = textView;
        this.EZpvd = textView2;
    }

    public static C42718rbh KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fFgQHt;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.finit;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.dvKsVJ;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C42718rbh((pZX) view, recyclerView, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
