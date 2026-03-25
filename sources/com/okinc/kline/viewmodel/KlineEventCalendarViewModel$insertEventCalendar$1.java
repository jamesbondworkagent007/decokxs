package com.okinc.kline.viewmodel;

import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mJB;
import o.pGZ;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineEventCalendarViewModel$insertEventCalendar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KlineEventCalendarEntity $eventCalendar;
    int label;
    final /* synthetic */ pGZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineEventCalendarViewModel$insertEventCalendar$1(pGZ pgz, KlineEventCalendarEntity klineEventCalendarEntity, Continuation<? super KlineEventCalendarViewModel$insertEventCalendar$1> continuation) {
        super(2, continuation);
        this.this$0 = pgz;
        this.$eventCalendar = klineEventCalendarEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineEventCalendarViewModel$insertEventCalendar$1(this.this$0, this.$eventCalendar, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineEventCalendarViewModel$insertEventCalendar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                mJB mjbCopydefault = this.this$0.copydefault();
                KlineEventCalendarEntity klineEventCalendarEntity = this.$eventCalendar;
                this.label = 1;
                if (mjbCopydefault.copydefault(klineEventCalendarEntity, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Throwable th) {
            pUU.copydefault(this.this$0.copydefault, "insertEventCalendar error: " + th.getMessage());
        }
        return Unit.INSTANCE;
    }
}
