package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.red, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42873red implements ViewBinding {
    public final C42669ral AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final C40492qXw KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C42873red(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull C42669ral c42669ral) {
        this.EZpvd = frameLayout;
        this.KWHzl = c40492qXw;
        this.AEQbTJ = c42669ral;
    }

    public static C42873red copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.registerUser, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42873red OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.Rtjmuc;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.GFUIi))) != null) {
            return new C42873red((android.widget.FrameLayout) view, c40492qXw, C42669ral.KWHzl(viewFindChildViewById));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
