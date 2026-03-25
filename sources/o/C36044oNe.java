package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36044oNe implements ViewBinding {
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AppCompatTextView getRoot() {
        return this.KWHzl;
    }

    public C36044oNe(@androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.KWHzl = appCompatTextView;
        this.EZpvd = appCompatTextView2;
    }

    public static C36044oNe OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DLWbHP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C36044oNe copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new C36044oNe(appCompatTextView, appCompatTextView);
    }
}
