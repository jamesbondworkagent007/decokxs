package com.okinc.business.market.features.scanner.trench;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C29370ksP;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28694kfc;

/* JADX INFO: loaded from: classes7.dex */
public final class TrenchTabFragment$startDataCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C29370ksP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrenchTabFragment$startDataCollection$1(C29370ksP c29370ksP, Continuation<? super TrenchTabFragment$startDataCollection$1> continuation) {
        super(2, continuation);
        this.this$0 = c29370ksP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrenchTabFragment$startDataCollection$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrenchTabFragment$startDataCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.this$0.AkhnZx().AEQbTJ(), this.this$0.ejfBZ());
            if (stateFlow != null) {
                StateListAnimator stateListAnimator = new StateListAnimator(this.this$0);
                this.label = 1;
                if (stateFlow.collect(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        public final /* synthetic */ C29370ksP KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C29370ksP c29370ksP) {
            this.KWHzl = c29370ksP;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC28694kfc interfaceC28694kfc, Continuation<? super Unit> continuation) {
            if (this.KWHzl.fetchVPNInfo) {
                this.KWHzl.EZpvd(interfaceC28694kfc);
            }
            return Unit.INSTANCE;
        }
    }
}
