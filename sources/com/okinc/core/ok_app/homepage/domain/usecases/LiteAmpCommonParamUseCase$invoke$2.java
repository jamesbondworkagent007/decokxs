package com.okinc.core.ok_app.homepage.domain.usecases;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33240msi;
import o.C33269mtK;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC33233msb;

/* JADX INFO: loaded from: classes18.dex */
public final class LiteAmpCommonParamUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C33269mtK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteAmpCommonParamUseCase$invoke$2(C33269mtK c33269mtK, Continuation<? super LiteAmpCommonParamUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c33269mtK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiteAmpCommonParamUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiteAmpCommonParamUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC33240msi> stateFlowKWHzl = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl();
            final C33269mtK c33269mtK = this.this$0;
            FlowCollector<? super AbstractC33240msi> flowCollector = new FlowCollector() { // from class: com.okinc.core.ok_app.homepage.domain.usecases.LiteAmpCommonParamUseCase$invoke$2.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC33240msi abstractC33240msi, Continuation<? super Unit> continuation) {
                    c33269mtK.EZpvd();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
