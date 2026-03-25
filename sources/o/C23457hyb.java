package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23457hyb implements ViewBinding {
    public final C55008xbo KWHzl;
    public final C55008xbo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55008xbo getRoot() {
        return this.copydefault;
    }

    public C23457hyb(@androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2) {
        this.copydefault = c55008xbo;
        this.KWHzl = c55008xbo2;
    }

    public static C23457hyb AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dvKsVJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23457hyb copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55008xbo c55008xbo = (C55008xbo) view;
        return new C23457hyb(c55008xbo, c55008xbo);
    }
}
