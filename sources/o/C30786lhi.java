package o;

import com.okinc.business.dex.tee.domain.model.LimitPreset;
import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.tee.domain.model.Rule;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30786lhi {
    public final kTW OLrzqt;

    /* JADX INFO: renamed from: o.lhi$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
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
    public C30786lhi(@NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(ktw, "");
        this.OLrzqt = ktw;
    }

    public final TeeLimitPlaceOrderParams OLrzqt(@NotNull TokenPairRateQuote tokenPairRateQuote, @NotNull C30808liD c30808liD, @NotNull AdvancedTradeType advancedTradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C28222kTk c28222kTk, java.util.List<java.lang.String> list, boolean z, boolean z2) {
        java.lang.String str3;
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken;
        java.lang.String strMulS$default;
        Intrinsics.checkNotNullParameter(tokenPairRateQuote, "");
        Intrinsics.checkNotNullParameter(c30808liD, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        java.lang.String strDivS$default = str;
        Intrinsics.checkNotNullParameter(strDivS$default, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c28222kTk, "");
        TokenPairRateOrderInfo orderInfo = tokenPairRateQuote.getOrderInfo();
        java.lang.String decimals = null;
        DexMultiTokenInfoBean fromToken2 = orderInfo != null ? orderInfo.getFromToken() : null;
        TokenPairRateOrderInfo orderInfo2 = tokenPairRateQuote.getOrderInfo();
        DexMultiTokenInfoBean toToken2 = orderInfo2 != null ? orderInfo2.getToToken() : null;
        SlippageMode slippageModeAYXKKw = c30808liD.AYXKKw();
        if (slippageModeAYXKKw == null) {
            slippageModeAYXKKw = SlippageMode.Dynamic;
        }
        SlippageMode slippageMode = slippageModeAYXKKw;
        if (KWHzl(tokenPairRateQuote, advancedTradeType) || !z) {
            str3 = "";
        } else {
            if (str2.length() == 0) {
                strMulS$default = C30565ldZ.EZpvd(c28222kTk.OLrzqt()) ? C33129mqd.mulS$default(str, c28222kTk.OLrzqt(), null, null, null, 14, null) : "";
            } else {
                strMulS$default = str2;
            }
            str3 = strMulS$default;
        }
        if (str.length() == 0) {
            strDivS$default = C30565ldZ.EZpvd(c28222kTk.OLrzqt()) ? C33129mqd.divS$default(str2, c28222kTk.OLrzqt(), null, null, null, 14, null) : "";
        }
        Preset preset = new Preset(C33129mqd.gEmmrt(java.lang.Integer.valueOf(slippageMode.getType())), C33129mqd.gEmmrt(java.lang.Integer.valueOf(slippageMode.getType())), copydefault(c30808liD), AEQbTJ(c30808liD, tokenPairRateQuote), c30808liD.AhwBna(), (java.lang.String) null, (java.lang.String) null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(c30808liD.copydefault())), c30808liD.valueOf(), list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) : null, 96, (DefaultConstructorMarker) null);
        int value = C31206lpe.EZpvd.copydefault(strDivS$default, c28222kTk.copydefault(), AdvancedTradeType.Companion.EZpvd(advancedTradeType).getType()).getValue();
        StrategyType strategyType = StrategyType.StrategyLimitOrderUBased;
        int value2 = TxDirection.Companion.AEQbTJ(advancedTradeType).getValue();
        int type = TradeMode.AdvancedMode.getType();
        java.lang.String chainId = toToken2 != null ? toToken2.getChainId() : null;
        java.lang.String str4 = chainId == null ? "" : chainId;
        java.lang.String tokenContractAddress = fromToken2 != null ? fromToken2.getTokenContractAddress() : null;
        java.lang.String str5 = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenPairRateOrderInfo orderInfo3 = tokenPairRateQuote.getOrderInfo();
        java.lang.String fromTokenAmount = orderInfo3 != null ? orderInfo3.getFromTokenAmount() : null;
        java.lang.String str6 = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String tokenContractAddress2 = toToken2 != null ? toToken2.getTokenContractAddress() : null;
        java.lang.String str7 = tokenContractAddress2 == null ? "" : tokenContractAddress2;
        TokenPairRateOrderInfo orderInfo4 = tokenPairRateQuote.getOrderInfo();
        java.lang.String toTokenAmount = orderInfo4 != null ? orderInfo4.getToTokenAmount() : null;
        java.lang.String str8 = toTokenAmount == null ? "" : toTokenAmount;
        java.lang.String tokenContractAddress3 = fromToken2 != null ? fromToken2.getTokenContractAddress() : null;
        java.lang.String str9 = tokenContractAddress3 == null ? "" : tokenContractAddress3;
        java.lang.String tokenContractAddress4 = toToken2 != null ? toToken2.getTokenContractAddress() : null;
        java.lang.String str10 = tokenContractAddress4 == null ? "" : tokenContractAddress4;
        TokenPairRateOrderInfo orderInfo5 = tokenPairRateQuote.getOrderInfo();
        java.lang.String fromTokenAmount2 = orderInfo5 != null ? orderInfo5.getFromTokenAmount() : null;
        Rule rule = new Rule(str9, str10, fromTokenAmount2 == null ? "" : fromTokenAmount2, (java.lang.String) null, (java.lang.String) null, strDivS$default, str3, 24, (DefaultConstructorMarker) null);
        Preset preset2 = advancedTradeType == AdvancedTradeType.BUY ? preset : null;
        if (advancedTradeType != AdvancedTradeType.SELL) {
            preset = null;
        }
        LimitPreset limitPreset = new LimitPreset((java.lang.String) null, preset2, preset, 1, (DefaultConstructorMarker) null);
        java.lang.String estimateGasFee = tokenPairRateQuote.getEstimateGasFee();
        java.lang.String expirationTime = tokenPairRateQuote.getExpirationTime();
        ServiceFeeInfo serviceFeeInfo = tokenPairRateQuote.getServiceFeeInfo();
        TokenPairRateOrderInfo orderInfo6 = tokenPairRateQuote.getOrderInfo();
        java.lang.String decimals2 = (orderInfo6 == null || (fromToken = orderInfo6.getFromToken()) == null) ? null : fromToken.getDecimals();
        java.lang.String str11 = decimals2 == null ? "" : decimals2;
        TokenPairRateOrderInfo orderInfo7 = tokenPairRateQuote.getOrderInfo();
        if (orderInfo7 != null && (toToken = orderInfo7.getToToken()) != null) {
            decimals = toToken.getDecimals();
        }
        return new TeeLimitPlaceOrderParams((java.lang.String) null, (java.lang.String) null, strategyType, str4, str5, str7, str6, str8, (java.lang.String) null, rule, limitPreset, (java.lang.String) null, type, java.lang.Integer.valueOf(value2), (java.lang.String) null, expirationTime, serviceFeeInfo, str11, decimals == null ? "" : decimals, estimateGasFee, (java.lang.String) null, false, C33129mqd.gEmmrt(java.lang.Integer.valueOf(value)), this.OLrzqt.KWHzl(z2, true, tokenPairRateQuote.isAutoConfirmQuotaRemaining()), 3164419, (DefaultConstructorMarker) null);
    }

    public final java.lang.String copydefault(C30808liD c30808liD) {
        SlippageMode slippageModeAYXKKw = c30808liD.AYXKKw();
        if (slippageModeAYXKKw == null) {
            slippageModeAYXKKw = SlippageMode.Dynamic;
        }
        int i = Application.copydefault[slippageModeAYXKKw.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String strAkhnZx = c30808liD.AkhnZx();
            if (strAkhnZx != null) {
                return strAkhnZx;
            }
        }
        return "";
    }

    public final java.lang.String AEQbTJ(C30808liD c30808liD, TokenPairRateQuote tokenPairRateQuote) {
        SlippageMode slippageModeAYXKKw = c30808liD.AYXKKw();
        if (slippageModeAYXKKw == null) {
            slippageModeAYXKKw = SlippageMode.Dynamic;
        }
        int i = Application.copydefault[slippageModeAYXKKw.ordinal()];
        if (i == 1) {
            java.lang.String strKWHzl = c30808liD.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                DexAutoSlippageInfoParam slippageInfo = tokenPairRateQuote.getSlippageInfo();
                java.lang.String referenceSlippage = slippageInfo != null ? slippageInfo.getReferenceSlippage() : null;
                if (referenceSlippage != null) {
                    return referenceSlippage;
                }
            } else {
                java.lang.String strKWHzl2 = c30808liD.KWHzl();
                if (strKWHzl2 != null) {
                    return strKWHzl2;
                }
            }
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "";
    }

    public final boolean KWHzl(TokenPairRateQuote tokenPairRateQuote, AdvancedTradeType advancedTradeType) {
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean toToken;
        if (advancedTradeType == AdvancedTradeType.BUY) {
            TokenPairRateOrderInfo orderInfo = tokenPairRateQuote.getOrderInfo();
            if (orderInfo != null && (toToken = orderInfo.getToToken()) != null && toToken.isMainChainCoin()) {
                return true;
            }
        } else {
            TokenPairRateOrderInfo orderInfo2 = tokenPairRateQuote.getOrderInfo();
            if (orderInfo2 != null && (fromToken = orderInfo2.getFromToken()) != null && fromToken.isMainChainCoin()) {
                return true;
            }
        }
        return false;
    }
}
