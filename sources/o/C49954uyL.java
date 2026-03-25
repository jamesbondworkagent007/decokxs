package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49954uyL extends android.text.style.MetricAffectingSpan {
    public final android.graphics.Typeface copydefault;

    public C49954uyL(@NotNull android.graphics.Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        this.copydefault = typeface;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        AEQbTJ(textPaint, this.copydefault);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        AEQbTJ(textPaint, this.copydefault);
    }

    public final void AEQbTJ(android.graphics.Paint paint, android.graphics.Typeface typeface) {
        android.graphics.Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (~typeface.getStyle());
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
