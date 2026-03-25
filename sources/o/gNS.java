package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC30395laO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gNS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ() {
        return "--";
    }

    @yCM
    public gNS() {
    }

    public final C30457lbX OLrzqt(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
        DexMultiTokenInfoBean token = quotePriceRes.toToken();
        return new C30457lbX(dexMultiTokenInfoBeanFromToken.getChainId(), null, null, null, C30565ldZ.getFmtSymbol$default(dexMultiTokenInfoBeanFromToken.getTokenSymbol(), 0, 1, null) + "/" + C30565ldZ.getFmtSymbol$default(token.getTokenSymbol(), 0, 1, null), yDY.gEmmrt(copydefault(), KWHzl(quotePriceRes), copydefault(quotePriceRes), EZpvd(quotePriceRes), AEQbTJ(quotePriceRes), gEmmrt(quotePriceRes), KWHzl(str), copydefault(quotePriceRes, str2), OLrzqt(quotePriceRes), AYXKKw(quotePriceRes)), TradeMode.SwapMarket, null, null, null, null, null, null, 8078, null);
    }

    public final C30516lcd copydefault() {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.zLAIeZ), C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambda3HoOD4FOOs4BK4W3sogOQmeeOUI), ConfirmOrderTag.ORDER_TYPE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd KWHzl(QuotePriceRes quotePriceRes) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.RSmiaq), C28343kXx.OLrzqt(quotePriceRes, true), ConfirmOrderTag.MARKET_PRICE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd copydefault(QuotePriceRes quotePriceRes) {
        java.lang.String strPayAmount = quotePriceRes.payAmount();
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String tokenSymbol = quotePriceRes.fromToken().getTokenSymbol();
        RoundingMode roundingMode = RoundingMode.DOWN;
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.PlaybackStateCompatErrorCode), C23271hvA.getShowDataWithSymbol$default(c23271hvA, strPayAmount, tokenSymbol, false, roundingMode, false, false, 52, null) + " (" + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, quotePriceRes.getNewFromTokenPrice(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null) + ")", ConfirmOrderTag.SELL_AMOUNT, null, null, false, null, null, 248, null);
    }

    public final C30516lcd EZpvd(QuotePriceRes quotePriceRes) {
        java.lang.String fmtSymbol$default = C30565ldZ.getFmtSymbol$default(quotePriceRes.toToken().getTokenSymbol(), 0, 1, null);
        java.lang.String strReceiveAmount = quotePriceRes.receiveAmount();
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String tokenPrice = quotePriceRes.toTokenPrice();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, tokenPrice, false, roundingMode, false, false, false, false, null, false, false, 509, null);
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseMessageHandler), C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, strReceiveAmount, fmtSymbol$default, false, roundingMode, false, false, 52, null) + " (" + scientificCurrency$default + ")", ConfirmOrderTag.EST_RECEIVE, new InterfaceC30395laO.ActionBar(new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseMessageHandler), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatOnActiveChangeListener))), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final C30516lcd AEQbTJ(QuotePriceRes quotePriceRes) {
        java.lang.String strMinimumReceived = quotePriceRes.minimumReceived();
        java.lang.String fmtSymbol$default = C30565ldZ.getFmtSymbol$default(quotePriceRes.toToken().getTokenSymbol(), 0, 1, null);
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(quotePriceRes.toTokenPrice(), quotePriceRes.receiveAmount(), null, null, null, 14, null), strMinimumReceived, null, null, null, 14, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.invokeSuspendlambda1);
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return new C30516lcd(strAYXKKw, C23271hvA.getShowDataWithSymbol$default(c23271hvA, strMinimumReceived, fmtSymbol$default, false, roundingMode, false, false, 52, null) + " (" + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strMulCheckS$default, false, roundingMode, false, false, false, false, null, false, false, 509, null) + ")", ConfirmOrderTag.MIN_RECEIVE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd KWHzl(java.lang.String str) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.getSubtitle), C23311hvo.formatPercent$default(str, false, 3, 0, null, null, 29, null), ConfirmOrderTag.SLIPPAGE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd OLrzqt(QuotePriceRes quotePriceRes) {
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV);
        java.lang.String name = selectedDeFiPlatform != null ? selectedDeFiPlatform.getName() : null;
        if (name == null) {
            name = "";
        }
        return new C30516lcd(strAYXKKw, name, ConfirmOrderTag.ROUTER, null, selectedDeFiPlatform != null ? selectedDeFiPlatform.getLogo() : null, false, null, null, 232, null);
    }

    public final C30516lcd AYXKKw(QuotePriceRes quotePriceRes) {
        java.lang.CharSequence percent$default;
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
        ServiceFeeInfo serviceFeeInfo = selectedDeFiPlatform != null ? selectedDeFiPlatform.getServiceFeeInfo() : null;
        if (serviceFeeInfo != null && !serviceFeeInfo.isDisplay()) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged);
        if (serviceFeeInfo == null || (percent$default = C25404iwA.AEQbTJ(serviceFeeInfo)) == null) {
            percent$default = C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
        }
        return new C30516lcd(strAYXKKw, percent$default, ConfirmOrderTag.SERVICE_FEE, new InterfaceC30395laO.TaskDescription(serviceFeeInfo), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final C30516lcd copydefault(QuotePriceRes quotePriceRes, java.lang.String str) {
        java.lang.String nativeTokenUnitPriceUsd = quotePriceRes.getCommonDexInfo().getNativeTokenUnitPriceUsd();
        if (str.length() == 0 || nativeTokenUnitPriceUsd.length() == 0) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        java.lang.String fromNativeTokenSymbol = quotePriceRes.getCommonDexInfo().getFromNativeTokenSymbol();
        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(str, nativeTokenUnitPriceUsd, null, null, null, 14, null);
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, strDivCheckS$default, false, roundingMode, false, false, 26, null);
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow11), showData$default + " " + fromNativeTokenSymbol + " (" + scientificCurrency$default + ")", ConfirmOrderTag.NETWORK_FEE, null, null, quotePriceRes.isPMM(), null, null, 216, null);
    }

    public final C30516lcd gEmmrt(QuotePriceRes quotePriceRes) {
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
        java.lang.String diffPercent = selectedDeFiPlatform != null ? selectedDeFiPlatform.getDiffPercent() : null;
        if (diffPercent == null) {
            diffPercent = "";
        }
        java.lang.String strKWHzl = C31256lqb.KWHzl(diffPercent, (Function0<java.lang.String>) new Function0() { // from class: o.gNR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gNS.AEQbTJ();
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "--") || (C33129mqd.gEmmrt(strKWHzl, java.lang.Double.valueOf(0.001d)) && C33129mqd.AEQbTJ(strKWHzl, java.lang.Double.valueOf(-0.001d)))) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.isActive), strKWHzl, ConfirmOrderTag.VALUE_DIFF, new InterfaceC30395laO.Activity(new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.isActive), C33070mpX.AYXKKw(C23274hvD.Fragment.SFHvfSaKzXkR))), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }
}
