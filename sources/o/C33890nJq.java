package o;

import androidx.viewbinding.ViewBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33890nJq implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C33890nJq(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.EZpvd = linearLayout;
    }

    public static C33890nJq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.gkJEwt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33890nJq OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C33890nJq((android.widget.LinearLayout) view);
    }
}
