package o;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* JADX INFO: renamed from: o.Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5493Tw extends android.graphics.drawable.Drawable {
    public final android.graphics.Rect AEQbTJ;
    public C5492Tv EZpvd;
    public final android.graphics.Matrix KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final ValueAnimator.AnimatorUpdateListener copydefault = new ValueAnimator.AnimatorUpdateListener() { // from class: o.Tw.5
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            C5493Tw.this.invalidateSelf();
        }
    };
    public android.animation.ValueAnimator valueOf;

    public final float EZpvd(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.Nullable ColorFilter colorFilter) {
    }

    public C5493Tw() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        this.AEQbTJ = new android.graphics.Rect();
        this.KWHzl = new android.graphics.Matrix();
        paint.setAntiAlias(true);
    }

    public void EZpvd(@androidx.annotation.Nullable C5492Tv c5492Tv) {
        this.EZpvd = c5492Tv;
        if (c5492Tv != null) {
            this.OLrzqt.setXfermode(new PorterDuffXfermode(c5492Tv.EZpvd ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        AEQbTJ();
        gEmmrt();
        invalidateSelf();
    }

    public void EZpvd() {
        if (this.valueOf == null || copydefault() || getCallback() == null) {
            return;
        }
        this.valueOf.start();
    }

    public void KWHzl() {
        if (this.valueOf == null || !copydefault()) {
            return;
        }
        this.valueOf.cancel();
    }

    public boolean copydefault() {
        android.animation.ValueAnimator valueAnimator = this.valueOf;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.AEQbTJ.set(0, 0, rect.width(), rect.height());
        AEQbTJ();
        OLrzqt();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        float fEZpvd;
        float fEZpvd2;
        if (this.EZpvd == null || this.OLrzqt.getShader() == null) {
            return;
        }
        float fTan = (float) java.lang.Math.tan(java.lang.Math.toRadians(this.EZpvd.fIwbmz));
        float fHeight = this.AEQbTJ.height() + (this.AEQbTJ.width() * fTan);
        float fWidth = this.AEQbTJ.width() + (fTan * this.AEQbTJ.height());
        android.animation.ValueAnimator valueAnimator = this.valueOf;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.EZpvd.gEmmrt;
        if (i != 1) {
            if (i == 2) {
                fEZpvd2 = EZpvd(fWidth, -fWidth, animatedFraction);
            } else if (i != 3) {
                fEZpvd2 = EZpvd(-fWidth, fWidth, animatedFraction);
            } else {
                fEZpvd = EZpvd(fHeight, -fHeight, animatedFraction);
            }
            f = fEZpvd2;
            fEZpvd = 0.0f;
        } else {
            fEZpvd = EZpvd(-fHeight, fHeight, animatedFraction);
        }
        this.KWHzl.reset();
        this.KWHzl.setRotate(this.EZpvd.fIwbmz, this.AEQbTJ.width() / 2.0f, this.AEQbTJ.height() / 2.0f);
        this.KWHzl.postTranslate(f, fEZpvd);
        this.OLrzqt.getShader().setLocalMatrix(this.KWHzl);
        canvas.drawRect(this.AEQbTJ, this.OLrzqt);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C5492Tv c5492Tv = this.EZpvd;
        return (c5492Tv == null || !(c5492Tv.djBIcL || c5492Tv.EZpvd)) ? -1 : -3;
    }

    public final void gEmmrt() {
        boolean zIsStarted;
        if (this.EZpvd == null) {
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.valueOf;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.valueOf.cancel();
            this.valueOf.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        C5492Tv c5492Tv = this.EZpvd;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, (c5492Tv.fARcdN / c5492Tv.copydefault) + 1.0f);
        this.valueOf = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.EZpvd.AuCTel);
        this.valueOf.setRepeatCount(this.EZpvd.fJNWhG);
        android.animation.ValueAnimator valueAnimator2 = this.valueOf;
        C5492Tv c5492Tv2 = this.EZpvd;
        valueAnimator2.setDuration(c5492Tv2.copydefault + c5492Tv2.fARcdN);
        this.valueOf.addUpdateListener(this.copydefault);
        if (zIsStarted) {
            this.valueOf.start();
        }
    }

    public void OLrzqt() {
        C5492Tv c5492Tv;
        android.animation.ValueAnimator valueAnimator = this.valueOf;
        if (valueAnimator == null || valueAnimator.isStarted() || (c5492Tv = this.EZpvd) == null || !c5492Tv.AEQbTJ || getCallback() == null) {
            return;
        }
        this.valueOf.start();
    }

    public final void AEQbTJ() {
        C5492Tv c5492Tv;
        Shader radialGradient;
        android.graphics.Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (c5492Tv = this.EZpvd) == null) {
            return;
        }
        int iKWHzl = c5492Tv.KWHzl(iWidth);
        int iEZpvd = this.EZpvd.EZpvd(iHeight);
        C5492Tv c5492Tv2 = this.EZpvd;
        boolean z = true;
        if (c5492Tv2.ejfBZ != 1) {
            int i = c5492Tv2.gEmmrt;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iKWHzl = 0;
            }
            if (!z) {
                iEZpvd = 0;
            }
            float f = iEZpvd;
            C5492Tv c5492Tv3 = this.EZpvd;
            radialGradient = new LinearGradient(0.0f, 0.0f, iKWHzl, f, c5492Tv3.AhwBna, c5492Tv3.values, Shader.TileMode.CLAMP);
        } else {
            float f2 = iEZpvd / 2.0f;
            float fMax = (float) (((double) java.lang.Math.max(iKWHzl, iEZpvd)) / java.lang.Math.sqrt(2.0d));
            C5492Tv c5492Tv4 = this.EZpvd;
            radialGradient = new RadialGradient(iKWHzl / 2.0f, f2, fMax, c5492Tv4.AhwBna, c5492Tv4.values, Shader.TileMode.CLAMP);
        }
        this.OLrzqt.setShader(radialGradient);
    }
}
