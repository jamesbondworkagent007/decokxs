package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.hDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21559hDw implements ViewBinding {
    public final NestedScrollView EZpvd;
    public final NestedScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.copydefault;
    }

    public C21559hDw(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull NestedScrollView nestedScrollView2) {
        this.copydefault = nestedScrollView;
        this.EZpvd = nestedScrollView2;
    }

    public static C21559hDw copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        return new C21559hDw(nestedScrollView, nestedScrollView);
    }
}
