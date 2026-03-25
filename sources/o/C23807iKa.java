package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23807iKa implements ViewBinding {
    public final wXI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public wXI getRoot() {
        return this.KWHzl;
    }

    public C23807iKa(@androidx.annotation.NonNull wXI wxi) {
        this.KWHzl = wxi;
    }

    public static C23807iKa KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.UhxbNG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23807iKa KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23807iKa((wXI) view);
    }
}
