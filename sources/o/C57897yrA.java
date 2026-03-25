package o;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import androidx.work.WorkRequest;
import com.okinc.crcore.coreapi.service.IMarketApiService;

/* JADX INFO: renamed from: o.yrA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57897yrA extends AbstractC57947yry implements Animatable, ValueAnimator.AnimatorUpdateListener {
    public android.animation.ValueAnimator AEQbTJ;
    public int KWHzl = 0;
    public int copydefault = 0;
    public int OLrzqt = 0;
    public android.graphics.Path EZpvd = new android.graphics.Path();

    public C57897yrA() {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(30, IMarketApiService.SIXTY_MINUTES);
        this.AEQbTJ = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(WorkRequest.MIN_BACKOFF_MILLIS);
        this.AEQbTJ.setInterpolator(null);
        this.AEQbTJ.setRepeatCount(-1);
        this.AEQbTJ.setRepeatMode(1);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.OLrzqt = (((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f = iWidth;
        float fMax = java.lang.Math.max(1.0f, f / 22.0f);
        if (this.KWHzl != iWidth || this.copydefault != iHeight) {
            this.EZpvd.reset();
            android.graphics.Path path = this.EZpvd;
            float f2 = f - fMax;
            float f3 = iHeight / 2.0f;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f2, f3, fMax, direction);
            float f4 = f - (5.0f * fMax);
            this.EZpvd.addRect(f4, f3 - fMax, f2, f3 + fMax, direction);
            this.EZpvd.addCircle(f4, f3, fMax, direction);
            this.KWHzl = iWidth;
            this.copydefault = iHeight;
        }
        canvas.save();
        float f5 = f / 2.0f;
        float f6 = iHeight / 2.0f;
        canvas.rotate(this.OLrzqt, f5, f6);
        for (int i = 0; i < 12; i++) {
            this.values.setAlpha((i + 5) * 17);
            canvas.rotate(30.0f, f5, f6);
            canvas.drawPath(this.EZpvd, this.values);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.AEQbTJ.isRunning()) {
            return;
        }
        this.AEQbTJ.addUpdateListener(this);
        this.AEQbTJ.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.AEQbTJ.isRunning()) {
            this.AEQbTJ.removeAllListeners();
            this.AEQbTJ.removeAllUpdateListeners();
            this.AEQbTJ.cancel();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.AEQbTJ.isRunning();
    }
}
