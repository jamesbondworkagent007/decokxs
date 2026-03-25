package o;

import com.github.mikephil.charting.highlight.ChartHighlighter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27415juk extends ChartHighlighter<C27382juD> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27415juk(@NotNull C27382juD c27382juD) {
        super(c27382juD);
        Intrinsics.checkNotNullParameter(c27382juD, "");
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public float getDistance(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(f - f3);
    }
}
