package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59240zdM extends AbstractC59270zdq {
    @Override // o.AbstractC59267zdn, o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59240zdM(@NotNull AbstractC59242zdO abstractC59242zdO) {
        super(abstractC59242zdO);
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C59240zdM KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C59240zdM(abstractC59242zdO);
    }
}
