package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import o.C52761wXj;

/* JADX INFO: renamed from: o.pyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C39776pyi extends PieChartRenderer {
    public final android.graphics.Paint AEQbTJ;
    public int EZpvd;
    public OnChartValueSelectedListener KWHzl;
    public Entry OLrzqt;
    public int copydefault;
    public int djBIcL;

    public C39776pyi(final PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(pieChart, chartAnimator, viewPortHandler);
        this.AEQbTJ = new android.graphics.Paint();
        this.djBIcL = 0;
        this.EZpvd = 0;
        this.copydefault = 0;
        this.OLrzqt = null;
        pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() { // from class: o.pyi.5
            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onValueSelected(Entry entry, Highlight highlight) {
                OnChartValueSelectedListener onChartValueSelectedListener = C39776pyi.this.KWHzl;
                if (onChartValueSelectedListener != null) {
                    onChartValueSelectedListener.onValueSelected(entry, highlight);
                }
                C39776pyi.this.OLrzqt = entry;
                pieChart.invalidate();
            }

            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onNothingSelected() {
                OnChartValueSelectedListener onChartValueSelectedListener = C39776pyi.this.KWHzl;
                if (onChartValueSelectedListener != null) {
                    onChartValueSelectedListener.onNothingSelected();
                }
                C39776pyi.this.OLrzqt = null;
                pieChart.invalidate();
            }
        });
        this.copydefault = pieChart.getContext().getColor(C52761wXj.Activity.fdOvFl);
    }

    private float[] copydefault(float[][] fArr, float f) {
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
        if (arrayList.isEmpty()) {
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
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x045b  */
    @Override // com.github.mikephil.charting.renderer.PieChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawValues(android.graphics.Canvas canvas) {
        java.util.List<IPieDataSet> list;
        android.graphics.Canvas canvas2;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        int i;
        char c;
        float f4;
        MPPointF mPPointF;
        float f5;
        boolean z;
        boolean z2;
        float[][] fArr3;
        int i2;
        float f6;
        float f7;
        float f8;
        float f9;
        int i3;
        PieDataSet.ValuePosition valuePosition;
        boolean z3;
        float[][] fArr4;
        MPPointF mPPointF2;
        IPieDataSet iPieDataSet;
        float[][] fArr5;
        int i4;
        int i5;
        int i6;
        android.graphics.Canvas canvas3;
        IPieDataSet iPieDataSet2;
        java.lang.String str;
        ValueFormatter valueFormatter;
        android.graphics.Canvas canvas4;
        float f10;
        IPieDataSet iPieDataSet3;
        MPPointF mPPointF3;
        android.graphics.Canvas canvas5 = canvas;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        char c2 = 0;
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f11 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f11 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle += (float) (((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d));
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
        int i7 = 0;
        int i8 = 0;
        while (i8 < dataSets.size()) {
            IPieDataSet iPieDataSet4 = dataSets.get(i8);
            boolean zIsDrawValuesEnabled = iPieDataSet4.isDrawValuesEnabled();
            if ((zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) && this.OLrzqt != null) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet4.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet4.getYValuePosition();
                applyValueTextStyle(iPieDataSet4);
                int i9 = i7;
                list = dataSets;
                this.mValuePaint.getTextBounds("2.0%", 0, 4, new android.graphics.Rect());
                this.mValuePaint.setColor(iPieDataSet4.getColor(i8));
                this.mValuePaint.setTypeface(C55051xce.OLrzqt.valueOf());
                int iHeight = (int) (r15.height() * 1.5f);
                float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "Q") + com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
                ValueFormatter valueFormatter2 = iPieDataSet4.getValueFormatter();
                int entryCount = iPieDataSet4.getEntryCount();
                int i10 = i8;
                this.mValueLinePaint.setColor(iPieDataSet4.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iPieDataSet4.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet4);
                MPPointF mPPointF4 = MPPointF.getInstance(iPieDataSet4.getIconsOffset());
                mPPointF4.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF4.x);
                mPPointF4.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF4.y);
                MPPointF mPPointF5 = mPPointF4;
                java.lang.Class cls = java.lang.Float.TYPE;
                float[][] fArr6 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 2, entryCount);
                float[][] fArr7 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 2, entryCount);
                int i11 = 0;
                while (i11 < entryCount) {
                    int i12 = entryCount;
                    PieEntry entryForIndex = iPieDataSet4.getEntryForIndex(i11);
                    float[][] fArr8 = fArr7;
                    boolean z4 = entryForIndex == this.OLrzqt;
                    float[] fArr9 = drawAngles;
                    float f14 = f12 + (((i9 == 0 ? 0.0f : absoluteAngles[i9 - 1] * phaseX) + ((drawAngles[i9] - ((sliceSpace / (f13 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY);
                    float[] fArr10 = absoluteAngles;
                    java.lang.String pieLabel = valueFormatter2.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY(), entryForIndex);
                    java.lang.String label = entryForIndex.getLabel();
                    ValueFormatter valueFormatter3 = valueFormatter2;
                    if (entryForIndex.getData() instanceof C39708pxT) {
                        label = ((C39708pxT) entryForIndex.getData()).AhwBna();
                    }
                    java.lang.String str2 = label;
                    double d = f14 * 0.017453292f;
                    float f15 = phaseX;
                    float f16 = phaseY;
                    float fCos = (float) java.lang.Math.cos(d);
                    boolean z5 = z4;
                    float fSin = (float) java.lang.Math.sin(d);
                    boolean z6 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z7 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    int i13 = iHeight;
                    boolean z8 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                    boolean z9 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z6 || z7) {
                        float valueLinePart1Length = iPieDataSet4.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet4.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet4.getValueLinePart1OffsetPercentage() / 100.0f;
                        PieDataSet.ValuePosition valuePosition3 = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f17 = radius * holeRadius2;
                            f4 = ((radius - f17) * valueLinePart1OffsetPercentage) + f17;
                        } else {
                            f4 = radius * valueLinePart1OffsetPercentage;
                        }
                        float fAbs = iPieDataSet4.isValueLineVariableLength() ? valueLinePart2Length * f13 * ((float) java.lang.Math.abs(java.lang.Math.sin(d))) : valueLinePart2Length * f13;
                        float f18 = centerCircleBox.x;
                        float f19 = centerCircleBox.y;
                        float f20 = (valueLinePart1Length + 1.0f) * f13;
                        float f21 = (f20 * fCos) + f18;
                        float f22 = (f20 * fSin) + f19;
                        mPPointF = centerCircleBox;
                        f5 = radius;
                        double d2 = ((double) f14) % 360.0d;
                        boolean z10 = d2 >= 90.0d && d2 <= 270.0d;
                        if (z10) {
                            float[] fArrCopydefault = copydefault(fArr6, f22);
                            fArr6[0][i11] = f22;
                            float f23 = fArrCopydefault[0];
                            if (f23 != 0.0f) {
                                i2 = i13;
                                f6 = f14;
                                float f24 = i2;
                                if (java.lang.Math.abs(f23 - f22) < f24 + fCalcTextHeight) {
                                    f22 = fArrCopydefault[1] - f24;
                                }
                            } else {
                                i2 = i13;
                                f6 = f14;
                            }
                            float f25 = f21 - (fAbs / 3.0f);
                            z = z8;
                            android.graphics.Paint paint = this.mValuePaint;
                            z2 = z10;
                            Paint.Align align = Paint.Align.RIGHT;
                            paint.setTextAlign(align);
                            if (z6) {
                                this.AEQbTJ.setTextAlign(align);
                            }
                            fArr6[1][i11] = f22;
                            f9 = f22;
                            f7 = f25;
                            f8 = f25 - fConvertDpToPixel;
                            fArr3 = fArr8;
                        } else {
                            z = z8;
                            z2 = z10;
                            fArr3 = fArr8;
                            i2 = i13;
                            f6 = f14;
                            float[] fArrCopydefault2 = copydefault(fArr3, f22);
                            fArr3[0][i11] = f22;
                            float f26 = fArrCopydefault2[0];
                            if (f26 != 0.0f) {
                                float f27 = i2;
                                if (java.lang.Math.abs(f26 - f22) < f27 + fCalcTextHeight) {
                                    f22 = fArrCopydefault2[1] + f27;
                                }
                            }
                            f7 = f21 + (fAbs / 3.0f);
                            android.graphics.Paint paint2 = this.mValuePaint;
                            Paint.Align align2 = Paint.Align.LEFT;
                            paint2.setTextAlign(align2);
                            if (z6) {
                                this.AEQbTJ.setTextAlign(align2);
                            }
                            fArr3[1][i11] = f22;
                            f8 = f7 + fConvertDpToPixel;
                            f9 = f22;
                        }
                        float[][] fArr11 = fArr6;
                        if (iPieDataSet4.getValueLineColor() == 1122867) {
                            i3 = i12;
                            valuePosition = valuePosition3;
                            z3 = false;
                            fArr4 = fArr3;
                            mPPointF2 = mPPointF5;
                            iPieDataSet = iPieDataSet4;
                            fArr5 = fArr11;
                            i4 = i10;
                            i5 = i2;
                            i6 = i11;
                            if (z5) {
                                canvas3 = canvas;
                                iPieDataSet2 = iPieDataSet;
                                str = str2;
                                valueFormatter = valueFormatter3;
                            } else if (z6 && z7) {
                                valueFormatter = valueFormatter3;
                                int iCopydefault = copydefault(canvas, pieLabel, f8, f9, iPieDataSet.getValueTextColor(i6), z2);
                                if (i6 >= pieData.getEntryCount() || str2 == null) {
                                    canvas4 = canvas;
                                } else {
                                    canvas4 = canvas;
                                    drawEntryLabel(canvas4, str2, f8, f9 + (fCalcTextHeight * iCopydefault));
                                }
                                canvas3 = canvas4;
                                iPieDataSet2 = iPieDataSet;
                                str = str2;
                            } else {
                                valueFormatter = valueFormatter3;
                                if (z6) {
                                    if (i6 < pieData.getEntryCount() && str2 != null) {
                                        drawEntryLabel(canvas, str2, f8, f9 + (fCalcTextHeight / 2.0f));
                                    }
                                } else if (z7) {
                                    android.graphics.Paint paint3 = this.mValuePaint;
                                    C55051xce c55051xce = C55051xce.OLrzqt;
                                    paint3.setTypeface(c55051xce.valueOf());
                                    iPieDataSet2 = iPieDataSet;
                                    str = str2;
                                    canvas3 = canvas;
                                    int iCopydefault2 = copydefault(canvas, pieLabel, f8, f9, this.djBIcL, z2);
                                    this.mValuePaint.setTypeface(c55051xce.OLrzqt());
                                    if (i6 < pieData.getEntryCount() && str != null) {
                                        drawValue(canvas, str, f8, f9 + (iCopydefault2 * fCalcTextHeight), this.EZpvd);
                                    }
                                }
                                canvas3 = canvas;
                                iPieDataSet2 = iPieDataSet;
                                str = str2;
                            }
                        } else {
                            if (iPieDataSet4.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iPieDataSet4.getColor(i11));
                            }
                            if (z5) {
                                int i14 = this.copydefault;
                                if (i14 != 0) {
                                    this.mValueLinePaint.setColor(i14);
                                }
                                valuePosition = valuePosition3;
                                fArr4 = fArr3;
                                iPieDataSet = iPieDataSet4;
                                int i15 = i10;
                                i5 = i2;
                                MPPointF mPPointF6 = mPPointF5;
                                fArr5 = fArr11;
                                i4 = i15;
                                float f28 = f9;
                                i3 = i12;
                                z3 = false;
                                mPPointF2 = mPPointF6;
                                i6 = i11;
                                canvas.drawLine(f18 + (f4 * fCos), (f4 * fSin) + f19, f21, f28, this.mValueLinePaint);
                                canvas.drawLine(f21, f9, f7, f28, this.mValueLinePaint);
                            }
                            if (z5) {
                            }
                        }
                    } else {
                        canvas3 = canvas;
                        valuePosition = yValuePosition;
                        z = z8;
                        mPPointF = centerCircleBox;
                        f5 = radius;
                        i4 = i10;
                        fArr4 = fArr8;
                        i3 = i12;
                        str = str2;
                        valueFormatter = valueFormatter3;
                        i5 = i13;
                        z3 = false;
                        i6 = i11;
                        iPieDataSet2 = iPieDataSet4;
                        f6 = f14;
                        mPPointF2 = mPPointF5;
                        fArr5 = fArr6;
                    }
                    if (z || z9) {
                        centerCircleBox = mPPointF;
                        float f29 = (f13 * fCos) + centerCircleBox.x;
                        float f30 = (f13 * fSin) + centerCircleBox.y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        double d3 = ((double) f6) % 360.0d;
                        boolean z11 = (d3 < 90.0d || d3 > 270.0d) ? z3 : true;
                        if (z && z9) {
                            IPieDataSet iPieDataSet5 = iPieDataSet2;
                            f10 = fSin;
                            iPieDataSet3 = iPieDataSet5;
                            int iCopydefault3 = copydefault(canvas, pieLabel, f29, f30, iPieDataSet5.getValueTextColor(i6), z11);
                            if (i6 < pieData.getEntryCount() && str != null) {
                                drawEntryLabel(canvas3, str, f29, f30 + (iCopydefault3 * fCalcTextHeight));
                            }
                        } else {
                            IPieDataSet iPieDataSet6 = iPieDataSet2;
                            f10 = fSin;
                            iPieDataSet3 = iPieDataSet6;
                            if (z) {
                                if (i6 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas3, str, f29, f30 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z9) {
                                copydefault(canvas, pieLabel, f29, f30, iPieDataSet3.getValueTextColor(i6), z11);
                            }
                        }
                    } else {
                        centerCircleBox = mPPointF;
                        IPieDataSet iPieDataSet7 = iPieDataSet2;
                        f10 = fSin;
                        iPieDataSet3 = iPieDataSet7;
                    }
                    if (entryForIndex.getIcon() == null || !iPieDataSet3.isDrawIconsEnabled()) {
                        mPPointF3 = mPPointF2;
                    } else {
                        android.graphics.drawable.Drawable icon = entryForIndex.getIcon();
                        mPPointF3 = mPPointF2;
                        float f31 = f13 + mPPointF3.y;
                        com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) ((fCos * f31) + centerCircleBox.x), (int) ((f31 * f10) + centerCircleBox.y + mPPointF3.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i9++;
                    i11 = i6 + 1;
                    iPieDataSet4 = iPieDataSet3;
                    iHeight = i5;
                    fArr6 = fArr5;
                    entryCount = i3;
                    yValuePosition = valuePosition;
                    absoluteAngles = fArr10;
                    drawAngles = fArr9;
                    phaseX = f15;
                    phaseY = f16;
                    xValuePosition = valuePosition2;
                    fArr7 = fArr4;
                    radius = f5;
                    mPPointF5 = mPPointF3;
                    i10 = i4;
                    valueFormatter2 = valueFormatter;
                }
                canvas2 = canvas;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                i = i10;
                c = 0;
                MPPointF.recycleInstance(mPPointF5);
                i7 = i9;
            } else {
                i = i8;
                list = dataSets;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                c = c2;
                canvas2 = canvas5;
            }
            i8 = i + 1;
            canvas5 = canvas2;
            c2 = c;
            dataSets = list;
            absoluteAngles = fArr2;
            drawAngles = fArr;
            phaseX = f2;
            phaseY = f3;
            radius = f;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    public final int copydefault(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i, boolean z) {
        float f3;
        float fConvertDpToPixel;
        RectF contentRect = this.mViewPortHandler.getContentRect();
        Paint.Align align = z ? Paint.Align.RIGHT : Paint.Align.LEFT;
        this.mValuePaint.setColor(i);
        this.mValuePaint.setTextAlign(align);
        if (z) {
            f3 = f - contentRect.left;
            fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(6.0f);
        } else {
            f3 = contentRect.right - f;
            fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(6.0f);
        }
        java.util.List<java.lang.String> listOLrzqt = OLrzqt(str, f3 - fConvertDpToPixel);
        float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "Q");
        float fConvertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
        for (int i2 = 0; i2 < listOLrzqt.size(); i2++) {
            canvas.drawText(listOLrzqt.get(i2), f, (i2 * (fCalcTextHeight + fConvertDpToPixel2)) + f2, this.mValuePaint);
        }
        return listOLrzqt.size();
    }

    public final java.util.List<java.lang.String> OLrzqt(java.lang.String str, float f) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f > 0.0f && str != null && !str.isEmpty()) {
            java.lang.String[] strArrSplit = str.split(" ");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.String str2 : strArrSplit) {
                if (this.mValuePaint.measureText(((java.lang.Object) sb) + str2) <= f) {
                    sb.append(str2);
                    sb.append(" ");
                } else if (sb.length() > 0) {
                    arrayList.add(sb.toString().trim());
                    sb = new java.lang.StringBuilder(str2 + " ");
                } else {
                    arrayList.add(str2);
                }
            }
            if (sb.length() > 0) {
                arrayList.add(sb.toString().trim());
            }
        }
        return arrayList;
    }
}
