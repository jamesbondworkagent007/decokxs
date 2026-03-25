package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.di.MarketDIModule;

/* JADX INFO: loaded from: classes9.dex */
public final class pXX implements InterfaceC58162ywA<OKComplianceRestrictionService> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKComplianceRestrictionService get() {
        return KWHzl();
    }

    public static OKComplianceRestrictionService KWHzl() {
        return (OKComplianceRestrictionService) C58165ywD.KWHzl(MarketDIModule.KWHzl.valueOf());
    }
}
