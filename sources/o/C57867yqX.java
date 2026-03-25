package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.view.animation.Animation;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

/* JADX INFO: renamed from: o.yqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57867yqX extends android.graphics.drawable.Drawable implements Animatable {
    public boolean AYXKKw;
    public float AhwBna;
    public android.view.animation.Animation OLrzqt;
    public android.view.View djBIcL;
    public float isConnected;
    public float valueOf;
    public float values;
    public static final android.view.animation.Interpolator EZpvd = new android.view.animation.LinearInterpolator();
    public static final android.view.animation.Interpolator AEQbTJ = new FastOutSlowInInterpolator();
    public static final int[] KWHzl = {ViewCompat.MEASURED_STATE_MASK};
    public final java.util.List<android.view.animation.Animation> copydefault = new java.util.ArrayList();
    public final StateListAnimator gEmmrt = new StateListAnimator();

    public final int OLrzqt(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r6))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.isConnected;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public C57867yqX(android.view.View view) {
        this.djBIcL = view;
        OLrzqt(KWHzl);
        OLrzqt(1);
        EZpvd();
    }

    public final void OLrzqt(int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        this.isConnected = i * f5;
        this.AhwBna = i2 * f5;
        this.gEmmrt.OLrzqt(0);
        float f6 = f2 * f5;
        this.gEmmrt.djBIcL.setStrokeWidth(f6);
        StateListAnimator stateListAnimator = this.gEmmrt;
        stateListAnimator.fJNWhG = f6;
        stateListAnimator.AkhnZx = f * f5;
        stateListAnimator.AEQbTJ = (int) (f3 * f5);
        stateListAnimator.KWHzl = (int) (f4 * f5);
        stateListAnimator.AEQbTJ((int) this.isConnected, (int) this.AhwBna);
        invalidateSelf();
    }

    public void OLrzqt(int i) {
        if (i == 0) {
            OLrzqt(56, 56, 12.5f, 3.0f, 12.0f, 6.0f);
        } else {
            OLrzqt(40, 40, 8.75f, 2.5f, 10.0f, 5.0f);
        }
    }

    public void KWHzl(boolean z) {
        StateListAnimator stateListAnimator = this.gEmmrt;
        if (stateListAnimator.DbNXlk != z) {
            stateListAnimator.DbNXlk = z;
            invalidateSelf();
        }
    }

    public void AEQbTJ(float f) {
        StateListAnimator stateListAnimator = this.gEmmrt;
        if (stateListAnimator.copydefault != f) {
            stateListAnimator.copydefault = f;
            invalidateSelf();
        }
    }

    public void EZpvd(float f, float f2) {
        StateListAnimator stateListAnimator = this.gEmmrt;
        stateListAnimator.isConnected = f;
        stateListAnimator.gEmmrt = f2;
        invalidateSelf();
    }

    public void EZpvd(float f) {
        this.gEmmrt.values = f;
        invalidateSelf();
    }

    public void OLrzqt(@androidx.annotation.ColorInt int... iArr) {
        StateListAnimator stateListAnimator = this.gEmmrt;
        stateListAnimator.valueOf = iArr;
        stateListAnimator.OLrzqt(0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.valueOf, bounds.exactCenterX(), bounds.exactCenterY());
        this.gEmmrt.KWHzl(canvas, bounds);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.gEmmrt.djBIcL.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void OLrzqt(float f) {
        this.valueOf = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        java.util.List<android.view.animation.Animation> list = this.copydefault;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.view.animation.Animation animation = list.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.OLrzqt.reset();
        this.gEmmrt.valueOf();
        StateListAnimator stateListAnimator = this.gEmmrt;
        if (stateListAnimator.gEmmrt != stateListAnimator.isConnected) {
            this.AYXKKw = true;
            this.OLrzqt.setDuration(666L);
            this.djBIcL.startAnimation(this.OLrzqt);
        } else {
            stateListAnimator.OLrzqt(0);
            this.gEmmrt.OLrzqt();
            this.OLrzqt.setDuration(1332L);
            this.djBIcL.startAnimation(this.OLrzqt);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.djBIcL.clearAnimation();
        this.gEmmrt.OLrzqt(0);
        this.gEmmrt.OLrzqt();
        KWHzl(false);
        OLrzqt(0.0f);
    }

    public float AEQbTJ(StateListAnimator stateListAnimator) {
        return (float) java.lang.Math.toRadians(((double) stateListAnimator.fJNWhG) / (stateListAnimator.AkhnZx * 6.283185307179586d));
    }

    public void copydefault(float f, StateListAnimator stateListAnimator) {
        if (f > 0.75f) {
            stateListAnimator.AYXKKw = OLrzqt((f - 0.75f) / 0.25f, stateListAnimator.AEQbTJ(), stateListAnimator.EZpvd());
        }
    }

    public void EZpvd(float f, StateListAnimator stateListAnimator) {
        copydefault(f, stateListAnimator);
        float fFloor = (float) (java.lang.Math.floor(stateListAnimator.fARcdN / 0.8f) + 1.0d);
        float fAEQbTJ = AEQbTJ(stateListAnimator);
        float f2 = stateListAnimator.fIwbmz;
        float f3 = stateListAnimator.fetchVPNInfo;
        EZpvd(f2 + (((f3 - fAEQbTJ) - f2) * f), f3);
        float f4 = stateListAnimator.fARcdN;
        EZpvd(f4 + ((fFloor - f4) * f));
    }

    public final void EZpvd() {
        final StateListAnimator stateListAnimator = this.gEmmrt;
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: o.yqX.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C57867yqX c57867yqX = C57867yqX.this;
                if (c57867yqX.AYXKKw) {
                    c57867yqX.EZpvd(f, stateListAnimator);
                    return;
                }
                float fAEQbTJ = c57867yqX.AEQbTJ(stateListAnimator);
                StateListAnimator stateListAnimator2 = stateListAnimator;
                float f2 = stateListAnimator2.fetchVPNInfo;
                float f3 = stateListAnimator2.fIwbmz;
                float f4 = stateListAnimator2.fARcdN;
                C57867yqX.this.copydefault(f, stateListAnimator2);
                if (f <= 0.5f) {
                    stateListAnimator.isConnected = f3 + ((0.8f - fAEQbTJ) * C57867yqX.AEQbTJ.getInterpolation(f / 0.5f));
                }
                if (f > 0.5f) {
                    stateListAnimator.gEmmrt = f2 + ((0.8f - fAEQbTJ) * C57867yqX.AEQbTJ.getInterpolation((f - 0.5f) / 0.5f));
                }
                C57867yqX.this.EZpvd(f4 + (0.25f * f));
                C57867yqX c57867yqX2 = C57867yqX.this;
                c57867yqX2.OLrzqt((f * 216.0f) + ((c57867yqX2.values / 5.0f) * 1080.0f));
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(EZpvd);
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: o.yqX.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation2) {
                C57867yqX.this.values = 0.0f;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation2) {
                stateListAnimator.valueOf();
                stateListAnimator.KWHzl();
                StateListAnimator stateListAnimator2 = stateListAnimator;
                stateListAnimator2.isConnected = stateListAnimator2.gEmmrt;
                C57867yqX c57867yqX = C57867yqX.this;
                if (c57867yqX.AYXKKw) {
                    c57867yqX.AYXKKw = false;
                    animation2.setDuration(1332L);
                    C57867yqX.this.KWHzl(false);
                    return;
                }
                c57867yqX.values = (c57867yqX.values + 1.0f) % 5.0f;
            }
        });
        this.OLrzqt = animation;
    }

    /* JADX INFO: renamed from: o.yqX$StateListAnimator */
    public class StateListAnimator {
        public int AEQbTJ;
        public int AYXKKw;
        public int AhwBna;
        public double AkhnZx;
        public float AuCTel;
        public boolean DbNXlk;
        public final android.graphics.Paint EZpvd;
        public int KWHzl;
        public android.graphics.Path OLrzqt;
        public float copydefault;
        public final android.graphics.Paint djBIcL;
        public final RectF ejfBZ = new RectF();
        public float fARcdN;
        public float fIwbmz;
        public float fJNWhG;
        public float fetchVPNInfo;
        public float gEmmrt;
        public float isConnected;
        public int[] valueOf;
        public float values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.fIwbmz = 0.0f;
            this.fetchVPNInfo = 0.0f;
            this.fARcdN = 0.0f;
            this.isConnected = 0.0f;
            this.gEmmrt = 0.0f;
            this.values = 0.0f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void valueOf() {
            this.fIwbmz = this.isConnected;
            this.fetchVPNInfo = this.gEmmrt;
            this.fARcdN = this.values;
        }

        public StateListAnimator() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.djBIcL = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.EZpvd = paint2;
            this.isConnected = 0.0f;
            this.gEmmrt = 0.0f;
            this.values = 0.0f;
            this.fJNWhG = 5.0f;
            this.AuCTel = 2.5f;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public void KWHzl(android.graphics.Canvas canvas, android.graphics.Rect rect) {
            RectF rectF = this.ejfBZ;
            rectF.set(rect);
            float f = this.AuCTel;
            rectF.inset(f, f);
            float f2 = this.isConnected;
            float f3 = this.values;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.gEmmrt + f3) * 360.0f) - f4;
            if (f5 != 0.0f) {
                this.djBIcL.setColor(this.AYXKKw);
                canvas.drawArc(rectF, f4, f5, false, this.djBIcL);
            }
            KWHzl(canvas, f4, f5, rect);
        }

        public final void KWHzl(android.graphics.Canvas canvas, float f, float f2, android.graphics.Rect rect) {
            if (this.DbNXlk) {
                android.graphics.Path path = this.OLrzqt;
                if (path == null) {
                    android.graphics.Path path2 = new android.graphics.Path();
                    this.OLrzqt = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = ((int) this.AuCTel) / 2;
                float f4 = this.copydefault;
                float fCos = (float) ((this.AkhnZx * java.lang.Math.cos(AudioStats.AUDIO_AMPLITUDE_NONE)) + ((double) rect.exactCenterX()));
                float fSin = (float) ((this.AkhnZx * java.lang.Math.sin(AudioStats.AUDIO_AMPLITUDE_NONE)) + ((double) rect.exactCenterY()));
                this.OLrzqt.moveTo(0.0f, 0.0f);
                this.OLrzqt.lineTo(this.AEQbTJ * this.copydefault, 0.0f);
                android.graphics.Path path3 = this.OLrzqt;
                float f5 = this.AEQbTJ;
                float f6 = this.copydefault;
                path3.lineTo((f5 * f6) / 2.0f, this.KWHzl * f6);
                this.OLrzqt.offset(fCos - (f3 * f4), fSin);
                this.OLrzqt.close();
                this.EZpvd.setColor(this.AYXKKw);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.OLrzqt, this.EZpvd);
            }
        }

        public void OLrzqt(int i) {
            this.AhwBna = i;
            this.AYXKKw = this.valueOf[i];
        }

        public int EZpvd() {
            return this.valueOf[copydefault()];
        }

        public final int copydefault() {
            return (this.AhwBna + 1) % this.valueOf.length;
        }

        public void KWHzl() {
            OLrzqt(copydefault());
        }

        public int AEQbTJ() {
            return this.valueOf[this.AhwBna];
        }

        public void AEQbTJ(int i, int i2) {
            float fMin = java.lang.Math.min(i, i2);
            double d = this.AkhnZx;
            this.AuCTel = (float) ((d <= AudioStats.AUDIO_AMPLITUDE_NONE || fMin < 0.0f) ? java.lang.Math.ceil(this.fJNWhG / 2.0f) : ((double) (fMin / 2.0f)) - d);
        }
    }
}
