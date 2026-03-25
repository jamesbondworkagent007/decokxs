package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42872rec implements ViewBinding {
    public final C42672rao EZpvd;
    public final C40492qXw KWHzl;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C42872rec(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull C42672rao c42672rao) {
        this.copydefault = frameLayout;
        this.KWHzl = c40492qXw;
        this.EZpvd = c42672rao;
    }

    public static C42872rec copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.profile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42872rec copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.Rtjmuc;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.GFUIi))) != null) {
            return new C42872rec((android.widget.FrameLayout) view, c40492qXw, C42672rao.AEQbTJ(viewFindChildViewById));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
