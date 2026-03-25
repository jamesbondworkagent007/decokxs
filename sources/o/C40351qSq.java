package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40351qSq extends android.text.style.ReplacementSpan {
    public final Paint.FontMetricsInt OLrzqt = new Paint.FontMetricsInt();

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, @NotNull java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        paint.getFontMetricsInt(this.OLrzqt);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = this.OLrzqt;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return (int) paint.measureText(charSequence, i, i2);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
        canvas.drawText(charSequence, i, i2, f, i4, paint);
    }
}
