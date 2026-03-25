package com.okinc.business.market.features.rwa.ui;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C29167koY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29168koZ;

/* JADX INFO: loaded from: classes7.dex */
public final class RwaStatusesBottomSheet$onCreateContent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C29167koY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RwaStatusesBottomSheet$onCreateContent$2(C29167koY c29167koY, Continuation<? super RwaStatusesBottomSheet$onCreateContent$2> continuation) {
        super(2, continuation);
        this.this$0 = c29167koY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RwaStatusesBottomSheet$onCreateContent$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RwaStatusesBottomSheet$onCreateContent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC29168koZ> stateFlowCopydefault = this.this$0.AYXKKw().copydefault();
            final C29167koY c29167koY = this.this$0;
            FlowCollector<? super InterfaceC29168koZ> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$onCreateContent$2.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC29168koZ interfaceC29168koZ, Continuation<? super Unit> continuation) {
                    c29167koY.copydefault(interfaceC29168koZ);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
