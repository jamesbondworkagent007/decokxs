package com.okinc.business.market.market.fragment.watchlist;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C27869kGi;
import o.C27947kJf;
import o.C56391yDq;
import o.C56442yFn;
import o.kIF;
import o.kIY;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListTabFragment$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListTabFragment$onCreate$1(kIY kiy, Continuation<? super WatchListTabFragment$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = kiy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListTabFragment$onCreate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListTabFragment$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application implements Flow<List<? extends C27869kGi.ActionBar>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onCreate$1$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                WatchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1 watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof WatchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1) {
                    watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1 = (WatchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1 = new WatchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    List<C27869kGi.ActionBar> listOLrzqt = ((C27947kJf.ActionBar) obj).OLrzqt();
                    watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listOLrzqt, watchListTabFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
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
        public Object collect(FlowCollector<? super List<? extends C27869kGi.ActionBar>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowConflate = FlowKt.conflate(new Application(this.this$0.uzCIH().copydefault()));
            final kIY kiy = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onCreate$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<C27869kGi.ActionBar> list, Continuation<? super Unit> continuation) {
                    kIF kif = kiy.AubY;
                    if (!Intrinsics.EZpvd(kif != null ? kif.EZpvd() : null, list)) {
                        kiy.OLrzqt(list);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowConflate.collect(flowCollector, this) == objCopydefault) {
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
