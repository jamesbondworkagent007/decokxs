package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56974yZf extends AbstractC56975yZg<java.lang.Double> {
    public C56974yZf(double d) {
        super(java.lang.Double.valueOf(d));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOEjfBZ = ynp.AEQbTJ().ejfBZ();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOEjfBZ, "");
        return abstractC59242zdOEjfBZ;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().doubleValue() + ".toDouble()";
    }
}
