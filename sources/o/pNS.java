package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: loaded from: classes9.dex */
public final class pNS implements InterfaceC58162ywA<InterfaceC38089pLv> {
    public final LinkModule EZpvd;
    public final InterfaceC58164ywC<OKComplianceRestrictionService> KWHzl;
    public final InterfaceC58164ywC<InterfaceC33171mrS> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC38089pLv get() {
        return EZpvd(this.EZpvd, this.copydefault.get(), this.KWHzl.get());
    }

    public static InterfaceC38089pLv EZpvd(LinkModule linkModule, InterfaceC33171mrS interfaceC33171mrS, OKComplianceRestrictionService oKComplianceRestrictionService) {
        return (InterfaceC38089pLv) C58165ywD.KWHzl(linkModule.AEQbTJ(interfaceC33171mrS, oKComplianceRestrictionService));
    }
}
