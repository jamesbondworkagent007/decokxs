package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42847reD implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C55244xgL EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final qSV OLrzqt;
    public final C55244xgL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C42847reD(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull qSV qsv, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C55244xgL c55244xgL2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.KWHzl = linearLayout;
        this.OLrzqt = qsv;
        this.copydefault = c55244xgL;
        this.EZpvd = c55244xgL2;
        this.AEQbTJ = appCompatTextView;
    }

    public static C42847reD OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fbC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42847reD AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RSmiaq;
        qSV qsv = (qSV) ViewBindings.findChildViewById(view, i);
        if (qsv != null) {
            i = qZH.StateListAnimator.DDjgSw;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = qZH.StateListAnimator.zAGdSp;
                C55244xgL c55244xgL2 = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL2 != null) {
                    i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new C42847reD((android.widget.LinearLayout) view, qsv, c55244xgL, c55244xgL2, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
