package o;

import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentItem;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDY {
    public static final ActionBar Companion = new ActionBar(null);
    public static final java.lang.String AEQbTJ = "borrow";
    public static final java.lang.String copydefault = "supply";

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iDY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String OLrzqt() {
            return iDY.copydefault;
        }
    }

    @yCM
    public iDY() {
    }

    public final MarketInvestmentAssetDetails EZpvd(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull MarketInvestTokenInfo marketInvestTokenInfo) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(marketInvestTokenInfo, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = marketInvestTokenInfo.KWHzl().entrySet().iterator();
        int value = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            for (InvestedToken investedToken : (java.util.List) entry.getValue()) {
                java.util.List<InvestUserRewardInfoByInvestment> listEjfBZ = investedToken.ejfBZ();
                if (listEjfBZ == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEjfBZ, 10));
                    for (InvestUserRewardInfoByInvestment investUserRewardInfoByInvestmentCopy : listEjfBZ) {
                        if (investUserRewardInfoByInvestmentCopy.getChainId() == null) {
                            investUserRewardInfoByInvestmentCopy = investUserRewardInfoByInvestmentCopy.copy((1022 & 1) != 0 ? investUserRewardInfoByInvestmentCopy.baseDefiTokenInfos : null, (1022 & 2) != 0 ? investUserRewardInfoByInvestmentCopy.buttonType : null, (1022 & 4) != 0 ? investUserRewardInfoByInvestmentCopy.claimMode : null, (1022 & 8) != 0 ? investUserRewardInfoByInvestmentCopy.currencyAmount : null, (1022 & 16) != 0 ? investUserRewardInfoByInvestmentCopy.extraData : null, (1022 & 32) != 0 ? investUserRewardInfoByInvestmentCopy.rewardType : null, (1022 & 64) != 0 ? investUserRewardInfoByInvestmentCopy.callDataExtJson : null, (1022 & 128) != 0 ? investUserRewardInfoByInvestmentCopy.unclaimedTokenList : null, (1022 & 256) != 0 ? investUserRewardInfoByInvestmentCopy.network : null, (1022 & 512) != 0 ? investUserRewardInfoByInvestmentCopy.chainId : java.lang.Long.valueOf(protocolDetailsResponse.OLrzqt()));
                        }
                        arrayList3.add(investUserRewardInfoByInvestmentCopy);
                    }
                    listAhwBna = arrayList3;
                }
                if (value == 0 && investedToken.AkhnZx() != InvestmentKind.Default) {
                    value = investedToken.AkhnZx().getValue();
                }
                long jIsConnected = investedToken.isConnected();
                java.lang.String strHDKMBd = investedToken.hDKMBd();
                long jKWHzl = investedToken.KWHzl();
                long jFIwbmz = investedToken.fIwbmz();
                InvestmentKind investmentKindAkhnZx = investedToken.AkhnZx();
                ProductType productTypeFJNWhG = investedToken.fJNWhG();
                InvestLogo investLogoDjBIcL = investedToken.djBIcL();
                NetworkLogoUrl networkLogoUrlFetchVPNInfo = investedToken.fetchVPNInfo();
                java.lang.String strDbNXlk = investedToken.DbNXlk();
                java.lang.String strGEmmrt = investedToken.gEmmrt();
                java.lang.String fieldNames = investedToken.getFieldNames();
                java.lang.String strIwGUEr = investedToken.iwGUEr();
                boolean zAuCTelauCTel = investedToken.AuCTelauCTel();
                InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformationCopydefault = investedToken.copydefault();
                java.util.List<InvestPositionDetailExtraFieldData> listAYXKKw = investedToken.AYXKKw();
                Perpetual perpetualFARcdN = investedToken.fARcdN();
                java.util.List<InvestExtraAssetData> listEZpvd = investedToken.EZpvd();
                java.util.List<InvestBaseDefiTokenInfo> newProxyInstance = investedToken.getNewProxyInstance();
                if (newProxyInstance == null) {
                    newProxyInstance = yDY.AhwBna();
                }
                arrayList.add(new MarketInvestmentItem(str, jIsConnected, strHDKMBd, jKWHzl, jFIwbmz, investmentKindAkhnZx, productTypeFJNWhG, investLogoDjBIcL, networkLogoUrlFetchVPNInfo, strDbNXlk, strGEmmrt, fieldNames, strIwGUEr, zAuCTelauCTel, investUserAssetDetailPromptInformationCopydefault, listAYXKKw, perpetualFARcdN, listEZpvd, newProxyInstance, listAhwBna));
            }
        }
        for (InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment : marketInvestTokenInfo.gEmmrt()) {
            if (investUserRewardInfoByInvestment.getChainId() == null) {
                arrayList2.add(investUserRewardInfoByInvestment.copy((1022 & 1) != 0 ? investUserRewardInfoByInvestment.baseDefiTokenInfos : null, (1022 & 2) != 0 ? investUserRewardInfoByInvestment.buttonType : null, (1022 & 4) != 0 ? investUserRewardInfoByInvestment.claimMode : null, (1022 & 8) != 0 ? investUserRewardInfoByInvestment.currencyAmount : null, (1022 & 16) != 0 ? investUserRewardInfoByInvestment.extraData : null, (1022 & 32) != 0 ? investUserRewardInfoByInvestment.rewardType : null, (1022 & 64) != 0 ? investUserRewardInfoByInvestment.callDataExtJson : null, (1022 & 128) != 0 ? investUserRewardInfoByInvestment.unclaimedTokenList : null, (1022 & 256) != 0 ? investUserRewardInfoByInvestment.network : null, (1022 & 512) != 0 ? investUserRewardInfoByInvestment.chainId : java.lang.Long.valueOf(protocolDetailsResponse.OLrzqt())));
            } else {
                arrayList2.add(investUserRewardInfoByInvestment);
            }
        }
        return new MarketInvestmentAssetDetails(arrayList, value, arrayList2);
    }
}
