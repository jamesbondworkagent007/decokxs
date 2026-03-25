package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57494yjV extends android.text.style.ReplacementSpan {
    public final float AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public int KWHzl;
    public float OLrzqt;
    public final java.lang.String copydefault;

    public C57494yjV(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.EZpvd = paint;
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(0.5f, null, 1, null));
        this.copydefault = str;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, @NotNull java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        this.KWHzl = iMeasureText;
        return iMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        this.OLrzqt = paint.measureText(this.copydefault);
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, this.AEQbTJ + f2);
        path.lineTo(this.OLrzqt + f, f2 + this.AEQbTJ);
        canvas.drawPath(path, this.EZpvd);
    }
}
