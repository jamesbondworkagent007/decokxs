package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21623hGf implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C21623hGf(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = appCompatTextView;
        this.EZpvd = appCompatTextView2;
    }

    public static C21623hGf copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ibnZAm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21623hGf copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.unit;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C23274hvD.Application.IdRes;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                return new C21623hGf((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
