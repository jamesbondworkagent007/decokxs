package com.okinc.business.trade.features.home.advanced.repository;

import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryChangeResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28154kQx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoRepoImpl$fetchHistoryList$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<HistoryChangeResponse>>, Object> {
    final /* synthetic */ HistoryChangeFilterRequest $request;
    int label;
    final /* synthetic */ C28154kQx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoRepoImpl$fetchHistoryList$2(C28154kQx c28154kQx, HistoryChangeFilterRequest historyChangeFilterRequest, Continuation<? super AdvancedMarketInfoRepoImpl$fetchHistoryList$2> continuation) {
        super(1, continuation);
        this.this$0 = c28154kQx;
        this.$request = historyChangeFilterRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedMarketInfoRepoImpl$fetchHistoryList$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<HistoryChangeResponse>> continuation) {
        return ((AdvancedMarketInfoRepoImpl$fetchHistoryList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.EZpvd;
            HistoryChangeFilterRequest historyChangeFilterRequest = this.$request;
            this.label = 1;
            obj = interfaceC23234huQ.AEQbTJ(historyChangeFilterRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
