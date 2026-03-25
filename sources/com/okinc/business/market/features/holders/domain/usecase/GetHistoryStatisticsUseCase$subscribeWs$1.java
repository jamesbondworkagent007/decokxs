package com.okinc.business.market.features.holders.domain.usecase;

import com.okinc.business.market.features.history.domain.model.StatisticsExtraParams;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.jYA;
import o.jYE;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHistoryStatisticsUseCase$subscribeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ jYE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHistoryStatisticsUseCase$subscribeWs$1(String str, String str2, String str3, jYE jye, Continuation<? super GetHistoryStatisticsUseCase$subscribeWs$1> continuation) {
        super(2, continuation);
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$walletAddress = str3;
        this.this$0 = jye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHistoryStatisticsUseCase$subscribeWs$1(this.$chainId, this.$tokenAddress, this.$walletAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetHistoryStatisticsUseCase$subscribeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StatisticsExtraParams statisticsExtraParams = new StatisticsExtraParams(this.$chainId, this.$tokenAddress, this.$walletAddress);
            jYA jya = this.this$0.OLrzqt;
            this.label = 1;
            obj = jya.OLrzqt(statisticsExtraParams, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        final jYE jye = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.domain.usecase.GetHistoryStatisticsUseCase$subscribeWs$1.3
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final Object emit(HistoryStatistics historyStatistics, Continuation<? super Unit> continuation) {
                jye.AEQbTJ.setValue(historyStatistics);
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
