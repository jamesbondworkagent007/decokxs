package o;

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
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xtZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55947xtZ {
    public static final C55947xtZ EZpvd = new C55947xtZ();

    private C55947xtZ() {
    }

    public static /* synthetic */ void initLineBarChart$default(C55947xtZ c55947xtZ, android.content.Context context, BarLineChartBase barLineChartBase, MarkerView markerView, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        c55947xtZ.copydefault(context, barLineChartBase, markerView, z);
    }

    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void copydefault(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(barLineChartBase, "");
        int color = ContextCompat.getColor(context, C52761wXj.Activity.aappFQ);
        int color2 = ContextCompat.getColor(context, C52761wXj.Activity.Qsauvs);
        int color3 = ContextCompat.getColor(context, C52761wXj.Activity.sZqaRl);
        barLineChartBase.setTouchEnabled(true);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setDragEnabled(false);
        barLineChartBase.setDoubleTapToZoomEnabled(false);
        barLineChartBase.getDescription().setEnabled(false);
        barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
        barLineChartBase.setNoDataTextColor(color);
        if (markerView != null) {
            markerView.setChartView(barLineChartBase);
            barLineChartBase.setMarker(markerView);
        }
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setTextColor(color2);
        xAxis.setTextSize(10.0f);
        xAxis.setYOffset(3.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(true);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisLineColor(color3);
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setLabelCount(6, false);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
        if (barLineChartBase.getAxisLeft().isEnabled()) {
            YAxis axisLeft = barLineChartBase.getAxisLeft();
            axisLeft.setDrawAxisLine(false);
            axisLeft.setDrawGridLines(false);
            axisLeft.setTextColor(color2);
            axisLeft.setTextSize(10.0f);
            axisLeft.setDrawTopYLabelEntry(true);
        }
        if (barLineChartBase.getAxisRight().isEnabled()) {
            YAxis axisRight = barLineChartBase.getAxisRight();
            axisRight.setDrawAxisLine(false);
            axisRight.setDrawGridLines(false);
            axisRight.setTextColor(color2);
            axisRight.setTextSize(10.0f);
            axisRight.setDrawTopYLabelEntry(true);
        }
    }

    public final LineDataSet KWHzl(@NotNull android.content.Context context, @NotNull java.util.ArrayList<Entry> arrayList, int i, @NotNull YAxis.AxisDependency axisDependency, boolean z, boolean z2, boolean z3, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(axisDependency, "");
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(z2);
        if (z2) {
            lineDataSet.setCircleRadius(2.5f);
            lineDataSet.setCircleColor(i);
        }
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighlightEnabled(z);
        if (z) {
            lineDataSet.setHighLightColor(ContextCompat.getColor(context, C52761wXj.Activity.Qsauvs));
            lineDataSet.setHighlightLineWidth(0.5f);
        }
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setColor(i);
        lineDataSet.setAxisDependency(axisDependency);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setDrawFilled(z3);
        if (z3) {
            if (num != null) {
                lineDataSet.setFillDrawable(C33070mpX.KWHzl(num.intValue()));
            } else if (drawable != null) {
                lineDataSet.setFillDrawable(drawable);
            }
        }
        lineDataSet.setValueFormatter(new DefaultValueFormatter(i2));
        return lineDataSet;
    }

    public static /* synthetic */ java.lang.String pnlFormatTruncate$default(C55947xtZ c55947xtZ, java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return c55947xtZ.copydefault(obj, i);
    }

    public final java.lang.String copydefault(@NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.gEmmrt(pTB.OLrzqt(obj).setScale(i, 1));
    }

    public static /* synthetic */ java.lang.String pnlToFixedFormat$default(C55947xtZ c55947xtZ, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return c55947xtZ.AEQbTJ(str, str2, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String sizeDig;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        if (z && bigDecimalOLrzqt.signum() > 0) {
            str3 = Marker.ANY_NON_NULL_MARKER;
        }
        if (str2 == null) {
            return str3 + pTB.formatDownToFixed$default(bigDecimalOLrzqt, 0, null, 3, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "USDT")) {
            return str3 + pTB.formatDownToFixed$default(bigDecimalOLrzqt, 2, null, 2, null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BigDecimal bigDecimalAEQbTJ = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str2)) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) ? null : pTB.AEQbTJ(sizeDig);
        return str3 + pTB.formatDownToFixed$default(bigDecimalOLrzqt, bigDecimalAEQbTJ != null ? bigDecimalAEQbTJ.intValueExact() : 2, null, 2, null);
    }

    public static /* synthetic */ java.lang.String getOrderRatioStr$default(C55947xtZ c55947xtZ, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c55947xtZ.KWHzl(str, z);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return (z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : pTB.formatPercentWithSymbol$default(pTB.OLrzqt((java.lang.Object) str), 0, 0, null, null, 15, null);
    }

    public static /* synthetic */ java.lang.String pnlFormat$default(C55947xtZ c55947xtZ, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return c55947xtZ.copydefault(str, str2, z);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String sizeDig;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        if (z && bigDecimalOLrzqt.signum() > 0) {
            str3 = Marker.ANY_NON_NULL_MARKER;
        }
        if (str2 == null) {
            return str3 + pTB.formatDownToMax$default(bigDecimalOLrzqt, 0, null, 3, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "USDT")) {
            return str3 + pTB.formatDownToMax$default(bigDecimalOLrzqt, 2, null, 2, null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BigDecimal bigDecimalAEQbTJ = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str2)) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) ? null : pTB.AEQbTJ(sizeDig);
        return str3 + pTB.formatDownToMax$default(bigDecimalOLrzqt, bigDecimalAEQbTJ != null ? bigDecimalAEQbTJ.intValueExact() : 2, null, 2, null);
    }
}
