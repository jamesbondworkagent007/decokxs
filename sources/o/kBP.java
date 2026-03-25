package o;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kBP extends CombinedChartRenderer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kBP(@NotNull CombinedChart combinedChart, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(combinedChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(combinedChart, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        java.util.List<DataRenderer> list = this.mRenderers;
        Intrinsics.checkNotNullExpressionValue(list, "");
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (((DataRenderer) obj) instanceof BarChartRenderer) {
                this.mRenderers.set(i, new kBQ(combinedChart, chartAnimator, viewPortHandler));
            }
            i++;
        }
    }
}
