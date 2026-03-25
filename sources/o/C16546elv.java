package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16546elv implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C52794wYp KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C14775drn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C16546elv(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C14775drn c14775drn, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = c52794wYp;
        this.copydefault = c14775drn;
        this.AEQbTJ = textView;
    }

    public static C16546elv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.swzYdv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16546elv OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.tIwhY;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.setMediaId;
            C14775drn c14775drn = (C14775drn) ViewBindings.findChildViewById(view, i);
            if (c14775drn != null) {
                i = C13754dXa.ActionBar.BackHandlerKtBackHandlerbackCallback11;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C16546elv((LinearLayoutCompat) view, c52794wYp, c14775drn, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
