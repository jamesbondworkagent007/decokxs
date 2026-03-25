package o;

import android.graphics.Paint;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: renamed from: o.xfu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55226xfu implements android.text.style.LeadingMarginSpan {
    public int AEQbTJ;
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.EZpvd != -1 ? 20 : 16;
    }

    public C55226xfu(@androidx.annotation.ColorInt int i) {
        this.EZpvd = -1;
        this.AEQbTJ = i;
    }

    public C55226xfu(int i, @androidx.annotation.ColorInt int i2) {
        this.EZpvd = i;
        this.AEQbTJ = i2;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
        if (((android.text.Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            int color = paint.getColor();
            paint.setColor(this.AEQbTJ);
            if (this.EZpvd != -1) {
                java.lang.String str = this.EZpvd + JwtUtilsKt.JWT_DELIMITER;
                canvas.drawText(str, (i - (AEQbTJ(paint, str) / 2.0f)) + i2, i4, paint);
            } else {
                canvas.drawText("•", (i - (AEQbTJ(paint, "•") / 2.0f)) + i2, i4, paint);
            }
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    public final float AEQbTJ(android.graphics.Paint paint, java.lang.String str) {
        return paint.measureText(str);
    }
}
