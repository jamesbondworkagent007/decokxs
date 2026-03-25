package o;

import com.okinc.business.market.features.position.PositionModule;

/* JADX INFO: renamed from: o.knc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29118knc implements InterfaceC58162ywA<InterfaceC29133knr> {
    public final InterfaceC58164ywC<C29135knt> AEQbTJ;
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC27595jyE> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC29133knr get() {
        return OLrzqt(this.KWHzl.get(), this.EZpvd.get(), this.AEQbTJ.get());
    }

    public static InterfaceC29133knr OLrzqt(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, C29135knt c29135knt) {
        return (InterfaceC29133knr) C58165ywD.KWHzl(PositionModule.OLrzqt.EZpvd(interfaceC27595jyE, c27640jyx, c29135knt));
    }
}
