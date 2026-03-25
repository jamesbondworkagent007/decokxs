package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHM extends android.text.style.ReplacementSpan {
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
    }

    public pHM(int i) {
        this.copydefault = i;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, @NotNull java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (fontMetricsInt != null) {
            int fontMetricsInt2 = (-this.copydefault) - paint.getFontMetricsInt(fontMetricsInt);
            fontMetricsInt.top = fontMetricsInt2;
            fontMetricsInt.ascent = fontMetricsInt2;
            fontMetricsInt.bottom = 0;
            fontMetricsInt.descent = 0;
        }
        return 0;
    }
}
