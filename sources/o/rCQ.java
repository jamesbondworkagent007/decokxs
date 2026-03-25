package o;

import com.okinc.ok_kyc_core.impl.ComplianceCountryListServiceImpl;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;

/* JADX INFO: loaded from: classes10.dex */
public final class rCQ implements InterfaceC58162ywA<ComplianceCountryListService> {
    public final InterfaceC58164ywC<ComplianceCountryListServiceImpl> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ComplianceCountryListService get() {
        return EZpvd(this.AEQbTJ.get());
    }

    public static ComplianceCountryListService EZpvd(ComplianceCountryListServiceImpl complianceCountryListServiceImpl) {
        return (ComplianceCountryListService) C58165ywD.KWHzl(ComplianceCountryListServiceImpl.Module.EZpvd.copydefault(complianceCountryListServiceImpl));
    }
}
