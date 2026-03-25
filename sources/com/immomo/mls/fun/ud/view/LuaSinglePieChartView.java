package com.immomo.mls.fun.ud.view;

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
import java.util.ArrayList;
import o.C32113mPz;
import o.C33052mpF;
import o.C33490mxT;
import o.C52761wXj;
import o.C55296xhK;
import o.InterfaceC7383aim;
import o.pTB;
import o.pUU;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
public class LuaSinglePieChartView extends View implements InterfaceC7383aim<UDSinglePieChartView> {
    public ArrayList<Float> AEQbTJ;
    public float AYXKKw;
    public boolean AhwBna;
    public Paint AkhnZx;
    public Path AuCTel;
    public RectF AuCTelauCTel;
    public float AubY;
    public LuaFunction AwvSrB;
    public UDSinglePieChartView AxsJAY;
    public float DbNXlk;
    public int[] EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float QOLQEE;
    public float copydefault;
    public boolean djBIcL;
    public ArrayList<ItemData> ejfBZ;
    public float fARcdN;
    public TextPaint fIwbmz;
    public ArrayList<Object> fJNWhG;
    public float fetchVPNInfo;
    public InterfaceC7383aim.ActionBar gEmmrt;
    public float gHZMYf;
    public float getFieldNames;
    public int getNewProxyInstance;
    public Paint hDKMBd;
    public int isConnected;
    public float iwGUEr;
    public float sSMYrx;
    public Region uzCIH;
    public RectF valueOf;
    public int values;
    public RectF wlaJM;
    public float zLjUOn;
    public float zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public UDSinglePieChartView getUserdata() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(LuaFunction luaFunction) {
        this.AwvSrB = luaFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPieChartColors(int[] iArr) {
        this.EZpvd = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.gEmmrt = actionBar;
    }

    public LuaSinglePieChartView(Context context) {
        super(context);
        this.EZpvd = new int[]{Color.parseColor("#3877FF"), Color.parseColor("#28A2BC"), Color.parseColor("#2AA97F"), Color.parseColor("#7BBE5E"), Color.parseColor("#E8BF3B"), Color.parseColor("#F19341"), Color.parseColor("#E35E6E"), Color.parseColor("#A241DE"), Color.parseColor("#D743E3"), Color.parseColor("#3B54A3")};
        this.values = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.hDKMBd);
        this.getNewProxyInstance = ContextCompat.getColor(getContext(), C52761wXj.Activity.DGgkXd);
        this.isConnected = ContextCompat.getColor(getContext(), C52761wXj.Activity.DGgkXd);
        this.fetchVPNInfo = 0.0f;
        this.DbNXlk = 0.0f;
        this.zuBGHE = 0.0f;
        this.OLrzqt = 0.0f;
        this.gHZMYf = 1.0f;
        this.AubY = 0.0f;
        this.KWHzl = 0.0f;
        this.copydefault = 0.0f;
        this.zLjUOn = 0.0f;
        this.AYXKKw = 0.0f;
        this.QOLQEE = 0.0f;
        this.djBIcL = false;
        this.iwGUEr = 0.0f;
        this.getFieldNames = 0.0f;
        this.AuCTel = new Path();
        this.sSMYrx = 0.0f;
        this.AhwBna = false;
        this.fJNWhG = new ArrayList<>();
        this.zsXlph = 0.0f;
        this.fARcdN = 0.0f;
        this.ejfBZ = new ArrayList<>();
    }

