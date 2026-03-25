package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nSU extends android.graphics.drawable.Drawable {
    public final float AEQbTJ;
    public final int AYXKKw;
    public final RectF AhwBna;
    public final float EZpvd;
    public final int KWHzl;
    public final float OLrzqt;
    public final android.graphics.Paint copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public nSU(float f, float f2, int i, int i2, float f3) {
        this.OLrzqt = f;
        this.EZpvd = f2;
        this.AYXKKw = i;
        this.KWHzl = i2;
        this.AEQbTJ = f3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        this.copydefault = paint;
        this.AhwBna = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        float f = this.OLrzqt / 2.0f;
        this.AhwBna.set(getBounds().left + f, getBounds().top + f, getBounds().right - f, getBounds().bottom - f);
        float f2 = getBounds().top;
        float f3 = getBounds().bottom;
        float f4 = this.AEQbTJ;
        if (f4 > 0.0f) {
            android.graphics.Paint paint = this.copydefault;
            int i = this.AYXKKw;
            paint.setShader(new LinearGradient(0.0f, f2, 0.0f, f3, new int[]{i, i, this.KWHzl}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        } else {
            this.copydefault.setShader(new LinearGradient(0.0f, f2, 0.0f, f3, this.AYXKKw, this.KWHzl, Shader.TileMode.CLAMP));
        }
        RectF rectF = this.AhwBna;
        float f5 = this.EZpvd;
        canvas.drawRoundRect(rectF, f5, f5, this.copydefault);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.copydefault.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.copydefault.setColorFilter(colorFilter);
    }
}
