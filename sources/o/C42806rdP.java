package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42806rdP implements ViewBinding {
    public final C40492qXw AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final C41375qpd copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C42806rdP(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull C41375qpd c41375qpd) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = c40492qXw;
        this.copydefault = c41375qpd;
    }

    public static C42806rdP KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.aKhcqp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42806rdP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dLBcXg;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null) {
            i = qZH.StateListAnimator.DpxfQh;
            C41375qpd c41375qpd = (C41375qpd) ViewBindings.findChildViewById(view, i);
            if (c41375qpd != null) {
                return new C42806rdP((android.widget.FrameLayout) view, c40492qXw, c41375qpd);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
