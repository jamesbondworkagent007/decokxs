package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16552emA implements ViewBinding {
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C14775drn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C16552emA(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C14775drn c14775drn) {
        this.OLrzqt = linearLayout;
        this.KWHzl = c52794wYp;
        this.copydefault = c14775drn;
    }

    public static C16552emA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.aJZHYI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16552emA copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.tIwhY;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.setMediaId;
            C14775drn c14775drn = (C14775drn) ViewBindings.findChildViewById(view, i);
            if (c14775drn != null) {
                return new C16552emA((android.widget.LinearLayout) view, c52794wYp, c14775drn);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
