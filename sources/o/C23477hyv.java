package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.charts.LineChart;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23477hyv implements ViewBinding {
    public final LineChart AEQbTJ;
    public final ViewPager2 AhwBna;
    public final C55254xgV EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.View OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23477hyv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.copydefault = constraintLayout;
        this.OLrzqt = view;
        this.AEQbTJ = lineChart;
        this.KWHzl = linearLayout;
        this.EZpvd = c55254xgV;
        this.gEmmrt = textView;
        this.valueOf = textView2;
        this.AhwBna = viewPager2;
    }

    public static C23477hyv EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OqFWZa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23477hyv copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getValue;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.getCallback;
            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
            if (lineChart != null) {
                i = C23274hvD.Application.setShuffleModeEnabledRemoved;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C23274hvD.Application.getData;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = C23274hvD.Application.createSubDecor;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.createOverrideConfigurationForDayNight;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C23274hvD.Application.getIntent;
                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                if (viewPager2 != null) {
                                    return new C23477hyv((ConstraintLayout) view, viewFindChildViewById, lineChart, linearLayout, c55254xgV, textView, textView2, viewPager2);
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
