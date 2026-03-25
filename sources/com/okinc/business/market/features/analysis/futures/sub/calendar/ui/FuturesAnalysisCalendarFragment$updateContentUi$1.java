package com.okinc.business.market.features.analysis.futures.sub.calendar.ui;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C25876jJq;
import o.C42777rcn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class FuturesAnalysisCalendarFragment$updateContentUi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42777rcn $this_updateContentUi;
    final /* synthetic */ C25876jJq $vo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisCalendarFragment$updateContentUi$1(C42777rcn c42777rcn, C25876jJq c25876jJq, Continuation<? super FuturesAnalysisCalendarFragment$updateContentUi$1> continuation) {
        super(2, continuation);
        this.$this_updateContentUi = c42777rcn;
        this.$vo = c25876jJq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisCalendarFragment$updateContentUi$1(this.$this_updateContentUi, this.$vo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisCalendarFragment$updateContentUi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            FuturesAnalysisCalendarFragment$updateContentUi$1$dayItemExtras$1 futuresAnalysisCalendarFragment$updateContentUi$1$dayItemExtras$1 = new FuturesAnalysisCalendarFragment$updateContentUi$1$dayItemExtras$1(this.$vo, this.$this_updateContentUi, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, futuresAnalysisCalendarFragment$updateContentUi$1$dayItemExtras$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.$this_updateContentUi.copydefault.setMonthExtra(this.$vo.copydefault(), (List) obj);
        return Unit.INSTANCE;
    }
}
