package o;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDateTimeImpl;
import j$.time.chrono.ChronoZonedDateTimeImpl;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.util.Objects;

/* JADX INFO: renamed from: o.yCd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56351yCd extends java.lang.Comparable<InterfaceC56351yCd> {
    int compareTo(InterfaceC56351yCd interfaceC56351yCd);

    yBW date(int i, int i2, int i3);

    yBW date(InterfaceC56365yCr interfaceC56365yCr);

    yBW dateEpochDay(long j);

    yBW dateNow();

    yBW dateYearDay(int i, int i2);

    boolean equals(java.lang.Object obj);

    InterfaceC56352yCe eraOf(int i);

    java.util.List eras();

    java.lang.String getCalendarType();

    java.lang.String getId();

    boolean isLeapYear(long j);

    int prolepticYear(InterfaceC56352yCe interfaceC56352yCe, int i);

    ValueRange range(ChronoField chronoField);

    yBW resolveDate(java.util.Map map, ResolverStyle resolverStyle);

    java.lang.String toString();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yCr */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.yCf] */
    default InterfaceC56353yCf zonedDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        try {
            ZoneId zoneIdFrom = ZoneId.from(interfaceC56365yCr);
            try {
                interfaceC56365yCr = zonedDateTime(Instant.from(interfaceC56365yCr), zoneIdFrom);
                return interfaceC56365yCr;
            } catch (DateTimeException unused) {
                return ChronoZonedDateTimeImpl.ofBest(ChronoLocalDateTimeImpl.ensureValid(this, localDateTime(interfaceC56365yCr)), zoneIdFrom, null);
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC56365yCr.getClass(), e);
        }
    }

    default InterfaceC56353yCf zonedDateTime(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.ofInstant(this, instant, zoneId);
    }

    default InterfaceC56349yCb localDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        try {
            return date(interfaceC56365yCr).atTime(LocalTime.from(interfaceC56365yCr));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC56365yCr.getClass(), e);
        }
    }

    static InterfaceC56351yCd KWHzl(java.util.Locale locale) {
        return yBX.ofLocale(locale);
    }

    static InterfaceC56351yCd KWHzl(InterfaceC56365yCr interfaceC56365yCr) {
        Objects.requireNonNull(interfaceC56365yCr, "temporal");
        InterfaceC56351yCd interfaceC56351yCd = (InterfaceC56351yCd) interfaceC56365yCr.query(AbstractC56371yCx.EZpvd());
        return interfaceC56351yCd != null ? interfaceC56351yCd : IsoChronology.INSTANCE;
    }
}
