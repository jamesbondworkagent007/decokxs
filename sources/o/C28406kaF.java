package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28406kaF extends android.text.style.ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28406kaF(@NotNull android.graphics.drawable.Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.drawable.Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float fHeight = (i4 + ((fontMetricsInt.descent + fontMetricsInt.ascent) / 2)) - (drawable.getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(f, fHeight);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
