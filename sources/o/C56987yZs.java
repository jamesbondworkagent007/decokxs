package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56987yZs extends AbstractC56986yZr<java.lang.Long> {
    public C56987yZs(long j) {
        super(java.lang.Long.valueOf(j));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOHDKMBd = ynp.AEQbTJ().hDKMBd();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOHDKMBd, "");
        return abstractC59242zdOHDKMBd;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().longValue() + ".toLong()";
    }
}
