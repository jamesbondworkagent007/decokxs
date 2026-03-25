package o;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;

/* JADX INFO: renamed from: o.kXz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28345kXz {
    public static final ServiceFeeInfo OLrzqt(com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo serviceFeeInfo) {
        if (serviceFeeInfo == null) {
            return null;
        }
        java.lang.String serviceFeeUsd = serviceFeeInfo.getServiceFeeUsd();
        java.lang.String str = serviceFeeUsd == null ? "" : serviceFeeUsd;
        java.lang.String originalServiceFeeRate = serviceFeeInfo.getOriginalServiceFeeRate();
        java.lang.String str2 = originalServiceFeeRate == null ? "" : originalServiceFeeRate;
        java.lang.String discountedServiceFeeRate = serviceFeeInfo.getDiscountedServiceFeeRate();
        java.lang.String str3 = discountedServiceFeeRate == null ? "" : discountedServiceFeeRate;
        java.lang.String strIsChargeVersion = serviceFeeInfo.isChargeVersion();
        java.lang.String str4 = strIsChargeVersion == null ? "" : strIsChargeVersion;
        java.lang.String strIsDisplayServiceFee = serviceFeeInfo.isDisplayServiceFee();
        java.lang.String str5 = strIsDisplayServiceFee == null ? "" : strIsDisplayServiceFee;
        java.lang.String feeTokenAddress = serviceFeeInfo.getFeeTokenAddress();
        java.lang.String str6 = feeTokenAddress == null ? "" : feeTokenAddress;
        java.lang.String faqUrl = serviceFeeInfo.getFaqUrl();
        java.lang.String str7 = faqUrl == null ? "" : faqUrl;
        java.lang.String refCode = serviceFeeInfo.getRefCode();
        java.lang.String str8 = refCode == null ? "" : refCode;
        java.lang.String referralCommissionRate = serviceFeeInfo.getReferralCommissionRate();
        java.lang.String str9 = referralCommissionRate == null ? "" : referralCommissionRate;
        java.lang.String referralCommissionAddress = serviceFeeInfo.getReferralCommissionAddress();
        return new ServiceFeeInfo(str, str2, "", str3, "", str4, str5, str6, "", str7, str8, str9, referralCommissionAddress == null ? "" : referralCommissionAddress, false, "", "", "");
    }
}
