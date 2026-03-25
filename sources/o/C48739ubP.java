package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48739ubP extends android.graphics.drawable.Drawable {
    public final java.lang.String AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public final java.lang.Float KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final android.graphics.Typeface djBIcL;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C48739ubP(@NotNull java.lang.String str, int i, @NotNull android.graphics.Typeface typeface, int i2, java.lang.Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(typeface, "");
        this.AEQbTJ = str;
        this.OLrzqt = i;
        this.djBIcL = typeface;
        this.copydefault = i2;
        this.KWHzl = f;
        this.EZpvd = new android.graphics.Paint(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.AEQbTJ.length() == 0) {
            return;
        }
        float f = 2;
        float fValueOf = C56548yJl.valueOf(getBounds().right / f, getBounds().bottom / f);
        this.EZpvd.setStyle(Paint.Style.FILL);
        this.EZpvd.setColor(this.OLrzqt);
        canvas.drawCircle(getBounds().right / f, getBounds().bottom / f, fValueOf, this.EZpvd);
        this.EZpvd.setColor(this.copydefault);
        this.EZpvd.setTypeface(this.djBIcL);
        java.lang.Float f2 = this.KWHzl;
        this.EZpvd.setTextSize(f2 != null ? f2.floatValue() : C56548yJl.valueOf((getBounds().right * 1) / f, C55298xhM.sp2pxFloat$default(16.0f, null, 1, null)));
        Paint.FontMetrics fontMetrics = this.EZpvd.getFontMetrics();
        Intrinsics.checkNotNullExpressionValue(fontMetrics, "");
        float f3 = fontMetrics.bottom;
        float f4 = (f3 - fontMetrics.top) / f;
        float fCenterY = getBounds().centerY();
        this.EZpvd.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(this.AEQbTJ, getBounds().centerX(), fCenterY + (f4 - f3), this.EZpvd);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.EZpvd.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.EZpvd.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
