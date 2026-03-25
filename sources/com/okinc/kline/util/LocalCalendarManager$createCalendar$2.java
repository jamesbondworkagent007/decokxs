package com.okinc.kline.util;

import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
public final class LocalCalendarManager$createCalendar$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCalendarManager$createCalendar$2(pFV pfv, Continuation<? super LocalCalendarManager$createCalendar$2> continuation) {
        super(2, continuation);
        this.this$0 = pfv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalCalendarManager$createCalendar$2 localCalendarManager$createCalendar$2 = new LocalCalendarManager$createCalendar$2(this.this$0, continuation);
        localCalendarManager$createCalendar$2.L$0 = obj;
        return localCalendarManager$createCalendar$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((LocalCalendarManager$createCalendar$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pFV pfv = this.this$0;
            try {
                Result.Application application = Result.Companion;
                Uri uriBuild = CalendarContract.Calendars.CONTENT_URI.buildUpon().appendQueryParameter("account_name", pfv.OLrzqt).appendQueryParameter("account_type", pfv.EZpvd).appendQueryParameter("caller_is_syncadapter", "true").build();
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_name", pfv.OLrzqt);
                contentValues.put("account_type", pfv.EZpvd);
                contentValues.put("name", pfv.AEQbTJ);
                contentValues.put("calendar_displayName", pfv.OLrzqt);
                contentValues.put("visible", C56443yFo.AEQbTJ(1));
                contentValues.put("calendar_access_level", C56443yFo.AEQbTJ(TypedValues.TransitionType.TYPE_DURATION));
                contentValues.put("ownerAccount", pfv.OLrzqt);
                contentValues.put("visible", C56443yFo.AEQbTJ(1));
                contentValues.put("sync_events", C56443yFo.AEQbTJ(1));
                Uri uriInsert = pfv.copydefault.getContentResolver().insert(uriBuild, contentValues);
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(uriInsert != null ? ContentUris.parseId(uriInsert) : -1L));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            pFV pfv2 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(pfv2.KWHzl, "Failed to create calendar: " + thM7380exceptionOrNullimpl.getMessage());
            }
            return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56443yFo.KWHzl(-1L) : objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
