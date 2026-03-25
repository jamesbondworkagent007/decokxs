package com.okinc.business.defi.dapp.bridge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C9767bbm;
import o.InterfaceC9916bec;

/* JADX INFO: loaded from: classes23.dex */
public final class KtHelper$registerCedefiHashStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<C9767bbm, Unit> $txStatusCallback;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.bbm, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KtHelper$registerCedefiHashStatus$1(Function1<? super C9767bbm, Unit> function1, Continuation<? super KtHelper$registerCedefiHashStatus$1> continuation) {
        super(2, continuation);
        this.$txStatusCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KtHelper$registerCedefiHashStatus$1(this.$txStatusCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KtHelper$registerCedefiHashStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<C9767bbm> flowAEQbTJ = ((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).AEQbTJ();
            final Function1<C9767bbm, Unit> function1 = this.$txStatusCallback;
            FlowCollector<? super C9767bbm> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.dapp.bridge.KtHelper$registerCedefiHashStatus$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(C9767bbm c9767bbm, Continuation<? super Unit> continuation) {
                    function1.invoke(c9767bbm);
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
