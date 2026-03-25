package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.tqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47445tqF implements ViewBinding {
    public final C45433sph KWHzl;
    public final C45433sph copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C45433sph getRoot() {
        return this.KWHzl;
    }

    public C47445tqF(@androidx.annotation.NonNull C45433sph c45433sph, @androidx.annotation.NonNull C45433sph c45433sph2) {
        this.KWHzl = c45433sph;
        this.copydefault = c45433sph2;
    }

    public static C47445tqF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C45433sph c45433sph = (C45433sph) view;
        return new C47445tqF(c45433sph, c45433sph);
    }
}
