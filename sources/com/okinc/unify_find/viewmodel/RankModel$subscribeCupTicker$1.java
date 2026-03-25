package com.okinc.unify_find.viewmodel;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C55626xnW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class RankModel$subscribeCupTicker$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $ccys;
    int label;
    final /* synthetic */ RankModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankModel$subscribeCupTicker$1(List<String> list, RankModel rankModel, Continuation<? super RankModel$subscribeCupTicker$1> continuation) {
        super(2, continuation);
        this.$ccys = list;
        this.this$0 = rankModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankModel$subscribeCupTicker$1(this.$ccys, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RankModel$subscribeCupTicker$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List<String> list = this.$ccys;
                RankModel rankModel = this.this$0;
                Result.Application application = Result.Companion;
                Flow flowM7441catch = FlowKt.m7441catch(C55626xnW.copydefault(list, "cup-tickers-3s"), new RankModel$subscribeCupTicker$1$1$1(null));
                TaskDescription taskDescription = new TaskDescription(rankModel);
                this.label = 1;
                if (flowM7441catch.collect(taskDescription, this) == objCopydefault) {
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

    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ RankModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(RankModel rankModel) {
            this.OLrzqt = rankModel;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<TickersData> list, Continuation<? super Unit> continuation) {
            RankModel rankModel = this.OLrzqt;
            for (TickersData tickersData : list) {
                rankModel.isConnected().put(tickersData.getCcy(), tickersData);
            }
            return Unit.INSTANCE;
        }
    }
}
