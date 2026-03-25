package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57418yhz implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final wYF EZpvd;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C57418yhz(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.OLrzqt = linearLayout;
        this.EZpvd = wyf;
        this.AEQbTJ = appCompatTextView;
    }

    public static C57418yhz EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C57406yhn.TaskDescription.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C57418yhz AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.AEQbTJ;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C57406yhn.StateListAnimator.OJuSTm;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new C57418yhz((android.widget.LinearLayout) view, wyf, appCompatTextView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
