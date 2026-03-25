package o;

import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.Permit2Data;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.kXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28342kXw {
    public static final Permit2Data EZpvd(com.okinc.business.dex.trade.core.domain.model.Permit2Data permit2Data) {
        if (permit2Data == null) {
            return null;
        }
        java.lang.String unsignedTx = permit2Data.getUnsignedTx();
        if (unsignedTx == null) {
            unsignedTx = "";
        }
        return new Permit2Data(unsignedTx);
    }

    public static final DexAutoSlippageInfoParam AEQbTJ(AutoSlippageInfo autoSlippageInfo) {
        if (autoSlippageInfo == null) {
            return null;
        }
        java.lang.String autoSlippage = autoSlippageInfo.getAutoSlippage();
        java.lang.String str = autoSlippage == null ? "" : autoSlippage;
        java.lang.String autoFromSlippage = autoSlippageInfo.getAutoFromSlippage();
        java.lang.String str2 = autoFromSlippage == null ? "" : autoFromSlippage;
        java.util.List<java.lang.String> shortcutFixSlippage = autoSlippageInfo.getShortcutFixSlippage();
        java.lang.Boolean supportMaxSlippage = autoSlippageInfo.getSupportMaxSlippage();
        boolean zBooleanValue = supportMaxSlippage != null ? supportMaxSlippage.booleanValue() : false;
        java.lang.String dynamicSlippageRangeMin = autoSlippageInfo.getDynamicSlippageRangeMin();
        java.lang.String str3 = dynamicSlippageRangeMin == null ? "" : dynamicSlippageRangeMin;
        java.lang.String dynamicSlippageRangeMax = autoSlippageInfo.getDynamicSlippageRangeMax();
        java.lang.String str4 = dynamicSlippageRangeMax == null ? "" : dynamicSlippageRangeMax;
        java.lang.String recommendSlippageRangeMin = autoSlippageInfo.getRecommendSlippageRangeMin();
        java.lang.String str5 = recommendSlippageRangeMin == null ? "" : recommendSlippageRangeMin;
        java.lang.String recommendSlippageRangeMax = autoSlippageInfo.getRecommendSlippageRangeMax();
        java.lang.String str6 = recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
        java.lang.String referenceSlippage = autoSlippageInfo.getReferenceSlippage();
        java.lang.String str7 = referenceSlippage == null ? "" : referenceSlippage;
        java.lang.String limitOrderDynamicSpecialSlippage = autoSlippageInfo.getLimitOrderDynamicSpecialSlippage();
        return new DexAutoSlippageInfoParam(str, str2, "", "", shortcutFixSlippage, zBooleanValue, str3, str4, str5, str6, str7, limitOrderDynamicSpecialSlippage == null ? "" : limitOrderDynamicSpecialSlippage, 0, "");
    }

    public static final DeFiPlatformForSwap OLrzqt(DefiPlatformInfo defiPlatformInfo) {
        if (defiPlatformInfo == null) {
            return null;
        }
        java.lang.String defiPlatformId = defiPlatformInfo.getDefiPlatformId();
        java.lang.String name = defiPlatformInfo.getName();
        java.lang.String logo = defiPlatformInfo.getLogo();
        java.lang.String reducePercent = defiPlatformInfo.getReducePercent();
        java.lang.String warnPercent = defiPlatformInfo.getWarnPercent();
        java.lang.String minimumReceived = defiPlatformInfo.getMinimumReceived();
        java.lang.Integer offlineType = defiPlatformInfo.getOfflineType();
        int iIntValue = offlineType != null ? offlineType.intValue() : 0;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamAEQbTJ = AEQbTJ(defiPlatformInfo.getAutoSlippageInfo());
        return new DeFiPlatformForSwap(defiPlatformId, name, logo, defiPlatformInfo.getReceiveAmount(), (java.lang.String) null, reducePercent, warnPercent, minimumReceived, java.lang.Integer.valueOf(iIntValue), (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, yDY.AhwBna(), (java.lang.String) null, defiPlatformInfo.getQuoteNetWorkFeeOfMoney(), defiPlatformInfo.getEstimateGasFee(), defiPlatformInfo.getCalldata(), dexAutoSlippageInfoParamAEQbTJ, EZpvd(defiPlatformInfo.getPermit2Data()), C28345kXz.OLrzqt(defiPlatformInfo.getServiceFeeInfo()), defiPlatformInfo.getQuoteData(), (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, defiPlatformInfo.getShowValueDiffWarn(), defiPlatformInfo.getDiffValue(), defiPlatformInfo.getDiffPercent(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, -119527920, 15, (DefaultConstructorMarker) null);
    }
}
