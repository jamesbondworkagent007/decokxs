package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59241zdN extends AbstractC59270zdq {
    @Override // o.AbstractC59267zdn, o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59241zdN(@NotNull AbstractC59242zdO abstractC59242zdO) {
        super(abstractC59242zdO);
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C59241zdN KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C59241zdN(abstractC59242zdO);
    }
}
