package o;

import androidx.viewbinding.ViewBinding;
import o.C52761wXj;

/* JADX INFO: loaded from: classes11.dex */
public final class wZP implements ViewBinding {
    public final C55173xeu EZpvd;
    public final C55173xeu KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55173xeu getRoot() {
        return this.KWHzl;
    }

    public wZP(@androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2) {
        this.KWHzl = c55173xeu;
        this.EZpvd = c55173xeu2;
    }

    public static wZP OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.AYXKKw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static wZP AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55173xeu c55173xeu = (C55173xeu) view;
        return new wZP(c55173xeu, c55173xeu);
    }
}
