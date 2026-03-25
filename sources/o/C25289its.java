package o;

import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy;
import com.okinc.business.dexlogic.bean.track.EventTrackingRouteMode;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22401hef;
import o.AbstractC22403heh;
import o.AbstractC22405hej;
import o.AbstractC22407hel;
import o.AbstractC22410heo;
import o.AbstractC22412heq;
import o.AbstractC22413her;
import o.AbstractC22414hes;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.its, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25289its {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "custom" : "turbo" : "fast" : "market";
    }

    public static final AbstractC22401hef.Activity OLrzqt(@NotNull AbstractC22412heq abstractC22412heq) {
        Intrinsics.checkNotNullParameter(abstractC22412heq, "");
        if (abstractC22412heq instanceof AbstractC22412heq.TaskDescription) {
            return KWHzl((AbstractC22412heq.TaskDescription) abstractC22412heq);
        }
        if (!(abstractC22412heq instanceof AbstractC22412heq.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return KWHzl((AbstractC22412heq.Application) abstractC22412heq);
    }

    public static final AbstractC22407hel.Dialog KWHzl(@NotNull AbstractC22414hes.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        QuotePriceRes quotePriceResGEmmrt = activity.gEmmrt();
        java.lang.String strFetchVPNInfo = activity.fetchVPNInfo();
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        C22402heg c22402heg = new C22402heg(strFetchVPNInfo, application.EZpvd(), application.KWHzl(), BusinessType.SWAP.getValue(), TrackOrderType.SWAP.getType(), TrackTransactionDirection.NA.getValue(), EventPageNameType.SWAP.getPageName(), activity.values() ? "yes" : "no");
        java.lang.String strAkhnZx = activity.AkhnZx();
        DexMultiTokenInfoBean fromToken = quotePriceResGEmmrt.getCommonDexInfo().getFromToken();
        DexMultiTokenInfoBean toToken = quotePriceResGEmmrt.getCommonDexInfo().getToToken();
        java.lang.String fromTokenAmount = quotePriceResGEmmrt.getCommonDexInfo().getFromTokenAmount();
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceResGEmmrt.getSelectedDeFiPlatform();
        java.lang.String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        java.lang.String str = receiveAmount == null ? "" : receiveAmount;
        java.lang.String fromTokenPrice = quotePriceResGEmmrt.getCommonDexInfo().getFromTokenPrice();
        DeFiPlatformForSwap selectedDeFiPlatform2 = quotePriceResGEmmrt.getSelectedDeFiPlatform();
        java.lang.String toTokenPrice = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getToTokenPrice() : null;
        C22404hei c22404heiMapToEventTransactionBaseProperty$default = C6967aZP.mapToEventTransactionBaseProperty$default(fromToken, toToken, fromTokenAmount, str, fromTokenPrice, toTokenPrice == null ? "" : toTokenPrice, null, 64, null);
        C22342hdZ c22342hdZ = new C22342hdZ(activity.valueOf(), activity.AEQbTJ(), activity.copydefault(), activity.EZpvd(), activity.djBIcL(), activity.OLrzqt(), null, null, null, null, 960, null);
        java.lang.String str2 = activity.AYXKKw() == SlippageMode.Dynamic ? "yes" : "no";
        java.lang.String strAhwBna = activity.AhwBna();
        java.lang.String strKWHzl = activity.KWHzl();
        java.lang.String strIsConnected = activity.isConnected();
        DexMultiTokenInfoBean fromToken2 = quotePriceResGEmmrt.getCommonDexInfo().getFromToken();
        java.lang.String chainId = fromToken2 != null ? fromToken2.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String str3 = C24695iig.EZpvd(strIsConnected, chainId) ? "yes" : "no";
        EventTrackingAmountEnterBy.Activity activity2 = EventTrackingAmountEnterBy.Companion;
        java.lang.String lowerCase = activity2.copydefault().getName().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new AbstractC22407hel.Dialog(c22402heg, new C22396hea(strAkhnZx, c22404heiMapToEventTransactionBaseProperty$default, c22342hdZ, new C22411hep(str2, strAhwBna, strKWHzl, "no", "no", "no", str3, lowerCase, activity2.OLrzqt(), "", "", "")));
    }

    public static final AbstractC22410heo.Activity AEQbTJ(@NotNull AbstractC22405hej.StateListAnimator stateListAnimator) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        QuotePriceRes quotePriceResCopydefault = stateListAnimator.copydefault();
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        C22402heg c22402heg = new C22402heg(strOLrzqt, application.EZpvd(), application.KWHzl(), BusinessType.BRIDGE.getValue(), TrackOrderType.BRIDGE.getType(), TrackTransactionDirection.NA.getValue(), EventPageNameType.BRIDGE.getPageName(), "no");
        java.lang.String strEZpvd = stateListAnimator.EZpvd();
        DexMultiTokenInfoBean fromToken = quotePriceResCopydefault.getCommonDexInfo().getFromToken();
        DexMultiTokenInfoBean toToken = quotePriceResCopydefault.getCommonDexInfo().getToToken();
        java.lang.String fromTokenAmount = quotePriceResCopydefault.getCommonDexInfo().getFromTokenAmount();
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceResCopydefault.getSelectedDeFiPlatform();
        java.lang.String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        java.lang.String str = receiveAmount == null ? "" : receiveAmount;
        java.lang.String fromTokenPrice = quotePriceResCopydefault.getCommonDexInfo().getFromTokenPrice();
        DeFiPlatformForSwap selectedDeFiPlatform2 = quotePriceResCopydefault.getSelectedDeFiPlatform();
        java.lang.String toTokenPrice = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getToTokenPrice() : null;
        java.lang.String str2 = toTokenPrice == null ? "" : toTokenPrice;
        DexMultiTokenInfoBean toToken2 = quotePriceResCopydefault.getCommonDexInfo().getToToken();
        java.lang.String chainName = toToken2 != null ? toToken2.getChainName() : null;
        C22404hei c22404heiAEQbTJ = C6967aZP.AEQbTJ(fromToken, toToken, fromTokenAmount, str, fromTokenPrice, str2, chainName == null ? "" : chainName);
        java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
        if (quotePriceResCopydefault.getCommonDexInfo().autoOpenMev()) {
            value = DexTrackEventParameter.ButtonName.ON.getValue();
        } else {
            value = DexTrackEventParameter.ButtonName.OFF.getValue();
        }
        java.lang.String str3 = value;
        DeFiPlatformForSwap selectedDeFiPlatform3 = quotePriceResCopydefault.getSelectedDeFiPlatform();
        java.lang.String name = selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.getName() : null;
        java.lang.String str4 = name == null ? "" : name;
        DexQuoteBridgeVO dexQuoteBridgeVOBridge = quotePriceResCopydefault.bridge();
        java.lang.String bridgeName = dexQuoteBridgeVOBridge != null ? dexQuoteBridgeVOBridge.getBridgeName() : null;
        C22342hdZ c22342hdZ = new C22342hdZ(strAEQbTJ, str3, null, null, null, null, null, null, str4, bridgeName == null ? "" : bridgeName, 252, null);
        java.lang.String str5 = stateListAnimator.KWHzl() == SlippageMode.Dynamic ? "yes" : "no";
        EventTrackingAmountEnterBy.Activity activity = EventTrackingAmountEnterBy.Companion;
        java.lang.String lowerCase = activity.copydefault().getName().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new AbstractC22410heo.Activity(c22402heg, new C22396hea(strEZpvd, c22404heiAEQbTJ, c22342hdZ, new C22411hep(str5, null, null, "no", "no", "no", "no", lowerCase, activity.OLrzqt(), null, null, null, 3590, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC22401hef.Activity KWHzl(@NotNull AbstractC22412heq.TaskDescription taskDescription) {
        java.lang.String mode;
        java.lang.String str;
        java.lang.String referenceSlippage;
        java.lang.String str2;
        DexAutoSlippageInfoParam autoSlippageInfo;
        java.lang.String value;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        BuySellPreset buySellPresetEZpvd = taskDescription.EZpvd();
        boolean zFetchVPNInfo = taskDescription.fetchVPNInfo();
        int slippageType = buySellPresetEZpvd.getSlippageConfig().getSlippageType();
        java.util.Iterator<FeeOption> it = buySellPresetEZpvd.getFeeConfig().getFeeOptions().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getSelected()) {
                break;
            }
            i++;
        }
        java.lang.String routerModeType = buySellPresetEZpvd.getRouteConfig().getRouterModeType();
        PresetRouteType presetRouteType = PresetRouteType.RouteTypeAuto;
        if (Intrinsics.EZpvd((java.lang.Object) routerModeType, (java.lang.Object) presetRouteType.getValue())) {
            mode = EventTrackingRouteMode.Auto.getMode();
        } else {
            mode = EventTrackingRouteMode.Manual.getMode();
        }
        java.lang.String str3 = mode;
        java.lang.String routerModeType2 = buySellPresetEZpvd.getRouteConfig().getRouterModeType();
        if (Intrinsics.EZpvd((java.lang.Object) routerModeType2, (java.lang.Object) presetRouteType.getValue())) {
            str = "";
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) routerModeType2, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
                value = DexTrackEventParameter.EventMevType.ANTI_MEV.getValue();
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) routerModeType2, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
                    value = DexTrackEventParameter.EventMevType.FAST.getValue();
                }
                str = "";
            }
            str = value;
        }
        if (slippageType == SlippageMode.Fixed.getType()) {
            referenceSlippage = taskDescription.OLrzqt().getMemeModeCommonDexInfo().getSlippage();
        } else {
            DeFiPlatformForSwap selectedDeFiPlatform = taskDescription.OLrzqt().getSelectedDeFiPlatform();
            referenceSlippage = (selectedDeFiPlatform == null || (autoSlippageInfo = selectedDeFiPlatform.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.getReferenceSlippage();
            if (referenceSlippage == null) {
                str2 = "";
            }
            MemeModeQuoteBean memeModeQuoteBeanOLrzqt = taskDescription.OLrzqt();
            java.lang.String strAkhnZx = taskDescription.AkhnZx();
            AbstractC22421hez.Application application = AbstractC22421hez.Companion;
            C22402heg c22402heg = new C22402heg(strAkhnZx, application.EZpvd(), application.KWHzl(), taskDescription.AEQbTJ(), TrackOrderType.SWAP.getType(), taskDescription.AYXKKw(), taskDescription.djBIcL(), !taskDescription.values() ? "yes" : "no");
            java.lang.String strValueOf = taskDescription.valueOf();
            DexMultiTokenInfoBean fromToken = memeModeQuoteBeanOLrzqt.getMemeModeCommonDexInfo().getFromToken();
            DexMultiTokenInfoBean toToken = memeModeQuoteBeanOLrzqt.getMemeModeCommonDexInfo().getToToken();
            java.lang.String fromTokenAmount = memeModeQuoteBeanOLrzqt.getMemeModeCommonDexInfo().getFromTokenAmount();
            DeFiPlatformForSwap selectedDeFiPlatform2 = memeModeQuoteBeanOLrzqt.getSelectedDeFiPlatform();
            java.lang.String receiveAmount = selectedDeFiPlatform2 == null ? selectedDeFiPlatform2.getReceiveAmount() : null;
            java.lang.String str4 = receiveAmount != null ? "" : receiveAmount;
            java.lang.String fromTokenPrice = memeModeQuoteBeanOLrzqt.getMemeModeCommonDexInfo().getFromTokenPrice();
            DeFiPlatformForSwap selectedDeFiPlatform3 = memeModeQuoteBeanOLrzqt.getSelectedDeFiPlatform();
            java.lang.String toTokenPrice = selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.getToTokenPrice() : null;
            C22404hei c22404heiMapToEventTransactionBaseProperty$default = C6967aZP.mapToEventTransactionBaseProperty$default(fromToken, toToken, fromTokenAmount, str4, fromTokenPrice, toTokenPrice != null ? "" : toTokenPrice, null, 64, null);
            C22342hdZ c22342hdZ = new C22342hdZ(str2, KWHzl(buySellPresetEZpvd, memeModeQuoteBeanOLrzqt.getMemeModeCommonDexInfo().isEnableMev()), str3, str, taskDescription.AhwBna(), taskDescription.KWHzl(), null, null, "", "", 192, null);
            java.lang.String str5 = slippageType != SlippageMode.Dynamic.getType() ? "yes" : "no";
            java.lang.String strEZpvd = EZpvd(i);
            java.lang.String strEZpvd2 = EZpvd(i);
            java.lang.String str6 = !zFetchVPNInfo ? "yes" : "no";
            EventTrackingAmountEnterBy.Activity activity = EventTrackingAmountEnterBy.Companion;
            java.lang.String lowerCase = activity.copydefault().getName().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return new AbstractC22401hef.Activity(c22402heg, new C22396hea(strValueOf, c22404heiMapToEventTransactionBaseProperty$default, c22342hdZ, new C22411hep(str5, strEZpvd, strEZpvd2, "yes", str6, "no", "no", lowerCase, activity.OLrzqt(), "", "", taskDescription.copydefault())), taskDescription.gEmmrt(), null, 8, null);
        }
        str2 = referenceSlippage;
        MemeModeQuoteBean memeModeQuoteBeanOLrzqt2 = taskDescription.OLrzqt();
        java.lang.String strAkhnZx2 = taskDescription.AkhnZx();
        AbstractC22421hez.Application application2 = AbstractC22421hez.Companion;
        C22402heg c22402heg2 = new C22402heg(strAkhnZx2, application2.EZpvd(), application2.KWHzl(), taskDescription.AEQbTJ(), TrackOrderType.SWAP.getType(), taskDescription.AYXKKw(), taskDescription.djBIcL(), !taskDescription.values() ? "yes" : "no");
        java.lang.String strValueOf2 = taskDescription.valueOf();
        DexMultiTokenInfoBean fromToken2 = memeModeQuoteBeanOLrzqt2.getMemeModeCommonDexInfo().getFromToken();
        DexMultiTokenInfoBean toToken2 = memeModeQuoteBeanOLrzqt2.getMemeModeCommonDexInfo().getToToken();
        java.lang.String fromTokenAmount2 = memeModeQuoteBeanOLrzqt2.getMemeModeCommonDexInfo().getFromTokenAmount();
        DeFiPlatformForSwap selectedDeFiPlatform22 = memeModeQuoteBeanOLrzqt2.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform22 == null) {
        }
        if (receiveAmount != null) {
        }
        java.lang.String fromTokenPrice2 = memeModeQuoteBeanOLrzqt2.getMemeModeCommonDexInfo().getFromTokenPrice();
        DeFiPlatformForSwap selectedDeFiPlatform32 = memeModeQuoteBeanOLrzqt2.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform32 != null) {
        }
        C22404hei c22404heiMapToEventTransactionBaseProperty$default2 = C6967aZP.mapToEventTransactionBaseProperty$default(fromToken2, toToken2, fromTokenAmount2, str4, fromTokenPrice2, toTokenPrice != null ? "" : toTokenPrice, null, 64, null);
        C22342hdZ c22342hdZ2 = new C22342hdZ(str2, KWHzl(buySellPresetEZpvd, memeModeQuoteBeanOLrzqt2.getMemeModeCommonDexInfo().isEnableMev()), str3, str, taskDescription.AhwBna(), taskDescription.KWHzl(), null, null, "", "", 192, null);
        if (slippageType != SlippageMode.Dynamic.getType()) {
        }
        java.lang.String strEZpvd3 = EZpvd(i);
        java.lang.String strEZpvd22 = EZpvd(i);
        if (!zFetchVPNInfo) {
        }
        EventTrackingAmountEnterBy.Activity activity2 = EventTrackingAmountEnterBy.Companion;
        java.lang.String lowerCase2 = activity2.copydefault().getName().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return new AbstractC22401hef.Activity(c22402heg2, new C22396hea(strValueOf2, c22404heiMapToEventTransactionBaseProperty$default2, c22342hdZ2, new C22411hep(str5, strEZpvd3, strEZpvd22, "yes", str6, "no", "no", lowerCase2, activity2.OLrzqt(), "", "", taskDescription.copydefault())), taskDescription.gEmmrt(), null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7 A[PHI: r7
  0x00d7: PHI (r7v11 java.lang.String) = (r7v5 java.lang.String), (r7v12 java.lang.String) binds: [B:42:0x00d3, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC22401hef.Activity KWHzl(@NotNull AbstractC22412heq.Application application) {
        java.lang.String mode;
        java.lang.String str;
        java.lang.String referenceSlippage;
        java.lang.String str2;
        java.lang.Object next;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(application, "");
        BuySellPreset buySellPresetOLrzqt = application.OLrzqt();
        boolean zAYXKKw = application.AYXKKw();
        int slippageType = buySellPresetOLrzqt.getSlippageConfig().getSlippageType();
        java.util.Iterator<FeeOption> it = buySellPresetOLrzqt.getFeeConfig().getFeeOptions().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getSelected()) {
                break;
            }
            i++;
        }
        java.lang.String routerModeType = buySellPresetOLrzqt.getRouteConfig().getRouterModeType();
        PresetRouteType presetRouteType = PresetRouteType.RouteTypeAuto;
        if (Intrinsics.EZpvd((java.lang.Object) routerModeType, (java.lang.Object) presetRouteType.getValue())) {
            mode = EventTrackingRouteMode.Auto.getMode();
        } else {
            mode = EventTrackingRouteMode.Manual.getMode();
        }
        java.lang.String str4 = mode;
        java.lang.String routerModeType2 = buySellPresetOLrzqt.getRouteConfig().getRouterModeType();
        if (Intrinsics.EZpvd((java.lang.Object) routerModeType2, (java.lang.Object) presetRouteType.getValue())) {
            str = "";
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) routerModeType2, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
                str3 = Intrinsics.EZpvd((java.lang.Object) routerModeType2, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue()) ? "fast" : "anti_mev";
                str = "";
            }
            str = str3;
        }
        if (slippageType != SlippageMode.Fixed.getType()) {
            DexAutoSlippageInfoParam slippageConfig = application.EZpvd().getSlippageConfig();
            referenceSlippage = slippageConfig != null ? slippageConfig.getReferenceSlippage() : null;
            if (referenceSlippage == null) {
            }
        } else {
            java.util.Iterator<T> it2 = buySellPresetOLrzqt.getSlippageConfig().getSlippageRange().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((SlippageRange) next).getSelected()) {
                    break;
                }
            }
            SlippageRange slippageRange = (SlippageRange) next;
            referenceSlippage = slippageRange != null ? slippageRange.getSlippageValue() : null;
            str2 = referenceSlippage == null ? "" : referenceSlippage;
        }
        LimitMarketPrice limitMarketPriceEZpvd = application.EZpvd();
        java.lang.String strDjBIcL = application.djBIcL();
        AbstractC22421hez.Application application2 = AbstractC22421hez.Companion;
        C22402heg c22402heg = new C22402heg(strDjBIcL, application2.EZpvd(), application2.KWHzl(), BusinessType.MEME.getValue(), application.AEQbTJ(), application.AhwBna(), EventPageNameType.MEME.getPageName(), "no");
        java.lang.String strGEmmrt = application.gEmmrt();
        C22404hei c22404heiMapToEventTransactionBaseProperty$default = C6967aZP.mapToEventTransactionBaseProperty$default(limitMarketPriceEZpvd.getCommonDexInfo().getFromToken(), limitMarketPriceEZpvd.getCommonDexInfo().getToToken(), limitMarketPriceEZpvd.getCommonDexInfo().getFromTokenAmount(), limitMarketPriceEZpvd.getReceiveAmount(), limitMarketPriceEZpvd.getCommonDexInfo().getFromTokenPrice(), limitMarketPriceEZpvd.getToTokenPrice(), null, 64, null);
        C22342hdZ c22342hdZ = new C22342hdZ(str2, KWHzl(buySellPresetOLrzqt, limitMarketPriceEZpvd.getCommonDexInfo().isEnableMev()), str4, str, application.valueOf(), application.copydefault(), null, null, "", "", 192, null);
        java.lang.String str5 = slippageType == SlippageMode.Dynamic.getType() ? "yes" : "no";
        java.lang.String strEZpvd = EZpvd(i);
        java.lang.String strEZpvd2 = EZpvd(i);
        java.lang.String str6 = zAYXKKw ? "yes" : "no";
        EventTrackingAmountEnterBy.Activity activity = EventTrackingAmountEnterBy.Companion;
        java.lang.String lowerCase = activity.copydefault().getName().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new AbstractC22401hef.Activity(c22402heg, new C22396hea(strGEmmrt, c22404heiMapToEventTransactionBaseProperty$default, c22342hdZ, new C22411hep(str5, strEZpvd, strEZpvd2, "yes", str6, "no", "no", lowerCase, activity.OLrzqt(), "", "", application.KWHzl())), null, null, 12, null);
    }

    public static final java.lang.String KWHzl(@NotNull BuySellPreset buySellPreset, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ((Intrinsics.EZpvd((java.lang.Object) buySellPreset.getRouteConfig().getRouterModeType(), (java.lang.Object) PresetRouteType.RouteTypeMev.getValue()) || (Intrinsics.EZpvd((java.lang.Object) buySellPreset.getRouteConfig().getRouterModeType(), (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue()) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1"))) ? DexTrackEventParameter.ButtonName.ON : DexTrackEventParameter.ButtonName.OFF).getValue();
    }

    public static final AbstractC22403heh.LoaderManager copydefault(@NotNull AbstractC22413her.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        LimitPairRateResponse limitPairRateResponseDjBIcL = application.djBIcL();
        java.lang.String strFetchVPNInfo = application.fetchVPNInfo();
        AbstractC22421hez.Application application2 = AbstractC22421hez.Companion;
        C22402heg c22402heg = new C22402heg(strFetchVPNInfo, application2.EZpvd(), application2.KWHzl(), BusinessType.LIMIT.getValue(), TrackOrderType.LIMIT.getType(), TrackTransactionDirection.NA.getValue(), EventPageNameType.LIMIT.getPageName(), application.ejfBZ() ? "yes" : "no");
        java.lang.String strAkhnZx = application.AkhnZx();
        LimitOrderInfo limitOrderInfo = limitPairRateResponseDjBIcL.getLimitOrderInfo();
        DexMultiTokenInfoBean fromToken = limitOrderInfo != null ? limitOrderInfo.getFromToken() : null;
        LimitOrderInfo limitOrderInfo2 = limitPairRateResponseDjBIcL.getLimitOrderInfo();
        DexMultiTokenInfoBean toToken = limitOrderInfo2 != null ? limitOrderInfo2.getToToken() : null;
        LimitOrderInfo limitOrderInfo3 = limitPairRateResponseDjBIcL.getLimitOrderInfo();
        java.lang.String fromTokenAmount = limitOrderInfo3 != null ? limitOrderInfo3.getFromTokenAmount() : null;
        java.lang.String str = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String receiveAmount = limitPairRateResponseDjBIcL.getReceiveAmount();
        java.lang.String str2 = receiveAmount == null ? "" : receiveAmount;
        LimitOrderInfo limitOrderInfo4 = limitPairRateResponseDjBIcL.getLimitOrderInfo();
        java.lang.String fromTokenPrice = limitOrderInfo4 != null ? limitOrderInfo4.getFromTokenPrice() : null;
        java.lang.String str3 = fromTokenPrice == null ? "" : fromTokenPrice;
        java.lang.String toTokenPrice = limitPairRateResponseDjBIcL.getToTokenPrice();
        C22404hei c22404heiMapToEventTransactionBaseProperty$default = C6967aZP.mapToEventTransactionBaseProperty$default(fromToken, toToken, str, str2, str3, toTokenPrice == null ? "" : toTokenPrice, null, 64, null);
        C22342hdZ c22342hdZ = new C22342hdZ(application.fetchVPNInfo(), application.gEmmrt(), application.valueOf(), application.AYXKKw(), application.DbNXlk(), application.OLrzqt(), application.AhwBna(), application.AEQbTJ(), "", "");
        java.lang.String str4 = application.isConnected() == SlippageMode.Dynamic ? "yes" : "no";
        java.lang.String strValues = application.values();
        java.lang.String strEZpvd = application.EZpvd();
        EventTrackingAmountEnterBy.Activity activity = EventTrackingAmountEnterBy.Companion;
        return new AbstractC22403heh.LoaderManager(c22402heg, new C22396hea(strAkhnZx, c22404heiMapToEventTransactionBaseProperty$default, c22342hdZ, new C22411hep(str4, strValues, strEZpvd, "no", "no", "no", "no", activity.copydefault().getName(), activity.OLrzqt(), application.copydefault(), application.KWHzl(), "")));
    }
}
