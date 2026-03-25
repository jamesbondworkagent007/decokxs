package o;

import androidx.viewbinding.ViewBinding;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54943xac implements ViewBinding {
    public final C55166xen AEQbTJ;
    public final C55166xen copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55166xen getRoot() {
        return this.copydefault;
    }

    public C54943xac(@androidx.annotation.NonNull C55166xen c55166xen, @androidx.annotation.NonNull C55166xen c55166xen2) {
        this.copydefault = c55166xen;
        this.AEQbTJ = c55166xen2;
    }

    public static C54943xac copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.iwGUEr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C54943xac EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55166xen c55166xen = (C55166xen) view;
        return new C54943xac(c55166xen, c55166xen);
    }
}
