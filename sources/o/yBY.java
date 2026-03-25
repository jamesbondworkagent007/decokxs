package o;

import j$.time.Duration;
import j$.time.Instant;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes24.dex */
public class yBY {
    public static ZoneId dR_(j$.time.ZoneId zoneId) {
        if (zoneId == null) {
            return null;
        }
        return ZoneId.of(zoneId.getId());
    }

    public static Instant dQ_(java.time.Instant instant) {
        if (instant == null) {
            return null;
        }
        return Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration dP_(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.ofSeconds(duration.getSeconds(), duration.getNano());
    }
}
