package com.okinc.business.dex.tee.data.orderdetail;

import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23225huH;
import o.InterfaceC9738bbJ;
import o.gMV;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeLimitOrderDetailRepository$getLimitOrderDetail$$inlined$getApiResultWithJwtCheck$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<LimitOrderDetailBean>>, Object> {
    final /* synthetic */ String $orderId$inlined;
    final /* synthetic */ int $orderType$inlined;
    final /* synthetic */ Integer $strategyMode$inlined;
    int label;
    final /* synthetic */ gMV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeLimitOrderDetailRepository$getLimitOrderDetail$$inlined$getApiResultWithJwtCheck$default$1(Continuation continuation, gMV gmv, Integer num, int i, String str) {
        super(2, continuation);
        this.this$0 = gmv;
        this.$strategyMode$inlined = num;
        this.$orderType$inlined = i;
        this.$orderId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeLimitOrderDetailRepository$getLimitOrderDetail$$inlined$getApiResultWithJwtCheck$default$1(continuation, this.this$0, this.$strategyMode$inlined, this.$orderType$inlined, this.$orderId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<LimitOrderDetailBean>> continuation) {
        return ((TeeLimitOrderDetailRepository$getLimitOrderDetail$$inlined$getApiResultWithJwtCheck$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23225huH interfaceC23225huH = this.this$0.OLrzqt;
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.this$0.copydefault.AEQbTJ();
            String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
            Integer num = this.$strategyMode$inlined;
            int i2 = this.$orderType$inlined;
            String str = this.$orderId$inlined;
            this.label = 1;
            obj = interfaceC23225huH.KWHzl(strDbNXlk, num, i2, str, this);
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
