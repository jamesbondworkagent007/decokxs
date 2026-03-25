package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23739iHn implements ViewBinding {
    public final C55178xez KWHzl;
    public final C55178xez copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55178xez getRoot() {
        return this.KWHzl;
    }

    public C23739iHn(@androidx.annotation.NonNull C55178xez c55178xez, @androidx.annotation.NonNull C55178xez c55178xez2) {
        this.KWHzl = c55178xez;
        this.copydefault = c55178xez2;
    }

    public static C23739iHn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C23739iHn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.uzCIH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23739iHn OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55178xez c55178xez = (C55178xez) view;
        return new C23739iHn(c55178xez, c55178xez);
    }
}
