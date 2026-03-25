package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.reE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42848reE implements ViewBinding {
    public final AppCompatTextView AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AppCompatTextView getRoot() {
        return this.AEQbTJ;
    }

    public C42848reE(@androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = appCompatTextView;
    }

    public static C42848reE copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DcMfJKfNUfqk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42848reE OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C42848reE((AppCompatTextView) view);
    }
}
