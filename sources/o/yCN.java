package o;

import j$.time.ZoneId;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class yCN {
    public static ZoneId AEQbTJ(TimeZone timeZone) {
        return ZoneId.of(timeZone.getID(), ZoneId.SHORT_IDS);
    }

    public static TimeZone OLrzqt(java.lang.String str) {
        return TimeZone.getTimeZone(str);
    }
}
