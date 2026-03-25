package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;

    @Override // com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
    }

    public abstract int getIndexForAngle(float f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getMinOffset() {
        return this.mMinOffset;
    }

    public abstract float getRadius();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getRawRotationAngle() {
        return this.mRawRotationAngle;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getRotationAngle() {
        return this.mRotationAngle;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRotationEnabled(boolean z) {
        this.mRotateEnabled = z;
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mChartTouchListener = new PieRadarChartTouchListener(this);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        if (this.mTouchEnabled && (chartTouchListener = this.mChartTouchListener) != null) {
            return chartTouchListener.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            ((PieRadarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r2 != 2) goto L52;
     */
    @Override // com.github.mikephil.charting.charts.Chart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float f;
        float fConvertDpToPixel;
        float f2;
        float f3;
        float fMin;
        Legend legend = this.mLegend;
        float f4 = 0.0f;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            f = 0.0f;
        } else {
            float fMin2 = Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent());
            int i = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
            if (i == 1) {
                if (this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.RIGHT) {
                    fConvertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.CENTER) {
                    fConvertDpToPixel = fMin2 + Utils.convertDpToPixel(13.0f);
                } else {
                    fConvertDpToPixel = fMin2 + Utils.convertDpToPixel(8.0f);
                    Legend legend2 = this.mLegend;
                    float f5 = legend2.mNeededHeight;
                    float f6 = legend2.mTextHeightMax;
                    MPPointF center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - fConvertDpToPixel) + 15.0f : fConvertDpToPixel - 15.0f;
                    float f7 = f5 + f6 + 15.0f;
                    float fDistanceToCenter = distanceToCenter(width, f7);
                    MPPointF position = getPosition(center, getRadius(), getAngleForPoint(width, f7));
                    float fDistanceToCenter2 = distanceToCenter(position.x, position.y);
                    float fConvertDpToPixel2 = Utils.convertDpToPixel(5.0f);
                    if (f7 < center.y || getHeight() - fConvertDpToPixel <= getWidth()) {
                        fConvertDpToPixel = fDistanceToCenter < fDistanceToCenter2 ? fConvertDpToPixel2 + (fDistanceToCenter2 - fDistanceToCenter) : 0.0f;
                    }
                    MPPointF.recycleInstance(center);
                    MPPointF.recycleInstance(position);
                }
                int i2 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            int i3 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                            if (i3 == 1) {
                                fMin = Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                                f2 = fMin;
                                fConvertDpToPixel = 0.0f;
                                f3 = 0.0f;
                                float requiredBaseOffset3 = f4 + getRequiredBaseOffset();
                                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                                requiredBaseOffset2 = f2 + getRequiredBaseOffset();
                                float requiredBaseOffset4 = f3 + getRequiredBaseOffset();
                                f = requiredBaseOffset3;
                                f4 = requiredBaseOffset4;
                            } else if (i3 == 2) {
                                fMin = Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                                f3 = fMin;
                                fConvertDpToPixel = 0.0f;
                                f2 = 0.0f;
                                float requiredBaseOffset32 = f4 + getRequiredBaseOffset();
                                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                                requiredBaseOffset2 = f2 + getRequiredBaseOffset();
                                float requiredBaseOffset42 = f3 + getRequiredBaseOffset();
                                f = requiredBaseOffset32;
                                f4 = requiredBaseOffset42;
                            }
                        }
                        fConvertDpToPixel = 0.0f;
                    }
                    f2 = 0.0f;
                    f3 = 0.0f;
                    float requiredBaseOffset322 = f4 + getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset2 = f2 + getRequiredBaseOffset();
                    float requiredBaseOffset422 = f3 + getRequiredBaseOffset();
                    f = requiredBaseOffset322;
                    f4 = requiredBaseOffset422;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = fConvertDpToPixel;
                    fConvertDpToPixel = 0.0f;
                    float requiredBaseOffset3222 = f4 + getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset2 = f2 + getRequiredBaseOffset();
                    float requiredBaseOffset4222 = f3 + getRequiredBaseOffset();
                    f = requiredBaseOffset3222;
                    f4 = requiredBaseOffset4222;
                }
            } else {
                if (i == 2 && (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.BOTTOM)) {
                    fMin = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                    int i4 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i4 != 1) {
                    }
                    f2 = fMin;
                    fConvertDpToPixel = 0.0f;
                    f3 = 0.0f;
                    float requiredBaseOffset32222 = f4 + getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset2 = f2 + getRequiredBaseOffset();
                    float requiredBaseOffset42222 = f3 + getRequiredBaseOffset();
                    f = requiredBaseOffset32222;
                    f4 = requiredBaseOffset42222;
                }
                fConvertDpToPixel = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                float requiredBaseOffset322222 = f4 + getRequiredBaseOffset();
                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                requiredBaseOffset2 = f2 + getRequiredBaseOffset();
                float requiredBaseOffset422222 = f3 + getRequiredBaseOffset();
                f = requiredBaseOffset322222;
                f4 = requiredBaseOffset422222;
            }
        }
        float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof RadarChart) {
            XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fConvertDpToPixel3 = Math.max(fConvertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel3, f + getExtraLeftOffset()), Math.max(fConvertDpToPixel3, requiredBaseOffset2 + getExtraTopOffset()), Math.max(fConvertDpToPixel3, requiredBaseOffset + getExtraRightOffset()), Math.max(fConvertDpToPixel3, Math.max(getRequiredBaseOffset(), f4 + getExtraBottomOffset())));
        boolean z = this.mLogEnabled;
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public float getAngleForPoint(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.x;
        double d2 = f2 - centerOffsets.y;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.x) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        MPPointF.recycleInstance(centerOffsets);
        return f3;
    }

    public MPPointF getPosition(MPPointF mPPointF, float f, float f2) {
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f, f2, mPPointF2);
        return mPPointF2;
    }

    public void getPosition(MPPointF mPPointF, float f, float f2, MPPointF mPPointF2) {
        double d = f;
        double d2 = f2;
        mPPointF2.x = (float) (((double) mPPointF.x) + (Math.cos(Math.toRadians(d2)) * d));
        mPPointF2.y = (float) (((double) mPPointF.y) + (d * Math.sin(Math.toRadians(d2))));
    }

    public float distanceToCenter(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.x;
        float fSqrt = (float) Math.sqrt(Math.pow(f > f3 ? f - f3 : f3 - f, 2.0d) + Math.pow(f2 > centerOffsets.y ? f2 - r1 : r1 - f2, 2.0d));
        MPPointF.recycleInstance(centerOffsets);
        return fSqrt;
    }

    public void setRotationAngle(float f) {
        this.mRawRotationAngle = f;
        this.mRotationAngle = Utils.getNormalizedAngle(f);
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left += getExtraLeftOffset();
        contentRect.top += getExtraTopOffset();
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public void spin(int i, float f, float f2, Easing.EasingFunction easingFunction) {
        setRotationAngle(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f, f2);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.PieRadarChartBase.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PieRadarChartBase.this.postInvalidate();
            }
        });
        objectAnimatorOfFloat.start();
    }
}
