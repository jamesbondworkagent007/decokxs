package com.okinc.business.dex.trade.component.orderandposition;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19815gQi;
import o.gPW;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseOrderAndPositionComponentFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gPW<VB> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrderAndPositionComponentFragment$onViewCreated$1(gPW<VB> gpw, Continuation<? super BaseOrderAndPositionComponentFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = gpw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseOrderAndPositionComponentFragment$onViewCreated$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseOrderAndPositionComponentFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC19815gQi> stateFlowAkhnZx = this.this$0.AEQbTJ().AkhnZx();
            final gPW<VB> gpw = this.this$0;
            FlowCollector<? super InterfaceC19815gQi> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.BaseOrderAndPositionComponentFragment$onViewCreated$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC19815gQi interfaceC19815gQi, Continuation<? super Unit> continuation) {
                    if (interfaceC19815gQi instanceof InterfaceC19815gQi.Application) {
                        gpw.AEQbTJ(((InterfaceC19815gQi.Application) interfaceC19815gQi).KWHzl());
                    } else {
                        if (!Intrinsics.EZpvd(interfaceC19815gQi, InterfaceC19815gQi.ActionBar.copydefault)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gpw.AEQbTJ((DefiChainInfo) null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAkhnZx.collect(flowCollector, this) == objCopydefault) {
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
