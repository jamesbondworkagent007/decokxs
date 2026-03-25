package o;

import com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo;
import kotlin.jvm.internal.Intrinsics;
import o.kVO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVS implements kVO {
    public final ServiceFeeInfo EZpvd;

    public kVS(@NotNull ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        this.EZpvd = serviceFeeInfo;
    }

    @Override // o.kVO
    public boolean AhwBna() {
        return kVO.Activity.AEQbTJ(this);
    }

    @Override // o.kVO
    public boolean EZpvd() {
        return kVO.Activity.OLrzqt(this);
    }

    @Override // o.kVO
    public java.lang.String OLrzqt() {
        java.lang.String originalServiceFeeRate = this.EZpvd.getOriginalServiceFeeRate();
        return originalServiceFeeRate == null ? "" : originalServiceFeeRate;
    }

    @Override // o.kVO
    public java.lang.String KWHzl() {
        java.lang.String discountedServiceFeeRate = this.EZpvd.getDiscountedServiceFeeRate();
        return discountedServiceFeeRate == null ? "" : discountedServiceFeeRate;
    }

    @Override // o.kVO
    public java.lang.String copydefault() {
        java.lang.String faqUrl = this.EZpvd.getFaqUrl();
        return faqUrl == null ? "" : faqUrl;
    }

    @Override // o.kVO
    public java.lang.String AEQbTJ() {
        java.lang.String strIsChargeVersion = this.EZpvd.isChargeVersion();
        return strIsChargeVersion == null ? "" : strIsChargeVersion;
    }
}
