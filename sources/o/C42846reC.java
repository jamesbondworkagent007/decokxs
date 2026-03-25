package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.reC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42846reC implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final C55173xeu KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55173xeu getRoot() {
        return this.KWHzl;
    }

    public C42846reC(@androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2) {
        this.KWHzl = c55173xeu;
        this.AEQbTJ = c55173xeu2;
    }

    public static C42846reC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fcfzuX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42846reC AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55173xeu c55173xeu = (C55173xeu) view;
        return new C42846reC(c55173xeu, c55173xeu);
    }
}
