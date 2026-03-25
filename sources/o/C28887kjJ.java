package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28887kjJ extends android.graphics.drawable.Drawable {
    public final int AEQbTJ;
    public final int EZpvd;
    public final android.graphics.Paint KWHzl;
    public final int OLrzqt;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C28887kjJ(int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3) {
        this.EZpvd = i;
        this.OLrzqt = i2;
        this.AEQbTJ = i3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.KWHzl = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullExpressionValue(getBounds(), "");
        float fWidth = r1.width() / 2.0f;
        float fHeight = r1.height() / 2.0f;
        float fMin = java.lang.Math.min(r1.width(), r1.height()) / 2.0f;
        this.KWHzl.setShader(new LinearGradient(0.0f, r1.height(), 0.0f, 0.0f, this.OLrzqt, this.AEQbTJ, Shader.TileMode.CLAMP));
        canvas.drawCircle(fWidth, fHeight, fMin - (this.EZpvd / 2.0f), this.KWHzl);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.KWHzl.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.KWHzl.setColorFilter(colorFilter);
    }
}
