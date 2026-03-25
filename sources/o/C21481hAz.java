package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21481hAz implements ViewBinding {
    public final C22081hXe OLrzqt;
    public final C22081hXe copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C22081hXe getRoot() {
        return this.OLrzqt;
    }

    public C21481hAz(@androidx.annotation.NonNull C22081hXe c22081hXe, @androidx.annotation.NonNull C22081hXe c22081hXe2) {
        this.OLrzqt = c22081hXe;
        this.copydefault = c22081hXe2;
    }

    public static C21481hAz KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hvKCwS, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21481hAz copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C22081hXe c22081hXe = (C22081hXe) view;
        return new C21481hAz(c22081hXe, c22081hXe);
    }
}
