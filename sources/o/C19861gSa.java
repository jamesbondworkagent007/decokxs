package o;

import com.okinc.business.dex.trade.copytrading.di.CopyTradingRepoModule;

/* JADX INFO: renamed from: o.gSa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19861gSa implements InterfaceC58162ywA<InterfaceC19862gSb> {
    public final InterfaceC58164ywC<InterfaceC23234huQ> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC19862gSb get() {
        return AEQbTJ(this.OLrzqt.get());
    }

    public static InterfaceC19862gSb AEQbTJ(InterfaceC23234huQ interfaceC23234huQ) {
        return (InterfaceC19862gSb) C58165ywD.KWHzl(CopyTradingRepoModule.EZpvd.copydefault(interfaceC23234huQ));
    }
}
