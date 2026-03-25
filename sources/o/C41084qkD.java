package o;

import android.graphics.drawable.GradientDrawable;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41084qkD extends LineChart {
    public java.util.ArrayList<java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41084qkD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41084qkD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.qkD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41084qkD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41084qkD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList<>();
        OLrzqt(context);
    }

    private final void OLrzqt(android.content.Context context) {
        pWU.Companion.OLrzqt(context, this, null, false);
        Legend legend = getLegend();
        if (legend != null) {
            legend.setTextColor(ContextCompat.getColor(context, C32113mPz.ActionBar.gEmmrt));
        }
        YAxis axisLeft = getAxisLeft();
        if (axisLeft != null) {
            axisLeft.resetAxisMinimum();
        }
        YAxis axisLeft2 = getAxisLeft();
        if (axisLeft2 != null) {
            axisLeft2.setGranularityEnabled(true);
        }
        YAxis axisLeft3 = getAxisLeft();
        if (axisLeft3 != null) {
            axisLeft3.setGranularity(0.1f);
        }
        setNoDataText(C33070mpX.AYXKKw(qZH.PendingIntent.QSBOWP));
        setNoDataTextColor(ContextCompat.getColor(context, C32113mPz.ActionBar.gEmmrt));
        setTouchEnabled(false);
        setDrawGridBackground(false);
        setScaleEnabled(false);
        setPinchZoom(true);
        setDrawBorders(false);
        Legend legend2 = getLegend();
        if (legend2 != null) {
            legend2.setEnabled(false);
        }
        Description description = getDescription();
        if (description != null) {
            description.setEnabled(false);
        }
        setDragEnabled(false);
        XAxis xAxis = getXAxis();
        if (xAxis != null) {
            xAxis.setEnabled(false);
        }
        YAxis axisLeft4 = getAxisLeft();
        if (axisLeft4 != null) {
            axisLeft4.setEnabled(false);
        }
        YAxis axisRight = getAxisRight();
        if (axisRight != null) {
            axisRight.setDrawGridLines(false);
        }
        YAxis axisRight2 = getAxisRight();
        if (axisRight2 != null) {
            axisRight2.setDrawAxisLine(false);
        }
        YAxis axisRight3 = getAxisRight();
        if (axisRight3 != null) {
            axisRight3.setEnabled(false);
        }
        YAxis axisRight4 = getAxisRight();
        if (axisRight4 != null) {
            axisRight4.setLabelCount(6, true);
        }
        setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setDragEnabled(false);
        YAxis axisRight5 = getAxisRight();
        if (axisRight5 != null) {
            axisRight5.setEnabled(true);
        }
    }

    public final void setData(@NotNull java.util.List<java.lang.String> list, boolean z, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        setBackgroundColor(ContextCompat.getColor(getContext(), i));
        setChartData(this.OLrzqt, z);
    }

    public final void setChartData(java.util.ArrayList<java.lang.String> arrayList, boolean z) {
        java.util.ArrayList<Entry> arrayList2 = new java.util.ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new Entry(i * 1.0f, C33129mqd.djBIcL(arrayList.get(i))));
        }
        XAxis xAxis = getXAxis();
        if (xAxis != null) {
            xAxis.setEnabled(false);
        }
        YAxis axisLeft = getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
        }
        setChartLongShortPositionData(this, arrayList2, z);
    }

    public final void setChartLongShortPositionData(LineChart lineChart, java.util.ArrayList<Entry> arrayList, boolean z) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setFormSize(1.0f);
        lineDataSet.setDrawIcons(false);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        float[] fArr = {0.5f, 0.0f};
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList2.add(java.lang.Integer.valueOf(C33522mxz.OLrzqt(iTradeFallGraph$default, fArr[i])));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList2));
        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
        float[] fArr2 = {0.5f, 0.0f};
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp2, context2, 0.0f, 2, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList3.add(java.lang.Integer.valueOf(C33522mxz.OLrzqt(iTradeRiseGraph$default, fArr2[i2])));
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation2, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList3));
        if (z) {
            C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            lineDataSet.setColor(C33512mxp.tradeFallGraph$default(c33512mxp3, context3, 0.0f, 2, null));
            lineDataSet.setFillDrawable(gradientDrawable);
        } else {
            C33512mxp c33512mxp4 = C33512mxp.AEQbTJ;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            lineDataSet.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp4, context4, 0.0f, 2, null));
            lineDataSet.setFillDrawable(gradientDrawable2);
        }
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setFormLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.enableDashedHighlightLine(10.0f, 5.0f, 0.0f);
        lineDataSet.disableDashedHighlightLine();
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawFilled(true);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(lineDataSet);
        lineChart.setData(new LineData(arrayList4));
    }
}
