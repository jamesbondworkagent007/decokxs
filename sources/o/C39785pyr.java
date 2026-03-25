package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39785pyr extends LineChartRenderer {
    public final float AEQbTJ;
    public final float AYXKKw;
    public final android.graphics.Paint AhwBna;
    public float DbNXlk;
    public final android.graphics.Paint EZpvd;
    public final android.graphics.Paint KWHzl;
    public final LineChart OLrzqt;
    public final ChartAnimator copydefault;
    public final android.graphics.Paint djBIcL;
    public final float gEmmrt;
    public final java.lang.String isConnected;
    public final android.graphics.Paint valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39785pyr(@NotNull LineChart lineChart, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(lineChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.OLrzqt = lineChart;
        this.copydefault = chartAnimator;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.RcXXUw));
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        paint2.setStyle(Paint.Style.FILL);
        this.EZpvd = paint2;
        this.AYXKKw = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.gEmmrt = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        this.isConnected = C33070mpX.AYXKKw(C35964oKf.Fragment.fraLem);
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        paint3.setTextSize(C55298xhM.dp2pxFloat$default(10.0f, null, 1, null));
        this.djBIcL = paint3;
        this.DbNXlk = 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.QVAiDq));
        paint4.setStrokeWidth(2.0f);
        paint4.setStyle(style);
        paint4.setPathEffect(new DashPathEffect(new float[]{C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)}, 0.0f));
        this.AhwBna = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setColor(C33070mpX.copydefault(C35964oKf.TaskDescription.copydefault));
        this.valueOf = paint5;
        android.graphics.Paint paint6 = this.mValuePaint;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint6.setTypeface(c55051xce.valueOf());
        this.mRenderPaint.setTypeface(c55051xce.valueOf());
        this.mDrawPaint.setTypeface(c55051xce.valueOf());
    }

    public final void AEQbTJ(float f) {
        this.DbNXlk = f;
        this.OLrzqt.invalidate();
    }

    public final float AEQbTJ() {
        return C56548yJl.KWHzl(this.DbNXlk, 0.0f, 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(@NotNull android.graphics.Canvas canvas) {
        MPPointD pixelForValues;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.drawExtras(canvas);
        if (this.copydefault.getPhaseX() < 1.0f || this.copydefault.getPhaseY() < 1.0f) {
            return;
        }
        float fContentLeft = this.mViewPortHandler.contentLeft() + (AEQbTJ() * this.mViewPortHandler.contentWidth());
        float f = 2;
        canvas.drawRect(fContentLeft, this.mViewPortHandler.contentTop() + (this.AYXKKw * f), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.valueOf);
        Highlight[] highlighted = this.OLrzqt.getHighlighted();
        Highlight highlight = highlighted != null ? (Highlight) yDV.zsXlph(highlighted) : null;
        if (highlight == null) {
            canvas.drawLine(fContentLeft, this.gEmmrt + this.mViewPortHandler.contentTop() + this.AYXKKw, fContentLeft, this.mViewPortHandler.contentBottom(), this.AhwBna);
            float fMeasureText = this.djBIcL.measureText(this.isConnected);
            canvas.drawText(this.isConnected, java.lang.Math.min(java.lang.Math.max(0.0f, fContentLeft - (fMeasureText / f)), this.mViewPortHandler.contentRight() - fMeasureText), (this.mViewPortHandler.contentTop() + this.AYXKKw) - this.gEmmrt, this.djBIcL);
            return;
        }
        java.util.Collection dataSets = ((LineData) this.OLrzqt.getData()).getDataSets();
        Intrinsics.checkNotNullExpressionValue(dataSets, "");
        java.util.ArrayList<java.util.List> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(dataSets, 10));
        java.util.Iterator it = dataSets.iterator();
        while (it.hasNext()) {
            arrayList.add(((ILineDataSet) it.next()).getEntriesForXValue(highlight.getX()));
        }
        LineChart lineChart = this.OLrzqt;
        if (!(lineChart instanceof LineChart)) {
            lineChart = null;
        }
        Transformer transformer = lineChart != null ? lineChart.getTransformer(YAxis.AxisDependency.LEFT) : null;
        float drawX = highlight.getDrawX();
        if (drawX > -1.0f) {
            canvas.drawLine(drawX, this.gEmmrt + this.mViewPortHandler.contentTop() + this.AYXKKw, drawX, this.mViewPortHandler.contentBottom(), this.AhwBna);
            java.lang.String formattedValue = this.OLrzqt.getXAxis().getValueFormatter().getFormattedValue(highlight.getX());
            float fMeasureText2 = this.djBIcL.measureText(formattedValue);
            canvas.drawText(formattedValue, java.lang.Math.min(java.lang.Math.max(0.0f, drawX - (fMeasureText2 / f)), this.mViewPortHandler.contentRight() - fMeasureText2), (this.mViewPortHandler.contentTop() + this.AYXKKw) - this.gEmmrt, this.djBIcL);
        }
        for (java.util.List<Entry> list : arrayList) {
            Intrinsics.copydefault(list);
            for (Entry entry : list) {
                if (transformer != null && (pixelForValues = transformer.getPixelForValues(entry.getX(), entry.getY())) != null) {
                    float f2 = (float) pixelForValues.x;
                    float f3 = (float) pixelForValues.y;
                    android.graphics.Paint paint = this.EZpvd;
                    java.lang.Object data = entry.getData();
                    C39709pxU c39709pxU = data instanceof C39709pxU ? (C39709pxU) data : null;
                    paint.setColor(c39709pxU != null ? c39709pxU.EZpvd() : ViewCompat.MEASURED_STATE_MASK);
                    canvas.drawCircle(f2, f3, this.AEQbTJ, this.EZpvd);
                    canvas.drawCircle(f2, f3, this.AEQbTJ, this.KWHzl);
                }
            }
        }
    }
}
