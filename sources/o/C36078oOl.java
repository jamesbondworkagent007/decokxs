package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36078oOl implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.view.View EZpvd;
    public final BarChart KWHzl;
    public final AppCompatTextView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C36078oOl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull BarChart barChart, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.EZpvd = view;
        this.copydefault = constraintLayout;
        this.AEQbTJ = c55173xeu;
        this.KWHzl = barChart;
        this.OLrzqt = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
    }

    public static C36078oOl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.hvKCwS, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C36078oOl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.TarCU;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C35964oKf.StateListAnimator.invokespecialgBtXYZ;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.HJWChPdNQGVJ;
                BarChart barChart = (BarChart) ViewBindings.findChildViewById(view, i);
                if (barChart != null) {
                    i = C35964oKf.StateListAnimator.getRatingType;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C35964oKf.StateListAnimator.getPackageName;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C35964oKf.StateListAnimator.getQueueTitle;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new C36078oOl(view, constraintLayout, c55173xeu, barChart, appCompatTextView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
