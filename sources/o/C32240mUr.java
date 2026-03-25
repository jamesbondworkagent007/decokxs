package o;

import android.widget.LinearLayout;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32240mUr extends android.widget.FrameLayout {
    public final C36078oOl EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32240mUr(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:25) call: o.mUr.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C32240mUr(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32240mUr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36078oOl c36078oOlKWHzl = C36078oOl.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36078oOlKWHzl, "");
        this.EZpvd = c36078oOlKWHzl;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    public final void EZpvd(java.util.List<ChartDataUIItem> list) {
        java.util.List listFetchVPNInfo;
        java.lang.String timestamp;
        java.lang.String value;
        java.lang.String timestamp2;
        java.lang.String value2;
        boolean z = list != null && list.isEmpty();
        BarChart barChart = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(barChart, "");
        barChart.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        java.util.ArrayList<BarEntry> arrayList = new java.util.ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null && (listFetchVPNInfo = CollectionsKt___CollectionsKt.fetchVPNInfo(list, 24)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
            int i = 0;
            for (java.lang.Object obj : listFetchVPNInfo) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
                mUK muk = mUK.AEQbTJ;
                if (chartDataUIItem == null || (timestamp = chartDataUIItem.getTimestamp()) == null) {
                    timestamp = "";
                }
                int iAEQbTJ = muk.AEQbTJ(timestamp);
                java.lang.Float fValueOf = (chartDataUIItem == null || (value2 = chartDataUIItem.getValue()) == null) ? null : java.lang.Float.valueOf(C33129mqd.djBIcL(value2));
                arrayList.add(new BarEntry(C33129mqd.djBIcL(java.lang.Integer.valueOf(i)), fValueOf != null ? fValueOf.floatValue() : 0.0f));
                linkedHashMap.put(java.lang.Float.valueOf(C33129mqd.djBIcL(java.lang.Integer.valueOf(i))), java.lang.String.valueOf(iAEQbTJ));
                float f = i;
                new BarEntry(f, C33129mqd.djBIcL(chartDataUIItem != null ? chartDataUIItem.getValue() : null));
                if (chartDataUIItem == null || (value = chartDataUIItem.getValue()) == null) {
                    value = "";
                }
                if (chartDataUIItem == null || (timestamp2 = chartDataUIItem.getTimestamp()) == null) {
                    timestamp2 = "";
                }
                linkedHashMap2.put(java.lang.Float.valueOf(f), new C32233mUk(muk.copydefault(timestamp2), value));
                arrayList2.add(Unit.INSTANCE);
                i++;
            }
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, null);
        int i2 = C52761wXj.ActionBar.OBJEWx;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = mUM.EZpvd(i2, context);
        barDataSet.setColor(iEZpvd);
        barDataSet.setHighLightColor(iEZpvd);
        BarData barData = new BarData(barDataSet);
        barData.setDrawValues(false);
        barData.setBarWidth(0.6f);
        this.EZpvd.KWHzl.setData(barData);
        AEQbTJ(arrayList, linkedHashMap);
        KWHzl();
        OLrzqt(linkedHashMap2);
    }

    public final void AEQbTJ(java.util.ArrayList<BarEntry> arrayList, java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.EZpvd.KWHzl.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            java.lang.Float fDxcTrN = CollectionsKt___CollectionsKt.dxcTrN(map.keySet());
            xAxis.setValueFormatter(new C32229mUg(map, fDxcTrN != null ? fDxcTrN.floatValue() : 0.0f));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    public final void KWHzl() {
        YAxis axisRight = this.EZpvd.KWHzl.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new C32231mUi());
            axisRight.setAxisMinimum(0.0f);
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(mUM.copydefault(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.EZpvd.KWHzl.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setAxisMinimum(0.0f);
            axisLeft.setDrawAxisLine(false);
        }
    }

    public final void OLrzqt(java.util.Map<java.lang.Float, C32233mUk> map) {
        BarChart barChart = this.EZpvd.KWHzl;
        barChart.setDragEnabled(true);
        barChart.setScaleXEnabled(false);
        barChart.setPinchZoom(false);
        barChart.setScaleEnabled(false);
        barChart.getDescription().setEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.setTouchEnabled(true);
        barChart.setHighlightPerTapEnabled(true);
        barChart.setExtraBottomOffset(5.0f);
        Intrinsics.copydefault(barChart);
        barChart.setOnChartValueSelectedListener(new C32223mUa(barChart, map, this.EZpvd.copydefault));
        barChart.invalidate();
        this.EZpvd.KWHzl.requestLayout();
    }
}
