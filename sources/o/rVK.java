package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rVK extends android.text.style.ReplacementSpan {
    public final int AEQbTJ;
    public int EZpvd;
    public final android.content.Context OLrzqt;
    public final int copydefault;

    public rVK(@NotNull android.content.Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.copydefault = i;
        this.AEQbTJ = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(paint.measureText(charSequence, i, i2)));
        this.EZpvd = iAhwBna;
        return iAhwBna;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        paint.setAntiAlias(true);
        paint.setStrokeWidth(12.0f);
        paint.setColor(this.copydefault);
        canvas.drawLine(f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)), f + C33129mqd.djBIcL(java.lang.Integer.valueOf(this.EZpvd)), C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)), paint);
        paint.setColor(this.AEQbTJ);
        canvas.drawText(charSequence == null ? "" : charSequence, i, i2, f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)), paint);
    }
}
