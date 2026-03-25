package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30822liR extends android.graphics.drawable.Drawable {
    public final float AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public final int KWHzl;
    public final android.graphics.Paint copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C30822liR(int i, float f) {
        this.KWHzl = i;
        this.AEQbTJ = f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.EZpvd = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.copydefault = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        int iSaveLayer = canvas.saveLayer(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, null);
        canvas.drawRect(getBounds(), this.EZpvd);
        float f = getBounds().right;
        float f2 = getBounds().bottom;
        float f3 = 2;
        float f4 = this.AEQbTJ * f3;
        canvas.drawArc(new RectF(f - f4, f2 - f4, f, f2), 0.0f, 90.0f, true, this.copydefault);
        float f5 = getBounds().right;
        float f6 = getBounds().top;
        float f7 = this.AEQbTJ * f3;
        canvas.drawArc(new RectF(f5 - f7, f6, f5, f7 + f6), 270.0f, 90.0f, true, this.copydefault);
        float f8 = getBounds().left;
        float f9 = getBounds().top;
        float f10 = this.AEQbTJ * f3;
        canvas.drawArc(new RectF(f8, f9, f10 + f8, f10 + f9), 180.0f, 90.0f, true, this.copydefault);
        float f11 = getBounds().left;
        float f12 = getBounds().bottom;
        float f13 = f3 * this.AEQbTJ;
        canvas.drawArc(new RectF(f11, f12 - f13, f13 + f11, f12), 90.0f, 90.0f, true, this.copydefault);
        canvas.drawRect(new RectF(getBounds().left, getBounds().top + this.AEQbTJ, getBounds().right, getBounds().bottom - this.AEQbTJ), this.copydefault);
        canvas.drawRect(new RectF(getBounds().left + this.AEQbTJ, getBounds().top, getBounds().right - this.AEQbTJ, getBounds().bottom), this.copydefault);
        canvas.restoreToCount(iSaveLayer);
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
