package com.okinc.kline.util;

import android.database.Cursor;
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
import o.yFA;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalCalendarManager$isEventDeleted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ long $eventId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCalendarManager$isEventDeleted$2(pFV pfv, long j, Continuation<? super LocalCalendarManager$isEventDeleted$2> continuation) {
        super(2, continuation);
        this.this$0 = pfv;
        this.$eventId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalCalendarManager$isEventDeleted$2 localCalendarManager$isEventDeleted$2 = new LocalCalendarManager$isEventDeleted$2(this.this$0, this.$eventId, continuation);
        localCalendarManager$isEventDeleted$2.L$0 = obj;
        return localCalendarManager$isEventDeleted$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((LocalCalendarManager$isEventDeleted$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Cursor cursorQuery;
        boolean z;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pFV pfv = this.this$0;
            long j = this.$eventId;
            try {
                Result.Application application = Result.Companion;
                cursorQuery = pfv.copydefault.getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{"deleted"}, "_id = ?", new String[]{String.valueOf(j)}, null);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        z = cursorQuery.getInt(0) == 1;
                        yFA.copydefault(cursorQuery, null);
                    }
                    pFV pfv2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        return objM7377constructorimpl;
                    }
                    pUU.copydefault(pfv2.KWHzl, "Error checking if event is deleted: " + thM7380exceptionOrNullimpl.getMessage());
                    return C56443yFo.KWHzl(true);
                } finally {
                }
            } else {
                z = true;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
            pFV pfv22 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
