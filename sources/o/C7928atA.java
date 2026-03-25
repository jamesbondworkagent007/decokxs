package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.ColorFilter;
import androidx.core.view.MotionEventCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.atA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7928atA extends android.graphics.drawable.Drawable {
    public int AEQbTJ;
    public boolean AYXKKw;
    public android.animation.ValueAnimator AhwBna;
    public boolean AkhnZx;
    public float AuCTel;
    public final ValueAnimator.AnimatorUpdateListener AuCTelauCTel;
    public int AubY;
    public android.graphics.Path DbNXlk;
    public android.animation.ValueAnimator EZpvd;
    public android.graphics.Paint KWHzl;
    public android.animation.ValueAnimator OLrzqt;
    public android.animation.ValueAnimator copydefault;
    public boolean djBIcL;
    public int ejfBZ;
    public float fARcdN;
    public int fIwbmz;
    public android.animation.AnimatorSet fJNWhG;
    public float fetchVPNInfo;
    public int gEmmrt;
    public int gHZMYf;
    public Animator.AnimatorListener getFieldNames;
    public int getNewProxyInstance;
    public float hDKMBd;
    public boolean isConnected;
    public android.graphics.Paint iwGUEr;
    public android.animation.ValueAnimator uzCIH;
    public boolean valueOf;
    public float values;
    public int wlaJM;
    public final ValueAnimator.AnimatorUpdateListener zLjUOn;
    public final ValueAnimator.AnimatorUpdateListener zsXlph;
    public WeakReference<android.view.View> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(float f) {
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        this.hDKMBd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.fIwbmz = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i, int i2) {
        this.gHZMYf = i;
        this.AubY = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.AuCTel = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.getNewProxyInstance = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i > 10) {
            i = 10;
        }
        this.wlaJM = i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C7928atA() {
        this(null, null);
    }

    public C7928atA(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public C7928atA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.AuCTel = 10.0f;
        this.ejfBZ = 255;
        this.fIwbmz = (int) 20.0f;
        this.getNewProxyInstance = -7829368;
        this.gEmmrt = -3355444;
        this.valueOf = true;
        this.djBIcL = false;
        this.isConnected = true;
        this.AkhnZx = true;
        this.AYXKKw = true;
        this.wlaJM = 5;
        this.hDKMBd = 0.7f;
        this.zsXlph = new ValueAnimator.AnimatorUpdateListener() { // from class: o.atA.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C7928atA.this.KWHzl(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.zLjUOn = new ValueAnimator.AnimatorUpdateListener() { // from class: o.atA.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C7928atA.this.AEQbTJ(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        this.AuCTelauCTel = new ValueAnimator.AnimatorUpdateListener() { // from class: o.atA.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C7928atA.this.OLrzqt(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        android.graphics.Paint paint = new android.graphics.Paint();
        this.iwGUEr = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.KWHzl = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.isConnected) {
            canvas.save();
            if (this.DbNXlk != null && KWHzl(canvas)) {
                this.DbNXlk.isEmpty();
            }
            if (this.djBIcL) {
                this.KWHzl.setColor(this.gEmmrt);
                this.KWHzl.setAlpha(this.AEQbTJ);
                canvas.drawPaint(this.KWHzl);
            }
            if (this.valueOf) {
                canvas.drawCircle(this.fetchVPNInfo, this.values, this.fARcdN, this.iwGUEr);
            }
            canvas.restore();
        }
    }

    public static boolean KWHzl(android.graphics.Canvas canvas) {
        canvas.isHardwareAccelerated();
        return true;
    }

    public void KWHzl(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.fARcdN = f;
        invalidateSelf();
    }

    public void AEQbTJ(int i) {
        this.ejfBZ = i;
        this.iwGUEr.setAlpha(i);
        invalidateSelf();
    }

    public void OLrzqt(int i) {
        this.AEQbTJ = i;
        this.KWHzl.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int iArgb = Color.argb(i, Color.red(this.getNewProxyInstance), Color.green(this.getNewProxyInstance), Color.blue(this.getNewProxyInstance));
        this.getNewProxyInstance = iArgb;
        this.iwGUEr.setColor(iArgb);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return Color.alpha(this.getNewProxyInstance);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        android.view.View view;
        WeakReference<android.view.View> weakReference = this.zuBGHE;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.invalidate();
        } else {
            super.invalidateSelf();
        }
    }

    public void KWHzl(android.view.MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0 || this.AkhnZx) {
            this.AkhnZx = true;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (actionMasked == 0) {
                OLrzqt(x, y);
                EZpvd();
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    AEQbTJ(x);
                    OLrzqt(y);
                    invalidateSelf();
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            OLrzqt();
        }
    }

    public void OLrzqt(float f, float f2) {
        copydefault();
        this.valueOf = true;
        this.djBIcL = true;
        AEQbTJ(f);
        OLrzqt(f2);
        this.iwGUEr.setAlpha(this.ejfBZ);
        this.iwGUEr.setColor(this.getNewProxyInstance);
        if (this.OLrzqt == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.OLrzqt = valueAnimator;
            valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
            this.OLrzqt.addUpdateListener(this.zsXlph);
            Animator.AnimatorListener animatorListener = this.getFieldNames;
            if (animatorListener != null) {
                this.OLrzqt.addListener(animatorListener);
            }
        }
        this.OLrzqt.setFloatValues(this.AuCTel, this.fIwbmz);
        this.OLrzqt.setDuration((long) (((this.fIwbmz - this.AuCTel) / this.wlaJM) * 10.0f));
        this.OLrzqt.start();
    }

    public void OLrzqt() {
        copydefault();
        this.valueOf = true;
        this.djBIcL = true;
        if (this.uzCIH == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.uzCIH = valueAnimator;
            valueAnimator.addUpdateListener(this.zsXlph);
        }
        android.animation.ValueAnimator valueAnimator2 = this.uzCIH;
        float f = this.fARcdN;
        valueAnimator2.setFloatValues(f, 700.0f + f);
        if (this.EZpvd == null) {
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(255, 0);
            this.EZpvd = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(this.zLjUOn);
        }
        if (this.copydefault == null) {
            android.animation.ValueAnimator valueAnimator3 = new android.animation.ValueAnimator();
            this.copydefault = valueAnimator3;
            valueAnimator3.addUpdateListener(this.AuCTelauCTel);
        }
        this.copydefault.setIntValues(this.AEQbTJ, 0);
        if (this.fJNWhG == null) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.fJNWhG = animatorSet;
            animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
            this.fJNWhG.setDuration(300L);
            this.fJNWhG.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.atA.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    C7928atA c7928atA = C7928atA.this;
                    c7928atA.valueOf = false;
                    c7928atA.djBIcL = false;
                    c7928atA.fARcdN = 0.0f;
                    c7928atA.ejfBZ = 255;
                    c7928atA.fetchVPNInfo = 0.0f;
                    c7928atA.values = 0.0f;
                }
            });
            this.fJNWhG.playTogether(this.uzCIH, this.EZpvd, this.copydefault);
        }
        this.fJNWhG.start();
    }

    public void EZpvd() {
        android.animation.ValueAnimator valueAnimator = this.AhwBna;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.AhwBna == null) {
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, Color.alpha(this.gEmmrt));
            this.AhwBna = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(new android.view.animation.AccelerateInterpolator());
            this.AhwBna.setDuration(500L);
            this.AhwBna.addUpdateListener(this.AuCTelauCTel);
            this.AhwBna.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.atA.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                    C7928atA.this.OLrzqt(0);
                }
            });
        }
        this.AhwBna.start();
    }

    public void copydefault() {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.AnimatorSet animatorSet = this.fJNWhG;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.AhwBna;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.valueOf = false;
        this.djBIcL = false;
    }

    public float EZpvd(float f, float f2, int i) {
        if (this.AYXKKw && (f2 < -30.0f || f2 > i + 30)) {
            OLrzqt();
            this.AkhnZx = false;
        }
        float f3 = this.hDKMBd;
        if (f3 == 1.0f) {
            return f2;
        }
        float f4 = i / 2;
        float f5 = f3 * f4;
        float f6 = f4 - f5;
        float f7 = f4 + f5;
        return f2 < f6 ? f <= 0.0f ? f6 : f - 2.0f : f2 > f7 ? f <= 0.0f ? f7 : f + 2.0f : f2;
    }

    public void copydefault(android.graphics.Path path) {
        if (this.DbNXlk == null) {
            this.DbNXlk = new android.graphics.Path();
        }
        this.DbNXlk.reset();
        this.DbNXlk.set(path);
    }

    public void AEQbTJ(float f) {
        this.fetchVPNInfo = EZpvd(this.fetchVPNInfo, f, this.gHZMYf);
    }

    public void OLrzqt(float f) {
        this.values = EZpvd(this.values, f, this.AubY);
    }
}
