package com.okinc.business.trade.features.home.meme.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC28336kXq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseMemeStrategyViewModel$updateTokenInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC28336kXq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMemeStrategyViewModel$updateTokenInfo$1(AbstractC28336kXq abstractC28336kXq, Continuation<? super BaseMemeStrategyViewModel$updateTokenInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC28336kXq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseMemeStrategyViewModel$updateTokenInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseMemeStrategyViewModel$updateTokenInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String chainId = this.this$0.QKVWgx().getChainId();
            Flow<String> flowAEQbTJ = this.this$0.values().AEQbTJ(chainId, this.this$0.QVAiDq().copydefault(chainId));
            final AbstractC28336kXq abstractC28336kXq = this.this$0;
            FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.meme.viewmodel.BaseMemeStrategyViewModel$updateTokenInfo$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    abstractC28336kXq.EZpvd.setValue(str);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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
