package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16375eij implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C33537myN KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C16375eij(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.copydefault = linearLayout;
        this.KWHzl = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = recyclerView;
    }

    public static C16375eij copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C16375eij KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fvQaOB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16375eij AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.accept;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.gUEfcq;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.postToHandler;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new C16375eij((android.widget.LinearLayout) view, c33537myN, c52794wYp, recyclerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
