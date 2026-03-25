package o;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: renamed from: o.nkA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C34842nkA extends PieChartRenderer {
    public java.lang.String AEQbTJ;
    public android.graphics.Paint EZpvd;

    public C34842nkA(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(pieChart, chartAnimator, viewPortHandler);
        this.EZpvd = new android.graphics.Paint();
        this.AEQbTJ = "2.0%";
    }

    public final float[] AEQbTJ(float[][] fArr, float f) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i = 0;
        while (true) {
            float[] fArr2 = fArr[0];
            if (i >= fArr2.length) {
                break;
            }
            float f2 = fArr2[i];
            if (f2 != 0.0f) {
                arrayList.add(java.lang.Float.valueOf(java.lang.Math.abs(f2 - f)));
                arrayList2.add(java.lang.Float.valueOf(fArr[0][i]));
                arrayList3.add(java.lang.Float.valueOf(fArr[1][i]));
            }
            i++;
        }
        float[] fArr3 = new float[2];
        if (arrayList.size() == 0) {
            return fArr3;
        }
        float fFloatValue = ((java.lang.Float) arrayList.get(0)).floatValue();
        fArr3[0] = ((java.lang.Float) arrayList2.get(0)).floatValue();
        fArr3[1] = ((java.lang.Float) arrayList3.get(0)).floatValue();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((java.lang.Float) arrayList.get(i2)).floatValue() < fFloatValue) {
                fFloatValue = ((java.lang.Float) arrayList.get(i2)).floatValue();
                fArr3[0] = ((java.lang.Float) arrayList2.get(i2)).floatValue();
                fArr3[1] = ((java.lang.Float) arrayList3.get(i2)).floatValue();
            }
        }
        return fArr3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.PieChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        java.util.List<IPieDataSet> list;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        float f4;
        MPPointF mPPointF;
        int i;
        android.graphics.Canvas canvas2;
        float f5;
        boolean z;
        MPPointF mPPointF2;
        float[][] fArr3;
        float f6;
        float f7;
        float f8;
        int i2;
        float f9;
        int i3;
        PieDataSet.ValuePosition valuePosition;
        PieDataSet.ValuePosition valuePosition2;
        IPieDataSet iPieDataSet;
        float[][] fArr4;
        MPPointF mPPointF3;
        float[][] fArr5;
        int i4;
        android.graphics.Canvas canvas3;
        java.lang.String str;
        java.lang.String str2;
        android.graphics.Canvas canvas4;
        MPPointF mPPointF4;
        float f10;
        android.graphics.Canvas canvas5 = canvas;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f11 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f11 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle = (float) (((double) rotationAngle) + (((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d)));
            }
        }
        float f12 = rotationAngle;
        float f13 = radius - f11;
        PieData pieData = (PieData) this.mChart.getData();
        java.util.List<IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        int i5 = 0;
        int i6 = 0;
        while (i6 < dataSets.size()) {
            IPieDataSet iPieDataSet2 = dataSets.get(i6);
            boolean zIsDrawValuesEnabled = iPieDataSet2.isDrawValuesEnabled();
            if (zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet2.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet2.getYValuePosition();
                applyValueTextStyle(iPieDataSet2);
                int i7 = i5;
                android.graphics.Rect rect = new android.graphics.Rect();
                list = dataSets;
                android.graphics.Paint paint = this.mValuePaint;
                java.lang.String str3 = this.AEQbTJ;
                MPPointF mPPointF5 = centerCircleBox;
                f = radius;
                paint.getTextBounds(str3, 0, str3.length(), rect);
                this.mValuePaint.setColor(iPieDataSet2.getColor(i6));
                this.mValuePaint.setTypeface(C55051xce.OLrzqt.valueOf());
                int iHeight = (int) (rect.height() * 1.5f);
                float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "Q") + com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
                ValueFormatter valueFormatter = iPieDataSet2.getValueFormatter();
                int entryCount = iPieDataSet2.getEntryCount();
                int i8 = i6;
                this.mValueLinePaint.setColor(iPieDataSet2.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iPieDataSet2.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet2);
                MPPointF mPPointF6 = MPPointF.getInstance(iPieDataSet2.getIconsOffset());
                mPPointF6.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF6.x);
                mPPointF6.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF6.y);
                MPPointF mPPointF7 = mPPointF6;
                java.lang.Class cls = java.lang.Float.TYPE;
                float[][] fArr6 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 2, entryCount);
                float[][] fArr7 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 2, entryCount);
                int i9 = 0;
                while (i9 < entryCount) {
                    int i10 = entryCount;
                    PieEntry entryForIndex = iPieDataSet2.getEntryForIndex(i9);
                    float[] fArr8 = drawAngles;
                    float f14 = f12 + (((i7 == 0 ? 0.0f : absoluteAngles[i7 - 1] * phaseX) + ((drawAngles[i7] - ((sliceSpace / (f13 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY);
                    float[] fArr9 = absoluteAngles;
                    java.lang.String pieLabel = valueFormatter.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY(), entryForIndex);
                    ValueFormatter valueFormatter2 = valueFormatter;
                    java.lang.String label = entryForIndex.getLabel();
                    float f15 = phaseX;
                    float f16 = phaseY;
                    double d = f14 * 0.017453292f;
                    float[][] fArr10 = fArr7;
                    float fCos = (float) java.lang.Math.cos(d);
                    float fSin = (float) java.lang.Math.sin(d);
                    boolean z2 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    float f17 = f12;
                    boolean z3 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z4 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    PieDataSet.ValuePosition valuePosition3 = xValuePosition;
                    boolean z5 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z2 || z3) {
                        float valueLinePart1Length = iPieDataSet2.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet2.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet2.getValueLinePart1OffsetPercentage() / 100.0f;
                        PieDataSet.ValuePosition valuePosition4 = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f18 = f * holeRadius2;
                            f5 = ((f - f18) * valueLinePart1OffsetPercentage) + f18;
                        } else {
                            f5 = f * valueLinePart1OffsetPercentage;
                        }
                        float fAbs = iPieDataSet2.isValueLineVariableLength() ? valueLinePart2Length * f13 * ((float) java.lang.Math.abs(java.lang.Math.sin(d))) : valueLinePart2Length * f13;
                        MPPointF mPPointF8 = mPPointF5;
                        float f19 = mPPointF8.x;
                        float f20 = mPPointF8.y;
                        float f21 = (valueLinePart1Length + 1.0f) * f13;
                        float f22 = (f21 * fCos) + f19;
                        float f23 = (f21 * fSin) + f20;
                        z = z4;
                        mPPointF2 = mPPointF8;
                        double d2 = ((double) f14) % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float[] fArrAEQbTJ = AEQbTJ(fArr6, f23);
                            fArr6[0][i9] = f23;
                            float f24 = fArrAEQbTJ[0];
                            if (f24 != 0.0f) {
                                float fAbs2 = java.lang.Math.abs(f24 - f23);
                                float f25 = iHeight;
                                if (fAbs2 < f25 + fCalcTextHeight) {
                                    f23 = fArrAEQbTJ[1] - f25;
                                }
                            }
                            float f26 = f22 - fAbs;
                            android.graphics.Paint paint2 = this.mValuePaint;
                            Paint.Align align = Paint.Align.RIGHT;
                            paint2.setTextAlign(align);
                            if (z2) {
                                this.EZpvd.setTextAlign(align);
                            }
                            fArr6[1][i9] = f23;
                            f8 = f23;
                            f6 = f26;
                            f7 = f26 - fConvertDpToPixel;
                            fArr3 = fArr10;
                        } else {
                            fArr3 = fArr10;
                            float[] fArrAEQbTJ2 = AEQbTJ(fArr3, f23);
                            fArr3[0][i9] = f23;
                            float f27 = fArrAEQbTJ2[0];
                            if (f27 != 0.0f) {
                                float f28 = iHeight;
                                if (java.lang.Math.abs(f27 - f23) < f28 + fCalcTextHeight) {
                                    f23 = fArrAEQbTJ2[1] + f28;
                                }
                            }
                            f6 = f22 + fAbs;
                            android.graphics.Paint paint3 = this.mValuePaint;
                            Paint.Align align2 = Paint.Align.LEFT;
                            paint3.setTextAlign(align2);
                            if (z2) {
                                this.EZpvd.setTextAlign(align2);
                            }
                            f7 = f6 + fConvertDpToPixel;
                            fArr3[1][i9] = f23;
                            f8 = f23;
                        }
                        float[][] fArr11 = fArr6;
                        if (iPieDataSet2.getValueLineColor() != 1122867) {
                            if (iPieDataSet2.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iPieDataSet2.getColor(i9));
                            }
                            float f29 = (f5 * fCos) + f19;
                            float f30 = (f5 * fSin) + f20;
                            i2 = i9;
                            valuePosition = valuePosition3;
                            i3 = iHeight;
                            iPieDataSet = iPieDataSet2;
                            int i11 = i8;
                            fArr5 = fArr11;
                            i4 = i11;
                            fArr4 = fArr3;
                            valuePosition2 = valuePosition4;
                            mPPointF3 = mPPointF7;
                            float f31 = f8;
                            f9 = f7;
                            canvas.drawLine(f29, f30, f22, f31, this.mValueLinePaint);
                            canvas.drawLine(f22, f8, f6, f31, this.mValueLinePaint);
                        } else {
                            i2 = i9;
                            f9 = f7;
                            i3 = iHeight;
                            valuePosition = valuePosition3;
                            valuePosition2 = valuePosition4;
                            iPieDataSet = iPieDataSet2;
                            fArr4 = fArr3;
                            mPPointF3 = mPPointF7;
                            int i12 = i8;
                            fArr5 = fArr11;
                            i4 = i12;
                        }
                        if (z2 && z3) {
                            drawValue(canvas, pieLabel, f9, f8, iPieDataSet.getValueTextColor(i2));
                            if (i2 >= pieData.getEntryCount() || label == null) {
                                canvas3 = canvas;
                                str = label;
                            } else {
                                canvas3 = canvas;
                                str = label;
                                drawEntryLabel(canvas3, str, f9, f8 + fCalcTextHeight);
                            }
                        } else {
                            canvas3 = canvas;
                            str = label;
                            float f32 = f9;
                            if (z2) {
                                if (i2 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas3, str, f32, f8 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z3) {
                                float f33 = f8 + (fCalcTextHeight / 2.0f);
                                str2 = str;
                                canvas4 = canvas3;
                                drawValue(canvas, pieLabel, f32, f33, iPieDataSet.getValueTextColor(i2));
                            }
                        }
                        str2 = str;
                        canvas4 = canvas3;
                    } else {
                        canvas4 = canvas;
                        i2 = i9;
                        valuePosition2 = yValuePosition;
                        i3 = iHeight;
                        z = z4;
                        mPPointF2 = mPPointF5;
                        i4 = i8;
                        mPPointF3 = mPPointF7;
                        str2 = label;
                        iPieDataSet = iPieDataSet2;
                        fArr5 = fArr6;
                        fArr4 = fArr10;
                        valuePosition = valuePosition3;
                    }
                    if (z || z5) {
                        mPPointF4 = mPPointF2;
                        float f34 = (f13 * fCos) + mPPointF4.x;
                        float f35 = (f13 * fSin) + mPPointF4.y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z && z5) {
                            f10 = fSin;
                            drawValue(canvas, pieLabel, f34, f35, iPieDataSet.getValueTextColor(i2));
                            if (i2 < pieData.getEntryCount() && str2 != null) {
                                drawEntryLabel(canvas4, str2, f34, f35 + fCalcTextHeight);
                            }
                        } else {
                            f10 = fSin;
                            if (z) {
                                if (i2 < pieData.getEntryCount() && str2 != null) {
                                    drawEntryLabel(canvas4, str2, f34, f35 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z5) {
                                drawValue(canvas, pieLabel, f34, f35 + (fCalcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i2));
                            }
                            if (entryForIndex.getIcon() == null && iPieDataSet.isDrawIconsEnabled()) {
                                android.graphics.drawable.Drawable icon = entryForIndex.getIcon();
                                float f36 = mPPointF3.y + f13;
                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) ((fCos * f36) + mPPointF4.x), (int) ((f36 * f10) + mPPointF4.y + mPPointF3.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                            i7++;
                            i9 = i2 + 1;
                            iPieDataSet2 = iPieDataSet;
                            mPPointF5 = mPPointF4;
                            mPPointF7 = mPPointF3;
                            fArr6 = fArr5;
                            yValuePosition = valuePosition2;
                            entryCount = i10;
                            absoluteAngles = fArr9;
                            drawAngles = fArr8;
                            phaseX = f15;
                            valueFormatter = valueFormatter2;
                            phaseY = f16;
                            xValuePosition = valuePosition;
                            iHeight = i3;
                            f12 = f17;
                            fArr7 = fArr4;
                            i8 = i4;
                        }
                    } else {
                        f10 = fSin;
                        mPPointF4 = mPPointF2;
                    }
                    if (entryForIndex.getIcon() == null) {
                    }
                    i7++;
                    i9 = i2 + 1;
                    iPieDataSet2 = iPieDataSet;
                    mPPointF5 = mPPointF4;
                    mPPointF7 = mPPointF3;
                    fArr6 = fArr5;
                    yValuePosition = valuePosition2;
                    entryCount = i10;
                    absoluteAngles = fArr9;
                    drawAngles = fArr8;
                    phaseX = f15;
                    valueFormatter = valueFormatter2;
                    phaseY = f16;
                    xValuePosition = valuePosition;
                    iHeight = i3;
                    f12 = f17;
                    fArr7 = fArr4;
                    i8 = i4;
                }
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                f4 = f12;
                mPPointF = mPPointF5;
                i = i8;
                canvas2 = canvas;
                MPPointF.recycleInstance(mPPointF7);
                i5 = i7;
            } else {
                i = i6;
                list = dataSets;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                f4 = f12;
                canvas2 = canvas5;
                mPPointF = centerCircleBox;
            }
            i6 = i + 1;
            centerCircleBox = mPPointF;
            canvas5 = canvas2;
            dataSets = list;
            radius = f;
            absoluteAngles = fArr2;
            drawAngles = fArr;
            phaseX = f2;
            phaseY = f3;
            f12 = f4;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }
}
