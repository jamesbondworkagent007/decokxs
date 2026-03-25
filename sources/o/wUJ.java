package o;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class wUJ {
    public static final wUJ AEQbTJ = new wUJ();

    private wUJ() {
    }

    public final java.lang.String AEQbTJ() {
        Calendar calendar = Calendar.getInstance(yCN.OLrzqt("GMT+8"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy, HH:mm", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        java.lang.String str = simpleDateFormat.format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
