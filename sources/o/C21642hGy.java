package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21642hGy implements ViewBinding {
    public final C55008xbo AEQbTJ;
    public final C55008xbo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55008xbo getRoot() {
        return this.OLrzqt;
    }

    public C21642hGy(@androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2) {
        this.OLrzqt = c55008xbo;
        this.AEQbTJ = c55008xbo2;
    }

    public static C21642hGy KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dNxZaP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21642hGy copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55008xbo c55008xbo = (C55008xbo) view;
        return new C21642hGy(c55008xbo, c55008xbo);
    }
}
