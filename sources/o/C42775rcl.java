package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import o.qZH;

/* JADX INFO: renamed from: o.rcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42775rcl implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final BarChart EZpvd;
    public final C40499qYc KWHzl;
    public final C55113xdn OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.KWHzl;
    }

    public C42775rcl(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull BarChart barChart, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.KWHzl = c40499qYc;
        this.EZpvd = barChart;
        this.AEQbTJ = c55173xeu;
        this.OLrzqt = c55113xdn;
        this.copydefault = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.gEmmrt = appCompatTextView3;
    }

    public static C42775rcl KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DGUQLIDGUQLI;
        BarChart barChart = (BarChart) ViewBindings.findChildViewById(view, i);
        if (barChart != null) {
            i = qZH.StateListAnimator.getLabel;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.DGUQLIekVPG;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = qZH.StateListAnimator.UUsvzUhTFPAC;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.onTransact;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.MediaBrowserCompat;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new C42775rcl((C40499qYc) view, barChart, c55173xeu, c55113xdn, appCompatTextView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
