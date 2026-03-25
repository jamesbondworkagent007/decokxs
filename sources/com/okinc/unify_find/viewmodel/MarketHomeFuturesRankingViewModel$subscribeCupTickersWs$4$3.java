package com.okinc.unify_find.viewmodel;

import com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3 extends SuspendLambda implements Function2<Map<String, ? extends TickersData>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeFuturesRankingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3(MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel, Continuation<? super MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeFuturesRankingViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3 marketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3 = new MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3(this.this$0, continuation);
        marketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3.L$0 = obj;
        return marketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3;
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
        return ((MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Map map = (Map) this.L$0;
            MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketHomeFuturesRankingViewModel.Activity) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketHomeFuturesRankingViewModel.Activity) obj2).EZpvd((Map<String, TickersData>) obj3);
                }
            };
            this.label = 1;
            if (marketHomeFuturesRankingViewModel.KWHzl(anonymousClass1, map, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
