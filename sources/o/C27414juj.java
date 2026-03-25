package o;

import com.github.mikephil.charting.highlight.ChartHighlighter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27414juj extends ChartHighlighter<C27413jui> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27414juj(@NotNull C27413jui c27413jui) {
        super(c27413jui);
        Intrinsics.checkNotNullParameter(c27413jui, "");
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public float getDistance(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(f - f3);
    }
}
