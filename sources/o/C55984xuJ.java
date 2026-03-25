package o;

import com.okinc.biz.TacticsType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55984xuJ implements InterfaceC54501xKt<java.util.List<? extends StrategyOrderBillDetailsResponse>, java.util.ArrayList<DetailsData>> {
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ java.util.ArrayList<DetailsData> KWHzl(java.util.List<? extends StrategyOrderBillDetailsResponse> list) {
        return EZpvd((java.util.List<StrategyOrderBillDetailsResponse>) list);
    }

    public java.util.ArrayList<DetailsData> EZpvd(@NotNull java.util.List<StrategyOrderBillDetailsResponse> list) {
        java.lang.String ordId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<DetailsData> arrayList = new java.util.ArrayList<>();
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : list) {
            java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getCtVal(), null, 8, null);
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId());
            TacticsInsideItemData[] tacticsInsideItemDataArr = new TacticsInsideItemData[5];
            tacticsInsideItemDataArr[0] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAEQbTJ + ")", Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrdType(), (java.lang.Object) "market") ? C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor) : C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[1] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[2] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[3] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAccFillSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[4] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hOMIpD), C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getReduceOnly(), (java.lang.Object) "true") ? C55688xof.Application.AlertController3 : C55688xof.Application.onScroll), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(tacticsInsideItemDataArr);
            java.lang.String ordType = strategyOrderBillDetailsResponse.getOrdType();
            java.lang.String instId = strategyOrderBillDetailsResponse.getInstId();
            java.lang.String instType = strategyOrderBillDetailsResponse.getInstType();
            java.lang.String algoId = strategyOrderBillDetailsResponse.getAlgoId();
            java.lang.String ordId2 = strategyOrderBillDetailsResponse.getOrdId();
            java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), false, null, null, 28, null);
            TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(strategyOrderBillDetailsResponse.getAlgoOrdType());
            if (tacticsTypeAEQbTJ == null) {
                tacticsTypeAEQbTJ = TacticsType.TACTICS_SIGNAL_BOT;
            }
            arrayList.add(new DetailsData(ordType, instId, instType, algoId, ordId2, coinTitle$default, false, tacticsTypeAEQbTJ, C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getFirst(), C56033xvF.fJNWhG(strategyOrderBillDetailsResponse.getTdMode()), strategyOrderBillDetailsResponse.getLever(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayListCopydefault, "", true, C56033xvF.OLrzqt(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getSecond().booleanValue()), C56033xvF.EZpvd(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getSecond().booleanValue()), null, null, null, null, false, null, 8257536, null));
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2 = (StrategyOrderBillDetailsResponse) CollectionsKt___CollectionsKt.wlaJM(list);
            if (strategyOrderBillDetailsResponse2 != null && (ordId = strategyOrderBillDetailsResponse2.getOrdId()) != null) {
                str = ordId;
            }
            this.KWHzl = str;
        }
        return arrayList;
    }
}
