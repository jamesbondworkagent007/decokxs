package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17088ewG implements ViewBinding {
    public final android.view.View EZpvd;
    public final wXI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C17088ewG(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wXI wxi) {
        this.EZpvd = view;
        this.KWHzl = wxi;
    }

    public static C17088ewG KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C13754dXa.TaskDescription.OUcgGI, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C17088ewG OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.HrMTQN;
        wXI wxi = (wXI) ViewBindings.findChildViewById(view, i);
        if (wxi != null) {
            return new C17088ewG(view, wxi);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
