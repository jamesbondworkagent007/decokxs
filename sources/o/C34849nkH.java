package o;

import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.okinc.find_ui.data.ListType;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34849nkH {
    public static final C34849nkH EZpvd = new C34849nkH();

    private C34849nkH() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull PieChart pieChart) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pieChart, "");
        pieChart.setRotationEnabled(false);
        pieChart.setDrawEntryLabels(false);
        pieChart.setEntryLabelColor(ContextCompat.getColor(context, C52761wXj.Activity.DeEinT));
        pieChart.setEntryLabelTextSize(10.0f);
        pieChart.setDrawCenterText(false);
        pieChart.setUsePercentValues(false);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setExtraOffsets(0.0f, 10.0f, 0.0f, 2.0f);
        pieChart.setHoleColor(0);
        pieChart.getLegend().setForm(Legend.LegendForm.NONE);
        pieChart.setHoleRadius(65.0f);
        pieChart.setTransparentCircleRadius(65.0f);
        pieChart.getDescription().setEnabled(false);
        pieChart.getPaint(7).setTextSize(C55298xhM.EZpvd(16.0f, context));
    }

    public final PieData KWHzl(@NotNull android.content.Context context, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.Integer> arrayList2, @NotNull java.util.ArrayList<ListType> arrayList3, @NotNull PieChart pieChart) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(pieChart, "");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            arrayList4.add(new PieEntry(java.lang.Math.max(C33129mqd.djBIcL(str), 0.05f), new C34928nlh(arrayList3.get(i), null, pTB.KWHzl(pTB.OLrzqt((java.lang.Object) str), 2, RoundingMode.HALF_UP), false, 10, null)));
            i++;
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList4, "");
        pieDataSet.setDrawValues(true);
        pieDataSet.setColors(arrayList2);
        pieDataSet.setSliceSpace(1.0f);
        pieDataSet.setValueLinePart1OffsetPercentage(100.0f);
        pieDataSet.setValueLinePart1Length(0.7f);
        pieDataSet.setValueLinePart2Length(1.0f);
        PieDataSet.ValuePosition valuePosition = PieDataSet.ValuePosition.OUTSIDE_SLICE;
        pieDataSet.setYValuePosition(valuePosition);
        pieDataSet.setXValuePosition(valuePosition);
        pieDataSet.setValueTextSize(10.0f);
        pieDataSet.setValueLineColor(ContextCompat.getColor(context, C52761wXj.Activity.sZqaRl));
        pieDataSet.setValueTextColor(ContextCompat.getColor(context, C52761wXj.Activity.DeEinT));
        pieDataSet.setValueFormatter(new TaskDescription());
        return new PieData(pieDataSet);
    }

    /* JADX INFO: renamed from: o.nkH$TaskDescription */
    public static final class TaskDescription extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getPieLabel(float f, PieEntry pieEntry) {
            if (pieEntry == null) {
                return "";
            }
            java.lang.Object data = pieEntry.getData();
            Intrinsics.copydefault(data, "");
            return ((C34928nlh) data).OLrzqt();
        }
    }
}
