package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    public PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer;
    protected RectF mDrawHighlightedRectF;
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;
    public Paint mValueLinePaint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mDrawCenterTextPathBuffer = new Path();
        this.mDrawHighlightedRectF = new RectF();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        Paint paint2 = this.mHolePaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mTransparentCirclePaint = paint3;
        paint3.setColor(-1);
        this.mTransparentCirclePaint.setStyle(style);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        Paint paint4 = this.mValuePaint;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        Paint paint5 = new Paint(1);
        this.mEntryLabelsPaint = paint5;
        paint5.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(align);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint6 = new Paint(1);
        this.mValueLinePaint = paint6;
        paint6.setStyle(Paint.Style.STROKE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    public float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = mPPointF.x + (((float) Math.cos(d)) * f);
        float fSin = mPPointF.y + (((float) Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow(fCos - f3, 2.0d) + Math.pow(fSin - f4, 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((mPPointF.x + (((float) Math.cos(d2)) * f)) - ((fCos + f3) / 2.0f), 2.0d) + Math.pow((mPPointF.y + (((float) Math.sin(d2)) * f)) - ((fSin + f4) / 2.0f), 2.0d)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public float getSliceSpace(IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        int i;
        float f;
        float f2;
        float f3;
        RectF rectF;
        int i2;
        float[] fArr;
        int i3;
        RectF rectF2;
        float f4;
        MPPointF mPPointF;
        int i4;
        float f5;
        MPPointF mPPointF2;
        int i5;
        float fMax;
        MPPointF mPPointF3;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF circleBox = this.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = this.mChart.getDrawAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF3 = new RectF();
        boolean z2 = z && this.mChart.isDrawRoundedSlicesEnabled();
        int i6 = 0;
        for (int i7 = 0; i7 < entryCount; i7++) {
            if (Math.abs(iPieDataSet2.getEntryForIndex(i7).getY()) > Utils.FLOAT_EPSILON) {
                i6++;
            }
        }
        float sliceSpace = i6 <= 1 ? 0.0f : getSliceSpace(iPieDataSet2);
        int i8 = 0;
        float f6 = 0.0f;
        while (i8 < entryCount) {
            float f7 = drawAngles[i8];
            float fAbs = Math.abs(iPieDataSet2.getEntryForIndex(i8).getY());
            float f8 = Utils.FLOAT_EPSILON;
            if (fAbs > f8 && (!this.mChart.needsHighlight(i8) || z2)) {
                boolean z3 = sliceSpace > 0.0f && f7 <= 180.0f;
                i2 = entryCount;
                this.mRenderPaint.setColor(iPieDataSet2.getColor(i8));
                float f9 = i6 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f10 = rotationAngle + ((f6 + (f9 / 2.0f)) * phaseY);
                float f11 = (f7 - f9) * phaseY;
                float f12 = f11 < 0.0f ? 0.0f : f11;
                this.mPathBuffer.reset();
                if (z2) {
                    float f13 = radius - holeRadius2;
                    i = i8;
                    i4 = i6;
                    double d = f10 * 0.017453292f;
                    f2 = rotationAngle;
                    f3 = phaseX;
                    float fCos = centerCircleBox.x + (((float) Math.cos(d)) * f13);
                    float fSin = centerCircleBox.y + (f13 * ((float) Math.sin(d)));
                    rectF3.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                } else {
                    i = i8;
                    i4 = i6;
                    f2 = rotationAngle;
                    f3 = phaseX;
                }
                double d2 = f10 * 0.017453292f;
                float f14 = holeRadius;
                float fCos2 = centerCircleBox.x + (((float) Math.cos(d2)) * radius);
                float fSin2 = centerCircleBox.y + (((float) Math.sin(d2)) * radius);
                if (f12 >= 360.0f && f12 % 360.0f <= f8) {
                    fArr = drawAngles;
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, radius, Path.Direction.CW);
                } else {
                    fArr = drawAngles;
                    if (z2) {
                        this.mPathBuffer.arcTo(rectF3, f10 + 180.0f, -180.0f);
                    }
                    this.mPathBuffer.arcTo(circleBox, f10, f12);
                }
                RectF rectF4 = this.mInnerRectBuffer;
                float f15 = centerCircleBox.x;
                float f16 = centerCircleBox.y;
                RectF rectF5 = rectF3;
                rectF4.set(f15 - f14, f16 - f14, f15 + f14, f16 + f14);
                if (!z) {
                    f = radius;
                    f4 = f14;
                    i3 = i4;
                    rectF2 = rectF5;
                    rectF = circleBox;
                    mPPointF = centerCircleBox;
                    f5 = 360.0f;
                } else if (f14 > 0.0f || z3) {
                    if (z3) {
                        i3 = i4;
                        rectF = circleBox;
                        f4 = f14;
                        i5 = 1;
                        f = radius;
                        mPPointF2 = centerCircleBox;
                        float fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f7 * phaseY, fCos2, fSin2, f10, f12);
                        if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = Math.max(f4, fCalculateMinimumRadiusForSpacedSlice);
                    } else {
                        f = radius;
                        mPPointF2 = centerCircleBox;
                        f4 = f14;
                        i3 = i4;
                        rectF = circleBox;
                        i5 = 1;
                        fMax = f4;
                    }
                    float f17 = (i3 == i5 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                    float f18 = f17 / 2.0f;
                    float f19 = (f7 - f17) * phaseY;
                    if (f19 < 0.0f) {
                        f19 = 0.0f;
                    }
                    float f20 = f2 + ((f6 + f18) * phaseY) + f19;
                    if (f12 >= 360.0f && f12 % 360.0f <= f8) {
                        this.mPathBuffer.addCircle(mPPointF2.x, mPPointF2.y, fMax, Path.Direction.CCW);
                        mPPointF3 = mPPointF2;
                        rectF2 = rectF5;
                    } else {
                        if (z2) {
                            float f21 = f - holeRadius2;
                            double d3 = 0.017453292f * f20;
                            mPPointF3 = mPPointF2;
                            float fCos3 = mPPointF2.x + (((float) Math.cos(d3)) * f21);
                            float fSin3 = mPPointF3.y + (f21 * ((float) Math.sin(d3)));
                            rectF2 = rectF5;
                            rectF2.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                            this.mPathBuffer.arcTo(rectF2, f20, 180.0f);
                        } else {
                            mPPointF3 = mPPointF2;
                            rectF2 = rectF5;
                            double d4 = f20 * 0.017453292f;
                            this.mPathBuffer.lineTo(mPPointF3.x + (((float) Math.cos(d4)) * fMax), mPPointF3.y + (fMax * ((float) Math.sin(d4))));
                        }
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f20, -f19);
                    }
                    mPPointF = mPPointF3;
                    this.mPathBuffer.close();
                    this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                    f6 += f7 * f3;
                } else {
                    f = radius;
                    f4 = f14;
                    i3 = i4;
                    rectF2 = rectF5;
                    f5 = 360.0f;
                    rectF = circleBox;
                    mPPointF = centerCircleBox;
                }
                if (f12 % f5 > f8) {
                    if (z3) {
                        float fCalculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(mPPointF, f, f7 * phaseY, fCos2, fSin2, f10, f12);
                        double d5 = (f10 + (f12 / 2.0f)) * 0.017453292f;
                        this.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d5)) * fCalculateMinimumRadiusForSpacedSlice2), mPPointF.y + (fCalculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d5))));
                    } else {
                        this.mPathBuffer.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                f6 += f7 * f3;
            } else {
                f6 += f7 * phaseX;
                i = i8;
                f = radius;
                f2 = rotationAngle;
                f3 = phaseX;
                rectF = circleBox;
                i2 = entryCount;
                fArr = drawAngles;
                i3 = i6;
                rectF2 = rectF3;
                f4 = holeRadius;
                mPPointF = centerCircleBox;
            }
            i8 = i + 1;
            iPieDataSet2 = iPieDataSet;
            holeRadius = f4;
            rectF3 = rectF2;
            centerCircleBox = mPPointF;
            i6 = i3;
            radius = f;
            entryCount = i2;
            circleBox = rectF;
            rotationAngle = f2;
            phaseX = f3;
            drawAngles = fArr;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03bd  */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawValues(Canvas canvas) {
        int i;
        List<IPieDataSet> list;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        float f4;
        MPPointF mPPointF;
        Canvas canvas2;
        PieDataSet.ValuePosition valuePosition;
        float f5;
        float f6;
        boolean z;
        float f7;
        float f8;
        MPPointF mPPointF2;
        MPPointF mPPointF3;
        PieEntry pieEntry;
        ValueFormatter valueFormatter;
        float f9;
        IPieDataSet iPieDataSet;
        Canvas canvas3;
        String str;
        String str2;
        MPPointF mPPointF4;
        MPPointF mPPointF5;
        Canvas canvas4 = canvas;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f10 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f10 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle = (float) (((double) rotationAngle) + (((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d)));
            }
        }
        float f11 = rotationAngle;
        float f12 = radius - f10;
        PieData pieData = (PieData) this.mChart.getData();
        List<IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i2 = 0;
        int i3 = 0;
        while (i3 < dataSets.size()) {
            IPieDataSet iPieDataSet2 = dataSets.get(i3);
            boolean zIsDrawValuesEnabled = iPieDataSet2.isDrawValuesEnabled();
            if (zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet2.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet2.getYValuePosition();
                applyValueTextStyle(iPieDataSet2);
                int i4 = i2;
                i = i3;
                float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "Q") + Utils.convertDpToPixel(4.0f);
                ValueFormatter valueFormatter2 = iPieDataSet2.getValueFormatter();
                int entryCount = iPieDataSet2.getEntryCount();
                list = dataSets;
                this.mValueLinePaint.setColor(iPieDataSet2.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(Utils.convertDpToPixel(iPieDataSet2.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet2);
                MPPointF mPPointF6 = MPPointF.getInstance(iPieDataSet2.getIconsOffset());
                MPPointF mPPointF7 = centerCircleBox;
                mPPointF6.x = Utils.convertDpToPixel(mPPointF6.x);
                mPPointF6.y = Utils.convertDpToPixel(mPPointF6.y);
                int i5 = 0;
                while (i5 < entryCount) {
                    MPPointF mPPointF8 = mPPointF6;
                    PieEntry entryForIndex = iPieDataSet2.getEntryForIndex(i5);
                    int i6 = entryCount;
                    float f13 = f11 + (((i4 == 0 ? 0.0f : absoluteAngles[i4 - 1] * phaseX) + ((drawAngles[i4] - ((sliceSpace / (f12 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY);
                    float f14 = sliceSpace;
                    String pieLabel = valueFormatter2.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY(), entryForIndex);
                    float[] fArr3 = drawAngles;
                    String label = entryForIndex.getLabel();
                    ValueFormatter valueFormatter3 = valueFormatter2;
                    double d = f13 * 0.017453292f;
                    float[] fArr4 = absoluteAngles;
                    float f15 = phaseX;
                    float fCos = (float) Math.cos(d);
                    float f16 = phaseY;
                    float fSin = (float) Math.sin(d);
                    boolean z2 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    float f17 = f11;
                    boolean z3 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z4 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                    boolean z5 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z2 || z3) {
                        float valueLinePart1Length = iPieDataSet2.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet2.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet2.getValueLinePart1OffsetPercentage() / 100.0f;
                        valuePosition = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f18 = radius * holeRadius2;
                            f5 = ((radius - f18) * valueLinePart1OffsetPercentage) + f18;
                        } else {
                            f5 = radius * valueLinePart1OffsetPercentage;
                        }
                        float fAbs = iPieDataSet2.isValueLineVariableLength() ? valueLinePart2Length * f12 * ((float) Math.abs(Math.sin(d))) : valueLinePart2Length * f12;
                        MPPointF mPPointF9 = mPPointF7;
                        float f19 = mPPointF9.x;
                        float f20 = mPPointF9.y;
                        float f21 = (valueLinePart1Length + 1.0f) * f12;
                        float f22 = (f21 * fCos) + f19;
                        float f23 = f20 + (f21 * fSin);
                        f6 = radius;
                        z = z4;
                        double d2 = ((double) f13) % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float f24 = f22 - fAbs;
                            Paint paint = this.mValuePaint;
                            Paint.Align align = Paint.Align.RIGHT;
                            paint.setTextAlign(align);
                            if (z2) {
                                this.mEntryLabelsPaint.setTextAlign(align);
                            }
                            f7 = f24;
                            f8 = f24 - fConvertDpToPixel;
                        } else {
                            f7 = f22 + fAbs;
                            Paint paint2 = this.mValuePaint;
                            Paint.Align align2 = Paint.Align.LEFT;
                            paint2.setTextAlign(align2);
                            if (z2) {
                                this.mEntryLabelsPaint.setTextAlign(align2);
                            }
                            f8 = f7 + fConvertDpToPixel;
                        }
                        if (iPieDataSet2.getValueLineColor() != 1122867) {
                            if (iPieDataSet2.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iPieDataSet2.getColor(i5));
                            }
                            float f25 = f19 + (f5 * fCos);
                            float f26 = (f5 * fSin) + f20;
                            valueFormatter = valueFormatter3;
                            f9 = fSin;
                            iPieDataSet = iPieDataSet2;
                            mPPointF2 = mPPointF9;
                            mPPointF3 = mPPointF8;
                            pieEntry = entryForIndex;
                            canvas.drawLine(f25, f26, f22, f23, this.mValueLinePaint);
                            canvas.drawLine(f22, f23, f7, f23, this.mValueLinePaint);
                        } else {
                            mPPointF2 = mPPointF9;
                            mPPointF3 = mPPointF8;
                            pieEntry = entryForIndex;
                            valueFormatter = valueFormatter3;
                            f9 = fSin;
                            iPieDataSet = iPieDataSet2;
                        }
                        if (z2 && z3) {
                            drawValue(canvas, pieLabel, f8, f23, iPieDataSet.getValueTextColor(i5));
                            if (i5 >= pieData.getEntryCount() || label == null) {
                                canvas3 = canvas;
                                str = label;
                            } else {
                                canvas3 = canvas;
                                str = label;
                                drawEntryLabel(canvas3, str, f8, f23 + fCalcTextHeight);
                            }
                        } else {
                            canvas3 = canvas;
                            str = label;
                            if (z2) {
                                if (i5 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas3, str, f8, f23 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z3) {
                                float f27 = f8;
                                str2 = str;
                                drawValue(canvas, pieLabel, f27, f23 + (fCalcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i5));
                            }
                        }
                        str2 = str;
                    } else {
                        valuePosition = yValuePosition;
                        f6 = radius;
                        z = z4;
                        mPPointF2 = mPPointF7;
                        mPPointF3 = mPPointF8;
                        pieEntry = entryForIndex;
                        valueFormatter = valueFormatter3;
                        str2 = label;
                        canvas3 = canvas;
                        f9 = fSin;
                        iPieDataSet = iPieDataSet2;
                    }
                    if (z || z5) {
                        mPPointF4 = mPPointF2;
                        float f28 = (f12 * fCos) + mPPointF4.x;
                        float f29 = (f12 * f9) + mPPointF4.y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z && z5) {
                            drawValue(canvas, pieLabel, f28, f29, iPieDataSet.getValueTextColor(i5));
                            if (i5 < pieData.getEntryCount() && str2 != null) {
                                drawEntryLabel(canvas3, str2, f28, f29 + fCalcTextHeight);
                            }
                        } else {
                            if (z) {
                                if (i5 < pieData.getEntryCount() && str2 != null) {
                                    drawEntryLabel(canvas3, str2, f28, f29 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z5) {
                                drawValue(canvas, pieLabel, f28, f29 + (fCalcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i5));
                            }
                            if (pieEntry.getIcon() == null && iPieDataSet.isDrawIconsEnabled()) {
                                Drawable icon = pieEntry.getIcon();
                                mPPointF5 = mPPointF3;
                                float f30 = mPPointF5.y + f12;
                                Utils.drawImage(canvas, icon, (int) ((fCos * f30) + mPPointF4.x), (int) ((f30 * f9) + mPPointF4.y + mPPointF5.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            } else {
                                mPPointF5 = mPPointF3;
                            }
                            i4++;
                            i5++;
                            mPPointF6 = mPPointF5;
                            iPieDataSet2 = iPieDataSet;
                            mPPointF7 = mPPointF4;
                            sliceSpace = f14;
                            entryCount = i6;
                            drawAngles = fArr3;
                            absoluteAngles = fArr4;
                            phaseX = f15;
                            phaseY = f16;
                            f11 = f17;
                            xValuePosition = valuePosition2;
                            yValuePosition = valuePosition;
                            valueFormatter2 = valueFormatter;
                            radius = f6;
                        }
                    } else {
                        mPPointF4 = mPPointF2;
                    }
                    if (pieEntry.getIcon() == null) {
                        mPPointF5 = mPPointF3;
                    }
                    i4++;
                    i5++;
                    mPPointF6 = mPPointF5;
                    iPieDataSet2 = iPieDataSet;
                    mPPointF7 = mPPointF4;
                    sliceSpace = f14;
                    entryCount = i6;
                    drawAngles = fArr3;
                    absoluteAngles = fArr4;
                    phaseX = f15;
                    phaseY = f16;
                    f11 = f17;
                    xValuePosition = valuePosition2;
                    yValuePosition = valuePosition;
                    valueFormatter2 = valueFormatter;
                    radius = f6;
                }
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                f4 = f11;
                mPPointF = mPPointF7;
                canvas2 = canvas;
                MPPointF.recycleInstance(mPPointF6);
                i2 = i4;
            } else {
                i = i3;
                list = dataSets;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                f4 = f11;
                canvas2 = canvas4;
                mPPointF = centerCircleBox;
            }
            i3 = i + 1;
            canvas4 = canvas2;
            centerCircleBox = mPPointF;
            dataSets = list;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            phaseX = f2;
            phaseY = f3;
            f11 = f4;
            radius = f;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    public void drawEntryLabel(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    public void drawHole(Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
        }
        if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = this.mChart.getTransparentCircleRadius() / 100.0f;
            this.mTransparentCirclePaint.setAlpha((int) (alpha * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, radius * transparentCircleRadius, Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    public void drawCenterText(Canvas canvas) {
        float radius;
        MPPointF mPPointF;
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f = centerCircleBox.x + centerTextOffset.x;
        float f2 = centerCircleBox.y + centerTextOffset.y;
        if (this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
        } else {
            radius = this.mChart.getRadius();
        }
        RectF[] rectFArr = this.mRectBuffer;
        RectF rectF = rectFArr[0];
        rectF.left = f - radius;
        rectF.top = f2 - radius;
        rectF.right = f + radius;
        rectF.bottom = f2 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > AudioStats.AUDIO_AMPLITUDE_NONE) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (centerText.equals(this.mCenterTextLastValue) && rectF2.equals(this.mCenterTextLastBounds)) {
            mPPointF = centerTextOffset;
        } else {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            mPPointF = centerTextOffset;
            this.mCenterTextLayout = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        MPPointF.recycleInstance(centerCircleBox);
        MPPointF.recycleInstance(mPPointF);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        IPieDataSet dataSetByIndex;
        float f;
        int i;
        float[] fArr;
        float f2;
        int i2;
        boolean z;
        RectF rectF;
        MPPointF mPPointF;
        int i3;
        float f3;
        float[] fArr2;
        float fCalculateMinimumRadiusForSpacedSlice;
        float fMax;
        Highlight[] highlightArr2 = highlightArr;
        boolean z2 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (z2 && this.mChart.isDrawRoundedSlicesEnabled()) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float holeRadius = z2 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF2 = this.mDrawHighlightedRectF;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i4 = 0;
        while (i4 < highlightArr2.length) {
            int x = (int) highlightArr2[i4].getX();
            if (x < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr2[i4].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i5 = 0;
                for (int i6 = 0; i6 < entryCount; i6++) {
                    if (Math.abs(dataSetByIndex.getEntryForIndex(i6).getY()) > Utils.FLOAT_EPSILON) {
                        i5++;
                    }
                }
                if (x == 0) {
                    i = 1;
                    f = 0.0f;
                } else {
                    f = absoluteAngles[x - 1] * phaseX;
                    i = 1;
                }
                float sliceSpace = i5 <= i ? 0.0f : dataSetByIndex.getSliceSpace();
                float f4 = drawAngles[x];
                float selectionShift = dataSetByIndex.getSelectionShift();
                int i7 = i4;
                float f5 = radius + selectionShift;
                float f6 = holeRadius;
                rectF2.set(this.mChart.getCircleBox());
                float f7 = -selectionShift;
                rectF2.inset(f7, f7);
                boolean z3 = sliceSpace > 0.0f && f4 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x));
                float f8 = i5 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f9 = i5 == 1 ? 0.0f : sliceSpace / (f5 * 0.017453292f);
                float f10 = rotationAngle + (((f8 / 2.0f) + f) * phaseY);
                float f11 = (f4 - f8) * phaseY;
                float f12 = f11 < 0.0f ? 0.0f : f11;
                float f13 = (((f9 / 2.0f) + f) * phaseY) + rotationAngle;
                float f14 = (f4 - f9) * phaseY;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f12 >= 360.0f && f12 % 360.0f <= Utils.FLOAT_EPSILON) {
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, f5, Path.Direction.CW);
                    fArr = drawAngles;
                    f2 = f;
                    i2 = i5;
                    z = z2;
                } else {
                    fArr = drawAngles;
                    f2 = f;
                    double d = f13 * 0.017453292f;
                    i2 = i5;
                    z = z2;
                    this.mPathBuffer.moveTo(centerCircleBox.x + (((float) Math.cos(d)) * f5), centerCircleBox.y + (f5 * ((float) Math.sin(d))));
                    this.mPathBuffer.arcTo(rectF2, f13, f14);
                }
                if (z3) {
                    double d2 = f10 * 0.017453292f;
                    i3 = i7;
                    rectF = rectF2;
                    f3 = f6;
                    mPPointF = centerCircleBox;
                    fArr2 = fArr;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f4 * phaseY, (((float) Math.cos(d2)) * radius) + centerCircleBox.x, centerCircleBox.y + (((float) Math.sin(d2)) * radius), f10, f12);
                } else {
                    rectF = rectF2;
                    mPPointF = centerCircleBox;
                    i3 = i7;
                    f3 = f6;
                    fArr2 = fArr;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                RectF rectF3 = this.mInnerRectBuffer;
                float f15 = mPPointF.x;
                float f16 = mPPointF.y;
                rectF3.set(f15 - f3, f16 - f3, f15 + f3, f16 + f3);
                if (z && (f3 > 0.0f || z3)) {
                    if (z3) {
                        if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = Math.max(f3, fCalculateMinimumRadiusForSpacedSlice);
                    } else {
                        fMax = f3;
                    }
                    float f17 = (i2 == 1 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                    float f18 = f17 / 2.0f;
                    float f19 = (f4 - f17) * phaseY;
                    if (f19 < 0.0f) {
                        f19 = 0.0f;
                    }
                    float f20 = ((f2 + f18) * phaseY) + rotationAngle + f19;
                    if (f12 >= 360.0f && f12 % 360.0f <= Utils.FLOAT_EPSILON) {
                        this.mPathBuffer.addCircle(mPPointF.x, mPPointF.y, fMax, Path.Direction.CCW);
                    } else {
                        double d3 = f20 * 0.017453292f;
                        this.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d3)) * fMax), mPPointF.y + (fMax * ((float) Math.sin(d3))));
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f20, -f19);
                    }
                } else if (f12 % 360.0f > Utils.FLOAT_EPSILON) {
                    if (z3) {
                        double d4 = (f10 + (f12 / 2.0f)) * 0.017453292f;
                        this.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d4)) * fCalculateMinimumRadiusForSpacedSlice), mPPointF.y + (fCalculateMinimumRadiusForSpacedSlice * ((float) Math.sin(d4))));
                    } else {
                        this.mPathBuffer.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                i3 = i4;
                rectF = rectF2;
                f3 = holeRadius;
                fArr2 = drawAngles;
                z = z2;
                mPPointF = centerCircleBox;
            }
            i4 = i3 + 1;
            rectF2 = rectF;
            holeRadius = f3;
            centerCircleBox = mPPointF;
            drawAngles = fArr2;
            z2 = z;
            highlightArr2 = highlightArr;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public void drawRoundedSlices(Canvas canvas) {
        float f;
        float[] fArr;
        float f2;
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i = 0;
                while (i < dataSet.getEntryCount()) {
                    float f3 = drawAngles[i];
                    if (Math.abs(dataSet.getEntryForIndex(i).getY()) > Utils.FLOAT_EPSILON) {
                        double d = radius - holeRadius;
                        double d2 = (rotationAngle + f3) * phaseY;
                        f = phaseY;
                        fArr = drawAngles;
                        f2 = rotationAngle;
                        float fCos = (float) (((double) centerCircleBox.x) + (Math.cos(Math.toRadians(d2)) * d));
                        float fSin = (float) ((d * Math.sin(Math.toRadians(d2))) + ((double) centerCircleBox.y));
                        this.mRenderPaint.setColor(dataSet.getColor(i));
                        this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                    } else {
                        f = phaseY;
                        fArr = drawAngles;
                        f2 = rotationAngle;
                    }
                    rotationAngle = f2 + (f3 * phaseX);
                    i++;
                    phaseY = f;
                    drawAngles = fArr;
                }
                MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
