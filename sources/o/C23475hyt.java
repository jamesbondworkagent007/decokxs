package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23475hyt implements ViewBinding {
    public final LinearLayoutCompat EZpvd;
    public final C28055kNf OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C23475hyt(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C28055kNf c28055kNf) {
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = c28055kNf;
    }

    public static C23475hyt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RlQdEF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23475hyt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.findIndexOfAddedMenu;
        C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
        if (c28055kNf != null) {
            return new C23475hyt((LinearLayoutCompat) view, c28055kNf);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
