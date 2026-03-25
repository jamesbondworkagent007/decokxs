package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21580hEq implements ViewBinding {
    public final C55008xbo AEQbTJ;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C21580hEq(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55008xbo c55008xbo) {
        this.copydefault = linearLayoutCompat;
        this.AEQbTJ = c55008xbo;
    }

    public static C21580hEq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.finishInit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21580hEq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.izFvvl;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            return new C21580hEq((LinearLayoutCompat) view, c55008xbo);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
