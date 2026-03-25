package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40494qXy extends android.text.style.ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40494qXy(@NotNull android.graphics.drawable.Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, @NotNull java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.drawable.Drawable drawable = getDrawable();
        float fHeight = ((i4 + paint.getFontMetricsInt().ascent) + ((paint.getFontMetricsInt().descent - paint.getFontMetricsInt().ascent) / 2)) - (drawable.getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(f, fHeight);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
