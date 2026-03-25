package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45375soc extends android.text.style.ReplacementSpan {
    public int AEQbTJ;
    public final int EZpvd;
    public final float KWHzl;
    public final int OLrzqt;
    public final android.graphics.Typeface copydefault;

    public C45375soc(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, float f, android.graphics.Typeface typeface) {
        this.OLrzqt = i;
        this.EZpvd = i2;
        this.KWHzl = f;
        this.copydefault = typeface;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(paint.measureText(charSequence, i, i2)));
        this.AEQbTJ = iAhwBna;
        return iAhwBna;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        paint.setAntiAlias(true);
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(this.KWHzl, null, 1, null));
        paint.setColor(this.OLrzqt);
        float f2 = 2;
        canvas.drawLine(f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)) + f2, 8 + C33129mqd.djBIcL(java.lang.Integer.valueOf(this.AEQbTJ)) + f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)) + f2, paint);
        paint.setColor(this.EZpvd);
        paint.setTypeface(this.copydefault);
        canvas.drawText(charSequence == null ? "" : charSequence, i, i2, f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)), paint);
    }
}
