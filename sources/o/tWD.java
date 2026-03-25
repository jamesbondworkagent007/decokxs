package o;

import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tWD {
    public tWC AEQbTJ;
    public java.util.ArrayList<java.lang.String> EZpvd;
    public final java.util.ArrayList<Entry> KWHzl;
    public LineChart OLrzqt;
    public android.content.Context copydefault;

    public tWD(@NotNull LineChart lineChart) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        this.OLrzqt = lineChart;
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.copydefault = context;
        this.EZpvd = new java.util.ArrayList<>();
        this.KWHzl = new java.util.ArrayList<>();
        this.OLrzqt.setOnChartValueSelectedListener(new OnChartValueSelectedListener() { // from class: o.tWD.4
            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onNothingSelected() {
            }

            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onValueSelected(Entry entry, Highlight highlight) {
            }
        });
        OLrzqt(this.copydefault);
    }

    public final void OLrzqt(android.content.Context context) {
        C46489tWf.EZpvd.OLrzqt(context, this.OLrzqt, null, false);
        XAxis xAxis = this.OLrzqt.getXAxis();
        if (xAxis != null) {
            xAxis.setSpaceMin(2.0f);
        }
        Legend legend = this.OLrzqt.getLegend();
        if (legend != null) {
            legend.setTextColor(ContextCompat.getColor(context, C32113mPz.ActionBar.gEmmrt));
        }
        YAxis axisLeft = this.OLrzqt.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.resetAxisMinimum();
        }
        YAxis axisLeft2 = this.OLrzqt.getAxisLeft();
        if (axisLeft2 != null) {
            axisLeft2.setGranularityEnabled(true);
        }
        YAxis axisLeft3 = this.OLrzqt.getAxisLeft();
        if (axisLeft3 != null) {
            axisLeft3.setGranularity(0.1f);
        }
        this.OLrzqt.setNoDataTextColor(ContextCompat.getColor(context, C32113mPz.ActionBar.gEmmrt));
        this.OLrzqt.setMinOffset(0.0f);
        this.OLrzqt.setTouchEnabled(false);
        this.OLrzqt.setDrawGridBackground(false);
        this.OLrzqt.setScaleEnabled(false);
        this.OLrzqt.setPinchZoom(false);
        this.OLrzqt.setDrawBorders(false);
        Legend legend2 = this.OLrzqt.getLegend();
        if (legend2 != null) {
            legend2.setEnabled(false);
        }
        Description description = this.OLrzqt.getDescription();
        if (description != null) {
            description.setEnabled(false);
        }
        this.OLrzqt.setDragEnabled(false);
        YAxis axisLeft4 = this.OLrzqt.getAxisLeft();
        if (axisLeft4 != null) {
            axisLeft4.setEnabled(false);
        }
        YAxis axisRight = this.OLrzqt.getAxisRight();
        if (axisRight != null) {
            axisRight.setDrawGridLines(false);
        }
        YAxis axisRight2 = this.OLrzqt.getAxisRight();
        if (axisRight2 != null) {
            axisRight2.setDrawAxisLine(false);
        }
        YAxis axisLeft5 = this.OLrzqt.getAxisLeft();
        if (axisLeft5 != null) {
            axisLeft5.setDrawGridLines(false);
        }
        YAxis axisLeft6 = this.OLrzqt.getAxisLeft();
        if (axisLeft6 != null) {
            axisLeft6.setDrawAxisLine(false);
        }
        YAxis axisRight3 = this.OLrzqt.getAxisRight();
        if (axisRight3 != null) {
            axisRight3.setEnabled(false);
        }
        this.OLrzqt.getXAxis().setAxisMinimum(0.0f);
        XAxis xAxis2 = this.OLrzqt.getXAxis();
        if (xAxis2 != null) {
            xAxis2.setEnabled(true);
        }
        XAxis xAxis3 = this.OLrzqt.getXAxis();
        if (xAxis3 != null) {
            xAxis3.setDrawAxisLine(false);
        }
        XAxis xAxis4 = this.OLrzqt.getXAxis();
        if (xAxis4 != null) {
            xAxis4.setDrawLabels(false);
        }
        XAxis xAxis5 = this.OLrzqt.getXAxis();
        if (xAxis5 != null) {
            xAxis5.setDrawLimitLinesBehindData(false);
        }
        this.OLrzqt.getAxisLeft().setSpaceTop(60.0f);
        this.OLrzqt.getAxisLeft().setSpaceBottom(30.0f);
        LineChart lineChart = this.OLrzqt;
        ChartAnimator animator = lineChart.getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = this.OLrzqt.getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        tWC twc = new tWC(lineChart, animator, viewPortHandler);
        this.AEQbTJ = twc;
        this.OLrzqt.setRenderer(twc);
    }

    public final void copydefault(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(arrayList);
        KWHzl(arrayList, false);
    }

    public final void KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList<Entry> arrayList2 = new java.util.ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            float f = i;
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
            arrayList2.add(new Entry(f * 1.0f, str != null ? C33129mqd.djBIcL(str) : 0.0f));
        }
        YAxis axisLeft = this.OLrzqt.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
        }
        KWHzl(this.OLrzqt, arrayList2, z);
        this.KWHzl.clear();
        this.KWHzl.addAll(arrayList2);
    }

    public final void KWHzl(LineChart lineChart, java.util.ArrayList<Entry> arrayList, boolean z) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setFormSize(1.0f);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setColor(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, this.copydefault, 0.0f, 2, null));
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setFormLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setHighLightColor(Color.parseColor("#403075EE"));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.enableDashedHighlightLine(10.0f, 5.0f, 0.0f);
        lineDataSet.disableDashedHighlightLine();
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawFilled(false);
        lineDataSet.setFillFormatter(new IFillFormatter() { // from class: o.tWB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.github.mikephil.charting.formatter.IFillFormatter
            public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
                return tWD.KWHzl(this.AEQbTJ, iLineDataSet, lineDataProvider);
            }
        });
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(lineDataSet);
        lineChart.setData(new LineData(arrayList2));
        if (z) {
            return;
        }
        lineChart.animateX(300);
    }

    public static final float KWHzl(tWD twd, ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        YAxis axisLeft = twd.OLrzqt.getAxisLeft();
        java.lang.Float fValueOf = axisLeft != null ? java.lang.Float.valueOf(axisLeft.getAxisMinimum()) : null;
        Intrinsics.copydefault(fValueOf);
        return fValueOf.floatValue();
    }

    public final void copydefault(int i) {
        Entry entry;
        if (!C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.KWHzl.size())) || (entry = (Entry) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i)) == null) {
            return;
        }
        float x = entry.getX();
        tWC twc = this.AEQbTJ;
        if (twc != null) {
            twc.copydefault(x);
        }
        this.OLrzqt.invalidate();
    }
}
