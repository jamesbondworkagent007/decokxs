package o;

import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56042xvO {
    public static /* synthetic */ java.lang.String trailingUpPxError$default(GridReq gridReq, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return AEQbTJ(gridReq, str, z);
    }

    public static final java.lang.String AEQbTJ(@NotNull GridReq gridReq, java.lang.String str, boolean z) {
        java.lang.String displayQuoteSymbol;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(gridReq, "");
        TrailingConfig trailingUpConfig = gridReq.getTrailingUpConfig();
        java.lang.String stopPx = trailingUpConfig != null ? trailingUpConfig.getStopPx() : null;
        TrailingConfig trailingUpConfig2 = gridReq.getTrailingUpConfig();
        if (trailingUpConfig2 != null && trailingUpConfig2.getEnabled() && ((stopPx != null && stopPx.length() != 0) || !z)) {
            if (C33129mqd.AEQbTJ(str, 0) && C33129mqd.AEQbTJ(stopPx, str)) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RequiresFeature);
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                xMR xmr = xMR.copydefault;
                Intrinsics.copydefault((java.lang.Object) str);
                pairArr[0] = C56390yDp.OLrzqt("upLimit", xmr.copydefault(str));
                BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
                if (bizInstrumentIsConnected != null && (displayQuoteSymbol = bizInstrumentIsConnected.getDisplayQuoteSymbol()) != null) {
                    str2 = displayQuoteSymbol;
                }
                pairArr[1] = C56390yDp.OLrzqt("quoteCurrency", str2);
                return C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairArr));
            }
            if (C33129mqd.AEQbTJ(gridReq.getMaxPx(), 0) && C33129mqd.valueOf(stopPx, gridReq.getMaxPx())) {
                return C33070mpX.AYXKKw(C55688xof.Application.RequiresApi);
            }
        }
        return "";
    }

    public static /* synthetic */ java.lang.String trailingDownPxError$default(GridReq gridReq, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return EZpvd(gridReq, str, z);
    }

    public static final java.lang.String EZpvd(@NotNull GridReq gridReq, java.lang.String str, boolean z) {
        java.lang.String displayQuoteSymbol;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(gridReq, "");
        TrailingConfig trailingDownConfig = gridReq.getTrailingDownConfig();
        java.lang.String stopPx = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        TrailingConfig trailingDownConfig2 = gridReq.getTrailingDownConfig();
        if (trailingDownConfig2 != null && trailingDownConfig2.getEnabled() && ((stopPx != null && stopPx.length() != 0) || !z)) {
            if (C33129mqd.AEQbTJ(str, 0) && C33129mqd.gEmmrt(stopPx, str)) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.Px);
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                xMR xmr = xMR.copydefault;
                Intrinsics.copydefault((java.lang.Object) str);
                pairArr[0] = C56390yDp.OLrzqt("downLimit", xmr.copydefault(str));
                BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
                if (bizInstrumentIsConnected != null && (displayQuoteSymbol = bizInstrumentIsConnected.getDisplayQuoteSymbol()) != null) {
                    str2 = displayQuoteSymbol;
                }
                pairArr[1] = C56390yDp.OLrzqt("quoteCurrency", str2);
                return C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairArr));
            }
            if (C33129mqd.AEQbTJ(gridReq.getMinPx(), 0) && C33129mqd.copydefault(stopPx, gridReq.getMinPx())) {
                return C33070mpX.AYXKKw(C55688xof.Application.setEnabled);
            }
        }
        return "";
    }

    public static final java.lang.String AEQbTJ(@NotNull TpSlTriggerParam tpSlTriggerParam, @NotNull SpotGridTpSlConfig spotGridTpSlConfig) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        java.lang.String delaySeconds = tpSlTriggerParam.getDelaySeconds();
        if (delaySeconds == null || delaySeconds.length() == 0) {
            return "";
        }
        java.lang.String delaySeconds2 = tpSlTriggerParam.getDelaySeconds();
        return (C33129mqd.AEQbTJ(delaySeconds2, spotGridTpSlConfig.getMaxDelaySeconds()) || C33129mqd.gEmmrt(delaySeconds2, spotGridTpSlConfig.getMinDelaySeconds())) ? C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsOpenDocument, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minDelayTime", spotGridTpSlConfig.getMinDelaySeconds()), C56390yDp.OLrzqt("maxDelayTime", spotGridTpSlConfig.getMaxDelaySeconds()))) : "";
    }

    public static final java.lang.String OLrzqt(@NotNull GridReq gridReq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(gridReq, "");
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(gridReq.getSignParams());
        if (!Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            return "";
        }
        java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
        if (C33129mqd.valueOf(triggerPx, 0)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl);
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        java.lang.String strMulS$default = C33129mqd.mulS$default((value == null || (strAYXKKw = value.AYXKKw()) == null) ? "" : strAYXKKw, 2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.copydefault(triggerPx, strMulS$default)) {
            return C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxPrice", pTB.formatLocalized$default(strMulS$default, null, 1, null))));
        }
        java.lang.String tpTriggerPx = gridReq.getTpTriggerPx();
        if (C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.copydefault(triggerPx, tpTriggerPx)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackMessageHandler);
        }
        java.lang.String slTriggerPx = gridReq.getSlTriggerPx();
        return (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(triggerPx, slTriggerPx)) ? C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubApi21) : "";
    }

    public static final java.lang.String KWHzl(@NotNull GridReq gridReq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(gridReq, "");
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(gridReq.getSignParams());
        if (!Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            return "";
        }
        java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
        if (C33129mqd.valueOf(triggerPx, 0)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl);
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        java.lang.String strMulS$default = C33129mqd.mulS$default((value == null || (strAYXKKw = value.AYXKKw()) == null) ? "" : strAYXKKw, 2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.copydefault(triggerPx, strMulS$default)) {
            return C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxPrice", pTB.formatLocalized$default(strMulS$default, null, 1, null))));
        }
        java.lang.String tpTriggerPx = gridReq.getTpTriggerPx();
        if (C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.copydefault(triggerPx, tpTriggerPx)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackMessageHandler);
        }
        java.lang.String slTriggerPx = gridReq.getSlTriggerPx();
        return (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(triggerPx, slTriggerPx)) ? C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubApi21) : "";
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GridStartTriggerType.INSTANT.getMode()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GridStopTriggerType.MANUAL_STOP.getMode()) || !C33129mqd.AEQbTJ(str2, "3600")) {
            return "";
        }
        int i = C55688xof.Application.ActivityResultContractsOpenDocument;
        xMR xmr = xMR.copydefault;
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minDelayTime", xmr.copydefault("0")), C56390yDp.OLrzqt("maxDelayTime", xmr.copydefault("3600"))));
    }
}
