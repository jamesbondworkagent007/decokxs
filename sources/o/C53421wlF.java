package o;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53421wlF {
    public static final C53421wlF EZpvd = new C53421wlF();

    private C53421wlF() {
    }

    public static /* synthetic */ void initLineBarChart$default(C53421wlF c53421wlF, android.content.Context context, BarLineChartBase barLineChartBase, MarkerView markerView, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        c53421wlF.copydefault(context, barLineChartBase, markerView, z);
    }

    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void copydefault(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(barLineChartBase, "");
        int color = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        int color2 = ContextCompat.getColor(context, C52761wXj.Activity.zuBGHE);
        int color3 = ContextCompat.getColor(context, C32113mPz.ActionBar.DTwDnp);
        int color4 = ContextCompat.getColor(context, C32113mPz.ActionBar.QOLQEE);
        int color5 = Color.parseColor("#FFCCCCCC");
        if (z) {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            color2 = C38303pTu.OLrzqt(locale) ? color3 : color5;
        }
        if (z) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            color = C38303pTu.OLrzqt(locale2) ? color4 : color5;
        }
        barLineChartBase.setTouchEnabled(true);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setDragEnabled(true);
        barLineChartBase.setDoubleTapToZoomEnabled(false);
        barLineChartBase.getDescription().setEnabled(false);
        barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
        barLineChartBase.getPaint(7).setTextSize(C55298xhM.EZpvd(16.0f, context));
        if (markerView != null) {
            markerView.setChartView(barLineChartBase);
            barLineChartBase.setMarker(markerView);
        }
        if (z) {
            java.util.Locale locale3 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            if (!C38303pTu.OLrzqt(locale3)) {
                ViewGroup.LayoutParams layoutParams = barLineChartBase.getLayoutParams();
                layoutParams.width = C33052mpF.EZpvd(286.0f, context);
                layoutParams.height = C33052mpF.EZpvd(131.0f, context);
                barLineChartBase.setLayoutParams(layoutParams);
            }
        }
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setTextColor(color);
        xAxis.setTextSize(10.0f);
        xAxis.setYOffset(3.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(true);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisLineColor(color2);
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setLabelCount(5, false);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
        if (barLineChartBase.getAxisLeft().isEnabled()) {
            YAxis axisLeft = barLineChartBase.getAxisLeft();
            axisLeft.setDrawAxisLine(false);
            axisLeft.setDrawGridLines(false);
            axisLeft.setTextColor(color);
            axisLeft.setTextSize(10.0f);
            axisLeft.setLabelCount(3);
            axisLeft.setDrawTopYLabelEntry(true);
        }
        if (barLineChartBase.getAxisRight().isEnabled()) {
            YAxis axisRight = barLineChartBase.getAxisRight();
            axisRight.setDrawAxisLine(false);
            axisRight.setDrawGridLines(false);
            axisRight.setTextColor(color);
            axisRight.setTextSize(10.0f);
            axisRight.setDrawTopYLabelEntry(true);
        }
    }

    public final LineDataSet KWHzl(@NotNull android.content.Context context, @NotNull java.util.ArrayList<Entry> arrayList, @NotNull java.util.ArrayList<java.lang.Integer> arrayList2, @NotNull YAxis.AxisDependency axisDependency, boolean z, boolean z2, boolean z3, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(axisDependency, "");
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(z2);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighlightEnabled(z);
        if (z) {
            lineDataSet.setHighLightColor(ContextCompat.getColor(context, C52761wXj.Activity.dXcUrg));
            lineDataSet.setHighlightLineWidth(0.5f);
            lineDataSet.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        }
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setColors(arrayList2);
        lineDataSet.setAxisDependency(axisDependency);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setDrawFilled(z3);
        if (z3) {
            if (num != null) {
                lineDataSet.setFillDrawable(ContextCompat.getDrawable(context, num.intValue()));
            } else if (drawable != null) {
                lineDataSet.setFillDrawable(drawable);
            }
        }
        lineDataSet.setValueFormatter(new DefaultValueFormatter(i));
        return lineDataSet;
    }
}
