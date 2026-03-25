package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59186zcL extends AbstractC59267zdn {
    public final AbstractC59242zdO AEQbTJ;
    public final AbstractC59242zdO KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59267zdn
    public AbstractC59242zdO EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59242zdO valueOf() {
        return this.AEQbTJ;
    }

    public C59186zcL(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
        this.KWHzl = abstractC59242zdO;
        this.AEQbTJ = abstractC59242zdO2;
    }

    public final AbstractC59242zdO gEmmrt() {
        return EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new C59186zcL(EZpvd().AEQbTJ(c59308zeb), this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Z)Lo/zdO; */
    @Override // o.AbstractC59242zdO
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C59186zcL AEQbTJ(boolean z) {
        return new C59186zcL(EZpvd().AEQbTJ(z), this.AEQbTJ.AEQbTJ(z));
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C59186zcL KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C59186zcL(abstractC59242zdO, this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zeG;)Lo/zdO; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59267zdn, o.AbstractC59331zey
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C59186zcL KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = abstractC59287zeG.AEQbTJ(EZpvd());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ2 = abstractC59287zeG.AEQbTJ(this.AEQbTJ);
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ2, "");
        return new C59186zcL((AbstractC59242zdO) abstractC59233zdFAEQbTJ, (AbstractC59242zdO) abstractC59233zdFAEQbTJ2);
    }
}
