package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21479hAx implements ViewBinding {
    public final hWZ AEQbTJ;
    public final hWZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hWZ getRoot() {
        return this.AEQbTJ;
    }

    public C21479hAx(@androidx.annotation.NonNull hWZ hwz, @androidx.annotation.NonNull hWZ hwz2) {
        this.AEQbTJ = hwz;
        this.OLrzqt = hwz2;
    }

    public static C21479hAx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.sTzBva, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21479hAx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        hWZ hwz = (hWZ) view;
        return new C21479hAx(hwz, hwz);
    }
}
