package o;

import android.graphics.Paint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57306yft extends android.text.style.ImageSpan {
    public final int OLrzqt;
    public final int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57306yft(@NotNull android.graphics.drawable.Drawable drawable, int i, int i2) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "");
        this.copydefault = i;
        this.OLrzqt = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 android.graphics.drawable.Drawable)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(android.graphics.drawable.Drawable, int, int):void (m)] (LINE:9) call: o.yft.<init>(android.graphics.drawable.Drawable, int, int):void type: THIS */
    public /* synthetic */ C57306yft(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
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
        return this.copydefault + bounds.right + this.OLrzqt;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = (fontMetricsInt.descent - fontMetricsInt.ascent) / 2;
        canvas.translate(this.copydefault + f, ((i4 + r4) - i6) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
