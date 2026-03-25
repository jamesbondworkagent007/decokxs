package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42900rfD implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55239xgG KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C42900rfD(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55239xgG c55239xgG) {
        this.copydefault = linearLayout;
        this.OLrzqt = linearLayout2;
        this.AEQbTJ = textView;
        this.KWHzl = c55239xgG;
    }

    public static C42900rfD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.zDGrpR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42900rfD copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fMBJsc;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = qZH.StateListAnimator.apNKau;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.fdazkH;
                C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                if (c55239xgG != null) {
                    return new C42900rfD((android.widget.LinearLayout) view, linearLayout, textView, c55239xgG);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
