package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23485hzC implements ViewBinding {
    public final gQD AEQbTJ;
    public final gQD KWHzl;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C23485hzC(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull gQD gqd, @androidx.annotation.NonNull gQD gqd2) {
        this.copydefault = linearLayoutCompat;
        this.KWHzl = gqd;
        this.AEQbTJ = gqd2;
    }

    public static C23485hzC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.spnCvw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23485hzC KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DGgkXd;
        gQD gqd = (gQD) ViewBindings.findChildViewById(view, i);
        if (gqd != null) {
            i = C23274hvD.Application.HrFqwD;
            gQD gqd2 = (gQD) ViewBindings.findChildViewById(view, i);
            if (gqd2 != null) {
                return new C23485hzC((LinearLayoutCompat) view, gqd, gqd2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
