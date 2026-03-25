package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rdE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42795rdE implements ViewBinding {
    public final C41375qpd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C41375qpd getRoot() {
        return this.OLrzqt;
    }

    public C42795rdE(@androidx.annotation.NonNull C41375qpd c41375qpd) {
        this.OLrzqt = c41375qpd;
    }

    public static C42795rdE KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.invokespecialsiEkQe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42795rdE KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C42795rdE((C41375qpd) view);
    }
}
