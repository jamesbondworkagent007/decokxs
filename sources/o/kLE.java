package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kLE extends android.widget.FrameLayout {
    public final hDA copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kLE(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public hDA EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:29) call: o.kLE.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ kLE(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kLE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hDA hdaOLrzqt = hDA.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hdaOLrzqt, "");
        this.copydefault = hdaOLrzqt;
        AEQbTJ();
        OLrzqt();
        KWHzl();
    }

    public final void AEQbTJ(java.util.List<ChartDataUIItem> list) {
        if (list == null || list.isEmpty()) {
            EZpvd().EZpvd.clear();
            EZpvd().EZpvd.invalidate();
        } else {
            copydefault(list);
        }
    }

    public final void OLrzqt() {
        XAxis xAxis = EZpvd().EZpvd.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setGranularity(1.0f);
            xAxis.setGranularityEnabled(true);
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setXOffset(0.0f);
            xAxis.setYOffset(0.0f);
            xAxis.setEnabled(false);
        }
    }

    public final void KWHzl() {
        YAxis axisRight = EZpvd().EZpvd.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new C21963hSv());
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setDrawAxisLine(false);
            axisRight.setDrawGridLines(false);
        }
        YAxis axisLeft = EZpvd().EZpvd.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
        }
    }

    public final void OLrzqt(float f) {
        YAxis axisRight = EZpvd().EZpvd.getAxisRight();
        if (axisRight != null) {
            axisRight.removeAllLimitLines();
            LimitLine limitLine = new LimitLine(f, "");
            limitLine.setLineColor(C33070mpX.copydefault(C52761wXj.Activity.hwXsuq));
            limitLine.setLineWidth(1.0f);
            limitLine.enableDashedLine(10.0f, 5.0f, 0.0f);
            limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
            axisRight.addLimitLine(limitLine);
        }
    }

    public final void AEQbTJ() {
        LineChart lineChart = EZpvd().EZpvd;
        lineChart.setDragEnabled(true);
        lineChart.setScaleXEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setScaleEnabled(false);
        lineChart.getDescription().setEnabled(false);
        Legend legend = lineChart.getLegend();
        if (legend != null) {
            legend.setEnabled(false);
        }
        lineChart.setTouchEnabled(true);
        lineChart.setHighlightPerTapEnabled(true);
        lineChart.setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void copydefault(java.util.List<ChartDataUIItem> list) {
        if (list.isEmpty()) {
            return;
        }
        float fEZpvd = EZpvd(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(C33129mqd.djBIcL(((ChartDataUIItem) it.next()).getValue())));
        }
        java.lang.Float fGasjUx = CollectionsKt___CollectionsKt.gasjUx(arrayList);
        float fFloatValue = fGasjUx != null ? fGasjUx.floatValue() : 0.0f;
        java.lang.Float fDxcTrN = CollectionsKt___CollectionsKt.dxcTrN(arrayList);
        float fFloatValue2 = fDxcTrN != null ? fDxcTrN.floatValue() : 0.0f;
        float fMin = java.lang.Math.min(fFloatValue, fEZpvd);
        float fMax = java.lang.Math.max(fFloatValue2, fEZpvd);
        float f = fMax - fMin;
        if (f == 0.0f) {
            f = 1.0f;
        }
        float f2 = f * 0.05f;
        YAxis axisRight = EZpvd().EZpvd.getAxisRight();
        if (axisRight != null) {
            axisRight.setAxisMinimum(fMin - f2);
            axisRight.setAxisMaximum(fMax + f2);
            axisRight.setSpaceTop(0.0f);
            axisRight.setSpaceBottom(0.0f);
        }
        LineData lineData = new LineData((java.util.List<ILineDataSet>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(KWHzl(list)));
        lineData.setDrawValues(false);
        OLrzqt(fEZpvd);
        EZpvd().EZpvd.setData(lineData);
        EZpvd().EZpvd.invalidate();
    }

    public final float EZpvd(java.util.List<ChartDataUIItem> list) {
        ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (chartDataUIItem == null) {
            return 0.0f;
        }
        float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
        float fDjBIcL2 = C33129mqd.djBIcL(chartDataUIItem.getValue());
        int size = list.size();
        for (int i = 1; i < size; i++) {
            float fDjBIcL3 = C33129mqd.djBIcL(list.get(i).getValue());
            if (fDjBIcL3 > fDjBIcL2) {
                fDjBIcL2 = fDjBIcL3;
            }
            if (fDjBIcL3 < fDjBIcL) {
                fDjBIcL = fDjBIcL3;
            }
        }
        float f = fDjBIcL2 == fDjBIcL ? 0.0f : (fDjBIcL2 - fDjBIcL) * 0.1f;
        if (fDjBIcL <= 0.0f && fDjBIcL2 >= 0.0f) {
            return 0.0f;
        }
        if (fDjBIcL > 0.0f) {
            return java.lang.Math.max(fDjBIcL - f, 0.0f);
        }
        return java.lang.Math.min(fDjBIcL2 + f, 0.0f);
    }

    public final java.util.List<LineDataSet> KWHzl(java.util.List<ChartDataUIItem> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<? extends Entry> arrayList2 = new java.util.ArrayList<>();
        char c = 0;
        float fDjBIcL = C33129mqd.djBIcL(list.get(0).getValue());
        int i = -1;
        int i2 = fDjBIcL > 0.0f ? 1 : fDjBIcL < 0.0f ? -1 : 0;
        arrayList2.add(new Entry(0.0f, fDjBIcL, list.get(0)));
        int size = list.size();
        int i3 = 1;
        while (i3 < size) {
            ChartDataUIItem chartDataUIItem = list.get(i3);
            float fDjBIcL2 = C33129mqd.djBIcL(chartDataUIItem.getValue());
            Entry entry = (Entry) CollectionsKt___CollectionsKt.AubY(arrayList2);
            if (i2 != i) {
                if (i2 != 1) {
                    if (fDjBIcL2 == 0.0f) {
                        arrayList2.add(new Entry(entry.getX() + 1, fDjBIcL2, chartDataUIItem));
                    } else {
                        arrayList.add(KWHzl(arrayList2, i2));
                        Entry entry2 = new Entry(entry.getX() + 1, fDjBIcL2, chartDataUIItem);
                        Entry[] entryArr = new Entry[2];
                        entryArr[c] = entry;
                        entryArr[1] = entry2;
                        arrayList2 = yDY.AhwBna(entryArr);
                        i2 = fDjBIcL2 > 0.0f ? 1 : i;
                    }
                } else if (fDjBIcL2 >= 0.0f) {
                    arrayList2.add(new Entry(entry.getX() + 1, fDjBIcL2, chartDataUIItem));
                } else {
                    Entry entry3 = new Entry(entry.getX() + 1, 0.0f, chartDataUIItem);
                    arrayList2.add(entry3);
                    arrayList.add(KWHzl(arrayList2, i2));
                    Entry entry4 = new Entry(entry.getX() + 2, fDjBIcL2, chartDataUIItem);
                    Entry[] entryArr2 = new Entry[2];
                    entryArr2[c] = entry3;
                    entryArr2[1] = entry4;
                    arrayList2 = yDY.AhwBna(entryArr2);
                    i2 = -1;
                }
            } else if (fDjBIcL2 <= 0.0f) {
                arrayList2.add(new Entry(entry.getX() + 1, fDjBIcL2, chartDataUIItem));
            } else {
                Entry entry5 = new Entry(entry.getX() + 1, 0.0f, chartDataUIItem);
                arrayList2.add(entry5);
                arrayList.add(KWHzl(arrayList2, i2));
                arrayList2 = yDY.AhwBna(entry5, new Entry(entry.getX() + 2, fDjBIcL2, chartDataUIItem));
            }
            i3++;
            c = 0;
            i = -1;
        }
        arrayList.add(KWHzl(arrayList2, i2));
        return arrayList;
    }

    public final LineDataSet KWHzl(java.util.List<? extends Entry> list, int i) {
        int iCopydefault;
        int iCopydefault2;
        if (i > 0) {
            iCopydefault = C25382ivf.KWHzl(C52761wXj.ActionBar.OBJEWx);
        } else if (i < 0) {
            iCopydefault = C25382ivf.KWHzl(C52761wXj.ActionBar.zuWLRA);
        } else {
            iCopydefault = C33070mpX.copydefault(C23274hvD.StateListAnimator.sSMYrx);
        }
        if (i >= 0) {
            iCopydefault2 = C33070mpX.copydefault(C23274hvD.StateListAnimator.gHZMYf);
        } else {
            iCopydefault2 = C33070mpX.copydefault(C23274hvD.StateListAnimator.zuBGHE);
        }
        LineDataSet lineDataSet = new LineDataSet(list, null);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setDrawValues(false);
        lineDataSet.setColor(iCopydefault);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setHighLightColor(0);
        lineDataSet.setCubicIntensity(0.02f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawCircleHole(false);
        if (i == 0) {
            lineDataSet.setDrawFilled(false);
        } else {
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(AEQbTJ(iCopydefault2, i > 0));
        }
        return lineDataSet;
    }

    public final android.graphics.drawable.Drawable AEQbTJ(int i, boolean z) {
        return new GradientDrawable(z ? GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb(100, Color.red(i), Color.green(i), Color.blue(i)), 0});
    }
}
