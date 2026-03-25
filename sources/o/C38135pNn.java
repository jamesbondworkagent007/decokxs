package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.lifecycle.impl.di.LifecycleOKCoreModule;

/* JADX INFO: renamed from: o.pNn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38135pNn implements InterfaceC58162ywA<AUI> {
    public final InterfaceC58164ywC<OKComplianceRestrictionService> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC33171mrS> AYXKKw;
    public final LifecycleOKCoreModule AhwBna;
    public final InterfaceC58164ywC<pMM> EZpvd;
    public final InterfaceC58164ywC<InterfaceC33253msv> KWHzl;
    public final InterfaceC58164ywC<pMA> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC38113pMs> copydefault;
    public final InterfaceC58164ywC<pKI> djBIcL;
    public final InterfaceC58164ywC<kOG> valueOf;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AUI get() {
        return AEQbTJ(this.AhwBna, this.copydefault.get(), this.OLrzqt.get(), this.AYXKKw.get(), this.AEQbTJ.get(), this.EZpvd.get(), this.KWHzl.get(), this.valueOf.get(), this.djBIcL.get());
    }

    public static AUI AEQbTJ(LifecycleOKCoreModule lifecycleOKCoreModule, InterfaceC38113pMs interfaceC38113pMs, pMA pma, InterfaceC33171mrS interfaceC33171mrS, OKComplianceRestrictionService oKComplianceRestrictionService, pMM pmm, InterfaceC33253msv interfaceC33253msv, kOG kog, pKI pki) {
        return (AUI) C58165ywD.KWHzl(lifecycleOKCoreModule.copydefault(interfaceC38113pMs, pma, interfaceC33171mrS, oKComplianceRestrictionService, pmm, interfaceC33253msv, kog, pki));
    }
}
