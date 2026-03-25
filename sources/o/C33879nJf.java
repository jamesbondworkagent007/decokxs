package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33879nJf implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C55113xdn OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C33879nJf(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.AEQbTJ = frameLayout;
        this.KWHzl = frameLayout2;
        this.EZpvd = recyclerView;
        this.OLrzqt = c55113xdn;
    }

    public static C33879nJf KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.RcXXUw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C33879nJf AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i = C35399nuc.StateListAnimator.hwkNQP;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35399nuc.StateListAnimator.getUriFromString;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                return new C33879nJf(frameLayout, frameLayout, recyclerView, c55113xdn);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
