package o;

import com.okinc.kyc.api.biz.bean.BannerModelBean;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.navigation.riskBanner.RiskBannerUseCase$buildRequestModel$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45771swq {
    public static final C45771swq AEQbTJ = new C45771swq();

    private C45771swq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super C45762swh> continuation) throws java.lang.Throwable {
        RiskBannerUseCase$buildRequestModel$1 riskBannerUseCase$buildRequestModel$1;
        OKComplianceRestrictionService oKComplianceRestrictionService;
        OKComplianceRestrictionService oKComplianceRestrictionService2;
        FeatureRestrictionInfo featureRestrictionInfoEZpvd;
        java.lang.Long content;
        C45759swe c45759sweCopydefault;
        if (continuation instanceof RiskBannerUseCase$buildRequestModel$1) {
            riskBannerUseCase$buildRequestModel$1 = (RiskBannerUseCase$buildRequestModel$1) continuation;
            int i = riskBannerUseCase$buildRequestModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                riskBannerUseCase$buildRequestModel$1.label = i - Integer.MIN_VALUE;
            } else {
                riskBannerUseCase$buildRequestModel$1 = new RiskBannerUseCase$buildRequestModel$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = riskBannerUseCase$buildRequestModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = riskBannerUseCase$buildRequestModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
            if ((interfaceC33171mrS == null || !interfaceC33171mrS.fIwbmz()) && (oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class)) != null) {
                OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.RISK_BANNER;
                if (oKComplianceRestrictionService.OLrzqt(feature) && (oKComplianceRestrictionService2 = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class)) != null && (featureRestrictionInfoEZpvd = oKComplianceRestrictionService2.EZpvd(feature)) != null && (content = featureRestrictionInfoEZpvd.getContent()) != null) {
                    long jLongValue = content.longValue();
                    InterfaceC37981pHw interfaceC37981pHw = (InterfaceC37981pHw) C43251rlk.OLrzqt(InterfaceC37981pHw.class);
                    if (interfaceC37981pHw != null) {
                        riskBannerUseCase$buildRequestModel$1.Z$0 = z;
                        riskBannerUseCase$buildRequestModel$1.label = 1;
                        objOLrzqt = interfaceC37981pHw.OLrzqt(jLongValue, riskBannerUseCase$buildRequestModel$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = riskBannerUseCase$buildRequestModel$1.Z$0;
        C56391yDq.AEQbTJ(objOLrzqt);
        BannerModelBean bannerModelBean = (BannerModelBean) objOLrzqt;
        if (bannerModelBean != null && (c45759sweCopydefault = C45766swl.copydefault(bannerModelBean)) != null) {
            return new C45762swh(z, c45759sweCopydefault);
        }
        return null;
    }
}
