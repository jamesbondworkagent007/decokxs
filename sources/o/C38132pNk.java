package o;

import com.okinc.lifecycle.impl.di.LifecycleModule;

/* JADX INFO: renamed from: o.pNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38132pNk implements InterfaceC58162ywA<pMX> {
    public final InterfaceC58164ywC<pMK> AEQbTJ;
    public final InterfaceC58164ywC<pKI> AYXKKw;
    public final InterfaceC58164ywC<kOG> AhwBna;
    public final InterfaceC58164ywC<InterfaceC33253msv> EZpvd;
    public final InterfaceC58164ywC<InterfaceC38113pMs> KWHzl;
    public final InterfaceC58164ywC<pMM> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC38110pMp> copydefault;
    public final InterfaceC58164ywC<pMA> gEmmrt;
    public final LifecycleModule valueOf;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public pMX get() {
        return KWHzl(this.valueOf, this.KWHzl.get(), this.gEmmrt.get(), this.copydefault.get(), this.OLrzqt.get(), this.EZpvd.get(), this.AEQbTJ.get(), this.AhwBna.get(), this.AYXKKw.get());
    }

    public static pMX KWHzl(LifecycleModule lifecycleModule, InterfaceC38113pMs interfaceC38113pMs, pMA pma, InterfaceC38110pMp interfaceC38110pMp, pMM pmm, InterfaceC33253msv interfaceC33253msv, pMK pmk, kOG kog, pKI pki) {
        return (pMX) C58165ywD.KWHzl(lifecycleModule.copydefault(interfaceC38113pMs, pma, interfaceC38110pMp, pmm, interfaceC33253msv, pmk, kog, pki));
    }
}
