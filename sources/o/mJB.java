package o;

import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface mJB {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super KlineEventCalendarEntity> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<KlineEventCalendarEntity>> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull KlineEventCalendarEntity klineEventCalendarEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);
}
