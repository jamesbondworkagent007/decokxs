package com.okinc.find_ui.ranking.stock.viewmodel;

import com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel;
import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.quotation.data.model.stock.StockTokenPo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35069noP;
import o.C35071noR;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC35073noT;
import o.InterfaceC40516qYt;
import o.InterfaceC49371unL;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3 extends SuspendLambda implements Function2<StockListPo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeStockContainerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3(MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, Continuation<? super MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeStockContainerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3 marketHomeStockContainerViewModel$subscribeStockTickersWs$4$3 = new MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3(this.this$0, continuation);
        marketHomeStockContainerViewModel$subscribeStockTickersWs$4$3.L$0 = obj;
        return marketHomeStockContainerViewModel$subscribeStockTickersWs$4$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StockListPo stockListPo, Continuation<? super Unit> continuation) {
        return ((MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3) create(stockListPo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<C35069noP> listGEmmrt;
        List<C35069noP> listCopydefault;
        List listKWHzl;
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLValueOf;
        InterfaceC49371unL<List<InterfaceC40516qYt>> activity;
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            StockListPo stockListPo = (StockListPo) this.L$0;
            pUU.EZpvd("MarketHomeStockContainerViewModel", "subscribeStockTickersWs update: spot=" + stockListPo.getSpot().size() + ", futures=" + stockListPo.getFutures().size());
            MarketHomeStockContainerViewModel.StateListAnimator stateListAnimator = (MarketHomeStockContainerViewModel.StateListAnimator) this.this$0.AEQbTJ.getValue();
            Map<String, TickersData> mapKWHzl = stateListAnimator.KWHzl();
            InterfaceC35073noT interfaceC35073noTEZpvd = C35069noP.Companion.EZpvd();
            List<StockTokenPo> spot = stockListPo.getSpot();
            List listKWHzl2 = null;
            if (!(!spot.isEmpty())) {
                spot = null;
            }
            if (spot != null) {
                listGEmmrt = new ArrayList<>(C56403yEb.AYXKKw(spot, 10));
                Iterator<T> it = spot.iterator();
                while (it.hasNext()) {
                    listGEmmrt.add(C35071noR.OLrzqt((StockTokenPo) it.next(), interfaceC35073noTEZpvd));
                }
            } else {
                listGEmmrt = null;
            }
            List<StockTokenPo> futures = stockListPo.getFutures();
            if (!(!futures.isEmpty())) {
                futures = null;
            }
            if (futures != null) {
                listCopydefault = new ArrayList<>(C56403yEb.AYXKKw(futures, 10));
                Iterator<T> it2 = futures.iterator();
                while (it2.hasNext()) {
                    listCopydefault.add(C35071noR.OLrzqt((StockTokenPo) it2.next(), interfaceC35073noTEZpvd));
                }
            } else {
                listCopydefault = null;
            }
            if (listGEmmrt != null) {
                MarketHomeStockContainerViewModel marketHomeStockContainerViewModel = this.this$0;
                listKWHzl = marketHomeStockContainerViewModel.KWHzl((List<C35069noP>) marketHomeStockContainerViewModel.KWHzl(listGEmmrt, stockListPo, "SPOT", mapKWHzl));
            } else {
                listKWHzl = null;
            }
            if (listCopydefault != null) {
                MarketHomeStockContainerViewModel marketHomeStockContainerViewModel2 = this.this$0;
                listKWHzl2 = marketHomeStockContainerViewModel2.KWHzl((List<C35069noP>) marketHomeStockContainerViewModel2.KWHzl(listCopydefault, stockListPo, "SWAP", mapKWHzl));
            }
            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
            if (listGEmmrt == null) {
                listGEmmrt = stateListAnimator.gEmmrt();
            }
            if (listCopydefault == null) {
                listCopydefault = stateListAnimator.copydefault();
            }
            if (listKWHzl != null) {
                if (!listKWHzl.isEmpty()) {
                    activity = new InterfaceC49371unL.Activity<>(listKWHzl);
                    if (listKWHzl2 == null) {
                        interfaceC49371unLOLrzqt = listKWHzl2.isEmpty() ? new InterfaceC49371unL.TaskDescription<>(yDY.AhwBna()) : new InterfaceC49371unL.Activity<>(listKWHzl2);
                    } else {
                        interfaceC49371unLOLrzqt = stateListAnimator.OLrzqt();
                    }
                    mutableStateFlow.setValue(MarketHomeStockContainerViewModel.StateListAnimator.copy$default(stateListAnimator, null, activity, interfaceC49371unLOLrzqt, null, listGEmmrt, listCopydefault, stockListPo, 9, null));
                    return Unit.INSTANCE;
                }
                interfaceC49371unLValueOf = new InterfaceC49371unL.TaskDescription<>(yDY.AhwBna());
            } else {
                interfaceC49371unLValueOf = stateListAnimator.valueOf();
            }
            activity = interfaceC49371unLValueOf;
            if (listKWHzl2 == null) {
            }
            mutableStateFlow.setValue(MarketHomeStockContainerViewModel.StateListAnimator.copy$default(stateListAnimator, null, activity, interfaceC49371unLOLrzqt, null, listGEmmrt, listCopydefault, stockListPo, 9, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
