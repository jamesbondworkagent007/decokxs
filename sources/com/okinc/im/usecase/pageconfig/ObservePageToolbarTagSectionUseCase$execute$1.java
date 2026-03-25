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
import o.AbstractC35352nth;
import o.C35285nsT;
import o.C56391yDq;
import o.C56442yFn;
import o.oFN;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePageToolbarTagSectionUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC35352nth<?>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ IMPageType $pageType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oFN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservePageToolbarTagSectionUseCase$execute$1(oFN ofn, IMPageType iMPageType, Continuation<? super ObservePageToolbarTagSectionUseCase$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = ofn;
        this.$pageType = iMPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObservePageToolbarTagSectionUseCase$execute$1 observePageToolbarTagSectionUseCase$execute$1 = new ObservePageToolbarTagSectionUseCase$execute$1(this.this$0, this.$pageType, continuation);
        observePageToolbarTagSectionUseCase$execute$1.L$0 = obj;
        return observePageToolbarTagSectionUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC35352nth<?>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObservePageToolbarTagSectionUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            C35285nsT c35285nsTKWHzl = this.this$0.AEQbTJ.KWHzl(this.$pageType);
            Flow flowCombine = FlowKt.combine(c35285nsTKWHzl.AYXKKw(), FlowKt.flatMapConcat(c35285nsTKWHzl.AYXKKw(), new ObservePageToolbarTagSectionUseCase$execute$1$toolbarTagArgumentsFlow$1(null)), new AnonymousClass1(null));
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

    /* JADX INFO: renamed from: com.okinc.im.usecase.pageconfig.ObservePageToolbarTagSectionUseCase$execute$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<AbstractC35352nth<?>, Bundle, Continuation<? super AbstractC35352nth<?>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(AbstractC35352nth<?> abstractC35352nth, Bundle bundle, Continuation<? super AbstractC35352nth<?>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = abstractC35352nth;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (AbstractC35352nth) this.L$0;
        }
    }
}
