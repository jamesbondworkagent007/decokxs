package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.mDC;

/* JADX INFO: loaded from: classes15.dex */
public final class mFV implements ViewBinding {
    public final mIT EZpvd;
    public final ConstraintLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public mFV(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull mIT mit) {
        this.KWHzl = constraintLayout;
        this.EZpvd = mit;
    }

    public static mFV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(mDC.TaskDescription.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static mFV EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = mDC.ActionBar.ffGIBT;
        mIT mit = (mIT) ViewBindings.findChildViewById(view, i);
        if (mit != null) {
            return new mFV((ConstraintLayout) view, mit);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
