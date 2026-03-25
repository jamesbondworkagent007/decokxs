package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21526hCq implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final AppCompatTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C21526hCq(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.EZpvd = appCompatTextView3;
        this.AEQbTJ = textView;
        this.djBIcL = appCompatTextView4;
    }

    public static C21526hCq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aVhqwO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21526hCq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ActivityResultContractsCaptureVideo;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C23274hvD.Application.ActivityResultContractsGetMultipleContentsCompanion;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = C23274hvD.Application.AllCapsTransformationMethod;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = C23274hvD.Application.getMaxActionButtons;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.getStackedTabMaxWidth;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            return new C21526hCq((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2, appCompatTextView3, textView, appCompatTextView4);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
