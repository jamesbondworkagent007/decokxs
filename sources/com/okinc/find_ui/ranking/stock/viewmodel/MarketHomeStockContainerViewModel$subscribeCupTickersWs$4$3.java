package com.okinc.find_ui.ranking.stock.viewmodel;

import com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3 extends SuspendLambda implements Function2<Map<String, ? extends TickersData>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeStockContainerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3(MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, Continuation<? super MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeStockContainerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3 marketHomeStockContainerViewModel$subscribeCupTickersWs$4$3 = new MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3(this.this$0, continuation);
        marketHomeStockContainerViewModel$subscribeCupTickersWs$4$3.L$0 = obj;
        return marketHomeStockContainerViewModel$subscribeCupTickersWs$4$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends TickersData> map, Continuation<? super Unit> continuation) {
        return invoke2((Map<String, TickersData>) map, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, TickersData> map, Continuation<? super Unit> continuation) {
        return ((MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Map map = (Map) this.L$0;
            pUU.EZpvd("MarketHomeStockContainerViewModel", "subscribeCupTickersWs update: size=" + map.size());
            this.this$0.AEQbTJ.setValue(MarketHomeStockContainerViewModel.StateListAnimator.copy$default((MarketHomeStockContainerViewModel.StateListAnimator) this.this$0.AEQbTJ.getValue(), null, null, null, map, null, null, null, 119, null));
            this.this$0.KWHzl();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
