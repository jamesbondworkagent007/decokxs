package o;

import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46452tUw extends android.text.style.ReplacementSpan {
    public final int AEQbTJ;
    public final float KWHzl;
    public final int OLrzqt;
    public final float EZpvd = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
    public final float copydefault = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);

    public C46452tUw(int i, int i2, float f) {
        this.OLrzqt = i;
        this.AEQbTJ = i2;
        this.KWHzl = f;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        return yII.EZpvd(AEQbTJ(charSequence, i, i2, paint) + (this.KWHzl * 2));
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        RectF rectF = new RectF(f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i3)) + this.EZpvd, getSize(paint, charSequence, i, i2, null) + f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i5)) - this.EZpvd);
        paint.setColor(this.AEQbTJ);
        float f2 = this.KWHzl;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.OLrzqt);
        if (charSequence != null) {
            canvas.drawText(charSequence, i, i2, f + this.KWHzl, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)) - this.copydefault, paint);
        }
    }

    public final float AEQbTJ(java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint paint) {
        return paint.measureText(charSequence, i, i2);
    }
}
