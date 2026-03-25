package com.okinc.business.dex.trade.order.data.repo;

import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C20051gZb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20052gZc;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<CancelOrReactivateOrderResponse>>, Object> {
    final /* synthetic */ CancelOrReactivateOrderRequest $request$inlined;
    int label;
    final /* synthetic */ C20051gZb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1(Continuation continuation, C20051gZb c20051gZb, CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest) {
        super(2, continuation);
        this.this$0 = c20051gZb;
        this.$request$inlined = cancelOrReactivateOrderRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1(continuation, this.this$0, this.$request$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<CancelOrReactivateOrderResponse>> continuation) {
        return ((OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC20052gZc interfaceC20052gZc = this.this$0.copydefault;
            CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest = this.$request$inlined;
            this.label = 1;
            obj = interfaceC20052gZc.KWHzl(cancelOrReactivateOrderRequest, this);
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
