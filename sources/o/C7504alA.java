package o;

import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.alA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7504alA extends BarChartRenderer {
    public android.graphics.Paint AEQbTJ;
    public final RectF AhwBna;
    public int EZpvd;
    public android.graphics.Path KWHzl;
    public float OLrzqt;
    public RectF copydefault;
    public float djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7504alA(@NotNull BarDataProvider barDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(barDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.AhwBna = new RectF();
        this.EZpvd = 15;
        this.djBIcL = 1.0f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(android.graphics.Canvas canvas, IBarDataSet iBarDataSet, int i) {
        if (canvas == null || iBarDataSet == null) {
            return;
        }
        if (iBarDataSet instanceof C7505alB) {
            C7505alB c7505alB = (C7505alB) iBarDataSet;
            this.OLrzqt = c7505alB.AEQbTJ();
            this.EZpvd = c7505alB.OLrzqt();
        }
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = (int) java.lang.Math.min((int) java.lang.Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i2 = 0; i2 < iMin; i2++) {
                T entryForIndex = iBarDataSet.getEntryForIndex(i2);
                Intrinsics.copydefault(entryForIndex, "");
                float x = ((BarEntry) entryForIndex).getX();
                RectF rectF = this.AhwBna;
                rectF.left = x - barWidth;
                rectF.right = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.AhwBna.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.AhwBna.left)) {
                        break;
                    }
                    this.AhwBna.top = this.mViewPortHandler.contentTop();
                    this.AhwBna.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.AhwBna, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z2 = iBarDataSet.getColors().size() == 1;
        if (z2) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i3 = 0; i3 < barBuffer.size(); i3 += 4) {
            int i4 = i3 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i4])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    return;
                }
                if (!z2) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    com.github.mikephil.charting.model.GradientColor gradientColor = iBarDataSet.getGradientColor();
                    android.graphics.Paint paint = this.mRenderPaint;
                    float[] fArr = barBuffer.buffer;
                    float f = fArr[i3];
                    paint.setShader(new LinearGradient(f, fArr[i3 + 3], f, fArr[i3 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                }
                if (iBarDataSet.getGradientColors() != null) {
                    android.graphics.Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = barBuffer.buffer;
                    float f2 = fArr2[i3];
                    float f3 = fArr2[i3 + 3];
                    float f4 = fArr2[i3 + 1];
                    int i5 = i3 / 4;
                    paint2.setShader(new LinearGradient(f2, f3, f2, f4, iBarDataSet.getGradientColor(i5).getStartColor(), iBarDataSet.getGradientColor(i5).getEndColor(), Shader.TileMode.MIRROR));
                }
                if (this.KWHzl == null) {
                    this.KWHzl = new android.graphics.Path();
                }
                android.graphics.Path path = this.KWHzl;
                if (path != null) {
                    path.reset();
                }
                android.graphics.Path path2 = this.KWHzl;
                if (path2 != null) {
                    float[] fArr3 = barBuffer.buffer;
                    path2.addRoundRect(new RectF(fArr3[i3], fArr3[i3 + 1], fArr3[i4], fArr3[i3 + 3]), KWHzl(this.EZpvd, this.OLrzqt), Path.Direction.CW);
                }
                android.graphics.Path path3 = this.KWHzl;
                Intrinsics.copydefault(path3);
                canvas.drawPath(path3, this.mRenderPaint);
                if (z) {
                    android.graphics.Path path4 = this.KWHzl;
                    Intrinsics.copydefault(path4);
                    canvas.drawPath(path4, this.mBarBorderPaint);
                }
            }
        }
    }

    public final float[] KWHzl(int i, float f) {
        float[] fArr = new float[8];
        if ((i & 15) == 15 || i == 0) {
            fArr[5] = f;
            Unit unit = Unit.INSTANCE;
            fArr[4] = f;
            fArr[7] = f;
            fArr[6] = f;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            fArr[0] = f;
        } else {
            if ((i & 1) == 1) {
                fArr[1] = f;
                Unit unit2 = Unit.INSTANCE;
                fArr[0] = f;
            }
            if ((i & 2) == 2) {
                fArr[3] = f;
                Unit unit3 = Unit.INSTANCE;
                fArr[2] = f;
            }
            if ((i & 4) == 4) {
                fArr[7] = f;
                Unit unit4 = Unit.INSTANCE;
                fArr[6] = f;
            }
            if ((i & 8) == 8) {
                fArr[5] = f;
                Unit unit5 = Unit.INSTANCE;
                fArr[4] = f;
            }
        }
        return fArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, Highlight[] highlightArr) {
        float y;
        float f;
        BarData barData = this.mChart.getBarData();
        if (highlightArr == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                T entryForXValue = iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                Intrinsics.copydefault(entryForXValue, "");
                BarEntry barEntry = (BarEntry) entryForXValue;
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() >= 0 && barEntry.isStacked()) {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            float positiveSum = barEntry.getPositiveSum();
                            f = -barEntry.getNegativeSum();
                            y = positiveSum;
                        } else {
                            com.github.mikephil.charting.highlight.Range range = barEntry.getRanges()[highlight.getStackIndex()];
                            y = range.from;
                            f = range.to;
                        }
                    } else {
                        y = barEntry.getY();
                        f = 0.0f;
                    }
                    prepareBarHighlight(barEntry.getX(), y, f, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    Intrinsics.copydefault(canvas);
                    android.graphics.Path path = this.KWHzl;
                    Intrinsics.copydefault(path);
                    canvas.drawPath(path, this.mHighlightPaint);
                    if (iBarDataSet instanceof C7505alB) {
                        C7505alB c7505alB = (C7505alB) iBarDataSet;
                        if (c7505alB.KWHzl() > 0.0f) {
                            if (this.copydefault == null) {
                                this.copydefault = new RectF();
                            }
                            RectF rectF = this.copydefault;
                            if (rectF != null) {
                                RectF rectF2 = this.mBarRect;
                                float f2 = rectF2.left;
                                float f3 = 2;
                                float f4 = (rectF2.right - f2) / f3;
                                float f5 = this.djBIcL;
                                float f6 = (f2 + f4) - (f5 / f3);
                                rectF.left = f6;
                                rectF.right = f6 + f5;
                                rectF.top = 0.0f;
                                rectF.bottom = this.mChart.getHeight();
                                if (this.AEQbTJ == null) {
                                    android.graphics.Paint paint = new android.graphics.Paint();
                                    this.AEQbTJ = paint;
                                    paint.setAntiAlias(true);
                                    android.graphics.Paint paint2 = this.AEQbTJ;
                                    if (paint2 != null) {
                                        paint2.setColor(c7505alB.EZpvd());
                                    }
                                }
                                android.graphics.Paint paint3 = this.AEQbTJ;
                                if (paint3 != null) {
                                    canvas.drawRect(rectF, paint3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
