package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59246zdS extends AbstractC59267zdn implements InterfaceC59329zew {
    public final AbstractC59233zdF EZpvd;
    public final AbstractC59242zdO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59329zew
    public AbstractC59233zdF AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59267zdn
    public AbstractC59242zdO EZpvd() {
        return this.copydefault;
    }

    public C59246zdS(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        this.copydefault = abstractC59242zdO;
        this.EZpvd = abstractC59233zdF;
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/zey; */
    @Override // o.InterfaceC59329zew
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO fetchVPNInfo() {
        return EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        AbstractC59331zey abstractC59331zeyOLrzqt = C59327zeu.OLrzqt(fetchVPNInfo().AEQbTJ(c59308zeb), AhwBna());
        Intrinsics.copydefault(abstractC59331zeyOLrzqt, "");
        return (AbstractC59242zdO) abstractC59331zeyOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        AbstractC59331zey abstractC59331zeyOLrzqt = C59327zeu.OLrzqt(fetchVPNInfo().AEQbTJ(z), AhwBna().AkhnZx().AEQbTJ(z));
        Intrinsics.copydefault(abstractC59331zeyOLrzqt, "");
        return (AbstractC59242zdO) abstractC59331zeyOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59246zdS KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C59246zdS(abstractC59242zdO, AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zeG;)Lo/zdO; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59267zdn, o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59246zdS KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = abstractC59287zeG.AEQbTJ(EZpvd());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ, "");
        return new C59246zdS((AbstractC59242zdO) abstractC59233zdFAEQbTJ, abstractC59287zeG.AEQbTJ(AhwBna()));
    }

    @Override // o.AbstractC59242zdO
    public java.lang.String toString() {
        return "[@EnhancedForWarnings(" + AhwBna() + ")] " + fetchVPNInfo();
    }
}
