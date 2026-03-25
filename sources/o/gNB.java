package o;

import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.tee.domain.model.SellRule;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.TpslConfig;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gNB {
    public static final TeeMarketPlaceOrderParams OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull PlaceOrderParams placeOrderParams, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, @NotNull TradeMode tradeMode) {
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean toToken;
        java.lang.String str6;
        TraceData traceData;
        StrategyType strategyType;
        java.lang.String teeSignMarketRelTs;
        java.lang.String quoteId;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(placeOrderParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        if (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null || (toToken = commonDexInfo.getToToken()) == null) {
            return null;
        }
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null || (quoteId = selectedDeFiPlatform.getQuoteId()) == null) {
            str6 = "";
            traceData = null;
        } else {
            str6 = "";
            traceData = new TraceData(quoteId, null, null);
        }
        boolean z = (list == null || list.isEmpty() || !Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) C33129mqd.gEmmrt(java.lang.Integer.valueOf(TransactionType.Buy.getType())))) ? false : true;
        TpslConfig tpslConfigKWHzl = z ? KWHzl(list, list2, placeOrderParams) : null;
        if (z) {
            strategyType = StrategyType.StrategySwapAndAutoSell;
        } else {
            strategyType = StrategyType.StrategySwap;
        }
        StrategyType strategyType2 = strategyType;
        java.lang.String maxSlippage = placeOrderParams.getMaxSlippage();
        java.lang.String priorityFeeType = placeOrderParams.getPriorityFeeType();
        java.lang.String priorityFee = placeOrderParams.getPriorityFee();
        java.lang.String routerModeType = placeOrderParams.getRouterModeType();
        java.lang.String gasPrice = placeOrderParams.getGasPrice();
        java.lang.Boolean enableJito = placeOrderParams.getEnableJito();
        java.lang.String gasUsed = placeOrderParams.getGasUsed();
        java.lang.String mevInfo = placeOrderParams.getMevInfo();
        java.lang.String chainId = fromToken.getChainId();
        java.lang.String chainName = fromToken.getChainName();
        java.lang.String tokenContractAddress = fromToken.getTokenContractAddress();
        java.lang.String tokenContractAddress2 = toToken.getTokenContractAddress();
        java.lang.String fromTokenAmount = commonDexInfo.getFromTokenAmount();
        java.lang.String str7 = fromTokenAmount == null ? str6 : fromTokenAmount;
        java.lang.String slippageType = placeOrderParams.getSlippageType();
        java.lang.String slippage = placeOrderParams.getSlippage();
        java.lang.String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        java.lang.String str8 = receiveAmount == null ? str6 : receiveAmount;
        if (z) {
            teeSignMarketRelTs = commonDexInfo.getTeeSignTpslRelTs();
        } else {
            teeSignMarketRelTs = commonDexInfo.getTeeSignMarketRelTs();
        }
        java.lang.String str9 = teeSignMarketRelTs;
        java.lang.String decimals = fromToken.getDecimals();
        java.lang.String decimals2 = toToken.getDecimals();
        java.lang.String minimumReceived = selectedDeFiPlatform != null ? selectedDeFiPlatform.getMinimumReceived() : null;
        java.lang.String str10 = minimumReceived == null ? str6 : minimumReceived;
        java.lang.String quoteId2 = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
        return new TeeMarketPlaceOrderParams(str, str2, strategyType2, maxSlippage, priorityFeeType, priorityFee, routerModeType, tpslConfigKWHzl, AbstractC22421hez.Companion.KWHzl(), gasPrice, enableJito, gasUsed, mevInfo, C28345kXz.OLrzqt(selectedDeFiPlatform != null ? selectedDeFiPlatform.getServiceFeeInfo() : null), tradeMode, traceData, str5, chainId, chainName, TabTitleInfo.KEY_MEME, tokenContractAddress, tokenContractAddress2, str7, slippageType, slippage, str3, str4, str8, (java.util.List) null, str9, decimals, decimals2, str10, quoteId2 == null ? str6 : quoteId2, placeOrderParams.getRefParam(), v6BaseQuoteResponse.isOKXPlatform(), v6BaseQuoteResponse.isAutoConfirmQuotaRemaining(), 268435456, 0, (DefaultConstructorMarker) null);
    }

    public static final TpslConfig KWHzl(java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, @NotNull PlaceOrderParams placeOrderParams) {
        Rules rules;
        Intrinsics.checkNotNullParameter(placeOrderParams, "");
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (AdvancedAutoSellStrategy advancedAutoSellStrategy : list) {
            if (advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.TakeProfit) {
                AdvancedAutoSellStrategy.TakeProfit takeProfit = (AdvancedAutoSellStrategy.TakeProfit) advancedAutoSellStrategy;
                rules = new Rules(1, takeProfit.AhwBna(), takeProfit.gEmmrt());
            } else {
                if (!(advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.StopLoss)) {
                    throw new NoWhenBranchMatchedException();
                }
                AdvancedAutoSellStrategy.StopLoss stopLoss = (AdvancedAutoSellStrategy.StopLoss) advancedAutoSellStrategy;
                rules = new Rules(2, C23313hvq.mulCheckS$default(stopLoss.AhwBna(), -1, null, null, null, 14, null), stopLoss.gEmmrt());
            }
            arrayList.add(rules);
        }
        java.lang.String strJoinToString$default = list2 != null ? CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
        return new TpslConfig(new SellRule((java.lang.String) null, arrayList, strJoinToString$default == null ? "" : strJoinToString$default, 1, (DefaultConstructorMarker) null), (Preset) null, placeOrderParams.getSellPresetForTPSL(), 2, (DefaultConstructorMarker) null);
    }
}
