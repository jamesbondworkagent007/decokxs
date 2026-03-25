package com.okinc.kline.util;

import android.provider.CalendarContract;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pFV;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalCalendarManager$deleteEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ long $eventId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCalendarManager$deleteEvent$2(long j, pFV pfv, Continuation<? super LocalCalendarManager$deleteEvent$2> continuation) {
        super(2, continuation);
        this.$eventId = j;
        this.this$0 = pfv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalCalendarManager$deleteEvent$2 localCalendarManager$deleteEvent$2 = new LocalCalendarManager$deleteEvent$2(this.$eventId, this.this$0, continuation);
        localCalendarManager$deleteEvent$2.L$0 = obj;
        return localCalendarManager$deleteEvent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((LocalCalendarManager$deleteEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.$eventId;
            pFV pfv = this.this$0;
            try {
                Result.Application application = Result.Companion;
                boolean z = true;
                if (pfv.copydefault.getContentResolver().delete(CalendarContract.Events.CONTENT_URI, "_id = ?", new String[]{String.valueOf(j)}) <= 0) {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            pFV pfv2 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                return objM7377constructorimpl;
            }
            pUU.copydefault(pfv2.KWHzl, "Failed to delete event: " + thM7380exceptionOrNullimpl.getMessage());
            return C56443yFo.KWHzl(false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
