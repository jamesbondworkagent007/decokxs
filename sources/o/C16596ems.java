package o;

import androidx.viewbinding.ViewBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ems, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16596ems implements ViewBinding {
    public final C55173xeu EZpvd;
    public final C55173xeu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55173xeu getRoot() {
        return this.OLrzqt;
    }

    public C16596ems(@androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2) {
        this.OLrzqt = c55173xeu;
        this.EZpvd = c55173xeu2;
    }

    public static C16596ems AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.gtdfxv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16596ems AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55173xeu c55173xeu = (C55173xeu) view;
        return new C16596ems(c55173xeu, c55173xeu);
    }
}
