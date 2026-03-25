package o;

import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qZE extends android.text.style.ReplacementSpan {
    public final android.graphics.drawable.Drawable KWHzl;

    public qZE(@NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        android.content.res.Resources resources = C52762wXk.AEQbTJ().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        this.KWHzl = bitmapDrawable;
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.Rect bounds = this.KWHzl.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        if (fontMetricsInt != null) {
            int iHeight = (bounds.height() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2;
            fontMetricsInt.ascent -= iHeight;
            fontMetricsInt.descent = fontMetricsInt.descent + iHeight + 1;
            fontMetricsInt.top -= iHeight;
            fontMetricsInt.bottom = fontMetricsInt.bottom + iHeight + 1;
        }
        return bounds.right;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        android.graphics.Rect bounds = drawable.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        int iSave = canvas.save();
        try {
            if (bounds.height() < i5 - i3) {
                canvas.translate(f, ((i5 + i3) - bounds.height()) / 2);
            } else {
                canvas.translate(f, i3);
            }
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
