package com.okinc.unify_trade.trade.source.task;

import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xSU;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureDataTaskByRepo$bindAllTickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ xSU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureDataTaskByRepo$bindAllTickers$1(xSU xsu, Continuation<? super FutureDataTaskByRepo$bindAllTickers$1> continuation) {
        super(2, continuation);
        this.this$0 = xsu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureDataTaskByRepo$bindAllTickers$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureDataTaskByRepo$bindAllTickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                xSU xsu = this.this$0;
                Result.Application application = Result.Companion;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (BizInstrument bizInstrument : xsu.isConnected) {
                    linkedHashSet.add(bizInstrument.getTradeSymbol());
                    linkedHashSet.add(bizInstrument.getQuoteSymbol());
                }
                Flow<Long> flowCopydefault = xsu.AEQbTJ.copydefault("FutureDataTaskByRepo", CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet));
                ActionBar actionBar = new ActionBar(xsu);
                this.label = 1;
                if (flowCopydefault.collect(actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar<T> implements FlowCollector {
        public final /* synthetic */ xSU EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(xSU xsu) {
            this.EZpvd = xsu;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return KWHzl(((Number) obj).longValue(), continuation);
        }

        public final Object KWHzl(long j, Continuation<? super Unit> continuation) {
            this.EZpvd.OLrzqt.setValue(C56443yFo.KWHzl(j));
            pUU.KWHzl("NavOptPhase1", this.EZpvd.EZpvd + " -> SpotDataTaskByRepo bindAllTickers cupTickListenJob collect " + j);
            return Unit.INSTANCE;
        }
    }
}
