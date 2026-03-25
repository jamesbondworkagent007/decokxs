package o;

import com.github.mikephil.charting.charts.PieChart;

/* JADX INFO: renamed from: o.nks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C34886nks extends PieChart {
    public C34886nks(android.content.Context context) {
        super(context);
    }

    public C34886nks(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C34886nks(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.PieChart, com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new C34842nkA(this, this.mAnimator, this.mViewPortHandler);
    }
}
