package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yUw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56856yUw extends AbstractC59267zdn implements InterfaceC59239zdL {
    public final AbstractC59242zdO OLrzqt;

    @Override // o.AbstractC59267zdn, o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59267zdn
    public AbstractC59242zdO EZpvd() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC59261zdh
    public boolean KWHzl() {
        return true;
    }

    public C56856yUw(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        this.OLrzqt = abstractC59242zdO;
    }

    @Override // o.InterfaceC59261zdh
    public AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (!C59336zfC.valueOf((AbstractC59233zdF) abstractC59331zeyAkhnZx) && !C59322zep.valueOf(abstractC59331zeyAkhnZx)) {
            return abstractC59331zeyAkhnZx;
        }
        if (abstractC59331zeyAkhnZx instanceof AbstractC59242zdO) {
            return OLrzqt((AbstractC59242zdO) abstractC59331zeyAkhnZx);
        }
        if (!(abstractC59331zeyAkhnZx instanceof AbstractC59272zds)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zeyAkhnZx;
        return C59327zeu.OLrzqt(C59231zdD.copydefault(OLrzqt(abstractC59272zds.valueOf()), OLrzqt(abstractC59272zds.AYXKKw())), C59327zeu.OLrzqt(abstractC59331zeyAkhnZx));
    }

    public final AbstractC59242zdO OLrzqt(AbstractC59242zdO abstractC59242zdO) {
        AbstractC59242zdO abstractC59242zdOAEQbTJ = abstractC59242zdO.AEQbTJ(false);
        return !C59336zfC.valueOf((AbstractC59233zdF) abstractC59242zdO) ? abstractC59242zdOAEQbTJ : new C56856yUw(abstractC59242zdOAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/zeb;)Lo/zdO; */
    @Override // o.AbstractC59242zdO
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C56856yUw AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new C56856yUw(EZpvd().AEQbTJ(c59308zeb));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        return z ? EZpvd().AEQbTJ(true) : this;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C56856yUw KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C56856yUw(abstractC59242zdO);
    }
}
