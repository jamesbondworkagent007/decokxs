package com.okinc.business.market.features.analysis.futures.sub.calendar.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C42777rcn;
import o.C56391yDq;
import o.C56442yFn;
import o.jIX;
import o.qYH;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisCalendarFragment$viewModelCollect$5 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jIX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisCalendarFragment$viewModelCollect$5(jIX jix, Continuation<? super FuturesAnalysisCalendarFragment$viewModelCollect$5> continuation) {
        super(2, continuation);
        this.this$0 = jix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisCalendarFragment$viewModelCollect$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisCalendarFragment$viewModelCollect$5) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        qYH qyh;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C42777rcn c42777rcn = this.this$0.OLrzqt;
            if (c42777rcn != null && (qyh = c42777rcn.copydefault) != null) {
                qyh.AEQbTJ();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
