package o;

import android.graphics.Paint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mAB extends android.text.style.ImageSpan {
    public final int EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mAB(@NotNull android.graphics.drawable.Drawable drawable, int i) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "");
        this.EZpvd = i;
        drawable.setLayoutDirection(C55296xhK.AEQbTJ(C32979mnm.EZpvd.OLrzqt()));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.graphics.drawable.Drawable)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(android.graphics.drawable.Drawable, int):void (m)] (LINE:17) call: o.mAB.<init>(android.graphics.drawable.Drawable, int):void type: THIS */
    public /* synthetic */ mAB(android.graphics.drawable.Drawable drawable, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? 0 : i);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.Rect bounds = getDrawable().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int i6 = (bounds.bottom - bounds.top) / 2;
            int i7 = i5 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            int i8 = i5 + i6;
            fontMetricsInt.bottom = i8;
            fontMetricsInt.descent = i8;
        }
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        int i6 = paint.getFontMetricsInt().descent;
        canvas.translate(f, (((i4 + i6) - ((i6 - r3.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2)) - this.EZpvd);
        drawable.draw(canvas);
        canvas.restore();
    }
}
