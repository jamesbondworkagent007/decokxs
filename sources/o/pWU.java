package o;

import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pWU {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pWU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void OLrzqt(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(barLineChartBase, "");
            int color = ContextCompat.getColor(context, C52761wXj.Activity.zuBGHE);
            int color2 = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
            barLineChartBase.getDescription().setEnabled(false);
            barLineChartBase.setDrawGridBackground(false);
            barLineChartBase.setDragEnabled(true);
            barLineChartBase.setScaleEnabled(false);
            barLineChartBase.setPinchZoom(true);
            if (markerView != null) {
                barLineChartBase.setMarker(markerView);
                markerView.setChartView(barLineChartBase);
            }
            barLineChartBase.getLegend().setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
            barLineChartBase.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
            barLineChartBase.getLegend().setOrientation(Legend.LegendOrientation.HORIZONTAL);
            barLineChartBase.getLegend().setTextSize(12.0f);
            barLineChartBase.getLegend().setYOffset(10.0f);
            barLineChartBase.getLegend().setXOffset(-20.0f);
            barLineChartBase.getLegend().setWordWrapEnabled(true);
            barLineChartBase.getLegend().setFormSize(6.0f);
            barLineChartBase.getLegend().setXEntrySpace(10.0f);
            barLineChartBase.getLegend().setTextColor(context.getResources().getColor(C32113mPz.ActionBar.iwGUEr));
            barLineChartBase.getLegend().setForm(Legend.LegendForm.SQUARE);
            barLineChartBase.setExtraOffsets(0.0f, 0.0f, 0.0f, 10.0f);
            barLineChartBase.setLogEnabled(false);
            XAxis xAxis = barLineChartBase.getXAxis();
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setDrawGridLines(false);
            xAxis.setAxisLineColor(color);
            xAxis.setTextColor(color2);
            xAxis.setGranularity(1.0f);
            xAxis.setGranularityEnabled(true);
            xAxis.setAxisLineWidth(1.0f);
            C55051xce c55051xce = C55051xce.OLrzqt;
            xAxis.setTypeface(c55051xce.valueOf());
            YAxis axisLeft = barLineChartBase.getAxisLeft();
            axisLeft.setDrawGridLines(false);
            axisLeft.setAxisMinimum(0.0f);
            axisLeft.setDrawAxisLine(false);
            axisLeft.setTextColor(color2);
            axisLeft.setTypeface(c55051xce.valueOf());
            YAxis axisRight = barLineChartBase.getAxisRight();
            axisRight.setDrawGridLines(false);
            axisRight.setDrawAxisLine(false);
            axisRight.setAxisMinimum(0.0f);
            axisRight.setTextColor(color2);
            axisRight.setEnabled(false);
            axisRight.setTypeface(c55051xce.valueOf());
        }
    }
}
