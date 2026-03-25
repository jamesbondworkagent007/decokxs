package o;

import com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo;
import com.okinc.business.market.features.analysis.futures.sub.calendar.data.repo.CalendarListRepository$getCalendarListData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jIY {
    public final CoroutineDispatcher AEQbTJ;
    public final jIS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public jIY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull jIS jis) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(jis, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = jis;
    }

    public static /* synthetic */ java.lang.Object getCalendarListData$default(jIY jiy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            num = 8;
        }
        return jiy.EZpvd(str, str2, str3, num, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, @NotNull Continuation<? super CalendarPo> continuation) {
        return BuildersKt.withContext(AEQbTJ(), new CalendarListRepository$getCalendarListData$2(this, str, str2, str3, num, null), continuation);
    }
}
