package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56030xvC {
    public static final C56030xvC EZpvd = new C56030xvC();

    /* JADX INFO: renamed from: o.xvC$Activity */
    public interface Activity {
        float getChartPnl();

        long getDateTime();
    }

    private C56030xvC() {
    }

    public static /* synthetic */ void drawChart$default(C56030xvC c56030xvC, LineChart lineChart, java.util.List list, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 7;
        }
        if ((i3 & 8) != 0) {
            i2 = 5;
        }
        c56030xvC.copydefault(lineChart, list, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull LineChart lineChart, @NotNull java.util.List<? extends Activity> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.util.List<LineDataSet> listAEQbTJ = AEQbTJ(context, AEQbTJ(list));
        EZpvd(lineChart, list, i);
        copydefault(lineChart, list, i2);
        LineData lineData = (LineData) lineChart.getData();
        if (lineData != null) {
            lineData.clearValues();
        }
        LineData lineData2 = new LineData(listAEQbTJ);
        lineData2.setDrawValues(false);
        lineChart.setData(lineData2);
        lineChart.invalidate();
    }

    public final void copydefault(LineChart lineChart, java.util.List<? extends Activity> list, int i) {
        float f;
        kotlin.Pair<java.lang.Float, java.lang.Float> pairAEQbTJ;
        YAxis axisLeft = lineChart.getAxisLeft();
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float chartPnl = ((Activity) it.next()).getChartPnl();
        while (it.hasNext()) {
            chartPnl = java.lang.Math.max(chartPnl, ((Activity) it.next()).getChartPnl());
        }
        java.util.Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float chartPnl2 = ((Activity) it2.next()).getChartPnl();
        while (it2.hasNext()) {
            chartPnl2 = java.lang.Math.min(chartPnl2, ((Activity) it2.next()).getChartPnl());
        }
        float fAbs = java.lang.Math.abs(chartPnl - chartPnl2) * 0.1f;
        float fFloatValue = 0.0f;
        if (chartPnl > 0.0f && chartPnl2 > 0.0f) {
            float f2 = chartPnl + fAbs;
            f = 0.0f;
            fFloatValue = f2;
        } else if (chartPnl >= 0.0f || chartPnl2 >= 0.0f) {
            fFloatValue = chartPnl + fAbs;
            f = chartPnl2 - fAbs;
        } else {
            f = chartPnl2 - fAbs;
        }
        if (C33129mqd.gEmmrt(java.lang.Float.valueOf(f), 0) && C33129mqd.AEQbTJ(java.lang.Float.valueOf(fFloatValue), 0)) {
            double dDivD$default = C33129mqd.divD$default(java.lang.Double.valueOf(C33129mqd.subD$default(java.lang.Float.valueOf(fFloatValue), java.lang.Float.valueOf(f), null, null, null, 14, null)), 4, null, null, null, 14, null);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(java.lang.Math.abs(f)))), java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(f), java.lang.Double.valueOf(dDivD$default), null, null, null, 14, null))), java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(f), java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), 2, null, null, null, 14, null)), null, null, null, 14, null))), java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(f), java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), 3, null, null, null, 14, null)), null, null, null, 14, null))), java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(f), java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), 4, null, null, null, 14, null)), null, null, null, 14, null))));
            int iIndexOf = arrayListCopydefault.indexOf(java.lang.Double.valueOf(CollectionsKt___CollectionsKt.giSNqX(arrayListCopydefault)));
            if (iIndexOf == 0 || iIndexOf == 1) {
                pairAEQbTJ = EZpvd.AEQbTJ(C33129mqd.divD$default(java.lang.Float.valueOf(fFloatValue), -3, null, null, null, 14, null), f, fFloatValue);
            } else if (iIndexOf == 2) {
                pairAEQbTJ = EZpvd.AEQbTJ(C33129mqd.divD$default(java.lang.Float.valueOf(fFloatValue), -1, null, null, null, 14, null), f, fFloatValue);
            } else if (iIndexOf == 3 || iIndexOf == 4) {
                pairAEQbTJ = EZpvd.AEQbTJ(C33129mqd.mulD$default(java.lang.Float.valueOf(fFloatValue), -3, null, null, null, 14, null), f, fFloatValue);
            } else {
                pairAEQbTJ = C56390yDp.OLrzqt(java.lang.Float.valueOf(f), java.lang.Float.valueOf(fFloatValue));
            }
            float fFloatValue2 = pairAEQbTJ.getFirst().floatValue();
            fFloatValue = pairAEQbTJ.getSecond().floatValue();
            f = fFloatValue2;
        }
        axisLeft.setAxisMaximum(fFloatValue);
        axisLeft.setAxisMinimum(f);
        axisLeft.setLabelCount(i, true);
        axisLeft.setValueFormatter(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.xvC$StateListAnimator */
    public static final class StateListAnimator extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return xMR.formatICUCompact$default(xMR.copydefault, C33129mqd.gEmmrt(java.lang.Float.valueOf(f)), null, C38307pTy.Companion.EZpvd(1), null, null, 26, null);
        }
    }

    public final kotlin.Pair<java.lang.Float, java.lang.Float> AEQbTJ(double d, float f, float f2) {
        float fDjBIcL;
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(d), java.lang.Float.valueOf(f))) {
            double dAddD$default = 1.5d;
            while (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(d), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null)), java.lang.Float.valueOf(f))) {
                dAddD$default = C33129mqd.addD$default(java.lang.Double.valueOf(dAddD$default), java.lang.Double.valueOf(0.2d), null, null, null, 14, null);
            }
            fDjBIcL = C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(d), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null)));
            f2 = C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Float.valueOf(f2), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null)));
        } else {
            fDjBIcL = C33129mqd.djBIcL(java.lang.Double.valueOf(d));
        }
        return C56390yDp.OLrzqt(java.lang.Float.valueOf(fDjBIcL), java.lang.Float.valueOf(f2));
    }

    public final void EZpvd(LineChart lineChart, java.util.List<? extends Activity> list, int i) {
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setLabelCount(i, true);
        xAxis.setValueFormatter(new ActionBar(list));
    }

    /* JADX INFO: renamed from: o.xvC$ActionBar */
    public static final class ActionBar extends ValueFormatter {
        public final /* synthetic */ java.util.List<Activity> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.xvC$Activity> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(java.util.List<? extends Activity> list) {
            this.AEQbTJ = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            Activity activity = (Activity) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, (int) f);
            return (activity == null || activity.getDateTime() == 0) ? "" : pTA.formatDate$default(new Date(activity.getDateTime()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    public final float copydefault(Entry entry, Entry entry2) {
        return entry.getX() - ((entry.getY() * (entry2.getX() - entry.getX())) / (entry2.getY() - entry.getY()));
    }

    public final java.util.List<LineDataSet> AEQbTJ(android.content.Context context, java.util.List<? extends Entry> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<? extends Entry> arrayList2 = new java.util.ArrayList<>();
        int size = list.size();
        int i = 0;
        while (i < size - 1) {
            Entry entry = list.get(i);
            i++;
            Entry entry2 = list.get(i);
            arrayList2.add(entry);
            if (entry.getY() * entry2.getY() < 0.0f) {
                Entry entry3 = new Entry(copydefault(entry, entry2), 0.0f);
                arrayList2.add(entry3);
                arrayList.add(OLrzqt(context, arrayList2));
                arrayList2 = yDY.AhwBna(entry3, entry2);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AubY(arrayList2), CollectionsKt___CollectionsKt.AubY(list))) {
                arrayList2.add(CollectionsKt___CollectionsKt.AubY(list));
            }
            arrayList.add(OLrzqt(context, arrayList2));
        }
        return arrayList;
    }

    public final LineDataSet OLrzqt(android.content.Context context, java.util.List<? extends Entry> list) {
        boolean z;
        LineDataSet lineDataSet = new LineDataSet(list, "");
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Entry) it.next()).getY() > 0.0f) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        C56030xvC c56030xvC = EZpvd;
        int iAEQbTJ = c56030xvC.AEQbTJ(context, z, 0.2f);
        lineDataSet.setColor(getThemeColor$default(c56030xvC, context, z, 0.0f, 4, null));
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillAlpha(90);
        lineDataSet.setFillDrawable(new GradientDrawable(z ? GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iAEQbTJ, c56030xvC.EZpvd(iAEQbTJ, 20), c56030xvC.EZpvd(iAEQbTJ, 10), c56030xvC.EZpvd(iAEQbTJ, 5), 0}));
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.enableDashedHighlightLine(C55298xhM.dp2px$default(5.0f, null, 1, null), C55298xhM.dp2px$default(2.0f, null, 1, null), 0.0f);
        lineDataSet.setHighlightLineWidth(C55298xhM.dp2px$default(0.2f, null, 1, null));
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        lineDataSet.setDrawHighlightIndicators(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        return lineDataSet;
    }

    public static /* synthetic */ int getThemeColor$default(C56030xvC c56030xvC, android.content.Context context, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return c56030xvC.AEQbTJ(context, z, f);
    }

    public final int AEQbTJ(android.content.Context context, boolean z, float f) {
        if (z) {
            return C33512mxp.AEQbTJ.zLjUOn(context, f);
        }
        return C33512mxp.AEQbTJ.isConnected(context, f);
    }

    public final int EZpvd(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public final java.util.List<Entry> AEQbTJ(java.util.List<? extends Activity> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Activity activity = (Activity) obj;
            arrayList.add(new Entry(i, activity.getChartPnl(), activity));
            i++;
        }
        return arrayList;
    }
}
