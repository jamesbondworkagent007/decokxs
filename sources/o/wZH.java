package o;

import androidx.viewbinding.ViewBinding;
import o.C52761wXj;

/* JADX INFO: loaded from: classes11.dex */
public final class wZH implements ViewBinding {
    public final C55288xhC AEQbTJ;
    public final C55288xhC OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55288xhC getRoot() {
        return this.AEQbTJ;
    }

    public wZH(@androidx.annotation.NonNull C55288xhC c55288xhC, @androidx.annotation.NonNull C55288xhC c55288xhC2) {
        this.AEQbTJ = c55288xhC;
        this.OLrzqt = c55288xhC2;
    }

    public static wZH OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static wZH KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55288xhC c55288xhC = (C55288xhC) view;
        return new wZH(c55288xhC, c55288xhC);
    }
}
