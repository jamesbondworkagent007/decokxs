package o;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.okinc.business.defi.api.bean.CurvePrice;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19625gJh extends LineChart {
    public LineDataSet OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19625gJh(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19625gJh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19625gJh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    public final void AEQbTJ() {
        setMinOffset(0.0f);
        XAxis xAxis = getXAxis();
        if (xAxis != null) {
            xAxis.setEnabled(false);
        }
        YAxis axisRight = getAxisRight();
        if (axisRight != null) {
            axisRight.setEnabled(false);
        }
        YAxis axisLeft = getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
        }
        setTouchEnabled(false);
        setDrawGridBackground(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        Legend legend = getLegend();
        if (legend != null) {
            legend.setEnabled(false);
        }
        Description description = getDescription();
        if (description != null) {
            description.setEnabled(false);
        }
        setDragEnabled(false);
        getLegend().setForm(Legend.LegendForm.NONE);
    }

    public final void setChartData(@NotNull java.util.List<CurvePrice> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(copydefault(copydefault(list), str));
        setData(new LineData(arrayList));
        animateX(0);
    }

    public final LineDataSet copydefault(java.util.List<? extends Entry> list, java.lang.String str) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setFormSize(1.0f);
        lineDataSet.setFormLineWidth(1.0f);
        lineDataSet.setDrawIcons(false);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(AEQbTJ(context, str));
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawFilled(false);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        this.OLrzqt = lineDataSet;
        return lineDataSet;
    }

    public static /* synthetic */ int getLineColor$default(C19625gJh c19625gJh, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "0";
        }
        return c19625gJh.AEQbTJ(context, str);
    }

    public final int AEQbTJ(android.content.Context context, java.lang.String str) {
        if (C33129mqd.AEQbTJ(str, 0)) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return context.getColor(C52761wXj.Activity.QwvEab);
        }
        return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    public final java.util.List<Entry> copydefault(java.util.List<CurvePrice> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CurvePrice curvePrice = (CurvePrice) obj;
            arrayList.add(new Entry(i * 1.0f, C33129mqd.djBIcL(curvePrice.getPrice()), curvePrice));
            i++;
        }
        return arrayList;
    }
}
