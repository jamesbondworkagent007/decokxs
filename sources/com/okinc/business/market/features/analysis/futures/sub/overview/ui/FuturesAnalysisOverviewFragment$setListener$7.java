package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.jKQ;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisOverviewFragment$setListener$7 extends SuspendLambda implements Function2<PayloadPeriod, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$setListener$7(jKQ jkq, Continuation<? super FuturesAnalysisOverviewFragment$setListener$7> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisOverviewFragment$setListener$7 futuresAnalysisOverviewFragment$setListener$7 = new FuturesAnalysisOverviewFragment$setListener$7(this.this$0, continuation);
        futuresAnalysisOverviewFragment$setListener$7.L$0 = obj;
        return futuresAnalysisOverviewFragment$setListener$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PayloadPeriod payloadPeriod, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$setListener$7) create(payloadPeriod, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AnalysisOverviewPeriod analysisOverviewPeriodCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PayloadPeriod payloadPeriod = (PayloadPeriod) this.L$0;
            if (payloadPeriod != null) {
                jKQ jkq = this.this$0;
                if (jkq.gEmmrt().OLrzqt().getPayload() != payloadPeriod && (analysisOverviewPeriodCopydefault = AnalysisOverviewPeriod.Companion.copydefault(payloadPeriod)) != null) {
                    jkq.KWHzl(analysisOverviewPeriodCopydefault);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
