package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59244zdQ extends AbstractC59270zdq {
    public final C59308zeb KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59267zdn, o.AbstractC59233zdF
    public C59308zeb bX_() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59244zdQ(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull C59308zeb c59308zeb) {
        super(abstractC59242zdO);
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        this.KWHzl = c59308zeb;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C59244zdQ KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C59244zdQ(abstractC59242zdO, bX_());
    }
}
