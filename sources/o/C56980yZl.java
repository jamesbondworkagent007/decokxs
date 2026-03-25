package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56980yZl extends AbstractC56975yZg<java.lang.Float> {
    public C56980yZl(float f) {
        super(java.lang.Float.valueOf(f));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOFJNWhG = ynp.AEQbTJ().fJNWhG();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOFJNWhG, "");
        return abstractC59242zdOFJNWhG;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().floatValue() + ".toFloat()";
    }
}
