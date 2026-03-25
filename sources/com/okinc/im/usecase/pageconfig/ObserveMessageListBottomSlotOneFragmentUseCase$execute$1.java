package com.okinc.im.usecase.pageconfig;

import android.os.Bundle;
import com.okinc.im.config.page.IMPageType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC35278nsM;
import o.C56391yDq;
import o.C56442yFn;
import o.oFF;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ObserveMessageListBottomSlotOneFragmentUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC35278nsM<?>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ IMPageType $pageType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oFF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveMessageListBottomSlotOneFragmentUseCase$execute$1(oFF off, IMPageType iMPageType, Continuation<? super ObserveMessageListBottomSlotOneFragmentUseCase$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = off;
        this.$pageType = iMPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveMessageListBottomSlotOneFragmentUseCase$execute$1 observeMessageListBottomSlotOneFragmentUseCase$execute$1 = new ObserveMessageListBottomSlotOneFragmentUseCase$execute$1(this.this$0, this.$pageType, continuation);
        observeMessageListBottomSlotOneFragmentUseCase$execute$1.L$0 = obj;
        return observeMessageListBottomSlotOneFragmentUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC35278nsM<?>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveMessageListBottomSlotOneFragmentUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            SharedFlow<AbstractC35278nsM<?>> sharedFlowAhwBna = this.this$0.copydefault.KWHzl(this.$pageType).AhwBna();
            Flow flowCombine = FlowKt.combine(sharedFlowAhwBna, FlowKt.flatMapConcat(sharedFlowAhwBna, new AnonymousClass1(null)), new AnonymousClass2(null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCombine, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.usecase.pageconfig.ObserveMessageListBottomSlotOneFragmentUseCase$execute$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC35278nsM<?>, Continuation<? super Flow<? extends Bundle>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC35278nsM<?> abstractC35278nsM, Continuation<? super Flow<? extends Bundle>> continuation) {
            return invoke2(abstractC35278nsM, (Continuation<? super Flow<Bundle>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC35278nsM<?> abstractC35278nsM, Continuation<? super Flow<Bundle>> continuation) {
            return ((AnonymousClass1) create(abstractC35278nsM, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SharedFlow<Bundle> sharedFlowCopydefault;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC35278nsM abstractC35278nsM = (AbstractC35278nsM) this.L$0;
                return (abstractC35278nsM == null || (sharedFlowCopydefault = abstractC35278nsM.copydefault()) == null) ? FlowKt.flowOf((Object) null) : sharedFlowCopydefault;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.usecase.pageconfig.ObserveMessageListBottomSlotOneFragmentUseCase$execute$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements yHO<AbstractC35278nsM<?>, Bundle, Continuation<? super AbstractC35278nsM<?>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(AbstractC35278nsM<?> abstractC35278nsM, Bundle bundle, Continuation<? super AbstractC35278nsM<?>> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = abstractC35278nsM;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC35278nsM abstractC35278nsM = (AbstractC35278nsM) this.L$0;
                pUU.KWHzl("ObserveMessageListBottomSlotOneFragmentUseCase", "execute: factory = " + abstractC35278nsM);
                return abstractC35278nsM;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
