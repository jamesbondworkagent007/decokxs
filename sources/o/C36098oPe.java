package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36098oPe implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C55237xgE EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C36098oPe(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55237xgE c55237xgE) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = recyclerView;
        this.OLrzqt = textView;
        this.EZpvd = c55237xgE;
    }

    public static C36098oPe AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.zKcAg;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35964oKf.StateListAnimator.invokespecialDPHOMC;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35964oKf.StateListAnimator.subscribe;
                C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                if (c55237xgE != null) {
                    return new C36098oPe((android.widget.FrameLayout) view, recyclerView, textView, c55237xgE);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
