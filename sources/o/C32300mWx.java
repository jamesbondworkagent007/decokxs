package o;

import com.okinc.dexkline.domain.model.market.detail.CoinRiskLevel;
import com.okinc.dexkline.market.common.constants.RiskControlLevel;
import com.okinc.dexkline.market.data.model.CoinRiskData;
import com.okinc.dexkline.market.data.model.RiskDetailData;
import com.okinc.dexkline.market.data.model.RiskLevelData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32300mWx {
    public static final C32299mWw KWHzl(@NotNull CoinRiskData coinRiskData) {
        Intrinsics.checkNotNullParameter(coinRiskData, "");
        return new C32299mWw(coinRiskData.KWHzl(), AEQbTJ(coinRiskData.copydefault()), coinRiskData.AEQbTJ(), coinRiskData.EZpvd(), coinRiskData.OLrzqt(), coinRiskData.AhwBna(), AEQbTJ(coinRiskData.valueOf()), RiskControlLevel.Companion.AEQbTJ(coinRiskData.AYXKKw()));
    }

    public static final java.util.List<C32250mVa> AEQbTJ(RiskLevelData riskLevelData) {
        if (riskLevelData != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (RiskDetailData riskDetailData : riskLevelData.getHighRiskList()) {
                arrayList.add(new C32250mVa(riskDetailData.getRiskName(), riskDetailData.getRiskDesc(), CoinRiskLevel.HIGH));
            }
            for (RiskDetailData riskDetailData2 : riskLevelData.getMiddleRiskList()) {
                arrayList.add(new C32250mVa(riskDetailData2.getRiskName(), riskDetailData2.getRiskDesc(), CoinRiskLevel.MEDIUM));
            }
            for (RiskDetailData riskDetailData3 : riskLevelData.getLowRiskList()) {
                arrayList.add(new C32250mVa(riskDetailData3.getRiskName(), riskDetailData3.getRiskDesc(), CoinRiskLevel.LOW));
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }
}
