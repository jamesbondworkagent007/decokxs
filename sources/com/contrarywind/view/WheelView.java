package com.contrarywind.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.contrarywind.adapter.WheelAdapter;
import com.contrarywind.interfaces.IPickerViewData;
import com.contrarywind.listener.LoopViewGestureListener;
import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.timer.InertiaTimerTask;
import com.contrarywind.timer.MessageHandler;
import com.contrarywind.timer.SmoothScrollTimerTask;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class WheelView extends View {
    public static final float SCALE_CONTENT = 0.8f;
    public static final String[] TIME_NUM = {"00", HiAnalyticsConstant.KeyAndValue.NUMBER_01, "02", "03", "04", "05", "06", "07", "08", "09"};
    public static final int VELOCITY_FLING = 5;
    public float CENTER_CONTENT_OFFSET;
    public WheelAdapter adapter;
    public float centerY;
    public Context context;
    public int dividerColor;
    public DividerType dividerType;
    public int dividerWidth;
    public int drawCenterContentStart;
    public int drawOutContentStart;
    public float firstLineY;
    public GestureDetector gestureDetector;
    public Handler handler;
    public int initPosition;
    public boolean isAlphaGradient;
    public boolean isCenterLabel;
    public boolean isLoop;
    public boolean isOptions;
    public float itemHeight;
    public int itemsVisible;
    public String label;
    public float lineSpacingMultiplier;
    public ScheduledExecutorService mExecutor;
    public ScheduledFuture<?> mFuture;
    public int mGravity;
    public int mOffset;
    public int maxTextHeight;
    public int maxTextWidth;
    public int measuredHeight;
    public int measuredWidth;
    public OnItemSelectedListener onItemSelectedListener;
    public Paint paintCenterText;
    public Paint paintIndicator;
    public Paint paintOuterText;
    public int preCurrentIndex;
    public float previousY;
    public int radius;
    public float secondLineY;
    public int selectedItem;
    public long startTime;
    public int textColorCenter;
    public int textColorOut;
    public int textSize;
    public int textXOffset;
    public float totalScrollY;
    public Typeface typeface;
    public int widthMeasureSpec;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP,
        CIRCLE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WheelAdapter getAdapter() {
        return this.adapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public Handler getHandler() {
        return this.handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getInitPosition() {
        return this.initPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getItemHeight() {
        return this.itemHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getTotalScrollY() {
        return this.totalScrollY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void isCenterLabel(boolean z) {
        this.isCenterLabel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLoop() {
        return this.isLoop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void judgeLineSpace() {
        float f = this.lineSpacingMultiplier;
        float f2 = 1.0f;
        if (f >= 1.0f) {
            f2 = 4.0f;
            if (f <= 4.0f) {
                return;
            }
        }
        this.lineSpacingMultiplier = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAlphaGradient(boolean z) {
        this.isAlphaGradient = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCyclic(boolean z) {
        this.isLoop = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDividerType(DividerType dividerType) {
        this.dividerType = dividerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGravity(int i) {
        this.mGravity = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIsOptions(boolean z) {
        this.isOptions = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLabel(String str) {
        this.label = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTotalScrollY(float f) {
        this.totalScrollY = f;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WheelView(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet);
        this.isOptions = false;
        this.isCenterLabel = true;
        this.mExecutor = Executors.newSingleThreadScheduledExecutor();
        this.typeface = Typeface.MONOSPACE;
        this.lineSpacingMultiplier = 1.6f;
        this.itemsVisible = 11;
        this.mOffset = 0;
        this.previousY = 0.0f;
        this.startTime = 0L;
        this.mGravity = 17;
        this.drawCenterContentStart = 0;
        this.drawOutContentStart = 0;
        this.isAlphaGradient = false;
        this.textSize = getResources().getDimensionPixelSize(R.dimen.pickerview_textsize);
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 < 1.0f) {
            f = 2.4f;
        } else if (1.0f <= f2 && f2 < 2.0f) {
            f = 4.0f;
        } else {
            if (2.0f > f2 || f2 >= 3.0f) {
                if (f2 >= 3.0f) {
                    f = f2 * 2.5f;
                }
                if (attributeSet != null) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.pickerview, 0, 0);
                    this.mGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.pickerview_wheelview_gravity, 17);
                    this.textColorOut = typedArrayObtainStyledAttributes.getColor(R.styleable.pickerview_wheelview_textColorOut, -5723992);
                    this.textColorCenter = typedArrayObtainStyledAttributes.getColor(R.styleable.pickerview_wheelview_textColorCenter, -14013910);
                    this.dividerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.pickerview_wheelview_dividerColor, -2763307);
                    this.dividerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.pickerview_wheelview_dividerWidth, 2);
                    this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.pickerview_wheelview_textSize, this.textSize);
                    this.lineSpacingMultiplier = typedArrayObtainStyledAttributes.getFloat(R.styleable.pickerview_wheelview_lineSpacingMultiplier, this.lineSpacingMultiplier);
                    typedArrayObtainStyledAttributes.recycle();
                }
                judgeLineSpace();
                initLoopView(context);
            }
            f = 6.0f;
        }
        this.CENTER_CONTENT_OFFSET = f;
        if (attributeSet != null) {
        }
        judgeLineSpace();
        initLoopView(context);
    }

    public final void initLoopView(Context context) {
        this.context = context;
        this.handler = new MessageHandler(this);
        GestureDetector gestureDetector = new GestureDetector(context, new LoopViewGestureListener(this));
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.isLoop = true;
        this.totalScrollY = 0.0f;
        this.initPosition = -1;
        initPaints();
    }

    public final void initPaints() {
        Paint paint = new Paint();
        this.paintOuterText = paint;
        paint.setColor(this.textColorOut);
        this.paintOuterText.setAntiAlias(true);
        this.paintOuterText.setTypeface(this.typeface);
        this.paintOuterText.setTextSize(this.textSize);
        Paint paint2 = new Paint();
        this.paintCenterText = paint2;
        paint2.setColor(this.textColorCenter);
        this.paintCenterText.setAntiAlias(true);
        this.paintCenterText.setTextScaleX(1.1f);
        this.paintCenterText.setTypeface(this.typeface);
        this.paintCenterText.setTextSize(this.textSize);
        Paint paint3 = new Paint();
        this.paintIndicator = paint3;
        paint3.setColor(this.dividerColor);
        this.paintIndicator.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void reMeasure() {
        if (this.adapter == null) {
            return;
        }
        measureTextWidthHeight();
        int i = (int) (this.itemHeight * (this.itemsVisible - 1));
        this.measuredHeight = (int) (((double) (i * 2)) / 3.141592653589793d);
        this.radius = (int) (((double) i) / 3.141592653589793d);
        this.measuredWidth = View.MeasureSpec.getSize(this.widthMeasureSpec);
        float f = this.measuredHeight;
        float f2 = this.itemHeight;
        this.firstLineY = (f - f2) / 2.0f;
        float f3 = (f + f2) / 2.0f;
        this.secondLineY = f3;
        this.centerY = (f3 - ((f2 - this.maxTextHeight) / 2.0f)) - this.CENTER_CONTENT_OFFSET;
        if (this.initPosition == -1) {
            this.initPosition = this.isLoop ? (this.adapter.getItemsCount() + 1) / 2 : 0;
        }
        this.preCurrentIndex = this.initPosition;
    }

    public final void measureTextWidthHeight() {
        Rect rect = new Rect();
        for (int i = 0; i < this.adapter.getItemsCount(); i++) {
            String contentText = getContentText(this.adapter.getItem(i));
            this.paintCenterText.getTextBounds(contentText, 0, contentText.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.maxTextWidth) {
                this.maxTextWidth = iWidth;
            }
        }
        this.paintCenterText.getTextBounds("星期", 0, 2, rect);
        int iHeight = rect.height() + 2;
        this.maxTextHeight = iHeight;
        this.itemHeight = this.lineSpacingMultiplier * iHeight;
    }

    public void smoothScroll(ACTION action) {
        cancelFuture();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.totalScrollY;
            float f2 = this.itemHeight;
            int i = (int) (((f % f2) + f2) % f2);
            this.mOffset = i;
            float f3 = i;
            this.mOffset = f3 > f2 / 2.0f ? (int) (f2 - f3) : -i;
        }
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new SmoothScrollTimerTask(this, this.mOffset), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final void scrollBy(float f) {
        cancelFuture();
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new InertiaTimerTask(this, f), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    public void cancelFuture() {
        ScheduledFuture<?> scheduledFuture = this.mFuture;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.mFuture.cancel(true);
        this.mFuture = null;
    }

    public final void setTypeface(Typeface typeface) {
        this.typeface = typeface;
        this.paintOuterText.setTypeface(typeface);
        this.paintCenterText.setTypeface(this.typeface);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.context.getResources().getDisplayMetrics().density * f);
            this.textSize = i;
            this.paintOuterText.setTextSize(i);
            this.paintCenterText.setTextSize(this.textSize);
        }
    }

    public final void setCurrentItem(int i) {
        this.selectedItem = i;
        this.initPosition = i;
        this.totalScrollY = 0.0f;
        invalidate();
    }

    public final void setAdapter(WheelAdapter wheelAdapter) {
        this.adapter = wheelAdapter;
        reMeasure();
        invalidate();
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        this.itemsVisible = i + 2;
    }

    public final int getCurrentItem() {
        int i;
        WheelAdapter wheelAdapter = this.adapter;
        if (wheelAdapter == null) {
            return 0;
        }
        if (this.isLoop && ((i = this.selectedItem) < 0 || i >= wheelAdapter.getItemsCount())) {
            return Math.max(0, Math.min(Math.abs(Math.abs(this.selectedItem) - this.adapter.getItemsCount()), this.adapter.getItemsCount() - 1));
        }
        return Math.max(0, Math.min(this.selectedItem, this.adapter.getItemsCount() - 1));
    }

    public final void onItemSelected() {
        if (this.onItemSelectedListener != null) {
            postDelayed(new Runnable() { // from class: com.contrarywind.view.WheelView.1
                @Override // java.lang.Runnable
                public void run() {
                    WheelView.this.onItemSelectedListener.onItemSelected(WheelView.this.getCurrentItem());
                }
            }, 200L);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object item;
        boolean z;
        float f;
        String contentText;
        int i;
        if (this.adapter == null) {
            return;
        }
        boolean z2 = false;
        int iMin = Math.min(Math.max(0, this.initPosition), this.adapter.getItemsCount() - 1);
        this.initPosition = iMin;
        try {
            this.preCurrentIndex = iMin + (((int) (this.totalScrollY / this.itemHeight)) % this.adapter.getItemsCount());
        } catch (ArithmeticException unused) {
        }
        if (!this.isLoop) {
            if (this.preCurrentIndex < 0) {
                this.preCurrentIndex = 0;
            }
            if (this.preCurrentIndex > this.adapter.getItemsCount() - 1) {
                this.preCurrentIndex = this.adapter.getItemsCount() - 1;
            }
        } else {
            if (this.preCurrentIndex < 0) {
                this.preCurrentIndex = this.adapter.getItemsCount() + this.preCurrentIndex;
            }
            if (this.preCurrentIndex > this.adapter.getItemsCount() - 1) {
                this.preCurrentIndex -= this.adapter.getItemsCount();
            }
        }
        float f2 = this.totalScrollY % this.itemHeight;
        DividerType dividerType = this.dividerType;
        if (dividerType == DividerType.WRAP) {
            if (TextUtils.isEmpty(this.label)) {
                i = (this.measuredWidth - this.maxTextWidth) / 2;
            } else {
                i = (this.measuredWidth - this.maxTextWidth) / 4;
            }
            float f3 = i - 12;
            float f4 = f3 <= 0.0f ? 10.0f : f3;
            float f5 = this.measuredWidth - f4;
            float f6 = this.firstLineY;
            float f7 = f4;
            canvas.drawLine(f7, f6, f5, f6, this.paintIndicator);
            float f8 = this.secondLineY;
            canvas.drawLine(f7, f8, f5, f8, this.paintIndicator);
        } else if (dividerType == DividerType.CIRCLE) {
            this.paintIndicator.setStyle(Paint.Style.STROKE);
            this.paintIndicator.setStrokeWidth(this.dividerWidth);
            float f9 = (TextUtils.isEmpty(this.label) ? (this.measuredWidth - this.maxTextWidth) / 2.0f : (this.measuredWidth - this.maxTextWidth) / 4.0f) - 12.0f;
            float f10 = f9 > 0.0f ? f9 : 10.0f;
            canvas.drawCircle(this.measuredWidth / 2.0f, this.measuredHeight / 2.0f, Math.max((this.measuredWidth - f10) - f10, this.itemHeight) / 1.8f, this.paintIndicator);
        } else {
            float f11 = this.firstLineY;
            canvas.drawLine(0.0f, f11, this.measuredWidth, f11, this.paintIndicator);
            float f12 = this.secondLineY;
            canvas.drawLine(0.0f, f12, this.measuredWidth, f12, this.paintIndicator);
        }
        if (!TextUtils.isEmpty(this.label) && this.isCenterLabel) {
            canvas.drawText(this.label, (this.measuredWidth - getTextWidth(this.paintCenterText, this.label)) - this.CENTER_CONTENT_OFFSET, this.centerY, this.paintCenterText);
        }
        int i2 = 0;
        while (true) {
            int i3 = this.itemsVisible;
            if (i2 >= i3) {
                return;
            }
            int i4 = this.preCurrentIndex - ((i3 / 2) - i2);
            if (this.isLoop) {
                item = this.adapter.getItem(getLoopMappingIndex(i4));
            } else if (i4 >= 0 && i4 <= this.adapter.getItemsCount() - 1) {
                item = this.adapter.getItem(i4);
            } else {
                item = "";
            }
            canvas.save();
            double d = ((this.itemHeight * i2) - f2) / this.radius;
            float f13 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
            if (f13 > 90.0f || f13 < -90.0f) {
                z = z2;
                f = f2;
                canvas.restore();
            } else {
                if (!this.isCenterLabel && !TextUtils.isEmpty(this.label) && !TextUtils.isEmpty(getContentText(item))) {
                    contentText = getContentText(item) + this.label;
                } else {
                    contentText = getContentText(item);
                }
                float fPow = (float) Math.pow(Math.abs(f13) / 90.0f, 2.2d);
                reMeasureTextSize(contentText);
                measuredCenterContentStart(contentText);
                measuredOutContentStart(contentText);
                f = f2;
                float fCos = (float) ((((double) this.radius) - (Math.cos(d) * ((double) this.radius))) - ((Math.sin(d) * ((double) this.maxTextHeight)) / 2.0d));
                canvas.translate(0.0f, fCos);
                float f14 = this.firstLineY;
                if (fCos > f14 || this.maxTextHeight + fCos < f14) {
                    float f15 = this.secondLineY;
                    if (fCos <= f15 && this.maxTextHeight + fCos >= f15) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.measuredWidth, this.secondLineY - fCos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(contentText, this.drawCenterContentStart, this.maxTextHeight - this.CENTER_CONTENT_OFFSET, this.paintCenterText);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.secondLineY - fCos, this.measuredWidth, (int) this.itemHeight);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        setOutPaintStyle(fPow, f13);
                        canvas.drawText(contentText, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                    } else {
                        if (fCos >= f14) {
                            float f16 = this.maxTextHeight;
                            if (fCos + f16 <= f15) {
                                canvas.drawText(contentText, this.drawCenterContentStart, f16 - this.CENTER_CONTENT_OFFSET, this.paintCenterText);
                                this.selectedItem = this.preCurrentIndex - ((this.itemsVisible / 2) - i2);
                            }
                        }
                        canvas.save();
                        z = false;
                        canvas.clipRect(0, 0, this.measuredWidth, (int) this.itemHeight);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        setOutPaintStyle(fPow, f13);
                        canvas.drawText(contentText, this.drawOutContentStart + (this.textXOffset * fPow), this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                        canvas.restore();
                        this.paintCenterText.setTextSize(this.textSize);
                    }
                } else {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, this.measuredWidth, this.firstLineY - fCos);
                    canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                    setOutPaintStyle(fPow, f13);
                    canvas.drawText(contentText, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0.0f, this.firstLineY - fCos, this.measuredWidth, (int) this.itemHeight);
                    canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                    canvas.drawText(contentText, this.drawCenterContentStart, this.maxTextHeight - this.CENTER_CONTENT_OFFSET, this.paintCenterText);
                    canvas.restore();
                }
                z = false;
                canvas.restore();
                this.paintCenterText.setTextSize(this.textSize);
            }
            i2++;
            z2 = z;
            f2 = f;
        }
    }

    public final void setOutPaintStyle(float f, float f2) {
        int i = this.textXOffset;
        this.paintOuterText.setTextSkewX((i > 0 ? 1 : i < 0 ? -1 : 0) * (f2 > 0.0f ? -1 : 1) * 0.5f * f);
        this.paintOuterText.setAlpha(this.isAlphaGradient ? (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f) : 255);
    }

    public final void reMeasureTextSize(String str) {
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        int i = this.textSize;
        for (int iWidth = rect.width(); iWidth > this.measuredWidth; iWidth = rect.width()) {
            i--;
            this.paintCenterText.setTextSize(i);
            this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        }
        this.paintOuterText.setTextSize(i);
    }

    public final int getLoopMappingIndex(int i) {
        if (i < 0) {
            return getLoopMappingIndex(i + this.adapter.getItemsCount());
        }
        return i > this.adapter.getItemsCount() + (-1) ? getLoopMappingIndex(i - this.adapter.getItemsCount()) : i;
    }

    public final String getContentText(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof IPickerViewData) {
            return ((IPickerViewData) obj).getPickerViewText();
        }
        if (obj instanceof Integer) {
            return getFixNum(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    public final String getFixNum(int i) {
        return (i < 0 || i >= 10) ? String.valueOf(i) : TIME_NUM[i];
    }

    public final void measuredCenterContentStart(String str) {
        String str2;
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        int i = this.mGravity;
        if (i == 3) {
            this.drawCenterContentStart = 0;
            return;
        }
        if (i == 5) {
            this.drawCenterContentStart = (this.measuredWidth - rect.width()) - ((int) this.CENTER_CONTENT_OFFSET);
            return;
        }
        if (i != 17) {
            return;
        }
        if (this.isOptions || (str2 = this.label) == null || str2.equals("") || !this.isCenterLabel) {
            this.drawCenterContentStart = (int) (((double) (this.measuredWidth - rect.width())) * 0.5d);
        } else {
            this.drawCenterContentStart = (int) (((double) (this.measuredWidth - rect.width())) * 0.25d);
        }
    }

    public final void measuredOutContentStart(String str) {
        String str2;
        Rect rect = new Rect();
        this.paintOuterText.getTextBounds(str, 0, str.length(), rect);
        int i = this.mGravity;
        if (i == 3) {
            this.drawOutContentStart = 0;
            return;
        }
        if (i == 5) {
            this.drawOutContentStart = (this.measuredWidth - rect.width()) - ((int) this.CENTER_CONTENT_OFFSET);
            return;
        }
        if (i != 17) {
            return;
        }
        if (this.isOptions || (str2 = this.label) == null || str2.equals("") || !this.isCenterLabel) {
            this.drawOutContentStart = (int) (((double) (this.measuredWidth - rect.width())) * 0.5d);
        } else {
            this.drawOutContentStart = (int) (((double) (this.measuredWidth - rect.width())) * 0.25d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.widthMeasureSpec = i;
        reMeasure();
        setMeasuredDimension(this.measuredWidth, this.measuredHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.gestureDetector.onTouchEvent(motionEvent);
        float f = -this.initPosition;
        float f2 = this.itemHeight;
        float itemsCount = (this.adapter.getItemsCount() - 1) - this.initPosition;
        float f3 = this.itemHeight;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startTime = System.currentTimeMillis();
            cancelFuture();
            this.previousY = motionEvent.getRawY();
        } else {
            if (action == 2) {
                float rawY = this.previousY - motionEvent.getRawY();
                this.previousY = motionEvent.getRawY();
                float f4 = this.totalScrollY + rawY;
                this.totalScrollY = f4;
                if (!this.isLoop) {
                    float f5 = this.itemHeight * 0.25f;
                    if ((f4 - f5 < f * f2 && rawY < 0.0f) || (f5 + f4 > itemsCount * f3 && rawY > 0.0f)) {
                        this.totalScrollY = f4 - rawY;
                    }
                }
                return true;
            }
            if (!zOnTouchEvent) {
                float y = motionEvent.getY();
                float f6 = this.radius;
                double dAcos = Math.acos((f6 - y) / f6);
                double d = this.radius;
                float f7 = this.itemHeight;
                this.mOffset = (int) (((((int) (((dAcos * d) + ((double) (f7 / 2.0f))) / ((double) f7))) - (this.itemsVisible / 2)) * f7) - (((this.totalScrollY % f7) + f7) % f7));
                if (System.currentTimeMillis() - this.startTime > 120) {
                    smoothScroll(ACTION.DAGGLE);
                } else {
                    smoothScroll(ACTION.CLICK);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public int getItemsCount() {
        WheelAdapter wheelAdapter = this.adapter;
        if (wheelAdapter != null) {
            return wheelAdapter.getItemsCount();
        }
        return 0;
    }

    public int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int iCeil = 0;
        for (int i = 0; i < length; i++) {
            iCeil += (int) Math.ceil(r2[i]);
        }
        return iCeil;
    }

    public void setTextColorOut(int i) {
        this.textColorOut = i;
        this.paintOuterText.setColor(i);
    }

    public void setTextColorCenter(int i) {
        this.textColorCenter = i;
        this.paintCenterText.setColor(i);
    }

    public void setTextXOffset(int i) {
        this.textXOffset = i;
        if (i != 0) {
            this.paintCenterText.setTextScaleX(1.0f);
        }
    }

    public void setDividerWidth(int i) {
        this.dividerWidth = i;
        this.paintIndicator.setStrokeWidth(i);
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
        this.paintIndicator.setColor(i);
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.lineSpacingMultiplier = f;
            judgeLineSpace();
        }
    }
}
