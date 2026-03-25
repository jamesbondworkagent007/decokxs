package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21641hGx implements ViewBinding {
    public final C55173xeu KWHzl;
    public final C55173xeu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55173xeu getRoot() {
        return this.OLrzqt;
    }

    public C21641hGx(@androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2) {
        this.OLrzqt = c55173xeu;
        this.KWHzl = c55173xeu2;
    }

    public static C21641hGx KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.HJWChPdIKEqB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21641hGx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55173xeu c55173xeu = (C55173xeu) view;
        return new C21641hGx(c55173xeu, c55173xeu);
    }
}
