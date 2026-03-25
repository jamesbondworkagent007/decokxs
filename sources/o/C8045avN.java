package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

/* JADX INFO: renamed from: o.avN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8045avN extends android.graphics.drawable.Drawable implements Animatable {
    public android.view.View AYXKKw;
    public final Drawable.Callback AhwBna;
    public float AkhnZx;
    public double DbNXlk;
    public final java.util.ArrayList<android.view.animation.Animation> KWHzl = new java.util.ArrayList<>();
    public android.view.animation.Animation OLrzqt;
    public android.content.res.Resources djBIcL;
    public boolean gEmmrt;
    public final StateListAnimator isConnected;
    public double valueOf;
    public float values;
    public static final android.view.animation.Interpolator AEQbTJ = new android.view.animation.LinearInterpolator();
    public static final android.view.animation.Interpolator copydefault = new FastOutSlowInInterpolator();
    public static final int[] EZpvd = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.DbNXlk;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C8045avN(android.content.Context context, android.view.View view) {
        Drawable.Callback callback = new Drawable.Callback() { // from class: o.avN.3
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
                C8045avN.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
                C8045avN.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
                C8045avN.this.unscheduleSelf(runnable);
            }
        };
        this.AhwBna = callback;
        this.AYXKKw = view;
        this.djBIcL = context.getResources();
        StateListAnimator stateListAnimator = new StateListAnimator(callback);
        this.isConnected = stateListAnimator;
        stateListAnimator.OLrzqt(EZpvd);
        copydefault(1);
        OLrzqt();
    }

    public final void OLrzqt(double d, double d2, double d3, double d4, float f, float f2) {
        StateListAnimator stateListAnimator = this.isConnected;
        float f3 = this.djBIcL.getDisplayMetrics().density;
        double d5 = f3;
        this.DbNXlk = d * d5;
        this.valueOf = d2 * d5;
        stateListAnimator.AEQbTJ(((float) d4) * f3);
        stateListAnimator.KWHzl(d3 * d5);
        stateListAnimator.copydefault(0);
        stateListAnimator.KWHzl(f * f3, f2 * f3);
        stateListAnimator.EZpvd((int) this.DbNXlk, (int) this.valueOf);
    }

    public void copydefault(int i) {
        if (i == 0) {
            OLrzqt(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            OLrzqt(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public void KWHzl(boolean z) {
        this.isConnected.OLrzqt(z);
    }

    public void KWHzl(float f) {
        this.isConnected.OLrzqt(f);
    }

    public void KWHzl(float f, float f2) {
        this.isConnected.KWHzl(f);
        this.isConnected.copydefault(f2);
    }

    public void EZpvd(float f) {
        this.isConnected.EZpvd(f);
    }

    public void AEQbTJ(int i) {
        this.isConnected.OLrzqt(i);
    }

    public void KWHzl(int... iArr) {
        this.isConnected.OLrzqt(iArr);
        this.isConnected.copydefault(0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.AkhnZx, bounds.exactCenterX(), bounds.exactCenterY());
        this.isConnected.KWHzl(canvas, bounds);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.isConnected.AEQbTJ(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.isConnected.OLrzqt();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.isConnected.KWHzl(colorFilter);
    }

    public void AEQbTJ(float f) {
        this.AkhnZx = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        java.util.ArrayList<android.view.animation.Animation> arrayList = this.KWHzl;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.view.animation.Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.OLrzqt.reset();
        this.isConnected.isConnected();
        if (this.isConnected.EZpvd() != this.isConnected.djBIcL()) {
            this.gEmmrt = true;
            this.OLrzqt.setDuration(666L);
            this.AYXKKw.startAnimation(this.OLrzqt);
        } else {
            this.isConnected.copydefault(0);
            this.isConnected.AkhnZx();
            this.OLrzqt.setDuration(1332L);
            this.AYXKKw.startAnimation(this.OLrzqt);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.AYXKKw.clearAnimation();
        AEQbTJ(0.0f);
        this.isConnected.OLrzqt(false);
        this.isConnected.copydefault(0);
        this.isConnected.AkhnZx();
    }

    public float AEQbTJ(StateListAnimator stateListAnimator) {
        return (float) java.lang.Math.toRadians(((double) stateListAnimator.values()) / (stateListAnimator.AEQbTJ() * 6.283185307179586d));
    }

    public final int AEQbTJ(float f, int i, int i2) {
        int iIntValue = java.lang.Integer.valueOf(i).intValue();
        int i3 = (iIntValue >> 24) & 255;
        int i4 = (iIntValue >> 16) & 255;
        int i5 = (iIntValue >> 8) & 255;
        int i6 = iIntValue & 255;
        int iIntValue2 = java.lang.Integer.valueOf(i2).intValue();
        return ((i3 + ((int) ((((iIntValue2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((iIntValue2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((iIntValue2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((iIntValue2 & 255) - i6))));
    }

    public void OLrzqt(float f, StateListAnimator stateListAnimator) {
        if (f > 0.75f) {
            stateListAnimator.KWHzl(AEQbTJ((f - 0.75f) / 0.25f, stateListAnimator.AhwBna(), stateListAnimator.KWHzl()));
        }
    }

    public void AEQbTJ(float f, StateListAnimator stateListAnimator) {
        OLrzqt(f, stateListAnimator);
        float fFloor = (float) (java.lang.Math.floor(stateListAnimator.AYXKKw() / 0.8f) + 1.0d);
        stateListAnimator.KWHzl(stateListAnimator.valueOf() + (((stateListAnimator.gEmmrt() - AEQbTJ(stateListAnimator)) - stateListAnimator.valueOf()) * f));
        stateListAnimator.copydefault(stateListAnimator.gEmmrt());
        stateListAnimator.EZpvd(stateListAnimator.AYXKKw() + ((fFloor - stateListAnimator.AYXKKw()) * f));
    }

    public final void OLrzqt() {
        final StateListAnimator stateListAnimator = this.isConnected;
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: o.avN.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C8045avN c8045avN = C8045avN.this;
                if (c8045avN.gEmmrt) {
                    c8045avN.AEQbTJ(f, stateListAnimator);
                    return;
                }
                float fAEQbTJ = c8045avN.AEQbTJ(stateListAnimator);
                float fGEmmrt = stateListAnimator.gEmmrt();
                float fValueOf = stateListAnimator.valueOf();
                float fAYXKKw = stateListAnimator.AYXKKw();
                C8045avN.this.OLrzqt(f, stateListAnimator);
                if (f <= 0.5f) {
                    stateListAnimator.KWHzl(fValueOf + ((0.8f - fAEQbTJ) * C8045avN.copydefault.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    stateListAnimator.copydefault(fGEmmrt + ((0.8f - fAEQbTJ) * C8045avN.copydefault.getInterpolation((f - 0.5f) / 0.5f)));
                }
                stateListAnimator.EZpvd(fAYXKKw + (0.25f * f));
                C8045avN c8045avN2 = C8045avN.this;
                c8045avN2.AEQbTJ((f * 216.0f) + ((c8045avN2.values / 5.0f) * 1080.0f));
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(AEQbTJ);
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: o.avN.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation2) {
                C8045avN.this.values = 0.0f;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation2) {
                stateListAnimator.isConnected();
                stateListAnimator.fetchVPNInfo();
                StateListAnimator stateListAnimator2 = stateListAnimator;
                stateListAnimator2.KWHzl(stateListAnimator2.EZpvd());
                C8045avN c8045avN = C8045avN.this;
                if (c8045avN.gEmmrt) {
                    c8045avN.gEmmrt = false;
                    animation2.setDuration(1332L);
                    stateListAnimator.OLrzqt(false);
                    return;
                }
                c8045avN.values = (c8045avN.values + 1.0f) % 5.0f;
            }
        });
        this.OLrzqt = animation;
    }

    /* JADX INFO: renamed from: o.avN$StateListAnimator */
    public static class StateListAnimator {
        public int AEQbTJ;
        public int AYXKKw;
        public int AhwBna;
        public int[] AkhnZx;
        public float AuCTel;
        public float DbNXlk;
        public android.graphics.Path EZpvd;
        public int KWHzl;
        public final android.graphics.Paint OLrzqt;
        public float copydefault;
        public int djBIcL;
        public float ejfBZ;
        public float fARcdN;
        public boolean fIwbmz;
        public float fJNWhG;
        public final android.graphics.Paint fetchVPNInfo;
        public final Drawable.Callback gEmmrt;
        public float getFieldNames;
        public float hDKMBd;
        public int isConnected;
        public final RectF iwGUEr = new RectF();
        public float uzCIH;
        public final android.graphics.Paint valueOf;
        public double values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double AEQbTJ() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(int i) {
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float AYXKKw() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float EZpvd() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(double d) {
            this.values = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(float f, float f2) {
            this.AhwBna = (int) f;
            this.KWHzl = (int) f2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(int i) {
            this.isConnected = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(int i) {
            this.AYXKKw = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float djBIcL() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float gEmmrt() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void isConnected() {
            this.hDKMBd = this.AuCTel;
            this.fARcdN = this.DbNXlk;
            this.fJNWhG = this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float valueOf() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float values() {
            return this.uzCIH;
        }

        public StateListAnimator(Drawable.Callback callback) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.fetchVPNInfo = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.OLrzqt = paint2;
            this.AuCTel = 0.0f;
            this.DbNXlk = 0.0f;
            this.ejfBZ = 0.0f;
            this.uzCIH = 5.0f;
            this.getFieldNames = 2.5f;
            this.valueOf = new android.graphics.Paint(1);
            this.gEmmrt = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public void KWHzl(android.graphics.Canvas canvas, android.graphics.Rect rect) {
            RectF rectF = this.iwGUEr;
            rectF.set(rect);
            float f = this.getFieldNames;
            rectF.inset(f, f);
            float f2 = this.AuCTel;
            float f3 = this.ejfBZ;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.DbNXlk + f3) * 360.0f) - f4;
            this.fetchVPNInfo.setColor(this.isConnected);
            canvas.drawArc(rectF, f4, f5, false, this.fetchVPNInfo);
            OLrzqt(canvas, f4, f5, rect);
            if (this.AEQbTJ < 255) {
                this.valueOf.setColor(this.AYXKKw);
                this.valueOf.setAlpha(255 - this.AEQbTJ);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, this.valueOf);
            }
        }

        public final void OLrzqt(android.graphics.Canvas canvas, float f, float f2, android.graphics.Rect rect) {
            if (this.fIwbmz) {
                android.graphics.Path path = this.EZpvd;
                if (path == null) {
                    android.graphics.Path path2 = new android.graphics.Path();
                    this.EZpvd = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = ((int) this.getFieldNames) / 2;
                float f4 = this.copydefault;
                float fCos = (float) ((this.values * java.lang.Math.cos(AudioStats.AUDIO_AMPLITUDE_NONE)) + ((double) rect.exactCenterX()));
                float fSin = (float) ((this.values * java.lang.Math.sin(AudioStats.AUDIO_AMPLITUDE_NONE)) + ((double) rect.exactCenterY()));
                this.EZpvd.moveTo(0.0f, 0.0f);
                this.EZpvd.lineTo(this.AhwBna * this.copydefault, 0.0f);
                android.graphics.Path path3 = this.EZpvd;
                float f5 = this.AhwBna;
                float f6 = this.copydefault;
                path3.lineTo((f5 * f6) / 2.0f, this.KWHzl * f6);
                this.EZpvd.offset(fCos - (f3 * f4), fSin);
                this.EZpvd.close();
                this.OLrzqt.setColor(this.isConnected);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.EZpvd, this.OLrzqt);
            }
        }

        public void OLrzqt(@androidx.annotation.NonNull int[] iArr) {
            this.AkhnZx = iArr;
            copydefault(0);
        }

        public void copydefault(int i) {
            this.djBIcL = i;
            this.isConnected = this.AkhnZx[i];
        }

        public int KWHzl() {
            return this.AkhnZx[copydefault()];
        }

        public final int copydefault() {
            return (this.djBIcL + 1) % this.AkhnZx.length;
        }

        public void fetchVPNInfo() {
            copydefault(copydefault());
        }

        public void KWHzl(ColorFilter colorFilter) {
            this.fetchVPNInfo.setColorFilter(colorFilter);
            DbNXlk();
        }

        public void AEQbTJ(float f) {
            this.uzCIH = f;
            this.fetchVPNInfo.setStrokeWidth(f);
            DbNXlk();
        }

        public void KWHzl(float f) {
            this.AuCTel = f;
            DbNXlk();
        }

        public int AhwBna() {
            return this.AkhnZx[this.djBIcL];
        }

        public void copydefault(float f) {
            this.DbNXlk = f;
            DbNXlk();
        }

        public void EZpvd(float f) {
            this.ejfBZ = f;
            DbNXlk();
        }

        public void EZpvd(int i, int i2) {
            float fMin = java.lang.Math.min(i, i2);
            double d = this.values;
            this.getFieldNames = (float) ((d <= AudioStats.AUDIO_AMPLITUDE_NONE || fMin < 0.0f) ? java.lang.Math.ceil(this.uzCIH / 2.0f) : ((double) (fMin / 2.0f)) - d);
        }

        public void OLrzqt(boolean z) {
            if (this.fIwbmz != z) {
                this.fIwbmz = z;
                DbNXlk();
            }
        }

        public void OLrzqt(float f) {
            if (f != this.copydefault) {
                this.copydefault = f;
                DbNXlk();
            }
        }

        public void AkhnZx() {
            this.hDKMBd = 0.0f;
            this.fARcdN = 0.0f;
            this.fJNWhG = 0.0f;
            KWHzl(0.0f);
            copydefault(0.0f);
            EZpvd(0.0f);
        }

        public final void DbNXlk() {
            this.gEmmrt.invalidateDrawable(null);
        }
    }
}
