package o;

import androidx.viewbinding.ViewBinding;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54916xaB implements ViewBinding {
    public final C55230xfy EZpvd;
    public final C55230xfy OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55230xfy getRoot() {
        return this.OLrzqt;
    }

    public C54916xaB(@androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55230xfy c55230xfy2) {
        this.OLrzqt = c55230xfy;
        this.EZpvd = c55230xfy2;
    }

    public static C54916xaB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.fvQaOB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C54916xaB KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55230xfy c55230xfy = (C55230xfy) view;
        return new C54916xaB(c55230xfy, c55230xfy);
    }
}
