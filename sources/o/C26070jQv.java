package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26070jQv extends android.text.style.MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        textPaint.setFakeBoldText(true);
        textPaint.setStrokeWidth(0.1f);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        textPaint.setFakeBoldText(true);
    }
}