    public LuaSinglePieChartView(Context context, UDSinglePieChartView uDSinglePieChartView) {
        super(context);
        this.EZpvd = new int[]{Color.parseColor("#3877FF"), Color.parseColor("#28A2BC"), Color.parseColor("#2AA97F"), Color.parseColor("#7BBE5E"), Color.parseColor("#E8BF3B"), Color.parseColor("#F19341"), Color.parseColor("#E35E6E"), Color.parseColor("#A241DE"), Color.parseColor("#D743E3"), Color.parseColor("#3B54A3")};
        this.values = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.hDKMBd);
        this.getNewProxyInstance = ContextCompat.getColor(getContext(), C52761wXj.Activity.DGgkXd);
        this.isConnected = ContextCompat.getColor(getContext(), C52761wXj.Activity.DGgkXd);
        this.fetchVPNInfo = 0.0f;
        this.DbNXlk = 0.0f;
        this.zuBGHE = 0.0f;
        this.OLrzqt = 0.0f;
        this.gHZMYf = 1.0f;
        this.AubY = 0.0f;
        this.KWHzl = 0.0f;
        this.copydefault = 0.0f;
        this.zLjUOn = 0.0f;
        this.AYXKKw = 0.0f;
        this.QOLQEE = 0.0f;
        this.djBIcL = false;
        this.iwGUEr = 0.0f;
        this.getFieldNames = 0.0f;
        this.AuCTel = new Path();
        this.sSMYrx = 0.0f;
        this.AhwBna = false;
        this.fJNWhG = new ArrayList<>();
        this.zsXlph = 0.0f;
        this.fARcdN = 0.0f;
        this.ejfBZ = new ArrayList<>();
        this.AxsJAY = uDSinglePieChartView;
        copydefault();
    }

    private void copydefault() {
        Paint paint = new Paint();
        this.AkhnZx = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.AkhnZx.setStrokeWidth(25.0f);
        this.AkhnZx.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.hDKMBd = paint2;
        paint2.setStyle(style);
        this.hDKMBd.setStrokeWidth(25.0f);
        this.hDKMBd.setAntiAlias(true);
        this.hDKMBd.setColor(this.getNewProxyInstance);
        TextPaint textPaint = new TextPaint();
        this.fIwbmz = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        this.fIwbmz.setAntiAlias(true);
        this.fIwbmz.setColor(this.values);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.gEmmrt;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.gEmmrt;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    public void setContentConfig(int i, Typeface typeface, float f, int i2, float f2, float f3) {
        this.fIwbmz.setColor(i);
        this.fIwbmz.setTypeface(typeface);
        this.fIwbmz.setTextSize(C33052mpF.AYXKKw(f, getContext()));
        this.isConnected = i2;
        this.KWHzl = C33052mpF.EZpvd(f2, getContext());
        this.copydefault = C33052mpF.EZpvd(f3, getContext());
    }

    public void setCircleConfig(float f, float f2, float f3, float f4, int i) {
        this.AYXKKw = C33052mpF.EZpvd(f, getContext());
        this.sSMYrx = C33052mpF.EZpvd(f2, getContext());
        this.QOLQEE = C33052mpF.EZpvd(f3, getContext());
        this.gHZMYf = C33052mpF.EZpvd(f4, getContext());
        this.hDKMBd.setColor(i);
    }

    public void setData(String str) {
        this.ejfBZ.clear();
        try {
            this.ejfBZ.addAll(C33490mxT.AEQbTJ(str, ItemData.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.ejfBZ.size() == 0) {
            return;
        }
        EZpvd();
        OLrzqt((Long) 500L);
    }

    public final void EZpvd() {
        this.OLrzqt = this.ejfBZ.size() * this.gHZMYf;
        this.AEQbTJ = new ArrayList<>();
        float fFloatValue = 0.0f;
        for (int i = 0; i < this.ejfBZ.size(); i++) {
            if (i == this.ejfBZ.size() - 1) {
                this.AEQbTJ.add(i, Float.valueOf((360.0f - this.OLrzqt) - fFloatValue));
            } else {
                this.AEQbTJ.add(i, Float.valueOf(this.ejfBZ.get(i).percent * (360.0f - this.OLrzqt)));
                fFloatValue += this.AEQbTJ.get(i).floatValue();
            }
        }
    }

    public final void OLrzqt(Long l) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(l.longValue());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ajI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.EZpvd.OLrzqt(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final /* synthetic */ void OLrzqt(ValueAnimator valueAnimator) {
        this.zuBGHE = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pUU.EZpvd("py", "progress===" + this.zuBGHE);
        postInvalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.zsXlph = i;
        this.fARcdN = i2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ejfBZ.size() == 0) {
            return;
        }
        this.AhwBna = C55296xhK.AEQbTJ(this);
        OLrzqt();
        copydefault(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        float f = this.zsXlph;
        if (f != 0.0f) {
            float f2 = this.fARcdN;
            if (f2 != 0.0f) {
                this.fetchVPNInfo = f / 2.0f;
                this.DbNXlk = f2 / 2.0f;
            } else {
                float f3 = this.QOLQEE + this.AYXKKw + this.sSMYrx;
                this.fetchVPNInfo = f3;
                this.DbNXlk = f3;
            }
        }
        float f4 = this.fetchVPNInfo;
        float f5 = this.AYXKKw;
        float f6 = (this.sSMYrx + this.QOLQEE) / 2.0f;
        float f7 = this.DbNXlk;
        this.AuCTelauCTel = new RectF((f4 - f5) - f6, (f7 - f5) - f6, f4 + f5 + f6, f7 + f5 + f6);
        float f8 = this.fetchVPNInfo;
        float f9 = this.AYXKKw;
        float f10 = this.sSMYrx / 2.0f;
        float f11 = this.DbNXlk;
        this.wlaJM = new RectF((f8 - f9) - f10, (f11 - f9) - f10, f8 + f9 + f10, f11 + f9 + f10);
        int i = (int) this.QOLQEE;
        float f12 = this.fetchVPNInfo;
        float f13 = this.AYXKKw;
        float f14 = this.sSMYrx;
        this.uzCIH = new Region(i, i, (int) (f12 + f13 + f14), (int) (this.DbNXlk + f13 + f14));
        this.zLjUOn = (this.AYXKKw + this.sSMYrx) * 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(Canvas canvas) {
        ArrayList<Float> arrayList = this.AEQbTJ;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.hDKMBd.setStrokeWidth(this.sSMYrx);
        float fFloatValue = 0.0f;
        int i = 0;
        int i2 = -1;
        while (i < this.AEQbTJ.size()) {
            if (i > 0) {
                fFloatValue = fFloatValue + (this.AEQbTJ.get(i - 1).floatValue() * this.zuBGHE) + this.gHZMYf;
            }
            float f = fFloatValue;
            this.AkhnZx.setStrokeWidth(this.sSMYrx);
            Paint paint = this.AkhnZx;
            int[] iArr = this.EZpvd;
            paint.setColor(iArr[i % iArr.length]);
            if (this.AEQbTJ.size() == 1) {
                if (this.djBIcL && AEQbTJ(canvas, 270.0f, 360.0f)) {
                    this.AkhnZx.setStrokeWidth(this.QOLQEE + this.sSMYrx);
                    canvas.drawArc(this.AuCTelauCTel, 270.0f, this.zuBGHE * 360.0f, false, this.AkhnZx);
                    i2 = i;
                } else {
                    canvas.drawArc(this.wlaJM, 270.0f, this.zuBGHE * 360.0f, false, this.AkhnZx);
                }
            } else if (this.djBIcL) {
                float f2 = f + 270.0f;
                if (AEQbTJ(canvas, this.gHZMYf + f2, this.AEQbTJ.get(i).floatValue() * this.zuBGHE)) {
                    this.AkhnZx.setStrokeWidth(this.QOLQEE + this.sSMYrx);
                    canvas.drawArc(this.AuCTelauCTel, f2, this.AEQbTJ.get(i).floatValue(), false, this.AkhnZx);
                    i2 = i;
                } else {
                    canvas.drawArc(this.wlaJM, f + 270.0f, this.zuBGHE * this.AEQbTJ.get(i).floatValue(), false, this.AkhnZx);
                }
                canvas.drawArc(this.wlaJM, 270.0f + f + this.AEQbTJ.get(i).floatValue(), this.zuBGHE * this.gHZMYf, false, this.hDKMBd);
            }
            i++;
            fFloatValue = f;
        }
        if (!this.djBIcL || i2 == -1) {
            return;
        }
        AEQbTJ(canvas, i2);
        LuaFunction luaFunction = this.AwvSrB;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(i2 + 1));
        }
    }

    public final void AEQbTJ(Canvas canvas, int i) {
        String str = this.ejfBZ.get(i).content + " " + pTB.EZpvd(pTB.OLrzqt(Float.valueOf(this.ejfBZ.get(i).percent)), 0);
        float fMeasureText = this.fIwbmz.measureText(str);
        float f = this.zLjUOn;
        if (fMeasureText > f) {
            fMeasureText = f;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (this.AhwBna) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayout = new StaticLayout(str, this.fIwbmz, (int) fMeasureText, alignment, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        if (lineCount > 1) {
            fMeasureText = 0.0f;
            for (int i2 = 0; i2 < lineCount; i2++) {
                fMeasureText = Math.max(fMeasureText, staticLayout.getLineWidth(i2));
            }
        }
        StaticLayout staticLayout2 = new StaticLayout(str, this.fIwbmz, (int) fMeasureText, alignment, 1.0f, 0.0f, false);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.isConnected);
        paint.setStrokeWidth(C33052mpF.EZpvd(1.0f, getContext()));
        float height = staticLayout2.getHeight();
        float f2 = this.fetchVPNInfo;
        float f3 = fMeasureText / 2.0f;
        float f4 = this.copydefault;
        float f5 = this.DbNXlk;
        float f6 = height / 2.0f;
        RectF rectF = new RectF((f2 - f3) - f4, (f5 - f6) - f4, f2 + f3 + f4, f5 + f6 + f4);
        this.valueOf = rectF;
        float f7 = this.KWHzl;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        paint.setStyle(Paint.Style.STROKE);
        int[] iArr = this.EZpvd;
        paint.setColor(iArr[i % iArr.length]);
        RectF rectF2 = this.valueOf;
        float f8 = this.KWHzl;
        canvas.drawRoundRect(rectF2, f8, f8, paint);
        canvas.save();
        RectF rectF3 = this.valueOf;
        float f9 = rectF3.left;
        float f10 = this.copydefault;
        canvas.translate(f9 + f10, rectF3.top + f10);
        staticLayout2.draw(canvas);
        canvas.restore();
    }

    public final boolean AEQbTJ(Canvas canvas, float f, float f2) {
        this.AuCTel.reset();
        double d = this.fetchVPNInfo;
        double d2 = this.AYXKKw + this.sSMYrx;
        double d3 = f;
        double dCos = Math.cos(Math.toRadians(d3));
        double d4 = this.DbNXlk;
        double d5 = this.AYXKKw + this.sSMYrx;
        double dSin = Math.sin(Math.toRadians(d3));
        this.AuCTel.moveTo(this.fetchVPNInfo, this.DbNXlk);
        this.AuCTel.lineTo((float) (d + (d2 * dCos)), (float) (d4 + (d5 * dSin)));
        this.AuCTel.addArc(this.AuCTelauCTel, f, f2);
        this.AuCTel.lineTo(this.fetchVPNInfo, this.DbNXlk);
        Region region = new Region();
        region.setPath(this.AuCTel, this.uzCIH);
        return region.contains((int) this.iwGUEr, (int) this.getFieldNames);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.djBIcL = true;
            this.iwGUEr = motionEvent.getX();
            this.getFieldNames = motionEvent.getY();
            invalidate();
        } else if (action == 1 || action == 3) {
            this.djBIcL = false;
        }
        return true;
    }

    public void AEQbTJ() {
        invalidate();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class ItemData implements Comparable<ItemData> {
        public float percent = 0.0f;
        public String content = "";

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
