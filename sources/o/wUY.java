package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wUY extends android.text.style.ReplacementSpan {
    public int AEQbTJ;
    public final int KWHzl;
    public final float OLrzqt;
    public final int copydefault;

    public wUY(int i, int i2, float f) {
        this.KWHzl = i;
        this.copydefault = i2;
        this.OLrzqt = f;
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
        paint.setStrokeWidth(this.OLrzqt);
        paint.setColor(this.KWHzl);
        canvas.drawLine(f, C33129mqd.djBIcL(C33129mqd.addS$default(java.lang.Integer.valueOf(i4), 14, null, null, null, 14, null)), f + C33129mqd.djBIcL(java.lang.Integer.valueOf(this.AEQbTJ)), C33129mqd.djBIcL(C33129mqd.addS$default(java.lang.Integer.valueOf(i4), 14, null, null, null, 14, null)), paint);
        paint.setColor(this.copydefault);
        canvas.drawText(charSequence == null ? "" : charSequence, i, i2, f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)), paint);
    }
}
