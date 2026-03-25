package com.okinc.business.invest_biz.data.logic.net;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.request.InvestOrderDetailsPageParam;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBE;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestNetworkManagerImpl$getOrderDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<InvestOrderDetailsInfoVo>>, Object> {
    final /* synthetic */ InvestOrderDetailsPageParam $request;
    int label;
    final /* synthetic */ iBE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestNetworkManagerImpl$getOrderDetails$2(iBE ibe, InvestOrderDetailsPageParam investOrderDetailsPageParam, Continuation<? super InvestNetworkManagerImpl$getOrderDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = ibe;
        this.$request = investOrderDetailsPageParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestNetworkManagerImpl$getOrderDetails$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<InvestOrderDetailsInfoVo>> continuation) {
        return ((InvestNetworkManagerImpl$getOrderDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            InvestOrderDetailsPageParam investOrderDetailsPageParam = this.$request;
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.AEQbTJ(investOrderDetailsPageParam, this);
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
