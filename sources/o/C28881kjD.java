package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28881kjD extends android.graphics.drawable.Drawable {
    public final int AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final int EZpvd;
    public final float KWHzl;
    public final float OLrzqt;
    public int copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.copydefault = i;
    }

    public C28881kjD(float f, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, float f2) {
        this.OLrzqt = f;
        this.EZpvd = i;
        this.AEQbTJ = i2;
        this.KWHzl = f2;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.AYXKKw = paint;
        this.copydefault = 255;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullExpressionValue(getBounds(), "");
        RectF rectF = new RectF(0.0f, 0.0f, r1.width(), r1.height());
        this.AYXKKw.setShader(new LinearGradient(0.0f, r1.height(), 0.0f, 0.0f, this.EZpvd, this.AEQbTJ, Shader.TileMode.CLAMP));
        this.AYXKKw.setAlpha(C56548yJl.EZpvd((int) (this.copydefault * C56548yJl.KWHzl(this.KWHzl, 0.0f, 1.0f)), 0, 255));
        float f = this.OLrzqt;
        canvas.drawRoundRect(rectF, f, f, this.AYXKKw);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.AYXKKw.setColorFilter(colorFilter);
    }
}
