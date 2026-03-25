package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC20011gXp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseStrategyInfoOrderPagerFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC20011gXp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStrategyInfoOrderPagerFragment$initView$3(AbstractC20011gXp abstractC20011gXp, Continuation<? super BaseStrategyInfoOrderPagerFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = abstractC20011gXp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseStrategyInfoOrderPagerFragment$initView$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseStrategyInfoOrderPagerFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<String> sharedFlowOLrzqt = this.this$0.AEQbTJ().OLrzqt();
            final AbstractC20011gXp abstractC20011gXp = this.this$0;
            FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$initView$3.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    abstractC20011gXp.AEQbTJ(str);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
