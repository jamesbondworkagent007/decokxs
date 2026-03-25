package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOT implements ViewBinding {
    public final C49352umt AEQbTJ;
    public final android.widget.FrameLayout EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public tOT(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C49352umt c49352umt) {
        this.EZpvd = frameLayout;
        this.AEQbTJ = c49352umt;
    }

    public static tOT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DGgnkA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static tOT copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.gtdfxv;
        C49352umt c49352umt = (C49352umt) ViewBindings.findChildViewById(view, i);
        if (c49352umt != null) {
            return new tOT((android.widget.FrameLayout) view, c49352umt);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
