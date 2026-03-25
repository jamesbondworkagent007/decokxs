package com.okinc.unify_trade.trade.source.task;

import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C54747xTv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotDataTaskByRepo$bindAreaTickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BizInstrument> $sourceGroup;
    int label;
    final /* synthetic */ C54747xTv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.BizInstrument> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpotDataTaskByRepo$bindAreaTickers$1(C54747xTv c54747xTv, List<? extends BizInstrument> list, Continuation<? super SpotDataTaskByRepo$bindAreaTickers$1> continuation) {
        super(2, continuation);
        this.this$0 = c54747xTv;
        this.$sourceGroup = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotDataTaskByRepo$bindAreaTickers$1(this.this$0, this.$sourceGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDataTaskByRepo$bindAreaTickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C54747xTv c54747xTv = this.this$0;
                List<BizInstrument> list = this.$sourceGroup;
                Result.Application application = Result.Companion;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c54747xTv.AkhnZx) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((BizInstrument) it.next()).getQuoteSymbol());
                    }
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(((BizInstrument) it2.next()).getTradeSymbol());
                    }
                }
                Flow<Long> flowCopydefault = c54747xTv.AEQbTJ.copydefault("SpotDataTaskByRepo", CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet));
                Activity activity = new Activity(c54747xTv);
                this.label = 1;
                if (flowCopydefault.collect(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ C54747xTv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C54747xTv c54747xTv) {
            this.copydefault = c54747xTv;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return KWHzl(((Number) obj).longValue(), continuation);
        }

        public final Object KWHzl(long j, Continuation<? super Unit> continuation) {
            this.copydefault.EZpvd.setValue(C56443yFo.KWHzl(j));
            pUU.KWHzl("NavOptPhase1", this.copydefault.OLrzqt + " -> SpotDataTaskByRepo bindAreaTickers cupTickListenJob collect, " + j);
            return Unit.INSTANCE;
        }
    }
}
