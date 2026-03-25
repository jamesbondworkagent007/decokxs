package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21484hBb implements ViewBinding {
    public final android.widget.ScrollView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.OLrzqt;
    }

    public C21484hBb(@androidx.annotation.NonNull android.widget.ScrollView scrollView) {
        this.OLrzqt = scrollView;
    }

    public static C21484hBb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DGUQLIhJrIAr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21484hBb OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C21484hBb((android.widget.ScrollView) view);
    }
}
