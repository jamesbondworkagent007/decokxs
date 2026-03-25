package o;

import androidx.viewbinding.ViewBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33892nJs implements ViewBinding {
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C33892nJs(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.OLrzqt = linearLayout;
    }

    public static C33892nJs EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.hUfVAv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33892nJs EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C33892nJs((android.widget.LinearLayout) view);
    }
}
