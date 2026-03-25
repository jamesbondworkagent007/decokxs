package com.okinc.business.invest_biz.data.repository;

import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2 extends SuspendLambda implements Function1<Continuation<? super InvestSubscriptionProtocolModel>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2(Continuation<? super InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2> continuation) {
        super(1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestSubscriptionProtocolModel> continuation) {
        return ((InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return new InvestSubscriptionProtocolModel((List) null, (List) null, 3, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
