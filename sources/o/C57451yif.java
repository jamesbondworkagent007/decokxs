package o;

import androidx.viewbinding.ViewBinding;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yif, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57451yif implements ViewBinding {
    public final C55001xbh OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55001xbh getRoot() {
        return this.OLrzqt;
    }

    public C57451yif(@androidx.annotation.NonNull C55001xbh c55001xbh) {
        this.OLrzqt = c55001xbh;
    }

    public static C57451yif EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C57406yhn.TaskDescription.QVAiDq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C57451yif KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C57451yif((C55001xbh) view);
    }
}
