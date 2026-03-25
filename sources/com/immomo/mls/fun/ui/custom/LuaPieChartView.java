package com.immomo.mls.fun.ui.custom;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.ContextCompat;
import com.immomo.mls.fun.ud.view.UDPieChartView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C32113mPz;
import o.C33052mpF;
import o.C33490mxT;
import o.C55296xhK;
import o.InterfaceC7383aim;
import o.pTB;

/* JADX INFO: loaded from: classes3.dex */
public class LuaPieChartView extends View implements InterfaceC7383aim<UDPieChartView> {
    private int[] DEFAULT_COLOR;
    private float allAngle;
    private ArrayList<Float> angles;
    private float contentPadding;
    private float contentRadius;
    private RectF contentRectF;
    private InterfaceC7383aim.ActionBar cycleCallback;
    private float innerRadius;
    private boolean isRTL;
    private boolean isTouch;
    private float mCenterX;
    private float mCenterY;
    private Paint mCirclePaint;
    private int mContentBgColor;
    private int mContentColor;
    private TextPaint mContentPaint;
    private ArrayList<ItemData> mList;
    private ArrayList<Activity> mListStart;
    private Path mPath;
    private Region mRegion;
    private int mSpaceColor;
    private Paint mSpacePaint;
    private Paint mTagPaint;
    private int mTitleColor;
    private TextPaint mTitlePaint;
    private float mTouchX;
    private float mTouchY;
    private float mWidth;
    private float marginBottm;
    private float marginLeft;
    private float marginTag;
    private float maxContentWidth;
    private RectF outOval;
    private RectF oval;
    private float progress;
    private float ringWidth;
    private float spaceAngle;
    private float tagWidth;
    private UDPieChartView userdata;
    private float zoomWidth;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private float getTitleWidth() {
        float f = this.mWidth;
        float f2 = this.innerRadius;
        float f3 = this.ringWidth;
        float f4 = this.zoomWidth;
        return ((((f - (((f2 + f3) + f4) * 2.0f)) - this.marginLeft) - this.tagWidth) - this.marginTag) - f4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDPieChartView getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPieChartColors(int[] iArr) {
        this.DEFAULT_COLOR = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaPieChartView(Context context) {
        super(context);
        this.DEFAULT_COLOR = new int[]{Color.parseColor("#3877FF"), Color.parseColor("#28A2BC"), Color.parseColor("#2AA97F"), Color.parseColor("#7BBE5E"), Color.parseColor("#E8BF3B"), Color.parseColor("#F19341"), Color.parseColor("#E35E6E"), Color.parseColor("#A241DE"), Color.parseColor("#D743E3"), Color.parseColor("#3B54A3")};
        this.mTitleColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.zLjUOn);
        this.mContentColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.hDKMBd);
        this.mSpaceColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.QKVWgx);
        this.mContentBgColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.QKVWgx);
        this.mCenterX = 0.0f;
        this.mCenterY = 0.0f;
        this.progress = 0.0f;
        this.allAngle = 0.0f;
        this.spaceAngle = 1.0f;
        this.tagWidth = 0.0f;
        this.marginTag = 0.0f;
        this.marginLeft = 0.0f;
        this.marginBottm = 0.0f;
        this.contentRadius = 0.0f;
        this.contentPadding = 0.0f;
        this.maxContentWidth = 0.0f;
        this.innerRadius = 0.0f;
        this.zoomWidth = 0.0f;
        this.isTouch = false;
        this.mTouchX = 0.0f;
        this.mTouchY = 0.0f;
        this.mPath = new Path();
        this.ringWidth = 0.0f;
        this.isRTL = false;
        this.mListStart = new ArrayList<>();
        this.mWidth = 0.0f;
        this.mList = new ArrayList<>();
    }

    public LuaPieChartView(Context context, UDPieChartView uDPieChartView) {
        super(context);
        this.DEFAULT_COLOR = new int[]{Color.parseColor("#3877FF"), Color.parseColor("#28A2BC"), Color.parseColor("#2AA97F"), Color.parseColor("#7BBE5E"), Color.parseColor("#E8BF3B"), Color.parseColor("#F19341"), Color.parseColor("#E35E6E"), Color.parseColor("#A241DE"), Color.parseColor("#D743E3"), Color.parseColor("#3B54A3")};
        this.mTitleColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.zLjUOn);
        this.mContentColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.hDKMBd);
        this.mSpaceColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.QKVWgx);
        this.mContentBgColor = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.QKVWgx);
        this.mCenterX = 0.0f;
        this.mCenterY = 0.0f;
        this.progress = 0.0f;
        this.allAngle = 0.0f;
        this.spaceAngle = 1.0f;
        this.tagWidth = 0.0f;
        this.marginTag = 0.0f;
        this.marginLeft = 0.0f;
        this.marginBottm = 0.0f;
        this.contentRadius = 0.0f;
        this.contentPadding = 0.0f;
        this.maxContentWidth = 0.0f;
        this.innerRadius = 0.0f;
        this.zoomWidth = 0.0f;
        this.isTouch = false;
        this.mTouchX = 0.0f;
        this.mTouchY = 0.0f;
        this.mPath = new Path();
        this.ringWidth = 0.0f;
        this.isRTL = false;
        this.mListStart = new ArrayList<>();
        this.mWidth = 0.0f;
        this.mList = new ArrayList<>();
        this.userdata = uDPieChartView;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mCirclePaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mCirclePaint.setStrokeWidth(25.0f);
        this.mCirclePaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.mSpacePaint = paint2;
        paint2.setStyle(style);
        this.mSpacePaint.setStrokeWidth(25.0f);
        this.mSpacePaint.setAntiAlias(true);
        this.mSpacePaint.setColor(this.mSpaceColor);
        TextPaint textPaint = new TextPaint();
        this.mTitlePaint = textPaint;
        Paint.Style style2 = Paint.Style.FILL;
        textPaint.setStyle(style2);
        this.mTitlePaint.setAntiAlias(true);
        this.mTitlePaint.setColor(this.mTitleColor);
        TextPaint textPaint2 = new TextPaint();
        this.mContentPaint = textPaint2;
        textPaint2.setStyle(style2);
        this.mContentPaint.setAntiAlias(true);
        this.mContentPaint.setColor(this.mContentColor);
        Paint paint3 = new Paint();
        this.mTagPaint = paint3;
        paint3.setStyle(style2);
        this.mTagPaint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    public void setTitleConfig(int i, Typeface typeface, float f, float f2, float f3, float f4, float f5) {
        this.mTitlePaint.setColor(i);
        this.mTitlePaint.setTypeface(typeface);
        this.mTitlePaint.setTextSize(C33052mpF.AYXKKw(f, getContext()));
        this.tagWidth = C33052mpF.EZpvd(f2, getContext());
        this.marginTag = C33052mpF.EZpvd(f3, getContext());
        this.marginLeft = C33052mpF.EZpvd(f4, getContext());
        this.marginBottm = C33052mpF.EZpvd(f5, getContext());
    }

    public void setContentConfig(int i, Typeface typeface, float f, int i2, float f2, float f3) {
        this.mContentPaint.setColor(i);
        this.mContentPaint.setTypeface(typeface);
        this.mContentPaint.setTextSize(C33052mpF.AYXKKw(f, getContext()));
        this.mContentBgColor = i2;
        this.contentRadius = C33052mpF.EZpvd(f2, getContext());
        this.contentPadding = C33052mpF.EZpvd(f3, getContext());
    }

    public void setCircleConfig(float f, float f2, float f3, float f4, int i) {
        this.innerRadius = C33052mpF.EZpvd(f, getContext());
        this.ringWidth = C33052mpF.EZpvd(f2, getContext());
        this.zoomWidth = C33052mpF.EZpvd(f3, getContext());
        this.spaceAngle = C33052mpF.EZpvd(f4, getContext());
        this.mSpacePaint.setColor(i);
    }

    public void setData(String str) {
        this.mList.clear();
        try {
            List listAEQbTJ = C33490mxT.AEQbTJ(str, ItemData.class);
            Collections.sort(listAEQbTJ);
            this.mList.addAll(listAEQbTJ);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.mList.size() == 0) {
            return;
        }
        dealData();
        startPathAnim(500L);
    }

    private void dealData() {
        this.allAngle = this.mList.size() * this.spaceAngle;
        this.angles = new ArrayList<>();
        float fFloatValue = 0.0f;
        for (int i = 0; i < this.mList.size(); i++) {
            if (i == this.mList.size() - 1) {
                this.angles.add(i, Float.valueOf((360.0f - this.allAngle) - fFloatValue));
            } else {
                this.angles.add(i, Float.valueOf(this.mList.get(i).percent * (360.0f - this.allAngle)));
                fFloatValue += this.angles.get(i).floatValue();
            }
        }
    }

    private void startPathAnim(Long l) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(l.longValue());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.alG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.copydefault.lambda$startPathAnim$0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPathAnim$0(ValueAnimator valueAnimator) {
        this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mWidth = i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mList.size() == 0) {
            return;
        }
        this.isRTL = C55296xhK.AEQbTJ(this);
        calData();
        drawContent(canvas);
    }

    private void calData() {
        this.mCenterX = this.isRTL ? this.mWidth - ((this.zoomWidth + this.innerRadius) + this.ringWidth) : this.zoomWidth + this.innerRadius + this.ringWidth;
        float f = this.zoomWidth;
        float f2 = this.innerRadius;
        float f3 = this.ringWidth;
        float f4 = f + f2 + f3;
        this.mCenterY = f4;
        float f5 = this.mCenterX;
        float f6 = (f3 + f) / 2.0f;
        this.outOval = new RectF((f5 - f2) - f6, (f4 - f2) - f6, f5 + f2 + f6, f4 + f2 + f6);
        float f7 = this.mCenterX;
        float f8 = this.innerRadius;
        float f9 = this.ringWidth / 2.0f;
        float f10 = this.mCenterY;
        this.oval = new RectF((f7 - f8) - f9, (f10 - f8) - f9, f7 + f8 + f9, f10 + f8 + f9);
        int i = (int) this.zoomWidth;
        float f11 = this.mCenterX;
        float f12 = this.innerRadius;
        float f13 = this.ringWidth;
        this.mRegion = new Region(i, i, (int) (f11 + f12 + f13), (int) (this.mCenterY + f12 + f13));
        this.maxContentWidth = (this.innerRadius + this.ringWidth) * 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawContent(Canvas canvas) {
        ArrayList<Float> arrayList = this.angles;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        if (this.isRTL) {
            dealTagPositionRTL();
            drawTitileRTL(canvas);
        } else {
            dealTagPosition();
            drawTitile(canvas);
        }
        this.mSpacePaint.setStrokeWidth(this.ringWidth);
        float fFloatValue = 0.0f;
        int i = 0;
        int i2 = -1;
        while (i < this.angles.size()) {
            if (i > 0) {
                fFloatValue = fFloatValue + (this.angles.get(i - 1).floatValue() * this.progress) + this.spaceAngle;
            }
            float f = fFloatValue;
            this.mCirclePaint.setStrokeWidth(this.ringWidth);
            Paint paint = this.mCirclePaint;
            int[] iArr = this.DEFAULT_COLOR;
            paint.setColor(iArr[i % iArr.length]);
            if (this.angles.size() == 1) {
                if (this.isTouch && isTouchInArc(canvas, 270.0f, 360.0f)) {
                    this.mCirclePaint.setStrokeWidth(this.zoomWidth + this.ringWidth);
                    canvas.drawArc(this.outOval, 270.0f, this.progress * 360.0f, false, this.mCirclePaint);
                    i2 = i;
                } else {
                    canvas.drawArc(this.oval, 270.0f, this.progress * 360.0f, false, this.mCirclePaint);
                }
            } else if (this.isTouch) {
                float f2 = f + 270.0f;
                if (isTouchInArc(canvas, this.spaceAngle + f2, this.angles.get(i).floatValue() * this.progress)) {
                    this.mCirclePaint.setStrokeWidth(this.zoomWidth + this.ringWidth);
                    canvas.drawArc(this.outOval, f2, this.angles.get(i).floatValue(), false, this.mCirclePaint);
                    i2 = i;
                } else {
                    canvas.drawArc(this.oval, f + 270.0f, this.progress * this.angles.get(i).floatValue(), false, this.mCirclePaint);
                }
                canvas.drawArc(this.oval, 270.0f + f + this.angles.get(i).floatValue(), this.progress * this.spaceAngle, false, this.mSpacePaint);
            }
            i++;
            fFloatValue = f;
        }
        if (!this.isTouch || i2 == -1) {
            return;
        }
        drawTouchText(canvas, i2);
    }

    private void drawTouchText(Canvas canvas, int i) {
        String str = this.mList.get(i).content + " " + pTB.EZpvd(pTB.OLrzqt(Float.valueOf(this.mList.get(i).percent)), 0);
        float fMeasureText = this.mContentPaint.measureText(str);
        float f = this.maxContentWidth;
        if (fMeasureText > f) {
            fMeasureText = f;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (this.isRTL) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayout = new StaticLayout(str, this.mContentPaint, (int) fMeasureText, alignment, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        if (lineCount > 1) {
            fMeasureText = 0.0f;
            for (int i2 = 0; i2 < lineCount; i2++) {
                fMeasureText = Math.max(fMeasureText, staticLayout.getLineWidth(i2));
            }
        }
        StaticLayout staticLayout2 = new StaticLayout(str, this.mContentPaint, (int) fMeasureText, alignment, 1.0f, 0.0f, false);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.mContentBgColor);
        paint.setStrokeWidth(C33052mpF.EZpvd(1.0f, getContext()));
        float height = staticLayout2.getHeight();
        float f2 = this.mCenterX;
        float f3 = fMeasureText / 2.0f;
        float f4 = this.contentPadding;
        float f5 = this.mCenterY;
        float f6 = height / 2.0f;
        RectF rectF = new RectF((f2 - f3) - f4, (f5 - f6) - f4, f2 + f3 + f4, f5 + f6 + f4);
        this.contentRectF = rectF;
        float f7 = this.contentRadius;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        paint.setStyle(Paint.Style.STROKE);
        int[] iArr = this.DEFAULT_COLOR;
        paint.setColor(iArr[i % iArr.length]);
        RectF rectF2 = this.contentRectF;
        float f8 = this.contentRadius;
        canvas.drawRoundRect(rectF2, f8, f8, paint);
        canvas.save();
        RectF rectF3 = this.contentRectF;
        float f9 = rectF3.left;
        float f10 = this.contentPadding;
        canvas.translate(f9 + f10, rectF3.top + f10);
        staticLayout2.draw(canvas);
        canvas.restore();
    }

    private boolean isTouchInArc(Canvas canvas, float f, float f2) {
        this.mPath.reset();
        double d = this.mCenterX;
        double d2 = this.innerRadius + this.ringWidth;
        double d3 = f;
        double dCos = Math.cos(Math.toRadians(d3));
        double d4 = this.mCenterY;
        double d5 = this.innerRadius + this.ringWidth;
        double dSin = Math.sin(Math.toRadians(d3));
        double d6 = f + f2;
        Math.cos(Math.toRadians(d6));
        Math.sin(Math.toRadians(d6));
        this.mPath.moveTo(this.mCenterX, this.mCenterY);
        this.mPath.lineTo((float) (d + (d2 * dCos)), (float) (d4 + (d5 * dSin)));
        this.mPath.addArc(this.outOval, f, f2);
        this.mPath.lineTo(this.mCenterX, this.mCenterY);
        Region region = new Region();
        region.setPath(this.mPath, this.mRegion);
        return region.contains((int) this.mTouchX, (int) this.mTouchY);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isTouch = true;
            this.mTouchX = motionEvent.getX();
            this.mTouchY = motionEvent.getY();
            invalidate();
        } else if (action == 1 || action == 3) {
            this.isTouch = false;
        }
        return true;
    }

    private void drawTitile(Canvas canvas) {
        float titleWidth = getTitleWidth();
        for (int i = 0; i < this.mListStart.size(); i++) {
            Paint paint = this.mTagPaint;
            int[] iArr = this.DEFAULT_COLOR;
            paint.setColor(iArr[i % iArr.length]);
            Activity activity = this.mListStart.get(i);
            float fDescent = this.mTitlePaint.descent() - this.mTitlePaint.ascent();
            float f = activity.AEQbTJ;
            float f2 = activity.KWHzl;
            float f3 = this.tagWidth;
            float f4 = (fDescent - f3) / 2.0f;
            canvas.drawRect(new RectF(f, f4 + f2, f + f3, f2 + f3 + f4), this.mTagPaint);
            canvas.save();
            StaticLayout staticLayout = new StaticLayout(activity.copydefault, this.mTitlePaint, (int) titleWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(activity.AEQbTJ + this.tagWidth + this.marginTag, activity.KWHzl);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    private void drawTitileRTL(Canvas canvas) {
        float titleWidth = getTitleWidth();
        float f = (this.mWidth - ((((this.innerRadius + this.ringWidth) + this.zoomWidth) * 2.0f) + this.marginLeft)) - this.tagWidth;
        for (int i = 0; i < this.mListStart.size(); i++) {
            Paint paint = this.mTagPaint;
            int[] iArr = this.DEFAULT_COLOR;
            paint.setColor(iArr[i % iArr.length]);
            Activity activity = this.mListStart.get(i);
            float fDescent = this.mTitlePaint.descent() - this.mTitlePaint.ascent();
            float f2 = activity.KWHzl;
            float f3 = this.tagWidth;
            float f4 = (fDescent - f3) / 2.0f;
            canvas.drawRect(new RectF(f, f4 + f2, f + f3, f2 + f3 + f4), this.mTagPaint);
            canvas.save();
            StaticLayout staticLayout = new StaticLayout(activity.copydefault, this.mTitlePaint, (int) titleWidth, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            canvas.translate(activity.AEQbTJ, activity.KWHzl);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    private void dealTagPosition() {
        if (this.mList.size() == 0) {
            return;
        }
        this.mListStart.clear();
        float titleWidth = getTitleWidth();
        float f = this.zoomWidth;
        float f2 = this.innerRadius;
        float f3 = this.ringWidth;
        float f4 = this.marginLeft;
        float f5 = f;
        for (int i = 0; i < this.mList.size(); i++) {
            ItemData itemData = this.mList.get(i);
            String str = pTB.EZpvd(pTB.OLrzqt(Float.valueOf(itemData.percent)), 0) + " " + itemData.name;
            int height = new StaticLayout(str, this.mTitlePaint, (int) titleWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            this.mListStart.add(new Activity(((f2 + f3 + f) * 2.0f) + f4, f5, str));
            f5 = f5 + this.marginBottm + height;
        }
    }

    private void dealTagPositionRTL() {
        if (this.mList.size() == 0) {
            return;
        }
        this.mListStart.clear();
        float titleWidth = getTitleWidth();
        float f = this.zoomWidth;
        float f2 = f;
        for (int i = 0; i < this.mList.size(); i++) {
            ItemData itemData = this.mList.get(i);
            String str = pTB.EZpvd(pTB.OLrzqt(Float.valueOf(itemData.percent)), 0) + " " + itemData.name;
            int height = new StaticLayout(str, this.mTitlePaint, (int) titleWidth, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false).getHeight();
            this.mListStart.add(new Activity(f, f2, str));
            f2 = f2 + this.marginBottm + height;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class Activity {
        public float AEQbTJ;
        public float KWHzl;
        public String copydefault;

        public Activity(float f, float f2, String str) {
            this.AEQbTJ = f;
            this.KWHzl = f2;
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class ItemData implements Comparable<ItemData> {
        public String name = "";
        public float percent = 0.0f;
        public String content = "";
        public String unlockTime = "";

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        public int compareTo(ItemData itemData) {
            float f = this.percent;
            float f2 = itemData.percent;
            if (f >= f2) {
                return -1;
            }
            return f == f2 ? 0 : 1;
        }
    }
}
