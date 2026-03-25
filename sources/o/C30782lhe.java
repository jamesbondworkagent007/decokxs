package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30782lhe extends C30787lhj {
    @yCM
    public C30782lhe() {
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lhj.buildOrderType$default(o.lhj, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy, int, java.lang.Object):o.lcd */
    public final C30457lbX KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, C30808liD c30808liD, @NotNull AdvancedTradeType advancedTradeType) {
        ServiceFeeInfo serviceFeeInfo;
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean fromToken2;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null) {
            return new C30457lbX(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        com.okinc.business.dexlogic.bean.ServiceFeeInfo serviceFeeInfoOLrzqt = null;
        java.lang.String chainId = (commonDexInfo == null || (fromToken2 = commonDexInfo.getFromToken()) == null) ? null : fromToken2.getChainId();
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String strOLrzqt = OLrzqt(v6BaseQuoteResponse, advancedTradeType);
        TransactionType transactionTypeEZpvd = AdvancedTradeType.Companion.EZpvd(advancedTradeType);
        java.lang.String strCopydefault = copydefault(v6BaseQuoteResponse, advancedTradeType);
        java.lang.String strEZpvd = EZpvd(v6BaseQuoteResponse, advancedTradeType);
        ServiceFeeInfo serviceFeeInfo2 = selectedDeFiPlatform.getServiceFeeInfo();
        java.lang.String originalServiceFeeRate = serviceFeeInfo2 != null ? serviceFeeInfo2.getOriginalServiceFeeRate() : null;
        java.lang.String str2 = originalServiceFeeRate == null ? "" : originalServiceFeeRate;
        ServiceFeeInfo serviceFeeInfo3 = selectedDeFiPlatform.getServiceFeeInfo();
        java.lang.String discountedServiceFeeRate = serviceFeeInfo3 != null ? serviceFeeInfo3.getDiscountedServiceFeeRate() : null;
        java.lang.String str3 = discountedServiceFeeRate == null ? "" : discountedServiceFeeRate;
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String tokenSymbol = (commonDexInfo2 == null || (fromToken = commonDexInfo2.getFromToken()) == null) ? null : fromToken.getTokenSymbol();
        java.lang.String str4 = tokenSymbol == null ? "" : tokenSymbol;
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount = commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null;
        java.lang.String str5 = fromTokenAmount == null ? "" : fromTokenAmount;
        C30516lcd[] c30516lcdArr = new C30516lcd[8];
        c30516lcdArr[0] = C30787lhj.buildOrderType$default(this, AdvancedOrderType.MARKET, null, 2, null);
        c30516lcdArr[1] = KWHzl(v6BaseQuoteResponse, advancedTradeType);
        c30516lcdArr[2] = copydefault(v6BaseQuoteResponse);
        c30516lcdArr[3] = OLrzqt(v6BaseQuoteResponse);
        DefiPlatformInfo selectedDeFiPlatform2 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        c30516lcdArr[4] = copydefault(selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getDiffPercent() : null);
        c30516lcdArr[5] = EZpvd(v6BaseQuoteResponse, c30808liD);
        c30516lcdArr[6] = KWHzl(v6BaseQuoteResponse);
        DefiPlatformInfo selectedDeFiPlatform3 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform3 != null && (serviceFeeInfo = selectedDeFiPlatform3.getServiceFeeInfo()) != null) {
            serviceFeeInfoOLrzqt = C28345kXz.OLrzqt(serviceFeeInfo);
        }
        c30516lcdArr[7] = OLrzqt(serviceFeeInfoOLrzqt);
        return new C30457lbX(str, strOLrzqt, strEZpvd, transactionTypeEZpvd, strCopydefault, yDY.gEmmrt(c30516lcdArr), null, null, str2, str3, str4, null, str5, 2240, null);
    }

    public final C30516lcd KWHzl(V6BaseQuoteResponse v6BaseQuoteResponse, AdvancedTradeType advancedTradeType) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.RSmiaq), C28343kXx.OLrzqt(v6BaseQuoteResponse, advancedTradeType == AdvancedTradeType.SELL), ConfirmOrderTag.MARKET_PRICE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd copydefault(V6BaseQuoteResponse v6BaseQuoteResponse) {
        java.lang.String fromTokenValue;
        DexMultiTokenInfoBean fromToken;
        java.lang.String tokenSymbol;
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String scientificCurrency$default = null;
        java.lang.String fmtSymbol$default = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null || (tokenSymbol = fromToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        C23271hvA c23271hvA = C23271hvA.copydefault;
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount = commonDexInfo2 != null ? commonDexInfo2.getFromTokenAmount() : null;
        if (fromTokenAmount == null) {
            fromTokenAmount = "";
        }
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, fromTokenAmount, false, roundingMode, false, false, 26, null);
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        if (commonDexInfo3 != null && (fromTokenValue = commonDexInfo3.getFromTokenValue()) != null) {
            scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, fromTokenValue, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.setActions), showData$default + " " + fmtSymbol$default + " (" + scientificCurrency$default + ")", ConfirmOrderTag.FROM_AMOUNT, null, null, false, null, null, 248, null);
    }

    public final C30516lcd OLrzqt(V6BaseQuoteResponse v6BaseQuoteResponse) {
        DexMultiTokenInfoBean toToken;
        java.lang.String tokenSymbol;
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String minimumReceived = selectedDeFiPlatform != null ? selectedDeFiPlatform.getMinimumReceived() : null;
        if (minimumReceived == null) {
            minimumReceived = "";
        }
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, minimumReceived, false, roundingMode, false, false, 18, null);
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fmtSymbol$default = (commonDexInfo == null || (toToken = commonDexInfo.getToToken()) == null || (tokenSymbol = toToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        DefiPlatformInfo selectedDeFiPlatform2 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String toTokenValue = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getToTokenValue() : null;
        DefiPlatformInfo selectedDeFiPlatform3 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C33129mqd.mulS$default(C33129mqd.divS$default(toTokenValue, selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.getReceiveAmount() : null, null, null, null, 14, null), minimumReceived, null, null, null, 14, null), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.invokeSuspendlambda1), showData$default + " " + fmtSymbol$default + " (" + scientificCurrency$default + ")", ConfirmOrderTag.MIN_RECEIVE, null, null, false, null, null, 248, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C30516lcd EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse, C30808liD c30808liD) {
        java.lang.String strValues;
        java.lang.String strAEQbTJ;
        java.lang.String nativeTokenSymbol;
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null && gYQ.copydefault(selectedDeFiPlatform)) {
            strValues = EZpvd(v6BaseQuoteResponse);
        } else {
            strValues = c30808liD != null ? c30808liD.values() : null;
        }
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String nativeTokenUnitPriceUsd = commonDexInfo != null ? commonDexInfo.getNativeTokenUnitPriceUsd() : null;
        java.lang.String str = nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd;
        if (strValues == null || strValues.length() == 0 || str.length() == 0) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        if (commonDexInfo2 == null || (nativeTokenSymbol = commonDexInfo2.getNativeTokenSymbol()) == null) {
            strAEQbTJ = c30808liD != null ? c30808liD.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
        } else {
            if (nativeTokenSymbol.length() <= 0) {
                nativeTokenSymbol = null;
            }
            if (nativeTokenSymbol != null) {
                strAEQbTJ = nativeTokenSymbol;
            }
        }
        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(strValues, str, null, null, null, 14, null);
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, strDivCheckS$default, false, roundingMode, false, false, 26, null);
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strValues, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow11), showData$default + " " + strAEQbTJ + " (" + scientificCurrency$default + ")", ConfirmOrderTag.NETWORK_FEE, null, null, gYQ.OLrzqt(v6BaseQuoteResponse), null, null, 216, null);
    }

    public final C30516lcd KWHzl(V6BaseQuoteResponse v6BaseQuoteResponse) {
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV);
        java.lang.String name = selectedDeFiPlatform != null ? selectedDeFiPlatform.getName() : null;
        if (name == null) {
            name = "";
        }
        return new C30516lcd(strAYXKKw, name, ConfirmOrderTag.ROUTER, null, selectedDeFiPlatform != null ? selectedDeFiPlatform.getLogo() : null, false, null, null, 232, null);
    }

    public final java.lang.String EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse) {
        java.lang.Object next;
        java.lang.String quoteNetWorkFeeOfMoney;
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        if (defiPlatformInfoList != null) {
            java.util.Iterator<T> it = defiPlatformInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) next;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) defiPlatformInfo.getQuoteNetWorkFeeOfMoney()) && C33129mqd.AEQbTJ(defiPlatformInfo.getQuoteNetWorkFeeOfMoney(), "0")) {
                    break;
                }
            }
            DefiPlatformInfo defiPlatformInfo2 = (DefiPlatformInfo) next;
            if (defiPlatformInfo2 != null && (quoteNetWorkFeeOfMoney = defiPlatformInfo2.getQuoteNetWorkFeeOfMoney()) != null) {
                return quoteNetWorkFeeOfMoney;
            }
        }
        return "";
    }
}
