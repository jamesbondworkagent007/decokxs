package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.ewj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17117ewj implements ViewBinding {
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C17117ewj(@androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.copydefault = constraintLayout;
    }

    public static C17117ewj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C17117ewj((ConstraintLayout) view);
    }
}
