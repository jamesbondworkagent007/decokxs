package o;

import com.github.mikephil.charting.highlight.ChartHighlighter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19620gJc extends ChartHighlighter<gIW> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19620gJc(@NotNull gIW giw) {
        super(giw);
        Intrinsics.checkNotNullParameter(giw, "");
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public float getDistance(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(f - f3);
    }
}
