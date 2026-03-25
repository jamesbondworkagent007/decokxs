package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.utu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49724utu extends android.graphics.drawable.Drawable {
    public final float AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public final float KWHzl;
    public final int[] OLrzqt;
    public final float copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C49724utu(@NotNull int[] iArr, float f) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.OLrzqt = iArr;
        this.KWHzl = f;
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        this.AEQbTJ = fDp2pxFloat$default;
        this.copydefault = fDp2pxFloat$default / 2;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fDp2pxFloat$default);
        this.EZpvd = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        float f = this.copydefault;
        RectF rectF = new RectF(f, f, getBounds().width() - this.copydefault, getBounds().height() - this.copydefault);
        this.EZpvd.setShader(new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, this.OLrzqt, (float[]) null, Shader.TileMode.CLAMP));
        float f2 = this.KWHzl;
        canvas.drawRoundRect(rectF, f2, f2, this.EZpvd);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.EZpvd.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.EZpvd.setColorFilter(colorFilter);
    }
}
