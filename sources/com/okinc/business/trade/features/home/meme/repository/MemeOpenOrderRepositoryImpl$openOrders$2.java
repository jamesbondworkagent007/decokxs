package com.okinc.business.trade.features.home.meme.repository;

import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderReq;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28289kVx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeOpenOrderRepositoryImpl$openOrders$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends OpenOrderData>>>, Object> {
    final /* synthetic */ OpenOrderReq $openOrderReq;
    int label;
    final /* synthetic */ C28289kVx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeOpenOrderRepositoryImpl$openOrders$2(C28289kVx c28289kVx, OpenOrderReq openOrderReq, Continuation<? super MemeOpenOrderRepositoryImpl$openOrders$2> continuation) {
        super(1, continuation);
        this.this$0 = c28289kVx;
        this.$openOrderReq = openOrderReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MemeOpenOrderRepositoryImpl$openOrders$2(this.this$0, this.$openOrderReq, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends OpenOrderData>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<OpenOrderData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<OpenOrderData>>> continuation) {
        return ((MemeOpenOrderRepositoryImpl$openOrders$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.EZpvd;
            String chainId = this.$openOrderReq.getChainId();
            String accountId = this.$openOrderReq.getAccountId();
            List<String> exchangeDirection = this.$openOrderReq.getExchangeDirection();
            List<String> strategyType = this.$openOrderReq.getStrategyType();
            String tokenContractAddress = this.$openOrderReq.getTokenContractAddress();
            this.label = 1;
            obj = interfaceC23234huQ.EZpvd(chainId, accountId, exchangeDirection, strategyType, tokenContractAddress, this);
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
