package o;

import com.okinc.business.trade.di.EventTrackModule;

/* JADX INFO: renamed from: o.kPo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28118kPo implements InterfaceC58162ywA<C25448iws> {
    public final InterfaceC58164ywC<kYC> AEQbTJ;
    public final InterfaceC58164ywC<C6977aZZ> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C25448iws get() {
        return copydefault(this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static C25448iws copydefault(C6977aZZ c6977aZZ, kYC kyc) {
        return (C25448iws) C58165ywD.KWHzl(EventTrackModule.OLrzqt.AEQbTJ(c6977aZZ, kyc));
    }
}
