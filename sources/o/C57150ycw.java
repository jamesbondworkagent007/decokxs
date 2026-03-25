package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57150ycw extends AbstractC43215rlA implements InterfaceC57001yaF {
    public final C57026yae AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final android.content.Context KWHzl;
    public final InterfaceC56387yDm copydefault;

    public C57150ycw(@NotNull android.content.Context context, @NotNull C57026yae c57026yae, @NotNull InterfaceC56387yDm<C57080ybf> interfaceC56387yDm, @NotNull InterfaceC56387yDm<C57138yck> interfaceC56387yDm2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c57026yae, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm2, "");
        this.KWHzl = context;
        this.AEQbTJ = c57026yae;
        this.EZpvd = interfaceC56387yDm;
        this.copydefault = interfaceC56387yDm2;
    }

    public final C57080ybf EZpvd() {
        return (C57080ybf) this.EZpvd.getValue();
    }

    @Override // o.InterfaceC57001yaF
    public boolean copydefault() {
        return this.AEQbTJ.copydefault(this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/yar; */
    @Override // o.InterfaceC57001yaF
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C57138yck OLrzqt() {
        return (C57138yck) this.copydefault.getValue();
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC56999yaD AEQbTJ() {
        return EZpvd();
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC57035yan copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        if (interfaceC57036yao instanceof C57091ybq) {
            return (InterfaceC57035yan) interfaceC57036yao;
        }
        C57089ybo c57089ybo = (C57089ybo) interfaceC57036yao;
        C57091ybq c57091ybq = new C57091ybq(this.KWHzl, c57089ybo.valueOf(), c57089ybo.gEmmrt());
        EZpvd().EZpvd(c57091ybq);
        return c57091ybq;
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC57031yaj AEQbTJ(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        if (interfaceC57036yao instanceof C57082ybh) {
            return (InterfaceC57031yaj) interfaceC57036yao;
        }
        C57089ybo c57089ybo = (C57089ybo) interfaceC57036yao;
        C57082ybh c57082ybh = new C57082ybh(this.KWHzl, c57089ybo.valueOf(), c57089ybo.gEmmrt());
        EZpvd().EZpvd(c57082ybh);
        return c57082ybh;
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC57034yam KWHzl(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        if (interfaceC57036yao instanceof C57092ybr) {
            return (InterfaceC57034yam) interfaceC57036yao;
        }
        C57089ybo c57089ybo = (C57089ybo) interfaceC57036yao;
        C57092ybr c57092ybr = new C57092ybr(this.KWHzl, c57089ybo.valueOf(), c57089ybo.gEmmrt());
        EZpvd().EZpvd(c57092ybr);
        return c57092ybr;
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC57038yaq OLrzqt(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        if (interfaceC57036yao instanceof C57087ybm) {
            return (InterfaceC57038yaq) interfaceC57036yao;
        }
        C57089ybo c57089ybo = (C57089ybo) interfaceC57036yao;
        C57087ybm c57087ybm = new C57087ybm(this.KWHzl, c57089ybo.valueOf(), c57089ybo.gEmmrt());
        EZpvd().EZpvd(c57087ybm);
        return c57087ybm;
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC57037yap EZpvd(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        if (interfaceC57036yao instanceof C57090ybp) {
            return (InterfaceC57037yap) interfaceC57036yao;
        }
        C57089ybo c57089ybo = (C57089ybo) interfaceC57036yao;
        C57090ybp c57090ybp = new C57090ybp(this.KWHzl, c57089ybo.valueOf(), c57089ybo.gEmmrt());
        EZpvd().EZpvd(c57090ybp);
        return c57090ybp;
    }

    @Override // o.InterfaceC57001yaF
    public InterfaceC57042yau valueOf(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        if (interfaceC57036yao instanceof C57094ybt) {
            return (InterfaceC57042yau) interfaceC57036yao;
        }
        C57089ybo c57089ybo = (C57089ybo) interfaceC57036yao;
        C57094ybt c57094ybt = new C57094ybt(this.KWHzl, c57089ybo.valueOf(), c57089ybo.gEmmrt());
        EZpvd().EZpvd(c57094ybt);
        return c57094ybt;
    }
}
