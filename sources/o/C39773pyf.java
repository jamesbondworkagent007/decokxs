package o;

import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39773pyf {
    public static final C39773pyf OLrzqt = new C39773pyf();

    private C39773pyf() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull PieChart pieChart) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pieChart, "");
        pieChart.setRotationEnabled(false);
        pieChart.setDrawEntryLabels(false);
        pieChart.setEntryLabelColor(ContextCompat.getColor(context, C52761wXj.Activity.DeEinT));
        pieChart.setEntryLabelTextSize(10.0f);
        pieChart.setDrawCenterText(false);
        pieChart.setUsePercentValues(true);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setExtraOffsets(0.0f, 10.0f, 0.0f, 2.0f);
        pieChart.setHoleColor(0);
        pieChart.getLegend().setForm(Legend.LegendForm.NONE);
        pieChart.setHoleRadius(65.0f);
        pieChart.setTransparentCircleRadius(65.0f);
        pieChart.getDescription().setEnabled(false);
        pieChart.setHighlightPerTapEnabled(true);
        pieChart.getPaint(7).setTextSize(C55298xhM.EZpvd(16.0f, context));
    }

    public final PieData KWHzl(@NotNull android.content.Context context, @NotNull java.util.List<C39708pxT> list, @NotNull PieChart pieChart) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pieChart, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C39708pxT c39708pxT = (C39708pxT) obj;
            arrayList.add(new PieEntry(C33129mqd.djBIcL(java.lang.Float.valueOf(c39708pxT.OLrzqt())), c39708pxT));
            i++;
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setDrawValues(true);
        pieDataSet.setHighlightEnabled(true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((C39708pxT) it.next()).KWHzl()));
        }
        pieDataSet.setColors(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2));
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
        pieDataSet.setValueFormatter(new StateListAnimator());
        return new PieData(pieDataSet);
    }

    /* JADX INFO: renamed from: o.pyf$StateListAnimator */
    public static final class StateListAnimator extends ValueFormatter {
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.String] */
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getPieLabel(float f, PieEntry pieEntry) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (pieEntry != null) {
                java.lang.Object data = pieEntry.getData();
                Intrinsics.copydefault(data, "");
                objectRef.element = ((C39708pxT) data).copydefault();
            }
            return (java.lang.String) objectRef.element;
        }
    }
}
