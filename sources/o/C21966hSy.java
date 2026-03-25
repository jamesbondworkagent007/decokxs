package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21966hSy implements OnChartValueSelectedListener {
    public final BarChart EZpvd;
    public final java.util.Map<java.lang.Float, hSS> KWHzl;
    public final android.view.ViewGroup OLrzqt;

    public C21966hSy(@NotNull BarChart barChart, @NotNull java.util.Map<java.lang.Float, hSS> map, android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(barChart, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = barChart;
        this.KWHzl = map;
        this.OLrzqt = viewGroup;
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onValueSelected(Entry entry, Highlight highlight) {
        if (entry instanceof BarEntry) {
            BarEntry barEntry = (BarEntry) entry;
            OLrzqt(barEntry.getX(), this.KWHzl.get(java.lang.Float.valueOf(barEntry.getX())));
            copydefault(barEntry, highlight);
        }
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onNothingSelected() {
        copydefault();
    }

    public final void OLrzqt(float f, hSS hss) {
        XAxis xAxis = this.EZpvd.getXAxis();
        xAxis.removeAllLimitLines();
        LimitLine limitLine = new LimitLine(f);
        limitLine.setLineColor(C25382ivf.KWHzl(C52761wXj.Activity.HJWChPDXdlte));
        limitLine.setLineWidth(0.5f);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        xAxis.addLimitLine(limitLine);
        android.view.ViewGroup viewGroup = this.OLrzqt;
        AppCompatTextView appCompatTextView = viewGroup != null ? (AppCompatTextView) viewGroup.findViewById(C23274hvD.Application.supportShouldUpRecreateTask) : null;
        android.view.ViewGroup viewGroup2 = this.OLrzqt;
        AppCompatTextView appCompatTextView2 = viewGroup2 != null ? (AppCompatTextView) viewGroup2.findViewById(C23274hvD.Application.startSupportActionMode) : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(hss != null ? hss.EZpvd() : null);
        }
        if (appCompatTextView2 != null) {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String strKWHzl = hss != null ? hss.KWHzl() : null;
            appCompatTextView2.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strKWHzl == null ? "" : strKWHzl, true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
        }
        android.view.ViewGroup viewGroup3 = this.OLrzqt;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        this.EZpvd.invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(BarEntry barEntry, Highlight highlight) {
        android.view.ViewGroup viewGroup;
        if (highlight == null || (viewGroup = this.OLrzqt) == null) {
            return;
        }
        if (viewGroup.getWidth() == 0) {
            this.OLrzqt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredWidth = this.OLrzqt.getMeasuredWidth();
        int measuredHeight = this.OLrzqt.getMeasuredHeight();
        double dAEQbTJ = this.EZpvd.getTransformer(((IBarDataSet) ((BarData) this.EZpvd.getData()).getDataSets().get(highlight.getDataSetIndex())).getAxisDependency()).getPixelForValues(highlight.getX(), 0.0f).x - ((double) (measuredWidth / 2));
        if (dAEQbTJ < this.EZpvd.getViewPortHandler().offsetLeft()) {
            dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Float.valueOf(this.EZpvd.getViewPortHandler().offsetLeft()));
        }
        float width = (this.EZpvd.getWidth() - this.EZpvd.getViewPortHandler().offsetRight()) - measuredWidth;
        if (dAEQbTJ > width) {
            dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Float.valueOf(width));
        }
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) dAEQbTJ;
            int iContentTop = (((int) this.EZpvd.getViewPortHandler().contentTop()) - measuredHeight) - 4;
            int i = iContentTop >= 0 ? iContentTop : 4;
            android.content.Context context = this.OLrzqt.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.topMargin = i + C55298xhM.copydefault(48.0f, context);
            this.OLrzqt.setLayoutParams(marginLayoutParams);
        }
    }

    public final void copydefault() {
        this.EZpvd.getXAxis().removeAllLimitLines();
        android.view.ViewGroup viewGroup = this.OLrzqt;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.EZpvd.invalidate();
    }
}
