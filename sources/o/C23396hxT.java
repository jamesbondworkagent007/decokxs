package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23396hxT implements ViewBinding {
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C23396hxT(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = linearLayoutCompat2;
    }

    public static C23396hxT AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QbewEr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23396hxT AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.zpGcln;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            return new C23396hxT((LinearLayoutCompat) view, linearLayoutCompat);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
