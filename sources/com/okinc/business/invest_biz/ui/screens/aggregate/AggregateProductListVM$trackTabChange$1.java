package com.okinc.business.invest_biz.ui.screens.aggregate;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23688iFq;

/* JADX INFO: loaded from: classes6.dex */
public final class AggregateProductListVM$trackTabChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $tabId;
    int label;
    final /* synthetic */ AggregateProductListVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateProductListVM$trackTabChange$1(AggregateProductListVM aggregateProductListVM, Integer num, Continuation<? super AggregateProductListVM$trackTabChange$1> continuation) {
        super(2, continuation);
        this.this$0 = aggregateProductListVM;
        this.$tabId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregateProductListVM$trackTabChange$1(this.this$0, this.$tabId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AggregateProductListVM$trackTabChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23688iFq interfaceC23688iFq = this.this$0.DbNXlk;
            String strGEmmrt = C33129mqd.gEmmrt(this.$tabId);
            this.label = 1;
            if (interfaceC23688iFq.EZpvd(strGEmmrt, this) == objCopydefault) {
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
