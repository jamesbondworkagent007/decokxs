package com.okinc.kline.util;

import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.CalendarContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.TimeZone;
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
public final class LocalCalendarManager$insertCalendarEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ int $reminderMinutes;
    final /* synthetic */ String $shortLink;
    final /* synthetic */ long $startTime;
    final /* synthetic */ String $title;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ pFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCalendarManager$insertCalendarEvent$2(pFV pfv, String str, String str2, long j, int i, Continuation<? super LocalCalendarManager$insertCalendarEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = pfv;
        this.$title = str;
        this.$shortLink = str2;
        this.$startTime = j;
        this.$reminderMinutes = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalCalendarManager$insertCalendarEvent$2 localCalendarManager$insertCalendarEvent$2 = new LocalCalendarManager$insertCalendarEvent$2(this.this$0, this.$title, this.$shortLink, this.$startTime, this.$reminderMinutes, continuation);
        localCalendarManager$insertCalendarEvent$2.L$0 = obj;
        return localCalendarManager$insertCalendarEvent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((LocalCalendarManager$insertCalendarEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        pFV pfv;
        String str;
        String str2;
        long j;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pfv = this.this$0;
                str = this.$title;
                str2 = this.$shortLink;
                j = this.$startTime;
                int i3 = this.$reminderMinutes;
                Result.Application application = Result.Companion;
                this.L$0 = pfv;
                this.L$1 = str;
                this.L$2 = str2;
                this.J$0 = j;
                this.I$0 = i3;
                this.label = 1;
                Object objKWHzl = pfv.KWHzl((Continuation<? super Long>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                i = i3;
                obj = objKWHzl;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                j = this.J$0;
                str2 = (String) this.L$2;
                str = (String) this.L$1;
                pfv = (pFV) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue == -1) {
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("calendar_id", C56443yFo.KWHzl(jLongValue));
            contentValues.put("title", str);
            contentValues.put("description", str2);
            contentValues.put("dtstart", C56443yFo.KWHzl(j));
            contentValues.put("dtend", C56443yFo.KWHzl(j + ((long) 3600000)));
            contentValues.put("eventTimezone", TimeZone.getDefault().getID());
            contentValues.put("hasAlarm", C56443yFo.AEQbTJ(1));
            Uri uriInsert = pfv.copydefault.getContentResolver().insert(CalendarContract.Events.CONTENT_URI, contentValues);
            if (uriInsert == null) {
                return null;
            }
            long id = ContentUris.parseId(uriInsert);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", C56443yFo.KWHzl(id));
            contentValues2.put("minutes", C56443yFo.AEQbTJ(i));
            contentValues2.put(FirebaseAnalytics.Param.METHOD, C56443yFo.AEQbTJ(1));
            pfv.copydefault.getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(id));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        pFV pfv2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(pfv2.KWHzl, "Failed to insert calendar event: " + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
