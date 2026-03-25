package com.okinc.business.market.features.holdings.domain;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C28434kah;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$startWebSocketSubscriptions$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$startWebSocketSubscriptions$3$1$1(C28434kah c28434kah, Continuation<? super GetHoldingsUseCase$startWebSocketSubscriptions$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c28434kah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$startWebSocketSubscriptions$3$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetHoldingsUseCase$startWebSocketSubscriptions$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ConcurrentHashMap concurrentHashMap = this.this$0.djBIcL;
            C28434kah c28434kah = this.this$0;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                c28434kah.OLrzqt((String) entry.getKey(), (String) entry.getValue());
            }
            MutableSharedFlow mutableSharedFlow = this.this$0.valueOf;
            List list = this.this$0.values;
            this.label = 1;
            if (mutableSharedFlow.emit(list, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.djBIcL.clear();
        return Unit.INSTANCE;
    }
}
