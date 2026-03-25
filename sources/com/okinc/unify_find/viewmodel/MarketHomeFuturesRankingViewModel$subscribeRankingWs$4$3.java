package com.okinc.unify_find.viewmodel;

import com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeFuturesRankingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3(MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel, Continuation<? super MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeFuturesRankingViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3 marketHomeFuturesRankingViewModel$subscribeRankingWs$4$3 = new MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3(this.this$0, continuation);
        marketHomeFuturesRankingViewModel$subscribeRankingWs$4$3.L$0 = obj;
        return marketHomeFuturesRankingViewModel$subscribeRankingWs$4$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends Object> list, Continuation<? super Unit> continuation) {
        return ((MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketHomeFuturesRankingViewModel.Activity) obj2).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketHomeFuturesRankingViewModel.Activity) obj2).KWHzl((InterfaceC49371unL<? extends List<? extends Object>>) obj3);
                }
            };
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list);
            this.label = 1;
            if (marketHomeFuturesRankingViewModel.KWHzl(anonymousClass1, activity, this) == objCopydefault) {
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
