package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_okx_impl.foebidden.util.Module;

/* JADX INFO: renamed from: o.rVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42507rVk implements InterfaceC58162ywA<OKComplianceRestrictionService> {
    public final InterfaceC58164ywC<rUH> AEQbTJ;
    public final Module EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OKComplianceRestrictionService get() {
        return EZpvd(this.EZpvd, this.AEQbTJ.get());
    }

    public static OKComplianceRestrictionService EZpvd(Module module, rUH ruh) {
        return (OKComplianceRestrictionService) C58165ywD.KWHzl(module.AEQbTJ(ruh));
    }
}
