package o;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYU {
    public static final boolean EZpvd(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static final boolean AEQbTJ(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2);
    }

    public static final boolean copydefault(@NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(date2, "");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        Intrinsics.copydefault(calendar);
        Intrinsics.copydefault(calendar2);
        return AEQbTJ(calendar, calendar2);
    }

    public static final Calendar AEQbTJ(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "");
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }
}
