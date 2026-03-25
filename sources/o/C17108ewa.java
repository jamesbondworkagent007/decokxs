package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.ewa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17108ewa implements ViewBinding {
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C17108ewa(@androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.OLrzqt = constraintLayout;
    }

    public static C17108ewa EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C17108ewa((ConstraintLayout) view);
    }
}
