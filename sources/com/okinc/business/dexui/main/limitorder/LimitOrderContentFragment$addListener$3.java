package com.okinc.business.dexui.main.limitorder;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C19816gQj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentFragment$addListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LimitOrderContentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderContentFragment$addListener$3(LimitOrderContentFragment limitOrderContentFragment, Continuation<? super LimitOrderContentFragment$addListener$3> continuation) {
        super(2, continuation);
        this.this$0 = limitOrderContentFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderContentFragment$addListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderContentFragment$addListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<C19816gQj> sharedFlowEZpvd = this.this$0.RJOkX().EZpvd();
            final LimitOrderContentFragment limitOrderContentFragment = this.this$0;
            FlowCollector<? super C19816gQj> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$addListener$3.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(C19816gQj c19816gQj, Continuation<? super Unit> continuation) {
                    if (limitOrderContentFragment.isVisibled()) {
                        limitOrderContentFragment.fARcdN().AEQbTJ(c19816gQj.copydefault(), c19816gQj.AEQbTJ(), c19816gQj.OLrzqt());
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
