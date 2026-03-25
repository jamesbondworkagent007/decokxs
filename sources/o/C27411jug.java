package o;

import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27411jug {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.jug$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jug.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void KWHzl(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(barLineChartBase, "");
            barLineChartBase.setMinOffset(0.0f);
            barLineChartBase.setLogEnabled(false);
            XAxis xAxis = barLineChartBase.getXAxis();
            if (xAxis != null) {
                xAxis.setEnabled(false);
            }
            YAxis axisLeft = barLineChartBase.getAxisLeft();
            if (axisLeft != null) {
                axisLeft.setEnabled(false);
            }
            barLineChartBase.getAxisRight().setEnabled(false);
            YAxis axisRight = barLineChartBase.getAxisRight();
            if (axisRight != null) {
                axisRight.setDrawGridLines(false);
            }
            YAxis axisRight2 = barLineChartBase.getAxisRight();
            if (axisRight2 != null) {
                axisRight2.setDrawAxisLine(false);
            }
            barLineChartBase.setNoDataText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sElUiK));
            barLineChartBase.setNoDataTextColor(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
            barLineChartBase.setTouchEnabled(true);
            barLineChartBase.setDrawGridBackground(false);
            barLineChartBase.setScaleEnabled(false);
            barLineChartBase.setPinchZoom(false);
            Legend legend = barLineChartBase.getLegend();
            if (legend != null) {
                legend.setEnabled(false);
            }
            Description description = barLineChartBase.getDescription();
            if (description != null) {
                description.setEnabled(false);
            }
            barLineChartBase.setDragEnabled(true);
            barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
        }
    }
}
