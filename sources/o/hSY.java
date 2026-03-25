package o;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hSY extends android.widget.FrameLayout {
    public boolean AEQbTJ;
    public final hDJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hSY(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:31) call: o.hSY.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ hSY(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hSY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        hDJ hdjOLrzqt = hDJ.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hdjOLrzqt, "");
        this.copydefault = hdjOLrzqt;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(jQC jqc, @NotNull Function1<? super java.lang.String, Unit> function1) {
        boolean z;
        java.lang.String strAEQbTJ;
        jQI jqiAEQbTJ;
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<ChartDataUIItem> listOLrzqt = jqc != null ? jqc.OLrzqt() : null;
        boolean z2 = listOLrzqt != null && listOLrzqt.isEmpty();
        BarChart barChart = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(barChart, "");
        barChart.setVisibility(z2 ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z2 ? 0 : 8);
        if (this.AEQbTJ) {
            this.AEQbTJ = false;
            C55244xgL c55244xgL = this.copydefault.KWHzl;
            Intrinsics.copydefault(c55244xgL);
            c55244xgL.setVisibility((jqc != null ? jqc.AEQbTJ() : null) != null ? 0 : 8);
            if (c55244xgL.getVisibility() == 0) {
                float f = C55296xhK.AEQbTJ(c55244xgL) ? 24.0f : -24.0f;
                android.content.Context context = c55244xgL.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55244xgL.setTranslationX(C55298xhM.EZpvd(f, context));
                if (jqc != null && (jqiAEQbTJ = jqc.AEQbTJ()) != null) {
                    c55244xgL.fetchVPNInfo();
                    c55244xgL.setStyle(2);
                    c55244xgL.setOKDSSize(-20);
                    c55244xgL.setStyle(1);
                    for (jQH jqh : jqiAEQbTJ.copydefault()) {
                        TabLayout.Tab tag = c55244xgL.values().setText(jqh.KWHzl()).setTag(jqh.AEQbTJ());
                        Intrinsics.checkNotNullExpressionValue(tag, "");
                        c55244xgL.AEQbTJ(tag);
                        if (jqh.OLrzqt()) {
                            c55244xgL.EZpvd(tag);
                        }
                    }
                    c55244xgL.copydefault(new StateListAnimator(function1, this));
                }
            }
        }
        if (z2) {
            invalidate();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (listOLrzqt == null || listOLrzqt.size() < 2) {
            z = false;
        } else {
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt);
            long jValueOf = C33129mqd.valueOf(chartDataUIItem != null ? chartDataUIItem.getTimestamp() : null);
            ChartDataUIItem chartDataUIItem2 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(listOLrzqt);
            if ((C33129mqd.valueOf(chartDataUIItem2 != null ? chartDataUIItem2.getTimestamp() : null) - jValueOf) / ((long) 86400000) > 2) {
                z = true;
            }
        }
        if (listOLrzqt != null) {
            int i = 0;
            for (java.lang.Object obj : listOLrzqt) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ChartDataUIItem chartDataUIItem3 = (ChartDataUIItem) obj;
                float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem3.getValue());
                float fDjBIcL2 = C33129mqd.djBIcL(java.lang.Integer.valueOf(i));
                arrayList.add(new BarEntry(fDjBIcL2, fDjBIcL));
                if (z) {
                    strAEQbTJ = C25322iuY.OLrzqt.OLrzqt(chartDataUIItem3.getTimestamp());
                } else {
                    strAEQbTJ = C25322iuY.OLrzqt.AEQbTJ(chartDataUIItem3.getTimestamp());
                }
                linkedHashMap.put(java.lang.Float.valueOf(fDjBIcL2), strAEQbTJ);
                linkedHashMap2.put(java.lang.Float.valueOf(fDjBIcL2), new hSS(C25322iuY.OLrzqt.gEmmrt(chartDataUIItem3.getTimestamp()), chartDataUIItem3.getValue()));
                i++;
            }
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, null);
        int i2 = C52761wXj.Activity.OqFWZa;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault = C25382ivf.copydefault(i2, context2);
        barDataSet.setColor(iCopydefault);
        barDataSet.setHighLightColor(iCopydefault);
        BarData barData = new BarData(barDataSet);
        barData.setDrawValues(false);
        barData.setBarWidth(0.8f);
        this.copydefault.EZpvd.setData(barData);
        copydefault(linkedHashMap);
        EZpvd();
        OLrzqt(linkedHashMap2);
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ hSY EZpvd;
        public final /* synthetic */ Function1<java.lang.String, Unit> copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super java.lang.String, Unit> function1, hSY hsy) {
            this.copydefault = function1;
            this.EZpvd = hsy;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (str == null) {
                return;
            }
            this.copydefault.invoke(str);
            ConstraintLayout constraintLayout = this.EZpvd.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
        }
    }

    public final void copydefault(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.copydefault.EZpvd.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new Application(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    public static final class Application extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> KWHzl;

        public Application(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.KWHzl = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.KWHzl.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void EZpvd() {
        YAxis axisRight = this.copydefault.EZpvd.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new hSC());
            axisRight.setAxisMinimum(0.0f);
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.copydefault.EZpvd.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setAxisMinimum(0.0f);
            axisLeft.setDrawAxisLine(false);
        }
    }

    public final void OLrzqt(java.util.Map<java.lang.Float, hSS> map) {
        BarChart barChart = this.copydefault.EZpvd;
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
        barChart.setOnChartValueSelectedListener(new C21966hSy(barChart, map, this.copydefault.copydefault));
        barChart.invalidate();
        this.copydefault.EZpvd.requestLayout();
    }
}
