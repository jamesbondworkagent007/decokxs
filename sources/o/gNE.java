package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC30395laO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gNE {
    @yCM
    public gNE() {
    }

    public final C30457lbX AEQbTJ(@NotNull LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        Intrinsics.checkNotNullParameter(limitPairRateResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        LimitOrderInfo limitOrderInfo = limitPairRateResponse.getLimitOrderInfo();
        java.lang.String fmtSymbol$default = null;
        DexMultiTokenInfoBean fromToken = limitOrderInfo != null ? limitOrderInfo.getFromToken() : null;
        LimitOrderInfo limitOrderInfo2 = limitPairRateResponse.getLimitOrderInfo();
        DexMultiTokenInfoBean toToken = limitOrderInfo2 != null ? limitOrderInfo2.getToToken() : null;
        java.lang.String chainId = fromToken != null ? fromToken.getChainId() : null;
        java.lang.String str6 = chainId == null ? "" : chainId;
        java.lang.String fmtSymbol$default2 = (fromToken == null || (tokenSymbol2 = fromToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol2, 0, 1, null);
        if (toToken != null && (tokenSymbol = toToken.getTokenSymbol()) != null) {
            fmtSymbol$default = C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        }
        return new C30457lbX(str6, null, null, null, fmtSymbol$default2 + "/" + fmtSymbol$default, yDY.gEmmrt(OLrzqt(), AEQbTJ(limitPairRateResponse, str5), OLrzqt(str3, str4, limitPairRateResponse), AEQbTJ(limitPairRateResponse, limitCalResult), copydefault(limitPairRateResponse, limitCalResult), copydefault(limitCalResult), AEQbTJ(str2), EZpvd(str), OLrzqt(limitPairRateResponse)), TradeMode.SwapLimit, null, null, null, null, null, null, 8078, null);
    }

    public final C30516lcd OLrzqt() {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.zLAIeZ), C33070mpX.AYXKKw(C23274hvD.Fragment.setActiveQueueItemId), ConfirmOrderTag.ORDER_TYPE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd AEQbTJ(LimitPairRateResponse limitPairRateResponse, java.lang.String str) {
        java.lang.String strMulCheckS$default;
        DexMultiTokenInfoBean toToken;
        java.lang.String tokenSymbol;
        DexMultiTokenInfoBean fromToken;
        java.lang.String tokenSymbol2;
        DexMultiTokenInfoBean toToken2;
        LimitOrderInfo limitOrderInfo = limitPairRateResponse.getLimitOrderInfo();
        java.lang.String decimals = (limitOrderInfo == null || (toToken2 = limitOrderInfo.getToToken()) == null) ? null : toToken2.getDecimals();
        LimitOrderInfo limitOrderInfo2 = limitPairRateResponse.getLimitOrderInfo();
        java.lang.String fmtSymbol$default = (limitOrderInfo2 == null || (fromToken = limitOrderInfo2.getFromToken()) == null || (tokenSymbol2 = fromToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol2, 0, 1, null);
        LimitOrderInfo limitOrderInfo3 = limitPairRateResponse.getLimitOrderInfo();
        java.lang.String fmtSymbol$default2 = (limitOrderInfo3 == null || (toToken = limitOrderInfo3.getToToken()) == null || (tokenSymbol = toToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        java.lang.String receiveAmount = limitPairRateResponse.getReceiveAmount();
        if (receiveAmount != null && (strMulCheckS$default = C23313hvq.mulCheckS$default(receiveAmount, C23313hvq.addCheckS$default(1, str, null, null, null, 14, null), null, null, null, 14, null)) != null) {
            LimitOrderInfo limitOrderInfo4 = limitPairRateResponse.getLimitOrderInfo();
            strDivCheckS$default = C23313hvq.divCheckS$default(strMulCheckS$default, limitOrderInfo4 != null ? limitOrderInfo4.getFromTokenAmount() : null, java.lang.Integer.valueOf(C33129mqd.AhwBna(decimals)), null, null, 12, null);
        }
        if (strDivCheckS$default == null || strDivCheckS$default.length() == 0) {
            strDivCheckS$default = "--";
        }
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.dGgpab), "1 " + fmtSymbol$default + " ≈ " + C23271hvA.getShowData$default(C23271hvA.copydefault, strDivCheckS$default, false, RoundingMode.DOWN, false, false, 18, null) + " " + fmtSymbol$default2, ConfirmOrderTag.MARKET_PRICE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd OLrzqt(java.lang.String str, java.lang.String str2, LimitPairRateResponse limitPairRateResponse) {
        java.lang.String strMulCheckS$default;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String showDataWithSymbol$default = C23271hvA.getShowDataWithSymbol$default(c23271hvA, str, str2, false, roundingMode, false, false, 52, null);
        java.lang.String fromTokenPrice = limitPairRateResponse.getFromTokenPrice();
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.setBufferedPosition), showDataWithSymbol$default + " (" + ((fromTokenPrice == null || (strMulCheckS$default = C23313hvq.mulCheckS$default(fromTokenPrice, str, null, null, null, 14, null)) == null) ? null : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strMulCheckS$default, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null)) + ")", ConfirmOrderTag.FROM_AMOUNT, null, null, false, null, null, 248, null);
    }

    public final C30516lcd AEQbTJ(LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult) {
        java.lang.String toTokenUsd;
        DexMultiTokenInfoBean toToken;
        java.lang.String tokenSymbol;
        LimitOrderInfo limitOrderInfo = limitPairRateResponse.getLimitOrderInfo();
        java.lang.String scientificCurrency$default = null;
        java.lang.String fmtSymbol$default = (limitOrderInfo == null || (toToken = limitOrderInfo.getToToken()) == null || (tokenSymbol = toToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        java.lang.String toAmount = limitCalResult != null ? limitCalResult.getToAmount() : null;
        java.lang.String str = toAmount == null ? "" : toAmount;
        if (limitCalResult != null && (toTokenUsd = limitCalResult.getToTokenUsd()) != null) {
            scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, toTokenUsd, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.getPosition), C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, str, fmtSymbol$default == null ? "" : fmtSymbol$default, false, RoundingMode.DOWN, false, false, 52, null) + " (" + scientificCurrency$default + ")", ConfirmOrderTag.EST_RECEIVE, new InterfaceC30395laO.ActionBar(new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseMessageHandler), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatOnActiveChangeListener))), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final C30516lcd copydefault(LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult) {
        DexMultiTokenInfoBean toToken;
        java.lang.String tokenSymbol;
        java.lang.String minimumReceived = limitCalResult != null ? limitCalResult.getMinimumReceived() : null;
        if (minimumReceived == null) {
            minimumReceived = "";
        }
        LimitOrderInfo limitOrderInfo = limitPairRateResponse.getLimitOrderInfo();
        java.lang.String fmtSymbol$default = (limitOrderInfo == null || (toToken = limitOrderInfo.getToToken()) == null || (tokenSymbol = toToken.getTokenSymbol()) == null) ? null : C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        java.lang.String toTokenPrice = limitPairRateResponse.getToTokenPrice();
        java.lang.String strMulCheckS$default = toTokenPrice != null ? C23313hvq.mulCheckS$default(toTokenPrice, minimumReceived, null, null, null, 14, null) : null;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.invokeSuspendlambda1);
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String str = fmtSymbol$default == null ? "" : fmtSymbol$default;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return new C30516lcd(strAYXKKw, C23271hvA.getShowDataWithSymbol$default(c23271hvA, minimumReceived, str, false, roundingMode, false, false, 52, null) + " (" + (strMulCheckS$default != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strMulCheckS$default, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null) : null) + ")", ConfirmOrderTag.MIN_RECEIVE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd EZpvd(java.lang.String str) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.getSubtitle), C23311hvo.formatPercent$default(str, false, 3, 0, null, null, 29, null), ConfirmOrderTag.SLIPPAGE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd AEQbTJ(java.lang.String str) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatToken), str, ConfirmOrderTag.EXPIRES_AFTER, null, null, false, null, null, 248, null);
    }

    public final C30516lcd OLrzqt(LimitPairRateResponse limitPairRateResponse) {
        java.lang.CharSequence percent$default;
        ServiceFeeInfo serviceFeeInfo = limitPairRateResponse.getServiceFeeInfo();
        if (serviceFeeInfo != null && !serviceFeeInfo.isDisplay()) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged);
        if (serviceFeeInfo == null || (percent$default = C25404iwA.AEQbTJ(serviceFeeInfo)) == null) {
            percent$default = C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
        }
        return new C30516lcd(strAYXKKw, percent$default, ConfirmOrderTag.SERVICE_FEE, new InterfaceC30395laO.TaskDescription(serviceFeeInfo), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final C30516lcd copydefault(LimitCalResult limitCalResult) {
        if (limitCalResult == null) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        java.lang.String priceDiffAmount = limitCalResult.getPriceDiffAmount();
        if (Intrinsics.EZpvd((java.lang.Object) priceDiffAmount, (java.lang.Object) "--") || (C23313hvq.KWHzl(priceDiffAmount, java.lang.Double.valueOf(0.001d)) && C23313hvq.OLrzqt(priceDiffAmount, java.lang.Double.valueOf(-0.001d)))) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.isActive), priceDiffAmount, ConfirmOrderTag.VALUE_DIFF, new InterfaceC30395laO.Activity(new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.isActive), C33070mpX.AYXKKw(C23274hvD.Fragment.SFHvfSaKzXkR))), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }
}
