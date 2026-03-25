package o;

import android.graphics.DashPathEffect;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34847nkF {
    public static final C34847nkF EZpvd = new C34847nkF();

    private C34847nkF() {
    }

    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void EZpvd(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(barLineChartBase, "");
        int color = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        barLineChartBase.getDescription().setEnabled(false);
        barLineChartBase.setDrawGridBackground(false);
        barLineChartBase.setDragEnabled(true);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setPinchZoom(true);
        if (markerView != null) {
            markerView.setChartView(barLineChartBase);
            barLineChartBase.setMarker(markerView);
        }
        barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
        barLineChartBase.setLogEnabled(false);
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisLineColor(color);
        xAxis.setTextColor(color);
        xAxis.setGranularity(1.0f);
        xAxis.setGranularityEnabled(true);
        xAxis.setAxisLineWidth(0.5f);
        xAxis.setAxisLineDashedLine(new DashPathEffect(new float[]{20.0f, 10.0f}, 0.0f));
        YAxis axisLeft = barLineChartBase.getAxisLeft();
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setTextColor(color);
        YAxis axisRight = barLineChartBase.getAxisRight();
        axisRight.setDrawGridLines(false);
        axisRight.setDrawAxisLine(false);
        axisRight.setTextColor(color);
        axisRight.setEnabled(false);
    }
}
