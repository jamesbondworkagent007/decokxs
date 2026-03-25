package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fVQ extends android.text.style.ReplacementSpan {
    public final float AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public float KWHzl;
    public final float OLrzqt;
    public final java.lang.String copydefault;
    public int djBIcL;

    public fVQ(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.EZpvd = paint;
        this.OLrzqt = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        this.copydefault = str;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, @NotNull java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        this.djBIcL = iMeasureText;
        return iMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        this.KWHzl = paint.measureText(this.copydefault);
        float fDescent = paint.descent();
        float f3 = f;
        while (f3 < f + this.KWHzl) {
            canvas.drawCircle(f3, f2 + fDescent, this.AEQbTJ, this.EZpvd);
            f3 += (this.AEQbTJ * 2) + 5.0f;
        }
    }
}
