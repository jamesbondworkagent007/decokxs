package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsParams;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23653iEi {
    public final android.content.Context AEQbTJ;
    public final C23580iBq EZpvd;

    /* JADX INFO: renamed from: o.iEi$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RewardType.values().length];
            try {
                iArr[RewardType.MERKL_BONUS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RewardType.OKX_BONUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public C23653iEi(@NotNull android.content.Context context, @NotNull C23580iBq c23580iBq) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        this.AEQbTJ = context;
        this.EZpvd = c23580iBq;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C23653iEi(@NotNull android.content.Context context) {
        this(context, C23580iBq.AEQbTJ);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final java.util.List<C27296jsX> AEQbTJ(@NotNull AssetDetailsParams assetDetailsParams, @NotNull AssetBottomSheetData.BonusBottomSheetData bonusBottomSheetData) {
        java.util.List listAhwBna;
        java.lang.String strAYXKKw;
        ButtonType buttonType;
        ButtonAction buttonAction;
        ProductDetailsByChain productDetailsByChainAEQbTJ;
        AssetRawData assetRawData;
        ButtonType buttonType2;
        ProductDetailsByChain productDetailsByChainAEQbTJ2;
        Intrinsics.checkNotNullParameter(assetDetailsParams, "");
        Intrinsics.checkNotNullParameter(bonusBottomSheetData, "");
        java.util.List<InvestUserRewardInfoByInvestment> listEZpvd = bonusBottomSheetData.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment : listEZpvd) {
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            AssetRawData assetRawData2 = null;
            if (baseDefiTokenInfos == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(baseDefiTokenInfos, 10));
                for (InvestUserRewardElementInfo investUserRewardElementInfo : baseDefiTokenInfos) {
                    ButtonAction buttonAction2 = ButtonAction.CLAIM;
                    AssetRawData assetRawDataCopydefault = assetDetailsParams.copydefault();
                    if (((assetRawDataCopydefault == null || (productDetailsByChainAEQbTJ2 = assetRawDataCopydefault.AEQbTJ()) == null) ? null : java.lang.Long.valueOf(productDetailsByChainAEQbTJ2.OLrzqt())) == null || investUserRewardInfoByInvestment.getChainId() == null || investUserRewardInfoByInvestment.getNetwork() == null) {
                        assetRawData = null;
                    } else {
                        InvestAction investActionCopydefault = assetDetailsParams.copydefault().copydefault();
                        if (investActionCopydefault == null) {
                            investActionCopydefault = InvestAction.Bonus;
                        }
                        InvestAction investAction = investActionCopydefault;
                        java.util.List listEZpvd2 = C56402yEa.EZpvd(investUserRewardElementInfo);
                        InvestUserRewardsAction claimMode = investUserRewardInfoByInvestment.getClaimMode();
                        long jOLrzqt = assetDetailsParams.copydefault().AEQbTJ().OLrzqt();
                        java.lang.Long chainId = investUserRewardInfoByInvestment.getChainId();
                        long jLongValue = chainId != null ? chainId.longValue() : 0L;
                        java.lang.String network = investUserRewardInfoByInvestment.getNetwork();
                        assetRawData = new AssetRawData(investAction, claimMode, "", listEZpvd2, new ProductDetailsByChain(jOLrzqt, assetDetailsParams.copydefault().AEQbTJ().KWHzl(), new ChainInfo(jLongValue, network == null ? "" : network, null, null, null, 28, null), false, null, null, null, false, 248, null), null, null, false, null, null, false, 2016, null);
                    }
                    java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
                    java.lang.String str = tokenSymbol == null ? "" : tokenSymbol;
                    java.lang.String tokenLogo = investUserRewardElementInfo.getTokenLogo();
                    if (tokenLogo == null) {
                        tokenLogo = "";
                    }
                    java.util.List listEZpvd3 = C56402yEa.EZpvd(tokenLogo);
                    java.lang.String coinAmount = investUserRewardElementInfo.getCoinAmount();
                    java.lang.String str2 = coinAmount == null ? "--" : coinAmount;
                    java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
                    java.lang.String str3 = currencyAmount == null ? "--" : currencyAmount;
                    if (C24193iYi.OLrzqt.AEQbTJ() || !OLrzqt()) {
                        buttonType2 = ButtonType.CLAIM_TYPE_NO_NEED_SHOW;
                    } else {
                        buttonType2 = investUserRewardElementInfo.getButtonType();
                    }
                    listAhwBna.add(new C27294jsV(listEZpvd3, str, str2, str3, false, buttonType2, buttonAction2, assetRawData, investUserRewardInfoByInvestment.getChainId(), investUserRewardElementInfo.getTokenAddress()));
                }
            }
            java.util.List list = listAhwBna;
            AssetRawData assetRawDataCopydefault2 = assetDetailsParams.copydefault();
            if (((assetRawDataCopydefault2 == null || (productDetailsByChainAEQbTJ = assetRawDataCopydefault2.AEQbTJ()) == null) ? null : java.lang.Long.valueOf(productDetailsByChainAEQbTJ.OLrzqt())) != null && investUserRewardInfoByInvestment.getChainId() != null && investUserRewardInfoByInvestment.getNetwork() != null) {
                InvestAction investActionCopydefault2 = assetDetailsParams.copydefault().copydefault();
                if (investActionCopydefault2 == null) {
                    investActionCopydefault2 = InvestAction.Claim;
                }
                InvestAction investAction2 = investActionCopydefault2;
                java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos2 = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
                if (baseDefiTokenInfos2 == null) {
                    baseDefiTokenInfos2 = yDY.AhwBna();
                }
                java.util.List<InvestUserRewardElementInfo> list2 = baseDefiTokenInfos2;
                InvestUserRewardsAction claimMode2 = investUserRewardInfoByInvestment.getClaimMode();
                java.lang.String callDataExtJson = investUserRewardInfoByInvestment.getCallDataExtJson();
                java.lang.Long chainId2 = investUserRewardInfoByInvestment.getChainId();
                long jLongValue2 = chainId2 != null ? chainId2.longValue() : 0L;
                java.lang.String network2 = investUserRewardInfoByInvestment.getNetwork();
                assetRawData2 = new AssetRawData(investAction2, claimMode2, callDataExtJson, list2, new ProductDetailsByChain(assetDetailsParams.copydefault().AEQbTJ().OLrzqt(), assetDetailsParams.copydefault().AEQbTJ().KWHzl(), new ChainInfo(jLongValue2, network2 == null ? "" : network2, null, null, null, 28, null), false, null, null, null, false, 248, null), null, null, false, null, null, false, 2016, null);
            }
            AssetRawData assetRawData3 = assetRawData2;
            java.lang.String network3 = investUserRewardInfoByInvestment.getNetwork();
            int i = ActionBar.EZpvd[investUserRewardInfoByInvestment.getRewardType().ordinal()];
            if (i == 1) {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.iwGUEr);
            } else if (i == 2) {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.hDKMBd);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.QIZEnU);
            }
            java.lang.String str4 = strAYXKKw;
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos3 = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            if (C24193iYi.OLrzqt.AEQbTJ() || !OLrzqt()) {
                buttonType = ButtonType.CLAIM_TYPE_NO_NEED_SHOW;
            } else {
                buttonType = investUserRewardInfoByInvestment.getButtonType();
            }
            ButtonType buttonType3 = buttonType;
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos4 = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            if (baseDefiTokenInfos4 != null && baseDefiTokenInfos4.size() > 1) {
                buttonAction = ButtonAction.CLAIM_ALL;
            } else {
                buttonAction = ButtonAction.CLAIM;
            }
            arrayList.add(new C27296jsX(str4, network3, list, baseDefiTokenInfos3, buttonType3, buttonAction, bonusBottomSheetData.EZpvd().size() <= 1, true, false, false, assetRawData3, false, false, 6912, null));
        }
        return arrayList;
    }

    public final boolean OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.EZpvd.OLrzqt();
        return (interfaceC9738bbJOLrzqt == null || interfaceC9738bbJOLrzqt.zsXlph() || interfaceC9738bbJOLrzqt.QfsBiF()) ? false : true;
    }
}
