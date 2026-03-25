package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hDJ implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final BarChart EZpvd;
    public final C55244xgL KWHzl;
    public final android.view.View OLrzqt;
    public final ConstraintLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public hDJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull BarChart barChart, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.OLrzqt = view;
        this.copydefault = constraintLayout;
        this.AEQbTJ = c55173xeu;
        this.KWHzl = c55244xgL;
        this.EZpvd = barChart;
        this.gEmmrt = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
    }

    public static hDJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.fVjYLc, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hDJ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.invokespecialgBtXYZ;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.QOjuYg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.putText;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = C23274hvD.Application.putRating;
                    BarChart barChart = (BarChart) ViewBindings.findChildViewById(view, i);
                    if (barChart != null) {
                        i = C23274hvD.Application.startSupportActionMode;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C23274hvD.Application.setTheme;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView2 != null) {
                                i = C23274hvD.Application.supportShouldUpRecreateTask;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    return new hDJ(view, constraintLayout, c55173xeu, c55244xgL, barChart, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
