package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59267zdn extends AbstractC59242zdO {
    public abstract AbstractC59242zdO EZpvd();

    public abstract AbstractC59267zdn KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO);

    @Override // o.AbstractC59233zdF
    public InterfaceC59315zei djBIcL() {
        return EZpvd().djBIcL();
    }

    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return EZpvd().bY_();
    }

    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return EZpvd().AEQbTJ();
    }

    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return EZpvd().OLrzqt();
    }

    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return EZpvd().bX_();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: EZpvd */
    public AbstractC59242zdO KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = abstractC59287zeG.AEQbTJ(EZpvd());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ, "");
        return KWHzl((AbstractC59242zdO) abstractC59233zdFAEQbTJ);
    }
}
