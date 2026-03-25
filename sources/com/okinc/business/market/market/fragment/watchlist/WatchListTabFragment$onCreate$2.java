package com.okinc.business.market.market.fragment.watchlist;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C27869kGi;
import o.C27947kJf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C57596ylR;
import o.kIF;
import o.kIY;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListTabFragment$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListTabFragment$onCreate$2(kIY kiy, Continuation<? super WatchListTabFragment$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = kiy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListTabFragment$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListTabFragment$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements Flow<Integer> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onCreate$2$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                WatchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1 watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof WatchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1) {
                    watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1 = (WatchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1 = new WatchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(((C27947kJf.ActionBar) obj).KWHzl());
                    watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, watchListTabFragment$onCreate$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new TaskDescription(this.this$0.uzCIH().copydefault()));
            final kIY kiy = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onCreate$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return OLrzqt(((Number) obj2).intValue(), continuation);
                }

                public final Object OLrzqt(int i2, Continuation<? super Unit> continuation) {
                    C57596ylR c57596ylR;
                    C57596ylR c57596ylR2;
                    List<C27869kGi.ActionBar> listEZpvd;
                    kIF kif = kiy.AubY;
                    if (((kif == null || (listEZpvd = kif.EZpvd()) == null) ? 0 : listEZpvd.size()) > i2 && (((c57596ylR = kiy.AuCTelauCTel) == null || c57596ylR.getCurrentItem() != i2) && (c57596ylR2 = kiy.AuCTelauCTel) != null)) {
                        c57596ylR2.setCurrentItem(i2);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == objCopydefault) {
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
