package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59277zdx extends AbstractC59272zds implements InterfaceC59329zew {
    public final AbstractC59233zdF AEQbTJ;
    public final AbstractC59272zds KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59329zew
    public AbstractC59233zdF AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/zey; */
    @Override // o.InterfaceC59329zew
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public AbstractC59272zds fetchVPNInfo() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59277zdx(@NotNull AbstractC59272zds abstractC59272zds, @NotNull AbstractC59233zdF abstractC59233zdF) {
        super(abstractC59272zds.valueOf(), abstractC59272zds.AYXKKw());
        Intrinsics.checkNotNullParameter(abstractC59272zds, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        this.KWHzl = abstractC59272zds;
        this.AEQbTJ = abstractC59233zdF;
    }

    @Override // o.AbstractC59331zey
    public AbstractC59331zey AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return C59327zeu.OLrzqt(fetchVPNInfo().AEQbTJ(c59308zeb), AhwBna());
    }

    @Override // o.AbstractC59331zey
    public AbstractC59331zey AEQbTJ(boolean z) {
        return C59327zeu.OLrzqt(fetchVPNInfo().AEQbTJ(z), AhwBna().AkhnZx().AEQbTJ(z));
    }

    @Override // o.AbstractC59272zds
    public java.lang.String OLrzqt(@NotNull yXX yxx, @NotNull InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(yxx, "");
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        if (interfaceC56959yYr.AkhnZx()) {
            return yxx.KWHzl(AhwBna());
        }
        return fetchVPNInfo().OLrzqt(yxx, interfaceC56959yYr);
    }

    @Override // o.AbstractC59272zds
    public AbstractC59242zdO EZpvd() {
        return fetchVPNInfo().EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59277zdx KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = abstractC59287zeG.AEQbTJ(fetchVPNInfo());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ, "");
        return new C59277zdx((AbstractC59272zds) abstractC59233zdFAEQbTJ, abstractC59287zeG.AEQbTJ(AhwBna()));
    }

    @Override // o.AbstractC59272zds
    public java.lang.String toString() {
        return "[@EnhancedForWarnings(" + AhwBna() + ")] " + fetchVPNInfo();
    }
}
