package o;

import com.okinc.kline.util.LocalCalendarManager$checkCalendarExists$2;
import com.okinc.kline.util.LocalCalendarManager$createCalendar$2;
import com.okinc.kline.util.LocalCalendarManager$deleteEvent$2;
import com.okinc.kline.util.LocalCalendarManager$insertCalendarEvent$2;
import com.okinc.kline.util.LocalCalendarManager$isEventDeleted$2;
import com.okinc.kline.util.LocalCalendarManager$prepareCalendar$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFV {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final android.content.Context copydefault;

    public pFV(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.KWHzl = "KlineLocalCalendarManager";
        this.EZpvd = context.getPackageName();
        this.OLrzqt = "OKX";
        this.AEQbTJ = "OKX";
    }

    public static /* synthetic */ java.lang.Object insertCalendarEvent$default(pFV pfv, java.lang.String str, java.lang.String str2, long j, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 5;
        }
        return pfv.copydefault(str, str2, j, i, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, int i, @NotNull Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new LocalCalendarManager$insertCalendarEvent$2(this, str, str2, j, i, null), continuation);
    }

    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new LocalCalendarManager$deleteEvent$2(j, this, null), continuation);
    }

    public final java.lang.Object KWHzl(long j, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (!pDY.copydefault.AEQbTJ(this.copydefault)) {
            return C56443yFo.KWHzl(true);
        }
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new LocalCalendarManager$isEventDeleted$2(this, j, null), continuation);
    }

    public final java.lang.Object KWHzl(Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new LocalCalendarManager$prepareCalendar$2(this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new LocalCalendarManager$checkCalendarExists$2(this, null), continuation);
    }

    public final java.lang.Object EZpvd(Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new LocalCalendarManager$createCalendar$2(this, null), continuation);
    }
}
