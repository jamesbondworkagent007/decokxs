package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21480hAy implements ViewBinding {
    public final hWP OLrzqt;
    public final hWP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hWP getRoot() {
        return this.OLrzqt;
    }

    public C21480hAy(@androidx.annotation.NonNull hWP hwp, @androidx.annotation.NonNull hWP hwp2) {
        this.OLrzqt = hwp;
        this.copydefault = hwp2;
    }

    public static C21480hAy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gUEfcq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21480hAy KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        hWP hwp = (hWP) view;
        return new C21480hAy(hwp, hwp);
    }
}
