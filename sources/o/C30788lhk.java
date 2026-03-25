package o;

import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.tee.domain.model.SellRule;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.TpslConfig;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.DexPairInfo;
import com.okinc.business.dex.trade.core.domain.model.DexRouter;
import com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30788lhk {
    public final C19700gMb AEQbTJ;

    /* JADX INFO: renamed from: o.lhk$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SlippageMode.values().length];
            try {
                iArr[SlippageMode.Dynamic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SlippageMode.Fixed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C30788lhk(@NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.AEQbTJ = c19700gMb;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de A[PHI: r9
  0x01de: PHI (r9v25 java.lang.String) = (r9v3 java.lang.String), (r9v27 java.lang.String) binds: [B:98:0x01d9, B:91:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull C30808liD c30808liD, java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, @NotNull SlippageMode slippageMode, @NotNull java.lang.String str, @NotNull TxDirection txDirection, @NotNull java.lang.String str2) {
        StrategyType strategyType;
        java.util.List listAhwBna;
        java.lang.String str3;
        java.lang.String referenceSlippage;
        java.lang.String autoSlippage;
        java.lang.String str4;
        java.lang.String teeSignMarketRelTs;
        ServiceFeeInfo serviceFeeInfo;
        ServiceFeeInfo serviceFeeInfo2;
        java.util.List<DexRouter> dexRouterList;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(c30808liD, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txDirection, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        if (commonDexInfo == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("CommonDexInfo cannot be null")));
        }
        DexMultiTokenInfoBean fromToken = commonDexInfo.getFromToken();
        if (fromToken == null) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("FromToken cannot be null")));
        }
        DexMultiTokenInfoBean toToken = commonDexInfo.getToToken();
        if (toToken == null) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("ToToken cannot be null")));
        }
        java.lang.String chainId = fromToken.getChainId();
        java.lang.String strKWHzl = this.AEQbTJ.KWHzl(chainId);
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.AEQbTJ.KWHzl();
        java.lang.String referralCommissionAddress = null;
        java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        java.lang.String str5 = strDbNXlk == null ? "" : strDbNXlk;
        java.lang.String strIsConnected = this.AEQbTJ.isConnected();
        boolean z = !(list == null || list.isEmpty());
        if (z) {
            strategyType = StrategyType.StrategySwapAndAutoSell;
        } else {
            strategyType = StrategyType.StrategySwap;
        }
        StrategyType strategyType2 = strategyType;
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        AutoSlippageInfo autoSlippageInfo = selectedDeFiPlatform != null ? selectedDeFiPlatform.getAutoSlippageInfo() : null;
        if (selectedDeFiPlatform == null || (dexRouterList = selectedDeFiPlatform.getDexRouterList()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(dexRouterList, 10));
            for (DexRouter dexRouter : dexRouterList) {
                java.lang.String percent = dexRouter.getPercent();
                java.lang.String str6 = percent == null ? "" : percent;
                DexPairInfo dexPairInfo = dexRouter.getDexPairInfo();
                java.lang.String dexName = dexPairInfo != null ? dexPairInfo.getDexName() : null;
                arrayList.add(new DexRouterList(str6, dexName == null ? "" : dexName, (java.util.ArrayList) null, false, 0, 28, (DefaultConstructorMarker) null));
            }
            listAhwBna = arrayList;
        }
        Result.Application application4 = Result.Companion;
        java.lang.String strKWHzl2 = c30808liD.KWHzl();
        java.lang.String str7 = strKWHzl2 == null ? "" : strKWHzl2;
        int iCopydefault = c30808liD.copydefault();
        java.lang.String strValueOf = c30808liD.valueOf();
        java.lang.String strAhwBna = c30808liD.AhwBna();
        TpslConfig tpslConfigOLrzqt = OLrzqt(list, list2, c30808liD, slippageMode, autoSlippageInfo);
        boolean z2 = c30808liD.fARcdN() && c30808liD.fetchVPNInfo();
        java.lang.String estimateGasFee = selectedDeFiPlatform != null ? selectedDeFiPlatform.getEstimateGasFee() : null;
        if (estimateGasFee == null) {
            estimateGasFee = "";
        }
        com.okinc.business.dexlogic.bean.ServiceFeeInfo serviceFeeInfoOLrzqt = C28345kXz.OLrzqt(selectedDeFiPlatform != null ? selectedDeFiPlatform.getServiceFeeInfo() : null);
        TradeMode tradeMode = TradeMode.AdvancedMode;
        java.lang.String quoteId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
        java.lang.String strKWHzl3 = c30808liD.KWHzl();
        if (autoSlippageInfo != null) {
            str3 = "";
            referenceSlippage = autoSlippageInfo.getReferenceSlippage();
        } else {
            str3 = "";
            referenceSlippage = null;
        }
        TraceData traceData = new TraceData(quoteId, strKWHzl3, referenceSlippage);
        int value = txDirection.getValue();
        java.lang.String chainName = fromToken.getChainName();
        java.lang.String tokenContractAddress = fromToken.getTokenContractAddress();
        java.lang.String tokenContractAddress2 = toToken.getTokenContractAddress();
        java.lang.String fromTokenAmount = commonDexInfo.getFromTokenAmount();
        java.lang.String str8 = fromTokenAmount == null ? str3 : fromTokenAmount;
        int type = slippageMode.getType();
        int i = StateListAnimator.copydefault[slippageMode.ordinal()];
        if (i == 1) {
            autoSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoSlippage() : null;
            if (autoSlippage == null) {
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            autoSlippage = c30808liD.AkhnZx();
            str4 = autoSlippage == null ? str3 : autoSlippage;
        }
        java.lang.String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        java.lang.String str9 = receiveAmount == null ? str3 : receiveAmount;
        if (z) {
            teeSignMarketRelTs = commonDexInfo.getTeeSignTpslRelTs();
        } else {
            teeSignMarketRelTs = commonDexInfo.getTeeSignMarketRelTs();
        }
        java.lang.String str10 = teeSignMarketRelTs;
        java.lang.String decimals = fromToken.getDecimals();
        java.lang.String decimals2 = toToken.getDecimals();
        java.lang.String minimumReceived = selectedDeFiPlatform != null ? selectedDeFiPlatform.getMinimumReceived() : null;
        java.lang.String str11 = minimumReceived == null ? str3 : minimumReceived;
        java.lang.String quoteId2 = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
        java.lang.String str12 = quoteId2 == null ? str3 : quoteId2;
        java.lang.String strKWHzl4 = AbstractC22421hez.Companion.KWHzl();
        java.lang.String refCode = (selectedDeFiPlatform == null || (serviceFeeInfo2 = selectedDeFiPlatform.getServiceFeeInfo()) == null) ? null : serviceFeeInfo2.getRefCode();
        if (refCode == null) {
            refCode = str3;
        }
        if (selectedDeFiPlatform != null && (serviceFeeInfo = selectedDeFiPlatform.getServiceFeeInfo()) != null) {
            referralCommissionAddress = serviceFeeInfo.getReferralCommissionAddress();
        }
        return Result.m7377constructorimpl(new TeeMarketPlaceOrderParams(strIsConnected, strKWHzl, strategyType2, str7, java.lang.String.valueOf(iCopydefault), strValueOf, strAhwBna, tpslConfigOLrzqt, strKWHzl4, "", java.lang.Boolean.valueOf(z2), estimateGasFee, str2, serviceFeeInfoOLrzqt, tradeMode, traceData, java.lang.String.valueOf(value), chainId, chainName, "advanced", tokenContractAddress, tokenContractAddress2, str8, java.lang.String.valueOf(type), str4, str, str5, str9, listAhwBna, str10, decimals, decimals2, str11, str12, new ReferralParam(refCode, referralCommissionAddress == null ? str3 : referralCommissionAddress), v6BaseQuoteResponse.isOKXPlatform(), v6BaseQuoteResponse.isAutoConfirmQuotaRemaining()));
    }

    public final TpslConfig OLrzqt(java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, C30808liD c30808liD, SlippageMode slippageMode, AutoSlippageInfo autoSlippageInfo) {
        Rules rules;
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
        return new TpslConfig(new SellRule((java.lang.String) null, arrayList, strJoinToString$default == null ? "" : strJoinToString$default, 1, (DefaultConstructorMarker) null), (Preset) null, AEQbTJ(slippageMode, c30808liD, autoSlippageInfo), 2, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Preset AEQbTJ(SlippageMode slippageMode, C30808liD c30808liD, AutoSlippageInfo autoSlippageInfo) {
        java.lang.String referenceSlippage;
        int type = slippageMode.getType();
        int i = StateListAnimator.copydefault[slippageMode.ordinal()];
        if (i == 1) {
            java.lang.String strKWHzl = c30808liD.KWHzl();
            if (strKWHzl != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                referenceSlippage = c30808liD.KWHzl();
                if (referenceSlippage == null) {
                }
            } else {
                referenceSlippage = autoSlippageInfo != null ? autoSlippageInfo.getReferenceSlippage() : null;
                if (referenceSlippage == null) {
                }
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            referenceSlippage = c30808liD.AkhnZx();
            if (referenceSlippage == null) {
                referenceSlippage = "";
            }
        }
        return new Preset(java.lang.String.valueOf(type), (java.lang.String) null, referenceSlippage, (java.lang.String) null, c30808liD.AhwBna(), (java.lang.String) null, (java.lang.String) null, java.lang.String.valueOf(c30808liD.copydefault()), c30808liD.valueOf(), (java.lang.String) null, 618, (DefaultConstructorMarker) null);
    }
}
