package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55922xtA implements InterfaceC54501xKt<java.util.List<? extends StrategyOrderBillDetailsResponse>, java.util.ArrayList<TransDetailsData>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<TransDetailsData> KWHzl(@NotNull java.util.List<StrategyOrderBillDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<TransDetailsData> arrayList = new java.util.ArrayList<>();
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : list) {
            java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getCtVal(), null, 8, null);
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId());
            java.lang.String botFeeUnit$default = C56033xvF.getBotFeeUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), "", strategyOrderBillDetailsResponse.getSide(), null, 16, null);
            java.lang.String quoteFee = strategyOrderBillDetailsResponse.getQuoteFee();
            TacticsInsideItemData[] tacticsInsideItemDataArr = new TacticsInsideItemData[4];
            tacticsInsideItemDataArr[0] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAEQbTJ + ")", Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrdType(), (java.lang.Object) "market") ? C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor) : C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[1] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getSz(), "", false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[2] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            tacticsInsideItemDataArr[3] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + botFeeUnit$default + ")", C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), quoteFee, botFeeUnit$default, false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
            arrayList.add(new TransDetailsData(C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), true, null, null, 24, null), C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getFirst(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getUTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), yDY.copydefault(tacticsInsideItemDataArr), null, null, null, null, 0, false, null, null, null, null, null, null, false, C56033xvF.AEQbTJ(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getSecond().booleanValue()), 131056, null));
        }
        return arrayList;
    }
}
