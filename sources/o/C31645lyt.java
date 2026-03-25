package o;

import com.okinc.buysell.di.BuySellInteractorModule;

/* JADX INFO: renamed from: o.lyt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31645lyt implements InterfaceC58162ywA<C3738Arc> {
    public final InterfaceC58164ywC<InterfaceC3752Arq> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C3738Arc get() {
        return OLrzqt(this.AEQbTJ.get());
    }

    public static C3738Arc OLrzqt(InterfaceC3752Arq interfaceC3752Arq) {
        return (C3738Arc) C58165ywD.KWHzl(BuySellInteractorModule.EZpvd.copydefault(interfaceC3752Arq));
    }
}
