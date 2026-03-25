package o;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes23.dex */
public final class jKI extends BarChartRenderer {
    public Transformer OLrzqt;

    public jKI(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.OLrzqt = transformer;
        super.prepareBarHighlight(f, this.mChart.getYChartMax(), this.mChart.getYChartMin(), f4, transformer);
    }
}
