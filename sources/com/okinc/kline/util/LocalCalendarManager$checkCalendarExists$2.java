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
public final class LocalCalendarManager$checkCalendarExists$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCalendarManager$checkCalendarExists$2(pFV pfv, Continuation<? super LocalCalendarManager$checkCalendarExists$2> continuation) {
        super(2, continuation);
        this.this$0 = pfv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalCalendarManager$checkCalendarExists$2 localCalendarManager$checkCalendarExists$2 = new LocalCalendarManager$checkCalendarExists$2(this.this$0, continuation);
        localCalendarManager$checkCalendarExists$2.L$0 = obj;
        return localCalendarManager$checkCalendarExists$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((LocalCalendarManager$checkCalendarExists$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Long lKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pFV pfv = this.this$0;
            try {
                Result.Application application = Result.Companion;
                Cursor cursorQuery = pfv.copydefault.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id", "account_name", "account_type"}, "account_name = ? AND account_type = ?", new String[]{pfv.OLrzqt, pfv.EZpvd}, null);
                if (cursorQuery != null) {
                    try {
                        lKWHzl = cursorQuery.moveToFirst() ? C56443yFo.KWHzl(cursorQuery.getLong(0)) : null;
                        yFA.copydefault(cursorQuery, null);
                    } finally {
                    }
                } else {
                    lKWHzl = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(lKWHzl);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            pFV pfv2 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(pfv2.KWHzl, "Error checking calendar existence: " + thM7380exceptionOrNullimpl.getMessage());
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
