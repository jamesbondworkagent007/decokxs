package o;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28882kjE extends android.graphics.drawable.Drawable {
    public android.animation.ValueAnimator AEQbTJ;
    public final float AYXKKw;
    public float AhwBna;
    public final PathMeasure AkhnZx;
    public final float DbNXlk;
    public final android.graphics.Path EZpvd;
    public final int KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final int copydefault;
    public float djBIcL;
    public float gEmmrt;
    public final float valueOf;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C28882kjE(float f, float f2, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, float f3) {
        this.AYXKKw = f;
        this.valueOf = f2;
        this.KWHzl = i;
        this.copydefault = i2;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.OLrzqt = paint;
        this.DbNXlk = C56548yJl.KWHzl(f3, 0.0f, 1.0f);
        this.EZpvd = new android.graphics.Path();
        this.AkhnZx = new PathMeasure();
        this.gEmmrt = -1.0f;
        this.AhwBna = -1.0f;
    }

    public final void copydefault(float f) {
        this.djBIcL = C56548yJl.KWHzl(f, 0.0f, 1.0f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullExpressionValue(getBounds(), "");
        float f = this.AYXKKw / 2.0f;
        RectF rectF = new RectF(f, f, r1.width() - f, r1.height() - f);
        this.EZpvd.reset();
        android.graphics.Path path = this.EZpvd;
        float f2 = this.valueOf;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        LinearGradient linearGradient = new LinearGradient(0.0f, r1.height(), 0.0f, 0.0f, this.KWHzl, this.copydefault, Shader.TileMode.CLAMP);
        if (this.djBIcL > 0.0f) {
            this.AkhnZx.setPath(this.EZpvd, false);
            float length = this.AkhnZx.getLength();
            float f3 = this.djBIcL * length;
            if (this.gEmmrt < 0.0f || this.AhwBna != length) {
                this.AhwBna = length;
                this.gEmmrt = KWHzl(length, f);
            }
            android.graphics.Path path2 = new android.graphics.Path();
            float f4 = this.gEmmrt;
            if (f3 <= length - f4) {
                this.AkhnZx.getSegment(f4, f3 + f4, path2, true);
            } else {
                this.AkhnZx.getSegment(f4, length, path2, true);
                float f5 = this.gEmmrt;
                android.graphics.Path path3 = new android.graphics.Path();
                this.AkhnZx.getSegment(0.0f, f3 - (length - f5), path3, true);
                path2.addPath(path3);
            }
            this.OLrzqt.setShader(linearGradient);
            this.OLrzqt.setAlpha(255);
            canvas.drawPath(path2, this.OLrzqt);
        }
    }

    public static /* synthetic */ void animateProgress$default(C28882kjE c28882kjE, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        c28882kjE.AEQbTJ(j, j2);
    }

    public final void AEQbTJ(long j, long j2) {
        android.animation.ValueAnimator valueAnimator = this.AEQbTJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, this.DbNXlk);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.kjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C28882kjE.AEQbTJ(this.OLrzqt, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.AEQbTJ = valueAnimatorOfFloat;
    }

    public static final void AEQbTJ(C28882kjE c28882kjE, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c28882kjE.copydefault(((java.lang.Float) animatedValue).floatValue());
    }

    public final void KWHzl(float f) {
        android.animation.ValueAnimator valueAnimator = this.AEQbTJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        copydefault(f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.OLrzqt.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.OLrzqt.setColorFilter(colorFilter);
    }

    public final float KWHzl(float f, float f2) {
        float fWidth = getBounds().width() / 2.0f;
        float fHeight = getBounds().height();
        float[] fArr = new float[2];
        float f3 = 0.0f;
        float f4 = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            float f5 = (i * f) / 360;
            this.AkhnZx.getPosTan(f5, fArr, null);
            float f6 = fArr[0] - fWidth;
            float f7 = fArr[1] - (fHeight - f2);
            float f8 = (f6 * f6) + (f7 * f7);
            if (f8 < f4) {
                f3 = f5;
                f4 = f8;
            }
            if (i == 360) {
                return f3;
            }
            i++;
        }
    }
}
