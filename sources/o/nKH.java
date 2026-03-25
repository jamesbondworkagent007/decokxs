package o;

import androidx.viewbinding.ViewBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes23.dex */
public final class nKH implements ViewBinding {
    public final C36527oce AEQbTJ;
    public final C36527oce OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C36527oce getRoot() {
        return this.OLrzqt;
    }

    public nKH(@androidx.annotation.NonNull C36527oce c36527oce, @androidx.annotation.NonNull C36527oce c36527oce2) {
        this.OLrzqt = c36527oce;
        this.AEQbTJ = c36527oce2;
    }

    public static nKH OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DGUQLI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nKH OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C36527oce c36527oce = (C36527oce) view;
        return new nKH(c36527oce, c36527oce);
    }
}
