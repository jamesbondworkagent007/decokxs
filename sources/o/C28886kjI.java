package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28886kjI extends android.graphics.drawable.Drawable {
    public final int AEQbTJ;
    public final float AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final android.graphics.Paint copydefault;
    public final android.graphics.Paint gEmmrt;
    public final float valueOf;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C28886kjI(float f, float f2, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4) {
        this.valueOf = f;
        this.AhwBna = f2;
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
        this.KWHzl = i4;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.gEmmrt = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        float f = this.valueOf / 2.0f;
        float fCopydefault = C56548yJl.copydefault(this.AhwBna - f, 0.0f);
        float f2 = this.valueOf;
        RectF rectF = new RectF(f2, f2, bounds.width() - this.valueOf, bounds.height() - this.valueOf);
        float fHeight = bounds.height();
        int i = this.EZpvd;
        int i2 = this.KWHzl;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.gEmmrt.setShader(new LinearGradient(0.0f, fHeight, 0.0f, 0.0f, i, i2, tileMode));
        canvas.drawRoundRect(rectF, fCopydefault, fCopydefault, this.gEmmrt);
        RectF rectF2 = new RectF(f, f, bounds.width() - f, bounds.height() - f);
        this.copydefault.setShader(new LinearGradient(0.0f, bounds.height(), 0.0f, 0.0f, this.AEQbTJ, this.OLrzqt, tileMode));
        float f3 = this.AhwBna;
        canvas.drawRoundRect(rectF2, f3, f3, this.copydefault);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.copydefault.setAlpha(i);
        this.gEmmrt.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.copydefault.setColorFilter(colorFilter);
        this.gEmmrt.setColorFilter(colorFilter);
    }
}
