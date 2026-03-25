package com.okinc.business.invest_biz.ui.screens.univ3.zap;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC27017jnJ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class ZapSubBaseFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC27017jnJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZapSubBaseFragment$initView$1(AbstractC27017jnJ abstractC27017jnJ, Continuation<? super ZapSubBaseFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC27017jnJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ZapSubBaseFragment$initView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ZapSubBaseFragment$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<Boolean> mutableStateFlowAuCTelauCTel = this.this$0.AYXKKw().AuCTelauCTel();
            final AbstractC27017jnJ abstractC27017jnJ = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.ZapSubBaseFragment$initView$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return AEQbTJ(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
                    abstractC27017jnJ.AEQbTJ(z);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (mutableStateFlowAuCTelauCTel.collect(flowCollector, this) == objCopydefault) {
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
