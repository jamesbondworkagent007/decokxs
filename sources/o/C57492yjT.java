package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57492yjT extends android.text.style.CharacterStyle implements android.text.style.LineBackgroundSpan, android.text.style.UpdateAppearance {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final float KWHzl;
    public final android.graphics.Paint OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
    }

    public C57492yjT(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.AEQbTJ = str;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(0.5f, null, 1, null));
        paint.setAntiAlias(true);
        this.OLrzqt = paint;
        this.KWHzl = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull android.graphics.Canvas canvas, @NotNull android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, @NotNull java.lang.CharSequence charSequence, int i6, int i7, int i8) {
        float f;
        float fMeasureText;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            int spanStart = spanned.getSpanStart(this);
            int spanEnd = spanned.getSpanEnd(this);
            if (i7 <= spanStart || i6 >= spanEnd) {
                return;
            }
            int iMax = java.lang.Math.max(i6, spanStart);
            int iMin = java.lang.Math.min(i7, spanEnd);
            float fMeasureText2 = iMax > i6 ? i + paint.measureText(charSequence, i6, iMax) : i;
            if (iMin < i7) {
                f = i;
                fMeasureText = paint.measureText(charSequence, i6, iMin);
            } else {
                f = i;
                fMeasureText = paint.measureText(charSequence, i6, i7);
            }
            android.graphics.Path path = new android.graphics.Path();
            float f2 = i4 + this.KWHzl;
            path.moveTo(fMeasureText2, f2);
            path.lineTo(f + fMeasureText, f2);
            canvas.drawPath(path, this.OLrzqt);
        }
    }
}
