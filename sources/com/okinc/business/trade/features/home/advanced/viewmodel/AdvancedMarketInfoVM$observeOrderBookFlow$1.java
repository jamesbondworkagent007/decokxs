package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.data.FilterValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$observeOrderBookFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$observeOrderBookFlow$1(AdvancedMarketInfoVM advancedMarketInfoVM, Continuation<? super AdvancedMarketInfoVM$observeOrderBookFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$observeOrderBookFlow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$observeOrderBookFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application implements Flow<FilterValue> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM$observeOrderBookFlow$1$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                AdvancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1 advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof AdvancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1) {
                    advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1 = (AdvancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1 = new AdvancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    FilterValue filterValue = (FilterValue) obj;
                    if (filterValue.OLrzqt().length() > 0 && filterValue.KWHzl().length() > 0) {
                        advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, advancedMarketInfoVM$observeOrderBookFlow$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super FilterValue> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Application application = new Application(this.this$0.EZpvd());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(application, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM$observeOrderBookFlow$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FilterValue, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvancedMarketInfoVM this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdvancedMarketInfoVM advancedMarketInfoVM, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = advancedMarketInfoVM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FilterValue filterValue, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(filterValue, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ((FilterValue) this.L$0);
            return Unit.INSTANCE;
        }
    }
}
