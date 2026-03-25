package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42859reP implements ViewBinding {
    public final C40492qXw AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final C42669ral KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C42859reP(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull C42669ral c42669ral) {
        this.EZpvd = frameLayout;
        this.AEQbTJ = c40492qXw;
        this.KWHzl = c42669ral;
    }

    public static C42859reP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.XW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42859reP EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.dLBcXg;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.GFUIi))) != null) {
            return new C42859reP((android.widget.FrameLayout) view, c40492qXw, C42669ral.KWHzl(viewFindChildViewById));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
