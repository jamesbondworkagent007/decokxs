package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42907rfK implements ViewBinding {
    public final C55230xfy KWHzl;
    public final C55230xfy OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55230xfy getRoot() {
        return this.KWHzl;
    }

    public C42907rfK(@androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55230xfy c55230xfy2) {
        this.KWHzl = c55230xfy;
        this.OLrzqt = c55230xfy2;
    }

    public static C42907rfK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.NRYds, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42907rfK EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55230xfy c55230xfy = (C55230xfy) view;
        return new C42907rfK(c55230xfy, c55230xfy);
    }
}
