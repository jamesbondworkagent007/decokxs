package o;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.Permit2Data;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC30395laO;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.lhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30780lhc extends C30787lhj {
    @yCM
    public C30780lhc() {
    }

    public final C30457lbX copydefault(AdvancedQuoteResponse advancedQuoteResponse, @NotNull AdvancedTradeType advancedTradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        java.lang.String scientificCurrency$default;
        java.lang.String str6;
        java.lang.String strDivS$default;
        java.lang.String strMulS$default;
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (advancedQuoteResponse == null) {
            return new C30457lbX(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        if (OLrzqt(advancedQuoteResponse, advancedTradeType) || !z) {
            scientificCurrency$default = "";
        } else {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            if (str3.length() == 0) {
                strMulS$default = C30565ldZ.EZpvd(str4) ? C33129mqd.mulS$default(str2, str4, null, null, null, 14, null) : "";
            } else {
                strMulS$default = str3;
            }
            scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, strMulS$default, true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        }
        if (str2.length() == 0) {
            if (C30565ldZ.EZpvd(str4)) {
                str6 = scientificCurrency$default;
                strDivS$default = C33129mqd.divS$default(str3, str4, null, null, null, 14, null);
            } else {
                str6 = scientificCurrency$default;
                strDivS$default = "";
            }
            str7 = strDivS$default;
        } else {
            str6 = scientificCurrency$default;
        }
        java.lang.String scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str7, false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
        java.lang.String chainId = dexMultiTokenInfoBean.getChainId();
        java.lang.String chainBWLogoUrl = dexMultiTokenInfoBean.getChainBWLogoUrl();
        AdvancedTradeType.StateListAnimator stateListAnimator = AdvancedTradeType.Companion;
        TransactionType transactionTypeEZpvd = stateListAnimator.EZpvd(advancedTradeType);
        java.lang.String strEZpvd = EZpvd(advancedQuoteResponse, advancedTradeType);
        java.lang.String strAEQbTJ = AEQbTJ(advancedQuoteResponse, advancedTradeType);
        C30516lcd[] c30516lcdArr = new C30516lcd[9];
        c30516lcdArr[0] = AEQbTJ(AdvancedOrderType.LIMIT, str3.length() > 0 ? AdvancedLimitBy.MCap : AdvancedLimitBy.Price);
        c30516lcdArr[1] = copydefault(str7, str5, stateListAnimator.EZpvd(advancedTradeType).getType());
        c30516lcdArr[2] = KWHzl(scientificCurrency$default2, str6);
        c30516lcdArr[3] = AEQbTJ(advancedQuoteResponse);
        c30516lcdArr[4] = copydefault(advancedQuoteResponse);
        DeFiPlatformForSwap selectedDeFiPlatform = advancedQuoteResponse.getSelectedDeFiPlatform();
        c30516lcdArr[5] = copydefault(selectedDeFiPlatform != null ? selectedDeFiPlatform.getDiffPercent() : null);
        java.lang.String expirationTime = advancedQuoteResponse.getExpirationTime();
        c30516lcdArr[6] = AEQbTJ(expirationTime != null ? expirationTime : "");
        c30516lcdArr[7] = OLrzqt(str);
        DeFiPlatformForSwap selectedDeFiPlatform2 = advancedQuoteResponse.getSelectedDeFiPlatform();
        c30516lcdArr[8] = OLrzqt(selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getServiceFeeInfo() : null);
        return new C30457lbX(chainId, chainBWLogoUrl, strAEQbTJ, transactionTypeEZpvd, strEZpvd, yDY.gEmmrt(c30516lcdArr), null, null, null, null, null, null, null, 8128, null);
    }

    public final C30516lcd KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (str2.length() > 0) {
            str3 = " / " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(str2.length() > 0 ? C23274hvD.Fragment.onExtrasChanged : C23274hvD.Fragment.getName);
        ConfirmOrderTag confirmOrderTag = ConfirmOrderTag.TRIGGER_PRICE;
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new C30516lcd(strAYXKKw, string, confirmOrderTag, null, null, false, null, null, 248, null);
    }

    public final C30516lcd copydefault(java.lang.String str, java.lang.String str2, int i) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.setCurrentControllerInfo), C31206lpe.EZpvd.KWHzl(str, str2, i), ConfirmOrderTag.TRIGGER_PRICE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd AEQbTJ(AdvancedQuoteResponse advancedQuoteResponse) {
        java.lang.String fmtSymbol$default = C30565ldZ.getFmtSymbol$default(advancedQuoteResponse.getCommonDexInfo().getFromToken().getTokenSymbol(), 0, 1, null);
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String fromTokenAmount = advancedQuoteResponse.getCommonDexInfo().getFromTokenAmount();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, fromTokenAmount, false, roundingMode, false, false, 26, null);
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C33129mqd.mulS$default(advancedQuoteResponse.getCommonDexInfo().getFromTokenPrice(), advancedQuoteResponse.getCommonDexInfo().getFromTokenAmount(), null, null, null, 14, null), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.setActions), showData$default + " " + fmtSymbol$default + " (" + scientificCurrency$default + ")", ConfirmOrderTag.FROM_AMOUNT, null, null, false, null, null, 248, null);
    }

    public final C30516lcd copydefault(AdvancedQuoteResponse advancedQuoteResponse) {
        java.lang.String toTokenPrice;
        java.lang.String scientificCurrency$default = null;
        java.lang.String fmtSymbol$default = C30565ldZ.getFmtSymbol$default(advancedQuoteResponse.getCommonDexInfo().getToToken().getTokenSymbol(), 0, 1, null);
        DeFiPlatformForSwap selectedDeFiPlatform = advancedQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        if (receiveAmount == null) {
            receiveAmount = "";
        }
        java.lang.String str = receiveAmount;
        DeFiPlatformForSwap selectedDeFiPlatform2 = advancedQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform2 != null && (toTokenPrice = selectedDeFiPlatform2.getToTokenPrice()) != null) {
            scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, toTokenPrice, false, RoundingMode.DOWN, false, false, false, false, null, false, false, 509, null);
        }
        java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, str, false, RoundingMode.DOWN, false, false, 26, null);
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.getPosition), showData$default + " " + fmtSymbol$default + " (" + scientificCurrency$default + ")", ConfirmOrderTag.EST_RECEIVE, new InterfaceC30395laO.ActionBar(new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseMessageHandler), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatOnActiveChangeListener))), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final C30516lcd OLrzqt(java.lang.String str) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.getSubtitle), C23311hvo.formatPercent$default(str, false, 3, 0, null, null, 29, null), ConfirmOrderTag.SLIPPAGE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd AEQbTJ(java.lang.String str) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(C33129mqd.valueOf(str));
        timeUnit.toHours(C33129mqd.valueOf(str));
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatToken), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getToken, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Long.valueOf(days)))), ConfirmOrderTag.EXPIRES_AFTER, null, null, false, null, null, 248, null);
    }

    public final AdvancedQuoteResponse AEQbTJ(@NotNull TokenPairRateQuote tokenPairRateQuote, @NotNull java.lang.String str, @NotNull AdvancedTradeType advancedTradeType) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        MevInfoBean mevInfoBean;
        MevBasedFeeData nonMevFeeData;
        MevBasedFeeData mevFeeData;
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(tokenPairRateQuote, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        java.lang.String strEZpvd = EZpvd(tokenPairRateQuote, str, advancedTradeType);
        java.lang.String toTokenPrice = tokenPairRateQuote.getToTokenPrice();
        if (toTokenPrice == null) {
            toTokenPrice = "";
        }
        java.lang.String strAEQbTJ = AEQbTJ(strEZpvd, toTokenPrice);
        java.lang.String nativeSymbol = tokenPairRateQuote.getNativeSymbol();
        java.lang.String str2 = nativeSymbol == null ? "" : nativeSymbol;
        TokenPairRateOrderInfo orderInfo = tokenPairRateQuote.getOrderInfo();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = (orderInfo == null || (fromToken = orderInfo.getFromToken()) == null) ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : fromToken;
        TokenPairRateOrderInfo orderInfo2 = tokenPairRateQuote.getOrderInfo();
        if (orderInfo2 == null || (dexMultiTokenInfoBean = orderInfo2.getToToken()) == null) {
            dexMultiTokenInfoBean = new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        TokenPairRateOrderInfo orderInfo3 = tokenPairRateQuote.getOrderInfo();
        java.lang.String fromTokenAmount = orderInfo3 != null ? orderInfo3.getFromTokenAmount() : null;
        java.lang.String str3 = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String fromTokenPrice = tokenPairRateQuote.getFromTokenPrice();
        java.lang.String str4 = fromTokenPrice == null ? "" : fromTokenPrice;
        LimitFeeData feeData = tokenPairRateQuote.getFeeData();
        if (feeData == null || (mevFeeData = feeData.getMevFeeData()) == null || (mevInfoBean = mevFeeData.toMevInfoBean()) == null) {
            mevInfoBean = new MevInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1048575, (DefaultConstructorMarker) null);
        }
        java.util.List listEZpvd = C56402yEa.EZpvd(mevInfoBean);
        LimitFeeData feeData2 = tokenPairRateQuote.getFeeData();
        NonMevPriorityFeeInfo nonMevInfoBean = (feeData2 == null || (nonMevFeeData = feeData2.getNonMevFeeData()) == null) ? null : nonMevFeeData.toNonMevInfoBean();
        boolean enableJito = tokenPairRateQuote.getEnableJito();
        TokenPairRateOrderInfo orderInfo4 = tokenPairRateQuote.getOrderInfo();
        java.lang.String str5 = (orderInfo4 == null || !orderInfo4.isEnableMev()) ? "0" : "1";
        java.lang.String type = MevUnstableShowLevelType.NORMAL.getType();
        TokenPairRateOrderInfo orderInfo5 = tokenPairRateQuote.getOrderInfo();
        java.lang.String nativeTokenUnitPriceUsd = orderInfo5 != null ? orderInfo5.getNativeTokenUnitPriceUsd() : null;
        java.lang.String str6 = nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd;
        TokenPairRateOrderInfo orderInfo6 = tokenPairRateQuote.getOrderInfo();
        java.lang.String estReserveNativeAmt = orderInfo6 != null ? orderInfo6.getEstReserveNativeAmt() : null;
        java.lang.String str7 = estReserveNativeAmt == null ? "" : estReserveNativeAmt;
        TokenPairRateOrderInfo orderInfo7 = tokenPairRateQuote.getOrderInfo();
        java.lang.String code = orderInfo7 != null ? orderInfo7.getCode() : null;
        TokenPairRateOrderInfo orderInfo8 = tokenPairRateQuote.getOrderInfo();
        java.lang.String minSellAmount = orderInfo8 != null ? orderInfo8.getMinSellAmount() : null;
        AdvancedCommonDexInfo advancedCommonDexInfo = new AdvancedCommonDexInfo(str2, dexMultiTokenInfoBean2, str3, str4, "", "", "", dexMultiTokenInfoBean3, "", "", listEZpvd, nonMevInfoBean, enableJito, false, str5, type, str6, false, code, str7, (java.lang.String) null, (java.lang.String) null, minSellAmount == null ? "" : minSellAmount, 3145728, (DefaultConstructorMarker) null);
        java.lang.String estimateGasFee = tokenPairRateQuote.getEstimateGasFee();
        java.lang.String str8 = estimateGasFee == null ? "" : estimateGasFee;
        TokenPairRateOrderInfo orderInfo9 = tokenPairRateQuote.getOrderInfo();
        java.lang.String minimumReceived = orderInfo9 != null ? orderInfo9.getMinimumReceived() : null;
        java.lang.String str9 = minimumReceived == null ? "" : minimumReceived;
        DexAutoSlippageInfoParam slippageInfo = tokenPairRateQuote.getSlippageInfo();
        java.lang.Boolean valDiff = tokenPairRateQuote.getValDiff();
        return new AdvancedQuoteResponse(advancedCommonDexInfo, (TraceData) (0 == true ? 1 : 0), false, (java.lang.Integer) null, (java.lang.String) null, tokenPairRateQuote.getExpirationTime(), C56402yEa.EZpvd(new DeFiPlatformForSwap((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strEZpvd, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str9, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, strAEQbTJ, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, str8, (OfflineQuote) null, slippageInfo, (Permit2Data) null, tokenPairRateQuote.getServiceFeeInfo(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, valDiff != null ? valDiff.booleanValue() : false, (java.lang.String) null, KWHzl(tokenPairRateQuote, strAEQbTJ), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, -84576393, 15, (DefaultConstructorMarker) null)), (java.lang.String) null, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, (DefaultConstructorMarker) null);
    }

    public final java.lang.String EZpvd(TokenPairRateQuote tokenPairRateQuote, java.lang.String str, AdvancedTradeType advancedTradeType) {
        TokenPairRateOrderInfo orderInfo = tokenPairRateQuote.getOrderInfo();
        java.lang.String fromTokenAmount = orderInfo != null ? orderInfo.getFromTokenAmount() : null;
        java.lang.String str2 = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String toTokenPrice = tokenPairRateQuote.getToTokenPrice();
        if (toTokenPrice == null) {
            toTokenPrice = "";
        }
        java.lang.String fromTokenPrice = tokenPairRateQuote.getFromTokenPrice();
        if (fromTokenPrice == null) {
            fromTokenPrice = "";
        }
        return advancedTradeType == AdvancedTradeType.BUY ? (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) ? "" : C33129mqd.divS$default(C33129mqd.mulS$default(str2, fromTokenPrice, null, null, null, 14, null), str, null, null, null, 14, null) : (C33129mqd.OLrzqt((java.lang.CharSequence) toTokenPrice) && C33129mqd.OLrzqt((java.lang.Object) toTokenPrice, (java.lang.Object) 0)) ? "" : C33129mqd.divS$default(C33129mqd.mulS$default(str2, str, null, null, null, 14, null), toTokenPrice, null, null, null, 14, null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return C33129mqd.mulS$default(str, str2, null, null, null, 14, null);
    }

    public final java.lang.String KWHzl(TokenPairRateQuote tokenPairRateQuote, java.lang.String str) {
        TokenPairRateOrderInfo orderInfo = tokenPairRateQuote.getOrderInfo();
        java.lang.String strMulS$default = C33129mqd.mulS$default(orderInfo != null ? orderInfo.getFromTokenAmount() : null, tokenPairRateQuote.getFromTokenPrice(), null, null, null, 14, null);
        return (C33129mqd.OLrzqt((java.lang.CharSequence) strMulS$default) && C33129mqd.OLrzqt((java.lang.Object) strMulS$default, (java.lang.Object) 0)) ? "" : C33129mqd.divS$default(C33129mqd.subS$default(str, strMulS$default, null, null, null, 14, null), strMulS$default, null, null, null, 14, null);
    }

    public final boolean OLrzqt(AdvancedQuoteResponse advancedQuoteResponse, AdvancedTradeType advancedTradeType) {
        return advancedTradeType == AdvancedTradeType.BUY ? advancedQuoteResponse.getCommonDexInfo().getToToken().isMainChainCoin() : advancedQuoteResponse.getCommonDexInfo().getFromToken().isMainChainCoin();
    }
}
