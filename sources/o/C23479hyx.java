package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23479hyx implements ViewBinding {
    public final android.widget.LinearLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C23479hyx(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.KWHzl = linearLayout;
    }

    public static C23479hyx EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DarRvM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23479hyx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23479hyx((android.widget.LinearLayout) view);
    }
}
