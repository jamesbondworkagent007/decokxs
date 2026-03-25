package o;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: o.yqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ViewTreeObserverOnPreDrawListenerC57868yqY extends android.view.View implements ViewTreeObserver.OnPreDrawListener {
    public android.animation.ValueAnimator AYXKKw;
    public android.animation.ValueAnimator AhwBna;
    public float AkhnZx;
    public android.graphics.Path AuCTel;
    public boolean DbNXlk;
    public float KWHzl;
    public ValueAnimator.AnimatorUpdateListener copydefault;
    public android.animation.ValueAnimator djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public android.graphics.Paint fIwbmz;
    public boolean fJNWhG;
    public RectF fetchVPNInfo;
    public android.graphics.Path gEmmrt;
    public android.graphics.Path getNewProxyInstance;
    public android.animation.ValueAnimator isConnected;
    public int iwGUEr;
    public android.animation.ValueAnimator uzCIH;
    public android.animation.ValueAnimator valueOf;
    public android.graphics.Path values;
    public static final float[][] AEQbTJ = {new float[]{0.1655f, 0.0f}, new float[]{0.4188f, -0.0109f}, new float[]{0.4606f, -0.0049f}, new float[]{0.4893f, 0.0f}, new float[]{0.4893f, 0.0f}, new float[]{0.5f, 0.0f}};
    public static final float[][] OLrzqt = {new float[]{0.1655f, 0.0f}, new float[]{0.5237f, 0.0553f}, new float[]{0.4557f, 0.0936f}, new float[]{0.3908f, 0.1302f}, new float[]{0.4303f, 0.2173f}, new float[]{0.5f, 0.2173f}};
    public static final float[][] EZpvd = {new float[]{0.1655f, 0.0f}, new float[]{0.5909f, 0.0f}, new float[]{0.4557f, 0.1642f}, new float[]{0.3941f, 0.2061f}, new float[]{0.4303f, 0.2889f}, new float[]{0.5f, 0.2889f}};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float KWHzl() {
        return this.KWHzl;
    }

    public ViewTreeObserverOnPreDrawListenerC57868yqY(android.content.Context context) {
        super(context);
        this.AkhnZx = 100.0f;
        this.fJNWhG = false;
        this.DbNXlk = false;
        this.copydefault = new ValueAnimator.AnimatorUpdateListener() { // from class: o.yqY.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.postInvalidate();
            }
        };
        float f = getResources().getDisplayMetrics().density;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.fIwbmz = paint;
        paint.setColor(-14575885);
        this.fIwbmz.setAntiAlias(true);
        this.fIwbmz.setStyle(Paint.Style.FILL);
        this.fIwbmz.setShadowLayer((int) ((f * 2.0f) + 0.5f), 0.0f, 0.0f, -1728053248);
        this.getNewProxyInstance = new android.graphics.Path();
        this.values = new android.graphics.Path();
        this.gEmmrt = new android.graphics.Path();
        this.AuCTel = new android.graphics.Path();
        AEQbTJ();
        this.fetchVPNInfo = new RectF();
        setLayerType(1, null);
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.iwGUEr = i;
        this.AkhnZx = i / 14.4f;
        KWHzl((int) java.lang.Math.min(java.lang.Math.min(i, i2), getHeight() - this.AkhnZx));
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        getViewTreeObserver().removeOnPreDrawListener(this);
        if (!this.DbNXlk) {
            return false;
        }
        KWHzl(this.ejfBZ);
        return false;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.getNewProxyInstance, this.fIwbmz);
        if (!isInEditMode()) {
            this.getNewProxyInstance.rewind();
            this.values.rewind();
            this.gEmmrt.rewind();
        }
        float fFloatValue = ((java.lang.Float) this.djBIcL.getAnimatedValue()).floatValue();
        float f = this.iwGUEr / 2.0f;
        float fFloatValue2 = ((java.lang.Float) this.AhwBna.getAnimatedValue()).floatValue();
        float fFloatValue3 = ((java.lang.Float) this.AYXKKw.getAnimatedValue()).floatValue();
        float fFloatValue4 = ((java.lang.Float) this.valueOf.getAnimatedValue()).floatValue();
        RectF rectF = this.fetchVPNInfo;
        float f2 = this.AkhnZx;
        float f3 = fFloatValue3 + 1.0f;
        float f4 = (f2 * fFloatValue4) / 2.0f;
        float f5 = (fFloatValue3 * f2) / 2.0f;
        float f6 = f3 * f2 * fFloatValue2;
        float f7 = f2 * (fFloatValue4 + 1.0f) * fFloatValue2;
        rectF.set((f - f6) + f4, (f7 + fFloatValue) - f5, (f6 + f) - f4, (fFloatValue - f7) + f5);
        float fFloatValue5 = ((java.lang.Float) this.isConnected.getAnimatedValue()).floatValue();
        this.values.moveTo(f, fFloatValue5);
        double d = fFloatValue;
        double dPow = ((java.lang.Math.pow(this.AkhnZx, 2.0d) + ((double) (fFloatValue * fFloatValue5))) - java.lang.Math.pow(d, 2.0d)) / ((double) (fFloatValue5 - fFloatValue));
        double d2 = (((double) this.iwGUEr) * (-2.0d)) / 2.0d;
        double d3 = -d2;
        double dPow2 = (d2 * d2) - (((java.lang.Math.pow(dPow - d, 2.0d) + java.lang.Math.pow(f, 2.0d)) - java.lang.Math.pow(this.AkhnZx, 2.0d)) * 4.0d);
        double dSqrt = (java.lang.Math.sqrt(dPow2) + d3) / 2.0d;
        double dSqrt2 = (d3 - java.lang.Math.sqrt(dPow2)) / 2.0d;
        float f8 = (float) dPow;
        this.values.lineTo((float) dSqrt, f8);
        this.values.lineTo((float) dSqrt2, f8);
        this.values.close();
        this.AuCTel.set(this.values);
        android.graphics.Path path = this.AuCTel;
        RectF rectF2 = this.fetchVPNInfo;
        Path.Direction direction = Path.Direction.CCW;
        path.addOval(rectF2, direction);
        this.gEmmrt.addOval(this.fetchVPNInfo, direction);
        canvas.drawPath(this.values, this.fIwbmz);
        canvas.drawPath(this.gEmmrt, this.fIwbmz);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        android.animation.ValueAnimator valueAnimator = this.AhwBna;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.AhwBna.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator2 = this.djBIcL;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
            this.djBIcL.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator3 = this.isConnected;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
            this.isConnected.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator4 = this.uzCIH;
        if (valueAnimator4 != null) {
            valueAnimator4.end();
            this.uzCIH.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator5 = this.valueOf;
        if (valueAnimator5 != null) {
            valueAnimator5.end();
            this.valueOf.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator6 = this.AYXKKw;
        if (valueAnimator6 != null) {
            valueAnimator6.end();
            this.AYXKKw.removeAllUpdateListeners();
        }
        super.onDetachedFromWindow();
    }

    public void AEQbTJ() {
        this.isConnected = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        this.AYXKKw = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        this.valueOf = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(-1000.0f, -1000.0f);
        this.djBIcL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 1.0f);
        this.AhwBna = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(1L);
        this.AhwBna.start();
    }

    public void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.uzCIH;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.uzCIH.cancel();
    }

    public void EZpvd() {
        if (this.fJNWhG) {
            return;
        }
        this.fJNWhG = true;
        float f = this.fARcdN;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f, f);
        this.djBIcL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        float f2 = this.fARcdN - this.AkhnZx;
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(f2, f2);
        this.isConnected = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.start();
        this.KWHzl = this.fARcdN;
        postInvalidate();
    }

    public void copydefault(float f) {
        OLrzqt();
        this.getNewProxyInstance.moveTo(0.0f, 0.0f);
        android.graphics.Path path = this.getNewProxyInstance;
        float f2 = this.iwGUEr;
        float[][] fArr = AEQbTJ;
        float[] fArr2 = fArr[0];
        float f3 = fArr2[0];
        float f4 = fArr2[1];
        float[] fArr3 = fArr[1];
        float f5 = fArr3[0];
        float f6 = fArr3[1];
        float[] fArr4 = fArr[2];
        path.cubicTo(f3 * f2, f4, f5 * f2, f2 * (f6 + f), fArr4[0] * f2, f2 * (fArr4[1] + f));
        android.graphics.Path path2 = this.getNewProxyInstance;
        float f7 = this.iwGUEr;
        float[] fArr5 = fArr[3];
        float f8 = fArr5[0];
        float f9 = fArr5[1];
        float[] fArr6 = fArr[4];
        float f10 = fArr6[0];
        float f11 = fArr6[1];
        float[] fArr7 = fArr[5];
        path2.cubicTo(f7 * f8, f7 * (f9 + f), f7 * f10, f7 * (f11 + f), f7 * fArr7[0], f7 * (fArr7[1] + f));
        android.graphics.Path path3 = this.getNewProxyInstance;
        float f12 = this.iwGUEr;
        float[] fArr8 = fArr[4];
        float f13 = fArr8[0];
        float f14 = fArr8[1];
        float[] fArr9 = fArr[3];
        float f15 = fArr9[0];
        float f16 = fArr9[1];
        float[] fArr10 = fArr[2];
        path3.cubicTo(f12 - (f13 * f12), f12 * (f14 + f), f12 - (f15 * f12), f12 * (f16 + f), f12 - (fArr10[0] * f12), f12 * (fArr10[1] + f));
        android.graphics.Path path4 = this.getNewProxyInstance;
        float f17 = this.iwGUEr;
        float[] fArr11 = fArr[1];
        float f18 = fArr11[0];
        float f19 = fArr11[1];
        float[] fArr12 = fArr[0];
        path4.cubicTo(f17 - (f18 * f17), f17 * (f19 + f), f17 - (fArr12[0] * f17), fArr12[1], f17, 0.0f);
        postInvalidateOnAnimation();
    }

    public void AEQbTJ(float f, float f2) {
        OLrzqt();
        this.getNewProxyInstance.moveTo(0.0f, 0.0f);
        android.graphics.Path path = this.getNewProxyInstance;
        float f3 = this.iwGUEr;
        float[][] fArr = OLrzqt;
        float[] fArr2 = fArr[0];
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float[][] fArr3 = AEQbTJ;
        path.cubicTo(f4 * f3, f3 * f5, java.lang.Math.min(fArr3[1][0] + f2, fArr[1][0]) * f3, this.iwGUEr * java.lang.Math.max((fArr3[1][1] + f) - f2, fArr[1][1]), this.iwGUEr * java.lang.Math.max(fArr3[2][0] - f2, fArr[2][0]), this.iwGUEr * java.lang.Math.max((fArr3[2][1] + f) - f2, fArr[2][1]));
        android.graphics.Path path2 = this.getNewProxyInstance;
        float f6 = this.iwGUEr;
        float fMax = java.lang.Math.max(fArr3[3][0] - f2, fArr[3][0]);
        float f7 = this.iwGUEr;
        float fMin = java.lang.Math.min(fArr3[3][1] + f + f2, fArr[3][1]);
        float f8 = this.iwGUEr;
        float fMax2 = java.lang.Math.max(fArr3[4][0] - f2, fArr[4][0]);
        float f9 = this.iwGUEr;
        float fMin2 = java.lang.Math.min(fArr3[4][1] + f + f2, fArr[4][1]);
        float f10 = this.iwGUEr;
        float[] fArr4 = fArr[5];
        path2.cubicTo(f6 * fMax, f7 * fMin, f8 * fMax2, f9 * fMin2, f10 * fArr4[0], f10 * java.lang.Math.min(fArr3[0][1] + f + f2, fArr4[1]));
        android.graphics.Path path3 = this.getNewProxyInstance;
        float f11 = this.iwGUEr;
        float fMax3 = java.lang.Math.max(fArr3[4][0] - f2, fArr[4][0]);
        float f12 = this.iwGUEr;
        float fMin3 = java.lang.Math.min(fArr3[4][1] + f + f2, fArr[4][1]);
        float f13 = this.iwGUEr;
        float fMax4 = java.lang.Math.max(fArr3[3][0] - f2, fArr[3][0]);
        float f14 = this.iwGUEr;
        float fMin4 = java.lang.Math.min(fArr3[3][1] + f + f2, fArr[3][1]);
        float f15 = this.iwGUEr;
        path3.cubicTo(f11 - (fMax3 * f11), f12 * fMin3, f13 - (fMax4 * f13), f14 * fMin4, f15 - (java.lang.Math.max(fArr3[2][0] - f2, fArr[2][0]) * f15), this.iwGUEr * java.lang.Math.max((fArr3[2][1] + f) - f2, fArr[2][1]));
        android.graphics.Path path4 = this.getNewProxyInstance;
        float f16 = this.iwGUEr;
        float fMin5 = java.lang.Math.min(fArr3[1][0] + f2, fArr[1][0]);
        float f17 = this.iwGUEr;
        float fMax5 = java.lang.Math.max((fArr3[1][1] + f) - f2, fArr[1][1]);
        float f18 = this.iwGUEr;
        float[] fArr5 = fArr[0];
        path4.cubicTo(f16 - (fMin5 * f16), fMax5 * f17, f18 - (fArr5[0] * f18), f18 * fArr5[1], f18, 0.0f);
        this.KWHzl = (this.iwGUEr * java.lang.Math.min(fArr3[3][1] + f + f2, fArr[3][1])) + this.AkhnZx;
        postInvalidateOnAnimation();
    }

    public void EZpvd(float f, float f2, float f3) {
        OLrzqt();
        this.getNewProxyInstance.moveTo(0.0f, 0.0f);
        android.graphics.Path path = this.getNewProxyInstance;
        float f4 = this.iwGUEr;
        float[][] fArr = EZpvd;
        float[] fArr2 = fArr[0];
        float f5 = fArr2[0];
        float f6 = fArr2[1];
        float[][] fArr3 = AEQbTJ;
        float f7 = fArr3[1][0];
        float[][] fArr4 = OLrzqt;
        path.cubicTo(f5 * f4, f4 * f6, java.lang.Math.min(java.lang.Math.min(f7 + f2, fArr4[1][0]) + f3, fArr[1][0]) * f4, this.iwGUEr * java.lang.Math.max(java.lang.Math.max((fArr3[1][1] + f) - f2, fArr4[1][1]) - f3, fArr[1][1]), this.iwGUEr * java.lang.Math.max(fArr3[2][0] - f2, fArr[2][0]), this.iwGUEr * java.lang.Math.min(java.lang.Math.max((fArr3[2][1] + f) - f2, fArr4[2][1]) + f3, fArr[2][1]));
        android.graphics.Path path2 = this.getNewProxyInstance;
        float f8 = this.iwGUEr;
        float fMin = java.lang.Math.min(java.lang.Math.max(fArr3[3][0] - f2, fArr4[3][0]) + f3, fArr[3][0]);
        float f9 = this.iwGUEr;
        float fMin2 = java.lang.Math.min(java.lang.Math.min(fArr3[3][1] + f + f2, fArr4[3][1]) + f3, fArr[3][1]);
        float f10 = this.iwGUEr;
        float fMax = java.lang.Math.max(fArr3[4][0] - f2, fArr[4][0]);
        float f11 = this.iwGUEr;
        float fMin3 = java.lang.Math.min(java.lang.Math.min(fArr3[4][1] + f + f2, fArr4[4][1]) + f3, fArr[4][1]);
        float f12 = this.iwGUEr;
        path2.cubicTo(f8 * fMin, f9 * fMin2, f10 * fMax, f11 * fMin3, f12 * fArr[5][0], f12 * java.lang.Math.min(java.lang.Math.min(fArr3[0][1] + f + f2, fArr4[5][1]) + f3, fArr[5][1]));
        android.graphics.Path path3 = this.getNewProxyInstance;
        float f13 = this.iwGUEr;
        float fMax2 = java.lang.Math.max(fArr3[4][0] - f2, fArr[4][0]);
        float f14 = this.iwGUEr;
        float fMin4 = java.lang.Math.min(java.lang.Math.min(fArr3[4][1] + f + f2, fArr4[4][1]) + f3, fArr[4][1]);
        float f15 = this.iwGUEr;
        float fMin5 = java.lang.Math.min(java.lang.Math.max(fArr3[3][0] - f2, fArr4[3][0]) + f3, fArr[3][0]);
        float f16 = this.iwGUEr;
        float fMin6 = java.lang.Math.min(java.lang.Math.min(fArr3[3][1] + f + f2, fArr4[3][1]) + f3, fArr[3][1]);
        float f17 = this.iwGUEr;
        path3.cubicTo(f13 - (fMax2 * f13), f14 * fMin4, f15 - (fMin5 * f15), f16 * fMin6, f17 - (java.lang.Math.max(fArr3[2][0] - f2, fArr[2][0]) * f17), this.iwGUEr * java.lang.Math.min(java.lang.Math.max((fArr3[2][1] + f) - f2, fArr4[2][1]) + f3, fArr[2][1]));
        android.graphics.Path path4 = this.getNewProxyInstance;
        float f18 = this.iwGUEr;
        float fMin7 = java.lang.Math.min(java.lang.Math.min(fArr3[1][0] + f2, fArr4[1][0]) + f3, fArr[1][0]);
        float f19 = this.iwGUEr;
        float fMax3 = java.lang.Math.max(java.lang.Math.max((fArr3[1][1] + f) - f2, fArr4[1][1]) - f3, fArr[1][1]);
        float f20 = this.iwGUEr;
        float[] fArr5 = fArr[0];
        path4.cubicTo(f18 - (fMin7 * f18), f19 * fMax3, f20 - (fArr5[0] * f20), f20 * fArr5[1], f20, 0.0f);
        this.KWHzl = (this.iwGUEr * java.lang.Math.min(java.lang.Math.min(fArr3[3][1] + f + f2, fArr4[3][1]) + f3, fArr[3][1])) + this.AkhnZx;
        postInvalidateOnAnimation();
    }

    public void KWHzl(int i) {
        float f = i;
        if ((this.iwGUEr / 1440.0f) * 500.0f > f) {
            return;
        }
        this.fARcdN = (int) java.lang.Math.min(f, getHeight() - this.AkhnZx);
        if (this.fJNWhG) {
            this.fJNWhG = false;
            EZpvd();
        }
    }

    public void AhwBna() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.0f);
        this.AhwBna = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1L);
        this.AhwBna.start();
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat((this.iwGUEr / 1440.0f) * 500.0f, this.fARcdN);
        this.djBIcL = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(500L);
        this.djBIcL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yqY.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.KWHzl = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.postInvalidateOnAnimation();
            }
        });
        this.djBIcL.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.djBIcL.start();
        android.animation.ValueAnimator valueAnimatorOfFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, this.fARcdN - this.AkhnZx);
        this.isConnected = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(500L);
        this.isConnected.addUpdateListener(this.copydefault);
        this.isConnected.start();
        android.animation.ValueAnimator valueAnimatorOfFloat4 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.AYXKKw = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(500L);
        this.AYXKKw.addUpdateListener(this.copydefault);
        this.AYXKKw.setInterpolator(new InterpolatorC57925yrc());
        this.AYXKKw.setStartDelay(500L);
        this.AYXKKw.start();
        android.animation.ValueAnimator valueAnimatorOfFloat5 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueOf = valueAnimatorOfFloat5;
        valueAnimatorOfFloat5.setDuration(500L);
        this.valueOf.addUpdateListener(this.copydefault);
        this.valueOf.setInterpolator(new InterpolatorC57925yrc());
        this.valueOf.setStartDelay(625L);
        this.valueOf.start();
    }

    public void djBIcL() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.AhwBna = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this.copydefault);
        this.AhwBna.setDuration(200L);
        this.AhwBna.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.yqY.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.AEQbTJ();
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.fJNWhG = false;
            }
        });
        this.AhwBna.start();
    }

    public void OLrzqt(float f) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(java.lang.Math.min(f, 0.2f) * this.iwGUEr, 0.0f);
        this.uzCIH = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.uzCIH.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yqY.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.getNewProxyInstance.moveTo(0.0f, 0.0f);
                ViewTreeObserverOnPreDrawListenerC57868yqY viewTreeObserverOnPreDrawListenerC57868yqY = ViewTreeObserverOnPreDrawListenerC57868yqY.this;
                android.graphics.Path path = viewTreeObserverOnPreDrawListenerC57868yqY.getNewProxyInstance;
                float f2 = viewTreeObserverOnPreDrawListenerC57868yqY.iwGUEr;
                float f3 = fFloatValue * 0.5f;
                path.quadTo(0.25f * f2, 0.0f, f2 * 0.333f, f3);
                ViewTreeObserverOnPreDrawListenerC57868yqY viewTreeObserverOnPreDrawListenerC57868yqY2 = ViewTreeObserverOnPreDrawListenerC57868yqY.this;
                android.graphics.Path path2 = viewTreeObserverOnPreDrawListenerC57868yqY2.getNewProxyInstance;
                float f4 = viewTreeObserverOnPreDrawListenerC57868yqY2.iwGUEr;
                path2.quadTo(0.5f * f4, fFloatValue * 1.4f, f4 * 0.666f, f3);
                ViewTreeObserverOnPreDrawListenerC57868yqY viewTreeObserverOnPreDrawListenerC57868yqY3 = ViewTreeObserverOnPreDrawListenerC57868yqY.this;
                android.graphics.Path path3 = viewTreeObserverOnPreDrawListenerC57868yqY3.getNewProxyInstance;
                float f5 = viewTreeObserverOnPreDrawListenerC57868yqY3.iwGUEr;
                path3.quadTo(0.75f * f5, 0.0f, f5, 0.0f);
                ViewTreeObserverOnPreDrawListenerC57868yqY.this.postInvalidate();
            }
        });
        this.uzCIH.setInterpolator(new android.view.animation.BounceInterpolator());
        this.uzCIH.start();
    }

    public void copydefault() {
        if (this.AhwBna.isRunning()) {
            return;
        }
        AhwBna();
        OLrzqt(0.1f);
    }

    public void setShadow(int i, int i2) {
        this.fIwbmz.setShadowLayer(i, 0.0f, 0.0f, i2);
    }

    public void setWaveColor(@androidx.annotation.ColorInt int i) {
        this.fIwbmz.setColor(i);
        invalidate();
    }
}
