package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56991yZw extends AbstractC56986yZr<java.lang.Short> {
    public C56991yZw(short s) {
        super(java.lang.Short.valueOf(s));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOZsXlph = ynp.AEQbTJ().zsXlph();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOZsXlph, "");
        return abstractC59242zdOZsXlph;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().intValue() + ".toShort()";
    }
}
