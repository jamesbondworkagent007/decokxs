package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42894rey implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AppCompatTextView getRoot() {
        return this.EZpvd;
    }

    public C42894rey(@androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.EZpvd = appCompatTextView;
        this.AEQbTJ = appCompatTextView2;
    }

    public static C42894rey OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DsL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42894rey copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new C42894rey(appCompatTextView, appCompatTextView);
    }
}
