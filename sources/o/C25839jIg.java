package o;

import android.graphics.Paint;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25839jIg extends LineChartRenderer {
    public C25833jIa AEQbTJ;
    public C25833jIa EZpvd;
    public final android.graphics.Paint KWHzl;
    public final float OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C25833jIa c25833jIa, C25833jIa c25833jIa2) {
        this.EZpvd = c25833jIa;
        this.AEQbTJ = c25833jIa2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25839jIg(@NotNull LineChart lineChart, int i) {
        super(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler());
        Intrinsics.checkNotNullParameter(lineChart, "");
        this.copydefault = i;
        this.OLrzqt = C55298xhM.dp2pxFloat$default(12.0f, null, 1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(i);
        paint.setTextSize(C55298xhM.dp2pxFloat$default(10.0f, null, 1, null));
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.KWHzl = paint;
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        super.drawValues(canvas);
        C25833jIa c25833jIa = this.EZpvd;
        if (c25833jIa != null) {
            KWHzl(canvas, c25833jIa, true);
        }
        C25833jIa c25833jIa2 = this.AEQbTJ;
        if (c25833jIa2 != null) {
            KWHzl(canvas, c25833jIa2, false);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, C25833jIa c25833jIa, boolean z) {
        java.util.List<T> dataSets;
        LineData lineData = this.mChart.getLineData();
        if (lineData == null || (dataSets = lineData.getDataSets()) == 0 || dataSets.isEmpty()) {
            return;
        }
        ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(0);
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        int iAEQbTJ = (int) c25833jIa.AEQbTJ();
        if (iAEQbTJ < 0 || iAEQbTJ >= iLineDataSet.getEntryCount()) {
            return;
        }
        float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), iAEQbTJ, iAEQbTJ);
        if (fArrGenerateTransformedValuesLine.length < 2) {
            return;
        }
        float f = fArrGenerateTransformedValuesLine[0];
        float f2 = fArrGenerateTransformedValuesLine[1];
        if (this.mViewPortHandler.isInBounds(f, f2)) {
            this.KWHzl.setColor(this.copydefault);
            java.lang.String strCopydefault = c25833jIa.copydefault();
            android.graphics.Rect rect = new android.graphics.Rect();
            this.KWHzl.getTextBounds(strCopydefault, 0, strCopydefault.length(), rect);
            float fAEQbTJ = AEQbTJ(f, rect);
            float fHeight = z ? f2 - this.OLrzqt : f2 + this.OLrzqt + rect.height();
            if (canvas != null) {
                canvas.drawText(strCopydefault, fAEQbTJ, fHeight, this.KWHzl);
            }
        }
    }

    public final float AEQbTJ(float f, android.graphics.Rect rect) {
        float fContentLeft = this.mViewPortHandler.contentLeft();
        float fContentRight = this.mViewPortHandler.contentRight();
        float fWidth = rect.width() / 2.0f;
        return f - fWidth < fContentLeft ? fContentLeft + fWidth : f + fWidth > fContentRight ? fContentRight - fWidth : f;
    }
}
