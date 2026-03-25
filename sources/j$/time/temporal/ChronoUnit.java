package j$.time.temporal;

import j$.time.Duration;
import o.InterfaceC56367yCt;
import o.yCF;

/* JADX INFO: loaded from: classes13.dex */
public enum ChronoUnit implements yCF {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));

    private final Duration duration;
    private final String name;

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    @Override // o.yCF
    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // o.yCF
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // o.yCF
    public Duration getDuration() {
        return this.duration;
    }

    @Override // o.yCF
    public long between(InterfaceC56367yCt interfaceC56367yCt, InterfaceC56367yCt interfaceC56367yCt2) {
        return interfaceC56367yCt.until(interfaceC56367yCt2, this);
    }

    @Override // o.yCF
    public InterfaceC56367yCt addTo(InterfaceC56367yCt interfaceC56367yCt, long j) {
        return interfaceC56367yCt.plus(j, this);
    }

    ChronoUnit(String str, Duration duration) {
        this.name = str;
        this.duration = duration;
    }
}
