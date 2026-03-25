package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42893rex implements ViewBinding {
    public final C55244xgL AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final qSV EZpvd;
    public final C55244xgL KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C42893rex(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull qSV qsv, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C55244xgL c55244xgL2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.copydefault = constraintLayout;
        this.OLrzqt = linearLayout;
        this.EZpvd = qsv;
        this.AEQbTJ = c55244xgL;
        this.KWHzl = c55244xgL2;
        this.djBIcL = textView;
        this.AYXKKw = textView2;
        this.AhwBna = appCompatTextView;
        this.gEmmrt = appCompatTextView2;
    }

    public static C42893rex OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DcMfJKDcMfJK, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42893rex copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dbUqJD;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = qZH.StateListAnimator.RSmiaq;
            qSV qsv = (qSV) ViewBindings.findChildViewById(view, i);
            if (qsv != null) {
                i = qZH.StateListAnimator.DDjgSw;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = qZH.StateListAnimator.zAGdSp;
                    C55244xgL c55244xgL2 = (C55244xgL) ViewBindings.findChildViewById(view, i);
                    if (c55244xgL2 != null) {
                        i = qZH.StateListAnimator.DKr;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.ArkbYM;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = qZH.StateListAnimator.GVpNrs;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        return new C42893rex((ConstraintLayout) view, linearLayout, qsv, c55244xgL, c55244xgL2, textView, textView2, appCompatTextView, appCompatTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
