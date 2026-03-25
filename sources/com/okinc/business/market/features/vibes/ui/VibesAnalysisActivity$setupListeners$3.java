package com.okinc.business.market.features.vibes.ui;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC27733kBi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27728kBd;

/* JADX INFO: loaded from: classes18.dex */
public final class VibesAnalysisActivity$setupListeners$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC27733kBi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesAnalysisActivity$setupListeners$3(ActivityC27733kBi activityC27733kBi, Continuation<? super VibesAnalysisActivity$setupListeners$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC27733kBi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesAnalysisActivity$setupListeners$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesAnalysisActivity$setupListeners$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC27728kBd> stateFlowAEQbTJ = this.this$0.AEQbTJ().AEQbTJ();
            final ActivityC27733kBi activityC27733kBi = this.this$0;
            FlowCollector<? super InterfaceC27728kBd> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$setupListeners$3.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC27728kBd interfaceC27728kBd, Continuation<? super Unit> continuation) {
                    activityC27733kBi.AEQbTJ(interfaceC27728kBd);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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
