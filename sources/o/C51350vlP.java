package o;

import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: renamed from: o.vlP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C51350vlP extends LineChartRenderer {
    public float[] AEQbTJ;
    public float[] AhwBna;
    public int[] EZpvd;
    public boolean KWHzl;
    public android.graphics.Paint OLrzqt;
    public java.util.HashMap<IDataSet, TaskDescription> copydefault;
    public float[] valueOf;

    public C51350vlP(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        this.valueOf = new float[4];
        this.copydefault = new java.util.HashMap<>();
        this.AEQbTJ = new float[2];
        this.mChart = lineDataProvider;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
        this.OLrzqt = new android.graphics.Paint();
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v23, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawLinear(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        int i = zIsDrawSteppedEnabled ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        android.graphics.Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i2 = i * 2;
            if (this.valueOf.length <= i2) {
                this.valueOf = new float[i * 4];
            }
            int i3 = this.mXBounds.min;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                if (i3 > xBounds.range + xBounds.min) {
                    break;
                }
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i3);
                if (entryForIndex != 0 && entryForIndex.getY() != 0.0f) {
                    this.valueOf[0] = entryForIndex.getX();
                    this.valueOf[1] = entryForIndex.getY() * phaseY;
                    if (i3 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3 + 1);
                        if (entryForIndex2 == 0 || entryForIndex2.getY() == 0.0f) {
                            break;
                        }
                        if (zIsDrawSteppedEnabled) {
                            this.valueOf[2] = entryForIndex2.getX();
                            float[] fArr = this.valueOf;
                            float f = fArr[1];
                            fArr[3] = f;
                            fArr[4] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = entryForIndex2.getX();
                            this.valueOf[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.valueOf[2] = entryForIndex2.getX();
                            this.valueOf[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.valueOf;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.valueOf);
                    if (!this.mViewPortHandler.isInBoundsRight(this.valueOf[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.valueOf[2]) && (this.mViewPortHandler.isInBoundsTop(this.valueOf[1]) || this.mViewPortHandler.isInBoundsBottom(this.valueOf[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i3));
                        canvas2.drawLines(this.valueOf, 0, i2, this.mRenderPaint);
                    }
                }
                i3++;
            }
        } else {
            int i4 = entryCount * i;
            if (this.valueOf.length < java.lang.Math.max(i4, i) * 2) {
                this.valueOf = new float[java.lang.Math.max(i4, i) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i5 = this.mXBounds.min;
                int i6 = 0;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    if (i5 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i5 == 0 ? 0 : i5 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i5);
                    if (entryForIndex3.getY() != 0.0f && entryForIndex4.getY() != 0.0f) {
                        this.valueOf[i6] = entryForIndex3.getX();
                        int i7 = i6 + 2;
                        this.valueOf[i6 + 1] = entryForIndex3.getY() * phaseY;
                        if (zIsDrawSteppedEnabled) {
                            this.valueOf[i7] = entryForIndex4.getX();
                            this.valueOf[i6 + 3] = entryForIndex3.getY() * phaseY;
                            this.valueOf[i6 + 4] = entryForIndex4.getX();
                            i7 = i6 + 6;
                            this.valueOf[i6 + 5] = entryForIndex3.getY() * phaseY;
                        }
                        this.valueOf[i7] = entryForIndex4.getX();
                        this.valueOf[i7 + 1] = entryForIndex4.getY() * phaseY;
                        i6 = i7 + 2;
                    }
                    i5++;
                }
                if (i6 > 0) {
                    transformer.pointValuesToPixel(this.valueOf);
                    int iMax = java.lang.Math.max((this.mXBounds.range + 1) * i, i);
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    if (this.KWHzl) {
                        this.mRenderPaint.setShader(new LinearGradient(0.0f, this.mViewPortHandler.getContentRect().top, 0.0f, this.mViewPortHandler.getContentRect().bottom, this.EZpvd, this.AhwBna, Shader.TileMode.CLAMP));
                    }
                    canvas2.drawLines(this.valueOf, 0, iMax * 2, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawCircles(android.graphics.Canvas canvas) {
        TaskDescription taskDescription;
        ?? entryForIndex;
        android.graphics.Bitmap bitmapCopydefault;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.AEQbTJ;
        char c = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c2 = 1;
        fArr[1] = 0.0f;
        java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
        int i = 0;
        while (i < dataSets.size()) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f) ? c : c2;
                boolean z2 = (z == 0 || iLineDataSet.getCircleHoleColor() != 1122867) ? c : c2;
                if (this.copydefault.containsKey(iLineDataSet)) {
                    taskDescription = this.copydefault.get(iLineDataSet);
                } else {
                    TaskDescription taskDescription2 = new TaskDescription();
                    this.copydefault.put(iLineDataSet, taskDescription2);
                    taskDescription = taskDescription2;
                }
                if (taskDescription.AEQbTJ(iLineDataSet)) {
                    taskDescription.AEQbTJ(iLineDataSet, z, z2);
                }
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                int i2 = xBounds.range;
                int i3 = xBounds.min;
                int i4 = i3;
                while (i4 <= i2 + i3 && (entryForIndex = iLineDataSet.getEntryForIndex(i4)) != 0) {
                    if (entryForIndex.getY() != f) {
                        this.AEQbTJ[c] = entryForIndex.getX();
                        this.AEQbTJ[c2] = entryForIndex.getY() * phaseY;
                        transformer.pointValuesToPixel(this.AEQbTJ);
                        if (!this.mViewPortHandler.isInBoundsRight(this.AEQbTJ[c])) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(this.AEQbTJ[c]) && this.mViewPortHandler.isInBoundsY(this.AEQbTJ[c2]) && (bitmapCopydefault = taskDescription.copydefault(i4)) != null) {
                            float[] fArr2 = this.AEQbTJ;
                            canvas.drawBitmap(bitmapCopydefault, fArr2[c] - circleRadius, fArr2[c2] - circleRadius, (android.graphics.Paint) null);
                        }
                    }
                    i4++;
                    c = 0;
                    f = 0.0f;
                    c2 = 1;
                }
            }
            i++;
            c = 0;
            f = 0.0f;
            c2 = 1;
        }
    }

    /* JADX INFO: renamed from: o.vlP$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public class TaskDescription {
        public android.graphics.Path EZpvd;
        public android.graphics.Bitmap[] KWHzl;

        public TaskDescription() {
            this.EZpvd = new android.graphics.Path();
        }

        public boolean AEQbTJ(ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            android.graphics.Bitmap[] bitmapArr = this.KWHzl;
            if (bitmapArr == null) {
                this.KWHzl = new android.graphics.Bitmap[circleColorCount];
            } else {
                if (bitmapArr.length == circleColorCount) {
                    return false;
                }
                this.KWHzl = new android.graphics.Bitmap[circleColorCount];
            }
            return true;
        }

        public void AEQbTJ(ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i = 0; i < circleColorCount; i++) {
                int i2 = (int) (((double) circleRadius) * 2.1d);
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                this.KWHzl[i] = bitmapCreateBitmap;
                C51350vlP.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i));
                if (z2) {
                    this.EZpvd.reset();
                    this.EZpvd.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.EZpvd.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.EZpvd, C51350vlP.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, C51350vlP.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, C51350vlP.this.mCirclePaintInner);
                    }
                }
            }
        }

        public android.graphics.Bitmap copydefault(int i) {
            android.graphics.Bitmap[] bitmapArr = this.KWHzl;
            return bitmapArr[i % bitmapArr.length];
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, Highlight[] highlightArr) {
        LineData lineData = this.mChart.getLineData();
        LineData lineDataAEQbTJ = AEQbTJ();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            ILineDataSet iLineDataSet2 = (ILineDataSet) lineDataAEQbTJ.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet2 != null && iLineDataSet2.isHighlightEnabled()) {
                Entry entryForXValue = iLineDataSet2.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet2)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet2.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iLineDataSet);
                }
            }
        }
    }

    public final LineData AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.mChart.getLineData().getDataSets().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((LineDataSet) ((ILineDataSet) it.next())).getValues());
        }
        return new LineData(new LineDataSet(arrayList, ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawHorizontalBezier(ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        this.cubicPath.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(xBounds.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i = this.mXBounds.min + 1;
            ?? r2 = entryForIndex;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                if (i > xBounds2.range + xBounds2.min) {
                    break;
                }
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i);
                float x = r2.getX() + ((entryForIndex2.getX() - r2.getX()) / 2.0f);
                android.graphics.Path path = this.cubicPath;
                float y = r2.getY();
                path.cubicTo(x, y * phaseY, x, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i++;
                r2 = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        if (this.KWHzl) {
            this.mRenderPaint.setShader(new LinearGradient(0.0f, this.mViewPortHandler.getContentRect().top, 0.0f, this.mViewPortHandler.getContentRect().bottom, this.EZpvd, this.AhwBna, Shader.TileMode.CLAMP));
        }
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }
}
