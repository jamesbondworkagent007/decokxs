package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: loaded from: classes9.dex */
public final class pNU implements InterfaceC58162ywA<InterfaceC38110pMp> {
    public final InterfaceC58164ywC<OKComplianceRestrictionService> KWHzl;
    public final LinkModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC38110pMp get() {
        return AEQbTJ(this.copydefault, this.KWHzl.get());
    }

    public static InterfaceC38110pMp AEQbTJ(LinkModule linkModule, OKComplianceRestrictionService oKComplianceRestrictionService) {
        return (InterfaceC38110pMp) C58165ywD.KWHzl(linkModule.copydefault(oKComplianceRestrictionService));
    }
}
