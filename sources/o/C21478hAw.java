package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21478hAw implements ViewBinding {
    public final hWQ KWHzl;
    public final hWQ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public hWQ getRoot() {
        return this.KWHzl;
    }

    public C21478hAw(@androidx.annotation.NonNull hWQ hwq, @androidx.annotation.NonNull hWQ hwq2) {
        this.KWHzl = hwq;
        this.OLrzqt = hwq2;
    }

    public static C21478hAw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gSBher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21478hAw copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        hWQ hwq = (hWQ) view;
        return new C21478hAw(hwq, hwq);
    }
}
