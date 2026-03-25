package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55893xsY implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>>, java.util.ArrayList<TransDetailsData>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<TransDetailsData> KWHzl(@NotNull C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.ArrayList<TransDetailsData> arrayList = new java.util.ArrayList<>();
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : c55804xqp.copydefault()) {
            java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), false, null, null, 28, null);
            java.lang.String first = C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), "").getFirst();
            int iAEQbTJ = C56033xvF.AEQbTJ(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), "").getSecond().booleanValue());
            java.lang.String simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getCTime())), null, 1, null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherApi33Impl) + " (" + C56033xvF.AEQbTJ(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId()) + ")", Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor) : C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s) + " (" + C56033xvF.getBotAmountUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), null, null, 12, null) + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setOnBackInvokedDispatcher) + " (" + C56033xvF.AEQbTJ(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId()) + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.registerOnBackInvokedCallback) + " (" + C56033xvF.getBotAmountUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), null, null, 12, null) + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAccFillSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TransDetailsData(coinTitle$default, first, simpleDateTime$default, arrayList2, null, null, strategyOrderBillDetailsResponse.getOrdId(), null, 0, false, null, null, null, null, null, null, false, iAEQbTJ, 130992, null));
        }
        return arrayList;
    }
}
