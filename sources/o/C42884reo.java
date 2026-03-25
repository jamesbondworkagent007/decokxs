package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.reo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42884reo implements ViewBinding {
    public final qIH KWHzl;
    public final qIH OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public qIH getRoot() {
        return this.KWHzl;
    }

    public C42884reo(@androidx.annotation.NonNull qIH qih, @androidx.annotation.NonNull qIH qih2) {
        this.KWHzl = qih;
        this.OLrzqt = qih2;
    }

    public static C42884reo AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.svY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42884reo OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        qIH qih = (qIH) view;
        return new C42884reo(qih, qih);
    }
}
