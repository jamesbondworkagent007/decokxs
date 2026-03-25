package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46280tOm implements ViewBinding {
    public final C55251xgS EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55251xgS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C46280tOm(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2) {
        this.KWHzl = linearLayout;
        this.copydefault = c55251xgS;
        this.EZpvd = c55251xgS2;
    }

    public static C46280tOm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.fdOvFl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C46280tOm KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.fmB;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            i = C47501trL.TaskDescription.GLcwwN;
            C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS2 != null) {
                return new C46280tOm((android.widget.LinearLayout) view, c55251xgS, c55251xgS2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
