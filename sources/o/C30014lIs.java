package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30014lIs extends android.text.style.ReplacementSpan {
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, @NotNull java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return this.OLrzqt + (this.AEQbTJ * 2);
    }

    public C30014lIs(int i, int i2, int i3, int i4, boolean z) {
        this.copydefault = i;
        this.KWHzl = i2;
        this.OLrzqt = i3;
        this.AEQbTJ = i4;
        this.EZpvd = z;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
        int i6 = this.EZpvd ? this.copydefault : this.KWHzl;
        int color = paint.getColor();
        paint.setColor(i6);
        float f2 = i4;
        canvas.drawRect(this.AEQbTJ + f, paint.getFontMetrics().ascent + f2, this.AEQbTJ + f + this.OLrzqt, f2 + paint.getFontMetrics().descent, paint);
        paint.setColor(color);
    }
}
