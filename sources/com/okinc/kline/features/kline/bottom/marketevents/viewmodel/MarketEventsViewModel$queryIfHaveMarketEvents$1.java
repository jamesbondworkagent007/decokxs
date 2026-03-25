package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36157oRj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsViewModel$queryIfHaveMarketEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketEventsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsViewModel$queryIfHaveMarketEvents$1(MarketEventsViewModel marketEventsViewModel, Continuation<? super MarketEventsViewModel$queryIfHaveMarketEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = marketEventsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketEventsViewModel$queryIfHaveMarketEvents$1 marketEventsViewModel$queryIfHaveMarketEvents$1 = new MarketEventsViewModel$queryIfHaveMarketEvents$1(this.this$0, continuation);
        marketEventsViewModel$queryIfHaveMarketEvents$1.L$0 = obj;
        return marketEventsViewModel$queryIfHaveMarketEvents$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsViewModel$queryIfHaveMarketEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(SPUtils.getBoolean("market_event_red_dot_key", true)));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            MarketEventsViewModel marketEventsViewModel = this.this$0;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
                MarketEventsViewModel$queryIfHaveMarketEvents$1$2$1 marketEventsViewModel$queryIfHaveMarketEvents$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel$queryIfHaveMarketEvents$1$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return Boolean.valueOf(((C36157oRj) obj3).AEQbTJ());
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((C36157oRj) obj3).KWHzl(((Boolean) obj4).booleanValue());
                    }
                };
                Boolean boolKWHzl = C56443yFo.KWHzl(zBooleanValue);
                this.L$0 = objM7377constructorimpl;
                this.label = 1;
                if (marketEventsViewModel.KWHzl(marketEventsViewModel$queryIfHaveMarketEvents$1$2$1, boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objM7377constructorimpl;
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault("MarketEventsViewModel", "queryIfHaveMarketEvents fail cause by: " + thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = this.L$0;
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = obj2;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
