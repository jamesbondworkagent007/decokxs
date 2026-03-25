package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21471hAp implements ViewBinding {
    public final hWN EZpvd;
    public final hWN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public hWN getRoot() {
        return this.EZpvd;
    }

    public C21471hAp(@androidx.annotation.NonNull hWN hwn, @androidx.annotation.NonNull hWN hwn2) {
        this.EZpvd = hwn;
        this.copydefault = hwn2;
    }

    public static C21471hAp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gmHjFq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21471hAp EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        hWN hwn = (hWN) view;
        return new C21471hAp(hwn, hwn);
    }
}
