package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.planet.widget.chart.MarkerSide;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46503tWt extends LineChartRenderer {
    public final boolean AEQbTJ;
    public final int EZpvd;
    public final LineChart KWHzl;
    public final int OLrzqt;
    public final ChartAnimator copydefault;
    public final ViewPortHandler djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46503tWt(@NotNull LineChart lineChart, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler, boolean z, int i, int i2) {
        super(lineChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.KWHzl = lineChart;
        this.copydefault = chartAnimator;
        this.djBIcL = viewPortHandler;
        this.AEQbTJ = z;
        this.OLrzqt = i;
        this.EZpvd = i2;
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        LineData lineData = this.KWHzl.getLineData();
        if (lineData == null) {
            return;
        }
        for (T t : lineData.getDataSets()) {
            if (t.isVisible() && t.isDrawFilledEnabled() && Intrinsics.EZpvd((java.lang.Object) t.getLabel(), (java.lang.Object) "KLine")) {
                Transformer transformer = this.KWHzl.getTransformer(t.getAxisDependency());
                this.mXBounds.set(this.KWHzl, t);
                Intrinsics.copydefault(transformer);
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                Intrinsics.checkNotNullExpressionValue(xBounds, "");
                KWHzl(canvas, t, transformer, xBounds);
            }
        }
        for (T t2 : lineData.getDataSets()) {
            if (t2.isVisible()) {
                if (this.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) t2.getLabel(), (java.lang.Object) "KLine")) {
                    this.mRenderPaint.setStrokeWidth(t2.getLineWidth());
                    copydefault(canvas, t2);
                } else if (Intrinsics.EZpvd((java.lang.Object) t2.getLabel(), (java.lang.Object) "KLine")) {
                    AEQbTJ(canvas, t2);
                }
            }
        }
        drawValues(canvas);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.drawExtras(canvas);
        LineData lineData = this.KWHzl.getLineData();
        if (lineData != null && lineData.getDataSetCount() > 0) {
            T dataSetByIndex = lineData.getDataSetByIndex(0);
            Intrinsics.checkNotNullExpressionValue(dataSetByIndex, "");
            KWHzl(canvas, (ILineDataSet) dataSetByIndex);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        Transformer transformer;
        int i;
        int i2;
        android.graphics.drawable.Drawable icon;
        C46503tWt c46503tWt = this;
        Transformer transformer2 = c46503tWt.KWHzl.getTransformer(iLineDataSet.getAxisDependency());
        int entryCount = iLineDataSet.getEntryCount();
        int i3 = 0;
        while (i3 < entryCount) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(i3);
            java.lang.Object data = entryForIndex.getData();
            C46487tWd c46487tWd = data instanceof C46487tWd ? (C46487tWd) data : null;
            if (c46487tWd != null && (icon = entryForIndex.getIcon()) != null) {
                MPPointD pixelForValues = transformer2.getPixelForValues(entryForIndex.getX(), entryForIndex.getY() * c46503tWt.copydefault.getPhaseY());
                if (c46503tWt.djBIcL.isInBounds(C33129mqd.djBIcL(java.lang.Double.valueOf(pixelForValues.x)), C33129mqd.djBIcL(java.lang.Double.valueOf(pixelForValues.y)))) {
                    float intrinsicWidth = icon.getIntrinsicWidth() / 2.0f;
                    float intrinsicHeight = icon.getIntrinsicHeight() / 2.0f;
                    boolean z = c46487tWd.EZpvd() == MarkerSide.BUY;
                    float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(7.6f, null, 1, null);
                    float f = z ? 1 : -1;
                    double d = pixelForValues.x;
                    double d2 = intrinsicWidth;
                    i2 = i3;
                    double d3 = pixelForValues.y;
                    double d4 = intrinsicHeight;
                    transformer = transformer2;
                    double d5 = fDp2pxFloat$default * f;
                    i = entryCount;
                    icon.setBounds((int) (d - d2), (int) ((d3 - d4) + d5), (int) (d + d2), (int) (d3 + d4 + d5));
                    icon.draw(canvas);
                } else {
                    transformer = transformer2;
                    i = entryCount;
                    i2 = i3;
                }
            }
            i3 = i2 + 1;
            c46503tWt = this;
            entryCount = i;
            transformer2 = transformer;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final void copydefault(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        ?? entryForIndex;
        int i;
        Transformer transformer = this.KWHzl.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.copydefault.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        canvas.save();
        canvas.clipRect(this.KWHzl.getViewPortHandler().getContentRect());
        this.mXBounds.set(this.KWHzl, iLineDataSet);
        java.util.ArrayList<float[]> arrayList = new java.util.ArrayList();
        java.util.ArrayList<float[]> arrayList2 = new java.util.ArrayList();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        int i2 = xBounds.min;
        int i3 = i2;
        for (int i4 = xBounds.range; i3 < i4 + i2 && i3 < iLineDataSet.getEntryCount() - 1; i4 = i) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3);
            if (entryForIndex2 == 0 || (entryForIndex = iLineDataSet.getEntryForIndex(i3 + 1)) == 0) {
                i = i4;
            } else if ((entryForIndex2.getY() >= 0.0f && entryForIndex.getY() < 0.0f) || (entryForIndex2.getY() < 0.0f && entryForIndex.getY() >= 0.0f)) {
                float x = entryForIndex2.getX() + ((entryForIndex2.getY() / (entryForIndex2.getY() - entryForIndex.getY())) * (entryForIndex.getX() - entryForIndex2.getX()));
                if (entryForIndex2.getY() >= 0.0f) {
                    arrayList.add(new float[]{entryForIndex2.getX(), entryForIndex2.getY() * phaseY, x, 0.0f});
                    i = i4;
                } else {
                    i = i4;
                    arrayList2.add(new float[]{entryForIndex2.getX(), entryForIndex2.getY() * phaseY, x, 0.0f});
                }
                if (entryForIndex.getY() >= 0.0f) {
                    arrayList.add(new float[]{x, 0.0f, entryForIndex.getX(), entryForIndex.getY() * phaseY});
                } else {
                    arrayList2.add(new float[]{x, 0.0f, entryForIndex.getX(), entryForIndex.getY() * phaseY});
                }
            } else {
                i = i4;
                float[] fArr = {entryForIndex2.getX(), entryForIndex2.getY() * phaseY, entryForIndex.getX(), entryForIndex.getY() * phaseY};
                if (entryForIndex2.getY() >= 0.0f && entryForIndex.getY() >= 0.0f) {
                    arrayList.add(fArr);
                } else {
                    arrayList2.add(fArr);
                }
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            this.mRenderPaint.setColor(this.OLrzqt);
            for (float[] fArr2 : arrayList) {
                transformer.pointValuesToPixel(fArr2);
                copydefault(canvas, iLineDataSet, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.mRenderPaint.setColor(this.EZpvd);
            for (float[] fArr3 : arrayList2) {
                transformer.pointValuesToPixel(fArr3);
                copydefault(canvas, iLineDataSet, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
            }
        }
        canvas.restore();
        this.mRenderPaint.setPathEffect(null);
    }

    public final void copydefault(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, float f, float f2, float f3, float f4) {
        float cubicIntensity = (f3 - f) * iLineDataSet.getCubicIntensity();
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, f2);
        path.cubicTo(f + cubicIntensity, f2, f3 - cubicIntensity, f4, f3, f4);
        canvas.drawPath(path, this.mRenderPaint);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final void AEQbTJ(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        ?? entryForIndex;
        Transformer transformer = this.KWHzl.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.copydefault.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        canvas.save();
        canvas.clipRect(this.KWHzl.getViewPortHandler().getContentRect());
        this.mXBounds.set(this.KWHzl, iLineDataSet);
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        int i = xBounds.min;
        int i2 = xBounds.range;
        for (int i3 = i; i3 < i + i2 && i3 < iLineDataSet.getEntryCount() - 1; i3++) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3);
            if (entryForIndex2 != 0 && (entryForIndex = iLineDataSet.getEntryForIndex(i3 + 1)) != 0) {
                float[] fArr = {entryForIndex2.getX(), entryForIndex2.getY() * phaseY, entryForIndex.getX(), entryForIndex.getY() * phaseY};
                transformer.pointValuesToPixel(fArr);
                copydefault(canvas, iLineDataSet, fArr[0], fArr[1], fArr[2], fArr[3]);
            }
        }
        canvas.restore();
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void KWHzl(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        android.graphics.drawable.Drawable drawable;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        ?? r9;
        android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable == null) {
            return;
        }
        float phaseY = this.copydefault.getPhaseY();
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        if (xBounds.range <= 0) {
            return;
        }
        android.graphics.Path path = new android.graphics.Path();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(xBounds.min);
        if (entryForIndex == 0) {
            return;
        }
        IFillFormatter fillFormatter = iLineDataSet.getFillFormatter();
        float fillLinePosition = (fillFormatter != null ? fillFormatter.getFillLinePosition(iLineDataSet, this.KWHzl) : this.KWHzl.getAxisLeft().getAxisMinimum()) * phaseY;
        MPPointD pixelForValues = transformer.getPixelForValues(entryForIndex.getX(), fillLinePosition);
        path.moveTo((float) pixelForValues.x, (float) pixelForValues.y);
        MPPointD pixelForValues2 = transformer.getPixelForValues(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        path.lineTo((float) pixelForValues2.x, (float) pixelForValues2.y);
        int i3 = xBounds.min;
        int i4 = i3 + 1;
        int i5 = i3 + xBounds.range;
        if (i4 <= i5) {
            int i6 = i4;
            ?? r92 = entryForIndex;
            while (i6 < iLineDataSet.getEntryCount()) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i6);
                if (entryForIndex2 == 0) {
                    drawable = fillDrawable;
                    f2 = phaseY;
                    f3 = cubicIntensity;
                    i = i6;
                    i2 = i5;
                    f = fillLinePosition;
                    r9 = r92;
                } else {
                    MPPointD pixelForValues3 = transformer.getPixelForValues(r92.getX(), r92.getY() * phaseY);
                    MPPointD pixelForValues4 = transformer.getPixelForValues(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                    double d = pixelForValues3.x;
                    int i7 = i6;
                    double d2 = pixelForValues4.x;
                    drawable = fillDrawable;
                    f2 = phaseY;
                    double d3 = (d2 - d) * ((double) cubicIntensity);
                    f3 = cubicIntensity;
                    float f4 = (float) pixelForValues4.y;
                    i = i7;
                    i2 = i5;
                    f = fillLinePosition;
                    path.cubicTo((float) (d + d3), (float) pixelForValues3.y, (float) (d2 - d3), f4, (float) d2, f4);
                    r9 = entryForIndex2;
                }
                if (i == i2) {
                    break;
                }
                i6 = i + 1;
                fillLinePosition = f;
                i5 = i2;
                fillDrawable = drawable;
                phaseY = f2;
                cubicIntensity = f3;
                r92 = r9;
            }
            drawable = fillDrawable;
            f = fillLinePosition;
        } else {
            drawable = fillDrawable;
            f = fillLinePosition;
        }
        ?? entryForIndex3 = iLineDataSet.getEntryForIndex(java.lang.Math.min(xBounds.min + xBounds.range, iLineDataSet.getEntryCount() - 1));
        if (entryForIndex3 == 0) {
            return;
        }
        MPPointD pixelForValues5 = transformer.getPixelForValues(entryForIndex3.getX(), f);
        path.lineTo((float) pixelForValues5.x, (float) pixelForValues5.y);
        path.close();
        canvas.save();
        canvas.clipPath(path);
        RectF contentRect = this.djBIcL.getContentRect();
        android.graphics.drawable.Drawable drawable2 = drawable;
        drawable2.setBounds((int) contentRect.left, (int) contentRect.top, (int) contentRect.right, (int) contentRect.bottom);
        drawable2.draw(canvas);
        canvas.restore();
    }
}
