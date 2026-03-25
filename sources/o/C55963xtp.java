package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55963xtp implements InterfaceC54501xKt<java.util.List<? extends StrategyPositionResponse>, java.util.ArrayList<TransDetailsData>> {
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ java.util.ArrayList<TransDetailsData> KWHzl(java.util.List<? extends StrategyPositionResponse> list) {
        return KWHzl2((java.util.List<StrategyPositionResponse>) list);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public java.util.ArrayList<TransDetailsData> KWHzl2(@NotNull java.util.List<StrategyPositionResponse> list) {
        java.lang.String tradeSymbol;
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<TransDetailsData> arrayList = new java.util.ArrayList<>();
        for (StrategyPositionResponse strategyPositionResponse : list) {
            java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getCtVal(), null, 8, null);
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId());
            java.lang.String strKWHzl = C56033xvF.KWHzl(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getMgnCcy());
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), null, null, 12, null)) == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                tradeSymbol = "";
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestKt) + "(" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zUtmHU) + "(" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getCloseAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen1) + "(" + strKWHzl + ")", C56033xvF.getBotPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getCloseUpl(), null, false, false, null, false, null, null, null, 2040, null), C33070mpX.AYXKKw(C55688xof.Application.onPreparePanel), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getCloseUpl(), null, 8, null)), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubPosition.KWHzl, null, null, null, null, null, null, null, 130544, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), C56068xvo.copydefault.copydefault(strategyPositionResponse.getCloseUplRatio(), true), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPositionResponse.getCloseUplRatio())), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sanitizeSessionIdIgnoreCase) + "(" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getCloseTotalAmount(), "", false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.zeUJxr);
            Date date = new Date(C33129mqd.valueOf(strategyPositionResponse.getCTime()));
            OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
            OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE;
            arrayList2.add(new TacticsInsideItemData(strAYXKKw, pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.aLnfMH), pTA.format$default(new Date(C33129mqd.valueOf(strategyPositionResponse.getUTime())), oKDateEnum, oKTimeEnum, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TransDetailsData(C56033xvF.getCoinTitle$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), true, null, null, 24, null), C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), tradeSymbol, strategyPositionResponse.getPosCcy(), strategyPositionResponse.getPosSide(), strategyPositionResponse.getPos()), "", arrayList2, null, C33070mpX.AYXKKw(C55688xof.Application.getPlaybackType), null, strategyPositionResponse.getAlgoId(), 0, false, strategyPositionResponse.getInstId(), strategyPositionResponse.getCTime(), strategyPositionResponse.getUTime(), C56033xvF.fJNWhG(strategyPositionResponse.getMgnMode()), null, null, false, C56033xvF.AEQbTJ(copydefault(strategyPositionResponse)), 115536, null));
        }
        return arrayList;
    }

    public final boolean copydefault(StrategyPositionResponse strategyPositionResponse) {
        java.lang.String posSide = strategyPositionResponse.getPosSide();
        if (Intrinsics.EZpvd((java.lang.Object) posSide, (java.lang.Object) "long")) {
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) posSide, (java.lang.Object) "short")) {
            return false;
        }
        return C33129mqd.AEQbTJ(strategyPositionResponse.getPos(), 0);
    }
}
