package o;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDQ {
    @yCM
    public iDQ() {
    }

    public final InvestmentAssetDetails copydefault(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull InvestedToken investedToken) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(investedToken, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<InvestUserRewardInfoByInvestment> listEjfBZ = investedToken.ejfBZ();
        if (listEjfBZ != null) {
            for (InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment : listEjfBZ) {
                if (investUserRewardInfoByInvestment.getChainId() == null) {
                    arrayList.add(investUserRewardInfoByInvestment.copy((1022 & 1) != 0 ? investUserRewardInfoByInvestment.baseDefiTokenInfos : null, (1022 & 2) != 0 ? investUserRewardInfoByInvestment.buttonType : null, (1022 & 4) != 0 ? investUserRewardInfoByInvestment.claimMode : null, (1022 & 8) != 0 ? investUserRewardInfoByInvestment.currencyAmount : null, (1022 & 16) != 0 ? investUserRewardInfoByInvestment.extraData : null, (1022 & 32) != 0 ? investUserRewardInfoByInvestment.rewardType : null, (1022 & 64) != 0 ? investUserRewardInfoByInvestment.callDataExtJson : null, (1022 & 128) != 0 ? investUserRewardInfoByInvestment.unclaimedTokenList : null, (1022 & 256) != 0 ? investUserRewardInfoByInvestment.network : null, (1022 & 512) != 0 ? investUserRewardInfoByInvestment.chainId : java.lang.Long.valueOf(protocolDetailsResponse.OLrzqt())));
                } else {
                    arrayList.add(investUserRewardInfoByInvestment);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!((InvestUserRewardInfoByInvestment) obj).KWHzl()) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((InvestUserRewardInfoByInvestment) obj2).KWHzl()) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj3 : arrayList3) {
            RewardType rewardType = ((InvestUserRewardInfoByInvestment) obj3).getRewardType();
            java.lang.Object arrayList4 = linkedHashMap.get(rewardType);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(rewardType, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj3);
        }
        return new InvestmentAssetDetails(investedToken.getNewProxyInstance(), investedToken.AEQbTJ(), arrayList2, linkedHashMap, investedToken.wlaJM(), investedToken.AuCTel(), null, investedToken.EZpvd(), 64, null);
    }
}
