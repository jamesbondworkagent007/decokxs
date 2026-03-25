package o;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: renamed from: o.vsX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C51729vsX extends LineChartRenderer {
    public android.graphics.Path KWHzl;
    public float[] OLrzqt;

    public C51729vsX(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        this.KWHzl = new android.graphics.Path();
        this.OLrzqt = new float[4];
    }

    @Override // com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer
    public void drawHighlightLines(android.graphics.Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        this.mHighlightPaint.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled()) {
            this.KWHzl.reset();
            this.KWHzl.moveTo(f, 0.0f);
            this.KWHzl.lineTo(f, this.mViewPortHandler.getChartHeight());
            canvas.drawPath(this.KWHzl, this.mHighlightPaint);
        }
        if (iLineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()) {
            this.KWHzl.reset();
            this.KWHzl.moveTo(this.mViewPortHandler.contentLeft(), f2);
            this.KWHzl.lineTo(this.mViewPortHandler.contentRight(), f2);
            canvas.drawPath(this.KWHzl, this.mHighlightPaint);
        }
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v27, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawLinear(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        int entryCount = iLineDataSet.getEntryCount();
        int i = 0;
        boolean z = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        int i2 = z ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        android.graphics.Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i3 = i2 * 2;
            if (this.OLrzqt.length <= i3) {
                this.OLrzqt = new float[i2 * 4];
            }
            int i4 = this.mXBounds.min;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                if (i4 > xBounds.range + xBounds.min) {
                    break;
                }
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i4);
                if (entryForIndex != 0) {
                    this.OLrzqt[0] = entryForIndex.getX();
                    this.OLrzqt[1] = entryForIndex.getY() * phaseY;
                    if (i4 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i4 + 1);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        if (z) {
                            this.OLrzqt[2] = entryForIndex2.getX();
                            float[] fArr = this.OLrzqt;
                            float f = fArr[1];
                            fArr[3] = f;
                            fArr[4] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = entryForIndex2.getX();
                            this.OLrzqt[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.OLrzqt[2] = entryForIndex2.getX();
                            this.OLrzqt[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.OLrzqt;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.OLrzqt);
                    if (!this.mViewPortHandler.isInBoundsRight(this.OLrzqt[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.OLrzqt[2]) && (this.mViewPortHandler.isInBoundsTop(this.OLrzqt[1]) || this.mViewPortHandler.isInBoundsBottom(this.OLrzqt[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i4));
                        canvas2.drawLines(this.OLrzqt, 0, i3, this.mRenderPaint);
                    }
                }
                i4++;
            }
        } else {
            int i5 = entryCount * i2;
            if (this.OLrzqt.length < java.lang.Math.max(i5, i2) * 2) {
                this.OLrzqt = new float[java.lang.Math.max(i5, i2) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i6 = this.mXBounds.min;
                int i7 = 0;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    if (i6 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i6 == 0 ? i : i6 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i6);
                    if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                        this.OLrzqt[i7] = entryForIndex3.getX();
                        int i8 = i7 + 2;
                        this.OLrzqt[i7 + 1] = entryForIndex3.getY() * phaseY;
                        if (z) {
                            this.OLrzqt[i8] = entryForIndex4.getX();
                            this.OLrzqt[i7 + 3] = entryForIndex3.getY() * phaseY;
                            this.OLrzqt[i7 + 4] = entryForIndex4.getX();
                            i8 = i7 + 6;
                            this.OLrzqt[i7 + 5] = entryForIndex3.getY() * phaseY;
                        }
                        this.OLrzqt[i8] = entryForIndex4.getX();
                        this.OLrzqt[i8 + 1] = entryForIndex4.getY() * phaseY;
                        i7 = i8 + 2;
                    }
                    i6++;
                    i = 0;
                }
                if (i7 > 0) {
                    transformer.pointValuesToPixel(this.OLrzqt);
                    int iMax = java.lang.Math.max((this.mXBounds.range + 1) * i2, i2) * 2;
                    for (int i9 = 3; i9 < iMax; i9 += 4) {
                        try {
                            if (this.OLrzqt[i9] < this.mViewPortHandler.offsetTop()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("drawLinear large: before index1=");
                                sb.append(i9);
                                sb.append(";value1=");
                                sb.append(this.OLrzqt[i9]);
                                sb.append(";index2=");
                                int i10 = i9 + 2;
                                sb.append(i10);
                                sb.append(";value2=");
                                sb.append(this.OLrzqt[i10]);
                                sb.append(";offerTop=");
                                sb.append(this.mViewPortHandler.offsetTop());
                                pUU.EZpvd("HomeAssetsChartRender", sb.toString());
                                this.OLrzqt[i9] = this.mViewPortHandler.offsetTop();
                                this.OLrzqt[i10] = this.mViewPortHandler.offsetTop();
                                if (i9 == 3) {
                                    this.OLrzqt[1] = this.mViewPortHandler.offsetTop();
                                }
                            } else if (this.OLrzqt[i9] > this.mViewPortHandler.contentBottom()) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append("drawLinear small: before index1=");
                                sb2.append(i9);
                                sb2.append(";value1=");
                                sb2.append(this.OLrzqt[i9]);
                                sb2.append(";index2=");
                                int i11 = i9 + 2;
                                sb2.append(i11);
                                sb2.append(";value2=");
                                sb2.append(this.OLrzqt[i11]);
                                sb2.append(";contentBottom=");
                                sb2.append(this.mViewPortHandler.contentBottom());
                                pUU.EZpvd("HomeAssetsChartRender", sb2.toString());
                                this.OLrzqt[i9] = this.mViewPortHandler.contentBottom();
                                this.OLrzqt[i11] = this.mViewPortHandler.contentBottom();
                                if (i9 == 3) {
                                    this.OLrzqt[1] = this.mViewPortHandler.contentBottom();
                                }
                            }
                        } catch (java.lang.Exception e) {
                            pUU.copydefault("HomeAssetsChartRender", "drawLinear: error=" + e.getMessage());
                        }
                    }
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    canvas2.drawLines(this.OLrzqt, 0, iMax, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }
}
