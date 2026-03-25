package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36042oNc implements ViewBinding {
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AppCompatTextView getRoot() {
        return this.OLrzqt;
    }

    public C36042oNc(@androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.OLrzqt = appCompatTextView;
        this.KWHzl = appCompatTextView2;
    }

    public static C36042oNc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.OxVOHk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C36042oNc AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new C36042oNc(appCompatTextView, appCompatTextView);
    }
}
