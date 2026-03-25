package com.okinc.business.dex.tee.domain;

import com.okinc.business.dex.tee.domain.model.CreateOrderParams;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C19732gNg;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23225huH;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<LimitOrderDetailBean>>, Object> {
    final /* synthetic */ CreateOrderParams $requestParam$inlined;
    int label;
    final /* synthetic */ C19732gNg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1(Continuation continuation, C19732gNg c19732gNg, CreateOrderParams createOrderParams) {
        super(2, continuation);
        this.this$0 = c19732gNg;
        this.$requestParam$inlined = createOrderParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1(continuation, this.this$0, this.$requestParam$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<LimitOrderDetailBean>> continuation) {
        return ((TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23225huH interfaceC23225huH = this.this$0.AEQbTJ;
            CreateOrderParams createOrderParams = this.$requestParam$inlined;
            this.label = 1;
            obj = interfaceC23225huH.copydefault(createOrderParams, this);
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
