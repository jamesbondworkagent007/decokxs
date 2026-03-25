package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30766lhO {
    @yCM
    public C30766lhO() {
    }

    public final java.util.List<C30765lhN> OLrzqt(@NotNull java.util.List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DexMultiTokenInfoBean dexMultiTokenInfoBean : list) {
            java.lang.String chainId = dexMultiTokenInfoBean.getChainId();
            java.lang.String tokenLogoUrl = dexMultiTokenInfoBean.getTokenLogoUrl();
            java.lang.String chainLogoUrl = dexMultiTokenInfoBean.getChainLogoUrl();
            java.lang.String tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol();
            java.lang.String amountNum = dexMultiTokenInfoBean.getAmountNum();
            java.lang.String spotBalance = dexMultiTokenInfoBean.getSpotBalance();
            java.lang.String currencyAmount = dexMultiTokenInfoBean.getCurrencyAmount();
            java.lang.String avgBuyPrice = dexMultiTokenInfoBean.getAvgBuyPrice();
            arrayList.add(new C30765lhN(chainId, tokenLogoUrl, chainLogoUrl, tokenSymbol, amountNum, spotBalance, currencyAmount, avgBuyPrice == null ? "" : avgBuyPrice, dexMultiTokenInfoBean.getUnrealizedPnl(), dexMultiTokenInfoBean.getUnrealizedPnlPercent(), dexMultiTokenInfoBean.getNetPurchaseAmount(), dexMultiTokenInfoBean.getTokenContractAddress(), dexMultiTokenInfoBean.getPrice(), dexMultiTokenInfoBean.getLastTxPrice(), dexMultiTokenInfoBean.isMainChainCoin()));
        }
        return arrayList;
    }
}
